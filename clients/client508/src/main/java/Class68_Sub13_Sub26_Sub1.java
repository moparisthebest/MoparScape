/* Class68_Sub13_Sub26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.security.MessageDigest;

public class Class68_Sub13_Sub26_Sub1 extends Class68_Sub13_Sub26 {
    public static RSString aRSString_4602;
    public static RSString aRSString_4603;
    public static int anInt4604;
    public static RSString aRSString_4605;
    public static RSString aRSString_4606
            = RSString.newRsString("Created gameworld");
    public static Class45 aClass45_4607;
    public static RSString aRSString_4608;
    public static int[] anIntArray4609 = {0, 1, 2, 3};
    public static int anInt4610;
    public static int anInt4611;
    public static int anInt4612;
    public static RSString aRSString_4613;

    public static void method832(byte i) {
        anIntArray4609 = null;
        aRSString_4613 = null;
        aRSString_4602 = null;
        aRSString_4605 = null;
        aClass45_4607 = null;
        aRSString_4608 = null;
        aRSString_4603 = null;
        aRSString_4606 = null;
        if (i != -27)
            aRSString_4606 = null;
    }

    public int[][] method697(int i, boolean bool) {
        if (bool != true)
            return null;
        anInt4604++;
        int[][] is = aClass88_2939.method1496(i, (byte) -99);
        if (aClass88_2939.aBoolean1610 && this.method826(0)) {
            int[] is_0_ = is[0];
            int[] is_1_ = is[1];
            int[] is_2_ = is[2];
            int i_3_ = i % anInt3881 * anInt3881;
            for (int i_4_ = 0; Class68_Sub13_Sub19.anInt3746 > i_4_; i_4_++) {
                int i_5_ = anIntArray3872[i_3_ - -(i_4_ % anInt3882)];
                is_2_[i_4_] = Class120.method1740(255, i_5_) << 2143947524;
                is_1_[i_4_] = Class120.method1740(4080, i_5_ >> -299241436);
                is_0_[i_4_] = Class120.method1740(4080, i_5_ >> 2135415980);
            }
        }
        return is;
    }

    public static boolean method833(byte i, RSString class100) {
        anInt4612++;
        try {
            int i_6_ = class100.method1592((byte) -124, 44);
            if ((i_6_ ^ 0xffffffff) == 0)
                return false;
            RSString class100_7_ = class100.method1607(0, (byte) -74, i_6_);
            RSString class100_8_ = class100.method1615(i_6_ - -1, true);
            MessageDigest messagedigest = MessageDigest.getInstance("SHA");
            messagedigest.reset();
            messagedigest.update(class100_7_.method1575((byte) -124));
            byte[] is = messagedigest.digest();
            byte[] is_9_ = class100_8_.method1606((byte) 24);
            Stream class68_sub14 = new Stream(5000);
            class68_sub14.writeBytes(is_9_.length, 0, is_9_);
            class68_sub14.currentOffset = 0;
            class68_sub14.method952(Class71_Sub1.aBigInteger3251, (byte) -88,
                    Class68_Sub13_Sub5.aBigInteger3516);
            if (class68_sub14.buffer[0] != 1)
                return false;
            if (i >= -87)
                aRSString_4613 = null;
            for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -21; i_10_++) {
                if (is[i_10_] != class68_sub14.buffer[i_10_ + 1])
                    return false;
            }
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public static int method834(int i) {
        anInt4610++;
        if ((double) Class68_Sub13_Sub27.aFloat3913 == 3.0)
            return 37;
        if (i != 50)
            aClass45_4607 = null;
        if ((double) Class68_Sub13_Sub27.aFloat3913 == 4.0)
            return 50;
        if ((double) Class68_Sub13_Sub27.aFloat3913 == 6.0)
            return 75;
        return 100;
    }

    public static Class68_Sub20_Sub9 method835(int i, int i_11_, byte i_12_) {
        anInt4611++;
        if (i_12_ >= -119)
            method834(29);
        Class68_Sub20_Sub9 class68_sub20_sub9
                = ((Class68_Sub20_Sub9)
                Class68_Sub13_Sub12.aClass113_3647
                        .method1678((long) i_11_ << -506011488 | (long) i, -104));
        if (class68_sub20_sub9 == null) {
            class68_sub20_sub9 = new Class68_Sub20_Sub9(i_11_, i);
            Class68_Sub13_Sub12.aClass113_3647.method1677((byte) 121,
                    class68_sub20_sub9,
                    (class68_sub20_sub9
                            .aLong1218));
        }
        return class68_sub20_sub9;
    }

    static {
        aRSString_4608 = RSString.newRsString("Choose Option");
        aClass45_4607 = null;
        aRSString_4613 = RSString.newRsString("Ablegen");
        aRSString_4605 = aRSString_4608;
        aRSString_4602 = RSString.newRsString(":clanreq:");
        aRSString_4603 = aRSString_4606;
    }
}
