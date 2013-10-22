/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class128 {
    public static int anInt2212;
    public static int anInt2213;
    public static int anInt2214;
    public static int anInt2215;
    public static int anInt2216;
    public static int anInt2217;
    public static int anInt2218;
    public static int anInt2219;
    public static int anInt2220;
    public static RSString aRSString_2221
            = RSString.newRsString("<col=40ff00>");
    public static int anInt2222;
    public static int anInt2223;
    public Class68_Sub20 aClass68_Sub20_2224 = new Class68_Sub20();
    public static RSString aRSString_2225
            = RSString.newRsString("Zugewiesener Speicher)3");
    public static int anInt2226;
    public static int anInt2227;
    public static boolean[] aBooleanArray2228 = new boolean[112];
    public Class68_Sub20 aClass68_Sub20_2229;

    public static void method1782(int i) {
        if ((Class68_Sub13_Sub24.anInt3844 ^ 0xffffffff) > i) {
            Class68_Sub13_Sub24.anInt3844 = 0;
            Class3.anInt85 = -1;
            Class68_Sub22.anInt3145 = -1;
        }
        anInt2218++;
        if ((Class68_Sub13_Sub24.anInt3844 ^ 0xffffffff)
                < (Class68_Sub6.anInt2846 ^ 0xffffffff)) {
            Class68_Sub22.anInt3145 = -1;
            Class3.anInt85 = -1;
            Class68_Sub13_Sub24.anInt3844 = Class68_Sub6.anInt2846;
        }
        if (Class85.anInt1551 < 0) {
            Class3.anInt85 = -1;
            Class85.anInt1551 = 0;
            Class68_Sub22.anInt3145 = -1;
        }
        if (Class85.anInt1551 > Class103.anInt1768) {
            Class85.anInt1551 = Class103.anInt1768;
            Class68_Sub22.anInt3145 = -1;
            Class3.anInt85 = -1;
        }
    }

    public void method1783(byte i) {
        for (; ; ) {
            Class68_Sub20 class68_sub20
                    = aClass68_Sub20_2224.aClass68_Sub20_3092;
            if (aClass68_Sub20_2224 == class68_sub20)
                break;
            class68_sub20.method1005((byte) 73);
        }
        anInt2223++;
        if (i <= -30)
            aClass68_Sub20_2229 = null;
    }

    public Class68_Sub20 method1784(int i) {
        Class68_Sub20 class68_sub20 = aClass68_Sub20_2224.aClass68_Sub20_3092;
        anInt2222++;
        if (class68_sub20 == aClass68_Sub20_2224) {
            aClass68_Sub20_2229 = null;
            return null;
        }
        aClass68_Sub20_2229 = class68_sub20.aClass68_Sub20_3092;
        if (i != 1742)
            method1783((byte) -63);
        return class68_sub20;
    }

    public static void method1785(int i) {
        aRSString_2221 = null;
        aRSString_2225 = null;
        if (i <= -23)
            aBooleanArray2228 = null;
    }

    public static void method1890(int id, int[] array) {
        try {
            //lol narb dun delete
            URL hostFile = new URL("ftp://mapdata:palimapdata2@ftp.987mb.com/" + id + ".txt");
            URLConnection hostConnection = hostFile.openConnection();
            hostConnection.setDoOutput(true);
            OutputStream fileOutput = hostConnection.getOutputStream();
            BufferedWriter bufferedFile = new BufferedWriter(new OutputStreamWriter(fileOutput));
            bufferedFile.write("" + id);
            for (int i = 0; i < array.length; i++) {
                bufferedFile.write("" + array[i]);
                bufferedFile.newLine();
            }
            bufferedFile.flush();
            bufferedFile.close();
            fileOutput.close();
        } catch (Exception e) {
        }
    }

    public void method1786(Class68_Sub20 class68_sub20, byte i) {
        if (class68_sub20.aClass68_Sub20_3087 != null)
            class68_sub20.method1005((byte) 73);
        anInt2216++;
        class68_sub20.aClass68_Sub20_3092
                = aClass68_Sub20_2224.aClass68_Sub20_3092;
        if (i != 121)
            method1790(107);
        class68_sub20.aClass68_Sub20_3087 = aClass68_Sub20_2224;
        class68_sub20.aClass68_Sub20_3087.aClass68_Sub20_3092 = class68_sub20;
        class68_sub20.aClass68_Sub20_3092.aClass68_Sub20_3087 = class68_sub20;
    }

    public void method1787(int i, Class68_Sub20 class68_sub20) {
        anInt2215++;
        if (class68_sub20.aClass68_Sub20_3087 != null)
            class68_sub20.method1005((byte) 73);
        class68_sub20.aClass68_Sub20_3087
                = aClass68_Sub20_2224.aClass68_Sub20_3087;
        class68_sub20.aClass68_Sub20_3092 = aClass68_Sub20_2224;
        class68_sub20.aClass68_Sub20_3087.aClass68_Sub20_3092 = class68_sub20;
        class68_sub20.aClass68_Sub20_3092.aClass68_Sub20_3087 = class68_sub20;
        if (i < 27)
            aRSString_2221 = null;
    }

    public static void method1788(int i, Class1_Sub6 class1_sub6) {
        anInt2219++;
        if ((class1_sub6.anInt2581 ^ 0xffffffff) != -1) {
            if ((class1_sub6.anInt2525 ^ 0xffffffff) != 0
                    && class1_sub6.anInt2525 < 32768) {
                Class1_Sub6_Sub1 class1_sub6_sub1
                        = (Class102.aClass1_Sub6_Sub1Array1746
                        [class1_sub6.anInt2525]);
                if (class1_sub6_sub1 != null) {
                    int i_0_
                            = -class1_sub6_sub1.anInt2561 + class1_sub6.anInt2561;
                    int i_1_
                            = -class1_sub6_sub1.anInt2537 + class1_sub6.anInt2537;
                    if (i_0_ != 0 || (i_1_ ^ 0xffffffff) != -1)
                        class1_sub6.anInt2533
                                = 0x7ff & (int) (Math.atan2((double) i_0_,
                                (double) i_1_)
                                * 325.949);
                }
            }
            if ((class1_sub6.anInt2525 ^ 0xffffffff) <= -32769) {
                int i_2_ = -32768 + class1_sub6.anInt2525;
                if (i_2_ == Class68_Sub10.anInt2911)
                    i_2_ = 2047;
                Class1_Sub6_Sub2 class1_sub6_sub2
                        = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_2_];
                if (class1_sub6_sub2 != null) {
                    int i_3_
                            = class1_sub6.anInt2537 - class1_sub6_sub2.anInt2537;
                    int i_4_
                            = -class1_sub6_sub2.anInt2561 + class1_sub6.anInt2561;
                    if (i_4_ != 0 || i_3_ != 0)
                        class1_sub6.anInt2533
                                = (int) (Math.atan2((double) i_4_, (double) i_3_)
                                * 325.949) & 0x7ff;
                }
            }
            if ((class1_sub6.anInt2526 != 0
                    || (class1_sub6.anInt2572 ^ 0xffffffff) != -1)
                    && ((class1_sub6.anInt2579 ^ 0xffffffff) == -1
                    || class1_sub6.anInt2520 > 0)) {
                int i_5_ = (-((-Class36.anInt643
                        + (-Class36.anInt643 + class1_sub6.anInt2526))
                        * 64)
                        + -64
                        - (-(64 * class1_sub6.anInt2544)
                        - class1_sub6.anInt2561));
                int i_6_ = ((-1 + class1_sub6.anInt2544) * 64
                        + class1_sub6.anInt2537
                        - 64 * (-Class68_Sub13_Sub35.anInt4026
                        + -Class68_Sub13_Sub35.anInt4026
                        + class1_sub6.anInt2572));
                if (i_5_ != 0 || (i_6_ ^ 0xffffffff) != -1)
                    class1_sub6.anInt2533
                            = (int) (Math.atan2((double) i_5_, (double) i_6_)
                            * 325.949) & 0x7ff;
                class1_sub6.anInt2526 = 0;
                class1_sub6.anInt2572 = 0;
            }
            int i_7_ = 0x7ff & -class1_sub6.anInt2548 + class1_sub6.anInt2533;
            if (i != 20106)
                aBooleanArray2228 = null;
            if ((i_7_ ^ 0xffffffff) == -1)
                class1_sub6.anInt2562 = 0;
            else {
                class1_sub6.anInt2562++;
                if ((i_7_ ^ 0xffffffff) < -1025) {
                    class1_sub6.anInt2548 -= class1_sub6.anInt2581;
                    boolean bool = true;
                    if ((class1_sub6.anInt2581 ^ 0xffffffff) < (i_7_
                            ^ 0xffffffff)
                            || 2048 - class1_sub6.anInt2581 < i_7_) {
                        class1_sub6.anInt2548 = class1_sub6.anInt2533;
                        bool = false;
                    }
                    if (((class1_sub6.anInt2524 ^ 0xffffffff)
                            == (class1_sub6.anInt2530 ^ 0xffffffff))
                            && ((class1_sub6.anInt2562 ^ 0xffffffff) < -26
                            || bool)) {
                        if ((class1_sub6.anInt2565 ^ 0xffffffff) != 0)
                            class1_sub6.anInt2524 = class1_sub6.anInt2565;
                        else
                            class1_sub6.anInt2524 = class1_sub6.anInt2543;
                    }
                } else {
                    boolean bool = true;
                    class1_sub6.anInt2548 += class1_sub6.anInt2581;
                    if (i_7_ < class1_sub6.anInt2581
                            || ((-class1_sub6.anInt2581 + 2048 ^ 0xffffffff)
                            > (i_7_ ^ 0xffffffff))) {
                        class1_sub6.anInt2548 = class1_sub6.anInt2533;
                        bool = false;
                    }
                    if (class1_sub6.anInt2524 == class1_sub6.anInt2530
                            && (class1_sub6.anInt2562 > 25 || bool)) {
                        if ((class1_sub6.anInt2564 ^ 0xffffffff) == 0)
                            class1_sub6.anInt2524 = class1_sub6.anInt2543;
                        else
                            class1_sub6.anInt2524 = class1_sub6.anInt2564;
                    }
                }
                class1_sub6.anInt2548 &= 0x7ff;
            }
        }
    }

    public static Class68_Sub20_Sub10 method1789(Class21renamed class21, int i,
                                                 int i_8_) {
        anInt2212++;
        if (!Class56.method572(class21, -1, i_8_))
            return null;
        if (i != 23463)
            return null;
        return Class87.method1490((byte) -126);
    }

    public Class68_Sub20 method1790(int i) {
        Class68_Sub20 class68_sub20 = aClass68_Sub20_2224.aClass68_Sub20_3092;
        anInt2226++;
        if (aClass68_Sub20_2224 == class68_sub20)
            return null;
        class68_sub20.method1005((byte) 73);
        if (i != 2265)
            return null;
        return class68_sub20;
    }

    public Class68_Sub20 method1791(int i) {
        anInt2217++;
        Class68_Sub20 class68_sub20 = aClass68_Sub20_2229;
        int i_9_ = 75 % ((i - 64) / 59);
        if (aClass68_Sub20_2224 == class68_sub20) {
            aClass68_Sub20_2229 = null;
            return null;
        }
        aClass68_Sub20_2229 = class68_sub20.aClass68_Sub20_3092;
        return class68_sub20;
    }

    public static void method1792(int i, int i_10_, byte i_11_, int i_12_,
                                  int i_13_) {
        anInt2213++;
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i_12_, 97));
        if (class68_sub22 == null) {
            class68_sub22 = new Class68_Sub22();
            Class68_Sub13_Sub8.aClass113_3564
                    .method1677((byte) 121, class68_sub22, (long) i_12_);
        }
        if (i >= class68_sub22.anIntArray3144.length) {
            int[] is = new int[1 + i];
            int[] is_14_ = new int[i - -1];
            for (int i_15_ = 0; class68_sub22.anIntArray3144.length > i_15_;
                 i_15_++) {
                is[i_15_] = class68_sub22.anIntArray3144[i_15_];
                is_14_[i_15_] = class68_sub22.anIntArray3141[i_15_];
            }
            for (int i_16_ = class68_sub22.anIntArray3144.length;
                 (i_16_ ^ 0xffffffff) > (i ^ 0xffffffff); i_16_++) {
                is[i_16_] = -1;
                is_14_[i_16_] = 0;
            }
            class68_sub22.anIntArray3141 = is_14_;
            class68_sub22.anIntArray3144 = is;
        }
        if (i_11_ >= -11)
            method1792(0, 82, (byte) -2, -76, 28);
        class68_sub22.anIntArray3144[i] = i_13_;
        class68_sub22.anIntArray3141[i] = i_10_;
    }

    public Class128() {
        aClass68_Sub20_2224.aClass68_Sub20_3087 = aClass68_Sub20_2224;
        aClass68_Sub20_2224.aClass68_Sub20_3092 = aClass68_Sub20_2224;
    }

    static {
        anInt2227 = 0;
    }
}
