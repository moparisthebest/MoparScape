/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.DataInputStream;
import java.net.URL;

public class Class71 {
    public static RSString aRSString_1288;
    public static RSString aRSString_1289;
    public static RSString aRSString_1290
            = RSString.newRsString("Free world");
    public static int anInt1291;
    public static int anInt1292;
    public static int anInt1293;
    public static int[] anIntArray1294;
    public static int anInt1295;
    public static RSString aRSString_1296;
    public static int anInt1297;
    public static int anInt1298;
    public static int anInt1299;
    public static short[] aShortArray1300;

    public static void method1338(int i, int i_0_, int i_1_) {
        if ((Class80.anInt1465 ^ 0xffffffff) < -1) {
            Class68_Sub4.method660(Class80.anInt1465, (byte) 60);
            Class80.anInt1465 = 0;
        }
        int i_2_ = 0;
        anInt1292++;
        int i_3_ = 256;
        int i_4_ = i * Class79.anInt1401;
        int i_5_ = 0;
        if (i_1_ == 95) {
            for (int i_6_ = 1; i_6_ < i_3_ - 1; i_6_++) {
                int i_7_ = ((-i_6_ + i_3_)
                        * Class68_Sub20_Sub16.anIntArray4416[i_6_] / i_3_);
                if ((i_7_ ^ 0xffffffff) > -1)
                    i_7_ = 0;
                i_2_ += i_7_;
                for (int i_8_ = i_7_; i_8_ < 128; i_8_++) {
                    int i_9_ = Class68_Sub20.anIntArray3090[i_2_++];
                    int i_10_ = Class79.anIntArray1402[i_0_ + i_4_++];
                    if ((i_9_ ^ 0xffffffff) == -1)
                        GameException
                                .aSprite_2246.pixels
                                [i_5_++]
                                = i_10_;
                    else {
                        int i_11_ = 18 + i_9_;
                        if ((i_11_ ^ 0xffffffff) < -256)
                            i_11_ = 255;
                        int i_12_ = 256 - (18 + i_9_);
                        if ((i_12_ ^ 0xffffffff) < -256)
                            i_12_ = 255;
                        i_9_ = Class68_Sub25.anIntArray3172[i_9_];
                        GameException
                                .aSprite_2246.pixels
                                [i_5_++]
                                = (((Class120.method1740
                                ((Class120.method1740(65280, i_9_) * i_11_
                                        + i_12_ * Class120.method1740(i_10_,
                                        65280)),
                                        16711680))
                                + (Class120.method1740
                                (-16711936,
                                        (i_11_ * Class120.method1740(i_9_,
                                                16711935)
                                                + (i_12_
                                                * Class120.method1740(i_10_,
                                                16711935))))))
                                >> -1223440824);
                    }
                }
                for (int i_13_ = 0; i_7_ > i_13_; i_13_++)
                    GameException.aSprite_2246
                            .pixels[i_5_++]
                            = Class79.anIntArray1402[i_4_++ + i_0_];
                i_4_ += Class79.anInt1401 - 128;
            }
            GameException.aSprite_2246
                    .method1108(i_0_, i);
        }
    }

    public static void method1339(String string, Throwable throwable, int i) {
        anInt1291++;
        do {
            try {
                String string_14_ = "";
                if (throwable != null)
                    string_14_ = PlayerDefinition.method1776(throwable, -113);
                if (string != null) {
                    if (throwable != null)
                        string_14_ += " | ";
                    string_14_ += (String) string;
                }
                System.out.println("Error: " + string_14_);
                string_14_ = string_14_.replace(':', '.');
                string_14_ = string_14_.replace('@', '_');
                string_14_ = string_14_.replace((char) i, '_');
                string_14_ = string_14_.replace('#', '_');
                if (Class85.aSignLink_1553.anApplet1042 != null) {
                    JagSocket class31
                            = (Class85.aSignLink_1553.method562
                            (new URL(Class85.aSignLink_1553.anApplet1042
                                    .getCodeBase(),
                                    ("clienterror.ws?c=" + Class92.anInt1648
                                            + "&u=" + Class72_Sub1.aLong3285 + "&v1="
                                            + SignLink.javaVendor + "&v2="
                                            + SignLink.javaVersion + "&e="
                                            + string_14_)),
                                    i + -38));
                    while ((class31.anInt555 ^ 0xffffffff) == -1)
                        Class50.method528(i ^ ~0x22, 1L);
                    if (class31.anInt555 != 1)
                        break;
                    DataInputStream datainputstream
                            = (DataInputStream) class31.playerDefSocket;
                    datainputstream.read();
                    datainputstream.close();
                }
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    public static void method1340(int i, int i_15_) {
        anInt1295++;
        if ((i_15_ ^ 0xffffffff) != 0
                && Class68_Sub13_Sub25.method824(i_15_, (byte) -2)) {
            if (i != -1)
                method1340(104, 115);
            Class45[] class45s
                    = Class68_Sub13_Sub36.aClass45ArrayArray4040[i_15_];
            for (int i_16_ = 0; i_16_ < class45s.length; i_16_++) {
                Class45 class45 = class45s[i_16_];
                if (class45.anObjectArray759 != null) {
                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                    class68_sub29.anObjectArray3237 = class45.anObjectArray759;
                    class68_sub29.aClass45_3239 = class45;
                    Class68_Sub28_Sub1.doAction(class68_sub29, (byte) 124,
                            2000000);
                }
            }
        }
    }

    public static void method1341(byte i) {
        for (int i_17_ = -1;
             (client.anInt2382 ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
            int i_18_;
            if ((i_17_ ^ 0xffffffff) != 0)
                i_18_ = Class85.anIntArray1563[i_17_];
            else
                i_18_ = 2047;
            Class1_Sub6_Sub2 class1_sub6_sub2
                    = Class68_Sub13_Sub4.aClass1_Sub6_Sub2Array3483[i_18_];
            if (class1_sub6_sub2 != null && class1_sub6_sub2.anInt2569 > 0) {
                class1_sub6_sub2.anInt2569--;
                if (class1_sub6_sub2.anInt2569 == 0)
                    class1_sub6_sub2.aRSString_2576 = null;
            }
        }
        for (int i_19_ = 0;
             (Class13_Sub2.anInt2645 ^ 0xffffffff) < (i_19_ ^ 0xffffffff);
             i_19_++) {
            int i_20_ = Class68_Sub10.anIntArray2906[i_19_];
            Class1_Sub6_Sub1 class1_sub6_sub1
                    = Class102.aClass1_Sub6_Sub1Array1746[i_20_];
            if (class1_sub6_sub1 != null
                    && (class1_sub6_sub1.anInt2569 ^ 0xffffffff) < -1) {
                class1_sub6_sub1.anInt2569--;
                if (class1_sub6_sub1.anInt2569 == 0)
                    class1_sub6_sub1.aRSString_2576 = null;
            }
        }
        int i_21_ = 49 % ((i - 54) / 63);
        anInt1299++;
    }

    public static void method1342(boolean bool) {
        anIntArray1294 = null;
        aRSString_1288 = null;
        aShortArray1300 = null;
        if (bool == true) {
            aRSString_1290 = null;
            aRSString_1289 = null;
            aRSString_1296 = null;
        }
    }

    static {
        aRSString_1288 = RSString.newRsString("Fps:");
        aRSString_1289 = aRSString_1290;
        anInt1293 = 0;
        aRSString_1296 = RSString.newRsString("_labels");
        anInt1298 = -1;
        anIntArray1294 = new int[100];
        aShortArray1300 = new short[]{960, 957, -21568, -21571, 22464};
    }
}
