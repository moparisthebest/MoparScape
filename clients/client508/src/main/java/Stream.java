/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

public class Stream extends Class68 {

    //public static BigInteger publicKey = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    //public static BigInteger modulus = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    public static BigInteger publicKey = null;
    public static BigInteger modulus = null;
    public int currentOffset;
    public static int anInt2946;
    public static int anInt2947;
    public static int anInt2948;
    public static int anInt2949;
    public static int anInt2950;
    public static int anInt2951;
    public static int anInt2952;
    public static int anInt2953;
    public static int anInt2954;
    public static int anInt2955;
    public static int anInt2956;
    public static int anInt2957;
    public static int anInt2958;
    public static int anInt2959;
    public byte[] buffer;
    public static int anInt2961;
    public static int anInt2962;
    public static int anInt2963;
    public static int anInt2964;
    public static int anInt2965;
    public static int anInt2966;
    public static int anInt2967;
    public static int anInt2968;
    public static int anInt2969;
    public static int anInt2970;
    public static int anInt2971;
    public static int anInt2972;
    public static int anInt2973;
    public static int anInt2974;
    public static int anInt2975;
    public static int anInt2976;
    public static int anInt2977;
    public static int anInt2978;
    public static int anInt2979;
    public static int anInt2980;
    public static int anInt2981;
    public static int anInt2982;
    public static int anInt2983;
    public static boolean aBoolean2984 = false;
    public static int anInt2985;
    public static int anInt2986;
    public static int anInt2987;
    public static int anInt2988;
    public static int anInt2989;
    public static int anInt2990;
    public static int anInt2991;
    public static int anInt2992;
    public static int anInt2993;
    public static Class68_Sub17 aClass68_Sub17_2994 = new Class68_Sub17(0, 0);
    public static int anInt2995;
    public static int anInt2996;
    public static int anInt2997;
    public static int anInt2998;
    public static int anInt2999;
    public static int anInt3000;
    public static int anInt3001;
    public static int anInt3002;
    public static int anInt3003;
    public static int anInt3004;
    public static int[] anIntArray3005;
    public static Sprite[] aSpriteArray3006;
    public static int anInt3007;
    public static Class113 aClass113_3008 = new Class113(4096);
    public static Class113 aClass113_3009;
    public static Class92[] aClass92Array3010;

    public long method908(int i, byte i_0_) {
        i--;
        int i_1_ = 67 % ((28 - i_0_) / 39);
        anInt2986++;
        if ((i ^ 0xffffffff) > -1 || i > 7) {
            throw new IllegalArgumentException();
        }
        int i_2_ = i * 8;
        long l = 0L;
        for (/**/; (i_2_ ^ 0xffffffff) <= -1; i_2_ -= 8) {
            l |= ((long) buffer[currentOffset++] & 0xffL) << i_2_;
        }
        return l;
    }

    public int readUnsignedWordBigEndian(int i) {
        currentOffset += 2;
        anInt2950++;
        return (((0xff & buffer[currentOffset - 1]) << -1387447512) + (buffer[currentOffset - 2] & 0xff));
    }

    public RSString readString(int i) {
        anInt2972++;
        int i_4_ = currentOffset;
        while ((buffer[currentOffset++] ^ 0xffffffff) != -1) {
            /* empty */
        }
        return Class68_Sub13_Sub27.method842(-i_4_ + (currentOffset - 1), buffer, i ^ 0x10, i_4_);
    }

    public void writeByte(int i_5_) {
        buffer[currentOffset++] = (byte) i_5_;
        anInt2985++;
    }

    public int method912(int i) {
        anInt2975++;
        int i_6_ = buffer[currentOffset] & i;
        if (i_6_ < 128) {
            return readUnsignedByte(-6677);
        }
        return -32768 + readUnsignedWord(i + 1355769289);
    }

    public void writeDWord_v1(byte i, int i_7_) {
        buffer[currentOffset++] = (byte) (i_7_ >> -2017770840);
        buffer[currentOffset++] = (byte) i_7_;
        buffer[currentOffset++] = (byte) (i_7_ >> -1565653576);
        buffer[currentOffset++] = (byte) (i_7_ >> 1786657648);
        anInt2973++;
    }

