/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class10 {
    public Stream aStream_179;
    public static byte[] aByteArray180
            = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public int[] anIntArray181;
    public int[] anIntArray182;
    public long aLong183;
    public int anInt184;
    public int anInt185;
    public int[] anIntArray186;
    public int[] anIntArray187;

    public boolean method213() {
        if (aStream_179.buffer == null)
            return false;
        return true;
    }

    public int method214() {
        int i = anIntArray186.length;
        int i_0_ = -1;
        int i_1_ = 2147483647;
        for (int i_2_ = 0; i_2_ < i; i_2_++) {
            if (anIntArray186[i_2_] >= 0 && anIntArray182[i_2_] < i_1_) {
                i_0_ = i_2_;
                i_1_ = anIntArray182[i_2_];
            }
        }
        return i_0_;
    }

    public void method215(int i) {
        aStream_179.currentOffset = anIntArray186[i];
    }

    public int method216() {
        return anIntArray186.length;
    }

    public void method217(byte[] is) {
        aStream_179.buffer = is;
        aStream_179.currentOffset = 10;
        int i = aStream_179.readUnsignedWord(1355769544);
        anInt184 = aStream_179.readUnsignedWord(1355769544);
        anInt185 = 500000;
        anIntArray187 = new int[i];
        int i_3_ = 0;
        while (i_3_ < i) {
            int i_4_ = aStream_179.readDWord();
            int i_5_ = aStream_179.readDWord();
            if (i_4_ == 1297379947) {
                anIntArray187[i_3_] = aStream_179.currentOffset;
                i_3_++;
            }
            aStream_179.currentOffset += i_5_;
        }
        aLong183 = 0L;
        anIntArray186 = new int[i];
        for (int i_6_ = 0; i_6_ < i; i_6_++)
            anIntArray186[i_6_] = anIntArray187[i_6_];
        anIntArray182 = new int[i];
        anIntArray181 = new int[i];
    }

    public static void method218() {
        aByteArray180 = null;
    }

    public int method219(int i, int i_7_) {
        if (i_7_ == 255) {
            int i_8_ = aStream_179.readUnsignedByte(-6677);
            int i_9_ = aStream_179.method927(true);
            if (i_8_ == 47) {
                aStream_179.currentOffset += i_9_;
                return 1;
            }
            if (i_8_ == 81) {
                int i_10_ = aStream_179.method921((byte) 77);
                i_9_ -= 3;
                int i_11_ = anIntArray182[i];
                aLong183 += (long) i_11_ * (long) (anInt185 - i_10_);
                anInt185 = i_10_;
                aStream_179.currentOffset += i_9_;
                return 2;
            }
            aStream_179.currentOffset += i_9_;
            return 3;
        }
        byte i_12_ = aByteArray180[i_7_ - 128];
        int i_13_ = i_7_;
        if (i_12_ >= 1)
            i_13_ |= aStream_179.readUnsignedByte(-6677) << 8;
        if (i_12_ >= 2)
            i_13_ |= aStream_179.readUnsignedByte(-6677) << 16;
        return i_13_;
    }

    public void method220() {
        aStream_179.buffer = null;
        anIntArray187 = null;
        anIntArray186 = null;
        anIntArray182 = null;
        anIntArray181 = null;
    }

    public int method221(int i) {
        int i_14_
                = aStream_179.buffer[aStream_179.currentOffset];
        if (i_14_ < 0) {
            i_14_ &= 0xff;
            anIntArray181[i] = i_14_;
            aStream_179.currentOffset++;
        } else
            i_14_ = anIntArray181[i];
        if (i_14_ == 240 || i_14_ == 247) {
            int i_15_ = aStream_179.method927(true);
            if (i_14_ == 247 && i_15_ > 0) {
                int i_16_ = ((aStream_179.buffer
                        [aStream_179.currentOffset])
                        & 0xff);
                if (i_16_ >= 241 && i_16_ <= 243 || i_16_ == 246
                        || i_16_ == 248 || i_16_ >= 250 && i_16_ <= 252
                        || i_16_ == 254) {
                    aStream_179.currentOffset++;
                    anIntArray181[i] = i_16_;
                    return method219(i, i_16_);
                }
            }
            aStream_179.currentOffset += i_15_;
            return 0;
        }
        return method219(i, i_14_);
    }

    public void method222(int i) {
        int i_17_ = aStream_179.method927(true);
        anIntArray182[i] += i_17_;
    }

    public long method223(int i) {
        return aLong183 + (long) i * (long) anInt185;
    }

    public void method224() {
        aStream_179.currentOffset = -1;
    }

    public void method225(int i) {
        anIntArray186[i] = aStream_179.currentOffset;
    }

    public int method226(int i) {
        int i_18_ = method221(i);
        return i_18_;
    }

    public Class10() {
        aStream_179 = new Stream(null);
    }

    public void method227(long l) {
        aLong183 = l;
        int i = anIntArray186.length;
        for (int i_19_ = 0; i_19_ < i; i_19_++) {
            anIntArray182[i_19_] = 0;
            anIntArray181[i_19_] = 0;
            aStream_179.currentOffset = anIntArray187[i_19_];
            method222(i_19_);
            anIntArray186[i_19_] = aStream_179.currentOffset;
        }
    }

    public boolean method228() {
        int i = anIntArray186.length;
        for (int i_20_ = 0; i_20_ < i; i_20_++) {
            if (anIntArray186[i_20_] >= 0)
                return false;
        }
        return true;
    }

    public Class10(byte[] is) {
        aStream_179 = new Stream(null);
        method217(is);
    }
}
