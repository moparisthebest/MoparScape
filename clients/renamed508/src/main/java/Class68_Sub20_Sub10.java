/* Class68_Sub20_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class68_Sub20_Sub10 extends NodeSub
{
    static int anInt4304;
    int anInt4305;
    static int anInt4306;
    int anInt4307;
    static long aLong4308 = 0L;
    static int anInt4309;
    static int anInt4310;
    int width;
    static int anInt4312;
    int height;
    static int anInt4314;
    int anInt4315;
    static NodeList aClass16_4316;
    int anInt4317;
    static int anInt4318;
    static MutableString aClass100_4319 = Class112.makeMutableString(43, "null");
    static Class124 aClass124_4320;
    static int anInt4321;
    static MutableString aClass100_4322;

    abstract void method1103(int i, int i_0_);

    final void method1104(int i, int i_1_, int i_2_, int i_3_, byte i_4_)
    {
        anInt4310++;
        int i_5_ = ((Class68_Sub20_Sub10) this).anInt4307 << 3;
        i_2_ = (i_5_ & 0xf) + (i_2_ << 4);
        int i_6_ = ((Class68_Sub20_Sub10) this).anInt4315 << 3;
        i_1_ = (0xf & i_6_) + (i_1_ << 4);
        int i_7_ = -44 / ((36 - i_4_) / 52);
        method1107(i_5_, i_6_, i_2_, i_1_, i, i_3_);
    }

    abstract void method1105(int i, int i_8_, int i_9_, int i_10_, int i_11_);

    static final MutableString method1106(boolean bool, int i, MutableString[] class100s, int i_12_)
    {
        try
        {
            anInt4309++;
            int i_13_ = 0;
            for (int i_14_ = 0; i_14_ < i_12_; i_14_++)
            {
                if (class100s[i_14_ + i] == null)
                    class100s[i_14_ + i] = Class68_Sub8.aClass100_2873;
                i_13_ += ((MutableString) class100s[i + i_14_]).length;
            }
            byte[] is = new byte[i_13_];
            int i_15_ = 0;
            for (int i_16_ = 0; i_12_ > i_16_; i_16_++)
            {
                MutableString class100 = class100s[i + i_16_];
                Class39.arraycopy(((MutableString) class100).data, 0, is, i_15_, ((MutableString) class100).length);
                i_15_ += ((MutableString) class100).length;
            }
            MutableString class100 = new MutableString();
            ((MutableString) class100).length = i_13_;
            ((MutableString) class100).data = is;
            if (bool != true)
                return null;
            return class100;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jb.C(" + bool + ',' + i + ',' + (class100s != null ? "{...}" : "null") + ',' + i_12_ + ')'));
        }
    }

    abstract void method1107(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_);

    abstract void method1108(int i, int i_22_);

    static final void method1109(int i, Class21 class21, Class21 class21_23_)
    {
        do
        {
            try
            {
                anInt4314++;
                Class68_Sub15.aClass21_3022 = class21;
                Class9.aClass21_173 = class21_23_;
                Class119.anInt2090 = Class9.aClass21_173.method355(3, 0);
                if (i < -102)
                    break;
                aClass124_4320 = null;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("jb.H(" + i + ',' + (class21 != null ? "{...}" : "null") + ',' + (class21_23_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    abstract void method1110(int i, int i_24_, int i_25_);

    static final void method1111(int i, boolean bool, int i_26_, int i_27_, int i_28_)
    {
        Class34.method416(i_27_ - i_26_, (byte) -17, i, Class68_Sub22.anIntArrayArray3134[i_28_], i_26_ + i_27_);
        anInt4306++;
        int i_29_ = -i_26_;
        int i_30_ = 0;
        if (bool == true)
        {
            int i_31_ = i_26_;
            int i_32_ = -1;
            while (i_31_ > i_30_)
            {
                i_32_ += 2;
                i_30_++;
                i_29_ += i_32_;
                if (i_29_ >= 0)
                {
                    i_31_--;
                    i_29_ -= i_31_ << 1;
                    int[] is = Class68_Sub22.anIntArrayArray3134[i_28_ - i_31_];
                    int[] is_33_ = Class68_Sub22.anIntArrayArray3134[i_31_ + i_28_];
                    int i_34_ = i_30_ + i_27_;
                    int i_35_ = i_27_ - i_30_;
                    Class34.method416(i_35_, (byte) -17, i, is_33_, i_34_);
                    Class34.method416(i_35_, (byte) -17, i, is, i_34_);
                }
                int i_36_ = i_27_ - i_31_;
                int[] is = Class68_Sub22.anIntArrayArray3134[i_28_ - i_30_];
                int i_37_ = i_27_ + i_31_;
                int[] is_38_ = Class68_Sub22.anIntArrayArray3134[i_28_ + i_30_];
                Class34.method416(i_36_, (byte) -17, i, is_38_, i_37_);
                Class34.method416(i_36_, (byte) -17, i, is, i_37_);
            }
        }
    }

    abstract void method1112(int i, int i_39_, int i_40_, int i_41_);

    abstract void method1113(int i, int i_42_, int i_43_, int i_44_);

    static final int method1114(int i, byte i_45_, Random random)
    {
        try
        {
            anInt4318++;
            if (i <= 0)
                throw new IllegalArgumentException();
            if (i_45_ != 70)
                aClass124_4320 = null;
            if (Class21_Sub1.method367(i, -1))
                return (int) ((((long) random.nextInt() & 0xffffffffL) * (long) i) >> 32);
            int i_46_ = -2147483648 - (int) (4294967296L % (long) i);
            int i_47_;
            do
                i_47_ = random.nextInt();
            while (i_47_ >= i_46_);
            return Class75_Sub1_Sub1.method1394((byte) 20, i_47_, i);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("jb.E(" + i + ',' + i_45_ + ',' + (random != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1115(boolean bool, Signlink class55)
    {
        do
        {
            try
            {
                anInt4304++;
                FileOnDisk class2 = null;
                try
                {
                    Class31 class31 = class55.method568(bool, "runescape");
                    while (class31.anInt555 == 0)
                        Class50.method528(-5, 1L);
                    if (class31.anInt555 == 1)
                    {
                        class2 = (FileOnDisk) class31.playerDefSocket;
                        Stream class68_sub14 = Class94.method1549(0);
                        class2.write(0, ((Stream) class68_sub14).buffer, ((Stream) class68_sub14).position);
                    }
                } catch (Exception exception)
                {
                    /* empty */
                }
                try
                {
                    if (class2 == null)
                        break;
                    class2.close();
                } catch (Exception exception)
                {
                    /* empty */
                }
                break;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("jb.I(" + bool + ',' + (class55 != null ? "{...}" : "null") + ')'));
            }
        } while (false);
    }

    public static void method1116(byte i)
    {
        aClass124_4320 = null;
        aClass100_4319 = null;
        if (i >= -97)
            method1111(-12, true, 107, 127, -107);
        aClass100_4322 = null;
        aClass16_4316 = null;
    }

    public Class68_Sub20_Sub10()
    {
        /* empty */
    }

    static
    {
        aClass16_4316 = new NodeList();
        aClass100_4322 = Class112.makeMutableString(43, "W-=hlen Sie eine Welt");
    }
}