    public void writeString(RSString rsString) {
            anInt2965++;
            currentOffset += rsString.method1611(currentOffset, rsString.method1590((byte) -113), 0, buffer);
            buffer[currentOffset++] = (byte) 0;
    }

    public int readUnsignedWordA() {
        anInt2967++;
        currentOffset += 2;
        return (((buffer[currentOffset - 2] & 0xff) << 8) + (0xff & buffer[currentOffset - 1] - 128));
    }

    public void method916(long l, int i, int i_8_) {
        try {
            i_8_--;
            anInt2968++;
            if ((i_8_ ^ 0xffffffff) > -1 || i_8_ > 7) {
                throw new IllegalArgumentException();
            }
            if (i >= -106) {
                readBytes(-115, 77, 125, null);
            }
            for (int i_9_ = 8 * i_8_; i_9_ >= 0; i_9_ -= 8) {
                buffer[currentOffset++] = (byte) (int) (l >> i_9_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception, ("lh.MA(" + l + ',' + i + ',' + i_8_ + ')'));
        }
    }

    public byte method917(boolean bool) {
        if (bool != false) {
            buffer = null;
        }
        anInt3004++;
        return (byte) -buffer[currentOffset++];
    }

    public void method918(int i, boolean bool) {
        buffer[currentOffset++] = (byte) (i >> 16);
        anInt2970++;
        buffer[currentOffset++] = (byte) (i >> 8);
        buffer[currentOffset++] = (byte) i;
        if (bool != false) {
            anIntArray3005 = null;
        }
    }

    public Stream(int i) {
        buffer = Class33.method412(i, (byte) -85);
        currentOffset = 0;
    }

    public byte method919(byte i) {
        anInt2961++;
        if (i <= 22) {
            method937(true);
        }
        return (byte) (buffer[currentOffset++] - 128);
    }

    public int method920(int i, int i_10_) {
        int i_11_ = 43 % ((i_10_ - 59) / 43);
        anInt2948++;
        int i_12_ = Class64.method622(currentOffset, false, i, buffer);
        writeDWord(i_12_);
        return i_12_;
    }

    public int method921(byte i) {
        currentOffset += 3;
        anInt2955++;
        int i_13_ = 78 / (-i / 42);
        return ((buffer[currentOffset + -1] & 0xff) + (buffer[currentOffset + -3] << -1337350736 & 0xff0000) - -((0xff & buffer[-2 + currentOffset]) << -1317980984));
    }

    public void writeByteC(int i_14_) {
        buffer[currentOffset++] = (byte) -i_14_;
        anInt2978++;
    }

    public void writeWord(int i) {
        buffer[currentOffset++] = (byte) (i >> -870131448);
        buffer[currentOffset++] = (byte) i;
        anInt2966++;
    }

    public void writeQWord(boolean bool, long l) {
        try {
            buffer[currentOffset++] = (byte) (int) (l >> 521528504);
            if (bool != true) {
                method912(-50);
            }
            anInt2992++;
            buffer[currentOffset++] = (byte) (int) (l >> 1869536624);
            buffer[currentOffset++] = (byte) (int) (l >> 1583085800);
            buffer[currentOffset++] = (byte) (int) (l >> -1133298784);
            buffer[currentOffset++] = (byte) (int) (l >> -820696616);
            buffer[currentOffset++] = (byte) (int) (l >> 138189072);
            buffer[currentOffset++] = (byte) (int) (l >> 1096640776);
            buffer[currentOffset++] = (byte) (int) l;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "lh.F(" + bool + ',' + l + ')');
        }
    }

    public int readDWord() {
        anInt2991++;
        currentOffset += 4;
        return ((buffer[currentOffset - 1] & 0xff) + ((buffer[currentOffset - 3] << 16 & 0xff0000) + (((buffer[currentOffset - 4] & 0xff) << 24) + (buffer[currentOffset - 2] << 8 & 0xff00))));
    }

