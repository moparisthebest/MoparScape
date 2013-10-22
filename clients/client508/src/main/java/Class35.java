/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

public class Class35 {
    public static Class16 aClass16_602;
    public static int anInt603;
    public int anInt604 = 32;
    public static int anInt605;
    public static Class45 aClass45_606 = null;
    public static int anInt607;
    public static int anInt608;
    public static int anInt609;
    public static int anInt610;
    public static int anInt611;
    public static int anInt612;
    public static int anInt613;
    public static int anInt614;
    public static int anInt615;
    public Class68_Sub28 aClass68_Sub28_616;
    public static int anInt617;
    public static int anInt618;
    public static int anInt619;
    public static int anInt620;
    public static int anInt621;
    public static int anInt622;
    public static Class16 aClass16_623;
    public long aLong624 = Class36.method438(17161);
    public int[] anIntArray625;
    public static int anInt626;
    public boolean aBoolean627 = true;
    public Class68_Sub28[] aClass68_Sub28Array628;
    public int anInt629 = 0;
    public int anInt630;
    public int anInt631;
    public int anInt632;
    public long aLong633 = 0L;
    public int anInt634;
    public Class68_Sub28[] aClass68_Sub28Array635;
    public int anInt636;
    public int anInt637;
    public long aLong638;

    public void method418(boolean bool) {
        if (bool == false) {
            aBoolean627 = true;
            anInt608++;
        }
    }

    public void method419(int[] is, int i) {
        int i_0_ = i;
        if (Class7.aBoolean132)
            i_0_ <<= 1;
        Class39.method463(is, 0, i_0_);
        anInt637 -= i;
        if (aClass68_Sub28_616 != null && anInt637 <= 0) {
            anInt637 += Class93.anInt1660 >> 4;
            Class75_Sub1_Sub1.method1395((byte) -45, aClass68_Sub28_616);
            method429((byte) 88, aClass68_Sub28_616,
                    aClass68_Sub28_616.method1227());
            int i_1_ = 0;
            int i_2_ = 255;
            int i_3_ = 7;
            while_12_:
            while (i_2_ != 0) {
                int i_4_;
                int i_5_;
                if (i_3_ < 0) {
                    i_4_ = i_3_ & 0x3;
                    i_5_ = -(i_3_ >> 2);
                } else {
                    i_4_ = i_3_;
                    i_5_ = 0;
                }
                for (int i_6_ = i_2_ >>> i_4_ & 0x11111111; i_6_ != 0;
                     i_6_ >>>= 4) {
                    if ((i_6_ & 0x1) != 0) {
                        i_2_ &= 1 << i_4_ ^ 0xffffffff;
                        Class68_Sub28 class68_sub28 = null;
                        Class68_Sub28 class68_sub28_7_
                                = aClass68_Sub28Array628[i_4_];
                        while (class68_sub28_7_ != null) {
                            Class68_Sub11 class68_sub11
                                    = class68_sub28_7_.aClass68_Sub11_3225;
                            if (class68_sub11 != null
                                    && class68_sub11.anInt2915 > i_5_) {
                                i_2_ |= 1 << i_4_;
                                class68_sub28 = class68_sub28_7_;
                                class68_sub28_7_
                                        = class68_sub28_7_.aClass68_Sub28_3228;
                            } else {
                                class68_sub28_7_.aBoolean3227 = true;
                                int i_8_ = class68_sub28_7_.method1224();
                                i_1_ += i_8_;
                                if (class68_sub11 != null)
                                    class68_sub11.anInt2915 += i_8_;
                                if (i_1_ >= anInt604)
                                    break while_12_;
                                Class68_Sub28 class68_sub28_9_
                                        = class68_sub28_7_.method1226();
                                if (class68_sub28_9_ != null) {
                                    int i_10_ = class68_sub28_7_.anInt3226;
                                    for (/**/; class68_sub28_9_ != null;
                                             class68_sub28_9_
                                                     = class68_sub28_7_.method1228())
                                        method429((byte) 104, class68_sub28_9_,
                                                (i_10_ * class68_sub28_9_
                                                        .method1227()
                                                        >> 8));
                                }
                                Class68_Sub28 class68_sub28_11_
                                        = class68_sub28_7_.aClass68_Sub28_3228;
                                class68_sub28_7_.aClass68_Sub28_3228 = null;
                                if (class68_sub28 == null)
                                    aClass68_Sub28Array628[i_4_]
                                            = class68_sub28_11_;
                                else
                                    class68_sub28.aClass68_Sub28_3228
                                            = class68_sub28_11_;
                                if (class68_sub28_11_ == null)
                                    aClass68_Sub28Array635[i_4_]
                                            = class68_sub28;
                                class68_sub28_7_ = class68_sub28_11_;
                            }
                        }
                    }
                    i_4_ += 4;
                    i_5_++;
                }
                i_3_--;
            }
            for (int i_12_ = 0; i_12_ < 8; i_12_++) {
                Class68_Sub28 class68_sub28 = aClass68_Sub28Array628[i_12_];
                aClass68_Sub28Array628[i_12_]
                        = aClass68_Sub28Array635[i_12_] = null;
                Class68_Sub28 class68_sub28_13_;
                for (/**/; class68_sub28 != null;
                         class68_sub28 = class68_sub28_13_) {
                    class68_sub28_13_ = class68_sub28.aClass68_Sub28_3228;
                    class68_sub28.aClass68_Sub28_3228 = null;
                }
            }
        }
        if (anInt637 < 0)
            anInt637 = 0;
        if (aClass68_Sub28_616 != null)
            aClass68_Sub28_616.method1225(is, 0, i);
        aLong624 = Class36.method438(17161);
    }

