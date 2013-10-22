/* RSString - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class RSString implements Interface3 {

    public static Class97 aClass97_2261;
    public static boolean aBoolean2262;
    public static int anInt2263;
    public static int anInt2264;
    public boolean aBoolean2265 = true;
    public static int anInt2266;
    public static int anInt2267;
    public byte[] bytes;
    public static RSString aRSString_2269 = newRsString("Loading wordpack )2 ");
    public static int anInt2270;
    public static int anInt2271;
    public static int anInt2272;
    public static int anInt2273;
    public static int anInt2274;
    public static int anInt2275;
    public static int anInt2276;
    public static int anInt2277;
    public static int anInt2278;
    public static boolean aBoolean2279;
    public static int anInt2280;
    public static int anInt2281;
    public static int anInt2282;
    public static int anInt2283;
    public static int anInt2284;
    public static int anInt2285;
    public static int anInt2286;
    public static int anInt2287;
    public static int anInt2288;
    public static int anInt2289;
    public static int anInt2290;
    public static int anInt2291;
    public static int anInt2292;
    public int anInt2293;
    public static int anInt2294;
    public static int anInt2295;
    public static int anInt2296;
    public static RSString aRSString_2297;
    public static int anInt2298;
    public static int anInt2299;
    public static int anInt2300;
    public static int anInt2301;
    public static int anInt2302;
    public static int anInt2303;
    public static int anInt2304;
    public static RSString aRSString_2305;
    public static int anInt2306;
    public static int anInt2307;
    public int anInt2308;
    public static int anInt2309;
    public static int anInt2310;
    public static int anInt2311;
    public static int anInt2312;
    public static int anInt2313;
    public static int anInt2314;
    public static int anInt2315;
    public static int anInt2316;
    public static RSString aRSString_2317;
    public static int anInt2318;
    public static int anInt2319;
    public static int anInt2320;
    public static int anInt2321;
    public static int anInt2322;
    public static int anInt2323;
    public static int anInt2324;
    public static int anInt2325;
    /*synthetic*/ public static Class aClass2326;

    public static RSString newRsString(String string) {
        byte[] is = string.getBytes();
        Class112.anInt1885++;
        int i_0_ = is.length;
        RSString rsString = new RSString();
        rsString.bytes = new byte[i_0_];
        int i_1_ = 0;
        while (i_0_ > i_1_) {
            int i_2_ = is[i_1_++] & 0xff;
            if (i_2_ > 45 || i_2_ < 40) {
                if ((i_2_ ^ 0xffffffff) != -1)
                    rsString.bytes[rsString.anInt2293++]
                            = (byte) i_2_;
            } else {
                if ((i_1_ ^ 0xffffffff) <= (i_0_ ^ 0xffffffff))
                    break;
                int i_3_ = 0xff & is[i_1_++];
                rsString.bytes[rsString.anInt2293++]
                        = (byte) (i_3_ + (-48 + (i_2_ + -40) * 43));
            }
        }
        rsString.method1587(true);
        return rsString.method1622();
    }

    public RSString method1572(int i, int i_0_, int i_1_,
                               RSString class100_2_) {
        anInt2272++;
        if (!aBoolean2265) {
            throw new IllegalArgumentException();
        }
        if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < (i_0_ ^ 0xffffffff) || i_0_ > class100_2_.anInt2293) {
            throw new IllegalArgumentException();
        }
        anInt2308 = 0;
        if (anInt2293 - (-i_0_ - -i) > bytes.length) {
            int i_3_;
            for (i_3_ = 1; anInt2293 + class100_2_.anInt2293 > i_3_;
                 i_3_ += i_3_) {
                /* empty */
            }
            byte[] is = new byte[i_3_];
            Class39.method465(bytes, 0, is, 0, anInt2293);
            bytes = is;
        }
        Class39.method465(class100_2_.bytes, i, bytes,
                anInt2293, i_0_ + -i);
        anInt2293 += -i + i_0_;
        if (i_1_ != -10000) {
            method1580(-123);
        }
        return this;
    }

    public boolean method1573(RSString class100_4_, boolean bool) {
        anInt2287++;
        if (class100_4_.anInt2293 > anInt2293) {
            return false;
        }
        int i = anInt2293 + -class100_4_.anInt2293;
        for (int i_5_ = 0; class100_4_.anInt2293 > i_5_; i_5_++) {
            if (bytes[i_5_ - -i] != class100_4_.bytes[i_5_]) {
                return false;
            }
        }
        if (bool != true) {
            method1605(60, -108);
        }
        return true;
    }

    public URL method1574(int i) throws MalformedURLException {
        if (i != -16294) {
            method1603(37);
        }
        anInt2311++;
        return new URL(new String(bytes, 0, anInt2293));
    }

    public byte[] method1575(byte i) {
        if (i >= -75) {
            return null;
        }
        byte[] is = new byte[anInt2293];
        Class39.method465(bytes, 0, is, 0, anInt2293);
        anInt2263++;
        return is;
    }

    public RSString method1576(byte i, int i_6_) {
        anInt2266++;
        if (i_6_ <= 0 || i_6_ > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        if (i <= 85) {
            aRSString_2305 = null;
        }
        RSString class100_7_ = new RSString();
        class100_7_.bytes = new byte[anInt2293 + 1];
        class100_7_.anInt2293 = anInt2293 + 1;
        Class39.method465(bytes, 0, class100_7_.bytes, 0,
                anInt2293);
        class100_7_.bytes[anInt2293] = (byte) i_6_;
        return class100_7_;
    }

    public void method1577(byte i) {
        String string;
        try {
            string = new String(bytes, 0, anInt2293, "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
            string = new String(bytes, 0, anInt2293);
        }
        System.out.println(string);
        anInt2270++;
        if (i != 112) {
            method1617(-51, null);
        }
    }

    public int method1578(int i, int i_8_) {
        anInt2276++;
        if (i_8_ != 7178) {
            aRSString_2305 = null;
        }
        return bytes[i] & 0xff;
    }

    public static void method1579(byte i) {
        aRSString_2305 = null;
        aRSString_2317 = null;
        aClass97_2261 = null;
        aRSString_2269 = null;
        aRSString_2297 = null;
        if (i > -107) {
            aBoolean2262 = true;
        }
    }

    public long method1580(int i) {
        long l = 0L;
        for (int i_9_ = 0; i_9_ < anInt2293; i_9_++) {
            l = -l + (l << 718411205) + (long) (0xff & bytes[i_9_]);
        }
        int i_10_ = -68 % ((37 - i) / 45);
        anInt2264++;
        return l;
    }

    public boolean method1581(int i, boolean bool) {
        anInt2294++;
        boolean bool_11_ = false;
        boolean bool_12_ = bool;
        int i_13_ = 0;
        if ((i ^ 0xffffffff) > -2 || i > 36) {
            i = 10;
        }
        for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (anInt2293 ^ 0xffffffff);
             i_14_++) {
            int i_15_ = 0xff & bytes[i_14_];
            if ((i_14_ ^ 0xffffffff) == -1) {
                if (i_15_ == 45) {
                    bool_11_ = true;
                    continue;
                }
                if ((i_15_ ^ 0xffffffff) == -44) {
                    continue;
                }
            }
            if ((i_15_ ^ 0xffffffff) <= -49 && (i_15_ ^ 0xffffffff) >= -58) {
                i_15_ -= 48;
            } else if (i_15_ >= 65 && i_15_ <= 90) {
                i_15_ -= 55;
            } else if (i_15_ >= 97 && (i_15_ ^ 0xffffffff) >= -123) {
                i_15_ -= 87;
            } else {
                return false;
            }
            if (i <= i_15_) {
                return false;
            }
            if (bool_11_) {
                i_15_ = -i_15_;
            }
            int i_16_ = i_13_ * i + i_15_;
            if (i_16_ / i != i_13_) {
                return false;
            }
            i_13_ = i_16_;
            bool_12_ = true;
        }
        return bool_12_;
    }

    public URL method1582(URL url, int i) throws MalformedURLException {
        anInt2290++;
        if (i != 4) {
            method1605(122, 19);
        }
        return new URL(url, new String(bytes, 0, anInt2293));
    }

    public void method1583(int i, int i_17_, Graphics graphics, int i_18_) {
        String string;
        try {
            string = new String(bytes, 0, anInt2293, "ISO-8859-1");
            int i_19_ = 84 / ((57 - i_18_) / 63);
        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
            string = new String(bytes, 0, anInt2293);
        }
        graphics.drawString(string, i, i_17_);
        anInt2275++;
    }

    public int method1584(int i, int i_20_, int i_21_) {
        anInt2303++;
        if (i_20_ != -1) {
            return 21;
        }
        byte i_22_ = (byte) i;
        for (int i_23_ = i_21_;
             (i_23_ ^ 0xffffffff) > (anInt2293 ^ 0xffffffff); i_23_++) {
            if ((bytes[i_23_] ^ 0xffffffff) == (i_22_ ^ 0xffffffff)) {
                return i_23_;
            }
        }
        return -1;
    }

    public RSString method1585(boolean bool) {
        anInt2319++;
        if (bool != true) {
            aBoolean2265 = true;
        }
        int i = 0;
        int i_24_ = anInt2293;
        for (/**/; i < anInt2293; i++) {
            if (((bytes[i] ^ 0xffffffff) > -1 || (bytes[i] ^ 0xffffffff) < -33) && (bytes[i] & 0xff ^ 0xffffffff) != -161) {
                break;
            }
        }
        for (/**/;
                 i < i_24_ && ((bytes[-1 + i_24_] >= 0 && bytes[i_24_ - 1] <= 32) || (0xff & bytes[-1 + i_24_]) == 160);
                 i_24_--) {
            /* empty */
        }
        if ((i ^ 0xffffffff) == -1 && anInt2293 == i_24_) {
            return this;
        }
        RSString class100_25_ = new RSString();
        class100_25_.anInt2293 = i_24_ - i;
        class100_25_.bytes = new byte[class100_25_.anInt2293];
        for (int i_26_ = 0; class100_25_.anInt2293 > i_26_; i_26_++) {
            class100_25_.bytes[i_26_] = bytes[i + i_26_];
        }
        return class100_25_;
    }

    public int method1586(byte i, RSString class100_27_, int i_28_) {
        int[] is = new int[class100_27_.anInt2293];
        int[] is_29_ = new int[256];
        anInt2306++;
        int[] is_30_ = new int[class100_27_.anInt2293];
        for (int i_31_ = 0;
             (i_31_ ^ 0xffffffff) > (is_29_.length ^ 0xffffffff); i_31_++) {
            is_29_[i_31_] = class100_27_.anInt2293;
        }
        for (int i_32_ = 1;
             (class100_27_.anInt2293 ^ 0xffffffff) <= (i_32_ ^ 0xffffffff);
             i_32_++) {
            is[-1 + i_32_] = (class100_27_.anInt2293 << -516904319) - i_32_;
            is_29_[Class120.method1740(class100_27_.bytes[-1 + i_32_],
                    255)] = class100_27_.anInt2293 - i_32_;
        }
        int i_33_ = 1 + class100_27_.anInt2293;
        int i_34_ = class100_27_.anInt2293;
        while ((i_34_ ^ 0xffffffff) < -1) {
            is_30_[-1 + i_34_] = i_33_;
            for (/**/;
                     ((i_33_ ^ 0xffffffff) >= (class100_27_.anInt2293 ^ 0xffffffff) && (class100_27_.bytes[i_34_ - 1] != class100_27_.bytes[i_33_ - 1]));
                     i_33_ = is_30_[-1 + i_33_]) {
                if ((is[-1 + i_33_] ^ 0xffffffff) <= (-i_34_ + class100_27_.anInt2293 ^ 0xffffffff)) {
                    is[i_33_ - 1] = class100_27_.anInt2293 + -i_34_;
                }
            }
            i_34_--;
            i_33_--;
        }
        int i_35_ = i_33_;
        i_33_ = -i_35_ + (1 + class100_27_.anInt2293);
        int i_36_ = 1;
        int i_37_ = 0;
        for (int i_38_ = 1; i_33_ >= i_38_; i_38_++) {
            is_30_[-1 + i_38_] = i_37_;
            for (/**/;
                     (i_37_ >= 1 && ((class100_27_.bytes[i_38_ - 1] ^ 0xffffffff) != (class100_27_.bytes[i_37_ + -1] ^ 0xffffffff)));
                     i_37_ = is_30_[-1 + i_37_]) {
                /* empty */
            }
            i_37_++;
        }
        while (i_35_ < class100_27_.anInt2293) {
            for (int i_39_ = i_36_; i_35_ >= i_39_; i_39_++) {
                if (is[i_39_ - 1] >= -i_39_ + (i_35_ + class100_27_.anInt2293)) {
                    is[i_39_ - 1] = -i_39_ + i_35_ + class100_27_.anInt2293;
                }
            }
            i_36_ = i_35_ + 1;
            i_35_ = i_33_ + (i_35_ + -is_30_[i_33_ + -1]);
            i_33_ = is_30_[i_33_ + -1];
        }
        if (i != 43) {
            return -2;
        }
        int i_40_;
        for (int i_41_ = -1 + class100_27_.anInt2293 + i_28_;
             (i_41_ ^ 0xffffffff) > (anInt2293 ^ 0xffffffff);
             i_41_ += Math.max(is_29_[0xff & bytes[i_41_]],
                     is[i_40_])) {
            for (i_40_ = -1 + class100_27_.anInt2293;
                 (i_40_ >= 0 && ((bytes[i_41_] ^ 0xffffffff) == (class100_27_.bytes[i_40_] ^ 0xffffffff)));
                 i_40_--) {
                i_41_--;
            }
            if ((i_40_ ^ 0xffffffff) == 0) {
                return i_41_ + 1;
            }
        }
        return -1;
    }

    public RSString method1587(boolean bool) {
        anInt2312++;
        if (!aBoolean2265) {
            throw new IllegalArgumentException();
        }
        anInt2308 = 0;
        if (bool != true) {
            aRSString_2269 = null;
        }
        if (bytes.length != anInt2293) {
            byte[] is = new byte[anInt2293];
            Class39.method465(bytes, 0, is, 0, anInt2293);
            bytes = is;
        }
        return this;
    }

    public RSString method1588(int i, int i_42_) {
        if (i_42_ != 26011) {
            method1590((byte) 62);
        }
        anInt2289++;
        if (i <= 0 || i > 255) {
            throw new IllegalArgumentException("invalid char:" + i);
        }
        if (!aBoolean2265) {
            throw new IllegalArgumentException();
        }
        anInt2308 = 0;
        if (bytes.length == anInt2293) {
            int i_43_;
            for (i_43_ = 1; anInt2293 >= i_43_; i_43_ += i_43_) {
                /* empty */
            }
            byte[] is = new byte[i_43_];
            Class39.method465(bytes, 0, is, 0, anInt2293);
            bytes = is;
        }
        bytes[anInt2293++] = (byte) i;
        return this;
    }

    public boolean method1589(RSString class100_44_, int i) {
        if (i < 25) {
            method1581(37, false);
        }
        anInt2292++;
        if (anInt2293 < class100_44_.anInt2293) {
            return false;
        }
        for (int i_45_ = 0;
             (i_45_ ^ 0xffffffff) > (class100_44_.anInt2293 ^ 0xffffffff);
             i_45_++) {
            if (class100_44_.bytes[i_45_] != bytes[i_45_]) {
                return false;
            }
        }
        return true;
    }

    public int method1590(byte i) {
        anInt2307++;
        if (i >= -95) {
            method1576((byte) 0, -29);
        }
        return anInt2293;
    }

    public int method1591(byte i, FontMetrics fontmetrics) {
        anInt2300++;
        String string;
        try {
            string = new String(bytes, 0, anInt2293, "ISO-8859-1");
            if (i < 85) {
                method1619((byte) -127);
            }
        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
            string = new String(bytes, 0, anInt2293);
        }
        return fontmetrics.stringWidth(string);
    }

    public int method1592(byte i, int i_46_) {
        anInt2316++;
        int i_47_ = 12 % ((-48 - i) / 63);
        return method1584(i_46_, -1, 0);
    }

    public boolean method1593(RSString class100_48_, byte i) {
        anInt2281++;
        if (class100_48_ == null) {
            return false;
        }
        if (i <= 89) {
            method1579((byte) -22);
        }
        if (class100_48_.anInt2293 != anInt2293) {
            return false;
        }
        if (!aBoolean2265 || !class100_48_.aBoolean2265) {
            if (anInt2308 == 0) {
                anInt2308 = method1603(5745);
                if (anInt2308 == 0) {
                    anInt2308 = 1;
                }
            }
            if (class100_48_.anInt2308 == 0) {
                class100_48_.anInt2308 = class100_48_.method1603(5745);
                if (class100_48_.anInt2308 == 0) {
                    class100_48_.anInt2308 = 1;
                }
            }
            if ((class100_48_.anInt2308 ^ 0xffffffff) != (anInt2308 ^ 0xffffffff)) {
                return false;
            }
        }
        for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > (anInt2293 ^ 0xffffffff);
             i_49_++) {
            if ((bytes[i_49_] ^ 0xffffffff) != (class100_48_.bytes[i_49_] ^ 0xffffffff)) {
                return false;
            }
        }
        return true;
    }

    public void method1594(int i, byte i_50_) {
        anInt2277++;
        anInt2308 = 0;
        if (!aBoolean2265) {
            throw new IllegalArgumentException();
        }
        if ((i ^ 0xffffffff) > -1) {
            throw new IllegalArgumentException();
        }
        if ((i ^ 0xffffffff) < (bytes.length ^ 0xffffffff)) {
            int i_51_;
            for (i_51_ = 1; (i ^ 0xffffffff) < (i_51_ ^ 0xffffffff);
                 i_51_ += i_51_) {
                /* empty */
            }
            byte[] is = new byte[i_51_];
            Class39.method465(bytes, 0, is, 0, anInt2293);
            bytes = is;
        }
        if (i_50_ > -13) {
            method1600(true, null);
        }
        for (int i_52_ = anInt2293; (i_52_ ^ 0xffffffff) > (i ^ 0xffffffff);
             i_52_++) {
            bytes[i_52_] = (byte) 32;
        }
        anInt2293 = i;
    }

    public int method1595(int i, RSString class100_53_) {
        int i_54_ = 97 / ((-11 - i) / 44);
        anInt2310++;
        return method1586((byte) 43, class100_53_, 0);
    }

    public int method1596(int i, int i_55_) {
        anInt2280++;
        if (i_55_ < 39) {
            method1614(false, null);
        }
        byte i_56_ = (byte) i;
        int i_57_ = 0;
        for (int i_58_ = 0; (anInt2293 ^ 0xffffffff) < (i_58_ ^ 0xffffffff);
             i_58_++) {
            if (i_56_ == bytes[i_58_]) {
                i_57_++;
            }
        }
        return i_57_;
    }

    public RSString method1597(int i) {
        RSString class100_59_ = new RSString();
        anInt2296++;
        boolean bool = true;
        class100_59_.anInt2293 = anInt2293;
        class100_59_.bytes = new byte[anInt2293];
        if (i != 12688) {
            aBoolean2262 = true;
        }
        for (int i_60_ = 0; (anInt2293 ^ 0xffffffff) < (i_60_ ^ 0xffffffff);
             i_60_++) {
            byte i_61_ = bytes[i_60_];
            if ((i_61_ ^ 0xffffffff) == -96) {
                class100_59_.bytes[i_60_] = (byte) 32;
                bool = true;
            } else if ((i_61_ ^ 0xffffffff) <= -98 && (i_61_ ^ 0xffffffff) >= -123 && bool) {
                class100_59_.bytes[i_60_] = (byte) (i_61_ + -32);
                bool = false;
            } else {
                bool = false;
                class100_59_.bytes[i_60_] = i_61_;
            }
        }
        return class100_59_;
    }

    public int hashCode() {
        anInt2271++;
        return method1603(5745);
    }

    public static Class13_Sub1 method1598(int i, Stream class68_sub14) {
        if (i != -20084) {
            aRSString_2317 = null;
        }
        anInt2301++;
        return new Class13_Sub1(class68_sub14.method957(i + -2405),
                class68_sub14.method957(i + -2405),
                class68_sub14.method957(-22489),
                class68_sub14.method957(-22489),
                class68_sub14.method921((byte) -58),
                class68_sub14.method921((byte) -124),
                class68_sub14.readUnsignedByte(-6677));
    }

    public void method1599(byte i, Applet applet) throws Throwable {
        anInt2283++;
        String string = new String(bytes, 0, anInt2293);
        Class27.method391(string, 4149, applet);
        int i_62_ = 25 % ((i - 47) / 45);
    }

    public boolean method1600(boolean bool, RSString class100_63_) {
        if (bool != false) {
            return true;
        }
        anInt2304++;
        if (class100_63_ == null) {
            return false;
        }
        if ((class100_63_.anInt2293 ^ 0xffffffff) != (anInt2293 ^ 0xffffffff)) {
            return false;
        }
        for (int i = 0; (anInt2293 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
            byte i_64_ = bytes[i];
            if ((i_64_ ^ 0xffffffff) <= -66 && i_64_ <= 90 || ((i_64_ ^ 0xffffffff) <= 63 && i_64_ <= -34 && (i_64_ ^ 0xffffffff) != 40)) {
                i_64_ += 32;
            }
            byte i_65_ = class100_63_.bytes[i];
            if ((i_65_ ^ 0xffffffff) <= -66 && i_65_ <= 90 || ((i_65_ ^ 0xffffffff) <= 63 && (i_65_ ^ 0xffffffff) >= 33 && i_65_ != -41)) {
                i_65_ += 32;
            }
            if ((i_65_ ^ 0xffffffff) != (i_64_ ^ 0xffffffff)) {
                return false;
            }
        }
        return true;
    }

    public int method1601(byte i, RSString class100_66_) {
        int i_67_ = 0;
        anInt2318++;
        int i_68_ = 0;
        int i_69_ = class100_66_.anInt2293;
        if (i != -39) {
            return 4;
        }
        int i_70_ = anInt2293;
        int i_71_ = anInt2293;
        int i_72_ = class100_66_.anInt2293;
        int i_73_ = 0;
        int i_74_ = 0;
        while (i_70_ != 0 && i_69_ != 0) {
            if (i_67_ == 156 || i_67_ == 230) {
                i_67_ = 101;
            } else if ((i_67_ ^ 0xffffffff) == -141 || (i_67_ ^ 0xffffffff) == -199) {
                i_67_ = 69;
            } else if (i_67_ == 223) {
                i_67_ = 115;
            } else {
                i_67_ = bytes[i_73_] & 0xff;
                i_73_++;
            }
            if (Class57.method573(140, i_67_)) {
                i_71_++;
            } else {
                i_70_--;
            }
            if ((i_68_ ^ 0xffffffff) != -157 && i_68_ != 230) {
                if (i_68_ == 140 || i_68_ == 198) {
                    i_68_ = 69;
                } else if (i_68_ != 223) {
                    i_68_ = class100_66_.bytes[i_74_] & 0xff;
                    i_74_++;
                } else {
                    i_68_ = 115;
                }
            } else {
                i_68_ = 101;
            }
            if (!Class57.method573(140, i_68_)) {
                i_69_--;
            } else {
                i_72_++;
            }
            if ((Class68_Sub13_Sub35.anIntArray4022[i_68_] ^ 0xffffffff) < (Class68_Sub13_Sub35.anIntArray4022[i_67_] ^ 0xffffffff)) {
                return -1;
            }
            if (Class68_Sub13_Sub35.anIntArray4022[i_67_] > Class68_Sub13_Sub35.anIntArray4022[i_68_]) {
                return 1;
            }
        }
        if (i_71_ < i_72_) {
            return -1;
        }
        if ((i_72_ ^ 0xffffffff) > (i_71_ ^ 0xffffffff)) {
            return 1;
        }
        return 0;
    }

    public RSString method1602(int i) {
        anInt2285++;
        int i_75_ = 103 % ((-6 - i) / 62);
        RSString class100_76_ = Class56.method570(toLong(10908), -1);
        if (class100_76_ == null) {
            return GameSocket.aRSString_1148;
        }
        return class100_76_;
    }

    public int method1603(int i) {
        if (i != 5745) {
            method1607(9, (byte) -46, 113);
        }
        anInt2267++;
        int i_77_ = 0;
        for (int i_78_ = 0; i_78_ < anInt2293; i_78_++) {
            i_77_ = (bytes[i_78_] & 0xff) + ((i_77_ << -1325077051) + -i_77_);
        }
        return i_77_;
    }

    public Object method1604(Applet applet, byte i) throws Throwable {
        if (i != -123) {
            aBoolean2262 = true;
        }
        String string = new String(bytes, 0, anInt2293);
        anInt2274++;
        Object object = Class27.method390(string, applet, null, i + -584);
        if (object instanceof String) {
            byte[] is = ((String) object).getBytes();
            object = Class68_Sub13_Sub27.method842(is.length, is, i ^ ~0x4a, 0);
        }
        return object;
    }

    public int method1605(int i, int i_79_) {
        anInt2302++;
        boolean bool = false;
        boolean bool_80_ = false;
        int i_81_ = 0;
        if (i < 1 || (i ^ 0xffffffff) < -37) {
            i = 10;
        }
        for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > (anInt2293 ^ 0xffffffff);
             i_82_++) {
            int i_83_ = 0xff & bytes[i_82_];
            if (i_82_ == 0) {
                if ((i_83_ ^ 0xffffffff) == -46) {
                    bool = true;
                    continue;
                }
                if ((i_83_ ^ 0xffffffff) == -44) {
                    continue;
                }
            }
            if (i_83_ < 48 || i_83_ > 57) {
                if ((i_83_ ^ 0xffffffff) <= -66 && i_83_ <= 90) {
                    i_83_ -= 55;
                } else if ((i_83_ ^ 0xffffffff) <= -98 && i_83_ <= 122) {
                    i_83_ -= 87;
                } else {
                    throw new NumberFormatException();
                }
            } else {
                i_83_ -= 48;
            }
            if (i_83_ >= i) {
                throw new NumberFormatException();
            }
            if (bool) {
                i_83_ = -i_83_;
            }
            int i_84_ = i_81_ * i - -i_83_;
            if (i_81_ != i_84_ / i) {
                throw new NumberFormatException();
            }
            i_81_ = i_84_;
            bool_80_ = true;
        }
        if (!bool_80_) {
            throw new NumberFormatException();
        }
        if (i_79_ <= 41) {
            aClass97_2261 = null;
        }
        return i_81_;
    }

    public byte[] method1606(byte i) {
        anInt2282++;
        if ((anInt2293 ^ 0xffffffff) == -1) {
            return new byte[0];
        }
        int i_85_ = anInt2293 + 3 & ~0x3;
        int i_86_ = -56 / ((i - -53) / 54);
        int i_87_ = 3 * (i_85_ / 4);
        if ((i_85_ + -2 ^ 0xffffffff) > (anInt2293 ^ 0xffffffff) && (Class68_Sub20_Sub4.method1060(bytes[-2 + i_85_], -109) != -1)) {
            if ((anInt2293 ^ 0xffffffff) >= (i_85_ - 1 ^ 0xffffffff) || Class68_Sub20_Sub4.method1060(bytes[-1 + i_85_],
                    37) == -1) {
                i_87_--;
            }
        } else {
            i_87_ -= 2;
        }
        byte[] is = new byte[i_87_];
        method1613(is, -64, 0);
        return is;
    }

    public RSString method1607(int i, byte i_88_, int i_89_) {
        anInt2299++;
        RSString class100_90_ = new RSString();
        class100_90_.anInt2293 = -i + i_89_;
        if (i_88_ != -74) {
            bytes = null;
        }
        class100_90_.bytes = new byte[-i + i_89_];
        Class39.method465(bytes, i, class100_90_.bytes, 0,
                class100_90_.anInt2293);
        return class100_90_;
    }

    public boolean equals(Object object) {
        anInt2314++;
        if (object instanceof RSString) {
            return method1593((RSString) object, (byte) 122);
        }
        throw new IllegalArgumentException();
    }

    public RSString method1608(byte i) {
        RSString class100_91_ = new RSString();
        anInt2273++;
        class100_91_.anInt2293 = anInt2293;
        class100_91_.bytes = new byte[anInt2293];
        int i_92_ = 93 % ((-26 - i) / 54);
        for (int i_93_ = 0; (anInt2293 ^ 0xffffffff) < (i_93_ ^ 0xffffffff);
             i_93_++) {
            byte i_94_ = bytes[i_93_];
            if ((i_94_ ^ 0xffffffff) <= -66 && (i_94_ ^ 0xffffffff) >= -91 || (i_94_ ^ 0xffffffff) <= 63 && i_94_ <= -34 && i_94_ != -41) {
                i_94_ += 32;
            }
            class100_91_.bytes[i_93_] = i_94_;
        }
        return class100_91_;
    }

    public String toString() {
        // this makes it easier on me
        return new String(this.bytes);
        //anInt2322++;
        //throw new RuntimeException();
    }

    public long toLong(int i) {
        if (i != 10908) {
            method1575((byte) -51);
        }
        anInt2325++;
        long l = 0L;
        for (int i_95_ = 0; (i_95_ ^ 0xffffffff) > (anInt2293 ^ 0xffffffff);
             i_95_++) {
            if ((i_95_ ^ 0xffffffff) <= -13) {
                break;
            }
            int i_96_ = bytes[i_95_];
            l *= 37L;
            if ((i_96_ ^ 0xffffffff) > -66 || (i_96_ ^ 0xffffffff) < -91) {
                if ((i_96_ ^ 0xffffffff) > -98 || (i_96_ ^ 0xffffffff) < -123) {
                    if (i_96_ >= 48 && i_96_ <= 57) {
                        l += (long) (i_96_ + 27 + -48);
                    }
                } else {
                    l += (long) (1 - -i_96_ + -97);
                }
            } else {
                l += (long) (-65 + (1 + i_96_));
            }
        }
        for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
            /* empty */
        }
        return l;
    }

    public RSString method1610(Applet applet, byte i) {
        anInt2278++;
        String string = new String(bytes, 0, anInt2293);
        if (i != -31) {
            method1606((byte) -109);
        }
        String string_97_ = applet.getParameter(string);
        if (string_97_ == null) {
            return null;
        }
        return Class23.method379(25732, string_97_);
    }

    public int method1611(int i, int i_99_, int i_100_, byte[] is) {
        anInt2313++;
        Class39.method465(bytes, i_100_, is, i, i_99_ + -i_100_);
        return -i_100_ + i_99_;
    }

    public static byte[] method1612(byte[] is, boolean bool) {
        anInt2284++;
        if (bool != true) {
            return null;
        }
        Stream class68_sub14 = new Stream(is);
        int i = class68_sub14.readUnsignedByte(-6677);
        int i_101_ = class68_sub14.readDWord();
        if (i_101_ < 0 || ((Class68_Sub13_Sub11.anInt3621 ^ 0xffffffff) != -1 && i_101_ > Class68_Sub13_Sub11.anInt3621)) {
            throw new RuntimeException();
        }
        if ((i ^ 0xffffffff) != -1) {
            int i_102_ = class68_sub14.readDWord();
            if (i_102_ < 0 || ((Class68_Sub13_Sub11.anInt3621 ^ 0xffffffff) != -1 && Class68_Sub13_Sub11.anInt3621 < i_102_)) {
                //xxx changed this:
                //throw new RuntimeException();
                // to this:
                return new byte[100];
            }
            //xxx added this:
            if (i_102_ >= 2000000) {
                return new byte[100];
            }
            // the above modifications are supposed to stop the client from crashing when the player enters an area with
            // no mapdata available, this patch was submitted by 'noobs are ftw' on moparscape.org
            byte[] is_103_ = new byte[i_102_];
            if (i == 1) {
                Class73.method1376(is_103_, i_102_, is, i_101_, 9);
            } else {
                Class68_Sub13_Sub33.aClass114_3999.method1688(class68_sub14,
                        115, is_103_);
            }
            return is_103_;
        }
        byte[] is_104_ = new byte[i_101_];
        class68_sub14.readBytes(0, 0, i_101_, is_104_);
        return is_104_;
    }

    public int method1613(byte[] is, int i, int i_105_) {
        int i_106_ = i_105_;
        anInt2291++;
        int i_107_ = 0;
        if (i >= -2) {
            aClass97_2261 = null;
        }
        for (/**/; i_107_ < anInt2293; i_107_ += 4) {
            int i_108_ = Class68_Sub20_Sub4.method1060(bytes[i_107_], 101);
            int i_109_ = ((anInt2293 ^ 0xffffffff) >= (1 + i_107_ ^ 0xffffffff) ? -1
                    : Class68_Sub20_Sub4.method1060(bytes[1 + i_107_],
                    27));
            int i_110_ = ((i_107_ + 2 ^ 0xffffffff) <= (anInt2293 ^ 0xffffffff) ? -1
                    : Class68_Sub20_Sub4.method1060(bytes[2 + i_107_],
                    90));
            int i_111_ = ((anInt2293 ^ 0xffffffff) < (3 + i_107_ ^ 0xffffffff)
                    ? Class68_Sub20_Sub4.method1060(bytes[3 + i_107_],
                    37)
                    : -1);
            is[i_105_++] = (byte) Class70.method1335(i_108_ << 1324180066,
                    i_109_ >>> 1558649252);
            if ((i_110_ ^ 0xffffffff) == 0) {
                break;
            }
            is[i_105_++] = (byte) Class70.method1335((Class120.method1740(i_109_, 15) << -1724734620),
                    i_110_ >>> 1372711714);
            if ((i_111_ ^ 0xffffffff) == 0) {
                break;
            }
            is[i_105_++] = (byte) (Class70.method1335(Class120.method1740(192, i_110_ << -64861882),
                    i_111_));
        }
        return -i_106_ + i_105_;
    }

    public int method1614(boolean bool, RSString class100_112_) {
        anInt2295++;
        int i;
        if (anInt2293 <= class100_112_.anInt2293) {
            i = anInt2293;
        } else {
            i = class100_112_.anInt2293;
        }
        int i_113_ = 0;
        if (bool != false) {
            return 115;
        }
        for (/**/; i > i_113_; i_113_++) {
            if ((class100_112_.bytes[i_113_] & 0xff ^ 0xffffffff) < (0xff & bytes[i_113_] ^ 0xffffffff)) {
                return -1;
            }
            if ((class100_112_.bytes[i_113_] & 0xff) < (0xff & bytes[i_113_])) {
                return 1;
            }
        }
        if (class100_112_.anInt2293 > anInt2293) {
            return -1;
        }
        if (anInt2293 > class100_112_.anInt2293) {
            return 1;
        }
        return 0;
    }

    public RSString method1615(int i, boolean bool) {
        if (bool != true) {
            return null;
        }
        anInt2286++;
        return method1607(i, (byte) -74, anInt2293);
    }

    public RSString method1616(int i) {
        anInt2321++;
        int i_114_ = i;
        RSString class100_115_ = new RSString();
        class100_115_.anInt2293 = anInt2293;
        class100_115_.bytes = new byte[anInt2293];
        for (int i_116_ = 0; (i_116_ ^ 0xffffffff) > (anInt2293 ^ 0xffffffff);
             i_116_++) {
            byte i_117_ = bytes[i_116_];
            if (i_117_ >= 97 && i_117_ <= 122 || ((i_117_ ^ 0xffffffff) <= 31 && (i_117_ ^ 0xffffffff) >= 1 && (i_117_ ^ 0xffffffff) != 8)) {
                if (i_114_ == 2) {
                    i_117_ -= 32;
                }
                i_114_ = 0;
            } else if ((i_117_ < 65 || i_117_ > 90) && ((i_117_ ^ 0xffffffff) > 63 || i_117_ > -34 || i_117_ == -41)) {
                if ((i_117_ ^ 0xffffffff) == -47 || (i_117_ ^ 0xffffffff) == -34 || i_117_ == 63) {
                    i_114_ = 2;
                } else if ((i_117_ ^ 0xffffffff) == -33) {
                    if ((i_114_ ^ 0xffffffff) != -3) {
                        i_114_ = 1;
                    }
                } else {
                    i_114_ = 1;
                }
            } else {
                if ((i_114_ ^ 0xffffffff) == -1) {
                    i_117_ += 32;
                }
                i_114_ = 0;
            }
            class100_115_.bytes[i_116_] = i_117_;
        }
        return class100_115_;
    }

    public boolean method1617(int i, RSString class100_118_) {
        anInt2323++;
        if ((class100_118_.anInt2293 ^ 0xffffffff) < (anInt2293 ^ 0xffffffff)) {
            return false;
        }
        int i_119_ = 0;
        if (i != -577) {
            bytes = null;
        }
        for (/**/; class100_118_.anInt2293 > i_119_; i_119_++) {
            byte i_120_ = bytes[i_119_];
            if (i_120_ >= 65 && (i_120_ ^ 0xffffffff) >= -91 || ((i_120_ ^ 0xffffffff) <= 63 && i_120_ <= -34 && (i_120_ ^ 0xffffffff) != 40)) {
                i_120_ += 32;
            }
            byte i_121_ = class100_118_.bytes[i_119_];
            if (i_121_ >= 65 && i_121_ <= 90 || (i_121_ >= -64 && (i_121_ ^ 0xffffffff) >= 33 && (i_121_ ^ 0xffffffff) != 40)) {
                i_121_ += 32;
            }
            if ((i_120_ ^ 0xffffffff) != (i_121_ ^ 0xffffffff)) {
                return false;
            }
        }
        return true;
    }

    public RSString method1618(RSString class100_122_, int i) {
        anInt2324++;
        if (i != 12147) {
            aBoolean2279 = false;
        }
        if (!aBoolean2265) {
            throw new IllegalArgumentException();
        }
        anInt2308 = 0;
        if ((bytes.length ^ 0xffffffff) > (class100_122_.anInt2293 + anInt2293 ^ 0xffffffff)) {
            int i_123_;
            for (i_123_ = 1; class100_122_.anInt2293 + anInt2293 > i_123_;
                 i_123_ += i_123_) {
                /* empty */
            }
            byte[] is = new byte[i_123_];
            Class39.method465(bytes, 0, is, 0, anInt2293);
            bytes = is;
        }
        Class39.method465(class100_122_.bytes, 0, bytes,
                anInt2293, class100_122_.anInt2293);
        anInt2293 += class100_122_.anInt2293;
        return this;
    }

    public int method1619(byte i) {
        anInt2288++;
        int i_124_ = -58 % ((i - 75) / 46);
        return method1605(10, 71);
    }

    public RSString[] method1620(int i, int i_125_) {
        anInt2320++;
        int i_126_ = i;
        for (int i_127_ = 0; anInt2293 > i_127_; i_127_++) {
            if (i_125_ == bytes[i_127_]) {
                i_126_++;
            }
        }
        RSString[] class100s = new RSString[i_126_ + 1];
        if ((i_126_ ^ 0xffffffff) == -1) {
            class100s[0] = this;
            return class100s;
        }
        int i_128_ = 0;
        int i_129_ = 0;
        for (int i_130_ = 0; i_126_ > i_130_; i_130_++) {
            int i_131_;
            for (i_131_ = 0;
                 ((i_125_ ^ 0xffffffff) != (bytes[i_131_ + i_129_] ^ 0xffffffff));
                 i_131_++) {
                /* empty */
            }
            class100s[i_128_++] = method1607(i_129_, (byte) -74, i_129_ + i_131_);
            i_129_ += 1 + i_131_;
        }
        class100s[i_126_] = method1607(i_129_, (byte) -74, anInt2293);
        return class100s;
    }

    public boolean method1621(byte i) {
        anInt2309++;
        if (i >= -17) {
            method1572(12, -60, -82, null);
        }
        return method1581(10, false);
    }

    public RSString method1622() {
        long l = method1580(-50);
        anInt2298++;
        synchronized (aClass2326 != null ? aClass2326
                : (aClass2326 = method1623("RSString"))) {
            if (Stream.aClass113_3009 != null) {
                for (Class68_Sub5 class68_sub5 = ((Class68_Sub5) Stream.aClass113_3009.method1678(l, 110));
                     class68_sub5 != null;
                     class68_sub5 = (Class68_Sub5) Stream.aClass113_3009.method1686(109)) {
                    if (method1593(class68_sub5.aRSString_2830, (byte) 117)) {
                        return class68_sub5.aRSString_2830;
                    }
                }
            } else {
                Stream.aClass113_3009 = new Class113(4096);
            }
            Class68_Sub5 class68_sub5 = new Class68_Sub5();
            class68_sub5.aRSString_2830 = this;
            aBoolean2265 = false;
            Stream.aClass113_3009.method1677((byte) -66, class68_sub5,
                    l);
        }
        return this;
    }

    /*synthetic*/
    public static Class method1623(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static {
        aBoolean2262 = true;
        aBoolean2279 = false;
        aRSString_2305 = newRsString("<)4col>");
        aRSString_2297 = newRsString("scape main");
        aRSString_2317 = aRSString_2269;
    }
}