    public void method926(int i, long l) {
        try {
            anInt2969++;
            if (i != 128) {
                anIntArray3005 = null;
            }
            writeDWordBigEndian((byte) 127, (int) (l >> -41780448));
            writeDWordBigEndian((byte) 127, (int) l);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    "lh.PA(" + i + ',' + l + ')');
        }
    }

    public int method927(boolean bool) {
        anInt2947++;
        if (bool != true) {
            return 89;
        }
        int i = buffer[currentOffset++];
        int i_16_ = 0;
        for (/**/; i < 0; i = buffer[currentOffset++]) {
            i_16_ = (i_16_ | 0x7f & i) << -731912441;
        }
        return i | i_16_;
    }

    public Stream(byte[] is) {
        buffer = is;
        currentOffset = 0;
    }

    public int readDWord_v1() {
        anInt2971++;
        currentOffset += 4;
        return ((buffer[currentOffset - 1] << 16 & 0xff0000) + ((~0xffffff & buffer[currentOffset - 2] << 1242983576) + ((buffer[currentOffset - 4] & 0xff) << 8) + (0xff & buffer[currentOffset - 3])));
    }

    public void writeWordBigEndian(int i, byte i_17_) {
        buffer[currentOffset++] = (byte) i;
        buffer[currentOffset++] = (byte) (i >> -678861656);
        anInt3002++;
    }

    public int method930(boolean bool) {
        currentOffset += 3;
        if (bool != false) {
            aBoolean2984 = true;
        }
        anInt3000++;
        return (((buffer[currentOffset + -2] & 0xff) << 798639568) + ((buffer[currentOffset + -3] << -1935278584 & 0xff00) - -(buffer[currentOffset - 1] & 0xff)));
    }

    public void writeByteA(int i, int i_18_) {
        anInt3003++;
        buffer[currentOffset++] = (byte) (i_18_ + 128);
    }

    public int readDWord_v2(boolean bool) {
        anInt2962++;
        currentOffset += 4;
        return (((buffer[currentOffset - 3] & 0xff) << 357099128) + ((buffer[currentOffset - 4] & 0xff) << -772724656) + (((0xff & buffer[currentOffset - 1]) << -63088472) + (buffer[currentOffset - 2] & 0xff)));
    }

    public void doKeys() {
        try {
            anInt2995++;
            int i = currentOffset;
            byte[] data = new byte[i];
            currentOffset = 0;
            readBytes(0, 0, i, data);
            BigInteger message = new BigInteger(data);
            BigInteger encryptedMessage = message;
            if (publicKey != null && modulus != null)
                encryptedMessage = message.modPow(publicKey, modulus);
            byte[] encryptedData = encryptedMessage.toByteArray();
            currentOffset = 0;
            writeByte(encryptedData.length);
            writeBytes(encryptedData.length, 0, encryptedData);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("lh.UA(" + false + ',' + (publicKey != null ? "{...}"
                            : "null") + ',' + (modulus != null ? "{...}"
                            : "null") + ')'));
        }
    }

    public static void method934(int i, Class21renamed class21) {
        Class75_Sub1_Sub1.aClass21_4586 = class21;
        if (i > -73) {
            method962(true);
        }
        anInt2974++;
    }

    public void method935(int i, int i_23_) {
        anInt2990++;
        if (i_23_ >= 118) {
            buffer[-1 + (currentOffset - i)] = (byte) i;
        }
    }

    public void method936(int i, int i_24_) {
        anInt2979++;
        if (i_24_ != 9684) {
            writeDWord_v1((byte) 121, 105);
        }
        if ((i & ~0x7f) != 0) {
            if ((i & ~0x3fff) != 0) {
                if ((~0x1fffff & i) != 0) {
                    if ((i & ~0xfffffff ^ 0xffffffff) != -1) {
                        writeByte(i >>> 1990185980 | 0x80);
                    }
                    writeByte(i >>> 1886938837 | 0x80);
                }
                writeByte((i | 0x2017fc) >>> 744113902);
            }
            writeByte(i >>> -2144201945 | 0x80);
        }
        writeByte(i & 0x7f);
    }

    public int method937(boolean bool) {
        anInt2993++;
        int i = 0;
        int i_25_ = method912(255);
        if (bool != true) {
            return -6;
        }
        for (/**/; i_25_ == 32767; i_25_ = method912(255)) {
            i += 32767;
        }
        i += i_25_;
        return i;
    }

    public void readBytes(int i, int i_26_, int i_27_, byte[] is) {
        anInt2976++;
        for (int i_28_ = i; i_28_ < i + i_27_; i_28_++) {
            is[i_28_] = buffer[currentOffset++];
        }
        if (i_26_ != 0) {
            writeDWord_v1((byte) -5, 85);
        }
    }

    public void writeDWord(int i_29_) {
        anInt2964++;
        buffer[currentOffset++] = (byte) (i_29_ >> 24);
        buffer[currentOffset++] = (byte) (i_29_ >> 16);
        buffer[currentOffset++] = (byte) (i_29_ >> 8);
        buffer[currentOffset++] = (byte) i_29_;
    }

    public int method940(byte i) {
        anInt2956++;
        currentOffset += 4;
        if (i < 87) {
            return 41;
        }
        return ((buffer[currentOffset - 1] << 269458744 & ~0xffffff) + ((buffer[currentOffset - 2] << -1234080752 & 0xff0000) - (-(buffer[currentOffset - 3] << -1038016920 & 0xff00) + -(buffer[currentOffset + -4] & 0xff))));
    }

    public long readQWord(int i) {
        anInt2989++;
        if (i < 27) {
            aSpriteArray3006 = null;
        }
        long l = 0xffffffffL & (long) readDWord();
        long l_30_ = (long) readDWord() & 0xffffffffL;
        return l_30_ + (l << -2097004448);
    }

    public void writeBytes(int i, int j, byte[] is) {
        anInt2988++;
        for (int k = j; j + i > k; k++) {
            buffer[currentOffset++] = is[k];
        }
    }

    public static void method943(boolean bool, int i) {
        if (i != 37) {
            if ((i ^ 0xffffffff) != -51) {
                if (i != 75) {
                    Class68_Sub13_Sub27.aFloat3913 = 8.0F;
                } else {
                    Class68_Sub13_Sub27.aFloat3913 = 6.0F;
                }
            } else {
                Class68_Sub13_Sub27.aFloat3913 = 4.0F;
            }
        } else {
            Class68_Sub13_Sub27.aFloat3913 = 3.0F;
        }
        if (bool == false) {
            Class68_Sub22.anInt3145 = -1;
            Class68_Sub22.anInt3145 = -1;
            anInt2959++;
        }
    }

    public void writeWordA(int i, int i_34_) {
        anInt2987++;
        buffer[currentOffset++] = (byte) (i >> -1905447096);
        buffer[currentOffset++] = (byte) (i + 128);
    }

    public int readUnsignedByteA() {
        anInt2981++;
        return buffer[currentOffset++] - 128 & 0xff;
    }

    public void method946(int[] is, int i, int i_35_, byte i_36_) {
        anInt2949++;
        int i_37_ = (i_35_ - i) / 8;
        int i_38_ = currentOffset;
        if (i_36_ <= 76) {
            method960(108);
        }
        currentOffset = i;
        for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
            int i_40_ = readDWord();
            int i_41_ = readDWord();
            int i_42_ = -957401312;
            int i_43_ = -1640531527;
            int i_44_ = 32;
            while ((i_44_-- ^ 0xffffffff) < -1) {
                i_41_ -= ((i_40_ >>> -1563092443 ^ i_40_ << 611091524) - -i_40_ ^ i_42_ + is[i_42_ >>> -1002502837 & 0x56c00003]);
                i_42_ -= i_43_;
                i_40_ -= ((i_41_ >>> 1337206757 ^ i_41_ << 363118692) - -i_41_ ^ i_42_ + is[i_42_ & 0x3]);
            }
            currentOffset -= 8;
            writeDWord(i_40_);
            writeDWord(i_41_);
        }
        currentOffset = i_38_;
    }

    public int readUnsignedWord(int i) {
        currentOffset += 2;
        anInt2977++;
        return (((buffer[currentOffset - 2] & 0xff) << 8) + (buffer[currentOffset - 1] & 0xff));
    }

    public RSString method948(int i) {
        if (i != 23733) {
            return null;
        }
        anInt2953++;
        if (buffer[currentOffset] == 0) {
            currentOffset++;
            return null;
        }
        return readString(i ^ 0x5cca);
    }

    public int readUnsignedByteS() {
        anInt3001++;
        return 128 - buffer[currentOffset++] & 0xff;
    }

    public int readUnsignedByte(int i) {
        anInt2963++;
        return 0xff & buffer[currentOffset++];
    }

    public void method951(int i, int i_45_) {
        if (i_45_ < -94) {
            anInt2999++;
            buffer[-i + (currentOffset - 4)] = (byte) (i >> 759933560);
            buffer[-3 + currentOffset - i] = (byte) (i >> 520407888);
            buffer[-2 + (currentOffset + -i)] = (byte) (i >> -1078182744);
            buffer[-i + (currentOffset - 1)] = (byte) i;
        }
    }

    public void method952(BigInteger biginteger, byte i,
                          BigInteger biginteger_46_) {
        try {
            anInt2946++;
            int i_47_ = readUnsignedByte(-6677);
            byte[] is = new byte[i_47_];
            readBytes(0, 0, i_47_, is);
            BigInteger biginteger_48_ = new BigInteger(is);
            BigInteger biginteger_49_ = biginteger_48_.modPow(biginteger, biginteger_46_);
            if (i != -88) {
                aClass113_3008 = null;
            }
            byte[] is_50_ = biginteger_49_.toByteArray();
            currentOffset = 0;
            writeBytes(is_50_.length, 0, is_50_);
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("lh.N(" + (biginteger != null ? "{...}"
                            : "null") + ',' + i + ',' + (biginteger_46_ != null ? "{...}"
                            : "null") + ')'));
        }
    }

    public void writeByteS(int i_51_) {
        anInt2997++;
        buffer[currentOffset++] = (byte) (-i_51_ + 128);
    }

    public void writeDWord_v2(int i, int i_52_) {
        anInt2982++;
        buffer[currentOffset++] = (byte) (i_52_ >> -925760816);
        buffer[currentOffset++] = (byte) (i_52_ >> 1324535448);
        buffer[currentOffset++] = (byte) i_52_;
        buffer[currentOffset++] = (byte) (i_52_ >> -4948312);
    }

    public byte method955(int i) {
        anInt2998++;
        return buffer[currentOffset++];
    }

    public void method956(int i, int i_53_) {
        anInt2951++;
        if (i_53_ >= (i ^ 0xffffffff) && (i ^ 0xffffffff) > -129) {
            writeByte(i);
        } else if (i >= 0 && (i ^ 0xffffffff) > -32769) {
            writeWord(i + 32768);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int method957(int i) {
        anInt2957++;
        if (i != -22489) {
            return -87;
        }
        currentOffset += 2;
        int i_54_ = ((0xff & buffer[-1 + currentOffset]) + (0xff00 & buffer[-2 + currentOffset] << -1713538328));
        if (i_54_ > 32767) {
            i_54_ -= 65536;
        }
        return i_54_;
    }

    public void writeWordBigEndianA(byte i, int i_55_) {
        anInt2983++;
        buffer[currentOffset++] = (byte) (128 + i_55_);
        buffer[currentOffset++] = (byte) (i_55_ >> -1544045528);
    }

    public void writeDWordBigEndian(byte i, int i_56_) {
        anInt2952++;
        buffer[currentOffset++] = (byte) i_56_;
        buffer[currentOffset++] = (byte) (i_56_ >> 1279827400);
        buffer[currentOffset++] = (byte) (i_56_ >> -882770384);
        buffer[currentOffset++] = (byte) (i_56_ >> 1432242680);
    }

    public int method960(int i) {
        if (i != 32767) {
            return 90;
        }
        int i_57_ = buffer[currentOffset] & 0xff;
        anInt2958++;
        if ((i_57_ ^ 0xffffffff) > -129) {
            return readUnsignedByte(-6677) - 64;
        }
        return -49152 + readUnsignedWord(1355769544);
    }

    public int readUnsignedByteC() {
        anInt2996++;
        return -buffer[currentOffset++] & 0xff;
    }

    public static void method962(boolean bool) {
        anIntArray3005 = null;
        aSpriteArray3006 = null;
        aClass92Array3010 = null;
        aClass113_3009 = null;
        aClass113_3008 = null;
        aClass68_Sub17_2994 = null;
        if (bool != false) {
            method962(true);
        }
    }

    public int readUnsignedWordBigEndianA() {
        anInt2980++;
        currentOffset += 2;
        return (((buffer[currentOffset - 1] & 0xff) << 8) + (buffer[currentOffset - 2] - 128 & 0xff));
    }
}