    public void method420() throws Exception {
        anInt612++;
    }

    public void method421(int i, int i_14_) {
        if (i != 2955)
            anInt605 = 58;
        anInt610++;
        anInt637 -= i_14_;
        if ((anInt637 ^ 0xffffffff) > -1)
            anInt637 = 0;
        if (aClass68_Sub28_616 != null)
            aClass68_Sub28_616.method1229(i_14_);
    }

    public int method422() throws Exception {
        anInt618++;
        return anInt636;
    }

    public void method423(int i) throws Exception {
        anInt613++;
    }

    public static void method424(int i, int i_15_, int i_16_, int i_17_,
                                 boolean bool) {
        anInt617++;
        Class79.method1427(i_17_, i, i_17_ + i_16_, i_15_ + i);
        Class79.method1439(i_17_, i, i_16_, i_15_, 0);
        if (Class57.anInt1080 >= 100) {
            if (Animable.aClass68_Sub20_Sub10_59 == null
                    || Animable.aClass68_Sub20_Sub10_59.anInt4309 != i_16_
                    || ((Animable.aClass68_Sub20_Sub10_59.anInt4311 ^ 0xffffffff)
                    != (i_15_ ^ 0xffffffff))) {
                Sprite sprite
                        = new Sprite(i_16_, i_15_);
                Class79.method1432(sprite.pixels,
                        i_16_, i_15_);
                Class68_Sub29.method1323(0, 0, Class103.anInt1768, 0, 0, i_16_,
                        1391070128, i_15_,
                        Class68_Sub6.anInt2846);
                Animable.aClass68_Sub20_Sub10_59 = sprite;
                Class1_Sub5.aClass72_2496.method1358(81);
            }
            Animable.aClass68_Sub20_Sub10_59.method1108(i_17_, i);
            int i_18_
                    = i_17_ + i_16_ * Class25.anInt516 / Class68_Sub6.anInt2846;
            int i_19_ = i - -(Class64.anInt1192 * i_15_ / Class103.anInt1768);
            int i_20_
                    = i_16_ * Class13_Sub4.anInt2687 / Class68_Sub6.anInt2846;
            if (bool != true)
                method424(-12, 24, -51, 5, true);
            int i_21_ = i_15_ * Class1_Sub7.anInt2619 / Class103.anInt1768;
            Class79.method1435(i_18_, i_19_, i_20_, i_21_, 16711680, 128);
            Class79.method1415(i_18_, i_19_, i_20_, i_21_, 16711680);
            if ((Class68_Sub13_Sub36.anInt4033 ^ 0xffffffff) < -1
                    && Class68_Sub13_Sub36.anInt4033 % 10 < 5) {
                for (Class68_Sub8 class68_sub8
                             = ((Class68_Sub8)
                        Class75.aClass16_1343.method293((byte) 76));
                     class68_sub8 != null;
                     class68_sub8 = (Class68_Sub8) Class75.aClass16_1343
                             .method290((byte) 90)) {
                    if ((Class68_Sub13_Sub12.anInt3644 ^ 0xffffffff)
                            == (class68_sub8.anInt2878 ^ 0xffffffff)) {
                        int i_22_ = ((class68_sub8.anInt2869 * i_16_
                                / Class68_Sub6.anInt2846)
                                + i_17_);
                        int i_23_ = ((class68_sub8.anInt2875 * i_15_
                                / Class103.anInt1768)
                                + i);
                        Class79.method1439(-2 + i_22_, -2 + i_23_, 4, 4,
                                16776960);
                    }
                }
            }
        }
    }

