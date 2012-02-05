/* Class68_Sub28_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Date;

public class Class68_Sub28_Sub1 extends Class68_Sub28 {

    public static int anInt4456;
    public static int anInt4457;
    public static int anInt4458;
    public int[] anIntArray4459;
    public static int anInt4460;
    public int[] anIntArray4461 = new int[16];
    public static int anInt4462;
    public static int anInt4463;
    public int anInt4464 = 1000000;
    public int[] anIntArray4465 = new int[16];
    public static int anInt4466;
    public Class10 aClass10_4467;
    public static int anInt4468;
    public static int anInt4469;
    public static int anInt4470;
    public static short[] aShortArray4471;
    public static int anInt4472;
    public int[] anIntArray4473;
    public static int anInt4474;
    public static int anInt4475;
    public Class68_Sub26[][] aClass68_Sub26ArrayArray4476 = new Class68_Sub26[16][128];
    public static int anInt4477;
    public static Class21renamed aClass21_4478;
    public static int anInt4479;
    public static RSString aRSString_4480;
    public static int anInt4481;
    public static int anInt4482;
    public int[] anIntArray4483;
    public static int anInt4484;
    public int[] anIntArray4485;
    public static int anInt4486;
    public static int anInt4487;
    public static int anInt4488;
    public int[] anIntArray4489;
    public static int anInt4490;
    public static int anInt4491;
    public static int anInt4492;
    public int[] anIntArray4493;
    public int[] anIntArray4494;
    public int[] anIntArray4495;
    public int anInt4496;
    public static int anInt4497;
    public static Class58 aClass58_4498;
    public static int anInt4499;
    public static int anInt4500;
    public int[] anIntArray4501;
    public static int anInt4502;
    public static int anInt4503 = 1;
    public static int anInt4504;
    public static int anInt4505;
    public static int anInt4506;
    public static int anInt4507;
    public static int anInt4508;
    public static RSString aRSString_4509;
    public static int anInt4510;
    public Class68_Sub26[][] aClass68_Sub26ArrayArray4511;
    public int[] anIntArray4512;
    public int[] anIntArray4513;
    public static int anInt4514;
    public static int anInt4515;
    public Class113 aClass113_4516;
    public static int anInt4517;
    public static int anInt4518;
    public static Class21_Sub1 aClass21_Sub1_4519;
    public static int anInt4520;
    public static boolean aBoolean4521;
    public int[] anIntArray4522;
    public static int anInt4523;
    public int[] anIntArray4524;
    public int anInt4525;
    public long aLong4526;
    public Class68_Sub28_Sub2 aClass68_Sub28_Sub2_4527;
    public long aLong4528;
    public boolean aBoolean4529;
    public int anInt4530;

    public void method1230(int i, int i_0_, int i_1_) {
        anIntArray4483[i] = i_0_;
        anIntArray4461[i] = (int) ((Math.pow(2.0, (double) i_0_ * 5.4931640625E-4) * (double) i_1_) + 0.5);
        anInt4505++;
    }

    public synchronized void method1225(int[] is, int i, int i_2_) {
        if (aClass10_4467.method213()) {
            int i_3_ = anInt4464 * aClass10_4467.anInt184 / Class93.anInt1660;
            do {
                long l = aLong4528 - -((long) i_2_ * (long) i_3_);
                if ((-l + aLong4526 ^ 0xffffffffffffffffL) <= -1L) {
                    aLong4528 = l;
                    break;
                }
                int i_4_ = (int) ((-1L + (aLong4526 - aLong4528) - -(long) i_3_) / (long) i_3_);
                i_2_ -= i_4_;
                aLong4528 += (long) i_4_ * (long) i_3_;
                aClass68_Sub28_Sub2_4527.method1225(is, i, i_4_);
                method1262(true);
                i += i_4_;
            } while (aClass10_4467.method213());
        }
        anInt4457++;
        aClass68_Sub28_Sub2_4527.method1225(is, i, i_2_);
    }

    public synchronized Class68_Sub28 method1226() {
        anInt4523++;
        return aClass68_Sub28_Sub2_4527;
    }

    public boolean method1231(Class68_Sub26 class68_sub26, byte i) {
        anInt4520++;
        if (i != -42) {
            method1251(-14, (byte) -120);
        }
        if (class68_sub26.aClass68_Sub28_Sub3_3185 == null) {
            if (class68_sub26.anInt3188 >= 0) {
                class68_sub26.method647(-17554);
                if ((class68_sub26.anInt3179 ^ 0xffffffff) < -1 && (aClass68_Sub26ArrayArray4476[class68_sub26.anInt3193][class68_sub26.anInt3179]) == class68_sub26) {
                    aClass68_Sub26ArrayArray4476[class68_sub26.anInt3193][class68_sub26.anInt3179] = null;
                }
            }
            return true;
        }
        return false;
    }

    public void method1232(int i, byte i_5_, int i_6_, int i_7_) {
        anInt4458++;
        if (i_5_ <= 32) {
            aShortArray4471 = null;
        }
    }

    public int method1233(boolean bool, Class68_Sub26 class68_sub26) {
        anInt4460++;
        int i = ((class68_sub26.anInt3209 * class68_sub26.anInt3181 >> 1655033004) + class68_sub26.anInt3189);
        i += ((anIntArray4513[class68_sub26.anInt3193] * (-8192 + anIntArray4465[class68_sub26.anInt3193])) >> -1751757364);
        Class20 class20 = class68_sub26.aClass20_3192;
        if (class20.anInt408 > 0 && (class20.anInt417 > 0 || anIntArray4473[class68_sub26.anInt3193] > 0)) {
            int i_8_ = class20.anInt417 << 1978564162;
            int i_9_ = class20.anInt415 << 1064043553;
            if ((class68_sub26.anInt3206 ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
                i_8_ = i_8_ * class68_sub26.anInt3206 / i_9_;
            }
            i_8_ += anIntArray4473[class68_sub26.anInt3193] >> 855701031;
            double d = Math.sin(0.01227184630308513 * (double) (class68_sub26.anInt3201 & 0x1ff));
            i += (int) (d * (double) i_8_);
        }
        if (bool != true) {
            return -115;
        }
        int i_10_ = (int) (((double) ((class68_sub26.aClass68_Sub11_Sub1_3204.anInt3447) * 256) * Math.pow(2.0, (double) i * 3.255208333333333E-4) / (double) Class93.anInt1660) + 0.5);
        if (i_10_ < 1) {
            return 1;
        }
        return i_10_;
    }

    public void method1234(int i, int i_11_) {
        if ((0x2 & anIntArray4524[i_11_] ^ 0xffffffff) != -1) {
            for (Class68_Sub26 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method293((byte) 76);
                 class68_sub26 != null;
                 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method290((byte) -118)) {
                if (i_11_ == class68_sub26.anInt3193 && (aClass68_Sub26ArrayArray4511[i_11_][class68_sub26.anInt3198]) == null && (class68_sub26.anInt3188 ^ 0xffffffff) > -1) {
                    class68_sub26.anInt3188 = 0;
                }
            }
        }
        anInt4510++;
        if (i != 9773) {
            anIntArray4483 = null;
        }
    }

    public synchronized boolean method1235(byte i, Class68_Sub12 class68_sub12,
                                           Class14 class14, int i_12_,
                                           Class21renamed class21) {
        try {
            if (i >= -6) {
                return true;
            }
            anInt4500++;
            class68_sub12.method688();
            int[] is = null;
            if (i_12_ > 0) {
                is = new int[]{i_12_};
            }
            boolean bool = true;
            for (Class68_Sub16 class68_sub16 = ((Class68_Sub16) class68_sub12.aClass113_2917.method1679(-32642));
                 class68_sub16 != null;
                 class68_sub16 = (Class68_Sub16) class68_sub12.aClass113_2917.method1683((byte) -126)) {
                int i_13_ = (int) class68_sub16.aLong1218;
                Class68_Sub27 class68_sub27 = ((Class68_Sub27) aClass113_4516.method1678((long) i_13_, 85));
                if (class68_sub27 == null) {
                    class68_sub27 = Class11.method231(i_13_, true, class21);
                    if (class68_sub27 == null) {
                        bool = false;
                        continue;
                    }
                    aClass113_4516.method1677((byte) 126, class68_sub27,
                            (long) i_13_);
                }
                if (!class68_sub27.method1221(class14, is,
                        class68_sub16.aByteArray3021,
                        (byte) 67)) {
                    bool = false;
                }
            }
            if (bool) {
                class68_sub12.method687();
            }
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("dd.D(" + i + ',' + (class68_sub12 != null ? "{...}"
                            : "null") + ',' + (class14 != null ? "{...}" : "null") + ',' + i_12_ + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    public synchronized void method1236(byte i) {
        anInt4504++;
        if (i < 56) {
            aClass68_Sub26ArrayArray4476 = null;
        }
        for (Class68_Sub27 class68_sub27 = (Class68_Sub27) aClass113_4516.method1679(-32642);
             class68_sub27 != null;
             class68_sub27 = (Class68_Sub27) aClass113_4516.method1683((byte) -113)) {
            class68_sub27.method1220(4);
        }
    }

    public synchronized int method1224() {
        anInt4469++;
        return 0;
    }

    public void method1237(int i, int i_14_) {
        if (i_14_ != -1) {
            anIntArray4494 = null;
        }
        for (Class68_Sub26 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method293((byte) 76);
             class68_sub26 != null;
             class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method290((byte) -106)) {
            if ((i ^ 0xffffffff) > -1 || class68_sub26.anInt3193 == i) {
                if (class68_sub26.aClass68_Sub28_Sub3_3185 != null) {
                    class68_sub26.aClass68_Sub28_Sub3_3185.method1288(Class93.anInt1660 / 100);
                    if (class68_sub26.aClass68_Sub28_Sub3_3185.method1278()) {
                        aClass68_Sub28_Sub2_4527.aClass68_Sub28_Sub4_4555.method1316(class68_sub26.aClass68_Sub28_Sub3_3185);
                    }
                    class68_sub26.method1214(2);
                }
                if (class68_sub26.anInt3188 < 0) {
                    aClass68_Sub26ArrayArray4511[class68_sub26.anInt3193][class68_sub26.anInt3198] = null;
                }
                class68_sub26.method647(i_14_ ^ 0x4491);
            }
        }
        anInt4517++;
    }

    public synchronized void method1238(int i, int i_15_, int i_16_) {
        anInt4466++;
        method1264(i, i_15_, (byte) 35);
        if (i_16_ < 19) {
            aClass10_4467 = null;
        }
    }

    public synchronized void method1239(byte i, int i_17_) {
        anInt4496 = i_17_;
        if (i >= -105) {
            aClass68_Sub26ArrayArray4511 = null;
        }
        anInt4477++;
    }

    public void method1240(int i, int i_18_) {
        int i_19_ = 0xf0 & i_18_;
        anInt4506++;
        if (i_19_ == 128) {
            int i_20_ = 0xf & i_18_;
            int i_21_ = (i_18_ & 0x7f06) >> 2012441416;
            int i_22_ = 0x7f & i_18_ >> 1861354928;
            method1247(i_21_, i_22_, (byte) 87, i_20_);
        } else if (i_19_ == 144) {
            int i_23_ = i_18_ & 0xf;
            int i_24_ = (0x7f38 & i_18_) >> -576474520;
            int i_25_ = (i_18_ & 0x7fcf5d) >> 544042000;
            if (i_25_ <= 0) {
                method1247(i_24_, 64, (byte) 101, i_23_);
            } else {
                method1245(i_23_, i_24_, i_25_, 0);
            }
        } else if ((i_19_ ^ 0xffffffff) == -161) {
            int i_26_ = i_18_ & 0xf;
            int i_27_ = (0x7f435d & i_18_) >> 1837742928;
            int i_28_ = i_18_ >> 1838790888 & 0x7f;
            method1232(i_28_, (byte) 85, i_27_, i_26_);
        } else if ((i_19_ ^ 0xffffffff) == -177) {
            int i_29_ = 0xf & i_18_;
            int i_30_ = 0x7f & i_18_ >> -837848728;
            int i_31_ = i_18_ >> -841335216 & 0x7f;
            if (i_30_ == 0) {
                anIntArray4485[i_29_] = (Class120.method1740(anIntArray4485[i_29_], -2080769) - -(i_31_ << 1237724814));
            }
            if (i_30_ == 32) {
                anIntArray4485[i_29_] = ((i_31_ << -928491705) + Class120.method1740(-16257, anIntArray4485[i_29_]));
            }
            if (i_30_ == 1) {
                anIntArray4473[i_29_] = ((i_31_ << -184650553) + Class120.method1740(-16257, anIntArray4473[i_29_]));
            }
            if (i_30_ == 33) {
                anIntArray4473[i_29_] = i_31_ + Class120.method1740(anIntArray4473[i_29_], -128);
            }
            if ((i_30_ ^ 0xffffffff) == -6) {
                anIntArray4489[i_29_] = ((i_31_ << -286745497) + Class120.method1740(-16257, anIntArray4489[i_29_]));
            }
            if (i_30_ == 37) {
                anIntArray4489[i_29_] = i_31_ + Class120.method1740(anIntArray4489[i_29_], -128);
            }
            if ((i_30_ ^ 0xffffffff) == -8) {
                anIntArray4493[i_29_] = ((i_31_ << -367082873) + Class120.method1740(anIntArray4493[i_29_], -16257));
            }
            if ((i_30_ ^ 0xffffffff) == -40) {
                anIntArray4493[i_29_] = (Class120.method1740(anIntArray4493[i_29_], -128) - -i_31_);
            }
            if ((i_30_ ^ 0xffffffff) == -11) {
                anIntArray4495[i_29_] = (Class120.method1740(anIntArray4495[i_29_], -16257) - -(i_31_ << 1132323943));
            }
            if ((i_30_ ^ 0xffffffff) == -43) {
                anIntArray4495[i_29_] = Class120.method1740(-128, anIntArray4495[i_29_]) + i_31_;
            }
            if (i_30_ == 11) {
                anIntArray4459[i_29_] = (Class120.method1740(anIntArray4459[i_29_], -16257) + (i_31_ << -1670563385));
            }
            if ((i_30_ ^ 0xffffffff) == -44) {
                anIntArray4459[i_29_] = (Class120.method1740(-128, anIntArray4459[i_29_]) - -i_31_);
            }
            if (i_30_ == 64) {
                if (i_31_ < 64) {
                    anIntArray4524[i_29_] = Class120.method1740(anIntArray4524[i_29_], -2);
                } else {
                    anIntArray4524[i_29_] = Class70.method1335(anIntArray4524[i_29_], 1);
                }
            }
            if ((i_30_ ^ 0xffffffff) == -66) {
                if ((i_31_ ^ 0xffffffff) <= -65) {
                    anIntArray4524[i_29_] = Class70.method1335(anIntArray4524[i_29_], 2);
                } else {
                    method1234(9773, i_29_);
                    anIntArray4524[i_29_] = Class120.method1740(anIntArray4524[i_29_], -3);
                }
            }
            if (i_30_ == 99) {
                anIntArray4522[i_29_] = ((i_31_ << -794495257) + Class120.method1740(anIntArray4522[i_29_], 127));
            }
            if ((i_30_ ^ 0xffffffff) == -99) {
                anIntArray4522[i_29_] = (Class120.method1740(anIntArray4522[i_29_], 16256) + i_31_);
            }
            if ((i_30_ ^ 0xffffffff) == -102) {
                anIntArray4522[i_29_] = ((i_31_ << -1188631865) + (16384 - -Class120.method1740(127, anIntArray4522[i_29_])));
            }
            if (i_30_ == 100) {
                anIntArray4522[i_29_] = (Class120.method1740(anIntArray4522[i_29_], 16256) + 16384 + i_31_);
            }
            if ((i_30_ ^ 0xffffffff) == -121) {
                method1237(i_29_, -1);
            }
            if ((i_30_ ^ 0xffffffff) == -122) {
                method1253((byte) -24, i_29_);
            }
            if ((i_30_ ^ 0xffffffff) == -124) {
                method1251(i_29_, (byte) 5);
            }
            if ((i_30_ ^ 0xffffffff) == -7) {
                int i_32_ = anIntArray4522[i_29_];
                if (i_32_ == 16384) {
                    anIntArray4513[i_29_] = (Class120.method1740(-16257, anIntArray4513[i_29_]) + (i_31_ << -1023577145));
                }
            }
            if (i_30_ == 38) {
                int i_33_ = anIntArray4522[i_29_];
                if (i_33_ == 16384) {
                    anIntArray4513[i_29_] = (Class120.method1740(-128, anIntArray4513[i_29_]) + i_31_);
                }
            }
            if ((i_30_ ^ 0xffffffff) == -17) {
                anIntArray4501[i_29_] = ((i_31_ << -1921877177) + Class120.method1740(-16257, anIntArray4501[i_29_]));
            }
            if ((i_30_ ^ 0xffffffff) == -49) {
                anIntArray4501[i_29_] = i_31_ + Class120.method1740(-128, anIntArray4501[i_29_]);
            }
            if ((i_30_ ^ 0xffffffff) == -82) {
                if ((i_31_ ^ 0xffffffff) > -65) {
                    method1254(i_29_, (byte) 86);
                    anIntArray4524[i_29_] = Class120.method1740(anIntArray4524[i_29_], -5);
                } else {
                    anIntArray4524[i_29_] = Class70.method1335(anIntArray4524[i_29_], 4);
                }
            }
            if (i_30_ == 17) {
                method1230(i_29_, ((~0x3f80 & anIntArray4483[i_29_]) - -(i_31_ << 1875579879)), 2097152);
            }
            if ((i_30_ ^ 0xffffffff) == -50) {
                method1230(i_29_, (~0x7f & anIntArray4483[i_29_]) + i_31_,
                        2097152);
            }
        } else if (i == -5420) {
            if (i_19_ == 192) {
                int i_34_ = i_18_ & 0xf;
                int i_35_ = 0x7f & i_18_ >> -119999544;
                method1244(anIntArray4485[i_34_] + i_35_, i_34_, (byte) 56);
            } else if (i_19_ == 208) {
                int i_36_ = i_18_ & 0xf;
                int i_37_ = (0x7f87 & i_18_) >> -1864037048;
                method1242(i_36_, 6, i_37_);
            } else if ((i_19_ ^ 0xffffffff) == -225) {
                int i_38_ = i_18_ & 0xf;
                int i_39_ = ((0x7f & i_18_ >> -2001457688) + ((i_18_ & 0x7f01ba) >> 1654521225));
                method1261(i_38_, true, i_39_);
            } else {
                i_19_ = 0xff & i_18_;
                if ((i_19_ ^ 0xffffffff) == -256) {
                    method1263(i ^ ~0x2e6a);
                }
            }
        }
    }

    public static void method1241(int i, int i_40_, int i_41_, int i_42_,
                                  int i_43_) {
        GroundData.anInt677 = i_41_;
        Class35.anInt605 = i_40_;
        anInt4515++;
        Class113.anInt1918 = i_43_;
        if (i_42_ != 20685) {
            aClass21_Sub1_4519 = null;
        }
        Class51.anInt2255 = i;
    }

    public void method1242(int i, int i_44_, int i_45_) {
        anInt4474++;
        if (i_44_ != 6) {
            method1254(29, (byte) -4);
        }
    }

    public void method1243(Class68_Sub26 class68_sub26, boolean bool, byte i) {
        anInt4462++;
        int i_46_ = class68_sub26.aClass68_Sub11_Sub1_3204.aByteArray3445.length;
        if (i <= 18) {
            doAction(null, (byte) 14, -77);
        }
        int i_47_;
        if (!bool || !class68_sub26.aClass68_Sub11_Sub1_3204.aBoolean3446) {
            i_47_ = (int) (((long) anIntArray4501[class68_sub26.anInt3193] * (long) i_46_) >> 456188422);
        } else {
            int i_48_ = (-class68_sub26.aClass68_Sub11_Sub1_3204.anInt3443 + i_46_ + i_46_);
            i_46_ <<= 8;
            i_47_ = (int) (((long) anIntArray4501[class68_sub26.anInt3193] * (long) i_48_) >> -2051815226);
            if (i_46_ <= i_47_) {
                class68_sub26.aClass68_Sub28_Sub3_3185.method1305(true);
                i_47_ = i_46_ - (-i_46_ - -1) + -i_47_;
            }
        }
        class68_sub26.aClass68_Sub28_Sub3_3185.method1292(i_47_);
    }

    public void method1244(int i, int i_49_, byte i_50_) {
        if ((anIntArray4512[i_49_] ^ 0xffffffff) != (i ^ 0xffffffff)) {
            anIntArray4512[i_49_] = i;
            for (int i_51_ = 0; i_51_ < 128; i_51_++) {
                aClass68_Sub26ArrayArray4476[i_49_][i_51_] = null;
            }
        }
        anInt4490++;
        int i_52_ = -24 / ((3 - i_50_) / 47);
    }

    public void method1245(int i, int i_53_, int i_54_, int i_55_) {
        method1247(i_53_, 64, (byte) 110, i);
        anInt4488++;
        if ((0x2 & anIntArray4524[i]) != 0) {
            for (Class68_Sub26 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method289(i_55_ ^ 0x7768);
                 class68_sub26 != null;
                 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method280((byte) -75)) {
                if (i == class68_sub26.anInt3193 && class68_sub26.anInt3188 < 0) {
                    aClass68_Sub26ArrayArray4511[i][class68_sub26.anInt3198] = null;
                    aClass68_Sub26ArrayArray4511[i][i_53_] = class68_sub26;
                    int i_56_ = (class68_sub26.anInt3189 + (class68_sub26.anInt3181 * class68_sub26.anInt3209 >> -610093428));
                    class68_sub26.anInt3189 += i_53_ + -class68_sub26.anInt3198 << -1786379800;
                    class68_sub26.anInt3198 = i_53_;
                    class68_sub26.anInt3209 = i_56_ - class68_sub26.anInt3189;
                    class68_sub26.anInt3181 = 4096;
                    return;
                }
            }
        }
        Class68_Sub27 class68_sub27 = ((Class68_Sub27) aClass113_4516.method1678((long) anIntArray4512[i], 72));
        if (class68_sub27 != null) {
            Class68_Sub11_Sub1 class68_sub11_sub1 = class68_sub27.aClass68_Sub11_Sub1Array3213[i_53_];
            if (class68_sub11_sub1 != null) {
                Class68_Sub26 class68_sub26 = new Class68_Sub26();
                class68_sub26.anInt3193 = i;
                class68_sub26.aClass68_Sub11_Sub1_3204 = class68_sub11_sub1;
                class68_sub26.aClass68_Sub27_3194 = class68_sub27;
                class68_sub26.aClass20_3192 = class68_sub27.aClass20Array3224[i_53_];
                class68_sub26.anInt3179 = class68_sub27.aByteArray3217[i_53_];
                class68_sub26.anInt3198 = i_53_;
                class68_sub26.anInt3208 = (i_54_ * (i_54_ * (class68_sub27.anInt3221 * class68_sub27.aByteArray3212[i_53_])) + 1024) >> 1922857323;
                class68_sub26.anInt3178 = 0xff & class68_sub27.aByteArray3222[i_53_];
                class68_sub26.anInt3189 = ((i_53_ << 1045251272) - (class68_sub27.aShortArray3211[i_53_] & 0x7fff));
                class68_sub26.anInt3199 = 0;
                class68_sub26.anInt3197 = 0;
                class68_sub26.anInt3188 = -1;
                class68_sub26.anInt3187 = 0;
                class68_sub26.anInt3202 = 0;
                if (anIntArray4501[i] != 0) {
                    class68_sub26.aClass68_Sub28_Sub3_3185 = (Class68_Sub28_Sub3.method1287(class68_sub11_sub1,
                            method1233(true, class68_sub26), 0,
                            method1256((byte) -93, class68_sub26)));
                    method1243(class68_sub26,
                            (class68_sub27.aShortArray3211[i_53_] ^ 0xffffffff) > -1,
                            (byte) 93);
                } else {
                    class68_sub26.aClass68_Sub28_Sub3_3185 = (Class68_Sub28_Sub3.method1287(class68_sub11_sub1,
                            method1233(true, class68_sub26),
                            method1255((byte) -116, class68_sub26),
                            method1256((byte) -57, class68_sub26)));
                }
                if (class68_sub27.aShortArray3211[i_53_] < 0) {
                    class68_sub26.aClass68_Sub28_Sub3_3185.method1272(-1);
                }
                if (i_55_ <= class68_sub26.anInt3179) {
                    Class68_Sub26 class68_sub26_57_ = (aClass68_Sub26ArrayArray4476[i][class68_sub26.anInt3179]);
                    if (class68_sub26_57_ != null && class68_sub26_57_.anInt3188 < 0) {
                        aClass68_Sub26ArrayArray4511[i][(class68_sub26_57_.anInt3198)] = null;
                        class68_sub26_57_.anInt3188 = 0;
                    }
                    aClass68_Sub26ArrayArray4476[i][class68_sub26.anInt3179] = class68_sub26;
                }
                aClass68_Sub28_Sub2_4527.aClass16_4542.method286(class68_sub26,
                        true);
                aClass68_Sub26ArrayArray4511[i][i_53_] = class68_sub26;
            }
        }
    }

    public synchronized void method1246(boolean bool) {
        for (Class68_Sub27 class68_sub27 = (Class68_Sub27) aClass113_4516.method1679(-32642);
             class68_sub27 != null;
             class68_sub27 = (Class68_Sub27) aClass113_4516.method1683((byte) -114)) {
            class68_sub27.method647(-17554);
        }
        anInt4463++;
        if (bool != true) {
            method1235((byte) -100, null, null, -35, null);
        }
    }

    public void method1247(int i, int i_58_, byte i_59_, int i_60_) {
        if (i_59_ <= 82) {
            method1226();
        }
        anInt4470++;
        Class68_Sub26 class68_sub26 = aClass68_Sub26ArrayArray4511[i_60_][i];
        if (class68_sub26 != null) {
            aClass68_Sub26ArrayArray4511[i_60_][i] = null;
            if ((0x2 & anIntArray4524[i_60_] ^ 0xffffffff) != -1) {
                for (Class68_Sub26 class68_sub26_61_ = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method293((byte) 76);
                     class68_sub26_61_ != null;
                     class68_sub26_61_ = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method290((byte) 42)) {
                    if (class68_sub26.anInt3193 == class68_sub26_61_.anInt3193 && class68_sub26_61_.anInt3188 < 0 && class68_sub26 != class68_sub26_61_) {
                        class68_sub26.anInt3188 = 0;
                        break;
                    }
                }
            } else {
                class68_sub26.anInt3188 = 0;
            }
        }
    }

    public static Class68_Sub20_Sub7 method1248(int i, byte i_62_) {
        Class68_Sub20_Sub7 class68_sub20_sub7 = ((Class68_Sub20_Sub7) Class68_Sub6.aLogin_2844.method1473((long) i, (byte) -76));
        anInt4514++;
        if (class68_sub20_sub7 != null) {
            return class68_sub20_sub7;
        }
        byte[] is = Class102.aClass21_1753.method338(i, 0, 26);
        class68_sub20_sub7 = new Class68_Sub20_Sub7();
        if (is != null) {
            class68_sub20_sub7.method1078(new Stream(is), (byte) -93);
        }
        if (i_62_ >= 0) {
            return null;
        }
        Class68_Sub6.aLogin_2844.method1465((long) i, (byte) 111,
                class68_sub20_sub7);
        return class68_sub20_sub7;
    }

    public synchronized void method1249(int i) {
        anInt4482++;
        aClass10_4467.method220();
        method1263(15169);
        if (i < 46) {
            anIntArray4501 = null;
        }
    }

    public int method1250(int i) {
        anInt4468++;
        if (i > -29) {
            return -61;
        }
        return anInt4496;
    }

    public void method1251(int i, byte i_63_) {
        for (Class68_Sub26 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method293((byte) 76);
             class68_sub26 != null;
             class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method290((byte) -121)) {
            if ((i < 0 || class68_sub26.anInt3193 == i) && class68_sub26.anInt3188 < 0) {
                aClass68_Sub26ArrayArray4511[class68_sub26.anInt3193][class68_sub26.anInt3198] = null;
                class68_sub26.anInt3188 = 0;
            }
        }
        anInt4508++;
        if (i_63_ != 5) {
            method1256((byte) 50, null);
        }
    }

    public boolean method1252(int i, int i_64_, Class68_Sub26 class68_sub26,
                              byte i_65_, int[] is) {
        try {
            anInt4472++;
            if (i_65_ != -68) {
                anInt4525 = -70;
            }
            class68_sub26.anInt3196 = Class93.anInt1660 / 100;
            if (class68_sub26.anInt3188 >= 0 && (class68_sub26.aClass68_Sub28_Sub3_3185 == null || class68_sub26.aClass68_Sub28_Sub3_3185.method1295())) {
                class68_sub26.method1214(2);
                class68_sub26.method647(i_65_ + -17486);
                if ((class68_sub26.anInt3179 ^ 0xffffffff) < -1 && class68_sub26 == (aClass68_Sub26ArrayArray4476[class68_sub26.anInt3193][class68_sub26.anInt3179])) {
                    aClass68_Sub26ArrayArray4476[class68_sub26.anInt3193][class68_sub26.anInt3179] = null;
                }
                return true;
            }
            int i_66_ = class68_sub26.anInt3181;
            boolean bool = false;
            if ((i_66_ ^ 0xffffffff) < -1) {
                i_66_ -= (int) (0.5 + 16.0 * Math.pow(2.0,
                        ((double) (anIntArray4489[(class68_sub26.anInt3193)]) * 4.921259842519685E-4)));
                if (i_66_ < 0) {
                    i_66_ = 0;
                }
                class68_sub26.anInt3181 = i_66_;
            }
            class68_sub26.aClass68_Sub28_Sub3_3185.method1296(method1233(true, class68_sub26));
            class68_sub26.anInt3206++;
            Class20 class20 = class68_sub26.aClass20_3192;
            class68_sub26.anInt3201 += class20.anInt408;
            double d = ((double) ((class68_sub26.anInt3198 - 60 << -2004338680) + ((class68_sub26.anInt3209 * class68_sub26.anInt3181) >> -516280372)) * 5.086263020833333E-6);
            if ((class20.anInt409 ^ 0xffffffff) < -1) {
                if ((class20.anInt402 ^ 0xffffffff) < -1) {
                    class68_sub26.anInt3202 += (int) ((Math.pow(2.0, d * (double) class20.anInt402) * 128.0) + 0.5);
                } else {
                    class68_sub26.anInt3202 += 128;
                }
                if (class20.anInt409 * class68_sub26.anInt3202 >= 819200) {
                    bool = true;
                }
            }
            if (class20.aByteArray407 != null) {
                if (class20.anInt418 <= 0) {
                    class68_sub26.anInt3199 += 128;
                } else {
                    class68_sub26.anInt3199 += (int) ((128.0 * Math.pow(2.0,
                            d * (double) class20.anInt418)) + 0.5);
                }
                for (/**/;
                         ((-2 + class20.aByteArray407.length > class68_sub26.anInt3187) && ((0xff00 & ((class20.aByteArray407[class68_sub26.anInt3187 + 2]) << -1967673784) ^ 0xffffffff) > (class68_sub26.anInt3199 ^ 0xffffffff)));
                         class68_sub26.anInt3187 += 2) {
                    /* empty */
                }
                if (((class20.aByteArray407.length + -2 ^ 0xffffffff) == (class68_sub26.anInt3187 ^ 0xffffffff)) && (class20.aByteArray407[class68_sub26.anInt3187 - -1] == 0)) {
                    bool = true;
                }
            }
            if ((class68_sub26.anInt3188 ^ 0xffffffff) <= -1 && class20.aByteArray405 != null && (anIntArray4524[class68_sub26.anInt3193] & 0x1) == 0 && ((class68_sub26.anInt3179 ^ 0xffffffff) > -1 || (aClass68_Sub26ArrayArray4476[class68_sub26.anInt3193][class68_sub26.anInt3179]) != class68_sub26)) {
                if (class20.anInt414 > 0) {
                    class68_sub26.anInt3188 += (int) ((128.0 * Math.pow(2.0,
                            (double) class20.anInt414 * d)) + 0.5);
                } else {
                    class68_sub26.anInt3188 += 128;
                }
                for (/**/;
                         ((-2 + class20.aByteArray405.length > class68_sub26.anInt3197) && ((class68_sub26.anInt3188 ^ 0xffffffff) < (((class20.aByteArray405[2 + class68_sub26.anInt3197]) << 901730312 & 0xff00) ^ 0xffffffff)));
                         class68_sub26.anInt3197 += 2) {
                    /* empty */
                }
                if (class68_sub26.anInt3197 == class20.aByteArray405.length - 2) {
                    bool = true;
                }
            }
            if (bool) {
                class68_sub26.aClass68_Sub28_Sub3_3185.method1288(class68_sub26.anInt3196);
                if (is != null) {
                    class68_sub26.aClass68_Sub28_Sub3_3185.method1225(is, i_64_, i);
                } else {
                    class68_sub26.aClass68_Sub28_Sub3_3185.method1229(i);
                }
                if (class68_sub26.aClass68_Sub28_Sub3_3185.method1278()) {
                    aClass68_Sub28_Sub2_4527.aClass68_Sub28_Sub4_4555.method1316(class68_sub26.aClass68_Sub28_Sub3_3185);
                }
                class68_sub26.method1214(2);
                if (class68_sub26.anInt3188 >= 0) {
                    class68_sub26.method647(-17554);
                    if ((class68_sub26.anInt3179 ^ 0xffffffff) < -1 && class68_sub26 == (aClass68_Sub26ArrayArray4476[class68_sub26.anInt3193][class68_sub26.anInt3179])) {
                        aClass68_Sub26ArrayArray4476[class68_sub26.anInt3193][class68_sub26.anInt3179] = null;
                    }
                }
                return true;
            }
            class68_sub26.aClass68_Sub28_Sub3_3185.method1289(class68_sub26.anInt3196,
                    method1255((byte) -110, class68_sub26),
                    method1256((byte) -105, class68_sub26));
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("dd.AA(" + i + ',' + i_64_ + ',' + (class68_sub26 != null ? "{...}"
                            : "null") + ',' + i_65_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public synchronized void method1229(int i) {
        anInt4486++;
        if (aClass10_4467.method213()) {
            int i_67_ = aClass10_4467.anInt184 * anInt4464 / Class93.anInt1660;
            do {
                long l = (long) i * (long) i_67_ + aLong4528;
                if ((aLong4526 - l ^ 0xffffffffffffffffL) <= -1L) {
                    aLong4528 = l;
                    break;
                }
                int i_68_ = (int) ((-1L + (long) i_67_ + (-aLong4528 + aLong4526)) / (long) i_67_);
                i -= i_68_;
                aLong4528 += (long) i_68_ * (long) i_67_;
                aClass68_Sub28_Sub2_4527.method1229(i_68_);
                method1262(true);
            } while (aClass10_4467.method213());
        }
        aClass68_Sub28_Sub2_4527.method1229(i);
    }

    public void method1253(byte i, int i_69_) {
        anInt4487++;
        if (i_69_ < 0) {
            for (i_69_ = 0; i_69_ < 16; i_69_++) {
                method1253((byte) -83, i_69_);
            }
        } else {
            anIntArray4493[i_69_] = 12800;
            anIntArray4495[i_69_] = 8192;
            anIntArray4459[i_69_] = 16383;
            anIntArray4465[i_69_] = 8192;
            anIntArray4473[i_69_] = 0;
            anIntArray4489[i_69_] = 8192;
            method1234(9773, i_69_);
            method1254(i_69_, (byte) 38);
            anIntArray4524[i_69_] = 0;
            anIntArray4522[i_69_] = 32767;
            anIntArray4513[i_69_] = 256;
            if (i >= -13) {
                aClass68_Sub26ArrayArray4511 = null;
            }
            anIntArray4501[i_69_] = 0;
            method1230(i_69_, 8192, 2097152);
        }
    }

    public void method1254(int i, byte i_70_) {
        if ((0x4 & anIntArray4524[i] ^ 0xffffffff) != -1) {
            for (Class68_Sub26 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method293((byte) 76);
                 class68_sub26 != null;
                 class68_sub26 = (Class68_Sub26) aClass68_Sub28_Sub2_4527.aClass16_4542.method290((byte) -125)) {
                if ((i ^ 0xffffffff) == (class68_sub26.anInt3193 ^ 0xffffffff)) {
                    class68_sub26.anInt3180 = 0;
                }
            }
        }
        anInt4481++;
        if (i_70_ <= 2) {
            anIntArray4493 = null;
        }
    }

    public int method1255(byte i, Class68_Sub26 class68_sub26) {
        anInt4479++;
        int i_71_ = ((anIntArray4493[class68_sub26.anInt3193] * anIntArray4459[class68_sub26.anInt3193]) - -4096 >> 184148909);
        Class20 class20 = class68_sub26.aClass20_3192;
        i_71_ = 16384 + i_71_ * i_71_ >> 66690095;
        i_71_ = i_71_ * class68_sub26.anInt3208 + 16384 >> -1185232081;
        i_71_ = anInt4496 * i_71_ + 128 >> 720028456;
        if (class20.anInt409 > 0) {
            i_71_ = (int) ((Math.pow(0.5, (1.953125E-5 * (double) class68_sub26.anInt3202 * (double) class20.anInt409)) * (double) i_71_) + 0.5);
        }
        if (class20.aByteArray407 != null) {
            int i_72_ = class20.aByteArray407[1 + class68_sub26.anInt3187];
            int i_73_ = class68_sub26.anInt3199;
            if ((class68_sub26.anInt3187 ^ 0xffffffff) > (-2 + class20.aByteArray407.length ^ 0xffffffff)) {
                int i_74_ = ((class20.aByteArray407[class68_sub26.anInt3187] << 1607012936) & 0xff00);
                int i_75_ = (class20.aByteArray407[2 + class68_sub26.anInt3187] & 0xff) << -225091064;
                i_72_ += ((-i_72_ + class20.aByteArray407[class68_sub26.anInt3187 - -3]) * (i_73_ - i_74_) / (i_75_ + -i_74_));
            }
            i_71_ = 32 + i_71_ * i_72_ >> 450169606;
        }
        if (i > -108) {
            method1264(91, -118, (byte) 69);
        }
        if (class68_sub26.anInt3188 > 0 && class20.aByteArray405 != null) {
            int i_76_ = class68_sub26.anInt3188;
            int i_77_ = class20.aByteArray405[class68_sub26.anInt3197 + 1];
            if (class68_sub26.anInt3197 < class20.aByteArray405.length - 2) {
                int i_78_ = ((class20.aByteArray405[class68_sub26.anInt3197] << 1523540488) & 0xff00);
                int i_79_ = (class20.aByteArray405[2 + class68_sub26.anInt3197] & 0xff) << -598009848;
                i_77_ += (class20.aByteArray405[3 + class68_sub26.anInt3197] - i_77_) * (-i_78_ + i_76_) / (-i_78_ + i_79_);
            }
            i_71_ = i_77_ * i_71_ - -32 >> -1129015290;
        }
        return i_71_;
    }

    public int method1256(byte i, Class68_Sub26 class68_sub26) {
        if (i >= -53) {
            return 79;
        }
        int i_80_ = anIntArray4495[class68_sub26.anInt3193];
        anInt4507++;
        if ((i_80_ ^ 0xffffffff) > -8193) {
            return 32 + class68_sub26.anInt3178 * i_80_ >> -1243097850;
        }
        return (-(32 + (128 - class68_sub26.anInt3178) * (16384 - i_80_) >> 224148710) + 16384);
    }

    public static void method1257(byte i) {
        aRSString_4480 = null;
        if (i >= 88) {
            aShortArray4471 = null;
            aClass21_Sub1_4519 = null;
            aClass21_4478 = null;
            aRSString_4509 = null;
            aClass58_4498 = null;
        }
    }

    public synchronized Class68_Sub28 method1228() {
        anInt4518++;
        return null;
    }

    public synchronized boolean method1258(int i) {
        anInt4502++;
        if (i != -1) {
            method1263(-85);
        }
        return aClass10_4467.method213();
    }

    public synchronized void method1259(boolean bool, boolean bool_81_,
                                        Class68_Sub12 class68_sub12) {
        anInt4456++;
        method1249(111);
        aClass10_4467.method217(class68_sub12.aByteArray2916);
        aBoolean4529 = bool;
        aLong4528 = 0L;
        int i = aClass10_4467.method216();
        for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > (i ^ 0xffffffff); i_82_++) {
            aClass10_4467.method215(i_82_);
            aClass10_4467.method222(i_82_);
            aClass10_4467.method225(i_82_);
        }
        anInt4530 = aClass10_4467.method214();
        anInt4525 = aClass10_4467.anIntArray182[anInt4530];
        if (bool_81_ != true) {
            method1241(127, 87, -12, 35, -28);
        }
        aLong4526 = aClass10_4467.method223(anInt4525);
    }

    public static void doAction(Class68_Sub29 class68_sub29, byte i,
                                int i_83_) {
        // System.out.println("doAction("+class68_sub29+", "+i+", "+i_83_+")");
        anInt4499++;
        Object[] objects = class68_sub29.anObjectArray3237;
//        System.out.println("objects.length: "+objects.length);
//        for(Object o: objects)
//            System.out.print(o+", ");
//        System.out.println();
        // 1180 for login, 1172
        int actionID = ((Integer) objects[0]).intValue();
        Class68_Sub20_Sub14 class68_sub20_sub14 = Class68_Sub13_Sub17.method784(actionID, (byte) 109);
        if (class68_sub20_sub14 != null) {
            int i_85_ = 0;
            Class76.anInt1355 = 0;
            int i_86_ = -1;
            int[] is = class68_sub20_sub14.anIntArray4374;
            int i_87_ = -1;
            int[] is_88_ = class68_sub20_sub14.anIntArray4377;
            int i_89_ = 0;
            try {
                int i_90_ = 0;
                Class68_Sub29.aRSStringArray3248 = new RSString[class68_sub20_sub14.anInt4370];
                Class94.anIntArray1677 = new int[class68_sub20_sub14.anInt4379];
                int i_91_ = 0;
                for (int i_92_ = 1;
                     (objects.length ^ 0xffffffff) < (i_92_ ^ 0xffffffff);
                     i_92_++) {
                    if (!(objects[i_92_] instanceof Integer)) {
                        if (objects[i_92_] instanceof RSString) {
                            RSString class100 = (RSString) objects[i_92_];
                            if (class100.method1593((Class68_Sub25.aRSString_3171),
                                    (byte) 101)) {
                                class100 = class68_sub29.aRSString_3234;
                            }
                            Class68_Sub29.aRSStringArray3248[i_91_++] = class100;
                        }
                    } else {
                        int i_93_ = ((Integer) objects[i_92_]).intValue();
                        if ((i_93_ ^ 0xffffffff) == 2147483646) {
                            i_93_ = class68_sub29.anInt3240;
                        }
                        if (i_93_ == -2147483646) {
                            i_93_ = class68_sub29.anInt3232;
                        }
                        if ((i_93_ ^ 0xffffffff) == 2147483644) {
                            i_93_ = (class68_sub29.aClass45_3239 != null
                                    ? class68_sub29.aClass45_3239.anInt792
                                    : -1);
                        }
                        if (i_93_ == -2147483644) {
                            i_93_ = class68_sub29.anInt3246;
                        }
                        if ((i_93_ ^ 0xffffffff) == 2147483642) {
                            i_93_ = (class68_sub29.aClass45_3239 == null ? -1
                                    : class68_sub29.aClass45_3239.anInt867);
                        }
                        if ((i_93_ ^ 0xffffffff) == 2147483641) {
                            i_93_ = (class68_sub29.aClass45_3244 != null
                                    ? class68_sub29.aClass45_3244.anInt792
                                    : -1);
                        }
                        if ((i_93_ ^ 0xffffffff) == 2147483640) {
                            i_93_ = (class68_sub29.aClass45_3244 != null
                                    ? class68_sub29.aClass45_3244.anInt867
                                    : -1);
                        }
                        if (i_93_ == -2147483640) {
                            i_93_ = class68_sub29.anInt3230;
                        }
                        if ((i_93_ ^ 0xffffffff) == 2147483638) {
                            i_93_ = class68_sub29.anInt3241;
                        }
                        Class94.anIntArray1677[i_90_++] = i_93_;
                    }
                }
                if (i != 124) {
                    anInt4491 = -17;
                }
                int i_94_ = 0;
                for (; ; ) {
                    i_94_++;
                    if (i_83_ < i_94_) {
                        throw new RuntimeException("slow");
                    }
                    i_87_ = is_88_[++i_86_];
                    // System.out.println("i_87_: "+i_87_);
                    if (i_87_ < 100) {
                        if ((i_87_ ^ 0xffffffff) == -1) {
                            Class68_Sub13.anIntArray2924[i_85_++] = is[i_86_];
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -2) {
                            int i_95_ = is[i_86_];
                            Class68_Sub13.anIntArray2924[i_85_++] = Class103.anIntArray1767[i_95_];
                            continue;
                        }
                        if (i_87_ == 2) {
                            int i_96_ = is[i_86_];
                            Class68_Sub13_Sub15.method767(i_96_,
                                    (Class68_Sub13.anIntArray2924[--i_85_]),
                                    i + -219);
                            continue;
                        }
                        if (i_87_ == 3) {
                            Class68_Sub15.stringArray[i_89_++] = (class68_sub20_sub14.aRSStringArray4375[i_86_]);
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -7) {
                            i_86_ += is[i_86_];
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -8) {
                            i_85_ -= 2;
                            if (Class68_Sub13.anIntArray2924[i_85_ - -1] != Class68_Sub13.anIntArray2924[i_85_]) {
                                i_86_ += is[i_86_];
                            }
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -9) {
                            i_85_ -= 2;
                            if (Class68_Sub13.anIntArray2924[i_85_ + 1] == Class68_Sub13.anIntArray2924[i_85_]) {
                                i_86_ += is[i_86_];
                            }
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -10) {
                            i_85_ -= 2;
                            if ((Class68_Sub13.anIntArray2924[i_85_ - -1] ^ 0xffffffff) < (Class68_Sub13.anIntArray2924[i_85_] ^ 0xffffffff)) {
                                i_86_ += is[i_86_];
                            }
                            continue;
                        }
                        if (i_87_ == 10) {
                            i_85_ -= 2;
                            if ((Class68_Sub13.anIntArray2924[i_85_] ^ 0xffffffff) < (Class68_Sub13.anIntArray2924[1 + i_85_] ^ 0xffffffff)) {
                                i_86_ += is[i_86_];
                            }
                            continue;
                        }
                        if (i_87_ == 21) {
                            if ((Class76.anInt1355 ^ 0xffffffff) != -1) {
                                Class43 class43 = (Class68_Sub13_Sub9.aClass43Array3570[--Class76.anInt1355]);
                                i_86_ = class43.anInt736;
                                Class68_Sub29.aRSStringArray3248 = class43.aRSStringArray738;
                                Class94.anIntArray1677 = class43.anIntArray731;
                                class68_sub20_sub14 = class43.aClass68_Sub20_Sub14_733;
                                is_88_ = class68_sub20_sub14.anIntArray4377;
                                is = class68_sub20_sub14.anIntArray4374;
                                continue;
                            }
                            break;
                        }
                        if (i_87_ == 25) {
                            int i_97_ = is[i_86_];
                            Class68_Sub13.anIntArray2924[i_85_++] = Class18.method300(i_97_, false);
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -28) {
                            int i_98_ = is[i_86_];
                            Class102.method1629(i_98_, 0,
                                    (Class68_Sub13.anIntArray2924[--i_85_]));
                            continue;
                        }
                        if (i_87_ == 31) {
                            i_85_ -= 2;
                            if (Class68_Sub13.anIntArray2924[i_85_] <= Class68_Sub13.anIntArray2924[i_85_ - -1]) {
                                i_86_ += is[i_86_];
                            }
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -33) {
                            i_85_ -= 2;
                            if ((Class68_Sub13.anIntArray2924[i_85_] ^ 0xffffffff) <= (Class68_Sub13.anIntArray2924[1 + i_85_] ^ 0xffffffff)) {
                                i_86_ += is[i_86_];
                            }
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -34) {
                            Class68_Sub13.anIntArray2924[i_85_++] = Class94.anIntArray1677[is[i_86_]];
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -35) {
                            Class94.anIntArray1677[is[i_86_]] = Class68_Sub13.anIntArray2924[--i_85_];
                            continue;
                        }
                        if (i_87_ == 35) {
                            Class68_Sub15.stringArray[i_89_++] = Class68_Sub29.aRSStringArray3248[is[i_86_]];
                            continue;
                        }
                        if (i_87_ == 36) {
                            Class68_Sub29.aRSStringArray3248[is[i_86_]] = Class68_Sub15.stringArray[--i_89_];
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -38) {
                            int i_99_ = is[i_86_];
                            i_89_ -= i_99_;
                            RSString class100 = (Class68_Sub20_Sub10.method1106(true, i_89_,
                                    Class68_Sub15.stringArray, i_99_));
                            Class68_Sub15.stringArray[i_89_++] = class100;
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -39) {
                            i_85_--;
                            continue;
                        }
                        if (i_87_ == 39) {
                            i_89_--;
                            continue;
                        }
                        if (i_87_ == 40) {
                            int i_100_ = is[i_86_];
                            Class68_Sub20_Sub14 class68_sub20_sub14_101_ = Class68_Sub13_Sub17.method784(i_100_,
                                    (byte) 61);
                            int[] is_102_ = new int[class68_sub20_sub14_101_.anInt4379];
                            RSString[] class100s = (new RSString[class68_sub20_sub14_101_.anInt4370]);
                            for (int i_103_ = 0;
                                 i_103_ < class68_sub20_sub14_101_.anInt4373;
                                 i_103_++) {
                                is_102_[i_103_] = (Class68_Sub13.anIntArray2924[(i_85_ + (-class68_sub20_sub14_101_.anInt4373 + i_103_))]);
                            }
                            for (int i_104_ = 0;
                                 ((i_104_ ^ 0xffffffff) > (class68_sub20_sub14_101_.anInt4371 ^ 0xffffffff));
                                 i_104_++) {
                                class100s[i_104_] = (Class68_Sub15.stringArray[i_104_ + (i_89_ - (class68_sub20_sub14_101_.anInt4371))]);
                            }
                            i_85_ -= class68_sub20_sub14_101_.anInt4373;
                            i_89_ -= class68_sub20_sub14_101_.anInt4371;
                            Class43 class43 = new Class43();
                            class43.aClass68_Sub20_Sub14_733 = class68_sub20_sub14;
                            class43.anIntArray731 = Class94.anIntArray1677;
                            class43.anInt736 = i_86_;
                            class43.aRSStringArray738 = Class68_Sub29.aRSStringArray3248;
                            if (Class68_Sub13_Sub9.aClass43Array3570.length <= Class76.anInt1355) {
                                throw new RuntimeException();
                            }
                            Class68_Sub13_Sub9.aClass43Array3570[Class76.anInt1355++] = class43;
                            i_86_ = -1;
                            class68_sub20_sub14 = class68_sub20_sub14_101_;
                            Class68_Sub29.aRSStringArray3248 = class100s;
                            is = class68_sub20_sub14.anIntArray4374;
                            Class94.anIntArray1677 = is_102_;
                            is_88_ = class68_sub20_sub14.anIntArray4377;
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -43) {
                            Class68_Sub13.anIntArray2924[i_85_++] = Class106.anIntArray1809[is[i_86_]];
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -44) {
                            int i_105_ = is[i_86_];
                            Class106.anIntArray1809[i_105_] = Class68_Sub13.anIntArray2924[--i_85_];
                            Class28.method394((byte) -117, i_105_);
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -45) {
                            int i_106_ = is[i_86_] >> -32923056;
                            int i_107_ = 0xffff & is[i_86_];
                            int i_108_ = Class68_Sub13.anIntArray2924[--i_85_];
                            if ((i_108_ ^ 0xffffffff) > -1 || (i_108_ ^ 0xffffffff) < -5001) {
                                throw new RuntimeException();
                            }
                            Class68_Sub13_Sub31.anIntArray3969[i_106_] = i_108_;
                            int i_109_ = -1;
                            if (i_107_ == 105) {
                                i_109_ = 0;
                            }
                            for (int i_110_ = 0; i_110_ < i_108_; i_110_++) {
                                Class75_Sub3_Sub1.anIntArrayArray4601[i_106_][i_110_] = i_109_;
                            }
                            continue;
                        }
                        if (i_87_ == 45) {
                            int i_111_ = is[i_86_];
                            int i_112_ = Class68_Sub13.anIntArray2924[--i_85_];
                            if ((i_112_ ^ 0xffffffff) > -1 || (Class68_Sub13_Sub31.anIntArray3969[i_111_] <= i_112_)) {
                                throw new RuntimeException();
                            }
                            Class68_Sub13.anIntArray2924[i_85_++] = (Class75_Sub3_Sub1.anIntArrayArray4601[i_111_][i_112_]);
                            continue;
                        }
                        if (i_87_ == 46) {
                            i_85_ -= 2;
                            int i_113_ = Class68_Sub13.anIntArray2924[i_85_];
                            int i_114_ = is[i_86_];
                            if (i_113_ < 0 || i_113_ >= (Class68_Sub13_Sub31.anIntArray3969[i_114_])) {
                                throw new RuntimeException();
                            }
                            Class75_Sub3_Sub1.anIntArrayArray4601[i_114_][i_113_] = Class68_Sub13.anIntArray2924[i_85_ + 1];
                            continue;
                        }
                        if (i_87_ == 47) {
                            RSString class100 = Class21_Sub1.aRSStringArray2710[is[i_86_]];
                            if (class100 == null) {
                                class100 = Class37.aRSString_652;
                            }
                            Class68_Sub15.stringArray[i_89_++] = class100;
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -49) {
                            int i_115_ = is[i_86_];
                            Class21_Sub1.aRSStringArray2710[i_115_] = Class68_Sub15.stringArray[--i_89_];
                            Class68_Sub13_Sub39.method907(i + -252, i_115_);
                            continue;
                        }
                        if ((i_87_ ^ 0xffffffff) == -52) {
                            Class113 class113 = (class68_sub20_sub14.aClass113Array4380[is[i_86_]]);
                            Class68_Sub10 class68_sub10 = ((Class68_Sub10) class113.method1678((long) (Class68_Sub13.anIntArray2924[--i_85_]),
                                    -86));
                            if (class68_sub10 != null) {
                                i_86_ += class68_sub10.anInt2902;
                            }
                            continue;
                        }
                    }
                    boolean bool;
                    if (is[i_86_] == 1) {
                        bool = true;
                    } else {
                        bool = false;
                    }
                    do {
                        if (i_87_ >= 300) {
                            if (i_87_ < 500) {
                                if (i_87_ == 403) {
                                    i_85_ -= 2;
                                    int i_116_ = Class68_Sub13.anIntArray2924[i_85_];
                                    if (i_116_ >= 7) {
                                        i_116_ -= 7;
                                    }
                                    int i_117_ = (Class68_Sub13.anIntArray2924[1 + i_85_]);
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.aClass126_3410.method1772(i_116_, i_117_, -27345);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -405) {
                                    i_85_ -= 2;
                                    int i_118_ = Class68_Sub13.anIntArray2924[i_85_];
                                    int i_119_ = (Class68_Sub13.anIntArray2924[i_85_ + 1]);
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.aClass126_3410.method1769(i_118_, 41, i_119_);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -411) {
                                    boolean bool_120_ = (((Class68_Sub13.anIntArray2924[--i_85_]) ^ 0xffffffff) != -1);
                                    Class68_Sub7.aClass1_Sub6_Sub2_2860.aClass126_3410.method1767(bool_120_, 87);
                                    break;
                                }
                            } else if (((i_87_ ^ 0xffffffff) <= -1001 && i_87_ < 1100) || i_87_ >= 2000 && i_87_ < 2100) {
                                Class45 class45;
                                if (i_87_ >= 2000) {
                                    i_87_ -= 1000;
                                    class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                            (byte) -80));
                                } else {
                                    class45 = (bool ? Class98.aClass45_1720
                                            : Class32.aClass45_563);
                                }
                                if (i_87_ == 1000) {
                                    i_85_ -= 4;
                                    class45.anInt810 = Class68_Sub13.anIntArray2924[i_85_];
                                    class45.anInt914 = (Class68_Sub13.anIntArray2924[i_85_ + 1]);
                                    int i_121_ = (Class68_Sub13.anIntArray2924[2 + i_85_]);
                                    int i_122_ = (Class68_Sub13.anIntArray2924[i_85_ - -3]);
                                    if ((i_121_ ^ 0xffffffff) <= -1) {
                                        if (i_121_ > 5) {
                                            i_121_ = 5;
                                        }
                                    } else {
                                        i_121_ = 0;
                                    }
                                    if (i_122_ >= 0) {
                                        if ((i_122_ ^ 0xffffffff) < -6) {
                                            i_122_ = 5;
                                        }
                                    } else {
                                        i_122_ = 0;
                                    }
                                    class45.aByte904 = (byte) i_121_;
                                    class45.aByte820 = (byte) i_122_;
                                    Class113.method1682(class45, -125);
                                    Class30.method405(-127, class45);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1002) {
                                    i_85_ -= 4;
                                    class45.anInt773 = Class68_Sub13.anIntArray2924[i_85_];
                                    class45.anInt899 = (Class68_Sub13.anIntArray2924[1 + i_85_]);
                                    class45.anInt883 = 0;
                                    class45.anInt793 = 0;
                                    int i_123_ = (Class68_Sub13.anIntArray2924[2 + i_85_]);
                                    int i_124_ = (Class68_Sub13.anIntArray2924[3 + i_85_]);
                                    if ((i_123_ ^ 0xffffffff) > -1) {
                                        i_123_ = 0;
                                    } else if ((i_123_ ^ 0xffffffff) < -5) {
                                        i_123_ = 4;
                                    }
                                    if ((i_124_ ^ 0xffffffff) > -1) {
                                        i_124_ = 0;
                                    } else if ((i_124_ ^ 0xffffffff) < -5) {
                                        i_124_ = 4;
                                    }
                                    class45.aByte779 = (byte) i_123_;
                                    class45.aByte811 = (byte) i_124_;
                                    Class113.method1682(class45, -116);
                                    Class30.method405(-127, class45);
                                    if ((class45.anInt896 ^ 0xffffffff) == -1) {
                                        Class68_Sub13_Sub27.method838(-1, false, class45);
                                    }
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1004) {
                                    boolean bool_125_ = (((Class68_Sub13.anIntArray2924[--i_85_]) ^ 0xffffffff) == -2);
                                    if (!class45.aBoolean764 != !bool_125_) {
                                        class45.aBoolean764 = bool_125_;
                                        Class113.method1682(class45, -125);
                                    }
                                    break;
                                }
                                if (i_87_ == 1004) {
                                    i_85_ -= 2;
                                    class45.anInt849 = Class68_Sub13.anIntArray2924[i_85_];
                                    class45.anInt768 = (Class68_Sub13.anIntArray2924[i_85_ + 1]);
                                    Class113.method1682(class45, -127);
                                    Class30.method405(-126, class45);
                                    if (class45.anInt896 == 0) {
                                        Class68_Sub13_Sub27.method838(-1, false, class45);
                                    }
                                    break;
                                }
                            } else if (((i_87_ ^ 0xffffffff) > -1101 || i_87_ >= 1200) && ((i_87_ ^ 0xffffffff) > -2101 || i_87_ >= 2200)) {
                                if ((i_87_ < 1200 || (i_87_ ^ 0xffffffff) <= -1301) && (i_87_ < 2200 || (i_87_ ^ 0xffffffff) <= -2301)) {
                                    if (((i_87_ ^ 0xffffffff) > -1301 || (i_87_ ^ 0xffffffff) <= -1401) && ((i_87_ ^ 0xffffffff) > -2301 || ((i_87_ ^ 0xffffffff) <= -2401))) {
                                        if (((i_87_ ^ 0xffffffff) <= -1401 && i_87_ < 1500) || ((i_87_ ^ 0xffffffff) <= -2401 && i_87_ < 2500)) {
                                            Class45 class45;
                                            if (i_87_ < 2000) {
                                                class45 = (bool
                                                        ? Class98.aClass45_1720
                                                        : Class32.aClass45_563);
                                            } else {
                                                i_87_ -= 1000;
                                                class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                        (byte) -80));
                                            }
                                            RSString class100 = (Class68_Sub15.stringArray[--i_89_]);
                                            int[] is_126_ = null;
                                            if ((class100.method1590((byte) -114) ^ 0xffffffff) < -1 && ((class100.method1578((class100.method1590((byte) -117)) + -1,
                                                    7178)) ^ 0xffffffff) == -90) {
                                                int i_127_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                                if (i_127_ > 0) {
                                                    is_126_ = new int[i_127_];
                                                    while ((i_127_-- ^ 0xffffffff) < -1) {
                                                        is_126_[i_127_] = (Class68_Sub13.anIntArray2924[--i_85_]);
                                                    }
                                                }
                                                class100 = (class100.method1607(0, (byte) -74,
                                                        -1 + (class100.method1590((byte) -112))));
                                            }
                                            Object[] objects_128_ = (new Object[1 + (class100.method1590((byte) -107))]);
                                            for (int i_129_ = (-1 + objects_128_.length);
                                                 (i_129_ ^ 0xffffffff) <= -2;
                                                 i_129_--) {
                                                if ((class100.method1578(-1 + i_129_, 7178)) != 115) {
                                                    objects_128_[i_129_] = (new Integer(Class68_Sub13.anIntArray2924[--i_85_]));
                                                } else {
                                                    objects_128_[i_129_] = (Class68_Sub15.stringArray[--i_89_]);
                                                }
                                            }
                                            int i_130_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                            if (i_130_ == -1) {
                                                objects_128_ = null;
                                            } else {
                                                objects_128_[0] = new Integer(i_130_);
                                            }
                                            if (i_87_ == 1400) {
                                                class45.anObjectArray788 = objects_128_;
                                            } else if (i_87_ != 1401) {
                                                if ((i_87_ ^ 0xffffffff) == -1403) {
                                                    class45.anObjectArray790 = objects_128_;
                                                } else if (i_87_ != 1403) {
                                                    if ((i_87_ ^ 0xffffffff) != -1405) {
                                                        if (i_87_ == 1405) {
                                                            class45.anObjectArray807 = objects_128_;
                                                        } else if (i_87_ == 1406) {
                                                            class45.anObjectArray806 = objects_128_;
                                                        } else if (i_87_ == 1407) {
                                                            class45.anObjectArray786 = objects_128_;
                                                            class45.anIntArray787 = is_126_;
                                                        } else if ((i_87_ ^ 0xffffffff) != -1409) {
                                                            if ((i_87_ ^ 0xffffffff) == -1410) {
                                                                class45.anObjectArray856 = objects_128_;
                                                            } else if (i_87_ != 1410) {
                                                                if ((i_87_ ^ 0xffffffff) == -1412) {
                                                                    class45.anObjectArray911 = objects_128_;
                                                                } else if (i_87_ == 1412) {
                                                                    class45.anObjectArray838 = objects_128_;
                                                                } else if ((i_87_ ^ 0xffffffff) != -1415) {
                                                                    if ((i_87_ ^ 0xffffffff) == -1416) {
                                                                        class45.anObjectArray861 = objects_128_;
                                                                        class45.anIntArray891 = is_126_;
                                                                    } else if ((i_87_ ^ 0xffffffff) == -1417) {
                                                                        class45.anObjectArray913 = objects_128_;
                                                                    } else if (i_87_ == 1417) {
                                                                        class45.anObjectArray848 = objects_128_;
                                                                    } else if (i_87_ != 1418) {
                                                                        if (i_87_ != 1419) {
                                                                            if (i_87_ == 1420) {
                                                                                class45.anObjectArray843 = objects_128_;
                                                                            } else if (i_87_ != 1421) {
                                                                                if ((i_87_ ^ 0xffffffff) != -1423) {
                                                                                    if ((i_87_ ^ 0xffffffff) != -1424) {
                                                                                        if ((i_87_ ^ 0xffffffff) == -1425) {
                                                                                            class45.anObjectArray770 = objects_128_;
                                                                                        } else if (i_87_ != 1425) {
                                                                                            if (i_87_ == 1426) {
                                                                                                class45.anObjectArray801 = objects_128_;
                                                                                            } else if ((i_87_ ^ 0xffffffff) != -1428) {
                                                                                                if (i_87_ == 1428) {
                                                                                                    class45.anIntArray900 = is_126_;
                                                                                                    class45.anObjectArray875 = objects_128_;
                                                                                                } else if (i_87_ == 1429) {
                                                                                                    class45.anIntArray780 = is_126_;
                                                                                                    class45.anObjectArray835 = objects_128_;
                                                                                                }
                                                                                            } else {
                                                                                                class45.anObjectArray802 = objects_128_;
                                                                                            }
                                                                                        } else {
                                                                                            class45.anObjectArray872 = objects_128_;
                                                                                        }
                                                                                    } else {
                                                                                        class45.anObjectArray897 = objects_128_;
                                                                                    }
                                                                                } else {
                                                                                    class45.anObjectArray874 = objects_128_;
                                                                                }
                                                                            } else {
                                                                                class45.anObjectArray871 = objects_128_;
                                                                            }
                                                                        } else {
                                                                            class45.anObjectArray868 = objects_128_;
                                                                        }
                                                                    } else {
                                                                        class45.anObjectArray812 = objects_128_;
                                                                    }
                                                                } else {
                                                                    class45.anIntArray887 = is_126_;
                                                                    class45.anObjectArray837 = objects_128_;
                                                                }
                                                            } else {
                                                                class45.anObjectArray778 = objects_128_;
                                                            }
                                                        } else {
                                                            class45.anObjectArray878 = objects_128_;
                                                        }
                                                    } else {
                                                        class45.anObjectArray772 = objects_128_;
                                                    }
                                                } else {
                                                    class45.anObjectArray784 = objects_128_;
                                                }
                                            } else {
                                                class45.anObjectArray821 = objects_128_;
                                            }
                                            class45.aBoolean851 = true;
                                            break;
                                        }
                                        if (i_87_ < 1600) {
                                            Class45 class45 = (!bool ? Class32.aClass45_563
                                                    : Class98.aClass45_1720);
                                            if (i_87_ == 1500) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt815;
                                                break;
                                            }
                                            if (i_87_ == 1501) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt903;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1503) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt892;
                                                break;
                                            }
                                            if (i_87_ == 1503) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt873;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1505) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = (!class45.aBoolean764 ? 0
                                                        : 1);
                                                break;
                                            }
                                            if (i_87_ == 1505) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt799;
                                                break;
                                            }
                                        } else if (i_87_ < 1700) {
                                            Class45 class45 = (bool ? Class98.aClass45_1720
                                                    : Class32.aClass45_563);
                                            if (i_87_ == 1600) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt847;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1602) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt818;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1603) {
                                                Class68_Sub15.stringArray[i_89_++] = class45.aRSString_881;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1604) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt888;
                                                break;
                                            }
                                            if (i_87_ == 1604) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt794;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1606) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt762;
                                                break;
                                            }
                                            if (i_87_ == 1606) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt864;
                                                break;
                                            }
                                            if (i_87_ == 1607) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt853;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1609) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt814;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1610) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt775;
                                                break;
                                            }
                                        } else if ((i_87_ ^ 0xffffffff) <= -1801) {
                                            if ((i_87_ ^ 0xffffffff) <= -1901) {
                                                if (i_87_ >= 2600) {
                                                    if ((i_87_ ^ 0xffffffff) <= -2701) {
                                                        if (i_87_ < 2800) {
                                                            if ((i_87_ ^ 0xffffffff) == -2701) {
                                                                Class45 class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                                        (byte) -80));
                                                                Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt798);
                                                                break;
                                                            }
                                                            if (i_87_ == 2701) {
                                                                Class45 class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                                        (byte) -80));
                                                                if ((class45.anInt798) == -1) {
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                } else {
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt915);
                                                                }
                                                                break;
                                                            }
                                                            if ((i_87_ ^ 0xffffffff) == -2703) {
                                                                int i_131_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                                                Class68_Sub3 class68_sub3 = ((Class68_Sub3) (Login.aClass113_1512.method1678((long) i_131_,
                                                                        -62)));
                                                                if (class68_sub3 != null) {
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                } else {
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                }
                                                                break;
                                                            }
                                                            if (i_87_ == 2703) {
                                                                Class45 class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                                        (byte) -80));
                                                                if ((class45.aClass45Array769) == null) {
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                } else {
                                                                    int i_132_ = (class45.aClass45Array769).length;
                                                                    for (int i_133_ = 0;
                                                                         (i_133_ < class45.aClass45Array769.length);
                                                                         i_133_++) {
                                                                        if ((class45.aClass45Array769[i_133_]) == null) {
                                                                            i_132_ = i_133_;
                                                                            break;
                                                                        }
                                                                    }
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_132_;
                                                                }
                                                                break;
                                                            }
                                                            if (i_87_ == 2704 || ((i_87_ ^ 0xffffffff) == -2706)) {
                                                                i_85_ -= 2;
                                                                int i_134_ = (Class68_Sub13.anIntArray2924[1 + i_85_]);
                                                                int i_135_ = (Class68_Sub13.anIntArray2924[i_85_]);
                                                                Class68_Sub3 class68_sub3 = ((Class68_Sub3) (Login.aClass113_1512.method1678((long) i_135_,
                                                                        95)));
                                                                if ((class68_sub3 == null) || ((i_134_ ^ 0xffffffff) != (class68_sub3.anInt2803 ^ 0xffffffff))) {
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                } else {
                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                }
                                                                break;
                                                            }
                                                        } else if (i_87_ >= 2900) {
                                                            if (i_87_ >= 3200) {
                                                                if (i_87_ < 3300) {
                                                                    if ((i_87_ ^ 0xffffffff) == -3201) {
                                                                        i_85_ -= 3;
                                                                        Class57.method575((byte) -35,
                                                                                Class68_Sub13.anIntArray2924[2 + i_85_],
                                                                                Class68_Sub13.anIntArray2924[1 + i_85_],
                                                                                Class68_Sub13.anIntArray2924[i_85_]);
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3202) {
                                                                        Class1_Sub1.method63(86,
                                                                                Class68_Sub13.anIntArray2924[--i_85_]);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3202) {
                                                                        i_85_ -= 2;
                                                                        Class68_Sub13_Sub28.method844((byte) 106,
                                                                                Class68_Sub13.anIntArray2924[1 + i_85_],
                                                                                Class68_Sub13.anIntArray2924[i_85_]);
                                                                        break;
                                                                    }
                                                                } else if (i_87_ >= 3400) {
                                                                    if (i_87_ >= 3500) {
                                                                        if ((i_87_ ^ 0xffffffff) <= -3701) {
                                                                            if (i_87_ < 4000) {
                                                                                if ((i_87_ ^ 0xffffffff) == -3904) {
                                                                                    int i_136_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class63.aClass49Array1171[i_136_].method523(8);
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3904) {
                                                                                    int i_137_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class63.aClass49Array1171[i_137_].anInt964;
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -3906) {
                                                                                    int i_138_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class63.aClass49Array1171[i_138_].anInt977;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3906) {
                                                                                    int i_139_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class63.aClass49Array1171[i_139_].anInt968;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3907) {
                                                                                    int i_140_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class63.aClass49Array1171[i_140_].anInt972;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3908) {
                                                                                    int i_141_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class63.aClass49Array1171[i_141_].anInt975;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3910) {
                                                                                    int i_142_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    int i_143_ = Class63.aClass49Array1171[i_142_].method522(i ^ 0x7b);
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (i_143_ ^ 0xffffffff) == -1 ? 1 : 0;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3911) {
                                                                                    int i_144_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    int i_145_ = Class63.aClass49Array1171[i_144_].method522(i + -117);
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (i_145_ ^ 0xffffffff) != -3 ? 0 : 1;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3912) {
                                                                                    int i_146_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    int i_147_ = Class63.aClass49Array1171[i_146_].method522(7);
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (i_147_ ^ 0xffffffff) == -6 ? 1 : 0;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 3913) {
                                                                                    int i_148_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    int i_149_ = Class63.aClass49Array1171[i_148_].method522(i ^ 0x7b);
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (i_149_ ^ 0xffffffff) == -2 ? 1 : 0;
                                                                                    break;
                                                                                }
                                                                            } else if (i_87_ >= 4100) {
                                                                                if ((i_87_ ^ 0xffffffff) > -4201) {
                                                                                    if ((i_87_ ^ 0xffffffff) == -4101) {
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        int i_150_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub15.stringArray[i_89_++] = Class68_Sub20_Sub13_Sub2.method1166(2, new RSString[]{class100, Class68_Sub13_Sub24.method816(i_150_, 0)});
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4101) {
                                                                                        i_89_ -= 2;
                                                                                        RSString class100 = Class68_Sub15.stringArray[i_89_];
                                                                                        RSString class100_151_ = Class68_Sub15.stringArray[1 + i_89_];
                                                                                        Class68_Sub15.stringArray[i_89_++] = Class68_Sub20_Sub13_Sub2.method1166(2, new RSString[]{class100, class100_151_});
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4102) {
                                                                                        int i_152_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        Class68_Sub15.stringArray[i_89_++] = Class68_Sub20_Sub13_Sub2.method1166(2, new RSString[]{class100, Class44.method490(true, (byte) 42, i_152_)});
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4103) {
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        Class68_Sub15.stringArray[i_89_++] = class100.method1608((byte) -90);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4105) {
                                                                                        int i_153_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        long l = 1014768000000L + (long) i_153_ * 86400000L;
                                                                                        Class68_Sub13_Sub12.aCalendar3636.setTime(new Date(l));
                                                                                        int i_154_ = Class68_Sub13_Sub12.aCalendar3636.get(5);
                                                                                        int i_155_ = Class68_Sub13_Sub12.aCalendar3636.get(2);
                                                                                        int i_156_ = Class68_Sub13_Sub12.aCalendar3636.get(1);
                                                                                        Class68_Sub15.stringArray[i_89_++] = Class68_Sub20_Sub13_Sub2.method1166(2, new RSString[]{Class68_Sub13_Sub24.method816(i_154_, 0), Class32.aRSString_566, Class50_Sub2.aRSStringArray2740[i_155_], Class32.aRSString_566, Class68_Sub13_Sub24.method816(i_156_, 0)});
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4106) {
                                                                                        i_89_ -= 2;
                                                                                        RSString class100 = Class68_Sub15.stringArray[i_89_];
                                                                                        RSString class100_157_ = Class68_Sub15.stringArray[i_89_ + 1];
                                                                                        if (Class68_Sub7.aClass1_Sub6_Sub2_2860.aClass126_3410 == null || !Class68_Sub7.aClass1_Sub6_Sub2_2860.aClass126_3410.aBoolean2196) {
                                                                                            Class68_Sub15.stringArray[i_89_++] = class100;
                                                                                        } else {
                                                                                            Class68_Sub15.stringArray[i_89_++] = class100_157_;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4106) {
                                                                                        int i_158_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub24.method816(i_158_, 0);
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4107) {
                                                                                        i_89_ -= 2;
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub15.stringArray[i_89_].method1601((byte) -39, Class68_Sub15.stringArray[i_89_ + 1]);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4109) {
                                                                                        i_85_ -= 2;
                                                                                        int i_159_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        int i_160_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                        byte[] is_161_ = Class63.aClass21_Sub1_1173.method338(0, i ^ 0x7c, i_160_);
                                                                                        Class68_Sub20_Sub1_Sub1 class68_sub20_sub1_sub1 = new Class68_Sub20_Sub1_Sub1(is_161_);
                                                                                        class68_sub20_sub1_sub1.method1017(Stream.aClass92Array3010, null);
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub1_sub1.method1020(class100, i_159_);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4110) {
                                                                                        i_85_ -= 2;
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        int i_162_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        int i_163_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                        byte[] is_164_ = Class63.aClass21_Sub1_1173.method338(0, 0, i_163_);
                                                                                        Class68_Sub20_Sub1_Sub1 class68_sub20_sub1_sub1 = new Class68_Sub20_Sub1_Sub1(is_164_);
                                                                                        class68_sub20_sub1_sub1.method1017(Stream.aClass92Array3010, null);
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub1_sub1.method1018(class100, i_162_);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4111) {
                                                                                        i_89_ -= 2;
                                                                                        RSString class100 = Class68_Sub15.stringArray[1 + i_89_];
                                                                                        RSString class100_165_ = Class68_Sub15.stringArray[i_89_];
                                                                                        if (Class68_Sub13.anIntArray2924[--i_85_] != 1) {
                                                                                            Class68_Sub15.stringArray[i_89_++] = class100;
                                                                                        } else {
                                                                                            Class68_Sub15.stringArray[i_89_++] = class100_165_;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4112) {
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        Class68_Sub15.stringArray[i_89_++] = Class68_Sub20_Sub1.method1009(class100);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4113) {
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        int i_166_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        if (i_166_ == -1) {
                                                                                            throw new RuntimeException("null char");
                                                                                        }
                                                                                        Class68_Sub15.stringArray[i_89_++] = class100.method1576((byte) 115, i_166_);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4114) {
                                                                                        int i_167_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = !Class68_Sub13_Sub34.method869(i_167_, (byte) -53) ? 0 : 1;
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4115) {
                                                                                        int i_168_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = !Class54.method553(i_168_, 31155) ? 0 : 1;
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4116) {
                                                                                        int i_169_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class94.method1542(122, i_169_) ? 1 : 0;
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4117) {
                                                                                        int i_170_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub9.method739(false, i_170_) ? 1 : 0;
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4117) {
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        if (class100 == null) {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                        } else {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = class100.method1590((byte) -117);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4119) {
                                                                                        i_85_ -= 2;
                                                                                        int i_171_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        int i_172_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                        Class68_Sub15.stringArray[i_89_++] = class100.method1607(i_171_, (byte) -74, i_172_);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4120) {
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        RSString class100_173_ = Class21renamed.method339(i ^ ~0x4a59, class100.method1590((byte) -100));
                                                                                        boolean bool_174_ = false;
                                                                                        for (int i_175_ = 0; class100.method1590((byte) -103) > i_175_; i_175_++) {
                                                                                            int i_176_ = class100.method1578(i_175_, i ^ 0x1c76);
                                                                                            if ((i_176_ ^ 0xffffffff) != -61) {
                                                                                                if ((i_176_ ^ 0xffffffff) == -63) {
                                                                                                    bool_174_ = false;
                                                                                                } else if (!bool_174_) {
                                                                                                    class100_173_.method1588(i_176_, 26011);
                                                                                                }
                                                                                            } else {
                                                                                                bool_174_ = true;
                                                                                            }
                                                                                        }
                                                                                        class100_173_.method1587(true);
                                                                                        Class68_Sub15.stringArray[i_89_++] = class100_173_;
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4121) {
                                                                                        i_85_ -= 2;
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        int i_177_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                        int i_178_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = class100.method1584(i_178_, Class15.method278(i, -125), i_177_);
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4121) {
                                                                                        i_89_ -= 2;
                                                                                        RSString class100 = Class68_Sub15.stringArray[i_89_];
                                                                                        RSString class100_179_ = Class68_Sub15.stringArray[i_89_ - -1];
                                                                                        int i_180_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = class100.method1586((byte) 43, class100_179_, i_180_);
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4122) {
                                                                                        int i_181_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class55.method1721(Class15.method278(i, 125), i_181_);
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4124) {
                                                                                        int i_182_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub7.method728(-1872384500, i_182_);
                                                                                        break;
                                                                                    }
                                                                                } else if (i_87_ < 4300) {
                                                                                    if (i_87_ == 4200) {
                                                                                        int i_183_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub15.stringArray[i_89_++] = Applet_Sub1.method18(-25672, i_183_).aRSString_362;
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4201) {
                                                                                        i_85_ -= 2;
                                                                                        int i_184_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        int i_185_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                        ItemDef class19 = Applet_Sub1.method18(-25672, i_184_);
                                                                                        if ((i_185_ ^ 0xffffffff) <= -2 && i_185_ <= 5 && class19.aRSStringArray369[-1 + i_185_] != null) {
                                                                                            Class68_Sub15.stringArray[i_89_++] = class19.aRSStringArray369[-1 + i_185_];
                                                                                        } else {
                                                                                            Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4202) {
                                                                                        i_85_ -= 2;
                                                                                        int i_186_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        int i_187_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                        ItemDef class19 = Applet_Sub1.method18(-25672, i_186_);
                                                                                        if ((i_187_ ^ 0xffffffff) <= -2 && (i_187_ ^ 0xffffffff) >= -6 && class19.aRSStringArray340[-1 + i_187_] != null) {
                                                                                            Class68_Sub15.stringArray[i_89_++] = class19.aRSStringArray340[i_187_ + -1];
                                                                                        } else {
                                                                                            Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4204) {
                                                                                        int i_188_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Applet_Sub1.method18(i + -25796, i_188_).anInt375;
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4205) {
                                                                                        int i_189_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = (Applet_Sub1.method18(-25672, i_189_).anInt381 ^ 0xffffffff) != -2 ? 0 : 1;
                                                                                        break;
                                                                                    }
                                                                                    if (i_87_ == 4205) {
                                                                                        int i_190_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        ItemDef class19 = Applet_Sub1.method18(-25672, i_190_);
                                                                                        if (class19.anInt385 == -1 && (class19.anInt378 ^ 0xffffffff) <= -1) {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = class19.anInt378;
                                                                                        } else {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = i_190_;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4207) {
                                                                                        int i_191_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        ItemDef class19 = Applet_Sub1.method18(-25672, i_191_);
                                                                                        if (class19.anInt385 < 0 || (class19.anInt378 ^ 0xffffffff) > -1) {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = i_191_;
                                                                                        } else {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = class19.anInt378;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4208) {
                                                                                        int i_192_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = !Applet_Sub1.method18(-25672, i_192_).aBoolean371 ? 0 : 1;
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4209) {
                                                                                        i_85_ -= 2;
                                                                                        int i_193_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        int i_194_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                        Class68_Sub20_Sub12 class68_sub20_sub12 = Class13_Sub3.method262(i_194_, 19482);
                                                                                        if (!class68_sub20_sub12.method1155(115)) {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Applet_Sub1.method18(-25672, i_193_).method303(class68_sub20_sub12.anInt4345, (byte) -79, i_194_);
                                                                                        } else {
                                                                                            Class68_Sub15.stringArray[i_89_++] = Applet_Sub1.method18(-25672, i_193_).method312(class68_sub20_sub12.aRSString_4344, (byte) 21, i_194_);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4211) {
                                                                                        int i_195_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                        Class25.method387(true, class100, (i_195_ ^ 0xffffffff) == -2);
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub6.anInt2836;
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4212) {
                                                                                        if (Class13.aShortArray213 == null || (Class68_Sub6.anInt2836 ^ 0xffffffff) >= (Class97.anInt1717 ^ 0xffffffff)) {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = -1;
                                                                                        } else {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class120.method1740(65535, Class13.aShortArray213[Class97.anInt1717++]);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    if ((i_87_ ^ 0xffffffff) == -4213) {
                                                                                        Class97.anInt1717 = 0;
                                                                                        break;
                                                                                    }
                                                                                } else if (i_87_ >= 4400) {
                                                                                    if ((i_87_ ^ 0xffffffff) <= -4501) {
                                                                                        if (i_87_ >= 4600) {
                                                                                            if ((i_87_ ^ 0xffffffff) <= -5101) {
                                                                                                if (i_87_ < 5200) {
                                                                                                    if ((i_87_ ^ 0xffffffff) == -5101) {
                                                                                                        if (!Class128.aBooleanArray2228[86]) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                        } else {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    if ((i_87_ ^ 0xffffffff) == -5102) {
                                                                                                        if (Class128.aBooleanArray2228[82]) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                                                        } else {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    if (i_87_ == 5102) {
                                                                                                        if (!Class128.aBooleanArray2228[81]) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                        } else {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                } else if ((i_87_ ^ 0xffffffff) > -5301) {
                                                                                                    if ((i_87_ ^ 0xffffffff) == -5201) {
                                                                                                        Stream.method943(false, Class68_Sub13.anIntArray2924[--i_85_]);
                                                                                                        break;
                                                                                                    }
                                                                                                    if (i_87_ == 5201) {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub26_Sub1.method834(50);
                                                                                                        break;
                                                                                                    }
                                                                                                    if (i_87_ == 5202) {
                                                                                                        client.method37(Class68_Sub13.anIntArray2924[--i_85_], true);
                                                                                                        break;
                                                                                                    }
                                                                                                    if ((i_87_ ^ 0xffffffff) == -5204) {
                                                                                                        Class72.method1354(Class68_Sub15.stringArray[--i_89_], -1);
                                                                                                        break;
                                                                                                    }
                                                                                                    if (i_87_ == 5204) {
                                                                                                        Class68_Sub15.stringArray[-1 + i_89_] = Class115.method1698(Class68_Sub15.stringArray[-1 + i_89_], 14589);
                                                                                                        break;
                                                                                                    }
                                                                                                    if ((i_87_ ^ 0xffffffff) == -5206) {
                                                                                                        Class68_Sub13_Sub23.method814((byte) 37, Class68_Sub15.stringArray[--i_89_]);
                                                                                                        break;
                                                                                                    }
                                                                                                    if ((i_87_ ^ 0xffffffff) == -5207) {
                                                                                                        int i_196_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                        Class68_Sub20_Sub16 class68_sub20_sub16 = PacketStream.method975(0x3fff & i_196_, 0x3fff & i_196_ >> 1057347278, 111);
                                                                                                        if (class68_sub20_sub16 == null) {
                                                                                                            Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                                        } else {
                                                                                                            Class68_Sub15.stringArray[i_89_++] = class68_sub20_sub16.aRSString_4412;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    if ((i_87_ ^ 0xffffffff) == -5208) {
                                                                                                        Class68_Sub20_Sub16 class68_sub20_sub16 = Class68_Sub13_Sub7.method726((byte) -94, Class68_Sub15.stringArray[--i_89_]);
                                                                                                        if (class68_sub20_sub16 != null && class68_sub20_sub16.aRSString_4429 != null) {
                                                                                                            Class68_Sub15.stringArray[i_89_++] = class68_sub20_sub16.aRSString_4429;
                                                                                                        } else {
                                                                                                            Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                } else if ((i_87_ ^ 0xffffffff) <= -5401) {
                                                                                                    if (i_87_ < 5500) {
                                                                                                        if (i_87_ == 5400) {
                                                                                                            Class75_Sub1_Sub1.anInt4578++;
                                                                                                            int i_197_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            i_89_ -= 2;
                                                                                                            RSString class100 = Class68_Sub15.stringArray[i_89_];
                                                                                                            RSString class100_198_ = Class68_Sub15.stringArray[i_89_ + 1];
                                                                                                            Class21renamed.stream.createFrame(161);
                                                                                                            Class21renamed.stream.writeByte(Class13_Sub1.method250(class100, -125) + (Class13_Sub1.method250(class100_198_, -110) + 1));
                                                                                                            Class21renamed.stream.writeString(class100);
                                                                                                            Class21renamed.stream.writeString(class100_198_);
                                                                                                            Class21renamed.stream.writeByte(i_197_);
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5402) {
                                                                                                            i_85_ -= 2;
                                                                                                            Class105.aShortArray1793[Class68_Sub13.anIntArray2924[i_85_]] = (short) Class74.method1382(Class68_Sub13.anIntArray2924[i_85_ + 1], -62);
                                                                                                            Class11.method236(25580);
                                                                                                            Class68_Sub19.method1001((byte) -116);
                                                                                                            GroundData.method449(2);
                                                                                                            Class68_Sub3.method654(i ^ 0x7c);
                                                                                                            Class16.method292((byte) 117);
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5405) {
                                                                                                            i_85_ -= 2;
                                                                                                            int i_199_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                            int i_200_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                            if ((i_200_ ^ 0xffffffff) <= -1 && (i_200_ ^ 0xffffffff) > -3) {
                                                                                                                Class68_Sub13_Sub4.anIntArrayArrayArray3503[i_200_] = new int[i_199_ << -1965131199][4];
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5407) {
                                                                                                            i_85_ -= 7;
                                                                                                            int i_201_ = Class68_Sub13.anIntArray2924[3 + i_85_];
                                                                                                            int i_202_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                            int i_203_ = Class68_Sub13.anIntArray2924[5 + i_85_];
                                                                                                            int i_204_ = Class68_Sub13.anIntArray2924[i_85_ - -4];
                                                                                                            int i_205_ = Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                                                            int i_206_ = Class68_Sub13.anIntArray2924[1 + i_85_] << -1875448415;
                                                                                                            int i_207_ = Class68_Sub13.anIntArray2924[i_85_ + 6];
                                                                                                            if ((i_202_ ^ 0xffffffff) <= -1 && (i_202_ ^ 0xffffffff) > -3 && Class68_Sub13_Sub4.anIntArrayArrayArray3503[i_202_] != null && i_206_ >= 0 && (i_206_ ^ 0xffffffff) > (Class68_Sub13_Sub4.anIntArrayArrayArray3503[i_202_].length ^ 0xffffffff)) {
                                                                                                                Class68_Sub13_Sub4.anIntArrayArrayArray3503[i_202_][i_206_] = new int[]{(Class120.method1740(268426801, i_205_) >> -1456618962) * 128, i_201_, 128 * Class120.method1740(i_205_, 16383), i_207_};
                                                                                                                Class68_Sub13_Sub4.anIntArrayArrayArray3503[i_202_][1 + i_206_] = new int[]{128 * (Class120.method1740(268429292, i_204_) >> -584835538), i_203_, Class120.method1740(16383, i_204_) * 128};
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5408) {
                                                                                                            int i_208_ = Class68_Sub13_Sub4.anIntArrayArrayArray3503[Class68_Sub13.anIntArray2924[--i_85_]].length >> 321129633;
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = i_208_;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5408) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5410) {
                                                                                                            Class58.method582(50);
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5411) {
                                                                                                            if (Class108.aFrame1832 == null) {
                                                                                                                Class1_Sub6_Sub1.method155(Class88.method1492(i ^ ~0x7c), false, -124);
                                                                                                            } else {
                                                                                                                System.exit(0);
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5420) {
                                                                                                            RSString class100 = Class68_Sub13_Sub19.aRSString_3739;
                                                                                                            if (Class68_Sub10.aClass31_2914 != null) {
                                                                                                                class100 = Class1_Sub7.method165(Class68_Sub10.aClass31_2914.port, -17516);
                                                                                                                try {
                                                                                                                    if (Class68_Sub10.aClass31_2914.playerDefSocket != null) {
                                                                                                                        byte[] is_209_ = ((String) Class68_Sub10.aClass31_2914.playerDefSocket).getBytes("ISO-8859-1");
                                                                                                                        class100 = Class68_Sub13_Sub27.method842(is_209_.length, is_209_, 109, 0);
                                                                                                                    }
                                                                                                                } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
                                                                                                                    /* empty */
                                                                                                                }
                                                                                                            }
                                                                                                            Class68_Sub15.stringArray[i_89_++] = class100;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5420) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = (Class20.anInt403 ^ 0xffffffff) == -3 ? 1 : 0;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5422) {
                                                                                                            boolean bool_210_ = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                                            Class1_Sub6_Sub1.method155(Class68_Sub20_Sub13_Sub2.method1166(2, new RSString[]{Class88.method1492(-1), class100}), bool_210_, -127);
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5423) {
                                                                                                            i_89_ -= 2;
                                                                                                            RSString class100 = Class68_Sub15.stringArray[i_89_];
                                                                                                            RSString class100_211_ = Class68_Sub15.stringArray[i_89_ + 1];
                                                                                                            int i_212_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            if (class100.method1590((byte) -108) > 0) {
                                                                                                                if (Class116.aRSStringArray1992 == null) {
                                                                                                                    Class116.aRSStringArray1992 = new RSString[Class15.anIntArray244[Class68_Sub13_Sub34.anInt4008]];
                                                                                                                }
                                                                                                                Class116.aRSStringArray1992[i_212_] = class100;
                                                                                                            }
                                                                                                            if ((class100_211_.method1590((byte) -119) ^ 0xffffffff) < -1) {
                                                                                                                if (Class68_Sub20.aRSStringArray3093 == null) {
                                                                                                                    Class68_Sub20.aRSStringArray3093 = new RSString[Class15.anIntArray244[Class68_Sub13_Sub34.anInt4008]];
                                                                                                                }
                                                                                                                Class68_Sub20.aRSStringArray3093[i_212_] = class100_211_;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                    } else if ((i_87_ ^ 0xffffffff) > -5601) {
                                                                                                        if (i_87_ == 5500) {
                                                                                                            i_85_ -= 4;
                                                                                                            int i_213_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                            int i_214_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                            int i_215_ = Class68_Sub13.anIntArray2924[i_85_ - -3];
                                                                                                            int i_216_ = Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                                                            Class68_Sub13_Sub33.method867(-Class36.anInt643 + (0x3fff & i_213_ >> -1691236562), (i_213_ & 0x3fff) - Class68_Sub13_Sub35.anInt4026, i_215_, i_216_, -127, i_214_, false);
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5501) {
                                                                                                            i_85_ -= 4;
                                                                                                            int i_217_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                            int i_218_ = Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                                                            int i_219_ = Class68_Sub13.anIntArray2924[i_85_ - -3];
                                                                                                            int i_220_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                                            Class68_Sub13_Sub24.method819(i_218_, i_220_, (0x3fff & i_217_ >> -1623542802) - Class36.anInt643, true, -Class68_Sub13_Sub35.anInt4026 + (i_217_ & 0x3fff), i_219_);
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5503) {
                                                                                                            i_85_ -= 6;
                                                                                                            int i_221_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                            if ((i_221_ ^ 0xffffffff) <= -3) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            Class71.anInt1298 = i_221_;
                                                                                                            int i_222_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                                            if (1 + i_222_ >= Class68_Sub13_Sub4.anIntArrayArrayArray3503[Class71.anInt1298].length >> -1588117951) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            Class30.anInt546 = i_222_;
                                                                                                            Canvas_Sub1.anInt48 = 0;
                                                                                                            Class33.anInt577 = Class68_Sub13.anIntArray2924[i_85_ - -2];
                                                                                                            Class68_Sub13_Sub25.anInt3856 = Class68_Sub13.anIntArray2924[3 + i_85_];
                                                                                                            int i_223_ = Class68_Sub13.anIntArray2924[4 + i_85_];
                                                                                                            if (i_223_ >= 2) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            Class84.anInt1535 = i_223_;
                                                                                                            int i_224_ = Class68_Sub13.anIntArray2924[i_85_ + 5];
                                                                                                            if (i_224_ - -1 >= Class68_Sub13_Sub4.anIntArrayArrayArray3503[Class84.anInt1535].length >> -483715711) {
                                                                                                                throw new RuntimeException();
                                                                                                            }
                                                                                                            Class68_Sub13_Sub10.anInt3590 = i_224_;
                                                                                                            Class128.anInt2214 = 3;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5504) {
                                                                                                            Class11.method232(i ^ ~0x2ac4);
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5504) {
                                                                                                            i_85_ -= 2;
                                                                                                            Class16.anInt275 = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                            Class8.anInt163 = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                            Class68_Sub13_Sub20.method799((byte) -121);
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5506) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class16.anInt275;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5506) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class8.anInt163;
                                                                                                            break;
                                                                                                        }
                                                                                                    } else if (i_87_ < 5700) {
                                                                                                        if (i_87_ == 5600) {
                                                                                                            i_89_ -= 2;
                                                                                                            int i_225_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            RSString password = Class68_Sub15.stringArray[1 + i_89_];
                                                                                                            RSString username = Class68_Sub15.stringArray[i_89_];
                                                                                                            if (GameException.anInt2231 == 10) {
                                                                                                                if (Class32.anInt574 == 0 && Class68_Sub13_Sub27.anInt3914 == 0) {
                                                                                                                    Class16.method283(password, i ^ 0x4a, username, i_225_);
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5602) {
                                                                                                            Class13_Sub1.method251(false);
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5603) {
                                                                                                            if ((Class32.anInt574 ^ 0xffffffff) == -1) {
                                                                                                                Class68_Sub20_Sub7.anInt4257 = -2;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5604) {
                                                                                                            i_85_ -= 4;
                                                                                                            if ((GameException.anInt2231 ^ 0xffffffff) == -11) {
                                                                                                                if ((Class32.anInt574 ^ 0xffffffff) == -1 && (Class68_Sub13_Sub27.anInt3914 ^ 0xffffffff) == -1) {
                                                                                                                    Class97.method1560(Class68_Sub13.anIntArray2924[i_85_], Class68_Sub13.anIntArray2924[1 + i_85_], true, Class68_Sub13.anIntArray2924[2 + i_85_], Class68_Sub13.anIntArray2924[3 + i_85_]);
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5604) {
                                                                                                            i_89_--;
                                                                                                            if (GameException.anInt2231 == 10) {
                                                                                                                if ((Class32.anInt574 ^ 0xffffffff) == -1 && (Class68_Sub13_Sub27.anInt3914 ^ 0xffffffff) == -1) {
                                                                                                                    ISAACRandomGen.method1456(-3, Class68_Sub15.stringArray[i_89_].toLong(10908));
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5605) {
                                                                                                            i_89_ -= 2;
                                                                                                            i_85_ -= 4;
                                                                                                            if (GameException.anInt2231 == 10) {
                                                                                                                if ((Class32.anInt574 ^ 0xffffffff) == -1 && (Class68_Sub13_Sub27.anInt3914 ^ 0xffffffff) == -1) {
                                                                                                                    Class74.method1384(Class68_Sub15.stringArray[i_89_].toLong(i ^ 0x2ae0), Class68_Sub13.anIntArray2924[i_85_], i ^ 0x28, Class68_Sub13.anIntArray2924[1 + i_85_], Class68_Sub15.stringArray[i_89_ + 1], Class68_Sub13.anIntArray2924[3 + i_85_], Class68_Sub13.anIntArray2924[i_85_ + 2]);
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5606) {
                                                                                                            if (Class68_Sub13_Sub27.anInt3914 == 0) {
                                                                                                                Class50.anInt980 = -2;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5607) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub7.anInt4257;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 5608) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class36.anInt642;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5610) {
                                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class50.anInt980;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -5611) {
                                                                                                            for (int i_227_ = 0; i_227_ < 5; i_227_++) {
                                                                                                                Class68_Sub15.stringArray[i_89_++] = (Class68_Sub8.aRSStringArray2872.length ^ 0xffffffff) >= (i_227_ ^ 0xffffffff) ? Class68_Sub13_Sub19.aRSString_3739 : Class68_Sub8.aRSStringArray2872[i_227_];
                                                                                                            }
                                                                                                            Class68_Sub8.aRSStringArray2872 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                    } else if ((i_87_ ^ 0xffffffff) <= -6101) {
                                                                                                        if (i_87_ < 6200) {
                                                                                                            if (i_87_ == 6101) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class45.anInt919;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6103) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class28.method398(24781) ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6104) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub2.aBoolean4188 ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6106) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = ISAACRandomGen.aBoolean1487 ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6107) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class1_Sub2.aBoolean2432 ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6107) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = RSString.aBoolean2262 ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6108) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = !Class68_Sub13_Sub2.aBoolean3460 ? 0 : 1;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6110) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = !Class68_Sub22.aBoolean3149 ? 0 : 1;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6111) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub13_Sub2.aBoolean4629 ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6111) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub26.anInt3876;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6112) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = aBoolean4521 ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6114) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = !Class68_Sub6.aBoolean2838 ? 0 : 1;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6116) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = !Class43.aBoolean741 ? 0 : 1;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6116) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class69.anInt1245;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6117) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = !Class74.aBoolean1324 ? 0 : 1;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6119) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class106.anInt1801;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6119) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub25.anInt3855;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6121) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub15.anInt4399;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6122) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6123) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub21.aBoolean3793 ? 1 : 0;
                                                                                                                break;
                                                                                                            }
                                                                                                        } else if ((i_87_ ^ 0xffffffff) <= -6301) {
                                                                                                            if ((i_87_ ^ 0xffffffff) <= -6401) {
                                                                                                                if ((i_87_ ^ 0xffffffff) > -6501) {
                                                                                                                    if ((i_87_ ^ 0xffffffff) == -6401) {
                                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub12.aBoolean3641 ? 1 : 0;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if ((i_87_ ^ 0xffffffff) == -6402) {
                                                                                                                        int i_228_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                                        RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                                                        String string;
                                                                                                                        try {
                                                                                                                            string = new String(class100.method1575((byte) -81), "ISO-8859-1");
                                                                                                                        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
                                                                                                                            string = new String(class100.method1575((byte) -112));
                                                                                                                        }
                                                                                                                        if (Class68_Sub13_Sub12.aBoolean3641) {
                                                                                                                            Class71.anInt1293 = i_228_;
                                                                                                                            Class11.method233(0, -103);
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if (i_87_ == 6402) {
                                                                                                                        Class71.anInt1293 = 0;
                                                                                                                        Class11.method233(0, -116);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if (i_87_ == 6403) {
                                                                                                                        Class68_Sub15.stringArray[i_89_++] = Applet_Sub1.aRSString_31;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if (i_87_ == 6404) {
                                                                                                                        Class68_Sub15.stringArray[i_89_++] = Class13.aRSString_215;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if (i_87_ == 6405) {
                                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class127.method1778(0) ? 1 : 0;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if ((i_87_ ^ 0xffffffff) == -6407) {
                                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = ISAACRandomGen.method1460(-15855) ? 1 : 0;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (i_87_ == 6300) {
                                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (int) (Class36.method438(17161) / 60000L);
                                                                                                                    break;
                                                                                                                }
                                                                                                                if (i_87_ == 6301) {
                                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (int) (Class36.method438(17161) / 86400000L) + -11745;
                                                                                                                    break;
                                                                                                                }
                                                                                                                if ((i_87_ ^ 0xffffffff) == -6303) {
                                                                                                                    i_85_ -= 3;
                                                                                                                    int i_229_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                                    int i_230_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                                    int i_231_ = Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                                                                    Class68_Sub13_Sub12.aCalendar3636.clear();
                                                                                                                    Class68_Sub13_Sub12.aCalendar3636.set(11, 12);
                                                                                                                    Class68_Sub13_Sub12.aCalendar3636.set(i_231_, i_230_, i_229_);
                                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (int) (Class68_Sub13_Sub12.aCalendar3636.getTime().getTime() / 86400000L) + -11745;
                                                                                                                    break;
                                                                                                                }
                                                                                                                if ((i_87_ ^ 0xffffffff) == -6304) {
                                                                                                                    Class68_Sub13_Sub12.aCalendar3636.clear();
                                                                                                                    Class68_Sub13_Sub12.aCalendar3636.setTime(new Date(Class36.method438(17161)));
                                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub12.aCalendar3636.get(1);
                                                                                                                    break;
                                                                                                                }
                                                                                                                if (i_87_ == 6304) {
                                                                                                                    int i_232_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                                    boolean bool_233_ = true;
                                                                                                                    if (i_232_ < 0) {
                                                                                                                        bool_233_ = ((i_232_ + 1) % 4 ^ 0xffffffff) == -1;
                                                                                                                    } else if (i_232_ >= 1582) {
                                                                                                                        if (i_232_ % 4 == 0) {
                                                                                                                            if ((i_232_ % 100 ^ 0xffffffff) == -1) {
                                                                                                                                if (i_232_ % 400 != 0) {
                                                                                                                                    bool_233_ = false;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                bool_233_ = true;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            bool_233_ = false;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        bool_233_ = (i_232_ % 4 ^ 0xffffffff) == -1;
                                                                                                                    }
                                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = bool_233_ ? 1 : 0;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6201) {
                                                                                                                i_85_ -= 2;
                                                                                                                Class68_Sub13_Sub11.aShort3616 = (short) Class68_Sub13.anIntArray2924[i_85_];
                                                                                                                if (Class68_Sub13_Sub11.aShort3616 <= 0) {
                                                                                                                    Class68_Sub13_Sub11.aShort3616 = (short) 256;
                                                                                                                }
                                                                                                                Class68_Sub13_Sub3.aShort3464 = (short) Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                                if (Class68_Sub13_Sub3.aShort3464 <= 0) {
                                                                                                                    Class68_Sub13_Sub3.aShort3464 = (short) 205;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6202) {
                                                                                                                i_85_ -= 2;
                                                                                                                Class1_Sub6_Sub1.aShort3391 = (short) Class68_Sub13.anIntArray2924[i_85_];
                                                                                                                if ((Class1_Sub6_Sub1.aShort3391 ^ 0xffffffff) >= -1) {
                                                                                                                    Class1_Sub6_Sub1.aShort3391 = (short) 256;
                                                                                                                }
                                                                                                                Class48.aShort955 = (short) Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                                if (Class48.aShort955 <= 0) {
                                                                                                                    Class48.aShort955 = (short) 320;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6202) {
                                                                                                                i_85_ -= 4;
                                                                                                                Class68_Sub20.aShort3080 = (short) Class68_Sub13.anIntArray2924[i_85_];
                                                                                                                if (Class68_Sub20.aShort3080 <= 0) {
                                                                                                                    Class68_Sub20.aShort3080 = (short) 1;
                                                                                                                }
                                                                                                                Class75_Sub3_Sub1.aShort4598 = (short) Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                                if (Class75_Sub3_Sub1.aShort4598 <= 0) {
                                                                                                                    Class75_Sub3_Sub1.aShort4598 = (short) 32767;
                                                                                                                } else if (Class68_Sub20.aShort3080 > Class75_Sub3_Sub1.aShort4598) {
                                                                                                                    Class75_Sub3_Sub1.aShort4598 = Class68_Sub20.aShort3080;
                                                                                                                }
                                                                                                                Class68_Sub13_Sub1.aShort3455 = (short) Class68_Sub13.anIntArray2924[i_85_ + 2];
                                                                                                                if ((Class68_Sub13_Sub1.aShort3455 ^ 0xffffffff) >= -1) {
                                                                                                                    Class68_Sub13_Sub1.aShort3455 = (short) 1;
                                                                                                                }
                                                                                                                Class68_Sub13_Sub22.aShort3806 = (short) Class68_Sub13.anIntArray2924[3 + i_85_];
                                                                                                                if ((Class68_Sub13_Sub22.aShort3806 ^ 0xffffffff) >= -1) {
                                                                                                                    Class68_Sub13_Sub22.aShort3806 = (short) 32767;
                                                                                                                } else if (Class68_Sub13_Sub1.aShort3455 > Class68_Sub13_Sub22.aShort3806) {
                                                                                                                    Class68_Sub13_Sub22.aShort3806 = Class68_Sub13_Sub1.aShort3455;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            if ((i_87_ ^ 0xffffffff) == -6204) {
                                                                                                                Class68_Sub13_Sub1.method703(false, Class68_Sub20_Sub17.aClass45_4441.anInt873, 0, Class68_Sub20_Sub17.aClass45_4441.anInt892, -81, 0);
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class34.anInt592;
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub15.anInt4397;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6204) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class1_Sub6_Sub1.aShort3391;
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class48.aShort955;
                                                                                                                break;
                                                                                                            }
                                                                                                            if (i_87_ == 6205) {
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub11.aShort3616;
                                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub3.aShort3464;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (i_87_ == 6001) {
                                                                                                            int i_234_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            if (i_234_ < 1) {
                                                                                                                i_234_ = 1;
                                                                                                            }
                                                                                                            if (i_234_ > 4) {
                                                                                                                i_234_ = 4;
                                                                                                            }
                                                                                                            Class45.anInt919 = i_234_;
                                                                                                            if (Class45.anInt919 == 1) {
                                                                                                                Class62.method614(0.9F);
                                                                                                            }
                                                                                                            if ((Class45.anInt919 ^ 0xffffffff) == -3) {
                                                                                                                Class62.method614(0.8F);
                                                                                                            }
                                                                                                            if (Class45.anInt919 == 3) {
                                                                                                                Class62.method614(0.7F);
                                                                                                            }
                                                                                                            if (Class45.anInt919 == 4) {
                                                                                                                Class62.method614(0.6F);
                                                                                                            }
                                                                                                            Class68_Sub19.method1001((byte) -67);
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6002) {
                                                                                                            Class75_Sub3_Sub1.method1403((Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2, 1);
                                                                                                            Class59.method585((byte) 51);
                                                                                                            client.method34((byte) -68);
                                                                                                            Class107.method1654(-13401);
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6003) {
                                                                                                            Class68_Sub20_Sub2.aBoolean4188 = Class68_Sub13.anIntArray2924[--i_85_] == 1;
                                                                                                            Class107.method1654(i + -13525);
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6005) {
                                                                                                            ISAACRandomGen.aBoolean1487 = Class68_Sub13.anIntArray2924[--i_85_] == 1;
                                                                                                            client.method34((byte) -120);
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6006) {
                                                                                                            Class1_Sub2.aBoolean2432 = Class68_Sub13.anIntArray2924[--i_85_] == 1;
                                                                                                            ((Class90) Class62.anInterface4_1159).method1518((byte) -97, !Class1_Sub2.aBoolean2432);
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6007) {
                                                                                                            RSString.aBoolean2262 = Class68_Sub13.anIntArray2924[--i_85_] == 1;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6008) {
                                                                                                            Class68_Sub13_Sub2.aBoolean3460 = Class68_Sub13.anIntArray2924[--i_85_] == 1;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6009) {
                                                                                                            Class68_Sub22.aBoolean3149 = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -6011) {
                                                                                                            Class68_Sub20_Sub13_Sub2.aBoolean4629 = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -6012) {
                                                                                                            int i_235_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            if (i_235_ < 0 || i_235_ > 2) {
                                                                                                                i_235_ = 0;
                                                                                                            }
                                                                                                            Class68_Sub13_Sub26.anInt3876 = i_235_;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -6013) {
                                                                                                            aBoolean4521 = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            if ((Class45.anInt919 ^ 0xffffffff) == -2) {
                                                                                                                Class62.method614(0.9F);
                                                                                                            }
                                                                                                            if (Class45.anInt919 == 2) {
                                                                                                                Class62.method614(0.8F);
                                                                                                            }
                                                                                                            if (Class45.anInt919 == 3) {
                                                                                                                Class62.method614(0.7F);
                                                                                                            }
                                                                                                            if (Class45.anInt919 == 4) {
                                                                                                                Class62.method614(0.6F);
                                                                                                            }
                                                                                                            client.method34((byte) -103);
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6014) {
                                                                                                            Class68_Sub6.aBoolean2838 = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -6016) {
                                                                                                            Class43.aBoolean741 = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if ((i_87_ ^ 0xffffffff) == -6017) {
                                                                                                            int i_236_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            if ((i_236_ ^ 0xffffffff) > -1 || i_236_ > 2) {
                                                                                                                i_236_ = 0;
                                                                                                            }
                                                                                                            Class69.anInt1245 = i_236_;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6017) {
                                                                                                            Class74.aBoolean1324 = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            Class68_Sub17.method990((byte) 124);
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6018) {
                                                                                                            int i_237_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            if (i_237_ < 0) {
                                                                                                                i_237_ = 0;
                                                                                                            }
                                                                                                            if (i_237_ > 127) {
                                                                                                                i_237_ = 127;
                                                                                                            }
                                                                                                            Class106.anInt1801 = i_237_;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6019) {
                                                                                                            int i_238_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            if (i_238_ < 0) {
                                                                                                                i_238_ = 0;
                                                                                                            }
                                                                                                            if (i_238_ > 255) {
                                                                                                                i_238_ = 255;
                                                                                                            }
                                                                                                            if ((Class68_Sub13_Sub25.anInt3855 ^ 0xffffffff) != (i_238_ ^ 0xffffffff)) {
                                                                                                                if ((Class68_Sub13_Sub25.anInt3855 ^ 0xffffffff) == -1 && Class101.anInt1745 != -1) {
                                                                                                                    Class68_Sub13_Sub38.method899(Class101.anInt1745, Class21renamed.aClass21_Sub1_459, false, 0, i_238_, false);
                                                                                                                    Class123.aBoolean2127 = false;
                                                                                                                } else if (i_238_ == 0) {
                                                                                                                    Class68_Sub13_Sub13.method760(16777215);
                                                                                                                    Class123.aBoolean2127 = false;
                                                                                                                } else {
                                                                                                                    Class78.method1412(i_238_, 0);
                                                                                                                }
                                                                                                                Class68_Sub13_Sub25.anInt3855 = i_238_;
                                                                                                            }
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6020) {
                                                                                                            int i_239_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                            if ((i_239_ ^ 0xffffffff) > -1) {
                                                                                                                i_239_ = 0;
                                                                                                            }
                                                                                                            if ((i_239_ ^ 0xffffffff) < -128) {
                                                                                                                i_239_ = 127;
                                                                                                            }
                                                                                                            Class68_Sub20_Sub15.anInt4399 = i_239_;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class108.aBoolean1830 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6021) {
                                                                                                            Class63.aBoolean1170 = Class68_Sub13.anIntArray2924[--i_85_] == 1;
                                                                                                            Class107.method1654(i ^ ~0x3424);
                                                                                                            break;
                                                                                                        }
                                                                                                        if (i_87_ == 6022) {
                                                                                                            Class68_Sub13_Sub21.aBoolean3793 = (Class68_Sub13.anIntArray2924[--i_85_] ^ 0xffffffff) == -2;
                                                                                                            Class68_Sub20_Sub10.method1115(true, Class75_Sub1_Sub1.signlink);
                                                                                                            Class11.method233(0, -97);
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                } else if ((i_87_ ^ 0xffffffff) == -5307) {
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class71_Sub1.method1344((byte) 97);
                                                                                                    break;
                                                                                                }
                                                                                            } else {
                                                                                                if (i_87_ == 5000) {
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = GroundData.anInt686;
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5002) {
                                                                                                    Class125.anInt2177++;
                                                                                                    i_85_ -= 3;
                                                                                                    GroundData.anInt686 = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    Class68_Sub13_Sub4.anInt3497 = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                    Class68_Sub4.anInt2813 = Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                                                    Class21renamed.stream.createFrame(212);
                                                                                                    Class21renamed.stream.writeByte(GroundData.anInt686);
                                                                                                    Class21renamed.stream.writeByte(Class68_Sub13_Sub4.anInt3497);
                                                                                                    Class21renamed.stream.writeByte(Class68_Sub4.anInt2813);
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5003) {
                                                                                                    Class68_Sub13.anInt2938++;
                                                                                                    i_85_ -= 2;
                                                                                                    int i_240_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                                    int i_241_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                                    Class21renamed.stream.createFrame(159);
                                                                                                    Class21renamed.stream.writeQWord(true, class100.toLong(10908));
                                                                                                    Class21renamed.stream.writeByte(-1 + i_240_);
                                                                                                    Class21renamed.stream.writeByte(i_241_);
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5003) {
                                                                                                    RSString class100 = null;
                                                                                                    int i_242_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    if ((i_242_ ^ 0xffffffff) > -101) {
                                                                                                        class100 = Class55.aRSStringArray2067[i_242_];
                                                                                                    }
                                                                                                    if (class100 == null) {
                                                                                                        class100 = Class68_Sub13_Sub19.aRSString_3739;
                                                                                                    }
                                                                                                    Class68_Sub15.stringArray[i_89_++] = class100;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5004) {
                                                                                                    int i_243_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    int i_244_ = -1;
                                                                                                    if ((i_243_ ^ 0xffffffff) > -101 && Class55.aRSStringArray2067[i_243_] != null) {
                                                                                                        i_244_ = Class68_Sub13_Sub39.anIntArray4098[i_243_];
                                                                                                    }
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_244_;
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5006) {
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub4.anInt3497;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5008) {
                                                                                                    RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                                    if (class100.method1589(Class1_Sub6_Sub2.aRSString_3428, 28)) {
                                                                                                        Class44.method486(class100, (byte) 1);
                                                                                                    } else if (Class68_Sub13_Sub13.anInt3663 != 0 || (Class25.anInt517 ^ 0xffffffff) != -2 && (Class30.anInt552 ^ 0xffffffff) != -2) {
                                                                                                        RSString class100_245_ = class100.method1608((byte) 34);
                                                                                                        Class68_Sub3.anInt2810++;
                                                                                                        int i_246_ = 0;
                                                                                                        int i_247_ = 0;
                                                                                                        if (class100_245_.method1589(Class68_Sub13_Sub3.aRSString_3468, 88)) {
                                                                                                            class100 = class100.method1615(Class68_Sub13_Sub3.aRSString_3468.method1590((byte) -128), true);
                                                                                                            i_246_ = 0;
                                                                                                        } else if (!class100_245_.method1589(Class120.aRSString_2096, 101)) {
                                                                                                            if (class100_245_.method1589(Class1_Sub7.aRSString_2611, 45)) {
                                                                                                                class100 = class100.method1615(Class1_Sub7.aRSString_2611.method1590((byte) -124), true);
                                                                                                                i_246_ = 2;
                                                                                                            } else if (class100_245_.method1589(Class20.aRSString_399, 82)) {
                                                                                                                i_246_ = 3;
                                                                                                                class100 = class100.method1615(Class20.aRSString_399.method1590((byte) -119), true);
                                                                                                            } else if (!class100_245_.method1589(Class55.aRSString_2063, 62)) {
                                                                                                                if (class100_245_.method1589(Class69.aRSString_1259, 51)) {
                                                                                                                    i_246_ = 5;
                                                                                                                    class100 = class100.method1615(Class69.aRSString_1259.method1590((byte) -107), true);
                                                                                                                } else if (class100_245_.method1589(Class68_Sub13_Sub20.aRSString_3783, 83)) {
                                                                                                                    i_246_ = 6;
                                                                                                                    class100 = class100.method1615(Class68_Sub13_Sub20.aRSString_3783.method1590((byte) -117), true);
                                                                                                                } else if (class100_245_.method1589(Class1_Sub6_Sub2.aRSString_3441, 90)) {
                                                                                                                    class100 = class100.method1615(Class1_Sub6_Sub2.aRSString_3441.method1590((byte) -108), true);
                                                                                                                    i_246_ = 7;
                                                                                                                } else if (class100_245_.method1589(Class97.aRSString_1719, i + -96)) {
                                                                                                                    class100 = class100.method1615(Class97.aRSString_1719.method1590((byte) -108), true);
                                                                                                                    i_246_ = 8;
                                                                                                                } else if (class100_245_.method1589(GameException.aRSString_2230, 109)) {
                                                                                                                    i_246_ = 9;
                                                                                                                    class100 = class100.method1615(GameException.aRSString_2230.method1590((byte) -103), true);
                                                                                                                } else if (class100_245_.method1589(Class124.aRSString_2143, 42)) {
                                                                                                                    i_246_ = 10;
                                                                                                                    class100 = class100.method1615(Class124.aRSString_2143.method1590((byte) -96), true);
                                                                                                                } else if (!class100_245_.method1589(Class45.aRSString_923, i ^ 0x8)) {
                                                                                                                    if (Class68_Sub13_Sub27.anInt3915 != 0) {
                                                                                                                        if (class100_245_.method1589(Class68_Sub13_Sub3.aRSString_3472, i + -80)) {
                                                                                                                            class100 = class100.method1615(Class68_Sub13_Sub3.aRSString_3472.method1590((byte) -128), true);
                                                                                                                            i_246_ = 0;
                                                                                                                        } else if (class100_245_.method1589(Class120.aRSString_2092, 103)) {
                                                                                                                            class100 = class100.method1615(Class120.aRSString_2092.method1590((byte) -97), true);
                                                                                                                            i_246_ = 1;
                                                                                                                        } else if (class100_245_.method1589(Class1_Sub7.aRSString_2601, i ^ 0x4)) {
                                                                                                                            i_246_ = 2;
                                                                                                                            class100 = class100.method1615(Class1_Sub7.aRSString_2601.method1590((byte) -112), true);
                                                                                                                        } else if (class100_245_.method1589(Class20.aRSString_400, i ^ 0x1)) {
                                                                                                                            i_246_ = 3;
                                                                                                                            class100 = class100.method1615(Class20.aRSString_400.method1590((byte) -114), true);
                                                                                                                        } else if (class100_245_.method1589(Class55.aRSString_2059, 86)) {
                                                                                                                            i_246_ = 4;
                                                                                                                            class100 = class100.method1615(Class55.aRSString_2059.method1590((byte) -96), true);
                                                                                                                        } else if (!class100_245_.method1589(Class69.aRSString_1236, 108)) {
                                                                                                                            if (!class100_245_.method1589(Class68_Sub13_Sub20.aRSString_3782, i + -24)) {
                                                                                                                                if (class100_245_.method1589(Class1_Sub6_Sub2.aRSString_3440, 37)) {
                                                                                                                                    class100 = class100.method1615(Class1_Sub6_Sub2.aRSString_3440.method1590((byte) -101), true);
                                                                                                                                    i_246_ = 7;
                                                                                                                                } else if (class100_245_.method1589(Class97.aRSString_1716, 66)) {
                                                                                                                                    class100 = class100.method1615(Class97.aRSString_1716.method1590((byte) -98), true);
                                                                                                                                    i_246_ = 8;
                                                                                                                                } else if (class100_245_.method1589(GameException.aRSString_2243, i + -73)) {
                                                                                                                                    i_246_ = 9;
                                                                                                                                    class100 = class100.method1615(GameException.aRSString_2243.method1590((byte) -103), true);
                                                                                                                                } else if (class100_245_.method1589(Class124.aRSString_2163, i ^ 0x5)) {
                                                                                                                                    class100 = class100.method1615(Class124.aRSString_2163.method1590((byte) -120), true);
                                                                                                                                    i_246_ = 10;
                                                                                                                                } else if (class100_245_.method1589(Class45.aRSString_920, 54)) {
                                                                                                                                    i_246_ = 11;
                                                                                                                                    class100 = class100.method1615(Class45.aRSString_920.method1590((byte) -103), true);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i_246_ = 6;
                                                                                                                                class100 = class100.method1615(Class68_Sub13_Sub20.aRSString_3782.method1590((byte) -113), true);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            class100 = class100.method1615(Class69.aRSString_1236.method1590((byte) -98), true);
                                                                                                                            i_246_ = 5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    class100 = class100.method1615(Class45.aRSString_923.method1590((byte) -125), true);
                                                                                                                    i_246_ = 11;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i_246_ = 4;
                                                                                                                class100 = class100.method1615(Class55.aRSString_2063.method1590((byte) -114), true);
                                                                                                            }
                                                                                                        } else {
                                                                                                            i_246_ = 1;
                                                                                                            class100 = class100.method1615(Class120.aRSString_2096.method1590((byte) -104), true);
                                                                                                        }
                                                                                                        class100_245_ = class100.method1608((byte) -118);
                                                                                                        if (class100_245_.method1589(Class68_Sub13_Sub18.aRSString_3728, 99)) {
                                                                                                            i_247_ = 1;
                                                                                                            class100 = class100.method1615(Class68_Sub13_Sub18.aRSString_3728.method1590((byte) -118), true);
                                                                                                        } else if (!class100_245_.method1589(Class68_Sub3.aRSString_2799, i + -89)) {
                                                                                                            if (!class100_245_.method1589(PacketParser.aRSString_1870, i + -16)) {
                                                                                                                if (class100_245_.method1589(Class72_Sub1.aRSString_3271, 82)) {
                                                                                                                    class100 = class100.method1615(Class72_Sub1.aRSString_3271.method1590((byte) -125), true);
                                                                                                                    i_247_ = 4;
                                                                                                                } else if (!class100_245_.method1589(Class74.aRSString_1332, i ^ 0x47)) {
                                                                                                                    if (Class68_Sub13_Sub27.anInt3915 != 0) {
                                                                                                                        if (class100_245_.method1589(Class68_Sub13_Sub18.aRSString_3731, 87)) {
                                                                                                                            i_247_ = 1;
                                                                                                                            class100 = class100.method1615(Class68_Sub13_Sub18.aRSString_3731.method1590((byte) -108), true);
                                                                                                                        } else if (class100_245_.method1589(Class68_Sub3.aRSString_2807, 95)) {
                                                                                                                            i_247_ = 2;
                                                                                                                            class100 = class100.method1615(Class68_Sub3.aRSString_2807.method1590((byte) -98), true);
                                                                                                                        } else if (class100_245_.method1589(PacketParser.aRSString_1867, 76)) {
                                                                                                                            class100 = class100.method1615(PacketParser.aRSString_1867.method1590((byte) -120), true);
                                                                                                                            i_247_ = 3;
                                                                                                                        } else if (class100_245_.method1589(Class72_Sub1.aRSString_3288, 116)) {
                                                                                                                            class100 = class100.method1615(Class72_Sub1.aRSString_3288.method1590((byte) -104), true);
                                                                                                                            i_247_ = 4;
                                                                                                                        } else if (class100_245_.method1589(Class74.aRSString_1338, 92)) {
                                                                                                                            class100 = class100.method1615(Class74.aRSString_1338.method1590((byte) -101), true);
                                                                                                                            i_247_ = 5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    class100 = class100.method1615(Class74.aRSString_1332.method1590((byte) -108), true);
                                                                                                                    i_247_ = 5;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i_247_ = 3;
                                                                                                                class100 = class100.method1615(PacketParser.aRSString_1870.method1590((byte) -101), true);
                                                                                                            }
                                                                                                        } else {
                                                                                                            i_247_ = 2;
                                                                                                            class100 = class100.method1615(Class68_Sub3.aRSString_2799.method1590((byte) -104), true);
                                                                                                        }
                                                                                                        Class21renamed.stream.createFrame(222);
                                                                                                        Class21renamed.stream.writeByte(0);
                                                                                                        int i_248_ = Class21renamed.stream.currentOffset;
                                                                                                        Class21renamed.stream.writeByte(i_246_);
                                                                                                        Class21renamed.stream.writeByte(i_247_);
                                                                                                        Class13_Sub2.method258(Class21renamed.stream, i + -124, class100);
                                                                                                        Class21renamed.stream.method935(-i_248_ + Class21renamed.stream.currentOffset, 119);
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5009) {
                                                                                                    i_89_ -= 2;
                                                                                                    RSString class100 = Class68_Sub15.stringArray[i_89_];
                                                                                                    RSString class100_249_ = Class68_Sub15.stringArray[i_89_ + 1];
                                                                                                    if (Class68_Sub13_Sub13.anInt3663 != 0 || Class25.anInt517 != 1 && Class30.anInt552 != 1) {
                                                                                                        Class68_Sub13_Sub15.anInt3689++;
                                                                                                        Class21renamed.stream.createFrame(178);
                                                                                                        Class21renamed.stream.writeByte(0);
                                                                                                        int i_250_ = Class21renamed.stream.currentOffset;
                                                                                                        Class21renamed.stream.writeQWord(true, class100.toLong(i ^ 0x2ae0));
                                                                                                        Class13_Sub2.method258(Class21renamed.stream, 0, class100_249_);
                                                                                                        Class21renamed.stream.method935(-i_250_ + Class21renamed.stream.currentOffset, 126);
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5010) {
                                                                                                    int i_251_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    RSString class100 = null;
                                                                                                    if ((i_251_ ^ 0xffffffff) > -101) {
                                                                                                        class100 = Class68_Sub13_Sub27.aRSStringArray3916[i_251_];
                                                                                                    }
                                                                                                    if (class100 == null) {
                                                                                                        class100 = Class68_Sub13_Sub19.aRSString_3739;
                                                                                                    }
                                                                                                    Class68_Sub15.stringArray[i_89_++] = class100;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5011) {
                                                                                                    RSString class100 = null;
                                                                                                    int i_252_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    if ((i_252_ ^ 0xffffffff) > -101) {
                                                                                                        class100 = GameSocket.aRSStringArray1139[i_252_];
                                                                                                    }
                                                                                                    if (class100 == null) {
                                                                                                        class100 = Class68_Sub13_Sub19.aRSString_3739;
                                                                                                    }
                                                                                                    Class68_Sub15.stringArray[i_89_++] = class100;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5012) {
                                                                                                    int i_253_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    int i_254_ = -1;
                                                                                                    if (i_253_ < 100) {
                                                                                                        i_254_ = Class68_Sub13_Sub9.anIntArray3582[i_253_];
                                                                                                    }
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_254_;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5015) {
                                                                                                    RSString class100;
                                                                                                    if (Class68_Sub7.aClass1_Sub6_Sub2_2860 == null || Class68_Sub7.aClass1_Sub6_Sub2_2860.aRSString_3414 == null) {
                                                                                                        class100 = Class68_Sub28_Sub2.username;
                                                                                                    } else {
                                                                                                        class100 = Class68_Sub7.aClass1_Sub6_Sub2_2860.method160(i ^ 0xbc4);
                                                                                                    }
                                                                                                    Class68_Sub15.stringArray[i_89_++] = class100;
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5017) {
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub4.anInt2813;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5017) {
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class22.anInt485;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5050) {
                                                                                                    int i_255_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    Class68_Sub15.stringArray[i_89_++] = Class14.method267(true, i_255_).aRSString_4342;
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5052) {
                                                                                                    int i_256_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    Class68_Sub20_Sub11 class68_sub20_sub11 = Class14.method267(true, i_256_);
                                                                                                    if (class68_sub20_sub11.anIntArray4338 != null) {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub11.anIntArray4338.length;
                                                                                                    } else {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5052) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_257_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_258_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                    Class68_Sub20_Sub11 class68_sub20_sub11 = Class14.method267(true, i_257_);
                                                                                                    int i_259_ = class68_sub20_sub11.anIntArray4338[i_258_];
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_259_;
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5054) {
                                                                                                    int i_260_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    Class68_Sub20_Sub11 class68_sub20_sub11 = Class14.method267(true, i_260_);
                                                                                                    if (class68_sub20_sub11.anIntArray4327 == null) {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                    } else {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub11.anIntArray4327.length;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5054) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_261_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_262_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class14.method267(true, i_261_).anIntArray4327[i_262_];
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5055) {
                                                                                                    int i_263_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    Class68_Sub15.stringArray[i_89_++] = Class118.method1731(i_263_, (byte) 103).method1088(91);
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5056) {
                                                                                                    int i_264_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    Class68_Sub20_Sub8 class68_sub20_sub8 = Class118.method1731(i_264_, (byte) 102);
                                                                                                    if (class68_sub20_sub8.anIntArray4277 == null) {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                                    } else {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub8.anIntArray4277.length;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5057) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_265_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_266_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class118.method1731(i_265_, (byte) 108).anIntArray4277[i_266_];
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5059) {
                                                                                                    aClass58_4498 = new Class58();
                                                                                                    aClass58_4498.anInt1089 = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    aClass58_4498.aClass68_Sub20_Sub8_1099 = Class118.method1731(aClass58_4498.anInt1089, (byte) 96);
                                                                                                    aClass58_4498.anIntArray1090 = new int[aClass58_4498.aClass68_Sub20_Sub8_1099.method1080((byte) -121)];
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5059) {
                                                                                                    Class21renamed.stream.createFrame(250);
                                                                                                    Class21renamed.stream.writeByte(0);
                                                                                                    PacketStream.anInt4129++;
                                                                                                    int i_267_ = Class21renamed.stream.currentOffset;
                                                                                                    Class21renamed.stream.writeByte(0);
                                                                                                    Class21renamed.stream.writeWord(aClass58_4498.anInt1089);
                                                                                                    aClass58_4498.aClass68_Sub20_Sub8_1099.method1081(-33, aClass58_4498.anIntArray1090, Class21renamed.stream);
                                                                                                    Class21renamed.stream.method935(-i_267_ + Class21renamed.stream.currentOffset, 125);
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5061) {
                                                                                                    Class105.anInt1797++;
                                                                                                    RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                                    Class21renamed.stream.createFrame(78);
                                                                                                    Class21renamed.stream.writeByte(0);
                                                                                                    int i_268_ = Class21renamed.stream.currentOffset;
                                                                                                    Class21renamed.stream.writeQWord(true, class100.toLong(10908));
                                                                                                    Class21renamed.stream.writeWord(aClass58_4498.anInt1089);
                                                                                                    aClass58_4498.aClass68_Sub20_Sub8_1099.method1081(-94, aClass58_4498.anIntArray1090, Class21renamed.stream);
                                                                                                    Class21renamed.stream.method935(Class21renamed.stream.currentOffset - i_268_, 120);
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5061) {
                                                                                                    PacketStream.anInt4129++;
                                                                                                    Class21renamed.stream.createFrame(250);
                                                                                                    Class21renamed.stream.writeByte(0);
                                                                                                    int i_269_ = Class21renamed.stream.currentOffset;
                                                                                                    Class21renamed.stream.writeByte(1);
                                                                                                    Class21renamed.stream.writeWord(aClass58_4498.anInt1089);
                                                                                                    aClass58_4498.aClass68_Sub20_Sub8_1099.method1081(-90, aClass58_4498.anIntArray1090, Class21renamed.stream);
                                                                                                    Class21renamed.stream.method935(Class21renamed.stream.currentOffset - i_269_, i + 2);
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5062) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_270_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_271_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class14.method267(true, i_270_).anIntArray4326[i_271_];
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5064) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_272_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_273_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class14.method267(true, i_272_).anIntArray4335[i_273_];
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5065) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_274_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                    int i_275_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    if ((i_274_ ^ 0xffffffff) == 0) {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = -1;
                                                                                                    } else {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class14.method267(true, i_275_).method1144(i_274_, 115);
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5065) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_276_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                    int i_277_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    if (i_276_ == -1) {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = -1;
                                                                                                    } else {
                                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class14.method267(true, i_277_).method1139(i_276_, -1);
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5066) {
                                                                                                    int i_278_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class118.method1731(i_278_, (byte) 94).method1080((byte) -38);
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5068) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_279_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_280_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                    int i_281_ = Class118.method1731(i_279_, (byte) 115).method1082(i_280_, (byte) -66);
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_281_;
                                                                                                    break;
                                                                                                }
                                                                                                if (i_87_ == 5068) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_282_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                                    int i_283_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    aClass58_4498.anIntArray1090[i_283_] = i_282_;
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5070) {
                                                                                                    i_85_ -= 2;
                                                                                                    int i_284_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_285_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                                    aClass58_4498.anIntArray1090[i_284_] = i_285_;
                                                                                                    break;
                                                                                                }
                                                                                                if ((i_87_ ^ 0xffffffff) == -5071) {
                                                                                                    i_85_ -= 3;
                                                                                                    int i_286_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                                    int i_287_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                                    int i_288_ = Class68_Sub13.anIntArray2924[i_85_ + 2];
                                                                                                    Class68_Sub20_Sub8 class68_sub20_sub8 = Class118.method1731(i_286_, (byte) 126);
                                                                                                    if ((class68_sub20_sub8.method1082(i_287_, (byte) -66) ^ 0xffffffff) != -1) {
                                                                                                        throw new RuntimeException("bad command");
                                                                                                    }
                                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub8.method1079(i_287_, -20484, i_288_);
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        } else if ((i_87_ ^ 0xffffffff) == -4501) {
                                                                                            i_85_ -= 2;
                                                                                            int i_289_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                            int i_290_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                            Class68_Sub20_Sub12 class68_sub20_sub12 = Class13_Sub3.method262(i_290_, 19482);
                                                                                            if (!class68_sub20_sub12.method1155(115)) {
                                                                                                Class68_Sub13.anIntArray2924[i_85_++] = method1248(i_289_, (byte) -68).method1077(class68_sub20_sub12.anInt4345, Class15.method278(i, 8965), i_290_);
                                                                                            } else {
                                                                                                Class68_Sub15.stringArray[i_89_++] = method1248(i_289_, (byte) -9).method1076(-1, class68_sub20_sub12.aRSString_4344, i_290_);
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    } else if ((i_87_ ^ 0xffffffff) == -4401) {
                                                                                        i_85_ -= 2;
                                                                                        int i_291_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                        int i_292_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                        Class68_Sub20_Sub12 class68_sub20_sub12 = Class13_Sub3.method262(i_291_, 19482);
                                                                                        if (class68_sub20_sub12.method1155(i + -9)) {
                                                                                            Class68_Sub15.stringArray[i_89_++] = Class1_Sub5.method140(84, i_292_).method1705(256, class68_sub20_sub12.aRSString_4344, i_291_);
                                                                                        } else {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class1_Sub5.method140(85, i_292_).method1703((byte) -125, class68_sub20_sub12.anInt4345, i_291_);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                } else if ((i_87_ ^ 0xffffffff) == -4301) {
                                                                                    i_85_ -= 2;
                                                                                    int i_293_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_294_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                    Class68_Sub20_Sub12 class68_sub20_sub12 = Class13_Sub3.method262(i_294_, 19482);
                                                                                    if (class68_sub20_sub12.method1155(115)) {
                                                                                        Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub11.method753(i_293_, -97).method1440(0, class68_sub20_sub12.aRSString_4344, i_294_);
                                                                                    } else {
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub11.method753(i_293_, i + -117).method1442(i_294_, class68_sub20_sub12.anInt4345, Class15.method278(i, -17));
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                if ((i_87_ ^ 0xffffffff) == -4001) {
                                                                                    i_85_ -= 2;
                                                                                    int i_295_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_296_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_296_ + i_295_;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4001) {
                                                                                    i_85_ -= 2;
                                                                                    int i_297_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_298_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_297_ + -i_298_;
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4003) {
                                                                                    i_85_ -= 2;
                                                                                    int i_299_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_300_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_299_ * i_300_;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4003) {
                                                                                    i_85_ -= 2;
                                                                                    int i_301_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_302_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_301_ / i_302_;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4004) {
                                                                                    int i_303_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (int) ((double) i_303_ * Math.random());
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4005) {
                                                                                    int i_304_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (int) ((double) (1 + i_304_) * Math.random());
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4007) {
                                                                                    i_85_ -= 5;
                                                                                    int i_305_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_306_ = Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                                    int i_307_ = Class68_Sub13.anIntArray2924[3 + i_85_];
                                                                                    int i_308_ = Class68_Sub13.anIntArray2924[4 + i_85_];
                                                                                    int i_309_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (i_308_ - i_306_) * (-i_305_ + i_309_) / (-i_306_ + i_307_) + i_305_;
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4008) {
                                                                                    i_85_ -= 2;
                                                                                    long l = (long) Class68_Sub13.anIntArray2924[i_85_];
                                                                                    long l_310_ = (long) Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (int) (l_310_ * l / 100L + l);
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4008) {
                                                                                    i_85_ -= 2;
                                                                                    int i_311_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                    int i_312_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class70.method1335(1 << i_311_, i_312_);
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4009) {
                                                                                    i_85_ -= 2;
                                                                                    int i_313_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_314_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class120.method1740(i_313_, -1 + -(1 << i_314_));
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4011) {
                                                                                    i_85_ -= 2;
                                                                                    int i_315_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_316_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (Class120.method1740(i_315_, 1 << i_316_) ^ 0xffffffff) != -1 ? 1 : 0;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4011) {
                                                                                    i_85_ -= 2;
                                                                                    int i_317_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_318_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_317_ % i_318_;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4012) {
                                                                                    i_85_ -= 2;
                                                                                    int i_319_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                    int i_320_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    if ((i_320_ ^ 0xffffffff) == -1) {
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                    } else {
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = (int) Math.pow((double) i_320_, (double) i_319_);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4014) {
                                                                                    i_85_ -= 2;
                                                                                    int i_321_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_322_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                    if (i_321_ != 0) {
                                                                                        if ((i_322_ ^ 0xffffffff) != -1) {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = (int) Math.pow((double) i_321_, 1.0 / (double) i_322_);
                                                                                        } else {
                                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 2147483647;
                                                                                        }
                                                                                    } else {
                                                                                        Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4015) {
                                                                                    i_85_ -= 2;
                                                                                    int i_323_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_324_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class120.method1740(i_323_, i_324_);
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4016) {
                                                                                    i_85_ -= 2;
                                                                                    int i_325_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                    int i_326_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class70.method1335(i_325_, i_326_);
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4016) {
                                                                                    i_85_ -= 2;
                                                                                    int i_327_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_328_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_327_ >= i_328_ ? i_328_ : i_327_;
                                                                                    break;
                                                                                }
                                                                                if ((i_87_ ^ 0xffffffff) == -4018) {
                                                                                    i_85_ -= 2;
                                                                                    int i_329_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                                    int i_330_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = i_329_ > i_330_ ? i_329_ : i_330_;
                                                                                    break;
                                                                                }
                                                                                if (i_87_ == 4018) {
                                                                                    i_85_ -= 3;
                                                                                    long l = (long) Class68_Sub13.anIntArray2924[i_85_];
                                                                                    long l_331_ = (long) Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                                    long l_332_ = (long) Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = (int) (l * l_331_ / l_332_);
                                                                                    break;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if ((i_87_ ^ 0xffffffff) == -3601) {
                                                                                if ((Class45.anInt917 ^ 0xffffffff) == -1) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = -2;
                                                                                } else if ((Class45.anInt917 ^ 0xffffffff) != -2) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class32.anInt573;
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = -1;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3602) {
                                                                                int i_333_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if ((Class45.anInt917 ^ 0xffffffff) != -3 || i_333_ >= Class32.anInt573) {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                } else {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub38.aRSStringArray4084[i_333_];
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3602) {
                                                                                int i_334_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if ((Class45.anInt917 ^ 0xffffffff) == -3 && (Class32.anInt573 ^ 0xffffffff) < (i_334_ ^ 0xffffffff)) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class98.anIntArray1724[i_334_];
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3603) {
                                                                                int i_335_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class45.anInt917 == 2 && (i_335_ ^ 0xffffffff) > (Class32.anInt573 ^ 0xffffffff)) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub4.anIntArray2828[i_335_];
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3604) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                int i_336_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                PacketStream.method969(class100, -32443, i_336_);
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3606) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                Class68_Sub20_Sub13.method1157((byte) 122, class100.toLong(10908));
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3607) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                Class68_Sub13_Sub15.method766(23136, class100.toLong(10908));
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3607) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                Class51.method536(class100.toLong(10908), (byte) -124);
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3609) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                Class92.method1531(-126, class100.toLong(10908));
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3610) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                if (class100.method1589(Class68_Sub13_Sub25.aRSString_3869, 105) || class100.method1589(Class68_Sub20_Sub13_Sub2.aRSString_4621, i ^ 0x15)) {
                                                                                    class100 = class100.method1615(7, true);
                                                                                }
                                                                                Class68_Sub13.anIntArray2924[i_85_++] = !Class68_Sub13_Sub17.method785(-128, class100) ? 0 : 1;
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3610) {
                                                                                int i_337_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class45.anInt917 != 2 || (Class32.anInt573 ^ 0xffffffff) >= (i_337_ ^ 0xffffffff)) {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                } else {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub1.aRSStringArray2754[i_337_];
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3611) {
                                                                                if (Class69.aRSString_1251 == null) {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                } else {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class69.aRSString_1251.method1597(i + 12564);
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3612) {
                                                                                if (Class69.aRSString_1251 != null) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub8.anInt4278;
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3613) {
                                                                                int i_338_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class69.aRSString_1251 == null || i_338_ >= Class68_Sub20_Sub8.anInt4278) {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                } else {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[i_338_].aRSString_3073.method1597(12688);
                                                                                }
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3615) {
                                                                                int i_339_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class69.aRSString_1251 == null || i_339_ >= Class68_Sub20_Sub8.anInt4278) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[i_339_].anInt3067;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3615) {
                                                                                int i_340_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class69.aRSString_1251 != null && i_340_ < Class68_Sub20_Sub8.anInt4278) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[i_340_].aByte3075;
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3617) {
                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class55.aByte2071;
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3618) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                Class68_Sub13_Sub36.method885((byte) -62, class100);
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3618) {
                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68.aByte1225;
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3620) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                Class107.method1649(-256, class100.toLong(10908));
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3621) {
                                                                                Class68_Sub20_Sub18.method1183((byte) 98);
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3621) {
                                                                                if (Class45.anInt917 != 0) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub26.anInt3880;
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = -1;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if ((i_87_ ^ 0xffffffff) == -3623) {
                                                                                int i_341_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if ((Class45.anInt917 ^ 0xffffffff) == -1 || Class68_Sub13_Sub26.anInt3880 <= i_341_) {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                } else {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class56.method570(Class21_Sub1.aLongArray2703[i_341_], -1).method1597(Class15.method278(i, 12780));
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3623) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                if (class100.method1589(Class68_Sub13_Sub25.aRSString_3869, 81) || class100.method1589(Class68_Sub20_Sub13_Sub2.aRSString_4621, 114)) {
                                                                                    class100 = class100.method1615(7, true);
                                                                                }
                                                                                Class68_Sub13.anIntArray2924[i_85_++] = !Class37.method441(class100, true) ? 0 : 1;
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3624) {
                                                                                int i_342_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630 != null && (i_342_ ^ 0xffffffff) > (Class68_Sub20_Sub8.anInt4278 ^ 0xffffffff) && Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[i_342_].aRSString_3073.method1600(false, Class68_Sub7.aClass1_Sub6_Sub2_2860.aRSString_3414)) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3625) {
                                                                                if (Class90.aRSString_2351 == null) {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                } else {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class90.aRSString_2351.method1597(12688);
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3626) {
                                                                                int i_343_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class69.aRSString_1251 == null || Class68_Sub20_Sub8.anInt4278 <= i_343_) {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub13_Sub19.aRSString_3739;
                                                                                } else {
                                                                                    Class68_Sub15.stringArray[i_89_++] = Class68_Sub20_Sub13_Sub2.aClass68_Sub19Array4630[i_343_].aRSString_3076;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3627) {
                                                                                int i_344_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                                if (Class45.anInt917 != 2 || i_344_ < 0 || (Class32.anInt573 ^ 0xffffffff) >= (i_344_ ^ 0xffffffff)) {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                                } else {
                                                                                    Class68_Sub13.anIntArray2924[i_85_++] = !Class68_Sub13_Sub29.aBooleanArray3941[i_344_] ? 0 : 1;
                                                                                }
                                                                                break;
                                                                            }
                                                                            if (i_87_ == 3628) {
                                                                                RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                                if (class100.method1589(Class68_Sub13_Sub25.aRSString_3869, 59) || class100.method1589(Class68_Sub20_Sub13_Sub2.aRSString_4621, i + -15)) {
                                                                                    class100 = class100.method1615(7, true);
                                                                                }
                                                                                Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub21.method805(31601, class100);
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (i_87_ == 3400) {
                                                                            i_85_ -= 2;
                                                                            int i_345_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                            int i_346_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                            Class68_Sub20_Sub3 class68_sub20_sub3 = Class68_Sub20.method1008(i ^ 0x69, i_346_);
                                                                            Class68_Sub15.stringArray[i_89_++] = class68_sub20_sub3.method1047((byte) -106, i_345_);
                                                                            break;
                                                                        }
                                                                        if ((i_87_ ^ 0xffffffff) == -3409) {
                                                                            i_85_ -= 4;
                                                                            int i_347_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                            int i_348_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                            int i_349_ = Class68_Sub13.anIntArray2924[3 + i_85_];
                                                                            int i_350_ = Class68_Sub13.anIntArray2924[i_85_ - -2];
                                                                            Class68_Sub20_Sub3 class68_sub20_sub3 = Class68_Sub20.method1008(21, i_350_);
                                                                            if (class68_sub20_sub3.anInt4197 != i_348_ || class68_sub20_sub3.anInt4199 != i_347_) {
                                                                                throw new RuntimeException("C3408-1");
                                                                            }
                                                                            if ((i_347_ ^ 0xffffffff) == -116) {
                                                                                Class68_Sub15.stringArray[i_89_++] = class68_sub20_sub3.method1047((byte) -127, i_349_);
                                                                            } else {
                                                                                Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub3.method1054(i_349_, -32511);
                                                                            }
                                                                            break;
                                                                        }
                                                                        if (i_87_ == 3409) {
                                                                            i_85_ -= 3;
                                                                            int i_351_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                            int i_352_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                            int i_353_ = Class68_Sub13.anIntArray2924[2 + i_85_];
                                                                            Class68_Sub20_Sub3 class68_sub20_sub3 = Class68_Sub20.method1008(21, i_351_);
                                                                            if (i_352_ != class68_sub20_sub3.anInt4199) {
                                                                                throw new RuntimeException("C3409-1");
                                                                            }
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = class68_sub20_sub3.method1046((byte) -107, i_353_) ? 1 : 0;
                                                                            break;
                                                                        }
                                                                        if ((i_87_ ^ 0xffffffff) == -3411) {
                                                                            int i_354_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                            RSString class100 = Class68_Sub15.stringArray[--i_89_];
                                                                            Class68_Sub20_Sub3 class68_sub20_sub3 = Class68_Sub20.method1008(21, i_354_);
                                                                            if (class68_sub20_sub3.anInt4199 != 115) {
                                                                                throw new RuntimeException("C3410-1");
                                                                            }
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = !class68_sub20_sub3.method1050(102, class100) ? 0 : 1;
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if ((i_87_ ^ 0xffffffff) == -3301) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub3.anInt2812;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3302) {
                                                                        i_85_ -= 2;
                                                                        int i_355_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                        int i_356_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class50.method533(i_356_, -11143, i_355_);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3302) {
                                                                        i_85_ -= 2;
                                                                        int i_357_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                        int i_358_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub35.method876(i_358_, i_357_, 20558);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3303) {
                                                                        i_85_ -= 2;
                                                                        int i_359_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                        int i_360_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub11.method1148(0, i_359_, i_360_);
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3305) {
                                                                        int i_361_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class125.method1763((byte) 106, i_361_).anInt4181;
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3305) {
                                                                        int i_362_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class30.anIntArray548[i_362_];
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3306) {
                                                                        int i_363_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class88.anIntArray1603[i_363_];
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3307) {
                                                                        int i_364_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class1_Sub5.anIntArray2516[i_364_];
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3309) {
                                                                        int i_365_ = GameSocket.anInt1149;
                                                                        int i_366_ = Class36.anInt643 + (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2561 >> -432924825);
                                                                        int i_367_ = (Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt2537 >> 530465479) - -Class68_Sub13_Sub35.anInt4026;
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = (i_366_ << 774299694) + (i_365_ << -1828576740) - -i_367_;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3310) {
                                                                        int i_368_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class120.method1740(i_368_ >> 839738350, 16383);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3310) {
                                                                        int i_369_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = i_369_ >> -245404036;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3312) {
                                                                        int i_370_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class120.method1740(16383, i_370_);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3312) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = !Class1_Sub7.aBoolean2612 ? 0 : 1;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3314) {
                                                                        i_85_ -= 2;
                                                                        int i_371_ = Class68_Sub13.anIntArray2924[i_85_] + 32768;
                                                                        int i_372_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class50.method533(i_372_, i + -11267, i_371_);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3314) {
                                                                        i_85_ -= 2;
                                                                        int i_373_ = Class68_Sub13.anIntArray2924[i_85_] - -32768;
                                                                        int i_374_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub35.method876(i_374_, i_373_, 20558);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3315) {
                                                                        i_85_ -= 2;
                                                                        int i_375_ = Class68_Sub13.anIntArray2924[i_85_] - -32768;
                                                                        int i_376_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub11.method1148(0, i_376_, i_375_);
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3317) {
                                                                        if ((Class68_Sub13_Sub13.anInt3663 ^ 0xffffffff) > -3) {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                        } else {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub13.anInt3663;
                                                                        }
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3318) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class104.anInt1784;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3319) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class106.anInt1799;
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3321) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub9.anInt4295;
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3322) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class75_Sub3.anInt3330;
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3323) {
                                                                        if ((Class8.anInt160 ^ 0xffffffff) <= -6 && (Class8.anInt160 ^ 0xffffffff) >= -10) {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                        } else {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                        }
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3325) {
                                                                        if ((Class8.anInt160 ^ 0xffffffff) > -6 || (Class8.anInt160 ^ 0xffffffff) < -10) {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                        } else {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = Class8.anInt160;
                                                                        }
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3325) {
                                                                        if ((Class26.anInt519 ^ 0xffffffff) < -1) {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                                                        } else {
                                                                            Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                                        }
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3327) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub7.aClass1_Sub6_Sub2_2860.anInt3415;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3328) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub7.aClass1_Sub6_Sub2_2860.aClass126_3410.aBoolean2196 ? 1 : 0;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3329) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class25.anInt517;
                                                                        break;
                                                                    }
                                                                    if ((i_87_ ^ 0xffffffff) == -3330) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class30.anInt552;
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3330) {
                                                                        int i_377_ = Class68_Sub13.anIntArray2924[--i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub20_Sub3.method1051(2, i_377_);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3331) {
                                                                        i_85_ -= 2;
                                                                        int i_378_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                        int i_379_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class96.method1556(false, i_379_, i_378_, 0);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3332) {
                                                                        i_85_ -= 2;
                                                                        int i_380_ = Class68_Sub13.anIntArray2924[i_85_];
                                                                        int i_381_ = Class68_Sub13.anIntArray2924[i_85_ + 1];
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class96.method1556(true, i_381_, i_380_, 0);
                                                                        break;
                                                                    }
                                                                    if (i_87_ == 3333) {
                                                                        Class68_Sub13.anIntArray2924[i_85_++] = Class68_Sub13_Sub5.anInt3518;
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                if (i_87_ == 3100) {
                                                                    RSString class100 = (Class68_Sub15.stringArray[--i_89_]);
                                                                    Class48.method520((Class68_Sub13_Sub19.aRSString_3739),
                                                                            127,
                                                                            class100,
                                                                            0);
                                                                    break;
                                                                }
                                                                if ((i_87_ ^ 0xffffffff) == -3102) {
                                                                    i_85_ -= 2;
                                                                    Class55.method1720((Class68_Sub13.anIntArray2924[1 + i_85_]),
                                                                            i + -124,
                                                                            (Class68_Sub7.aClass1_Sub6_Sub2_2860),
                                                                            (Class68_Sub13.anIntArray2924[i_85_]));
                                                                    break;
                                                                }
                                                                if (i_87_ == 3103) {
                                                                    Class20.method320(636);
                                                                    break;
                                                                }
                                                                if ((i_87_ ^ 0xffffffff) == -3105) {
                                                                    Class68_Sub13_Sub3.anInt3473++;
                                                                    RSString class100 = (Class68_Sub15.stringArray[--i_89_]);
                                                                    int i_382_ = 0;
                                                                    if (class100.method1621((byte) -111)) {
                                                                        i_382_ = class100.method1619((byte) -62);
                                                                    }
                                                                    Class21renamed.stream.createFrame(43);
                                                                    Class21renamed.stream.writeDWord(i_382_);
                                                                    break;
                                                                }
                                                                if ((i_87_ ^ 0xffffffff) == -3106) {
                                                                    RSString class100 = (Class68_Sub15.stringArray[--i_89_]);
                                                                    Class21renamed.stream.createFrame(189);
                                                                    Class21renamed.stream.writeQWord(true,
                                                                            (class100.toLong(10908)));
                                                                    Class68_Sub20_Sub13.anInt4358++;
                                                                    break;
                                                                }
                                                                if ((i_87_ ^ 0xffffffff) == -3107) {
                                                                    Login.anInt1514++;
                                                                    RSString class100 = (Class68_Sub15.stringArray[--i_89_]);
                                                                    Class21renamed.stream.createFrame(127);
                                                                    Class21renamed.stream.writeByte(
                                                                            1 + class100.method1590((byte) -99));
                                                                    Class21renamed.stream.writeString(
                                                                            class100);
                                                                    break;
                                                                }
                                                                if (i_87_ == 3107) {
                                                                    int i_383_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                                                    RSString class100 = (Class68_Sub15.stringArray[--i_89_]);
                                                                    Class29.method401(0,
                                                                            i_383_,
                                                                            class100);
                                                                    break;
                                                                }
                                                                if (i_87_ == 3108) {
                                                                    i_85_ -= 3;
                                                                    int i_384_ = (Class68_Sub13.anIntArray2924[i_85_]);
                                                                    int i_385_ = (Class68_Sub13.anIntArray2924[(i_85_ - -1)]);
                                                                    int i_386_ = (Class68_Sub13.anIntArray2924[(i_85_ + 2)]);
                                                                    Class45 class45 = (Class68_Sub20_Sub15.method1170(i_386_,
                                                                            (byte) -80));
                                                                    Class91.method1523(i_384_,
                                                                            i_385_,
                                                                            i + -4922,
                                                                            class45);
                                                                    break;
                                                                }
                                                                if (i_87_ == 3109) {
                                                                    i_85_ -= 2;
                                                                    int i_387_ = (Class68_Sub13.anIntArray2924[1 + i_85_]);
                                                                    int i_388_ = (Class68_Sub13.anIntArray2924[i_85_]);
                                                                    Class45 class45 = (bool
                                                                            ? Class98.aClass45_1720
                                                                            : Class32.aClass45_563);
                                                                    Class91.method1523(i_388_,
                                                                            i_387_,
                                                                            i ^ ~0x12c1,
                                                                            class45);
                                                                    break;
                                                                }
                                                                if ((i_87_ ^ 0xffffffff) == -3111) {
                                                                    Class104.anInt1786++;
                                                                    int i_389_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                                                    Class21renamed.stream.createFrame(195);
                                                                    Class21renamed.stream.writeWord(
                                                                            i_389_);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            Class45 class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                                    (byte) -80));
                                                            if (i_87_ == 2800) {
                                                                Class68_Sub13.anIntArray2924[i_85_++] = (Class1_Sub6_Sub2.method164((Class15.method278(i,
                                                                        28)),
                                                                        (client.method41(class45))));
                                                                break;
                                                            }
                                                            if ((i_87_ ^ 0xffffffff) == -2802) {
                                                                int i_390_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                                                i_390_--;
                                                                if (((class45.aRSStringArray823) != null) && ((class45.aRSStringArray823).length > i_390_) && ((class45.aRSStringArray823[i_390_]) != null)) {
                                                                    Class68_Sub15.stringArray[i_89_++] = (class45.aRSStringArray823[i_390_]);
                                                                } else {
                                                                    Class68_Sub15.stringArray[i_89_++] = (Class68_Sub13_Sub19.aRSString_3739);
                                                                }
                                                                break;
                                                            }
                                                            if (i_87_ == 2802) {
                                                                if ((class45.aRSString_890) != null) {
                                                                    Class68_Sub15.stringArray[i_89_++] = (class45.aRSString_890);
                                                                } else {
                                                                    Class68_Sub15.stringArray[i_89_++] = (Class68_Sub13_Sub19.aRSString_3739);
                                                                }
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        Class45 class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                                (byte) -80));
                                                        if (i_87_ == 2600) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt847);
                                                            break;
                                                        }
                                                        if (i_87_ == 2601) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt818);
                                                            break;
                                                        }
                                                        if (i_87_ == 2602) {
                                                            Class68_Sub15.stringArray[i_89_++] = (class45.aRSString_881);
                                                            break;
                                                        }
                                                        if ((i_87_ ^ 0xffffffff) == -2604) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt888);
                                                            break;
                                                        }
                                                        if ((i_87_ ^ 0xffffffff) == -2605) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt794);
                                                            break;
                                                        }
                                                        if ((i_87_ ^ 0xffffffff) == -2606) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt762);
                                                            break;
                                                        }
                                                        if ((i_87_ ^ 0xffffffff) == -2607) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt864);
                                                            break;
                                                        }
                                                        if ((i_87_ ^ 0xffffffff) == -2608) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt853);
                                                            break;
                                                        }
                                                        if (i_87_ == 2608) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt814);
                                                            break;
                                                        }
                                                        if (i_87_ == 2609) {
                                                            Class68_Sub13.anIntArray2924[i_85_++] = (class45.anInt775);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    Class45 class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                            (byte) -80));
                                                    if (i_87_ == 2500) {
                                                        Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt815;
                                                        break;
                                                    }
                                                    if ((i_87_ ^ 0xffffffff) == -2502) {
                                                        Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt903;
                                                        break;
                                                    }
                                                    if (i_87_ == 2502) {
                                                        Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt892;
                                                        break;
                                                    }
                                                    if ((i_87_ ^ 0xffffffff) == -2504) {
                                                        Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt873;
                                                        break;
                                                    }
                                                    if (i_87_ == 2504) {
                                                        Class68_Sub13.anIntArray2924[i_85_++] = (!(class45.aBoolean764)
                                                                ? 0 : 1);
                                                        break;
                                                    }
                                                    if (i_87_ == 2505) {
                                                        Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt799;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Class45 class45 = (bool
                                                        ? Class98.aClass45_1720
                                                        : Class32.aClass45_563);
                                                if (i_87_ == 1800) {
                                                    Class68_Sub13.anIntArray2924[i_85_++] = (Class1_Sub6_Sub2.method164(120,
                                                            (client.method41(class45))));
                                                    break;
                                                }
                                                if ((i_87_ ^ 0xffffffff) == -1802) {
                                                    int i_391_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                                    i_391_--;
                                                    if (((class45.aRSStringArray823) == null) || (i_391_ >= (class45.aRSStringArray823).length) || (class45.aRSStringArray823[i_391_]) == null) {
                                                        Class68_Sub15.stringArray[i_89_++] = (Class68_Sub13_Sub19.aRSString_3739);
                                                    } else {
                                                        Class68_Sub15.stringArray[i_89_++] = (class45.aRSStringArray823[i_391_]);
                                                    }
                                                    break;
                                                }
                                                if ((i_87_ ^ 0xffffffff) == -1803) {
                                                    if (class45.aRSString_890 == null) {
                                                        Class68_Sub15.stringArray[i_89_++] = (Class68_Sub13_Sub19.aRSString_3739);
                                                    } else {
                                                        Class68_Sub15.stringArray[i_89_++] = (class45.aRSString_890);
                                                    }
                                                    break;
                                                }
                                            }
                                        } else {
                                            Class45 class45 = (!bool ? Class32.aClass45_563
                                                    : Class98.aClass45_1720);
                                            if ((i_87_ ^ 0xffffffff) == -1701) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt798;
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1702) {
                                                if (class45.anInt798 == -1) {
                                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                                } else {
                                                    Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt915;
                                                }
                                                break;
                                            }
                                            if ((i_87_ ^ 0xffffffff) == -1703) {
                                                Class68_Sub13.anIntArray2924[i_85_++] = class45.anInt867;
                                                break;
                                            }
                                        }
                                    } else {
                                        Class45 class45;
                                        if ((i_87_ ^ 0xffffffff) > -2001) {
                                            class45 = (!bool ? Class32.aClass45_563
                                                    : Class98.aClass45_1720);
                                        } else {
                                            class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                    (byte) -80));
                                            i_87_ -= 1000;
                                        }
                                        if (i_87_ == 1300) {
                                            int i_392_ = -1 + (Class68_Sub13.anIntArray2924[--i_85_]);
                                            if ((i_392_ ^ 0xffffffff) > -1 || (i_392_ ^ 0xffffffff) < -10) {
                                                i_89_--;
                                            } else {
                                                class45.method496(i_392_,
                                                        (Class68_Sub15.stringArray[--i_89_]),
                                                        0);
                                            }
                                            break;
                                        }
                                        if (i_87_ == 1301) {
                                            i_85_ -= 2;
                                            int i_393_ = (Class68_Sub13.anIntArray2924[i_85_]);
                                            int i_394_ = (Class68_Sub13.anIntArray2924[i_85_ - -1]);
                                            class45.aClass45_893 = Class66.method637(i_393_,
                                                    false,
                                                    i_394_);
                                            break;
                                        }
                                        if (i_87_ == 1302) {
                                            class45.aBoolean766 = (Class68_Sub13.anIntArray2924[--i_85_]) == 1;
                                            break;
                                        }
                                        if ((i_87_ ^ 0xffffffff) == -1304) {
                                            class45.anInt870 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                            break;
                                        }
                                        if ((i_87_ ^ 0xffffffff) == -1305) {
                                            class45.anInt909 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                            break;
                                        }
                                        if ((i_87_ ^ 0xffffffff) == -1306) {
                                            class45.aRSString_890 = (Class68_Sub15.stringArray[--i_89_]);
                                            break;
                                        }
                                        if (i_87_ == 1306) {
                                            class45.aRSString_884 = (Class68_Sub15.stringArray[--i_89_]);
                                            break;
                                        }
                                        if (i_87_ == 1307) {
                                            class45.aRSStringArray823 = null;
                                            break;
                                        }
                                    }
                                } else {
                                    Class45 class45;
                                    if (i_87_ >= 2000) {
                                        i_87_ -= 1000;
                                        class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                                (byte) -80));
                                    } else {
                                        class45 = (!bool ? Class32.aClass45_563
                                                : Class98.aClass45_1720);
                                    }
                                    Class113.method1682(class45, -119);
                                    if ((i_87_ ^ 0xffffffff) == -1201 || i_87_ == 1205) {
                                        i_85_ -= 2;
                                        int i_395_ = (Class68_Sub13.anIntArray2924[i_85_]);
                                        int i_396_ = (Class68_Sub13.anIntArray2924[i_85_ - -1]);
                                        if (i_395_ == -1) {
                                            class45.anInt798 = -1;
                                            class45.anInt803 = -1;
                                            class45.anInt865 = 1;
                                        } else {
                                            class45.anInt798 = i_395_;
                                            class45.anInt915 = i_396_;
                                            ItemDef class19 = Applet_Sub1.method18(-25672,
                                                    i_395_);
                                            class45.anInt864 = class19.anInt389;
                                            if ((i_87_ ^ 0xffffffff) == -1206) {
                                                class45.aBoolean785 = false;
                                            } else {
                                                class45.aBoolean785 = true;
                                            }
                                            class45.anInt781 = class19.anInt358;
                                            class45.anInt853 = class19.anInt355;
                                            class45.anInt762 = class19.anInt336;
                                            class45.anInt814 = class19.anInt395;
                                            if ((class45.anInt793 ^ 0xffffffff) >= -1) {
                                                if ((class45.anInt773 ^ 0xffffffff) < -1) {
                                                    class45.anInt762 = (class45.anInt762 * 32 / class45.anInt773);
                                                }
                                            } else {
                                                class45.anInt762 = (32 * class45.anInt762 / class45.anInt793);
                                            }
                                            class45.anInt842 = class19.anInt391;
                                        }
                                        break;
                                    }
                                    if ((i_87_ ^ 0xffffffff) == -1202) {
                                        class45.anInt865 = 2;
                                        class45.anInt803 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                        break;
                                    }
                                    if ((i_87_ ^ 0xffffffff) == -1203) {
                                        class45.anInt865 = 3;
                                        class45.anInt803 = Class68_Sub7.aClass1_Sub6_Sub2_2860.aClass126_3410.method1774(true);
                                        break;
                                    }
                                    if (i_87_ == 1203) {
                                        class45.anInt865 = 6;
                                        class45.anInt803 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                        break;
                                    }
                                    if ((i_87_ ^ 0xffffffff) == -1205) {
                                        class45.anInt865 = 5;
                                        class45.anInt803 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                        break;
                                    }
                                }
                            } else {
                                Class45 class45;
                                if (i_87_ >= 2000) {
                                    class45 = (Class68_Sub20_Sub15.method1170((Class68_Sub13.anIntArray2924[--i_85_]),
                                            (byte) -80));
                                    i_87_ -= 1000;
                                } else {
                                    class45 = (bool ? Class98.aClass45_1720
                                            : Class32.aClass45_563);
                                }
                                if (i_87_ == 1100) {
                                    i_85_ -= 2;
                                    class45.anInt847 = Class68_Sub13.anIntArray2924[i_85_];
                                    if ((class45.anInt888 - class45.anInt892 ^ 0xffffffff) > (class45.anInt847 ^ 0xffffffff)) {
                                        class45.anInt847 = (class45.anInt888 - class45.anInt892);
                                    }
                                    if ((class45.anInt847 ^ 0xffffffff) > -1) {
                                        class45.anInt847 = 0;
                                    }
                                    class45.anInt818 = (Class68_Sub13.anIntArray2924[1 + i_85_]);
                                    if (-class45.anInt873 + class45.anInt794 < class45.anInt818) {
                                        class45.anInt818 = (-class45.anInt873 + class45.anInt794);
                                    }
                                    if (class45.anInt818 < 0) {
                                        class45.anInt818 = 0;
                                    }
                                    Class113.method1682(class45, i ^ ~0x2);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1102) {
                                    class45.anInt832 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -126);
                                    break;
                                }
                                if (i_87_ == 1102) {
                                    class45.aBoolean866 = (Class68_Sub13.anIntArray2924[--i_85_]) == 1;
                                    Class113.method1682(class45, -118);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1104) {
                                    class45.anInt775 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -124);
                                    break;
                                }
                                if (i_87_ == 1104) {
                                    class45.anInt822 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -119);
                                    break;
                                }
                                if (i_87_ == 1105) {
                                    class45.anInt840 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, i + -241);
                                    break;
                                }
                                if (i_87_ == 1106) {
                                    class45.anInt845 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -121);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1108) {
                                    class45.aBoolean827 = (Class68_Sub13.anIntArray2924[--i_85_]) == 1;
                                    Class113.method1682(class45, -117);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1109) {
                                    class45.anInt865 = 1;
                                    class45.anInt803 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -117);
                                    break;
                                }
                                if (i_87_ == 1109) {
                                    i_85_ -= 6;
                                    class45.anInt781 = Class68_Sub13.anIntArray2924[i_85_];
                                    class45.anInt842 = (Class68_Sub13.anIntArray2924[1 + i_85_]);
                                    class45.anInt864 = (Class68_Sub13.anIntArray2924[2 + i_85_]);
                                    class45.anInt814 = (Class68_Sub13.anIntArray2924[3 + i_85_]);
                                    class45.anInt853 = (Class68_Sub13.anIntArray2924[4 + i_85_]);
                                    class45.anInt762 = (Class68_Sub13.anIntArray2924[i_85_ + 5]);
                                    Class113.method1682(class45, -114);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1111) {
                                    int i_397_ = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    if (class45.anInt831 != i_397_) {
                                        class45.anInt756 = 0;
                                        class45.anInt771 = 0;
                                        class45.anInt831 = i_397_;
                                        Class113.method1682(class45, -126);
                                    }
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1112) {
                                    class45.aBoolean813 = ((Class68_Sub13.anIntArray2924[--i_85_]) ^ 0xffffffff) == -2;
                                    Class113.method1682(class45, i + -240);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1113) {
                                    RSString class100 = (Class68_Sub15.stringArray[--i_89_]);
                                    if (!class100.method1593((class45.aRSString_881),
                                            (byte) 127)) {
                                        class45.aRSString_881 = class100;
                                        Class113.method1682(class45, -119);
                                    }
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1114) {
                                    class45.anInt901 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -126);
                                    break;
                                }
                                if (i_87_ == 1114) {
                                    i_85_ -= 3;
                                    class45.anInt777 = Class68_Sub13.anIntArray2924[i_85_];
                                    class45.anInt830 = (Class68_Sub13.anIntArray2924[i_85_ + 1]);
                                    class45.anInt789 = (Class68_Sub13.anIntArray2924[i_85_ + 2]);
                                    Class113.method1682(class45, -125);
                                    break;
                                }
                                if (i_87_ == 1115) {
                                    class45.aBoolean761 = (Class68_Sub13.anIntArray2924[--i_85_]) == 1;
                                    Class113.method1682(class45, -121);
                                    break;
                                }
                                if (i_87_ == 1116) {
                                    class45.anInt859 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -126);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1118) {
                                    class45.anInt906 = (Class68_Sub13.anIntArray2924[--i_85_]);
                                    Class113.method1682(class45, -126);
                                    break;
                                }
                                if (i_87_ == 1118) {
                                    class45.aBoolean819 = ((Class68_Sub13.anIntArray2924[--i_85_]) ^ 0xffffffff) == -2;
                                    Class113.method1682(class45, -128);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1120) {
                                    class45.aBoolean825 = ((Class68_Sub13.anIntArray2924[--i_85_]) ^ 0xffffffff) == -2;
                                    Class113.method1682(class45, -125);
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1121) {
                                    i_85_ -= 2;
                                    class45.anInt888 = Class68_Sub13.anIntArray2924[i_85_];
                                    class45.anInt794 = (Class68_Sub13.anIntArray2924[1 + i_85_]);
                                    Class113.method1682(class45, -120);
                                    if (class45.anInt896 == 0) {
                                        Class68_Sub13_Sub27.method838(-1, false, class45);
                                    }
                                    break;
                                }
                                if ((i_87_ ^ 0xffffffff) == -1122) {
                                    Class113.method1682(class45, -117);
                                    i_85_ -= 2;
                                    break;
                                }
                                if (i_87_ == 1122) {
                                    class45.aBoolean765 = (Class68_Sub13.anIntArray2924[--i_85_]) == 1;
                                    Class113.method1682(class45, -123);
                                    break;
                                }
                            }
                        } else {
                            if ((i_87_ ^ 0xffffffff) == -101) {
                                i_85_ -= 3;
                                int i_398_ = Class68_Sub13.anIntArray2924[i_85_];
                                int i_399_ = Class68_Sub13.anIntArray2924[i_85_ - -1];
                                int i_400_ = Class68_Sub13.anIntArray2924[2 + i_85_];
                                if (i_399_ == 0) {
                                    throw new RuntimeException();
                                }
                                Class45 class45 = Class68_Sub20_Sub15.method1170(i_398_, (byte) -80);
                                if (class45.aClass45Array769 == null) {
                                    class45.aClass45Array769 = new Class45[1 + i_400_];
                                }
                                if ((class45.aClass45Array769.length ^ 0xffffffff) >= (i_400_ ^ 0xffffffff)) {
                                    Class45[] class45s = new Class45[1 + i_400_];
                                    for (int i_401_ = 0;
                                         (class45.aClass45Array769.length > i_401_);
                                         i_401_++) {
                                        class45s[i_401_] = class45.aClass45Array769[i_401_];
                                    }
                                    class45.aClass45Array769 = class45s;
                                }
                                if ((i_400_ ^ 0xffffffff) < -1 && (class45.aClass45Array769[-1 + i_400_] == null)) {
                                    throw new RuntimeException("Gap at:" + (-1 + i_400_));
                                }
                                Class45 class45_402_ = new Class45();
                                class45_402_.anInt896 = i_399_;
                                class45_402_.anInt799 = class45_402_.anInt792 = class45.anInt792;
                                class45_402_.aBoolean863 = true;
                                class45_402_.anInt867 = i_400_;
                                class45.aClass45Array769[i_400_] = class45_402_;
                                if (!bool) {
                                    Class32.aClass45_563 = class45_402_;
                                } else {
                                    Class98.aClass45_1720 = class45_402_;
                                }
                                Class113.method1682(class45, i ^ ~0x7);
                                break;
                            }
                            if ((i_87_ ^ 0xffffffff) == -102) {
                                Class45 class45 = (bool ? Class98.aClass45_1720
                                        : Class32.aClass45_563);
                                if ((class45.anInt867 ^ 0xffffffff) == 0) {
                                    if (bool) {
                                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                    }
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                Class45 class45_403_ = (Class68_Sub20_Sub15.method1170(class45.anInt792, (byte) -80));
                                class45_403_.aClass45Array769[class45.anInt867] = null;
                                Class113.method1682(class45_403_, -117);
                                break;
                            }
                            if (i_87_ == 102) {
                                Class45 class45 = (Class68_Sub20_Sub15.method1170(Class68_Sub13.anIntArray2924[--i_85_],
                                        (byte) -80));
                                class45.aClass45Array769 = null;
                                Class113.method1682(class45, i ^ ~0xe);
                                break;
                            }
                            if ((i_87_ ^ 0xffffffff) == -201) {
                                i_85_ -= 2;
                                int i_404_ = Class68_Sub13.anIntArray2924[i_85_];
                                int i_405_ = Class68_Sub13.anIntArray2924[1 + i_85_];
                                Class45 class45 = Class66.method637(i_404_, false, i_405_);
                                if (class45 != null && (i_405_ ^ 0xffffffff) != 0) {
                                    Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                    if (!bool) {
                                        Class32.aClass45_563 = class45;
                                    } else {
                                        Class98.aClass45_1720 = class45;
                                    }
                                } else {
                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                }
                                break;
                            }
                            if ((i_87_ ^ 0xffffffff) == -202) {
                                int i_406_ = Class68_Sub13.anIntArray2924[--i_85_];
                                Class45 class45 = Class68_Sub20_Sub15.method1170(i_406_, (byte) -80);
                                if (class45 == null) {
                                    Class68_Sub13.anIntArray2924[i_85_++] = 0;
                                } else {
                                    Class68_Sub13.anIntArray2924[i_85_++] = 1;
                                    if (!bool) {
                                        Class32.aClass45_563 = class45;
                                    } else {
                                        Class98.aClass45_1720 = class45;
                                    }
                                }
                                break;
                            }
                        }
                        throw new IllegalStateException();
                    } while (false);
                }
            } catch (Exception exception) {
                if (class68_sub20_sub14.aRSString_4369 == null) {
                    if ((Class75_Sub3.anInt3328 ^ 0xffffffff) != -1) {
                        Class48.method520(Class68_Sub13_Sub19.aRSString_3739,
                                -92,
                                Class68_Sub20_Sub5.aRSString_4228,
                                0);
                    }
                    Class71.method1339(("CS2 - scr:" + class68_sub20_sub14.aLong1218 + " op:" + i_87_),
                            exception, 38);
                } else {
                    RSString class100 = Class21renamed.method339(-18982, 30);
                    class100.method1618(Class124.aRSString_2154, 12147).method1618(class68_sub20_sub14.aRSString_4369, i ^ 0x2f0f);
                    for (int i_407_ = Class76.anInt1355 + -1; i_407_ >= 0;
                         i_407_--) {
                        class100.method1618(Class68_Sub20_Sub4.aRSString_4219, 12147).method1618((Class68_Sub13_Sub9.aClass43Array3570[i_407_].aClass68_Sub20_Sub14_733.aRSString_4369),
                                12147);
                    }
                    if (i_87_ == 40) {
                        int i_408_ = is[i_86_];
                        class100.method1618(Class68_Sub22.aRSString_3135, 12147).method1618(Class68_Sub13_Sub24.method816(i_408_, 0), 12147);
                    }
                    if ((Class75_Sub3.anInt3328 ^ 0xffffffff) != -1) {
                        Class48.method520(Class68_Sub13_Sub19.aRSString_3739,
                                i ^ ~0x21,
                                (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class59.aRSString_1111,
                                        (class68_sub20_sub14.aRSString_4369)}))),
                                0);
                    }
                    Class71.method1339(("CS2 - scr:" + class68_sub20_sub14.aLong1218 + " op:" + i_87_ + new String(class100.method1575((byte) -79))),
                            exception, 38);
                }
            }
        }
    }

    public void method1261(int i, boolean bool, int i_409_) {
        if (bool == true) {
            anIntArray4465[i] = i_409_;
            anInt4497++;
        }
    }

    public void method1262(boolean bool) {
        anInt4484++;
        if (bool == true) {
            int i = anInt4530;
            int i_410_ = anInt4525;
            long l = aLong4526;
            while (anInt4525 == i_410_) {
                while ((aClass10_4467.anIntArray182[i] ^ 0xffffffff) == (i_410_ ^ 0xffffffff)) {
                    aClass10_4467.method215(i);
                    int i_411_ = aClass10_4467.method226(i);
                    if (i_411_ == 1) {
                        aClass10_4467.method224();
                        aClass10_4467.method225(i);
                        if (aClass10_4467.method228()) {
                            if (aBoolean4529 && (i_410_ ^ 0xffffffff) != -1) {
                                aClass10_4467.method227(l);
                            } else {
                                method1263(15169);
                                aClass10_4467.method220();
                                return;
                            }
                        }
                        break;
                    }
                    if ((i_411_ & 0x80 ^ 0xffffffff) != -1) {
                        method1240(-5420, i_411_);
                    }
                    aClass10_4467.method222(i);
                    aClass10_4467.method225(i);
                }
                i = aClass10_4467.method214();
                i_410_ = aClass10_4467.anIntArray182[i];
                l = aClass10_4467.method223(i_410_);
            }
            aLong4526 = l;
            anInt4525 = i_410_;
            anInt4530 = i;
        }
    }

    public void method1263(int i) {
        method1237(-1, -1);
        anInt4475++;
        if (i != 15169) {
            anInt4496 = -6;
        }
        method1253((byte) -65, -1);
        for (int i_412_ = 0; (i_412_ ^ 0xffffffff) > -17; i_412_++) {
            anIntArray4512[i_412_] = anIntArray4494[i_412_];
        }
        for (int i_413_ = 0; (i_413_ ^ 0xffffffff) > -17; i_413_++) {
            anIntArray4485[i_413_] = Class120.method1740(-128, anIntArray4494[i_413_]);
        }
    }

    public void method1264(int i, int i_414_, byte i_415_) {
        if (i_415_ >= 19) {
            anInt4492++;
            anIntArray4494[i] = i_414_;
            anIntArray4485[i] = Class120.method1740(-128, i_414_);
            method1244(i_414_, i, (byte) -89);
        }
    }

    public Class68_Sub28_Sub1() {
        anIntArray4473 = new int[16];
        anIntArray4495 = new int[16];
        anIntArray4489 = new int[16];
        anIntArray4493 = new int[16];
        anIntArray4501 = new int[16];
        anIntArray4485 = new int[16];
        anIntArray4459 = new int[16];
        anIntArray4512 = new int[16];
        anIntArray4513 = new int[16];
        anInt4496 = 256;
        anIntArray4483 = new int[16];
        anIntArray4522 = new int[16];
        aClass68_Sub26ArrayArray4511 = new Class68_Sub26[16][128];
        anIntArray4524 = new int[16];
        anIntArray4494 = new int[16];
        aClass10_4467 = new Class10();
        aClass68_Sub28_Sub2_4527 = new Class68_Sub28_Sub2(this);
        aClass113_4516 = new Class113(128);
        method1263(15169);
    }


    static {
        aShortArray4471 = new short[500];
        aRSString_4480 = RSString.newRsString("Loading config )2 ");
        aBoolean4521 = true;
        aRSString_4509 = aRSString_4480;
    }
}
