/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

final class MutableString implements Interface3
{
    static Class97 aClass97_2263;
    static boolean aBoolean2264;
    static int anInt2265;
    static int anInt2266;
    private boolean mutable = true;
    static int anInt2268;
    static int anInt2269;
    byte[] data;
    private static MutableString aClass100_2271 = Class112.makeMutableString(43, "Loading wordpack )2 ");
    static int anInt2272;
    static int hashCodeCounter;
    static int anInt2274;
    static int anInt2275;
    static int anInt2276;
    static int anInt2277;
    static int anInt2278;
    static int anInt2279;
    static int anInt2280;
    static boolean aBoolean2281;
    static int anInt2282;
    static int anInt2283;
    static int anInt2284;
    static int anInt2285;
    static int anInt2286;
    static int anInt2287;
    static int anInt2288;
    static int anInt2289;
    static int anInt2290;
    static int anInt2291;
    static int anInt2292;
    static int anInt2293;
    static int anInt2294;
    int length;
    static int anInt2296;
    static int anInt2297;
    static int anInt2298;
    static MutableString aClass100_2299;
    static int anInt2300;
    static int anInt2301;
    static int anInt2302;
    static int anInt2303;
    static int anInt2304;
    static int anInt2305;
    static int anInt2306;
    static MutableString aClass100_2307;
    static int anInt2308;
    static int anInt2309;
    private int hash;
    static int anInt2311;
    static int anInt2312;
    static int anInt2313;
    static int anInt2314;
    static int anInt2315;
    static int anInt2316;
    static int anInt2317;
    static int anInt2318;
    static MutableString aClass100_2319;
    static int anInt2320;
    static int anInt2321;
    static int anInt2322;
    static int anInt2323;
    static int anInt2324;
    static int anInt2325;
    static int anInt2326;
    static int anInt2327;
    /* synthetic */static Class aClass2328;

