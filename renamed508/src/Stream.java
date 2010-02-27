/* Class68_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

class Stream extends Node
{
    int position;
    static int anInt2948;
    static int anInt2949;
    static int anInt2950;
    static int anInt2951;
    static int anInt2952;
    static int anInt2953;
    static int anInt2954;
    static int anInt2955;
    static int cameraPositionX_local;
    static int anInt2957;
    static int anInt2958;
    static int anInt2959;
    static int anInt2960;
    static int anInt2961;
    byte[] buffer;
    static int anInt2963;
    static int anInt2964;
    static int anInt2965;
    static int anInt2966;
    static int anInt2967;
    static int anInt2968;
    static int anInt2969;
    static int anInt2970;
    static int anInt2971;
    static int anInt2972;
    static int anInt2973;
    static int anInt2974;
    static int anInt2975;
    static int anInt2976;
    static int anInt2977;
    static int anInt2978;
    static int anInt2979;
    static int anInt2980;
    static int anInt2981;
    static int anInt2982;
    static int anInt2983;
    static int anInt2984;
    static int anInt2985;
    static boolean aBoolean2986 = false;
    static int anInt2987;
    static int anInt2988;
    static int anInt2989;
    static int anInt2990;
    static int anInt2991;
    static int anInt2992;
    static int anInt2993;
    static int anInt2994;
    static int anInt2995;
    static Class68_Sub17 aClass68_Sub17_2996 = new Class68_Sub17(0, 0);
    static int anInt2997;
    static int anInt2998;
    static int anInt2999;
    static int anInt3000;
    static int anInt3001;
    static int anInt3002;
    static int anInt3003;
    static int anInt3004;
    static int anInt3005;
    static int anInt3006;
    static int[] anIntArray3007;
    static Sprite[] aClass68_Sub20_Sub10_Sub1Array3008;
    static int anInt3009;
    static NodeCache aClass113_3010 = new NodeCache(4096);
    static NodeCache aClass113_3011;
    static Class92[] aClass92Array3012;

    final long readBytes(int size)
    {
        size--;
        if (size < 0 || size > 7)
            throw new IllegalArgumentException();
        int shift = size * 8;
        long l = 0L;
        for (/**/; shift >= 0; shift -= 8)
            l |= ((long) (buffer[position++]) & 0xffL) << shift;
        return l;
    }

    final int readLEUShort()
    {
        ((Stream) this).position += 2;
        return (((0xff & (buffer[position - 1])) << 8) + ((buffer[position - 2]) & 0xff));
    }

    final MutableString readString()
    {
        int start = position;
        while ((buffer[position++]) != 0)
            ;
        return Class68_Sub13_Sub27.method842((position - 1 - start), buffer, start);
    }

    final void writeByte(int i_5_)
    {
        buffer[position++] = (byte) i_5_;
    }

    final int method912(int i)
    {
        int i_6_ = ((buffer[position]) & i);
        if (i_6_ < 128)
            return readUByte();
        return readUShort() - 32768;
    }

    final void method913(byte i, int i_7_)
    {
        buffer[position++] = (byte) (i_7_ >> 8);
        buffer[position++] = (byte) i_7_;
        buffer[position++] = (byte) (i_7_ >> 24);
        buffer[position++] = (byte) (i_7_ >> 16);
    }

    final void writeString(MutableString str)
    {
        position += str.method1617(position, str.getLength(), 0, buffer);
        buffer[position++] = (byte) 0;
    }

    final int readUShortA()
    {
        position += 2;
        return ((((buffer[position - 2]) & 0xff) << 8) + (0xff & (buffer[position - 1]) - 128));
    }

    final void writeBytes(long l, int count)
    {
        count--;
        if (count < 0 || count > 7)
            throw new IllegalArgumentException();
        for (int shift = 8 * count; shift >= 0; shift -= 8)
            buffer[position++] = (byte) (l >> shift);
    }

    final byte readByteC()
    {
        return (byte) -buffer[position++];
    }

    final void writeTInteger(int i)
    {
        buffer[position++] = (byte) (i >> 16);
        buffer[position++] = (byte) (i >> 8);
        buffer[position++] = (byte) i;
    }

    Stream(int i)
    {
        buffer = Class33.allocateBuffer(i);
        position = 0;
    }

    final byte readByteA()
    {
        return (byte) ((buffer[position++]) - 128);
    }

    final int method920(int i, int i_10_)
    {
        int i_12_ = Object1.method622(position, false, i, buffer);
        writeDWord(i_12_);
        return i_12_;
    }

    final int readTInteger()
    {
        position += 3;
        return (((buffer[position - 1]) & 0xff) + ((buffer[position - 2]) << 8 & 0xff) + ((buffer[position - 3]) << 16 & 0xff0000));
    }

    final void writeByteC(int v)
    {
        buffer[position++] = (byte) -v;
    }

    final void writeShort(int i)
    {
        buffer[position++] = (byte) (i >> 8);
        buffer[position++] = (byte) i;
    }

    final void writeLong(long l)
    {
        buffer[position++] = (byte) (l >> 56);
        buffer[position++] = (byte) (l >> 48);
        buffer[position++] = (byte) (l >> 40);
        buffer[position++] = (byte) (l >> 32);
        buffer[position++] = (byte) (l >> 24);
        buffer[position++] = (byte) (l >> 16);
        buffer[position++] = (byte) (l >> 8);
        buffer[position++] = (byte) l;
    }

    final int readInteger()
    {
        position += 4;
        return (((buffer[position - 1]) & 0xff) + (((buffer[position - 2]) << 8 & 0xff00) + (((buffer[position - 3]) << 16 & 0xff0000) + (((buffer[position - 4]) & 0xff) << 24))));
    }

    final void writeLELong(long l)
    {
        writeLEInteger((int) (l >> 32));
        writeLEInteger((int) l);
    }

    final int method927()
    {
        int i = buffer[position++];
        int i_16_ = 0;
        for (/**/; i < 0; i = buffer[position++])
            i_16_ = (i_16_ | 0x7f & i) << 7;
        return i | i_16_;
    }

    Stream(byte[] is)
    {
        buffer = is;
        position = 0;
    }

    final int method928(int i)
    {
        position += 4;
        return (((buffer[position - 1]) << 16 & 0xff0000) + (((buffer[position - 2]) << 24 & ~0xffffff) + (((buffer[position - 3]) & 0xff)) + (((buffer[position - 4]) << 8 & 0xff))));
    }

    final void writeLEShort(int i)
    {
        buffer[position++] = (byte) i;
        buffer[position++] = (byte) (i >> 8);
    }

    final int method930(boolean bool)
    {
        position += 3;
        return ((((buffer[position - 1]) & 0xff)) + (((buffer[position - 2]) & 0xff) << 16) + (((buffer[position - 3]) << 8 & 0xff00)));
    }

    final void writeByteA(int v)
    {
        buffer[position++] = (byte) (v + 128);
    }

    final int method932(boolean bool)
    {
        position += 4;
        return (((((buffer[position - 1]) & 0xff) << 8) + ((buffer[position - 2]) & 0xff) + (((buffer[position - 3]) & 0xff) << 24) + (((buffer[position - 4]) & 0xff) << 16)));

    }

    final void rsaEncrypt(BigInteger key, BigInteger modulus)
    {
        try
        {
            int pos = position;
            byte[] enc = new byte[pos];
            position = 0;
            readBytes(0, pos, enc);
            BigInteger plainText = new BigInteger(enc);
            BigInteger cipherText = plainText.modPow(key, modulus);
            byte[] encrypted = cipherText.toByteArray();
            position = 0;
            writeByte(encrypted.length);
            writeBytes(encrypted.length, 0, encrypted);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("lh.UA(" + (key != null ? "{...}" : "null") + ',' + (modulus != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method934(int i, Class21 class21)
    {
        try
        {
            Class75_Sub1_Sub1.aClass21_4588 = class21;
            anInt2976++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("lh.FB(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    final void writeSizeByte(int i)
    {
        buffer[position - i - 1] = (byte) i;
    }

    final void method936(int i, int i_24_)
    {
        anInt2981++;
        if (i_24_ != 9684)
            method913((byte) 121, 105);
        if ((i & ~0x7f) != 0)
        {
            if ((i & ~0x3fff) != 0)
            {
                if ((~0x1fffff & i) != 0)
                {
                    if ((i & ~0xfffffff) != 0)
                        writeByte(i >>> 28 | 0x80);
                    writeByte(i >>> 21 | 0x80);
                }
                writeByte((i | 0x2017fc) >>> 14);
            }
            writeByte(i >>> 7 | 0x80);
        }
        writeByte(i & 0x7f);
    }

    final int method937(boolean bool)
    {
        anInt2995++;
        int i = 0;
        int i_25_ = method912(255);
        if (bool != true)
            return -6;
        for (/**/; i_25_ == 32767; i_25_ = method912(255))
            i += 32767;
        i += i_25_;
        return i;
    }

    final void readBytes(int off, int len, byte[] dest)
    {
        for (int i = off; i < off + len; i++)
            dest[i] = buffer[position++];
    }

    final void writeDWord(int v)
    {
        buffer[position++] = (byte) (v >> 24);
        buffer[position++] = (byte) (v >> 16);
        buffer[position++] = (byte) (v >> 8);
        buffer[position++] = (byte) v;
    }

    final int readLEInteger()
    {
        position += 4;
        return (((buffer[position - 1]) << 24 & ~0xffffff) + (((buffer[position - 2]) << 16 & 0xff0000) + (((buffer[position - 3]) << 8 & 0xff00)) + ((buffer[position - 4]) & 0xff)));
    }

    final long readLong()
    {
        long l = 0xffffffffL & (long) readInteger();
        long l_30_ = (long) readInteger() & 0xffffffffL;
        return l_30_ + (l << 32);
    }

    final void writeBytes(int len, int off, byte[] b)
    {
        try
        {
            for (int i_33_ = off; off + len > i_33_; i_33_++)
                buffer[position++] = b[i_33_];
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("lh.SA(" + len + ',' + off + ',' + (b != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method943(boolean bool, int i)
    {
        if (i != 37)
        {
            if (i != 50)
            {
                if (i != 75)
                    Class68_Sub13_Sub27.aFloat3915 = 8.0F;
                else
                    Class68_Sub13_Sub27.aFloat3915 = 6.0F;
            } else
                Class68_Sub13_Sub27.aFloat3915 = 4.0F;
        } else
            Class68_Sub13_Sub27.aFloat3915 = 3.0F;
        if (bool == false)
        {
            Class68_Sub22.anInt3147 = -1;
            Class68_Sub22.anInt3147 = -1;
            anInt2961++;
        }
    }

    final void writeShortA(int i)
    {
        buffer[position++] = (byte) (i >> 8);
        buffer[position++] = (byte) (i + 128);
    }

    final int readUByteA()
    {
        return 0xff & buffer[position++] - 128;
    }

    final void method946(int[] is, int i, int i_35_, byte i_36_)
    {
        try
        {
            anInt2951++;
            int i_37_ = (i_35_ - i) / 8;
            int i_38_ = ((Stream) this).position;
            if (i_36_ <= 76)
                method960(108);
            ((Stream) this).position = i;
            for (int i_39_ = 0; i_39_ < i_37_; i_39_++)
            {
                int i_40_ = readInteger();
                int i_41_ = readInteger();
                int i_42_ = -957401312;
                int i_43_ = -1640531527;
                int i_44_ = 32;
                while (i_44_-- > 0)
                {
                    i_41_ -= ((i_40_ >>> 5 ^ i_40_ << 4) + i_40_ ^ i_42_ + is[i_42_ >>> 11 & 0x56c00003]);
                    i_42_ -= i_43_;
                    i_40_ -= ((i_41_ >>> 5 ^ i_41_ << 4) + i_41_ ^ i_42_ + is[i_42_ & 0x3]);
                }
                ((Stream) this).position -= 8;
                writeDWord(i_40_);
                writeDWord(i_41_);
            }
            ((Stream) this).position = i_38_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("lh.TA(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_35_ + ',' + i_36_ + ')'));
        }
    }

    final int readUShort()
    {
        position += 2;
        return ((((buffer[position - 2]) & 0xff) << 8) + ((buffer[position - 1]) & 0xff));
    }

    final MutableString readStringSafe()
    {
        if ((buffer[position]) == 0)
        {
            position++;
            return null;
        }
        return readString();
    }

    final int readUByteS()
    {
        return (128 - buffer[position++] & 0xff);
    }

    final int readUByte()
    {
        return 0xff & buffer[position++];
    }

    final void writeSizeInteger(int i)
    {
        buffer[position - 4 - i] = (byte) (i >> 24);
        buffer[position - 3 - i] = (byte) (i >> 16);
        buffer[position - 2 - i] = (byte) (i >> 8);
        buffer[position - 1 - i] = (byte) i;
    }

    final void rsaDecrypt(BigInteger dkey, BigInteger modulus)
    {
        try
        {
            int size = readUByte();
            byte[] cipher = new byte[size];
            readBytes(0, size, cipher);
            BigInteger cipherText = new BigInteger(cipher);
            BigInteger plainText = cipherText.modPow(dkey, modulus);
            byte[] plain = plainText.toByteArray();
            position = 0;
            writeBytes(plain.length, 0, plain);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("lh.N(" + (dkey != null ? "{...}" : "null") + ',' + (modulus != null ? "{...}" : "null") + ')'));
        }
    }

    final void writeByteS(int v)
    {
        buffer[position++] = (byte) (128 - v);
    }

    final void method954(int i, int i_52_)
    {
        buffer[position++] = (byte) (i_52_ >> 16);
        buffer[position++] = (byte) (i_52_ >> 24);
        buffer[position++] = (byte) i_52_;
        buffer[position++] = (byte) (i_52_ >> 8);
    }

    final byte readByte()
    {
        return buffer[position++];
    }

    final void method956(int i, int i_53_)
    {
        if (i_53_ >= (i ^ 0xffffffff) && i < 128)
            writeByte(i);
        else if (i >= 0 && i < 32768)
            writeShort(i + 32768);
        else
            throw new IllegalArgumentException();
    }

    final int readShort()
    {
        position += 2;
        return (short) ((0xff & (buffer[position - 1])) + (0xff00 & (buffer[position - 2]) << 8));
    }

    final void writeLEShortA(int i_55_)
    {
        buffer[position++] = (byte) (i_55_ + 128);
        buffer[position++] = (byte) (i_55_ >> 8);
    }

    final void writeLEInteger(int v)
    {
        buffer[position++] = (byte) v;
        buffer[position++] = (byte) (v >> 8);
        buffer[position++] = (byte) (v >> 16);
        buffer[position++] = (byte) (v >> 24);
    }

    final int method960(int i)
    {
        int i_57_ = ((buffer[position]) & 0xff);
        if (i_57_ < 128)
            return readUByte() - 64;
        return readUShort() - 49152;
    }

    final int readUByteC()
    {
        return -buffer[position++] & 0xff;
    }

    public static void method962()
    {
        anIntArray3007 = null;
        aClass68_Sub20_Sub10_Sub1Array3008 = null;
        aClass92Array3012 = null;
        aClass113_3011 = null;
        aClass113_3010 = null;
        aClass68_Sub17_2996 = null;
    }

    final int readLEUShortA()
    {
        position += 2;
        return ((((buffer[position - 1]) & 0xff) << 8) + (0xff & (buffer[position - 2]) - 128));
    }
}
