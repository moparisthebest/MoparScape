/* Class1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1_Sub4 extends Animable
{
    private static int[] anIntArray2446 = Class62.PRECOMUPTED_COSINE_CACHE;
    int anInt2447 = 0;
    int[] anIntArray2448;
    private byte[] aByteArray2449;
    Class104[] aClass104Array2450;
    private short aShort2451;
    private short aShort2452;
    Class107[] aClass107Array2453;
    short[] aShortArray2454;
    private static int[] anIntArray2455 = new int[10000];
    short[] aShortArray2456;
    private byte[] aByteArray2457;
    private short[] aShortArray2458;
    short[] aShortArray2459;
    private static int anInt2460 = 0;
    int anInt2461;
    private byte[] aByteArray2462;
    byte[] aByteArray2463;
    short[] aShortArray2464;
    int[] anIntArray2465;
    private byte[] aByteArray2466;
    short[] aShortArray2467;
    int[] anIntArray2468;
    private short[] aShortArray2469;
    short aShort2470;
    private short aShort2471;
    private short aShort2472;
    private int[] anIntArray2473;
    private short[] aShortArray2474;
    int[] anIntArray2475;
    short aShort2476;
    int anInt2477 = 0;
    byte[] aByteArray2478;
    int[] anIntArray2479;
    Class107[] aClass107Array2480;
    byte[] aByteArray2481;
    byte[] aByteArray2482;
    private int[] anIntArray2483;
    private boolean aBoolean2484 = false;
    private short aShort2485;
    int[][] anIntArrayArray2486;
    private byte[] aByteArray2487;
    int[] anIntArray2488;
    int[][] anIntArrayArray2489;
    private static int[] anIntArray2490 = new int[10000];
    byte aByte2491 = 0;
    private short aShort2492;
    private static int[] anIntArray2493 = Class62.PRECOMPUTED_SINE_CACHE;
    byte[] aByteArray2494;

    final void method107(int i)
    {
        int i_0_ = anIntArray2493[i];
        int i_1_ = anIntArray2446[i];
        for (int i_2_ = 0; i_2_ < ((Class1_Sub4) this).anInt2447; i_2_++)
        {
            int i_3_ = ((((Class1_Sub4) this).anIntArray2468[i_2_] * i_0_ + ((Class1_Sub4) this).anIntArray2479[i_2_] * i_1_) >> 16);
            ((Class1_Sub4) this).anIntArray2468[i_2_] = (((Class1_Sub4) this).anIntArray2468[i_2_] * i_1_ - ((Class1_Sub4) this).anIntArray2479[i_2_] * i_0_) >> 16;
            ((Class1_Sub4) this).anIntArray2479[i_2_] = i_3_;
        }
        method122();
    }

    private final void method108(byte[] is)
    {
        Stream class68_sub14 = new Stream(is);
        Stream class68_sub14_4_ = new Stream(is);
        Stream class68_sub14_5_ = new Stream(is);
        Stream class68_sub14_6_ = new Stream(is);
        Stream class68_sub14_7_ = new Stream(is);
        Stream class68_sub14_8_ = new Stream(is);
        Stream class68_sub14_9_ = new Stream(is);
        ((Stream) class68_sub14).position = is.length - 23;
        int i = class68_sub14.readUShort();
        int i_10_ = class68_sub14.readUShort();
        int i_11_ = class68_sub14.readUByte();
        int i_12_ = class68_sub14.readUByte();
        int i_13_ = class68_sub14.readUByte();
        int i_14_ = class68_sub14.readUByte();
        int i_15_ = class68_sub14.readUByte();
        int i_16_ = class68_sub14.readUByte();
        int i_17_ = class68_sub14.readUByte();
        int i_18_ = class68_sub14.readUShort();
        int i_19_ = class68_sub14.readUShort();
        int i_20_ = class68_sub14.readUShort();
        int i_21_ = class68_sub14.readUShort();
        int i_22_ = class68_sub14.readUShort();
        int i_23_ = 0;
        int i_24_ = 0;
        int i_25_ = 0;
        if (i_11_ > 0)
        {
            ((Class1_Sub4) this).aByteArray2463 = new byte[i_11_];
            ((Stream) class68_sub14).position = 0;
            for (int i_26_ = 0; i_26_ < i_11_; i_26_++)
            {
                byte i_27_ = (((Class1_Sub4) this).aByteArray2463[i_26_] = class68_sub14.readByte());
                if (i_27_ == 0)
                    i_23_++;
                if (i_27_ >= 1 && i_27_ <= 3)
                    i_24_++;
                if (i_27_ == 2)
                    i_25_++;
            }
        }
        int i_28_ = i_11_;
        int i_29_ = i_28_;
        i_28_ += i;
        int i_30_ = i_28_;
        if (i_12_ == 1)
            i_28_ += i_10_;
        int i_31_ = i_28_;
        i_28_ += i_10_;
        int i_32_ = i_28_;
        if (i_13_ == 255)
            i_28_ += i_10_;
        int i_33_ = i_28_;
        if (i_15_ == 1)
            i_28_ += i_10_;
        int i_34_ = i_28_;
        if (i_17_ == 1)
            i_28_ += i;
        int i_35_ = i_28_;
        if (i_14_ == 1)
            i_28_ += i_10_;
        int i_36_ = i_28_;
        i_28_ += i_21_;
        int i_37_ = i_28_;
        if (i_16_ == 1)
            i_28_ += i_10_ * 2;
        int i_38_ = i_28_;
        i_28_ += i_22_;
        int i_39_ = i_28_;
        i_28_ += i_10_ * 2;
        int i_40_ = i_28_;
        i_28_ += i_18_;
        int i_41_ = i_28_;
        i_28_ += i_19_;
        int i_42_ = i_28_;
        i_28_ += i_20_;
        int i_43_ = i_28_;
        i_28_ += i_23_ * 6;
        int i_44_ = i_28_;
        i_28_ += i_24_ * 6;
        int i_45_ = i_28_;
        i_28_ += i_24_ * 6;
        int i_46_ = i_28_;
        i_28_ += i_24_;
        int i_47_ = i_28_;
        i_28_ += i_24_;
        int i_48_ = i_28_;
        i_28_ += i_24_ + i_25_ * 2;
        ((Class1_Sub4) this).anInt2447 = i;
        ((Class1_Sub4) this).anInt2477 = i_10_;
        ((Class1_Sub4) this).anInt2461 = i_11_;
        ((Class1_Sub4) this).anIntArray2479 = new int[i];
        ((Class1_Sub4) this).anIntArray2475 = new int[i];
        ((Class1_Sub4) this).anIntArray2468 = new int[i];
        ((Class1_Sub4) this).anIntArray2448 = new int[i_10_];
        ((Class1_Sub4) this).anIntArray2488 = new int[i_10_];
        ((Class1_Sub4) this).anIntArray2465 = new int[i_10_];
        if (i_17_ == 1)
            anIntArray2483 = new int[i];
        if (i_12_ == 1)
            ((Class1_Sub4) this).aByteArray2478 = new byte[i_10_];
        if (i_13_ == 255)
            ((Class1_Sub4) this).aByteArray2482 = new byte[i_10_];
        else
            ((Class1_Sub4) this).aByte2491 = (byte) i_13_;
        if (i_14_ == 1)
            ((Class1_Sub4) this).aByteArray2481 = new byte[i_10_];
        if (i_15_ == 1)
            anIntArray2473 = new int[i_10_];
        if (i_16_ == 1)
            ((Class1_Sub4) this).aShortArray2467 = new short[i_10_];
        if (i_16_ == 1 && i_11_ > 0)
            ((Class1_Sub4) this).aByteArray2494 = new byte[i_10_];
        ((Class1_Sub4) this).aShortArray2464 = new short[i_10_];
        if (i_11_ > 0)
        {
            ((Class1_Sub4) this).aShortArray2456 = new short[i_11_];
            ((Class1_Sub4) this).aShortArray2454 = new short[i_11_];
            ((Class1_Sub4) this).aShortArray2459 = new short[i_11_];
            if (i_24_ > 0)
            {
                aShortArray2474 = new short[i_24_];
                aShortArray2458 = new short[i_24_];
                aShortArray2469 = new short[i_24_];
                aByteArray2449 = new byte[i_24_];
                aByteArray2457 = new byte[i_24_];
                aByteArray2462 = new byte[i_24_];
            }
            if (i_25_ > 0)
            {
                aByteArray2466 = new byte[i_25_];
                aByteArray2487 = new byte[i_25_];
            }
        }
        ((Stream) class68_sub14).position = i_29_;
        ((Stream) class68_sub14_4_).position = i_40_;
        ((Stream) class68_sub14_5_).position = i_41_;
        ((Stream) class68_sub14_6_).position = i_42_;
        ((Stream) class68_sub14_7_).position = i_34_;
        int i_49_ = 0;
        int i_50_ = 0;
        int i_51_ = 0;
        for (int i_52_ = 0; i_52_ < i; i_52_++)
        {
            int i_53_ = class68_sub14.readUByte();
            int i_54_ = 0;
            if ((i_53_ & 0x1) != 0)
                i_54_ = class68_sub14_4_.method960(32767);
            int i_55_ = 0;
            if ((i_53_ & 0x2) != 0)
                i_55_ = class68_sub14_5_.method960(32767);
            int i_56_ = 0;
            if ((i_53_ & 0x4) != 0)
                i_56_ = class68_sub14_6_.method960(32767);
            ((Class1_Sub4) this).anIntArray2479[i_52_] = i_49_ + i_54_;
            ((Class1_Sub4) this).anIntArray2475[i_52_] = i_50_ + i_55_;
            ((Class1_Sub4) this).anIntArray2468[i_52_] = i_51_ + i_56_;
            i_49_ = ((Class1_Sub4) this).anIntArray2479[i_52_];
            i_50_ = ((Class1_Sub4) this).anIntArray2475[i_52_];
            i_51_ = ((Class1_Sub4) this).anIntArray2468[i_52_];
            if (i_17_ == 1)
                anIntArray2483[i_52_] = class68_sub14_7_.readUByte();
        }
        ((Stream) class68_sub14).position = i_39_;
        ((Stream) class68_sub14_4_).position = i_30_;
        ((Stream) class68_sub14_5_).position = i_32_;
        ((Stream) class68_sub14_6_).position = i_35_;
        ((Stream) class68_sub14_7_).position = i_33_;
        ((Stream) class68_sub14_8_).position = i_37_;
        ((Stream) class68_sub14_9_).position = i_38_;
        for (int i_57_ = 0; i_57_ < i_10_; i_57_++)
        {
            ((Class1_Sub4) this).aShortArray2464[i_57_] = (short) class68_sub14.readUShort();
            if (i_12_ == 1)
                ((Class1_Sub4) this).aByteArray2478[i_57_] = class68_sub14_4_.readByte();
            if (i_13_ == 255)
                ((Class1_Sub4) this).aByteArray2482[i_57_] = class68_sub14_5_.readByte();
            if (i_14_ == 1)
                ((Class1_Sub4) this).aByteArray2481[i_57_] = class68_sub14_6_.readByte();
            if (i_15_ == 1)
                anIntArray2473[i_57_] = class68_sub14_7_.readUByte();
            if (i_16_ == 1)
                ((Class1_Sub4) this).aShortArray2467[i_57_] = (short) (class68_sub14_8_.readUShort() - 1);
            if (((Class1_Sub4) this).aByteArray2494 != null)
            {
                if (((Class1_Sub4) this).aShortArray2467[i_57_] != -1)
                    ((Class1_Sub4) this).aByteArray2494[i_57_] = (byte) (class68_sub14_9_.readUByte() - 1);
                else
                    ((Class1_Sub4) this).aByteArray2494[i_57_] = (byte) -1;
            }
        }
        ((Stream) class68_sub14).position = i_36_;
        ((Stream) class68_sub14_4_).position = i_31_;
        int i_58_ = 0;
        int i_59_ = 0;
        int i_60_ = 0;
        int i_61_ = 0;
        for (int i_62_ = 0; i_62_ < i_10_; i_62_++)
        {
            int i_63_ = class68_sub14_4_.readUByte();
            if (i_63_ == 1)
            {
                i_58_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_58_;
                i_59_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_59_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                ((Class1_Sub4) this).anIntArray2448[i_62_] = i_58_;
                ((Class1_Sub4) this).anIntArray2488[i_62_] = i_59_;
                ((Class1_Sub4) this).anIntArray2465[i_62_] = i_60_;
            }
            if (i_63_ == 2)
            {
                i_59_ = i_60_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                ((Class1_Sub4) this).anIntArray2448[i_62_] = i_58_;
                ((Class1_Sub4) this).anIntArray2488[i_62_] = i_59_;
                ((Class1_Sub4) this).anIntArray2465[i_62_] = i_60_;
            }
            if (i_63_ == 3)
            {
                i_58_ = i_60_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                ((Class1_Sub4) this).anIntArray2448[i_62_] = i_58_;
                ((Class1_Sub4) this).anIntArray2488[i_62_] = i_59_;
                ((Class1_Sub4) this).anIntArray2465[i_62_] = i_60_;
            }
            if (i_63_ == 4)
            {
                int i_64_ = i_58_;
                i_58_ = i_59_;
                i_59_ = i_64_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                ((Class1_Sub4) this).anIntArray2448[i_62_] = i_58_;
                ((Class1_Sub4) this).anIntArray2488[i_62_] = i_59_;
                ((Class1_Sub4) this).anIntArray2465[i_62_] = i_60_;
            }
        }
        ((Stream) class68_sub14).position = i_43_;
        ((Stream) class68_sub14_4_).position = i_44_;
        ((Stream) class68_sub14_5_).position = i_45_;
        ((Stream) class68_sub14_6_).position = i_46_;
        ((Stream) class68_sub14_7_).position = i_47_;
        ((Stream) class68_sub14_8_).position = i_48_;
        for (int i_65_ = 0; i_65_ < i_11_; i_65_++)
        {
            int i_66_ = ((Class1_Sub4) this).aByteArray2463[i_65_] & 0xff;
            if (i_66_ == 0)
            {
                ((Class1_Sub4) this).aShortArray2456[i_65_] = (short) class68_sub14.readUShort();
                ((Class1_Sub4) this).aShortArray2454[i_65_] = (short) class68_sub14.readUShort();
                ((Class1_Sub4) this).aShortArray2459[i_65_] = (short) class68_sub14.readUShort();
            }
            if (i_66_ == 1)
            {
                ((Class1_Sub4) this).aShortArray2456[i_65_] = (short) class68_sub14_4_.readUShort();
                ((Class1_Sub4) this).aShortArray2454[i_65_] = (short) class68_sub14_4_.readUShort();
                ((Class1_Sub4) this).aShortArray2459[i_65_] = (short) class68_sub14_4_.readUShort();
                aShortArray2474[i_65_] = (short) class68_sub14_5_.readUShort();
                aShortArray2458[i_65_] = (short) class68_sub14_5_.readUShort();
                aShortArray2469[i_65_] = (short) class68_sub14_5_.readUShort();
                aByteArray2449[i_65_] = class68_sub14_6_.readByte();
                aByteArray2457[i_65_] = class68_sub14_7_.readByte();
                aByteArray2462[i_65_] = class68_sub14_8_.readByte();
            }
            if (i_66_ == 2)
            {
                ((Class1_Sub4) this).aShortArray2456[i_65_] = (short) class68_sub14_4_.readUShort();
                ((Class1_Sub4) this).aShortArray2454[i_65_] = (short) class68_sub14_4_.readUShort();
                ((Class1_Sub4) this).aShortArray2459[i_65_] = (short) class68_sub14_4_.readUShort();
                aShortArray2474[i_65_] = (short) class68_sub14_5_.readUShort();
                aShortArray2458[i_65_] = (short) class68_sub14_5_.readUShort();
                aShortArray2469[i_65_] = (short) class68_sub14_5_.readUShort();
                aByteArray2449[i_65_] = class68_sub14_6_.readByte();
                aByteArray2457[i_65_] = class68_sub14_7_.readByte();
                aByteArray2462[i_65_] = class68_sub14_8_.readByte();
                aByteArray2466[i_65_] = class68_sub14_8_.readByte();
                aByteArray2487[i_65_] = class68_sub14_8_.readByte();
            }
            if (i_66_ == 3)
            {
                ((Class1_Sub4) this).aShortArray2456[i_65_] = (short) class68_sub14_4_.readUShort();
                ((Class1_Sub4) this).aShortArray2454[i_65_] = (short) class68_sub14_4_.readUShort();
                ((Class1_Sub4) this).aShortArray2459[i_65_] = (short) class68_sub14_4_.readUShort();
                aShortArray2474[i_65_] = (short) class68_sub14_5_.readUShort();
                aShortArray2458[i_65_] = (short) class68_sub14_5_.readUShort();
                aShortArray2469[i_65_] = (short) class68_sub14_5_.readUShort();
                aByteArray2449[i_65_] = class68_sub14_6_.readByte();
                aByteArray2457[i_65_] = class68_sub14_7_.readByte();
                aByteArray2462[i_65_] = class68_sub14_8_.readByte();
            }
        }
    }

    final Class1_Sub4 method109()
    {
        Class1_Sub4 class1_sub4_67_ = new Class1_Sub4();
        if (((Class1_Sub4) this).aByteArray2478 != null)
        {
            ((Class1_Sub4) class1_sub4_67_).aByteArray2478 = new byte[((Class1_Sub4) this).anInt2477];
            for (int i = 0; i < ((Class1_Sub4) this).anInt2477; i++)
                ((Class1_Sub4) class1_sub4_67_).aByteArray2478[i] = ((Class1_Sub4) this).aByteArray2478[i];
        }
        ((Class1_Sub4) class1_sub4_67_).anInt2447 = ((Class1_Sub4) this).anInt2447;
        ((Class1_Sub4) class1_sub4_67_).anInt2477 = ((Class1_Sub4) this).anInt2477;
        ((Class1_Sub4) class1_sub4_67_).anInt2461 = ((Class1_Sub4) this).anInt2461;
        ((Class1_Sub4) class1_sub4_67_).anIntArray2479 = ((Class1_Sub4) this).anIntArray2479;
        ((Class1_Sub4) class1_sub4_67_).anIntArray2475 = ((Class1_Sub4) this).anIntArray2475;
        ((Class1_Sub4) class1_sub4_67_).anIntArray2468 = ((Class1_Sub4) this).anIntArray2468;
        ((Class1_Sub4) class1_sub4_67_).anIntArray2448 = ((Class1_Sub4) this).anIntArray2448;
        ((Class1_Sub4) class1_sub4_67_).anIntArray2488 = ((Class1_Sub4) this).anIntArray2488;
        ((Class1_Sub4) class1_sub4_67_).anIntArray2465 = ((Class1_Sub4) this).anIntArray2465;
        ((Class1_Sub4) class1_sub4_67_).aByteArray2482 = ((Class1_Sub4) this).aByteArray2482;
        ((Class1_Sub4) class1_sub4_67_).aByteArray2481 = ((Class1_Sub4) this).aByteArray2481;
        ((Class1_Sub4) class1_sub4_67_).aByteArray2494 = ((Class1_Sub4) this).aByteArray2494;
        ((Class1_Sub4) class1_sub4_67_).aShortArray2464 = ((Class1_Sub4) this).aShortArray2464;
        ((Class1_Sub4) class1_sub4_67_).aShortArray2467 = ((Class1_Sub4) this).aShortArray2467;
        ((Class1_Sub4) class1_sub4_67_).aByte2491 = ((Class1_Sub4) this).aByte2491;
        ((Class1_Sub4) class1_sub4_67_).aByteArray2463 = ((Class1_Sub4) this).aByteArray2463;
        ((Class1_Sub4) class1_sub4_67_).aShortArray2456 = ((Class1_Sub4) this).aShortArray2456;
        ((Class1_Sub4) class1_sub4_67_).aShortArray2454 = ((Class1_Sub4) this).aShortArray2454;
        ((Class1_Sub4) class1_sub4_67_).aShortArray2459 = ((Class1_Sub4) this).aShortArray2459;
        class1_sub4_67_.aShortArray2474 = aShortArray2474;
        class1_sub4_67_.aShortArray2458 = aShortArray2458;
        class1_sub4_67_.aShortArray2469 = aShortArray2469;
        class1_sub4_67_.aByteArray2449 = aByteArray2449;
        class1_sub4_67_.aByteArray2457 = aByteArray2457;
        class1_sub4_67_.aByteArray2462 = aByteArray2462;
        class1_sub4_67_.aByteArray2466 = aByteArray2466;
        class1_sub4_67_.aByteArray2487 = aByteArray2487;
        class1_sub4_67_.anIntArray2483 = anIntArray2483;
        class1_sub4_67_.anIntArray2473 = anIntArray2473;
        ((Class1_Sub4) class1_sub4_67_).anIntArrayArray2489 = ((Class1_Sub4) this).anIntArrayArray2489;
        ((Class1_Sub4) class1_sub4_67_).anIntArrayArray2486 = ((Class1_Sub4) this).anIntArrayArray2486;
        ((Class1_Sub4) class1_sub4_67_).aClass107Array2453 = ((Class1_Sub4) this).aClass107Array2453;
        ((Class1_Sub4) class1_sub4_67_).aClass104Array2450 = ((Class1_Sub4) this).aClass104Array2450;
        ((Class1_Sub4) class1_sub4_67_).aShort2470 = ((Class1_Sub4) this).aShort2470;
        ((Class1_Sub4) class1_sub4_67_).aShort2476 = ((Class1_Sub4) this).aShort2476;
        return class1_sub4_67_;
    }

    final void method110(short i, short i_68_)
    {
        if (((Class1_Sub4) this).aShortArray2467 != null)
        {
            for (int i_69_ = 0; i_69_ < ((Class1_Sub4) this).anInt2477; i_69_++)
            {
                if (((Class1_Sub4) this).aShortArray2467[i_69_] == i)
                    ((Class1_Sub4) this).aShortArray2467[i_69_] = i_68_;
            }
        }
    }

    final Class1_Sub4 method111(int i, int i_70_, int[][] is, int[][] is_71_, int i_72_, int i_73_, int i_74_, boolean bool, boolean bool_75_)
    {
        method121();
        int i_76_ = i_72_ + aShort2492;
        int i_77_ = i_72_ + aShort2451;
        int i_78_ = i_74_ + aShort2452;
        int i_79_ = i_74_ + aShort2485;
        if ((i == 1 || i == 2 || i == 3 || i == 5) && (i_76_ < 0 || i_77_ + 128 >> 7 >= is.length || i_78_ < 0 || i_79_ + 128 >> 7 >= is[0].length))
            return this;
        if (i == 4 || i == 5)
        {
            if (is_71_ == null)
                return this;
            if (i_76_ < 0 || i_77_ + 128 >> 7 >= is_71_.length || i_78_ < 0 || i_79_ + 128 >> 7 >= is_71_[0].length)
                return this;
        } else
        {
            i_76_ >>= 7;
            i_77_ = i_77_ + 127 >> 7;
            i_78_ >>= 7;
            i_79_ = i_79_ + 127 >> 7;
            if (is[i_76_][i_78_] == i_73_ && is[i_77_][i_78_] == i_73_ && is[i_76_][i_79_] == i_73_ && is[i_77_][i_79_] == i_73_)
                return this;
        }
        Class1_Sub4 class1_sub4_80_;
        if (bool)
        {
            class1_sub4_80_ = new Class1_Sub4();
            ((Class1_Sub4) class1_sub4_80_).anInt2447 = ((Class1_Sub4) this).anInt2447;
            ((Class1_Sub4) class1_sub4_80_).anInt2477 = ((Class1_Sub4) this).anInt2477;
            ((Class1_Sub4) class1_sub4_80_).anInt2461 = ((Class1_Sub4) this).anInt2461;
            ((Class1_Sub4) class1_sub4_80_).anIntArray2448 = ((Class1_Sub4) this).anIntArray2448;
            ((Class1_Sub4) class1_sub4_80_).anIntArray2488 = ((Class1_Sub4) this).anIntArray2488;
            ((Class1_Sub4) class1_sub4_80_).anIntArray2465 = ((Class1_Sub4) this).anIntArray2465;
            ((Class1_Sub4) class1_sub4_80_).aByteArray2478 = ((Class1_Sub4) this).aByteArray2478;
            ((Class1_Sub4) class1_sub4_80_).aByteArray2482 = ((Class1_Sub4) this).aByteArray2482;
            ((Class1_Sub4) class1_sub4_80_).aByteArray2481 = ((Class1_Sub4) this).aByteArray2481;
            ((Class1_Sub4) class1_sub4_80_).aByteArray2494 = ((Class1_Sub4) this).aByteArray2494;
            ((Class1_Sub4) class1_sub4_80_).aShortArray2464 = ((Class1_Sub4) this).aShortArray2464;
            ((Class1_Sub4) class1_sub4_80_).aShortArray2467 = ((Class1_Sub4) this).aShortArray2467;
            ((Class1_Sub4) class1_sub4_80_).aByte2491 = ((Class1_Sub4) this).aByte2491;
            ((Class1_Sub4) class1_sub4_80_).aByteArray2463 = ((Class1_Sub4) this).aByteArray2463;
            ((Class1_Sub4) class1_sub4_80_).aShortArray2456 = ((Class1_Sub4) this).aShortArray2456;
            ((Class1_Sub4) class1_sub4_80_).aShortArray2454 = ((Class1_Sub4) this).aShortArray2454;
            ((Class1_Sub4) class1_sub4_80_).aShortArray2459 = ((Class1_Sub4) this).aShortArray2459;
            class1_sub4_80_.aShortArray2474 = aShortArray2474;
            class1_sub4_80_.aShortArray2458 = aShortArray2458;
            class1_sub4_80_.aShortArray2469 = aShortArray2469;
            class1_sub4_80_.aByteArray2449 = aByteArray2449;
            class1_sub4_80_.aByteArray2457 = aByteArray2457;
            class1_sub4_80_.aByteArray2462 = aByteArray2462;
            class1_sub4_80_.aByteArray2466 = aByteArray2466;
            class1_sub4_80_.aByteArray2487 = aByteArray2487;
            class1_sub4_80_.anIntArray2483 = anIntArray2483;
            class1_sub4_80_.anIntArray2473 = anIntArray2473;
            ((Class1_Sub4) class1_sub4_80_).anIntArrayArray2489 = ((Class1_Sub4) this).anIntArrayArray2489;
            ((Class1_Sub4) class1_sub4_80_).anIntArrayArray2486 = ((Class1_Sub4) this).anIntArrayArray2486;
            ((Class1_Sub4) class1_sub4_80_).aShort2470 = ((Class1_Sub4) this).aShort2470;
            ((Class1_Sub4) class1_sub4_80_).aShort2476 = ((Class1_Sub4) this).aShort2476;
            ((Class1_Sub4) class1_sub4_80_).aClass107Array2453 = ((Class1_Sub4) this).aClass107Array2453;
            ((Class1_Sub4) class1_sub4_80_).aClass104Array2450 = ((Class1_Sub4) this).aClass104Array2450;
            ((Class1_Sub4) class1_sub4_80_).aClass107Array2480 = ((Class1_Sub4) this).aClass107Array2480;
            if (i == 3)
            {
                ((Class1_Sub4) class1_sub4_80_).anIntArray2479 = Class106.method1651(((Class1_Sub4) this).anIntArray2479, -105);
                ((Class1_Sub4) class1_sub4_80_).anIntArray2475 = Class106.method1651(((Class1_Sub4) this).anIntArray2475, -33);
                ((Class1_Sub4) class1_sub4_80_).anIntArray2468 = Class106.method1651(((Class1_Sub4) this).anIntArray2468, -98);
            } else
            {
                ((Class1_Sub4) class1_sub4_80_).anIntArray2479 = ((Class1_Sub4) this).anIntArray2479;
                ((Class1_Sub4) class1_sub4_80_).anIntArray2475 = new int[((Class1_Sub4) class1_sub4_80_).anInt2447];
                ((Class1_Sub4) class1_sub4_80_).anIntArray2468 = ((Class1_Sub4) this).anIntArray2468;
            }
        } else
            class1_sub4_80_ = this;
        if (i == 1)
        {
            for (int i_81_ = 0; i_81_ < ((Class1_Sub4) class1_sub4_80_).anInt2447; i_81_++)
            {
                int i_82_ = ((Class1_Sub4) this).anIntArray2479[i_81_] + i_72_;
                int i_83_ = ((Class1_Sub4) this).anIntArray2468[i_81_] + i_74_;
                int i_84_ = i_82_ & 0x7f;
                int i_85_ = i_83_ & 0x7f;
                int i_86_ = i_82_ >> 7;
                int i_87_ = i_83_ >> 7;
                int i_88_ = ((is[i_86_][i_87_] * (128 - i_84_) + is[i_86_ + 1][i_87_] * i_84_) >> 7);
                int i_89_ = ((is[i_86_][i_87_ + 1] * (128 - i_84_) + is[i_86_ + 1][i_87_ + 1] * i_84_) >> 7);
                int i_90_ = i_88_ * (128 - i_85_) + i_89_ * i_85_ >> 7;
                ((Class1_Sub4) class1_sub4_80_).anIntArray2475[i_81_] = (((Class1_Sub4) this).anIntArray2475[i_81_] + i_90_ - i_73_);
            }
        } else if (i == 2)
        {
            for (int i_91_ = 0; i_91_ < ((Class1_Sub4) class1_sub4_80_).anInt2447; i_91_++)
            {
                int i_92_ = ((((Class1_Sub4) this).anIntArray2475[i_91_] << 16) / aShort2472);
                if (i_92_ < i_70_)
                {
                    int i_93_ = ((Class1_Sub4) this).anIntArray2479[i_91_] + i_72_;
                    int i_94_ = ((Class1_Sub4) this).anIntArray2468[i_91_] + i_74_;
                    int i_95_ = i_93_ & 0x7f;
                    int i_96_ = i_94_ & 0x7f;
                    int i_97_ = i_93_ >> 7;
                    int i_98_ = i_94_ >> 7;
                    int i_99_ = ((is[i_97_][i_98_] * (128 - i_95_) + is[i_97_ + 1][i_98_] * i_95_) >> 7);
                    int i_100_ = ((is[i_97_][i_98_ + 1] * (128 - i_95_) + is[i_97_ + 1][i_98_ + 1] * i_95_) >> 7);
                    int i_101_ = i_99_ * (128 - i_96_) + i_100_ * i_96_ >> 7;
                    ((Class1_Sub4) class1_sub4_80_).anIntArray2475[i_91_] = (((Class1_Sub4) this).anIntArray2475[i_91_] + (i_101_ - i_73_) * (i_70_ - i_92_) / i_70_);
                } else
                    ((Class1_Sub4) class1_sub4_80_).anIntArray2475[i_91_] = ((Class1_Sub4) this).anIntArray2475[i_91_];
            }
        } else if (i == 3)
        {
            int i_102_ = (i_70_ & 0xff) * 4;
            int i_103_ = (i_70_ >> 8 & 0xff) * 4;
            method119(is, i_72_, i_73_, i_74_, i_102_, i_103_);
        } else if (i == 4)
        {
            int i_104_ = aShort2471 - aShort2472;
            for (int i_105_ = 0; i_105_ < ((Class1_Sub4) this).anInt2447; i_105_++)
            {
                int i_106_ = ((Class1_Sub4) this).anIntArray2479[i_105_] + i_72_;
                int i_107_ = ((Class1_Sub4) this).anIntArray2468[i_105_] + i_74_;
                int i_108_ = i_106_ & 0x7f;
                int i_109_ = i_107_ & 0x7f;
                int i_110_ = i_106_ >> 7;
                int i_111_ = i_107_ >> 7;
                int i_112_ = ((is_71_[i_110_][i_111_] * (128 - i_108_) + is_71_[i_110_ + 1][i_111_] * i_108_) >> 7);
                int i_113_ = ((is_71_[i_110_][i_111_ + 1] * (128 - i_108_) + is_71_[i_110_ + 1][i_111_ + 1] * i_108_) >> 7);
                int i_114_ = i_112_ * (128 - i_109_) + i_113_ * i_109_ >> 7;
                ((Class1_Sub4) class1_sub4_80_).anIntArray2475[i_105_] = (((Class1_Sub4) this).anIntArray2475[i_105_] + (i_114_ - i_73_) + i_104_);
            }
        } else if (i == 5)
        {
            int i_115_ = aShort2471 - aShort2472;
            for (int i_116_ = 0; i_116_ < ((Class1_Sub4) this).anInt2447; i_116_++)
            {
                int i_117_ = ((Class1_Sub4) this).anIntArray2479[i_116_] + i_72_;
                int i_118_ = ((Class1_Sub4) this).anIntArray2468[i_116_] + i_74_;
                int i_119_ = i_117_ & 0x7f;
                int i_120_ = i_118_ & 0x7f;
                int i_121_ = i_117_ >> 7;
                int i_122_ = i_118_ >> 7;
                int i_123_ = ((is[i_121_][i_122_] * (128 - i_119_) + is[i_121_ + 1][i_122_] * i_119_) >> 7);
                int i_124_ = ((is[i_121_][i_122_ + 1] * (128 - i_119_) + is[i_121_ + 1][i_122_ + 1] * i_119_) >> 7);
                int i_125_ = i_123_ * (128 - i_120_) + i_124_ * i_120_ >> 7;
                i_123_ = (is_71_[i_121_][i_122_] * (128 - i_119_) + is_71_[i_121_ + 1][i_122_] * i_119_) >> 7;
                i_124_ = (is_71_[i_121_][i_122_ + 1] * (128 - i_119_) + is_71_[i_121_ + 1][i_122_ + 1] * i_119_) >> 7;
                int i_126_ = i_123_ * (128 - i_120_) + i_124_ * i_120_ >> 7;
                int i_127_ = i_125_ - i_126_;
                ((Class1_Sub4) class1_sub4_80_).anIntArray2475[i_116_] = (((((Class1_Sub4) this).anIntArray2475[i_116_] << 8) / i_115_ * i_127_) >> 8) - (i_73_ - i_125_);
            }
        }
        if (bool_75_)
            class1_sub4_80_.method122();
        else
            aBoolean2484 = false;
        return class1_sub4_80_;
    }

    final void method112()
    {
        if (anIntArray2483 != null)
        {
            int[] is = new int[256];
            int i = 0;
            for (int i_128_ = 0; i_128_ < ((Class1_Sub4) this).anInt2447; i_128_++)
            {
                int i_129_ = anIntArray2483[i_128_];
                is[i_129_]++;
                if (i_129_ > i)
                    i = i_129_;
            }
            ((Class1_Sub4) this).anIntArrayArray2489 = new int[i + 1][];
            for (int i_130_ = 0; i_130_ <= i; i_130_++)
            {
                ((Class1_Sub4) this).anIntArrayArray2489[i_130_] = new int[is[i_130_]];
                is[i_130_] = 0;
            }
            for (int i_131_ = 0; i_131_ < ((Class1_Sub4) this).anInt2447; i_131_++)
            {
                int i_132_ = anIntArray2483[i_131_];
                ((Class1_Sub4) this).anIntArrayArray2489[i_132_][is[i_132_]++] = i_131_;
            }
            anIntArray2483 = null;
        }
        if (anIntArray2473 != null)
        {
            int[] is = new int[256];
            int i = 0;
            for (int i_133_ = 0; i_133_ < ((Class1_Sub4) this).anInt2477; i_133_++)
            {
                int i_134_ = anIntArray2473[i_133_];
                is[i_134_]++;
                if (i_134_ > i)
                    i = i_134_;
            }
            ((Class1_Sub4) this).anIntArrayArray2486 = new int[i + 1][];
            for (int i_135_ = 0; i_135_ <= i; i_135_++)
            {
                ((Class1_Sub4) this).anIntArrayArray2486[i_135_] = new int[is[i_135_]];
                is[i_135_] = 0;
            }
            for (int i_136_ = 0; i_136_ < ((Class1_Sub4) this).anInt2477; i_136_++)
            {
                int i_137_ = anIntArray2473[i_136_];
                ((Class1_Sub4) this).anIntArrayArray2486[i_137_][is[i_137_]++] = i_136_;
            }
            anIntArray2473 = null;
        }
    }

    final void method52(Animable class1, int i, int i_138_, int i_139_, boolean bool)
    {
        Class1_Sub4 class1_sub4_140_ = (Class1_Sub4) class1;
        class1_sub4_140_.method121();
        class1_sub4_140_.method120();
        anInt2460++;
        int i_141_ = 0;
        int[] is = ((Class1_Sub4) class1_sub4_140_).anIntArray2479;
        int i_142_ = ((Class1_Sub4) class1_sub4_140_).anInt2447;
        for (int i_143_ = 0; i_143_ < ((Class1_Sub4) this).anInt2447; i_143_++)
        {
            Class107 class107 = ((Class1_Sub4) this).aClass107Array2453[i_143_];
            if (((Class107) class107).anInt1816 != 0)
            {
                int i_144_ = ((Class1_Sub4) this).anIntArray2475[i_143_] - i_138_;
                if (i_144_ >= class1_sub4_140_.aShort2472 && i_144_ <= class1_sub4_140_.aShort2471)
                {
                    int i_145_ = ((Class1_Sub4) this).anIntArray2479[i_143_] - i;
                    if (i_145_ >= class1_sub4_140_.aShort2492 && i_145_ <= class1_sub4_140_.aShort2451)
                    {
                        int i_146_ = (((Class1_Sub4) this).anIntArray2468[i_143_] - i_139_);
                        if (i_146_ >= class1_sub4_140_.aShort2452 && i_146_ <= class1_sub4_140_.aShort2485)
                        {
                            for (int i_147_ = 0; i_147_ < i_142_; i_147_++)
                            {
                                Class107 class107_148_ = (((Class1_Sub4) class1_sub4_140_).aClass107Array2453[i_147_]);
                                if (i_145_ == is[i_147_] && (i_146_ == (((Class1_Sub4) class1_sub4_140_).anIntArray2468[i_147_])) && (i_144_ == (((Class1_Sub4) class1_sub4_140_).anIntArray2475[i_147_])) && (((Class107) class107_148_).anInt1816 != 0))
                                {
                                    if (((Class1_Sub4) this).aClass107Array2480 == null)
                                        ((Class1_Sub4) this).aClass107Array2480 = new Class107[((Class1_Sub4) this).anInt2447];
                                    if ((((Class1_Sub4) class1_sub4_140_).aClass107Array2480) == null)
                                        ((Class1_Sub4) class1_sub4_140_).aClass107Array2480 = new Class107[i_142_];
                                    Class107 class107_149_ = (((Class1_Sub4) this).aClass107Array2480[i_143_]);
                                    if (class107_149_ == null)
                                        class107_149_ = ((Class1_Sub4) this).aClass107Array2480[i_143_] = new Class107(class107);
                                    Class107 class107_150_ = (((Class1_Sub4) class1_sub4_140_).aClass107Array2480[i_147_]);
                                    if (class107_150_ == null)
                                        class107_150_ = ((Class1_Sub4) class1_sub4_140_).aClass107Array2480[i_147_] = new Class107(class107_148_);
                                    ((Class107) class107_149_).anInt1822 += (((Class107) class107_148_).anInt1822);
                                    ((Class107) class107_149_).anInt1824 += (((Class107) class107_148_).anInt1824);
                                    ((Class107) class107_149_).anInt1813 += (((Class107) class107_148_).anInt1813);
                                    ((Class107) class107_149_).anInt1816 += (((Class107) class107_148_).anInt1816);
                                    ((Class107) class107_150_).anInt1822 += ((Class107) class107).anInt1822;
                                    ((Class107) class107_150_).anInt1824 += ((Class107) class107).anInt1824;
                                    ((Class107) class107_150_).anInt1813 += ((Class107) class107).anInt1813;
                                    ((Class107) class107_150_).anInt1816 += ((Class107) class107).anInt1816;
                                    i_141_++;
                                    anIntArray2490[i_143_] = anInt2460;
                                    anIntArray2455[i_147_] = anInt2460;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i_141_ >= 3 && bool)
        {
            for (int i_151_ = 0; i_151_ < ((Class1_Sub4) this).anInt2477; i_151_++)
            {
                if (anIntArray2490[(((Class1_Sub4) this).anIntArray2448[i_151_])] == anInt2460 && anIntArray2490[(((Class1_Sub4) this).anIntArray2488[i_151_])] == anInt2460 && anIntArray2490[(((Class1_Sub4) this).anIntArray2465[i_151_])] == anInt2460)
                {
                    if (((Class1_Sub4) this).aByteArray2478 == null)
                        ((Class1_Sub4) this).aByteArray2478 = new byte[((Class1_Sub4) this).anInt2477];
                    ((Class1_Sub4) this).aByteArray2478[i_151_] = (byte) 2;
                }
            }
            for (int i_152_ = 0; i_152_ < ((Class1_Sub4) class1_sub4_140_).anInt2477; i_152_++)
            {
                if (anIntArray2455[(((Class1_Sub4) class1_sub4_140_).anIntArray2448[i_152_])] == anInt2460 && anIntArray2455[(((Class1_Sub4) class1_sub4_140_).anIntArray2488[i_152_])] == anInt2460 && (anIntArray2455[(((Class1_Sub4) class1_sub4_140_).anIntArray2465[i_152_])] == anInt2460))
                {
                    if (((Class1_Sub4) class1_sub4_140_).aByteArray2478 == null)
                        ((Class1_Sub4) class1_sub4_140_).aByteArray2478 = (new byte[((Class1_Sub4) class1_sub4_140_).anInt2477]);
                    ((Class1_Sub4) class1_sub4_140_).aByteArray2478[i_152_] = (byte) 2;
                }
            }
        }
    }

    private final int method113(Class1_Sub4 class1_sub4_153_, int i)
    {
        int i_154_ = -1;
        int i_155_ = ((Class1_Sub4) class1_sub4_153_).anIntArray2479[i];
        int i_156_ = ((Class1_Sub4) class1_sub4_153_).anIntArray2475[i];
        int i_157_ = ((Class1_Sub4) class1_sub4_153_).anIntArray2468[i];
        for (int i_158_ = 0; i_158_ < ((Class1_Sub4) this).anInt2447; i_158_++)
        {
            if (i_155_ == ((Class1_Sub4) this).anIntArray2479[i_158_] && i_156_ == ((Class1_Sub4) this).anIntArray2475[i_158_] && i_157_ == ((Class1_Sub4) this).anIntArray2468[i_158_])
            {
                i_154_ = i_158_;
                break;
            }
        }
        if (i_154_ == -1)
        {
            ((Class1_Sub4) this).anIntArray2479[((Class1_Sub4) this).anInt2447] = i_155_;
            ((Class1_Sub4) this).anIntArray2475[((Class1_Sub4) this).anInt2447] = i_156_;
            ((Class1_Sub4) this).anIntArray2468[((Class1_Sub4) this).anInt2447] = i_157_;
            if (class1_sub4_153_.anIntArray2483 != null)
                anIntArray2483[((Class1_Sub4) this).anInt2447] = class1_sub4_153_.anIntArray2483[i];
            i_154_ = ((Class1_Sub4) this).anInt2447++;
        }
        return i_154_;
    }

    final void method114()
    {
        for (int i = 0; i < ((Class1_Sub4) this).anInt2447; i++)
            ((Class1_Sub4) this).anIntArray2468[i] = -((Class1_Sub4) this).anIntArray2468[i];
        for (int i = 0; i < ((Class1_Sub4) this).anInt2477; i++)
        {
            int i_159_ = ((Class1_Sub4) this).anIntArray2448[i];
            ((Class1_Sub4) this).anIntArray2448[i] = ((Class1_Sub4) this).anIntArray2465[i];
            ((Class1_Sub4) this).anIntArray2465[i] = i_159_;
        }
        method122();
    }

    static final Class1_Sub4 method115(Class21 class21, int i, int i_160_)
    {
        byte[] is = class21.method338(i_160_, 0, i);
        if (is == null)
            return null;
        return new Class1_Sub4(is);
    }

    final void render(int i, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, long l)
    {
        /* empty */
    }

    public static void method116()
    {
        anIntArray2490 = null;
        anIntArray2455 = null;
        anIntArray2493 = null;
        anIntArray2446 = null;
    }

    private final void method117(int i)
    {
        int i_168_ = anIntArray2493[i];
        int i_169_ = anIntArray2446[i];
        for (int i_170_ = 0; i_170_ < ((Class1_Sub4) this).anInt2447; i_170_++)
        {
            int i_171_ = ((((Class1_Sub4) this).anIntArray2475[i_170_] * i_168_ + ((Class1_Sub4) this).anIntArray2479[i_170_] * i_169_) >> 16);
            ((Class1_Sub4) this).anIntArray2475[i_170_] = ((((Class1_Sub4) this).anIntArray2475[i_170_] * i_169_ - ((Class1_Sub4) this).anIntArray2479[i_170_] * i_168_) >> 16);
            ((Class1_Sub4) this).anIntArray2479[i_170_] = i_171_;
        }
        method122();
    }

    final SpriteFactory method118(int i, int i_172_, int i_173_, int i_174_, int i_175_)
    {
        return new SpriteFactory(this, i, i_172_, i_173_, i_174_, i_175_);
    }

    private final void method119(int[][] is, int i, int i_176_, int i_177_, int i_178_, int i_179_)
    {
        boolean bool = false;
        boolean bool_180_ = false;
        boolean bool_181_ = false;
        int i_182_ = -i_178_ / 2;
        int i_183_ = -i_179_ / 2;
        int i_184_ = method134(is, i + i_182_, i_177_ + i_183_);
        int i_185_ = i_178_ / 2;
        int i_186_ = -i_179_ / 2;
        int i_187_ = method134(is, i + i_185_, i_177_ + i_186_);
        int i_188_ = -i_178_ / 2;
        int i_189_ = i_179_ / 2;
        int i_190_ = method134(is, i + i_188_, i_177_ + i_189_);
        int i_191_ = i_178_ / 2;
        int i_192_ = i_179_ / 2;
        int i_193_ = method134(is, i + i_191_, i_177_ + i_192_);
        int i_194_ = i_184_ < i_187_ ? i_184_ : i_187_;
        int i_195_ = i_190_ < i_193_ ? i_190_ : i_193_;
        int i_196_ = i_187_ < i_193_ ? i_187_ : i_193_;
        int i_197_ = i_184_ < i_190_ ? i_184_ : i_190_;
        if (i_179_ != 0)
        {
            int i_198_ = ((int) (Math.atan2((double) (i_194_ - i_195_), (double) i_179_) * 325.95) & 0x7ff);
            if (i_198_ != 0)
                method124(i_198_);
        }
        if (i_178_ != 0)
        {
            int i_199_ = ((int) (Math.atan2((double) (i_197_ - i_196_), (double) i_178_) * 325.95) & 0x7ff);
            if (i_199_ != 0)
                method117(i_199_);
        }
        int i_200_ = i_184_ + i_193_;
        if (i_187_ + i_190_ < i_200_)
            i_200_ = i_187_ + i_190_;
        i_200_ = (i_200_ >> 1) - i_176_;
        if (i_200_ != 0)
            method128(0, i_200_, 0);
    }

    final void method120()
    {
        if (((Class1_Sub4) this).aClass107Array2453 == null)
        {
            ((Class1_Sub4) this).aClass107Array2453 = new Class107[((Class1_Sub4) this).anInt2447];
            for (int i = 0; i < ((Class1_Sub4) this).anInt2447; i++)
                ((Class1_Sub4) this).aClass107Array2453[i] = new Class107();
            for (int i = 0; i < ((Class1_Sub4) this).anInt2477; i++)
            {
                int i_201_ = ((Class1_Sub4) this).anIntArray2448[i];
                int i_202_ = ((Class1_Sub4) this).anIntArray2488[i];
                int i_203_ = ((Class1_Sub4) this).anIntArray2465[i];
                int i_204_ = (((Class1_Sub4) this).anIntArray2479[i_202_] - ((Class1_Sub4) this).anIntArray2479[i_201_]);
                int i_205_ = (((Class1_Sub4) this).anIntArray2475[i_202_] - ((Class1_Sub4) this).anIntArray2475[i_201_]);
                int i_206_ = (((Class1_Sub4) this).anIntArray2468[i_202_] - ((Class1_Sub4) this).anIntArray2468[i_201_]);
                int i_207_ = (((Class1_Sub4) this).anIntArray2479[i_203_] - ((Class1_Sub4) this).anIntArray2479[i_201_]);
                int i_208_ = (((Class1_Sub4) this).anIntArray2475[i_203_] - ((Class1_Sub4) this).anIntArray2475[i_201_]);
                int i_209_ = (((Class1_Sub4) this).anIntArray2468[i_203_] - ((Class1_Sub4) this).anIntArray2468[i_201_]);
                int i_210_ = i_205_ * i_209_ - i_208_ * i_206_;
                int i_211_ = i_206_ * i_207_ - i_209_ * i_204_;
                int i_212_;
                for (i_212_ = i_204_ * i_208_ - i_207_ * i_205_; (i_210_ > 8192 || i_211_ > 8192 || i_212_ > 8192 || i_210_ < -8192 || i_211_ < -8192 || i_212_ < -8192); i_212_ >>= 1)
                {
                    i_210_ >>= 1;
                    i_211_ >>= 1;
                }
                int i_213_ = (int) Math.sqrt((double) (i_210_ * i_210_ + i_211_ * i_211_ + i_212_ * i_212_));
                if (i_213_ <= 0)
                    i_213_ = 1;
                i_210_ = i_210_ * 256 / i_213_;
                i_211_ = i_211_ * 256 / i_213_;
                i_212_ = i_212_ * 256 / i_213_;
                byte i_214_;
                if (((Class1_Sub4) this).aByteArray2478 == null)
                    i_214_ = (byte) 0;
                else
                    i_214_ = ((Class1_Sub4) this).aByteArray2478[i];
                if (i_214_ == 0)
                {
                    Class107 class107 = ((Class1_Sub4) this).aClass107Array2453[i_201_];
                    ((Class107) class107).anInt1822 += i_210_;
                    ((Class107) class107).anInt1824 += i_211_;
                    ((Class107) class107).anInt1813 += i_212_;
                    ((Class107) class107).anInt1816++;
                    class107 = ((Class1_Sub4) this).aClass107Array2453[i_202_];
                    ((Class107) class107).anInt1822 += i_210_;
                    ((Class107) class107).anInt1824 += i_211_;
                    ((Class107) class107).anInt1813 += i_212_;
                    ((Class107) class107).anInt1816++;
                    class107 = ((Class1_Sub4) this).aClass107Array2453[i_203_];
                    ((Class107) class107).anInt1822 += i_210_;
                    ((Class107) class107).anInt1824 += i_211_;
                    ((Class107) class107).anInt1813 += i_212_;
                    ((Class107) class107).anInt1816++;
                } else if (i_214_ == 1)
                {
                    if (((Class1_Sub4) this).aClass104Array2450 == null)
                        ((Class1_Sub4) this).aClass104Array2450 = new Class104[((Class1_Sub4) this).anInt2477];
                    Class104 class104 = (((Class1_Sub4) this).aClass104Array2450[i] = new Class104());
                    ((Class104) class104).anInt1783 = i_210_;
                    ((Class104) class104).anInt1790 = i_211_;
                    ((Class104) class104).anInt1784 = i_212_;
                }
            }
        }
    }

    private final void method121()
    {
        if (!aBoolean2484)
        {
            aBoolean2484 = true;
            int i = 32767;
            int i_215_ = 32767;
            int i_216_ = 32767;
            int i_217_ = -32768;
            int i_218_ = -32768;
            int i_219_ = -32768;
            for (int i_220_ = 0; i_220_ < ((Class1_Sub4) this).anInt2447; i_220_++)
            {
                int i_221_ = ((Class1_Sub4) this).anIntArray2479[i_220_];
                int i_222_ = ((Class1_Sub4) this).anIntArray2475[i_220_];
                int i_223_ = ((Class1_Sub4) this).anIntArray2468[i_220_];
                if (i_221_ < i)
                    i = i_221_;
                if (i_221_ > i_217_)
                    i_217_ = i_221_;
                if (i_222_ < i_215_)
                    i_215_ = i_222_;
                if (i_222_ > i_218_)
                    i_218_ = i_222_;
                if (i_223_ < i_216_)
                    i_216_ = i_223_;
                if (i_223_ > i_219_)
                    i_219_ = i_223_;
            }
            aShort2492 = (short) i;
            aShort2451 = (short) i_217_;
            aShort2472 = (short) i_215_;
            aShort2471 = (short) i_218_;
            aShort2452 = (short) i_216_;
            aShort2485 = (short) i_219_;
        }
    }

    final int method56()
    {
        if (!aBoolean2484)
            method121();
        return aShort2472;
    }

    private final void method122()
    {
        ((Class1_Sub4) this).aClass107Array2453 = null;
        ((Class1_Sub4) this).aClass107Array2480 = null;
        ((Class1_Sub4) this).aClass104Array2450 = null;
        aBoolean2484 = false;
    }

    final void method123()
    {
        for (int i = 0; i < ((Class1_Sub4) this).anInt2447; i++)
        {
            ((Class1_Sub4) this).anIntArray2479[i] = -((Class1_Sub4) this).anIntArray2479[i];
            ((Class1_Sub4) this).anIntArray2468[i] = -((Class1_Sub4) this).anIntArray2468[i];
        }
        method122();
    }

    private final void method124(int i)
    {
        int i_224_ = anIntArray2493[i];
        int i_225_ = anIntArray2446[i];
        for (int i_226_ = 0; i_226_ < ((Class1_Sub4) this).anInt2447; i_226_++)
        {
            int i_227_ = ((((Class1_Sub4) this).anIntArray2475[i_226_] * i_225_ - ((Class1_Sub4) this).anIntArray2468[i_226_] * i_224_) >> 16);
            ((Class1_Sub4) this).anIntArray2468[i_226_] = ((((Class1_Sub4) this).anIntArray2475[i_226_] * i_224_ + ((Class1_Sub4) this).anIntArray2468[i_226_] * i_225_) >> 16);
            ((Class1_Sub4) this).anIntArray2475[i_226_] = i_227_;
        }
        method122();
    }

    final void method125(int i, int i_228_, int i_229_)
    {
        if (i_229_ != 0)
        {
            int i_230_ = anIntArray2493[i_229_];
            int i_231_ = anIntArray2446[i_229_];
            for (int i_232_ = 0; i_232_ < ((Class1_Sub4) this).anInt2447; i_232_++)
            {
                int i_233_ = ((((Class1_Sub4) this).anIntArray2475[i_232_] * i_230_ + ((Class1_Sub4) this).anIntArray2479[i_232_] * i_231_) >> 16);
                ((Class1_Sub4) this).anIntArray2475[i_232_] = ((((Class1_Sub4) this).anIntArray2475[i_232_] * i_231_ - ((Class1_Sub4) this).anIntArray2479[i_232_] * i_230_) >> 16);
                ((Class1_Sub4) this).anIntArray2479[i_232_] = i_233_;
            }
        }
        if (i != 0)
        {
            int i_234_ = anIntArray2493[i];
            int i_235_ = anIntArray2446[i];
            for (int i_236_ = 0; i_236_ < ((Class1_Sub4) this).anInt2447; i_236_++)
            {
                int i_237_ = ((((Class1_Sub4) this).anIntArray2475[i_236_] * i_235_ - ((Class1_Sub4) this).anIntArray2468[i_236_] * i_234_) >> 16);
                ((Class1_Sub4) this).anIntArray2468[i_236_] = ((((Class1_Sub4) this).anIntArray2475[i_236_] * i_234_ + ((Class1_Sub4) this).anIntArray2468[i_236_] * i_235_) >> 16);
                ((Class1_Sub4) this).anIntArray2475[i_236_] = i_237_;
            }
        }
        if (i_228_ != 0)
        {
            int i_238_ = anIntArray2493[i_228_];
            int i_239_ = anIntArray2446[i_228_];
            for (int i_240_ = 0; i_240_ < ((Class1_Sub4) this).anInt2447; i_240_++)
            {
                int i_241_ = ((((Class1_Sub4) this).anIntArray2468[i_240_] * i_238_ + ((Class1_Sub4) this).anIntArray2479[i_240_] * i_239_) >> 16);
                ((Class1_Sub4) this).anIntArray2468[i_240_] = ((((Class1_Sub4) this).anIntArray2468[i_240_] * i_239_ - ((Class1_Sub4) this).anIntArray2479[i_240_] * i_238_) >> 16);
                ((Class1_Sub4) this).anIntArray2479[i_240_] = i_241_;
            }
        }
    }

    private final void method126(byte[] is)
    {
        boolean bool = false;
        boolean bool_242_ = false;
        Stream class68_sub14 = new Stream(is);
        Stream class68_sub14_243_ = new Stream(is);
        Stream class68_sub14_244_ = new Stream(is);
        Stream class68_sub14_245_ = new Stream(is);
        Stream class68_sub14_246_ = new Stream(is);
        ((Stream) class68_sub14).position = is.length - 18;
        int i = class68_sub14.readUShort();
        int i_247_ = class68_sub14.readUShort();
        int i_248_ = class68_sub14.readUByte();
        int i_249_ = class68_sub14.readUByte();
        int i_250_ = class68_sub14.readUByte();
        int i_251_ = class68_sub14.readUByte();
        int i_252_ = class68_sub14.readUByte();
        int i_253_ = class68_sub14.readUByte();
        int i_254_ = class68_sub14.readUShort();
        int i_255_ = class68_sub14.readUShort();
        int i_256_ = class68_sub14.readUShort();
        int i_257_ = class68_sub14.readUShort();
        int i_258_ = 0;
        int i_259_ = i_258_;
        i_258_ += i;
        int i_260_ = i_258_;
        i_258_ += i_247_;
        int i_261_ = i_258_;
        if (i_250_ == 255)
            i_258_ += i_247_;
        int i_262_ = i_258_;
        if (i_252_ == 1)
            i_258_ += i_247_;
        int i_263_ = i_258_;
        if (i_249_ == 1)
            i_258_ += i_247_;
        int i_264_ = i_258_;
        if (i_253_ == 1)
            i_258_ += i;
        int i_265_ = i_258_;
        if (i_251_ == 1)
            i_258_ += i_247_;
        int i_266_ = i_258_;
        i_258_ += i_257_;
        int i_267_ = i_258_;
        i_258_ += i_247_ * 2;
        int i_268_ = i_258_;
        i_258_ += i_248_ * 6;
        int i_269_ = i_258_;
        i_258_ += i_254_;
        int i_270_ = i_258_;
        i_258_ += i_255_;
        int i_271_ = i_258_;
        i_258_ += i_256_;
        ((Class1_Sub4) this).anInt2447 = i;
        ((Class1_Sub4) this).anInt2477 = i_247_;
        ((Class1_Sub4) this).anInt2461 = i_248_;
        ((Class1_Sub4) this).anIntArray2479 = new int[i];
        ((Class1_Sub4) this).anIntArray2475 = new int[i];
        ((Class1_Sub4) this).anIntArray2468 = new int[i];
        ((Class1_Sub4) this).anIntArray2448 = new int[i_247_];
        ((Class1_Sub4) this).anIntArray2488 = new int[i_247_];
        ((Class1_Sub4) this).anIntArray2465 = new int[i_247_];
        if (i_248_ > 0)
        {
            ((Class1_Sub4) this).aByteArray2463 = new byte[i_248_];
            ((Class1_Sub4) this).aShortArray2456 = new short[i_248_];
            ((Class1_Sub4) this).aShortArray2454 = new short[i_248_];
            ((Class1_Sub4) this).aShortArray2459 = new short[i_248_];
        }
        if (i_253_ == 1)
            anIntArray2483 = new int[i];
        if (i_249_ == 1)
        {
            ((Class1_Sub4) this).aByteArray2478 = new byte[i_247_];
            ((Class1_Sub4) this).aByteArray2494 = new byte[i_247_];
            ((Class1_Sub4) this).aShortArray2467 = new short[i_247_];
        }
        if (i_250_ == 255)
            ((Class1_Sub4) this).aByteArray2482 = new byte[i_247_];
        else
            ((Class1_Sub4) this).aByte2491 = (byte) i_250_;
        if (i_251_ == 1)
            ((Class1_Sub4) this).aByteArray2481 = new byte[i_247_];
        if (i_252_ == 1)
            anIntArray2473 = new int[i_247_];
        ((Class1_Sub4) this).aShortArray2464 = new short[i_247_];
        ((Stream) class68_sub14).position = i_259_;
        ((Stream) class68_sub14_243_).position = i_269_;
        ((Stream) class68_sub14_244_).position = i_270_;
        ((Stream) class68_sub14_245_).position = i_271_;
        ((Stream) class68_sub14_246_).position = i_264_;
        int i_272_ = 0;
        int i_273_ = 0;
        int i_274_ = 0;
        for (int i_275_ = 0; i_275_ < i; i_275_++)
        {
            int i_276_ = class68_sub14.readUByte();
            int i_277_ = 0;
            if ((i_276_ & 0x1) != 0)
                i_277_ = class68_sub14_243_.method960(32767);
            int i_278_ = 0;
            if ((i_276_ & 0x2) != 0)
                i_278_ = class68_sub14_244_.method960(32767);
            int i_279_ = 0;
            if ((i_276_ & 0x4) != 0)
                i_279_ = class68_sub14_245_.method960(32767);
            ((Class1_Sub4) this).anIntArray2479[i_275_] = i_272_ + i_277_;
            ((Class1_Sub4) this).anIntArray2475[i_275_] = i_273_ + i_278_;
            ((Class1_Sub4) this).anIntArray2468[i_275_] = i_274_ + i_279_;
            i_272_ = ((Class1_Sub4) this).anIntArray2479[i_275_];
            i_273_ = ((Class1_Sub4) this).anIntArray2475[i_275_];
            i_274_ = ((Class1_Sub4) this).anIntArray2468[i_275_];
            if (i_253_ == 1)
                anIntArray2483[i_275_] = class68_sub14_246_.readUByte();
        }
        ((Stream) class68_sub14).position = i_267_;
        ((Stream) class68_sub14_243_).position = i_263_;
        ((Stream) class68_sub14_244_).position = i_261_;
        ((Stream) class68_sub14_245_).position = i_265_;
        ((Stream) class68_sub14_246_).position = i_262_;
        for (int i_280_ = 0; i_280_ < i_247_; i_280_++)
        {
            ((Class1_Sub4) this).aShortArray2464[i_280_] = (short) class68_sub14.readUShort();
            if (i_249_ == 1)
            {
                int i_281_ = class68_sub14_243_.readUByte();
                if ((i_281_ & 0x1) == 1)
                {
                    ((Class1_Sub4) this).aByteArray2478[i_280_] = (byte) 1;
                    bool = true;
                } else
                    ((Class1_Sub4) this).aByteArray2478[i_280_] = (byte) 0;
                if ((i_281_ & 0x2) == 2)
                {
                    ((Class1_Sub4) this).aByteArray2494[i_280_] = (byte) (i_281_ >> 2);
                    ((Class1_Sub4) this).aShortArray2467[i_280_] = ((Class1_Sub4) this).aShortArray2464[i_280_];
                    ((Class1_Sub4) this).aShortArray2464[i_280_] = (short) 127;
                    if (((Class1_Sub4) this).aShortArray2467[i_280_] != -1)
                        bool_242_ = true;
                } else
                {
                    ((Class1_Sub4) this).aByteArray2494[i_280_] = (byte) -1;
                    ((Class1_Sub4) this).aShortArray2467[i_280_] = (short) -1;
                }
            }
            if (i_250_ == 255)
                ((Class1_Sub4) this).aByteArray2482[i_280_] = class68_sub14_244_.readByte();
            if (i_251_ == 1)
                ((Class1_Sub4) this).aByteArray2481[i_280_] = class68_sub14_245_.readByte();
            if (i_252_ == 1)
                anIntArray2473[i_280_] = class68_sub14_246_.readUByte();
        }
        ((Stream) class68_sub14).position = i_266_;
        ((Stream) class68_sub14_243_).position = i_260_;
        int i_282_ = 0;
        int i_283_ = 0;
        int i_284_ = 0;
        int i_285_ = 0;
        for (int i_286_ = 0; i_286_ < i_247_; i_286_++)
        {
            int i_287_ = class68_sub14_243_.readUByte();
            if (i_287_ == 1)
            {
                i_282_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_282_;
                i_283_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_283_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                ((Class1_Sub4) this).anIntArray2448[i_286_] = i_282_;
                ((Class1_Sub4) this).anIntArray2488[i_286_] = i_283_;
                ((Class1_Sub4) this).anIntArray2465[i_286_] = i_284_;
            }
            if (i_287_ == 2)
            {
                i_283_ = i_284_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                ((Class1_Sub4) this).anIntArray2448[i_286_] = i_282_;
                ((Class1_Sub4) this).anIntArray2488[i_286_] = i_283_;
                ((Class1_Sub4) this).anIntArray2465[i_286_] = i_284_;
            }
            if (i_287_ == 3)
            {
                i_282_ = i_284_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                ((Class1_Sub4) this).anIntArray2448[i_286_] = i_282_;
                ((Class1_Sub4) this).anIntArray2488[i_286_] = i_283_;
                ((Class1_Sub4) this).anIntArray2465[i_286_] = i_284_;
            }
            if (i_287_ == 4)
            {
                int i_288_ = i_282_;
                i_282_ = i_283_;
                i_283_ = i_288_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                ((Class1_Sub4) this).anIntArray2448[i_286_] = i_282_;
                ((Class1_Sub4) this).anIntArray2488[i_286_] = i_283_;
                ((Class1_Sub4) this).anIntArray2465[i_286_] = i_284_;
            }
        }
        ((Stream) class68_sub14).position = i_268_;
        for (int i_289_ = 0; i_289_ < i_248_; i_289_++)
        {
            ((Class1_Sub4) this).aByteArray2463[i_289_] = (byte) 0;
            ((Class1_Sub4) this).aShortArray2456[i_289_] = (short) class68_sub14.readUShort();
            ((Class1_Sub4) this).aShortArray2454[i_289_] = (short) class68_sub14.readUShort();
            ((Class1_Sub4) this).aShortArray2459[i_289_] = (short) class68_sub14.readUShort();
        }
        if (((Class1_Sub4) this).aByteArray2494 != null)
        {
            boolean bool_290_ = false;
            for (int i_291_ = 0; i_291_ < i_247_; i_291_++)
            {
                int i_292_ = ((Class1_Sub4) this).aByteArray2494[i_291_] & 0xff;
                if (i_292_ != 255)
                {
                    if (((((Class1_Sub4) this).aShortArray2456[i_292_] & 0xffff) == ((Class1_Sub4) this).anIntArray2448[i_291_]) && ((((Class1_Sub4) this).aShortArray2454[i_292_] & 0xffff) == ((Class1_Sub4) this).anIntArray2488[i_291_]) && ((((Class1_Sub4) this).aShortArray2459[i_292_] & 0xffff) == ((Class1_Sub4) this).anIntArray2465[i_291_]))
                        ((Class1_Sub4) this).aByteArray2494[i_291_] = (byte) -1;
                    else
                        bool_290_ = true;
                }
            }
            if (!bool_290_)
                ((Class1_Sub4) this).aByteArray2494 = null;
        }
        if (!bool_242_)
            ((Class1_Sub4) this).aShortArray2467 = null;
        if (!bool)
            ((Class1_Sub4) this).aByteArray2478 = null;
    }

    final Model method127(int i, int i_293_, int i_294_, int i_295_, int i_296_)
    {
        return new SpriteFactory(this, i, i_293_, i_294_, i_295_, i_296_);
    }

    final void method128(int i, int i_297_, int i_298_)
    {
        for (int i_299_ = 0; i_299_ < ((Class1_Sub4) this).anInt2447; i_299_++)
        {
            ((Class1_Sub4) this).anIntArray2479[i_299_] += i;
            ((Class1_Sub4) this).anIntArray2475[i_299_] += i_297_;
            ((Class1_Sub4) this).anIntArray2468[i_299_] += i_298_;
        }
        method122();
    }

    final void method129(short i, short i_300_)
    {
        for (int i_301_ = 0; i_301_ < ((Class1_Sub4) this).anInt2477; i_301_++)
        {
            if (((Class1_Sub4) this).aShortArray2464[i_301_] == i)
                ((Class1_Sub4) this).aShortArray2464[i_301_] = i_300_;
        }
    }

    final boolean method58()
    {
        return true;
    }

    final void method130()
    {
        for (int i = 0; i < ((Class1_Sub4) this).anInt2447; i++)
        {
            int i_302_ = ((Class1_Sub4) this).anIntArray2479[i];
            ((Class1_Sub4) this).anIntArray2479[i] = ((Class1_Sub4) this).anIntArray2468[i];
            ((Class1_Sub4) this).anIntArray2468[i] = -i_302_;
        }
        method122();
    }

    final int method131(int i, int i_303_, int i_304_)
    {
        for (int i_305_ = 0; i_305_ < ((Class1_Sub4) this).anInt2447; i_305_++)
        {
            if (((Class1_Sub4) this).anIntArray2479[i_305_] == i && ((Class1_Sub4) this).anIntArray2475[i_305_] == i_303_ && ((Class1_Sub4) this).anIntArray2468[i_305_] == i_304_)
                return i_305_;
        }
        ((Class1_Sub4) this).anIntArray2479[((Class1_Sub4) this).anInt2447] = i;
        ((Class1_Sub4) this).anIntArray2475[((Class1_Sub4) this).anInt2447] = i_303_;
        ((Class1_Sub4) this).anIntArray2468[((Class1_Sub4) this).anInt2447] = i_304_;
        return ((Class1_Sub4) this).anInt2447++;
    }

    final Animable method57(int i, int i_306_, int i_307_)
    {
        return method127(((Class1_Sub4) this).aShort2470, ((Class1_Sub4) this).aShort2476, i, i_306_, i_307_);
    }

    final void method132()
    {
        anIntArray2483 = null;
        anIntArray2473 = null;
        ((Class1_Sub4) this).anIntArrayArray2489 = null;
        ((Class1_Sub4) this).anIntArrayArray2486 = null;
    }

    final void method133()
    {
        for (int i = 0; i < ((Class1_Sub4) this).anInt2447; i++)
        {
            int i_308_ = ((Class1_Sub4) this).anIntArray2468[i];
            ((Class1_Sub4) this).anIntArray2468[i] = ((Class1_Sub4) this).anIntArray2479[i];
            ((Class1_Sub4) this).anIntArray2479[i] = -i_308_;
        }
        method122();
    }

    private static final int method134(int[][] is, int i, int i_309_)
    {
        int i_310_ = i >> 7;
        int i_311_ = i_309_ >> 7;
        if (i_310_ < 0 || i_311_ < 0 || i_310_ >= is.length || i_311_ >= is[0].length)
            return 0;
        int i_312_ = i & 0x7f;
        int i_313_ = i_309_ & 0x7f;
        int i_314_ = ((is[i_310_][i_311_] * (128 - i_312_) + is[i_310_ + 1][i_311_] * i_312_) >> 7);
        int i_315_ = ((is[i_310_][i_311_ + 1] * (128 - i_312_) + is[i_310_ + 1][i_311_ + 1] * i_312_) >> 7);
        return i_314_ * (128 - i_313_) + i_315_ * i_313_ >> 7;
    }

    final void method135(int i, int i_316_, int i_317_)
    {
        for (int i_318_ = 0; i_318_ < ((Class1_Sub4) this).anInt2447; i_318_++)
        {
            ((Class1_Sub4) this).anIntArray2479[i_318_] = ((Class1_Sub4) this).anIntArray2479[i_318_] * i / 128;
            ((Class1_Sub4) this).anIntArray2475[i_318_] = ((Class1_Sub4) this).anIntArray2475[i_318_] * i_316_ / 128;
            ((Class1_Sub4) this).anIntArray2468[i_318_] = ((Class1_Sub4) this).anIntArray2468[i_318_] * i_317_ / 128;
        }
        method122();
    }

    private Class1_Sub4()
    {
        /* empty */
    }

    private Class1_Sub4(byte[] is)
    {
        if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
            method108(is);
        else
            method126(is);
    }

    Class1_Sub4(int i, int i_319_, int i_320_)
    {
        ((Class1_Sub4) this).anIntArray2479 = new int[i];
        ((Class1_Sub4) this).anIntArray2475 = new int[i];
        ((Class1_Sub4) this).anIntArray2468 = new int[i];
        anIntArray2483 = new int[i];
        ((Class1_Sub4) this).anIntArray2448 = new int[i_319_];
        ((Class1_Sub4) this).anIntArray2488 = new int[i_319_];
        ((Class1_Sub4) this).anIntArray2465 = new int[i_319_];
        ((Class1_Sub4) this).aByteArray2478 = new byte[i_319_];
        ((Class1_Sub4) this).aByteArray2482 = new byte[i_319_];
        ((Class1_Sub4) this).aByteArray2481 = new byte[i_319_];
        ((Class1_Sub4) this).aShortArray2464 = new short[i_319_];
        ((Class1_Sub4) this).aShortArray2467 = new short[i_319_];
        ((Class1_Sub4) this).aByteArray2494 = new byte[i_319_];
        anIntArray2473 = new int[i_319_];
        if (i_320_ > 0)
        {
            ((Class1_Sub4) this).aByteArray2463 = new byte[i_320_];
            ((Class1_Sub4) this).aShortArray2456 = new short[i_320_];
            ((Class1_Sub4) this).aShortArray2454 = new short[i_320_];
            ((Class1_Sub4) this).aShortArray2459 = new short[i_320_];
            aShortArray2474 = new short[i_320_];
            aShortArray2458 = new short[i_320_];
            aShortArray2469 = new short[i_320_];
            aByteArray2449 = new byte[i_320_];
            aByteArray2457 = new byte[i_320_];
            aByteArray2462 = new byte[i_320_];
            aByteArray2466 = new byte[i_320_];
            aByteArray2487 = new byte[i_320_];
        }
    }

    final int method136(int i, int i_321_, int i_322_, byte i_323_, short i_324_, byte i_325_)
    {
        ((Class1_Sub4) this).anIntArray2448[((Class1_Sub4) this).anInt2477] = i;
        ((Class1_Sub4) this).anIntArray2488[((Class1_Sub4) this).anInt2477] = i_321_;
        ((Class1_Sub4) this).anIntArray2465[((Class1_Sub4) this).anInt2477] = i_322_;
        ((Class1_Sub4) this).aByteArray2478[((Class1_Sub4) this).anInt2477] = i_323_;
        ((Class1_Sub4) this).aByteArray2494[((Class1_Sub4) this).anInt2477] = (byte) -1;
        ((Class1_Sub4) this).aShortArray2464[((Class1_Sub4) this).anInt2477] = i_324_;
        ((Class1_Sub4) this).aShortArray2467[((Class1_Sub4) this).anInt2477] = (short) -1;
        ((Class1_Sub4) this).aByteArray2481[((Class1_Sub4) this).anInt2477] = i_325_;
        return ((Class1_Sub4) this).anInt2477++;
    }

    Class1_Sub4(Class1_Sub4[] class1_sub4s, int i)
    {
        boolean bool = false;
        boolean bool_326_ = false;
        boolean bool_327_ = false;
        boolean bool_328_ = false;
        boolean bool_329_ = false;
        boolean bool_330_ = false;
        ((Class1_Sub4) this).anInt2447 = 0;
        ((Class1_Sub4) this).anInt2477 = 0;
        ((Class1_Sub4) this).anInt2461 = 0;
        ((Class1_Sub4) this).aByte2491 = (byte) -1;
        for (int i_331_ = 0; i_331_ < i; i_331_++)
        {
            Class1_Sub4 class1_sub4_332_ = class1_sub4s[i_331_];
            if (class1_sub4_332_ != null)
            {
                ((Class1_Sub4) this).anInt2447 += ((Class1_Sub4) class1_sub4_332_).anInt2447;
                ((Class1_Sub4) this).anInt2477 += ((Class1_Sub4) class1_sub4_332_).anInt2477;
                ((Class1_Sub4) this).anInt2461 += ((Class1_Sub4) class1_sub4_332_).anInt2461;
                if (((Class1_Sub4) class1_sub4_332_).aByteArray2482 != null)
                    bool_326_ = true;
                else
                {
                    if (((Class1_Sub4) this).aByte2491 == -1)
                        ((Class1_Sub4) this).aByte2491 = ((Class1_Sub4) class1_sub4_332_).aByte2491;
                    if (((Class1_Sub4) this).aByte2491 != ((Class1_Sub4) class1_sub4_332_).aByte2491)
                        bool_326_ = true;
                }
                bool = bool | (((Class1_Sub4) class1_sub4_332_).aByteArray2478 != null);
                bool_327_ = bool_327_ | (((Class1_Sub4) class1_sub4_332_).aByteArray2481) != null;
                bool_328_ = bool_328_ | class1_sub4_332_.anIntArray2473 != null;
                bool_329_ = bool_329_ | (((Class1_Sub4) class1_sub4_332_).aShortArray2467) != null;
                bool_330_ = bool_330_ | (((Class1_Sub4) class1_sub4_332_).aByteArray2494) != null;
            }
        }
        ((Class1_Sub4) this).anIntArray2479 = new int[((Class1_Sub4) this).anInt2447];
        ((Class1_Sub4) this).anIntArray2475 = new int[((Class1_Sub4) this).anInt2447];
        ((Class1_Sub4) this).anIntArray2468 = new int[((Class1_Sub4) this).anInt2447];
        anIntArray2483 = new int[((Class1_Sub4) this).anInt2447];
        ((Class1_Sub4) this).anIntArray2448 = new int[((Class1_Sub4) this).anInt2477];
        ((Class1_Sub4) this).anIntArray2488 = new int[((Class1_Sub4) this).anInt2477];
        ((Class1_Sub4) this).anIntArray2465 = new int[((Class1_Sub4) this).anInt2477];
        if (bool)
            ((Class1_Sub4) this).aByteArray2478 = new byte[((Class1_Sub4) this).anInt2477];
        if (bool_326_)
            ((Class1_Sub4) this).aByteArray2482 = new byte[((Class1_Sub4) this).anInt2477];
        if (bool_327_)
            ((Class1_Sub4) this).aByteArray2481 = new byte[((Class1_Sub4) this).anInt2477];
        if (bool_328_)
            anIntArray2473 = new int[((Class1_Sub4) this).anInt2477];
        if (bool_329_)
            ((Class1_Sub4) this).aShortArray2467 = new short[((Class1_Sub4) this).anInt2477];
        if (bool_330_)
            ((Class1_Sub4) this).aByteArray2494 = new byte[((Class1_Sub4) this).anInt2477];
        ((Class1_Sub4) this).aShortArray2464 = new short[((Class1_Sub4) this).anInt2477];
        if (((Class1_Sub4) this).anInt2461 > 0)
        {
            ((Class1_Sub4) this).aByteArray2463 = new byte[((Class1_Sub4) this).anInt2461];
            ((Class1_Sub4) this).aShortArray2456 = new short[((Class1_Sub4) this).anInt2461];
            ((Class1_Sub4) this).aShortArray2454 = new short[((Class1_Sub4) this).anInt2461];
            ((Class1_Sub4) this).aShortArray2459 = new short[((Class1_Sub4) this).anInt2461];
            aShortArray2474 = new short[((Class1_Sub4) this).anInt2461];
            aShortArray2458 = new short[((Class1_Sub4) this).anInt2461];
            aShortArray2469 = new short[((Class1_Sub4) this).anInt2461];
            aByteArray2449 = new byte[((Class1_Sub4) this).anInt2461];
            aByteArray2457 = new byte[((Class1_Sub4) this).anInt2461];
            aByteArray2462 = new byte[((Class1_Sub4) this).anInt2461];
            aByteArray2466 = new byte[((Class1_Sub4) this).anInt2461];
            aByteArray2487 = new byte[((Class1_Sub4) this).anInt2461];
        }
        ((Class1_Sub4) this).anInt2447 = 0;
        ((Class1_Sub4) this).anInt2477 = 0;
        ((Class1_Sub4) this).anInt2461 = 0;
        for (int i_333_ = 0; i_333_ < i; i_333_++)
        {
            Class1_Sub4 class1_sub4_334_ = class1_sub4s[i_333_];
            if (class1_sub4_334_ != null)
            {
                for (int i_335_ = 0; i_335_ < ((Class1_Sub4) class1_sub4_334_).anInt2477; i_335_++)
                {
                    if (bool && (((Class1_Sub4) class1_sub4_334_).aByteArray2478 != null))
                        ((Class1_Sub4) this).aByteArray2478[((Class1_Sub4) this).anInt2477] = (((Class1_Sub4) class1_sub4_334_).aByteArray2478[i_335_]);
                    if (bool_326_)
                    {
                        if (((Class1_Sub4) class1_sub4_334_).aByteArray2482 != null)
                            ((Class1_Sub4) this).aByteArray2482[((Class1_Sub4) this).anInt2477] = (((Class1_Sub4) class1_sub4_334_).aByteArray2482[i_335_]);
                        else
                            ((Class1_Sub4) this).aByteArray2482[((Class1_Sub4) this).anInt2477] = ((Class1_Sub4) class1_sub4_334_).aByte2491;
                    }
                    if (bool_327_ && (((Class1_Sub4) class1_sub4_334_).aByteArray2481 != null))
                        ((Class1_Sub4) this).aByteArray2481[((Class1_Sub4) this).anInt2477] = (((Class1_Sub4) class1_sub4_334_).aByteArray2481[i_335_]);
                    if (bool_328_ && class1_sub4_334_.anIntArray2473 != null)
                        anIntArray2473[((Class1_Sub4) this).anInt2477] = class1_sub4_334_.anIntArray2473[i_335_];
                    if (bool_329_)
                    {
                        if (((Class1_Sub4) class1_sub4_334_).aShortArray2467 != null)
                            ((Class1_Sub4) this).aShortArray2467[((Class1_Sub4) this).anInt2477] = (((Class1_Sub4) class1_sub4_334_).aShortArray2467[i_335_]);
                        else
                            ((Class1_Sub4) this).aShortArray2467[((Class1_Sub4) this).anInt2477] = (short) -1;
                    }
                    if (bool_330_)
                    {
                        if ((((Class1_Sub4) class1_sub4_334_).aByteArray2494 != null) && (((Class1_Sub4) class1_sub4_334_).aByteArray2494[i_335_]) != -1)
                            ((Class1_Sub4) this).aByteArray2494[((Class1_Sub4) this).anInt2477] = (byte) ((((Class1_Sub4) class1_sub4_334_).aByteArray2494[i_335_]) + ((Class1_Sub4) this).anInt2461);
                        else
                            ((Class1_Sub4) this).aByteArray2494[((Class1_Sub4) this).anInt2477] = (byte) -1;
                    }
                    ((Class1_Sub4) this).aShortArray2464[(((Class1_Sub4) this).anInt2477)] = (((Class1_Sub4) class1_sub4_334_).aShortArray2464[i_335_]);
                    ((Class1_Sub4) this).anIntArray2448[(((Class1_Sub4) this).anInt2477)] = method113(class1_sub4_334_, (((Class1_Sub4) class1_sub4_334_).anIntArray2448[i_335_]));
                    ((Class1_Sub4) this).anIntArray2488[(((Class1_Sub4) this).anInt2477)] = method113(class1_sub4_334_, (((Class1_Sub4) class1_sub4_334_).anIntArray2488[i_335_]));
                    ((Class1_Sub4) this).anIntArray2465[(((Class1_Sub4) this).anInt2477)] = method113(class1_sub4_334_, (((Class1_Sub4) class1_sub4_334_).anIntArray2465[i_335_]));
                    ((Class1_Sub4) this).anInt2477++;
                }
                for (int i_336_ = 0; i_336_ < ((Class1_Sub4) class1_sub4_334_).anInt2461; i_336_++)
                {
                    byte i_337_ = (((Class1_Sub4) this).aByteArray2463[((Class1_Sub4) this).anInt2461] = (((Class1_Sub4) class1_sub4_334_).aByteArray2463[i_336_]));
                    if (i_337_ == 0)
                    {
                        ((Class1_Sub4) this).aShortArray2456[((Class1_Sub4) this).anInt2461] = (short) method113(class1_sub4_334_, (((Class1_Sub4) class1_sub4_334_).aShortArray2456[i_336_]));
                        ((Class1_Sub4) this).aShortArray2454[((Class1_Sub4) this).anInt2461] = (short) method113(class1_sub4_334_, (((Class1_Sub4) class1_sub4_334_).aShortArray2454[i_336_]));
                        ((Class1_Sub4) this).aShortArray2459[((Class1_Sub4) this).anInt2461] = (short) method113(class1_sub4_334_, (((Class1_Sub4) class1_sub4_334_).aShortArray2459[i_336_]));
                    }
                    if (i_337_ >= 1 && i_337_ <= 3)
                    {
                        ((Class1_Sub4) this).aShortArray2456[((Class1_Sub4) this).anInt2461] = (((Class1_Sub4) class1_sub4_334_).aShortArray2456[i_336_]);
                        ((Class1_Sub4) this).aShortArray2454[((Class1_Sub4) this).anInt2461] = (((Class1_Sub4) class1_sub4_334_).aShortArray2454[i_336_]);
                        ((Class1_Sub4) this).aShortArray2459[((Class1_Sub4) this).anInt2461] = (((Class1_Sub4) class1_sub4_334_).aShortArray2459[i_336_]);
                        aShortArray2474[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aShortArray2474[i_336_];
                        aShortArray2458[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aShortArray2458[i_336_];
                        aShortArray2469[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aShortArray2469[i_336_];
                        aByteArray2449[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aByteArray2449[i_336_];
                        aByteArray2457[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aByteArray2457[i_336_];
                        aByteArray2462[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aByteArray2462[i_336_];
                    }
                    if (i_337_ == 2)
                    {
                        aByteArray2466[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aByteArray2466[i_336_];
                        aByteArray2487[((Class1_Sub4) this).anInt2461] = class1_sub4_334_.aByteArray2487[i_336_];
                    }
                    ((Class1_Sub4) this).anInt2461++;
                }
            }
        }
    }

    Class1_Sub4(Class1_Sub4 class1_sub4_338_, boolean bool, boolean bool_339_, boolean bool_340_, boolean bool_341_)
    {
        ((Class1_Sub4) this).anInt2447 = ((Class1_Sub4) class1_sub4_338_).anInt2447;
        ((Class1_Sub4) this).anInt2477 = ((Class1_Sub4) class1_sub4_338_).anInt2477;
        ((Class1_Sub4) this).anInt2461 = ((Class1_Sub4) class1_sub4_338_).anInt2461;
        if (bool)
        {
            ((Class1_Sub4) this).anIntArray2479 = ((Class1_Sub4) class1_sub4_338_).anIntArray2479;
            ((Class1_Sub4) this).anIntArray2475 = ((Class1_Sub4) class1_sub4_338_).anIntArray2475;
            ((Class1_Sub4) this).anIntArray2468 = ((Class1_Sub4) class1_sub4_338_).anIntArray2468;
        } else
        {
            ((Class1_Sub4) this).anIntArray2479 = new int[((Class1_Sub4) this).anInt2447];
            ((Class1_Sub4) this).anIntArray2475 = new int[((Class1_Sub4) this).anInt2447];
            ((Class1_Sub4) this).anIntArray2468 = new int[((Class1_Sub4) this).anInt2447];
            for (int i = 0; i < ((Class1_Sub4) this).anInt2447; i++)
            {
                ((Class1_Sub4) this).anIntArray2479[i] = ((Class1_Sub4) class1_sub4_338_).anIntArray2479[i];
                ((Class1_Sub4) this).anIntArray2475[i] = ((Class1_Sub4) class1_sub4_338_).anIntArray2475[i];
                ((Class1_Sub4) this).anIntArray2468[i] = ((Class1_Sub4) class1_sub4_338_).anIntArray2468[i];
            }
        }
        if (bool_339_)
            ((Class1_Sub4) this).aShortArray2464 = ((Class1_Sub4) class1_sub4_338_).aShortArray2464;
        else
        {
            ((Class1_Sub4) this).aShortArray2464 = new short[((Class1_Sub4) this).anInt2477];
            for (int i = 0; i < ((Class1_Sub4) this).anInt2477; i++)
                ((Class1_Sub4) this).aShortArray2464[i] = ((Class1_Sub4) class1_sub4_338_).aShortArray2464[i];
        }
        if (bool_340_ || ((Class1_Sub4) class1_sub4_338_).aShortArray2467 == null)
            ((Class1_Sub4) this).aShortArray2467 = ((Class1_Sub4) class1_sub4_338_).aShortArray2467;
        else
        {
            ((Class1_Sub4) this).aShortArray2467 = new short[((Class1_Sub4) this).anInt2477];
            for (int i = 0; i < ((Class1_Sub4) this).anInt2477; i++)
                ((Class1_Sub4) this).aShortArray2467[i] = ((Class1_Sub4) class1_sub4_338_).aShortArray2467[i];
        }
        if (bool_341_)
            ((Class1_Sub4) this).aByteArray2481 = ((Class1_Sub4) class1_sub4_338_).aByteArray2481;
        else
        {
            ((Class1_Sub4) this).aByteArray2481 = new byte[((Class1_Sub4) this).anInt2477];
            if (((Class1_Sub4) class1_sub4_338_).aByteArray2481 == null)
            {
                for (int i = 0; i < ((Class1_Sub4) this).anInt2477; i++)
                    ((Class1_Sub4) this).aByteArray2481[i] = (byte) 0;
            } else
            {
                for (int i = 0; i < ((Class1_Sub4) this).anInt2477; i++)
                    ((Class1_Sub4) this).aByteArray2481[i] = ((Class1_Sub4) class1_sub4_338_).aByteArray2481[i];
            }
        }
        ((Class1_Sub4) this).anIntArray2448 = ((Class1_Sub4) class1_sub4_338_).anIntArray2448;
        ((Class1_Sub4) this).anIntArray2488 = ((Class1_Sub4) class1_sub4_338_).anIntArray2488;
        ((Class1_Sub4) this).anIntArray2465 = ((Class1_Sub4) class1_sub4_338_).anIntArray2465;
        ((Class1_Sub4) this).aByteArray2478 = ((Class1_Sub4) class1_sub4_338_).aByteArray2478;
        ((Class1_Sub4) this).aByteArray2482 = ((Class1_Sub4) class1_sub4_338_).aByteArray2482;
        ((Class1_Sub4) this).aByteArray2494 = ((Class1_Sub4) class1_sub4_338_).aByteArray2494;
        ((Class1_Sub4) this).aByte2491 = ((Class1_Sub4) class1_sub4_338_).aByte2491;
        ((Class1_Sub4) this).aByteArray2463 = ((Class1_Sub4) class1_sub4_338_).aByteArray2463;
        ((Class1_Sub4) this).aShortArray2456 = ((Class1_Sub4) class1_sub4_338_).aShortArray2456;
        ((Class1_Sub4) this).aShortArray2454 = ((Class1_Sub4) class1_sub4_338_).aShortArray2454;
        ((Class1_Sub4) this).aShortArray2459 = ((Class1_Sub4) class1_sub4_338_).aShortArray2459;
        aShortArray2474 = class1_sub4_338_.aShortArray2474;
        aShortArray2458 = class1_sub4_338_.aShortArray2458;
        aShortArray2469 = class1_sub4_338_.aShortArray2469;
        aByteArray2449 = class1_sub4_338_.aByteArray2449;
        aByteArray2457 = class1_sub4_338_.aByteArray2457;
        aByteArray2462 = class1_sub4_338_.aByteArray2462;
        aByteArray2466 = class1_sub4_338_.aByteArray2466;
        aByteArray2487 = class1_sub4_338_.aByteArray2487;
        anIntArray2483 = class1_sub4_338_.anIntArray2483;
        anIntArray2473 = class1_sub4_338_.anIntArray2473;
        ((Class1_Sub4) this).anIntArrayArray2489 = ((Class1_Sub4) class1_sub4_338_).anIntArrayArray2489;
        ((Class1_Sub4) this).anIntArrayArray2486 = ((Class1_Sub4) class1_sub4_338_).anIntArrayArray2486;
        ((Class1_Sub4) this).aClass107Array2453 = ((Class1_Sub4) class1_sub4_338_).aClass107Array2453;
        ((Class1_Sub4) this).aClass104Array2450 = ((Class1_Sub4) class1_sub4_338_).aClass104Array2450;
        ((Class1_Sub4) this).aClass107Array2480 = ((Class1_Sub4) class1_sub4_338_).aClass107Array2480;
        ((Class1_Sub4) this).aShort2470 = ((Class1_Sub4) class1_sub4_338_).aShort2470;
        ((Class1_Sub4) this).aShort2476 = ((Class1_Sub4) class1_sub4_338_).aShort2476;
    }
}
