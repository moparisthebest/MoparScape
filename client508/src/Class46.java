/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46 {
    public Class42[] aClass42Array928;
    public int anInt929;
    public int anInt930;

    public Class68_Sub11_Sub1 method508() {
        byte[] is = method511();
        return new Class68_Sub11_Sub1(22050, is, 22050 * anInt929 / 1000,
                22050 * anInt930 / 1000);
    }

    public static Class46 method509(Class21renamed class21, int i, int i_0_) {
        byte[] is = class21.method338(i_0_, 0, i);
        if (is == null)
            return null;
        return new Class46(new Stream(is));
    }

    public int method510() {
        int i = 9999999;
        for (int i_1_ = 0; i_1_ < 10; i_1_++) {
            if (aClass42Array928[i_1_] != null
                    && aClass42Array928[i_1_].anInt711 / 20 < i)
                i = aClass42Array928[i_1_].anInt711 / 20;
        }
        if (anInt929 < anInt930 && anInt929 / 20 < i)
            i = anInt929 / 20;
        if (i == 9999999 || i == 0)
            return 0;
        for (int i_2_ = 0; i_2_ < 10; i_2_++) {
            if (aClass42Array928[i_2_] != null)
                aClass42Array928[i_2_].anInt711 -= i * 20;
        }
        if (anInt929 < anInt930) {
            anInt929 -= i * 20;
            anInt930 -= i * 20;
        }
        return i;
    }

    public byte[] method511() {
        int i = 0;
        for (int i_3_ = 0; i_3_ < 10; i_3_++) {
            if (aClass42Array928[i_3_] != null
                    && (aClass42Array928[i_3_].anInt712
                    + aClass42Array928[i_3_].anInt711) > i)
                i = (aClass42Array928[i_3_].anInt712
                        + aClass42Array928[i_3_].anInt711);
        }
        if (i == 0)
            return new byte[0];
        int i_4_ = 22050 * i / 1000;
        byte[] is = new byte[i_4_];
        for (int i_5_ = 0; i_5_ < 10; i_5_++) {
            if (aClass42Array928[i_5_] != null) {
                int i_6_ = aClass42Array928[i_5_].anInt712 * 22050 / 1000;
                int i_7_ = aClass42Array928[i_5_].anInt711 * 22050 / 1000;
                int[] is_8_
                        = aClass42Array928[i_5_]
                        .method477(i_6_, aClass42Array928[i_5_].anInt712);
                for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
                    int i_10_ = is[i_9_ + i_7_] + (is_8_[i_9_] >> 8);
                    if ((i_10_ + 128 & ~0xff) != 0)
                        i_10_ = i_10_ >> 31 ^ 0x7f;
                    is[i_9_ + i_7_] = (byte) i_10_;
                }
            }
        }
        return is;
    }

    public Class46(Stream class68_sub14) {
        aClass42Array928 = new Class42[10];
        for (int i = 0; i < 10; i++) {
            int i_11_ = class68_sub14.readUnsignedByte(-6677);
            if (i_11_ != 0) {
                class68_sub14.currentOffset--;
                aClass42Array928[i] = new Class42();
                aClass42Array928[i].method479(class68_sub14);
            }
        }
        anInt929 = class68_sub14.readUnsignedWord(1355769544);
        anInt930 = class68_sub14.readUnsignedWord(1355769544);
    }

    public Class46() {
        aClass42Array928 = new Class42[10];
    }
}