    public synchronized void method425(boolean bool,
                                       Class68_Sub28 class68_sub28) {
        anInt609++;
        aClass68_Sub28_616 = class68_sub28;
        if (bool != false)
            method419(null, 104);
    }

    public void method426() {
        anInt603++;
    }

    public static void method427(byte i) {
        if (i == -90) {
            aClass16_602 = null;
            aClass16_623 = null;
            aClass45_606 = null;
        }
    }

    public synchronized void method428(byte i) {
        anInt622++;
        aBoolean627 = true;
        if (i == -100) {
            try {
                method434();
            } catch (Exception exception) {
                method426();
                aLong633 = 2000L + Class36.method438(17161);
            }
        }
    }

    public void method429(byte i, Class68_Sub28 class68_sub28, int i_24_) {
        anInt620++;
        int i_25_ = i_24_ >> 1734735941;
        if (i < 4)
            aClass68_Sub28Array635 = null;
        Class68_Sub28 class68_sub28_26_ = aClass68_Sub28Array635[i_25_];
        if (class68_sub28_26_ != null)
            class68_sub28_26_.aClass68_Sub28_3228 = class68_sub28;
        else
            aClass68_Sub28Array628[i_25_] = class68_sub28;
        aClass68_Sub28Array635[i_25_] = class68_sub28;
        class68_sub28.anInt3226 = i_24_;
    }

    public synchronized void method430(byte i) {
        int i_27_ = 101 / ((9 - i) / 44);
        anInt614++;
        if (anIntArray625 != null) {
            long l = Class36.method438(17161);
            try {
                if (aLong633 != 0L) {
                    if (l < aLong633)
                        return;
                    method423(anInt636);
                    aLong633 = 0L;
                    aBoolean627 = true;
                }
                int i_28_ = method422();
                if (-i_28_ + anInt629 > anInt634)
                    anInt634 = anInt629 - i_28_;
                int i_29_ = anInt631 + anInt632;
                if ((256 + i_29_ ^ 0xffffffff) < -16385)
                    i_29_ = 16128;
                if ((anInt636 ^ 0xffffffff) > (256 + i_29_ ^ 0xffffffff)) {
                    anInt636 += 1024;
                    if ((anInt636 ^ 0xffffffff) < -16385)
                        anInt636 = 16384;
                    method426();
                    method423(anInt636);
                    aBoolean627 = true;
                    i_28_ = 0;
                    if (256 + i_29_ > anInt636) {
                        i_29_ = -256 + anInt636;
                        anInt631 = i_29_ + -anInt632;
                    }
                }
                for (/**/; (i_29_ ^ 0xffffffff) < (i_28_ ^ 0xffffffff);
                         i_28_ += 256) {
                    method419(anIntArray625, 256);
                    method420();
                }
                if ((aLong638 ^ 0xffffffffffffffffL)
                        > (l ^ 0xffffffffffffffffL)) {
                    if (aBoolean627)
                        aBoolean627 = false;
                    else {
                        if (anInt634 == 0 && (anInt630 ^ 0xffffffff) == -1) {
                            method426();
                            aLong633 = l + 2000L;
                            return;
                        }
                        anInt631 = Math.min(anInt630, anInt634);
                        anInt630 = anInt634;
                    }
                    anInt634 = 0;
                    aLong638 = 2000L + l;
                }
                anInt629 = i_28_;
            } catch (Exception exception) {
                method426();
                aLong633 = 2000L + l;
            }
            try {
                if ((l ^ 0xffffffffffffffffL)
                        < (500000L + aLong624 ^ 0xffffffffffffffffL))
                    l = aLong624;
                for (/**/;
                         ((l ^ 0xffffffffffffffffL)
                                 < (5000L + aLong624 ^ 0xffffffffffffffffL));
                         aLong624 += (long) (256000 / Class93.anInt1660))
                    method421(2955, 256);
            } catch (Exception exception) {
                aLong624 = l;
            }
        }
    }

