/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10
{
    private Stream aClass68_Sub14_179;
    private static byte[] aByteArray180 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private int[] anIntArray181;
    int[] anIntArray182;
    private long aLong183;
    int anInt184;
    private int anInt185;
    private int[] anIntArray186;
    private int[] anIntArray187;

    final boolean method213()
    {
        if (((Stream) aClass68_Sub14_179).buffer == null)
            return false;
        return true;
    }

    final int method214()
    {
        int i = anIntArray186.length;
        int i_0_ = -1;
        int i_1_ = 2147483647;
        for (int i_2_ = 0; i_2_ < i; i_2_++)
        {
            if (anIntArray186[i_2_] >= 0 && ((Class10) this).anIntArray182[i_2_] < i_1_)
            {
                i_0_ = i_2_;
                i_1_ = ((Class10) this).anIntArray182[i_2_];
            }
        }
        return i_0_;
    }

    final void method215(int i)
    {
        ((Stream) aClass68_Sub14_179).position = anIntArray186[i];
    }

    final int method216()
    {
        return anIntArray186.length;
    }

    final void method217(byte[] is)
    {
        ((Stream) aClass68_Sub14_179).buffer = is;
        ((Stream) aClass68_Sub14_179).position = 10;
        int i = aClass68_Sub14_179.readUShort();
        ((Class10) this).anInt184 = aClass68_Sub14_179.readUShort();
        anInt185 = 500000;
        anIntArray187 = new int[i];
        int i_3_ = 0;
        while (i_3_ < i)
        {
            int i_4_ = aClass68_Sub14_179.readInteger();
            int i_5_ = aClass68_Sub14_179.readInteger();
            if (i_4_ == 1297379947)
            {
                anIntArray187[i_3_] = ((Stream) aClass68_Sub14_179).position;
                i_3_++;
            }
            ((Stream) aClass68_Sub14_179).position += i_5_;
        }
        aLong183 = 0L;
        anIntArray186 = new int[i];
        for (int i_6_ = 0; i_6_ < i; i_6_++)
            anIntArray186[i_6_] = anIntArray187[i_6_];
        ((Class10) this).anIntArray182 = new int[i];
        anIntArray181 = new int[i];
    }

    public static void method218()
    {
        aByteArray180 = null;
    }

    private final int method219(int i, int i_7_)
    {
        if (i_7_ == 255)
        {
            int i_8_ = aClass68_Sub14_179.readUByte();
            int i_9_ = aClass68_Sub14_179.method927();
            if (i_8_ == 47)
            {
                ((Stream) aClass68_Sub14_179).position += i_9_;
                return 1;
            }
            if (i_8_ == 81)
            {
                int i_10_ = aClass68_Sub14_179.readTInteger();
                i_9_ -= 3;
                int i_11_ = ((Class10) this).anIntArray182[i];
                aLong183 += (long) i_11_ * (long) (anInt185 - i_10_);
                anInt185 = i_10_;
                ((Stream) aClass68_Sub14_179).position += i_9_;
                return 2;
            }
            ((Stream) aClass68_Sub14_179).position += i_9_;
            return 3;
        }
        byte i_12_ = aByteArray180[i_7_ - 128];
        int i_13_ = i_7_;
        if (i_12_ >= 1)
            i_13_ |= aClass68_Sub14_179.readUByte() << 8;
        if (i_12_ >= 2)
            i_13_ |= aClass68_Sub14_179.readUByte() << 16;
        return i_13_;
    }

    final void method220()
    {
        ((Stream) aClass68_Sub14_179).buffer = null;
        anIntArray187 = null;
        anIntArray186 = null;
        ((Class10) this).anIntArray182 = null;
        anIntArray181 = null;
    }

    private final int method221(int i)
    {
        int i_14_ = (((Stream) aClass68_Sub14_179).buffer[((Stream) aClass68_Sub14_179).position]);
        if (i_14_ < 0)
        {
            i_14_ &= 0xff;
            anIntArray181[i] = i_14_;
            ((Stream) aClass68_Sub14_179).position++;
        } else
            i_14_ = anIntArray181[i];
        if (i_14_ == 240 || i_14_ == 247)
        {
            int i_15_ = aClass68_Sub14_179.method927();
            if (i_14_ == 247 && i_15_ > 0)
            {
                int i_16_ = ((((Stream) aClass68_Sub14_179).buffer[((Stream) aClass68_Sub14_179).position]) & 0xff);
                if (i_16_ >= 241 && i_16_ <= 243 || i_16_ == 246 || i_16_ == 248 || i_16_ >= 250 && i_16_ <= 252 || i_16_ == 254)
                {
                    ((Stream) aClass68_Sub14_179).position++;
                    anIntArray181[i] = i_16_;
                    return method219(i, i_16_);
                }
            }
            ((Stream) aClass68_Sub14_179).position += i_15_;
            return 0;
        }
        return method219(i, i_14_);
    }

    final void method222(int i)
    {
        int i_17_ = aClass68_Sub14_179.method927();
        ((Class10) this).anIntArray182[i] += i_17_;
    }

    final long method223(int i)
    {
        return aLong183 + (long) i * (long) anInt185;
    }

    final void method224()
    {
        ((Stream) aClass68_Sub14_179).position = -1;
    }

    final void method225(int i)
    {
        anIntArray186[i] = ((Stream) aClass68_Sub14_179).position;
    }

    final int method226(int i)
    {
        int i_18_ = method221(i);
        return i_18_;
    }

    public Class10()
    {
        aClass68_Sub14_179 = new Stream(null);
    }

    final void method227(long l)
    {
        aLong183 = l;
        int i = anIntArray186.length;
        for (int i_19_ = 0; i_19_ < i; i_19_++)
        {
            ((Class10) this).anIntArray182[i_19_] = 0;
            anIntArray181[i_19_] = 0;
            ((Stream) aClass68_Sub14_179).position = anIntArray187[i_19_];
            method222(i_19_);
            anIntArray186[i_19_] = ((Stream) aClass68_Sub14_179).position;
        }
    }

    final boolean method228()
    {
        int i = anIntArray186.length;
        for (int i_20_ = 0; i_20_ < i; i_20_++)
        {
            if (anIntArray186[i_20_] >= 0)
                return false;
        }
        return true;
    }

    Class10(byte[] is)
    {
        aClass68_Sub14_179 = new Stream(null);
        method217(is);
    }
}
