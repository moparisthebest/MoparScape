/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class9 {
    public static int anInt166;
    public static int anInt167;
    public int anInt168;
    public static int anInt169 = 0;
    public boolean aBoolean170;
    public static int anInt171;
    public int anInt172 = -1;
    public static Class21renamed aClass21_173;
    public static int anInt174;
    public int anInt175;
    public static int anInt176;
    public static int anInt177 = 0;
    public static int[] anIntArray178
            = {0, 3, 0, 0, 0, 0, 6, 0, 2, 0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 14,
            0, 0, 0, 5, 0, 0, 0, 15, 4, 0, 0, 0, 0, 10, 0, 2, 0, 0, 4, 6, 4, 0,
            0, 0, 0, -1, 0, 10, 7, 0, 0, 0, 0, 24, 0, 3, 0, 5, 0, 0, 0, 0, 6,
            0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0,
            0, 0, -1, 0, 0, 0, 7, 0, 0, 0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0,
            6, 4, 0, 15, 0, 0, 1, 0, -2, 8, 5, 8, -1, 0, 0, -2, 0, 0, 0, 0, 0,
            8, 0, -1, 0, 0, -2, 0, 20, 0, -2, 10, 0, -2, 0, -1, 0, 2, 0, 0, -1,
            0, 0, -2, 4, -1, 0, 8, 0, 0, 1, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2,
            1, 4, -2, 8, 0, -1, 2, -1, -2, 0, 0, 0, 0, 6, 0, 3, 0, 0, 0, 2, -1,
            0, 6, 0, 7, 2, 0, 0, 0, 0, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 6, 0, 0,
            0, 0, -2, 6, -1, 4, 0, 0, -2, 12, 0, 0, 1, 9, 0, -1, 0, 0, 5, 0,
            -1, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 6, 4, 5, 6, 2, 0, 5, -1, 0, 0,
            -2};

    public void method207(byte i, Stream class68_sub14, int i_0_) {
        if (i != -64)
            anInt172 = 75;
        anInt167++;
        for (; ; ) {
            int i_1_ = class68_sub14.readUnsignedByte(i + -6613);
            if ((i_1_ ^ 0xffffffff) == -1)
                break;
            method209(i_1_, i_0_, (byte) -87, class68_sub14);
        }
    }

    public static void method208(byte i) {
        anInt174++;
        if (Class21_Sub1.aBoolean2705) {
            if (i < 60)
                anInt177 = -52;
            Class45 class45 = Class66.method637(Class107.anInt1821, false,
                    Class68_Sub20_Sub16.anInt4422);
            if (class45 != null && class45.anObjectArray806 != null) {
                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                class68_sub29.anObjectArray3237 = class45.anObjectArray806;
                class68_sub29.aClass45_3239 = class45;
                Class68_Sub13_Sub16.method776(class68_sub29, 16);
            }
            Class21_Sub1.aBoolean2705 = false;
            Class113.method1682(class45, -119);
        }
    }

    public void method209(int i, int i_2_, byte i_3_,
                          Stream class68_sub14) {
        anInt166++;
        if ((i ^ 0xffffffff) != -2) {
            if (i == 2)
                anInt175 = class68_sub14.readUnsignedByte(-6677);
            else if (i != 3) {
                if (i != 5) {
                    if ((i ^ 0xffffffff) != -8) {
                        if ((i ^ 0xffffffff) == -9)
                            Class68_Sub9.anInt2891 = i_2_;
                        else if ((i ^ 0xffffffff) != -10) {
                            if (i != 10) {
                                if (i != 11) {
                                    if ((i ^ 0xffffffff) != -13) {
                                        if (i != 13) {
                                            if ((i ^ 0xffffffff) == -15)
                                                class68_sub14.readUnsignedByte(-6677);
                                        } else
                                            class68_sub14
                                                    .method921((byte) 105);
                                    }
                                } else
                                    class68_sub14.readUnsignedByte(-6677);
                            }
                        } else
                            class68_sub14.readUnsignedWord(1355769544);
                    } else
                        anInt172
                                = (PacketStream.method968
                                (class68_sub14.method921((byte) -105), -16844));
                } else
                    aBoolean170 = false;
            } else {
                anInt175 = class68_sub14.readUnsignedWord(1355769544);
                if ((anInt175 ^ 0xffffffff) == -65536)
                    anInt175 = -1;
            }
        } else
            anInt168
                    = PacketStream
                    .method968(class68_sub14.method921((byte) -63), -16844);
        if (i_3_ >= -51)
            method209(64, -117, (byte) 66, null);
    }

    public static void method210(int i, byte i_4_) {
        Class75_Sub1.aClass98_3294.method1564(-18767, i);
        Class123.aClass98_2129.method1564(-18767, i);
        if (i_4_ != 35)
            anInt169 = -106;
        Class45.aClass98_918.method1564(-18767, i);
        anInt171++;
    }

    public static void method211(int i) {
        aClass21_173 = null;
        int i_5_ = -116 % ((i - 74) / 49);
        anIntArray178 = null;
    }

    public static void method212(int i, int i_6_, int i_7_, int i_8_, int i_9_,
                                 int i_10_, int i_11_, int i_12_, int i_13_,
                                 int i_14_) {
        anInt176++;
        if (i_8_ != 1580177356)
            anIntArray178 = null;
        if (i_7_ == i_13_ && i_11_ == i && i_6_ == i_12_ && i_9_ == i_10_)
            Class48.method514(i_13_, i_14_, i, i_12_, (byte) -121, i_9_);
        else {
            int i_15_ = i;
            int i_16_ = i_13_;
            int i_17_ = i_13_ * 3;
            int i_18_ = i * 3;
            int i_19_ = i_11_ * 3;
            int i_20_ = 3 * i_6_;
            int i_21_ = 3 * i_7_;
            int i_22_ = i_12_ + -i_20_ + (i_21_ + -i_13_);
            int i_23_ = 3 * i_10_;
            int i_24_ = i_23_ + -i_19_ - (i_19_ + -i_18_);
            int i_25_ = -i + (i_19_ + i_9_) - i_23_;
            int i_26_ = -i_21_ + i_20_ - (i_21_ - i_17_);
            int i_27_ = i_21_ - i_17_;
            int i_28_ = i_19_ + -i_18_;
            for (int i_29_ = 128; i_29_ <= 4096; i_29_ += 128) {
                int i_30_ = i_29_ * i_29_ >> 1580177356;
                int i_31_ = i_29_ * i_30_ >> -1694578516;
                int i_32_ = i_25_ * i_31_;
                int i_33_ = i_31_ * i_22_;
                int i_34_ = i_26_ * i_30_;
                int i_35_ = i_30_ * i_24_;
                int i_36_ = i_29_ * i_27_;
                int i_37_ = i_29_ * i_28_;
                int i_38_ = (i_36_ + i_33_ - -i_34_ >> -231362932) + i_13_;
                int i_39_ = (i_37_ + i_35_ + i_32_ >> -88676884) + i;
                Class48.method514(i_16_, i_14_, i_15_, i_38_, (byte) -121,
                        i_39_);
                i_15_ = i_39_;
                i_16_ = i_38_;
            }
        }
    }

    public Class9() {
        anInt168 = 0;
        aBoolean170 = true;
        anInt175 = -1;
    }
}