    final MutableString method1578(int i, int i_0_, int i_1_, MutableString class100_2_)
    {
        try
        {
            anInt2274++;
            if (!mutable)
                throw new IllegalArgumentException();
            if (i < 0 || i > i_0_ || i_0_ > ((MutableString) class100_2_).length)
                throw new IllegalArgumentException();
            hash = 0;
            if (((MutableString) this).length - (i - i_0_) > ((MutableString) this).data.length)
            {
                int i_3_;
                for (i_3_ = 1; ((((MutableString) this).length + ((MutableString) class100_2_).length) > i_3_); i_3_ += i_3_)
                {
                    /* empty */
                }
                byte[] is = new byte[i_3_];
                Class39.arraycopy(((MutableString) this).data, 0, is, 0, ((MutableString) this).length);
                ((MutableString) this).data = is;
            }
            Class39.arraycopy(((MutableString) class100_2_).data, i, ((MutableString) this).data, ((MutableString) this).length, i_0_ - i);
            ((MutableString) this).length += i_0_ - i;
            if (i_1_ != -10000)
                method1586(-123);
            return this;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.M(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (class100_2_ != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method1579(MutableString class100_4_, boolean bool)
    {
        try
        {
            anInt2289++;
            if (((MutableString) class100_4_).length > ((MutableString) this).length)
                return false;
            int i = (((MutableString) this).length - ((MutableString) class100_4_).length);
            for (int i_5_ = 0; ((MutableString) class100_4_).length > i_5_; i_5_++)
            {
                if (((MutableString) this).data[i_5_ + i] != ((MutableString) class100_4_).data[i_5_])
                    return false;
            }
            if (bool != true)
                method1611(60, -108);
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.A(" + (class100_4_ != null ? "{...}" : "null") + ',' + bool + ')');
        }
    }

    final URL toURL() throws MalformedURLException
    {
        return new URL(new String(data, 0, length));
    }

    final byte[] getData()
    {
        byte[] out = new byte[length];
        Class39.arraycopy(data, 0, out, 0, length);
        return out;
    }

    final MutableString method1582(byte i, int i_6_)
    {
        anInt2268++;
        if (i_6_ <= 0 || i_6_ > 255)
            throw new IllegalArgumentException("invalid char");
        if (i <= 85)
            aClass100_2307 = null;
        MutableString class100_7_ = new MutableString();
        ((MutableString) class100_7_).data = new byte[((MutableString) this).length + 1];
        ((MutableString) class100_7_).length = ((MutableString) this).length + 1;
        Class39.arraycopy(((MutableString) this).data, 0, ((MutableString) class100_7_).data, 0, ((MutableString) this).length);
        ((MutableString) class100_7_).data[((MutableString) this).length] = (byte) i_6_;
        return class100_7_;
    }

    final void toConsole()
    {
        String string;
        try
        {
            string = new String(data, 0, length, "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception)
        {
            string = new String(data, 0, length);
        }
        System.out.println(string);
    }

    final int charAt(int i)
    {
        return data[i] & 0xff;
    }

    public static void method1585(byte i)
    {
        aClass100_2307 = null;
        aClass100_2319 = null;
        aClass97_2263 = null;
        aClass100_2271 = null;
        aClass100_2299 = null;
        aBoolean2264 = true;
    }

    final long method1586(int i)
    {
        long l = 0L;
        for (int i_9_ = 0; i_9_ < ((MutableString) this).length; i_9_++)
            l = (-l + (l << 5) + (long) (0xff & ((MutableString) this).data[i_9_]));
        anInt2266++;
        return l;
    }

    private final boolean method1587(int i, boolean bool)
    {
        anInt2296++;
        boolean bool_11_ = false;
        boolean bool_12_ = bool;
        int i_13_ = 0;
        if (i < 1 || i > 36)
            i = 10;
        for (int i_14_ = 0; i_14_ < ((MutableString) this).length; i_14_++)
        {
            int i_15_ = 0xff & ((MutableString) this).data[i_14_];
            if (i_14_ == 0)
            {
                if (i_15_ == 45)
                {
                    bool_11_ = true;
                    continue;
                }
                if (i_15_ == 43)
                    continue;
            }
            if (i_15_ >= 48 && i_15_ <= 57)
                i_15_ -= 48;
            else if (i_15_ >= 65 && i_15_ <= 90)
                i_15_ -= 55;
            else if (i_15_ >= 97 && i_15_ <= 122)
                i_15_ -= 87;
            else
                return false;
            if (i <= i_15_)
                return false;
            if (bool_11_)
                i_15_ = -i_15_;
            int i_16_ = i_13_ * i + i_15_;
            if (i_16_ / i != i_13_)
                return false;
            i_13_ = i_16_;
            bool_12_ = true;
        }
        return bool_12_;
    }

    final URL toURL(URL url) throws MalformedURLException
    {
        return new URL(url, new String(data, 0, length));
    }

    final void drawString(int x, int y, Graphics graphics)
    {
        try
        {
            String string;
            try
            {
                string = new String(data, 0, length, "ISO-8859-1");
            } catch (java.io.UnsupportedEncodingException unsupportedencodingexception)
            {
                string = new String(data, 0, length);
            }
            graphics.drawString(string, x, y);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.JA(" + x + ',' + y + ',' + (graphics != null ? "{...}" : "null") + ')'));
        }
    }

    final int indexOf(int _char, int start)
    {
        byte c = (byte) _char;
        for (int idx = start; idx < length; idx++)
        {
            if (((MutableString) this).data[idx] == c)
                return idx;
        }
        return -1;
    }

    final MutableString method1591(boolean bool)
    {
        anInt2321++;
        if (bool != true)
            mutable = true;
        int i = 0;
        int i_24_ = ((MutableString) this).length;
        for (/**/; i < ((MutableString) this).length; i++)
        {
            if ((((MutableString) this).data[i] < 0 || ((MutableString) this).data[i] > 32) && (((MutableString) this).data[i] & 0xff) != 160)
                break;
        }
        for (/**/; (i < i_24_ && ((((MutableString) this).data[i_24_ - 1] >= 0 && ((MutableString) this).data[i_24_ - 1] <= 32) || ((0xff & ((MutableString) this).data[i_24_ - 1]) == 160))); i_24_--)
        {
            /* empty */
        }
        if (i == 0 && ((MutableString) this).length == i_24_)
            return this;
        MutableString class100_25_ = new MutableString();
        ((MutableString) class100_25_).length = i_24_ - i;
        ((MutableString) class100_25_).data = new byte[((MutableString) class100_25_).length];
        for (int i_26_ = 0; ((MutableString) class100_25_).length > i_26_; i_26_++)
            ((MutableString) class100_25_).data[i_26_] = ((MutableString) this).data[i + i_26_];
        return class100_25_;
    }

    final int method1592(byte i, MutableString class100_27_, int i_28_)
    {
        try
        {
            int[] is = new int[((MutableString) class100_27_).length];
            int[] is_29_ = new int[256];
            anInt2308++;
            int[] is_30_ = new int[((MutableString) class100_27_).length];
            for (int i_31_ = 0; i_31_ < is_29_.length; i_31_++)
                is_29_[i_31_] = ((MutableString) class100_27_).length;
            for (int i_32_ = 1; ((MutableString) class100_27_).length >= i_32_; i_32_++)
            {
                is[i_32_ - 1] = (((MutableString) class100_27_).length << 1) - i_32_;
                is_29_[Class120.method1746((((MutableString) class100_27_).data[i_32_ - 1]), 255)] = ((MutableString) class100_27_).length - i_32_;
            }
            int i_33_ = ((MutableString) class100_27_).length + 1;
            int i_34_ = ((MutableString) class100_27_).length;
            while (i_34_ > 0)
            {
                is_30_[i_34_ - 1] = i_33_;
                for (/**/; (i_33_ <= ((MutableString) class100_27_).length && (((MutableString) class100_27_).data[i_34_ - 1] != (((MutableString) class100_27_).data[i_33_ - 1]))); i_33_ = is_30_[i_33_ - 1])
                {
                    if (is[i_33_ - 1] >= ((MutableString) class100_27_).length - i_34_)
                        is[i_33_ - 1] = ((MutableString) class100_27_).length - i_34_;
                }
                i_34_--;
                i_33_--;
            }
            int i_35_ = i_33_;
            i_33_ = ((MutableString) class100_27_).length + 1 - i_35_;
            int i_36_ = 1;
            int i_37_ = 0;
            for (int i_38_ = 1; i_33_ >= i_38_; i_38_++)
            {
                is_30_[i_38_ - 1] = i_37_;
                for (/**/; (i_37_ >= 1 && (((MutableString) class100_27_).data[i_38_ - 1] != (((MutableString) class100_27_).data[i_37_ - 1]))); i_37_ = is_30_[i_37_ - 1])
                {
                    /* empty */
                }
                i_37_++;
            }
            while (i_35_ < ((MutableString) class100_27_).length)
            {
                for (int i_39_ = i_36_; i_35_ >= i_39_; i_39_++)
                {
                    if (is[i_39_ - 1] >= i_35_ + ((MutableString) class100_27_).length - i_39_)
                        is[i_39_ - 1] = (i_35_ - i_39_ + ((MutableString) class100_27_).length);
                }
                i_36_ = i_35_ + 1;
                i_35_ = i_33_ + (i_35_ - is_30_[i_33_ - 1]);
                i_33_ = is_30_[i_33_ - 1];
            }
            if (i != 43)
                return -2;
            int i_40_;
            for (int i_41_ = ((MutableString) class100_27_).length - 1 + i_28_; i_41_ < ((MutableString) this).length; i_41_ += Math.max(is_29_[0xff & (((MutableString) this).data[i_41_])], is[i_40_]))
            {
                for (i_40_ = ((MutableString) class100_27_).length - 1; (i_40_ >= 0 && (((MutableString) this).data[i_41_] == ((MutableString) class100_27_).data[i_40_])); i_40_--)
                    i_41_--;
                if (i_40_ == -1)
                    return i_41_ + 1;
            }
            return -1;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.AA(" + i + ',' + (class100_27_ != null ? "{...}" : "null") + ',' + i_28_ + ')'));
        }
    }

    final MutableString trim()
    {
        if (!mutable)
            throw new IllegalArgumentException();
        hash = 0;
        if (data.length != length)
        {
            byte[] is = new byte[length];
            Class39.arraycopy(data, 0, is, 0, length);
            data = is;
        }
        return this;
    }

    final MutableString method1594(int i, int i_42_)
    {
        if (i_42_ != 26011)
            getLength();
        anInt2291++;
        if (i <= 0 || i > 255)
            throw new IllegalArgumentException("invalid char:" + i);
        if (!mutable)
            throw new IllegalArgumentException();
        hash = 0;
        if (((MutableString) this).data.length == ((MutableString) this).length)
        {
            int i_43_;
            for (i_43_ = 1; ((MutableString) this).length >= i_43_; i_43_ += i_43_)
            {
                /* empty */
            }
            byte[] is = new byte[i_43_];
            Class39.arraycopy(((MutableString) this).data, 0, is, 0, ((MutableString) this).length);
            ((MutableString) this).data = is;
        }
        ((MutableString) this).data[((MutableString) this).length++] = (byte) i;
        return this;
    }

    final boolean method1595(MutableString class100_44_, int i)
    {
        try
        {
            if (i < 25)
                method1587(37, false);
            anInt2294++;
            if (((MutableString) this).length < ((MutableString) class100_44_).length)
                return false;
            for (int i_45_ = 0; i_45_ < ((MutableString) class100_44_).length; i_45_++)
            {
                if (((MutableString) class100_44_).data[i_45_] != ((MutableString) this).data[i_45_])
                    return false;
            }
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.O(" + (class100_44_ != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final int getLength()
    {
        return length;
    }

    final int stringWidth(FontMetrics fontmetrics)
    {
        try
        {
            String string;
            try
            {
                string = new String(data, 0, length, "ISO-8859-1");
            } catch (java.io.UnsupportedEncodingException unsupportedencodingexception)
            {
                string = new String(((MutableString) this).data, 0, ((MutableString) this).length);
            }
            return fontmetrics.stringWidth(string);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.N(" + (fontmetrics != null ? "{...}" : "null") + ')');
        }
    }

    final int indexOf(int _char)
    {
        return indexOf(_char, 0);
    }

    final boolean equalTo(MutableString str)
    {
        try
        {
            if (str == null)
                return false;
            if (str.length != length)
                return false;
            if (!mutable || !str.mutable)
            {
                if (hash == 0)
                {
                    hash = generateHash();
                    if (hash == 0)
                        hash = 1;
                }
                if (str.hash == 0)
                {
                    str.hash = str.generateHash();
                    if (str.hash == 0)
                        str.hash = 1;
                }
                if (str.hash != hash)
                    return false;
            }
            for (int i_49_ = 0; i_49_ < length; i_49_++)
            {
                if (data[i_49_] != str.data[i_49_])
                    return false;
            }
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.L(" + (str != null ? "{...}" : "null") + ')');
        }
    }

    final void method1600(int i, byte i_50_)
    {
        anInt2279++;
        hash = 0;
        if (!mutable)
            throw new IllegalArgumentException();
        if (i < 0)
            throw new IllegalArgumentException();
        if (i > ((MutableString) this).data.length)
        {
            int i_51_;
            for (i_51_ = 1; i > i_51_; i_51_ += i_51_)
            {
                /* empty */
            }
            byte[] is = new byte[i_51_];
            Class39.arraycopy(((MutableString) this).data, 0, is, 0, ((MutableString) this).length);
            ((MutableString) this).data = is;
        }
        if (i_50_ > -13)
            method1606(true, null);
        for (int i_52_ = ((MutableString) this).length; i_52_ < i; i_52_++)
            ((MutableString) this).data[i_52_] = (byte) 32;
        ((MutableString) this).length = i;
    }

    final int method1601(int i, MutableString class100_53_)
    {
        try
        {
            int i_54_ = 97 / ((-11 - i) / 44);
            anInt2312++;
            return method1592((byte) 43, class100_53_, 0);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.B(" + i + ',' + (class100_53_ != null ? "{...}" : "null") + ')');
        }
    }

    final int method1602(int i, int i_55_)
    {
        anInt2282++;
        if (i_55_ < 39)
            method1620(false, null);
        byte i_56_ = (byte) i;
        int i_57_ = 0;
        for (int i_58_ = 0; ((MutableString) this).length > i_58_; i_58_++)
        {
            if (i_56_ == ((MutableString) this).data[i_58_])
                i_57_++;
        }
        return i_57_;
    }

    final MutableString method1603(int i)
    {
        MutableString class100_59_ = new MutableString();
        anInt2298++;
        boolean bool = true;
        ((MutableString) class100_59_).length = ((MutableString) this).length;
        ((MutableString) class100_59_).data = new byte[((MutableString) this).length];
        if (i != 12688)
            aBoolean2264 = true;
        for (int i_60_ = 0; ((MutableString) this).length > i_60_; i_60_++)
        {
            byte i_61_ = ((MutableString) this).data[i_60_];
            if (i_61_ == 95)
            {
                ((MutableString) class100_59_).data[i_60_] = (byte) 32;
                bool = true;
            } else if (i_61_ >= 97 && i_61_ <= 122 && bool)
            {
                ((MutableString) class100_59_).data[i_60_] = (byte) (i_61_ - 32);
                bool = false;
            } else
            {
                bool = false;
                ((MutableString) class100_59_).data[i_60_] = i_61_;
            }
        }
        return class100_59_;
    }

    public final int hashCode()
    {
        hashCodeCounter++;
        return generateHash();
    }

    static final Class13_Sub1 method1604(int i, Stream class68_sub14)
    {
        try
        {
            if (i != -20084)
                aClass100_2319 = null;
            anInt2303++;
            return new Class13_Sub1(class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readShort(), class68_sub14.readTInteger(), class68_sub14.readTInteger(), class68_sub14.readUByte());
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.PA(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1605(byte i, Applet applet) throws Throwable
    {
        try
        {
            anInt2285++;
            String string = new String(((MutableString) this).data, 0, ((MutableString) this).length);
            Class27.method391(string, 4149, applet);
            int i_62_ = 25 % ((i - 47) / 45);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.FA(" + i + ',' + (applet != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method1606(boolean bool, MutableString class100_63_)
    {
        try
        {
            if (bool != false)
                return true;
            anInt2306++;
            if (class100_63_ == null)
                return false;
            if (((MutableString) class100_63_).length != ((MutableString) this).length)
                return false;
            for (int i = 0; ((MutableString) this).length > i; i++)
            {
                byte i_64_ = ((MutableString) this).data[i];
                if (i_64_ >= 65 && i_64_ <= 90 || i_64_ >= -64 && i_64_ <= -34 && i_64_ != -41)
                    i_64_ += 32;
                byte i_65_ = ((MutableString) class100_63_).data[i];
                if (i_65_ >= 65 && i_65_ <= 90 || i_65_ >= -64 && i_65_ <= -34 && i_65_ != -41)
                    i_65_ += 32;
                if (i_65_ != i_64_)
                    return false;
            }
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.MA(" + bool + ',' + (class100_63_ != null ? "{...}" : "null") + ')'));
        }
    }

    final int method1607(byte i, MutableString class100_66_)
    {
        try
        {
            int i_67_ = 0;
            anInt2320++;
            int i_68_ = 0;
            int i_69_ = ((MutableString) class100_66_).length;
            if (i != -39)
                return 4;
            int i_70_ = ((MutableString) this).length;
            int i_71_ = ((MutableString) this).length;
            int i_72_ = ((MutableString) class100_66_).length;
            int i_73_ = 0;
            int i_74_ = 0;
            while (i_70_ != 0 && i_69_ != 0)
            {
                if (i_67_ == 156 || i_67_ == 230)
                    i_67_ = 101;
                else if (i_67_ == 140 || i_67_ == 198)
                    i_67_ = 69;
                else if (i_67_ == 223)
                    i_67_ = 115;
                else
                {
                    i_67_ = ((MutableString) this).data[i_73_] & 0xff;
                    i_73_++;
                }
                if (Object4.method573(140, i_67_))
                    i_71_++;
                else
                    i_70_--;
                if (i_68_ != 156 && i_68_ != 230)
                {
                    if (i_68_ == 140 || i_68_ == 198)
                        i_68_ = 69;
                    else if (i_68_ != 223)
                    {
                        i_68_ = (((MutableString) class100_66_).data[i_74_] & 0xff);
                        i_74_++;
                    } else
                        i_68_ = 115;
                } else
                    i_68_ = 101;
                if (!Object4.method573(140, i_68_))
                    i_69_--;
                else
                    i_72_++;
                if (Class68_Sub13_Sub35.anIntArray4024[i_68_] > Class68_Sub13_Sub35.anIntArray4024[i_67_])
                    return -1;
                if (Class68_Sub13_Sub35.anIntArray4024[i_67_] > Class68_Sub13_Sub35.anIntArray4024[i_68_])
                    return 1;
            }
            if (i_71_ < i_72_)
                return -1;
            if (i_72_ < i_71_)
                return 1;
            return 0;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.W(" + i + ',' + (class100_66_ != null ? "{...}" : "null") + ')');
        }
    }

    final MutableString method1608(int i)
    {
        anInt2287++;
        int i_75_ = 103 % ((-6 - i) / 62);
        MutableString class100_76_ = Class56.method570(method1615(10908), -1);
        if (class100_76_ == null)
            return GameSocket.aClass100_1148;
        return class100_76_;
    }

    final int generateHash()
    {
        int i_77_ = 0;
        for (int i_78_ = 0; i_78_ < length; i_78_++)
            i_77_ = ((data[i_78_] & 0xff) + ((i_77_ << 5) - i_77_));
        return i_77_;
    }

    final Object method1610(Applet applet, byte i) throws Throwable
    {
        try
        {
            if (i != -123)
                aBoolean2264 = true;
            String string = new String(((MutableString) this).data, 0, ((MutableString) this).length);
            anInt2276++;
            Object object = Class27.method390(string, applet, null, i - 584);
            if (object instanceof String)
            {
                byte[] is = ((String) object).getBytes();
                object = Class68_Sub13_Sub27.method842(is.length, is, 0);
            }
            return object;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.WA(" + (applet != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final int method1611(int i, int i_79_)
    {
        anInt2304++;
        boolean bool = false;
        boolean bool_80_ = false;
        int i_81_ = 0;
        if (i < 1 || i > 36)
            i = 10;
        for (int i_82_ = 0; i_82_ < ((MutableString) this).length; i_82_++)
        {
            int i_83_ = 0xff & ((MutableString) this).data[i_82_];
            if (i_82_ == 0)
            {
                if (i_83_ == 45)
                {
                    bool = true;
                    continue;
                }
                if (i_83_ == 43)
                    continue;
            }
            if (i_83_ < 48 || i_83_ > 57)
            {
                if (i_83_ >= 65 && i_83_ <= 90)
                    i_83_ -= 55;
                else if (i_83_ >= 97 && i_83_ <= 122)
                    i_83_ -= 87;
                else
                    throw new NumberFormatException();
            } else
                i_83_ -= 48;
            if (i_83_ >= i)
                throw new NumberFormatException();
            if (bool)
                i_83_ = -i_83_;
            int i_84_ = i_81_ * i + i_83_;
            if (i_81_ != i_84_ / i)
                throw new NumberFormatException();
            i_81_ = i_84_;
            bool_80_ = true;
        }
        if (!bool_80_)
            throw new NumberFormatException();
        if (i_79_ <= 41)
            aClass97_2263 = null;
        return i_81_;
    }

    final byte[] method1612(byte i)
    {
        anInt2284++;
        if (((MutableString) this).length == 0)
            return new byte[0];
        int i_85_ = ((MutableString) this).length + 3 & ~0x3;
        int i_86_ = -56 / ((i + 53) / 54);
        int i_87_ = 3 * (i_85_ / 4);
        do
        {
            if (i_85_ - 2 < ((MutableString) this).length && Class68_Sub20_Sub4.method1060((((MutableString) this).data[i_85_ - 2]), -109) != -1)
            {
                if (((MutableString) this).length > i_85_ - 1 && Class68_Sub20_Sub4.method1060((((MutableString) this).data[i_85_ - 1]), 37) != -1)
                    break;
                i_87_--;
                if (client.anInt2387 == 0)
                    break;
            }
            i_87_ -= 2;
        } while (false);
        byte[] is = new byte[i_87_];
        method1619(is, -64, 0);
        return is;
    }

    final MutableString method1613(int i, byte i_88_, int i_89_)
    {
        anInt2301++;
        MutableString class100_90_ = new MutableString();
        ((MutableString) class100_90_).length = i_89_ - i;
        if (i_88_ != -74)
            ((MutableString) this).data = null;
        ((MutableString) class100_90_).data = new byte[i_89_ - i];
        Class39.arraycopy(((MutableString) this).data, i, ((MutableString) class100_90_).data, 0, ((MutableString) class100_90_).length);
        return class100_90_;
    }

    public final boolean equals(Object object)
    {
        try
        {
            anInt2316++;
            if (object instanceof MutableString)
                return equalTo((MutableString) object);
            throw new IllegalArgumentException();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.equals(" + (object != null ? "{...}" : "null") + ')');
        }
    }

    final MutableString toLowerCase(byte i)
    {
        MutableString str = new MutableString();
        anInt2275++;
        str.length = length;
        str.data = new byte[length];
        for (int idx = 0; length > idx; idx++)
        {
            byte _char = data[idx];
            if (_char >= 65 && _char <= 90 || _char >= -64 && _char <= -34 && _char != -41)
                _char += 32;
            str.data[idx] = _char;
        }
        return str;
    }

    public final String toString()
    {
        anInt2324++;
        throw new RuntimeException();
    }

    final long method1615(int i)
    {
        if (i != 10908)
            getData();
        anInt2327++;
        long l = 0L;
        for (int i_95_ = 0; i_95_ < ((MutableString) this).length; i_95_++)
        {
            if (i_95_ >= 12)
                break;
            byte i_96_ = ((MutableString) this).data[i_95_];
            l *= 37L;
            if (i_96_ < 65 || i_96_ > 90)
            {
                if (i_96_ < 97 || i_96_ > 122)
                {
                    if (i_96_ >= 48 && i_96_ <= 57)
                        l += (long) (i_96_ + 27 - 48);
                } else
                    l += (long) (i_96_ + 1 - 97);
            } else
                l += (long) (i_96_ + 1 - 65);
        }
        for (/**/; l % 37L == 0L && l != 0L; l /= 37L)
        {
            /* empty */
        }
        return l;
    }

    final MutableString method1616(Applet applet, byte i)
    {
        try
        {
            anInt2280++;
            String string = new String(((MutableString) this).data, 0, ((MutableString) this).length);
            if (i != -31)
                method1612((byte) -109);
            String string_97_ = applet.getParameter(string);
            if (string_97_ == null)
                return null;
            return Class23.method379(25732, string_97_);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.NA(" + (applet != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final int method1617(int i, int i_99_, int i_100_, byte[] is)
    {
        try
        {
            anInt2315++;
            Class39.arraycopy(data, i_100_, is, i, i_99_ - i_100_);
            return i_99_ - i_100_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.EB(" + i + ',' + i_99_ + ',' + i_100_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final byte[] method1618(byte[] is, boolean bool)
    {
        try
        {
            anInt2286++;
            if (bool != true)
                return null;
            Stream class68_sub14 = new Stream(is);
            int i = class68_sub14.readUByte();
            int i_101_ = class68_sub14.readInteger();
            if (i_101_ < 0 || (Class68_Sub13_Sub11.anInt3623 != 0 && i_101_ > Class68_Sub13_Sub11.anInt3623))
                throw new RuntimeException();
            if (i != 0)
            {
                int i_102_ = class68_sub14.readInteger();
                if (i_102_ < 0 || (Class68_Sub13_Sub11.anInt3623 != 0 && Class68_Sub13_Sub11.anInt3623 < i_102_))
                    throw new RuntimeException();
                byte[] is_103_ = new byte[i_102_];
                if (i == 1)
                    Class73.method1376(is_103_, i_102_, is, i_101_, 9);
                else
                    Class68_Sub13_Sub33.aClass114_4001.method1694(class68_sub14, 115, is_103_);
                return is_103_;
            }
            byte[] is_104_ = new byte[i_101_];
            class68_sub14.readBytes(0, i_101_, is_104_);
            return is_104_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.H(" + (is != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    private final int method1619(byte[] is, int i, int i_105_)
    {
        try
        {
            int i_106_ = i_105_;
            anInt2293++;
            int i_107_ = 0;
            if (i >= -2)
                aClass97_2263 = null;
            for (/**/; i_107_ < ((MutableString) this).length; i_107_ += 4)
            {
                int i_108_ = Class68_Sub20_Sub4.method1060((((MutableString) this).data[i_107_]), 101);
                int i_109_ = (((MutableString) this).length <= i_107_ + 1 ? -1 : Class68_Sub20_Sub4.method1060((((MutableString) this).data[i_107_ + 1]), 27));
                int i_110_ = (i_107_ + 2 >= ((MutableString) this).length ? -1 : Class68_Sub20_Sub4.method1060((((MutableString) this).data[i_107_ + 2]), 90));
                int i_111_ = (((MutableString) this).length > i_107_ + 3 ? Class68_Sub20_Sub4.method1060((((MutableString) this).data[i_107_ + 3]), 37) : -1);
                is[i_105_++] = (byte) Class70.OR(i_108_ << 2, i_109_ >>> 4);
                if (i_110_ == -1)
                    break;
                is[i_105_++] = (byte) Class70.OR(Class120.method1746(i_109_, 15) << 4, i_110_ >>> 2);
                if (i_111_ == -1)
                    break;
                is[i_105_++] = (byte) Class70.OR(Class120.method1746(192, (i_110_ << 6)), i_111_);
            }
            return i_105_ - i_106_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.OA(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_105_ + ')'));
        }
    }

    final int method1620(boolean bool, MutableString class100_112_)
    {
        try
        {
            anInt2297++;
            int i;
            if (((MutableString) this).length <= ((MutableString) class100_112_).length)
                i = ((MutableString) this).length;
            else
                i = ((MutableString) class100_112_).length;
            int i_113_ = 0;
            if (bool != false)
                return 115;
            for (/**/; i > i_113_; i_113_++)
            {
                if ((((MutableString) class100_112_).data[i_113_] & 0xff) > (0xff & ((MutableString) this).data[i_113_]))
                    return -1;
                if ((((MutableString) class100_112_).data[i_113_] & 0xff) < (0xff & ((MutableString) this).data[i_113_]))
                    return 1;
            }
            if (((MutableString) class100_112_).length > ((MutableString) this).length)
                return -1;
            if (((MutableString) this).length > ((MutableString) class100_112_).length)
                return 1;
            return 0;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.LA(" + bool + ',' + (class100_112_ != null ? "{...}" : "null") + ')'));
        }
    }

    final MutableString method1621(int i, boolean bool)
    {
        if (bool != true)
            return null;
        anInt2288++;
        return method1613(i, (byte) -74, ((MutableString) this).length);
    }

    final MutableString method1622(int i)
    {
        anInt2323++;
        int i_114_ = i;
        MutableString class100_115_ = new MutableString();
        ((MutableString) class100_115_).length = ((MutableString) this).length;
        ((MutableString) class100_115_).data = new byte[((MutableString) this).length];
        for (int i_116_ = 0; i_116_ < ((MutableString) this).length; i_116_++)
        {
            byte i_117_ = ((MutableString) this).data[i_116_];
            if (i_117_ >= 97 && i_117_ <= 122 || i_117_ >= -32 && i_117_ <= -2 && i_117_ != -9)
            {
                if (i_114_ == 2)
                    i_117_ -= 32;
                i_114_ = 0;
            } else if ((i_117_ < 65 || i_117_ > 90) && (i_117_ < -64 || i_117_ > -34 || i_117_ == -41))
            {
                if (i_117_ == 46 || i_117_ == 33 || i_117_ == 63)
                    i_114_ = 2;
                else if (i_117_ == 32)
                {
                    if (i_114_ != 2)
                        i_114_ = 1;
                } else
                    i_114_ = 1;
            } else
            {
                if (i_114_ == 0)
                    i_117_ += 32;
                i_114_ = 0;
            }
            ((MutableString) class100_115_).data[i_116_] = i_117_;
        }
        return class100_115_;
    }

    final boolean method1623(int i, MutableString class100_118_)
    {
        try
        {
            anInt2325++;
            if (((MutableString) class100_118_).length > ((MutableString) this).length)
                return false;
            int i_119_ = 0;
            if (i != -577)
                ((MutableString) this).data = null;
            for (/**/; ((MutableString) class100_118_).length > i_119_; i_119_++)
            {
                byte i_120_ = ((MutableString) this).data[i_119_];
                if (i_120_ >= 65 && i_120_ <= 90 || i_120_ >= -64 && i_120_ <= -34 && i_120_ != -41)
                    i_120_ += 32;
                byte i_121_ = ((MutableString) class100_118_).data[i_119_];
                if (i_121_ >= 65 && i_121_ <= 90 || i_121_ >= -64 && i_121_ <= -34 && i_121_ != -41)
                    i_121_ += 32;
                if (i_120_ != i_121_)
                    return false;
            }
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("r.DB(" + i + ',' + (class100_118_ != null ? "{...}" : "null") + ')'));
        }
    }

    final MutableString method1624(MutableString class100_122_, int i)
    {
        try
        {
            anInt2326++;
            if (i != 12147)
                aBoolean2281 = false;
            if (!mutable)
                throw new IllegalArgumentException();
            hash = 0;
            if (((MutableString) this).data.length < (((MutableString) class100_122_).length + ((MutableString) this).length))
            {
                int i_123_;
                for (i_123_ = 1; ((((MutableString) class100_122_).length + ((MutableString) this).length) > i_123_); i_123_ += i_123_)
                {
                    /* empty */
                }
                byte[] is = new byte[i_123_];
                Class39.arraycopy(((MutableString) this).data, 0, is, 0, ((MutableString) this).length);
                ((MutableString) this).data = is;
            }
            Class39.arraycopy(((MutableString) class100_122_).data, 0, ((MutableString) this).data, ((MutableString) this).length, ((MutableString) class100_122_).length);
            ((MutableString) this).length += ((MutableString) class100_122_).length;
            return this;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "r.BA(" + (class100_122_ != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    final int method1625(byte i)
    {
        anInt2290++;
        int i_124_ = -58 % ((i - 75) / 46);
        return method1611(10, 71);
    }

    final MutableString[] method1626(int i, int i_125_)
    {
        anInt2322++;
        int i_126_ = i;
        for (int i_127_ = 0; ((MutableString) this).length > i_127_; i_127_++)
        {
            if (i_125_ == ((MutableString) this).data[i_127_])
                i_126_++;
        }
        MutableString[] class100s = new MutableString[i_126_ + 1];
        if (i_126_ == 0)
        {
            class100s[0] = this;
            return class100s;
        }
        int i_128_ = 0;
        int i_129_ = 0;
        for (int i_130_ = 0; i_126_ > i_130_; i_130_++)
        {
            int i_131_;
            for (i_131_ = 0; i_125_ != ((MutableString) this).data[i_131_ + i_129_]; i_131_++)
            {
                /* empty */
            }
            class100s[i_128_++] = method1613(i_129_, (byte) -74, i_129_ + i_131_);
            i_129_ += i_131_ + 1;
        }
        class100s[i_126_] = method1613(i_129_, (byte) -74, ((MutableString) this).length);
        return class100s;
    }

    final boolean method1627(byte i)
    {
        anInt2311++;
        if (i >= -17)
            method1578(12, -60, -82, null);
        return method1587(10, false);
    }

    final MutableString method1628(int i)
    {
        long l = method1586(-50);
        anInt2300++;
        synchronized (aClass2328 != null ? aClass2328 : (aClass2328 = method1629("MutableString")))
        {
            if (Stream.aClass113_3011 != null)
            {
                for (Class68_Sub5 class68_sub5 = ((Class68_Sub5) Stream.aClass113_3011.method1684(l, 110)); class68_sub5 != null; class68_sub5 = (Class68_Sub5) Stream.aClass113_3011.method1692(109))
                {
                    if (equalTo((((Class68_Sub5) class68_sub5).aClass100_2832)))
                        return ((Class68_Sub5) class68_sub5).aClass100_2832;
                }
            } else
                Stream.aClass113_3011 = new NodeCache(4096);
            Class68_Sub5 class68_sub5 = new Class68_Sub5();
            ((Class68_Sub5) class68_sub5).aClass100_2832 = this;
            if (i != 4096)
                return null;
            mutable = false;
            Stream.aClass113_3011.method1683((byte) -66, class68_sub5, l);
        }
        return this;
    }

    /* synthetic */static Class method1629(String string)
    {
        try
        {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static
    {
        aBoolean2264 = true;
        aBoolean2281 = false;
        aClass100_2307 = Class112.makeMutableString(43, "<)4col>");
        aClass100_2299 = Class112.makeMutableString(43, "scape main");
        aClass100_2319 = aClass100_2271;
    }
}