    public synchronized void method431(int i) {
        if (Class44.aClass125_742 != null) {
            boolean bool = true;
            for (int i_30_ = 0; i_30_ < 2; i_30_++) {
                if (Class44.aClass125_742.aClass35Array2174[i_30_] == this)
                    Class44.aClass125_742.aClass35Array2174[i_30_] = null;
                if (Class44.aClass125_742.aClass35Array2174[i_30_] != null)
                    bool = false;
            }
            if (bool) {
                Class44.aClass125_742.aBoolean2176 = true;
                while (Class44.aClass125_742.aBoolean2178)
                    Class50.method528(i + -7759449, 50L);
                Class44.aClass125_742 = null;
            }
        }
        anInt615++;
        method426();
        anIntArray625 = null;
        if (i != 7759444)
            aBoolean627 = true;
    }

    public static Class68_Sub20_Sub17 method432(int i, byte i_31_) {
        anInt621++;
        Class68_Sub20_Sub17 class68_sub20_sub17
                = ((Class68_Sub20_Sub17)
                Class11.aClass98_193.method1570(14366, (long) i));
        if (class68_sub20_sub17 != null)
            return class68_sub20_sub17;
        if (i_31_ >= -31)
            method435((byte) 102, null);
        class68_sub20_sub17
                = Class68_Sub13_Sub30.method852(-32, false,
                Class50_Sub2.aClass21_2736, i,
                Class68_Sub13_Sub24.aClass21_3843);
        if (class68_sub20_sub17 != null)
            Class11.aClass98_193.method1568(class68_sub20_sub17, 114,
                    (long) i);
        return class68_sub20_sub17;
    }

    public void method433(Component component) throws Exception {
        anInt611++;
    }

    public void method434() throws Exception {
        anInt619++;
    }

    public static void method435(byte i, Class21renamed class21) {
        anInt607++;
        Class113.anInt1912
                = class21.method335(Class90.aRSString_2355, (byte) -103);
        GameException.anInt2241
                = class21.method335(Class7.aRSString_123, (byte) -117);
        Class50.anInt986
                = class21.method335(Class37.aRSString_650, (byte) -112);
        Class68_Sub20.anInt3089
                = class21.method335(Class68_Sub13_Sub25.aRSString_3851,
                (byte) -83);
        Class68_Sub26.anInt3182
                = class21.method335(Class68_Sub13_Sub29.aRSString_3936,
                (byte) -122);
        Class51.anInt2259
                = class21.method335(Class59.aRSString_1103, (byte) -128);
        Class17.anInt280
                = class21.method335(Class1_Sub6.aRSString_2584, (byte) -104);
        Class68_Sub13_Sub16.anInt3695
                = class21.method335(Class90.aRSString_2341, (byte) -127);
        Class113.anInt1902
                = class21.method335(Class109.aRSString_1837, (byte) -99);
        Class1_Sub5.anInt2500
                = class21.method335(Class68_Sub13_Sub9.aRSString_3580, (byte) -92);
        Class68_Sub8.anInt2876
                = class21.method335(Canvas_Sub1.aRSString_51, (byte) -88);
        Applet_Sub1.anInt16
                = class21.method335(Class68_Sub13_Sub35.aRSString_4021,
                (byte) -117);
        Class68_Sub13_Sub38.anInt4082
                = class21.method335(Class68_Sub13.aRSString_2928, (byte) -106);
        Class68_Sub13_Sub27.anInt3891
                = class21.method335(Class59.aRSString_1112, (byte) -86);
        Class68_Sub20_Sub14.anInt4378
                = class21.method335(Class91.aRSString_1641, (byte) -112);
        Class15.anInt252
                = class21.method335(Class85.aRSString_1550, (byte) -128);
        class21.method335(Class68_Sub13_Sub27.aRSString_3901, (byte) -127);
        if (i != 105)
            method424(95, -83, 14, -46, false);
        Class97.anInt1712
                = class21.method335(Class22.aRSString_488, (byte) -82);
        Class97.anInt1706
                = class21.method335(Class55.aRSString_2064, (byte) -106);
    }

    public Class35() {
        aClass68_Sub28Array628 = new Class68_Sub28[8];
        anInt630 = 0;
        aClass68_Sub28Array635 = new Class68_Sub28[8];
        anInt634 = 0;
        anInt637 = 0;
        aLong638 = 0L;
    }

    static {
        anInt605 = 0;
        aClass16_602 = new Class16();
        anInt626 = 7759444;
        aClass16_623 = new Class16();
    }
}
