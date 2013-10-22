/* Class1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1_Sub4 extends Animable {
    public static int[] anIntArray2444 = Class62.anIntArray1167;
    public int anInt2445 = 0;
    public int[] anIntArray2446;
    public byte[] aByteArray2447;
    public Class104[] aClass104Array2448;
    public short aShort2449;
    public short aShort2450;
    public Class107[] aClass107Array2451;
    public short[] aShortArray2452;
    public static int[] anIntArray2453 = new int[10000];
    public short[] aShortArray2454;
    public byte[] aByteArray2455;
    public short[] aShortArray2456;
    public short[] aShortArray2457;
    public static int anInt2458 = 0;
    public int anInt2459;
    public byte[] aByteArray2460;
    public byte[] aByteArray2461;
    public short[] aShortArray2462;
    public int[] anIntArray2463;
    public byte[] aByteArray2464;
    public short[] aShortArray2465;
    public int[] anIntArray2466;
    public short[] aShortArray2467;
    public short aShort2468;
    public short aShort2469;
    public short aShort2470;
    public int[] anIntArray2471;
    public short[] aShortArray2472;
    public int[] anIntArray2473;
    public short aShort2474;
    public int anInt2475 = 0;
    public byte[] aByteArray2476;
    public int[] anIntArray2477;
    public Class107[] aClass107Array2478;
    public byte[] aByteArray2479;
    public byte[] aByteArray2480;
    public int[] anIntArray2481;
    public boolean aBoolean2482 = false;
    public short aShort2483;
    public int[][] anIntArrayArray2484;
    public byte[] aByteArray2485;
    public int[] anIntArray2486;
    public int[][] anIntArrayArray2487;
    public static int[] anIntArray2488 = new int[10000];
    public byte aByte2489 = 0;
    public short aShort2490;
    public static int[] anIntArray2491 = Class62.anIntArray1155;
    public byte[] aByteArray2492;

    public void method107(int i) {
        int i_0_ = anIntArray2491[i];
        int i_1_ = anIntArray2444[i];
        for (int i_2_ = 0; i_2_ < anInt2445; i_2_++) {
            int i_3_
                    = (anIntArray2466[i_2_] * i_0_ + anIntArray2477[i_2_] * i_1_
                    >> 16);
            anIntArray2466[i_2_]
                    = (anIntArray2466[i_2_] * i_1_ - anIntArray2477[i_2_] * i_0_
                    >> 16);
            anIntArray2477[i_2_] = i_3_;
        }
        method122();
    }

    public void method108(byte[] is) {
        Stream class68_sub14 = new Stream(is);
        Stream class68_sub14_4_ = new Stream(is);
        Stream class68_sub14_5_ = new Stream(is);
        Stream class68_sub14_6_ = new Stream(is);
        Stream class68_sub14_7_ = new Stream(is);
        Stream class68_sub14_8_ = new Stream(is);
        Stream class68_sub14_9_ = new Stream(is);
        class68_sub14.currentOffset = is.length - 23;
        int i = class68_sub14.readUnsignedWord(1355769544);
        int i_10_ = class68_sub14.readUnsignedWord(1355769544);
        int i_11_ = class68_sub14.readUnsignedByte(-6677);
        int i_12_ = class68_sub14.readUnsignedByte(-6677);
        int i_13_ = class68_sub14.readUnsignedByte(-6677);
        int i_14_ = class68_sub14.readUnsignedByte(-6677);
        int i_15_ = class68_sub14.readUnsignedByte(-6677);
        int i_16_ = class68_sub14.readUnsignedByte(-6677);
        int i_17_ = class68_sub14.readUnsignedByte(-6677);
        int i_18_ = class68_sub14.readUnsignedWord(1355769544);
        int i_19_ = class68_sub14.readUnsignedWord(1355769544);
        int i_20_ = class68_sub14.readUnsignedWord(1355769544);
        int i_21_ = class68_sub14.readUnsignedWord(1355769544);
        int i_22_ = class68_sub14.readUnsignedWord(1355769544);
        int i_23_ = 0;
        int i_24_ = 0;
        int i_25_ = 0;
        if (i_11_ > 0) {
            aByteArray2461 = new byte[i_11_];
            class68_sub14.currentOffset = 0;
            for (int i_26_ = 0; i_26_ < i_11_; i_26_++) {
                byte i_27_
                        = aByteArray2461[i_26_] = class68_sub14.method955(3390);
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
        anInt2445 = i;
        anInt2475 = i_10_;
        anInt2459 = i_11_;
        anIntArray2477 = new int[i];
        anIntArray2473 = new int[i];
        anIntArray2466 = new int[i];
        anIntArray2446 = new int[i_10_];
        anIntArray2486 = new int[i_10_];
        anIntArray2463 = new int[i_10_];
        if (i_17_ == 1)
            anIntArray2481 = new int[i];
        if (i_12_ == 1)
            aByteArray2476 = new byte[i_10_];
        if (i_13_ == 255)
            aByteArray2480 = new byte[i_10_];
        else
            aByte2489 = (byte) i_13_;
        if (i_14_ == 1)
            aByteArray2479 = new byte[i_10_];
        if (i_15_ == 1)
            anIntArray2471 = new int[i_10_];
        if (i_16_ == 1)
            aShortArray2465 = new short[i_10_];
        if (i_16_ == 1 && i_11_ > 0)
            aByteArray2492 = new byte[i_10_];
        aShortArray2462 = new short[i_10_];
        if (i_11_ > 0) {
            aShortArray2454 = new short[i_11_];
            aShortArray2452 = new short[i_11_];
            aShortArray2457 = new short[i_11_];
            if (i_24_ > 0) {
                aShortArray2472 = new short[i_24_];
                aShortArray2456 = new short[i_24_];
                aShortArray2467 = new short[i_24_];
                aByteArray2447 = new byte[i_24_];
                aByteArray2455 = new byte[i_24_];
                aByteArray2460 = new byte[i_24_];
            }
            if (i_25_ > 0) {
                aByteArray2464 = new byte[i_25_];
                aByteArray2485 = new byte[i_25_];
            }
        }
        class68_sub14.currentOffset = i_29_;
        class68_sub14_4_.currentOffset = i_40_;
        class68_sub14_5_.currentOffset = i_41_;
        class68_sub14_6_.currentOffset = i_42_;
        class68_sub14_7_.currentOffset = i_34_;
        int i_49_ = 0;
        int i_50_ = 0;
        int i_51_ = 0;
        for (int i_52_ = 0; i_52_ < i; i_52_++) {
            int i_53_ = class68_sub14.readUnsignedByte(-6677);
            int i_54_ = 0;
            if ((i_53_ & 0x1) != 0)
                i_54_ = class68_sub14_4_.method960(32767);
            int i_55_ = 0;
            if ((i_53_ & 0x2) != 0)
                i_55_ = class68_sub14_5_.method960(32767);
            int i_56_ = 0;
            if ((i_53_ & 0x4) != 0)
                i_56_ = class68_sub14_6_.method960(32767);
            anIntArray2477[i_52_] = i_49_ + i_54_;
            anIntArray2473[i_52_] = i_50_ + i_55_;
            anIntArray2466[i_52_] = i_51_ + i_56_;
            i_49_ = anIntArray2477[i_52_];
            i_50_ = anIntArray2473[i_52_];
            i_51_ = anIntArray2466[i_52_];
            if (i_17_ == 1)
                anIntArray2481[i_52_] = class68_sub14_7_.readUnsignedByte(-6677);
        }
        class68_sub14.currentOffset = i_39_;
        class68_sub14_4_.currentOffset = i_30_;
        class68_sub14_5_.currentOffset = i_32_;
        class68_sub14_6_.currentOffset = i_35_;
        class68_sub14_7_.currentOffset = i_33_;
        class68_sub14_8_.currentOffset = i_37_;
        class68_sub14_9_.currentOffset = i_38_;
        for (int i_57_ = 0; i_57_ < i_10_; i_57_++) {
            aShortArray2462[i_57_]
                    = (short) class68_sub14.readUnsignedWord(1355769544);
            if (i_12_ == 1)
                aByteArray2476[i_57_] = class68_sub14_4_.method955(3390);
            if (i_13_ == 255)
                aByteArray2480[i_57_] = class68_sub14_5_.method955(3390);
            if (i_14_ == 1)
                aByteArray2479[i_57_] = class68_sub14_6_.method955(3390);
            if (i_15_ == 1)
                anIntArray2471[i_57_] = class68_sub14_7_.readUnsignedByte(-6677);
            if (i_16_ == 1)
                aShortArray2465[i_57_]
                        = (short) (class68_sub14_8_.readUnsignedWord(1355769544) - 1);
            if (aByteArray2492 != null) {
                if (aShortArray2465[i_57_] != -1)
                    aByteArray2492[i_57_]
                            = (byte) (class68_sub14_9_.readUnsignedByte(-6677) - 1);
                else
                    aByteArray2492[i_57_] = (byte) -1;
            }
        }
        class68_sub14.currentOffset = i_36_;
        class68_sub14_4_.currentOffset = i_31_;
        int i_58_ = 0;
        int i_59_ = 0;
        int i_60_ = 0;
        int i_61_ = 0;
        for (int i_62_ = 0; i_62_ < i_10_; i_62_++) {
            int i_63_ = class68_sub14_4_.readUnsignedByte(-6677);
            if (i_63_ == 1) {
                i_58_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_58_;
                i_59_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_59_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                anIntArray2446[i_62_] = i_58_;
                anIntArray2486[i_62_] = i_59_;
                anIntArray2463[i_62_] = i_60_;
            }
            if (i_63_ == 2) {
                i_59_ = i_60_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                anIntArray2446[i_62_] = i_58_;
                anIntArray2486[i_62_] = i_59_;
                anIntArray2463[i_62_] = i_60_;
            }
            if (i_63_ == 3) {
                i_58_ = i_60_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                anIntArray2446[i_62_] = i_58_;
                anIntArray2486[i_62_] = i_59_;
                anIntArray2463[i_62_] = i_60_;
            }
            if (i_63_ == 4) {
                int i_64_ = i_58_;
                i_58_ = i_59_;
                i_59_ = i_64_;
                i_60_ = class68_sub14.method960(32767) + i_61_;
                i_61_ = i_60_;
                anIntArray2446[i_62_] = i_58_;
                anIntArray2486[i_62_] = i_59_;
                anIntArray2463[i_62_] = i_60_;
            }
        }
        class68_sub14.currentOffset = i_43_;
        class68_sub14_4_.currentOffset = i_44_;
        class68_sub14_5_.currentOffset = i_45_;
        class68_sub14_6_.currentOffset = i_46_;
        class68_sub14_7_.currentOffset = i_47_;
        class68_sub14_8_.currentOffset = i_48_;
        for (int i_65_ = 0; i_65_ < i_11_; i_65_++) {
            int i_66_ = aByteArray2461[i_65_] & 0xff;
            if (i_66_ == 0) {
                aShortArray2454[i_65_]
                        = (short) class68_sub14.readUnsignedWord(1355769544);
                aShortArray2452[i_65_]
                        = (short) class68_sub14.readUnsignedWord(1355769544);
                aShortArray2457[i_65_]
                        = (short) class68_sub14.readUnsignedWord(1355769544);
            }
            if (i_66_ == 1) {
                aShortArray2454[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2452[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2457[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2472[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aShortArray2456[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aShortArray2467[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aByteArray2447[i_65_] = class68_sub14_6_.method955(3390);
                aByteArray2455[i_65_] = class68_sub14_7_.method955(3390);
                aByteArray2460[i_65_] = class68_sub14_8_.method955(3390);
            }
            if (i_66_ == 2) {
                aShortArray2454[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2452[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2457[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2472[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aShortArray2456[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aShortArray2467[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aByteArray2447[i_65_] = class68_sub14_6_.method955(3390);
                aByteArray2455[i_65_] = class68_sub14_7_.method955(3390);
                aByteArray2460[i_65_] = class68_sub14_8_.method955(3390);
                aByteArray2464[i_65_] = class68_sub14_8_.method955(3390);
                aByteArray2485[i_65_] = class68_sub14_8_.method955(3390);
            }
            if (i_66_ == 3) {
                aShortArray2454[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2452[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2457[i_65_]
                        = (short) class68_sub14_4_.readUnsignedWord(1355769544);
                aShortArray2472[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aShortArray2456[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aShortArray2467[i_65_]
                        = (short) class68_sub14_5_.readUnsignedWord(1355769544);
                aByteArray2447[i_65_] = class68_sub14_6_.method955(3390);
                aByteArray2455[i_65_] = class68_sub14_7_.method955(3390);
                aByteArray2460[i_65_] = class68_sub14_8_.method955(3390);
            }
        }
    }

    public Class1_Sub4 method109() {
        Class1_Sub4 class1_sub4_67_ = new Class1_Sub4();
        if (aByteArray2476 != null) {
            class1_sub4_67_.aByteArray2476 = new byte[anInt2475];
            for (int i = 0; i < anInt2475; i++)
                class1_sub4_67_.aByteArray2476[i] = aByteArray2476[i];
        }
        class1_sub4_67_.anInt2445 = anInt2445;
        class1_sub4_67_.anInt2475 = anInt2475;
        class1_sub4_67_.anInt2459 = anInt2459;
        class1_sub4_67_.anIntArray2477 = anIntArray2477;
        class1_sub4_67_.anIntArray2473 = anIntArray2473;
        class1_sub4_67_.anIntArray2466 = anIntArray2466;
        class1_sub4_67_.anIntArray2446 = anIntArray2446;
        class1_sub4_67_.anIntArray2486 = anIntArray2486;
        class1_sub4_67_.anIntArray2463 = anIntArray2463;
        class1_sub4_67_.aByteArray2480 = aByteArray2480;
        class1_sub4_67_.aByteArray2479 = aByteArray2479;
        class1_sub4_67_.aByteArray2492 = aByteArray2492;
        class1_sub4_67_.aShortArray2462 = aShortArray2462;
        class1_sub4_67_.aShortArray2465 = aShortArray2465;
        class1_sub4_67_.aByte2489 = aByte2489;
        class1_sub4_67_.aByteArray2461 = aByteArray2461;
        class1_sub4_67_.aShortArray2454 = aShortArray2454;
        class1_sub4_67_.aShortArray2452 = aShortArray2452;
        class1_sub4_67_.aShortArray2457 = aShortArray2457;
        class1_sub4_67_.aShortArray2472 = aShortArray2472;
        class1_sub4_67_.aShortArray2456 = aShortArray2456;
        class1_sub4_67_.aShortArray2467 = aShortArray2467;
        class1_sub4_67_.aByteArray2447 = aByteArray2447;
        class1_sub4_67_.aByteArray2455 = aByteArray2455;
        class1_sub4_67_.aByteArray2460 = aByteArray2460;
        class1_sub4_67_.aByteArray2464 = aByteArray2464;
        class1_sub4_67_.aByteArray2485 = aByteArray2485;
        class1_sub4_67_.anIntArray2481 = anIntArray2481;
        class1_sub4_67_.anIntArray2471 = anIntArray2471;
        class1_sub4_67_.anIntArrayArray2487 = anIntArrayArray2487;
        class1_sub4_67_.anIntArrayArray2484 = anIntArrayArray2484;
        class1_sub4_67_.aClass107Array2451 = aClass107Array2451;
        class1_sub4_67_.aClass104Array2448 = aClass104Array2448;
        class1_sub4_67_.aShort2468 = aShort2468;
        class1_sub4_67_.aShort2474 = aShort2474;
        return class1_sub4_67_;
    }

    public void method110(short i, short i_68_) {
        if (aShortArray2465 != null) {
            for (int i_69_ = 0; i_69_ < anInt2475; i_69_++) {
                if (aShortArray2465[i_69_] == i)
                    aShortArray2465[i_69_] = i_68_;
            }
        }
    }

    public Class1_Sub4 method111(int i, int i_70_, int[][] is, int[][] is_71_,
                                 int i_72_, int i_73_, int i_74_, boolean bool,
                                 boolean bool_75_) {
        method121();
        int i_76_ = i_72_ + aShort2490;
        int i_77_ = i_72_ + aShort2449;
        int i_78_ = i_74_ + aShort2450;
        int i_79_ = i_74_ + aShort2483;
        if ((i == 1 || i == 2 || i == 3 || i == 5)
                && (i_76_ < 0 || i_77_ + 128 >> 7 >= is.length || i_78_ < 0
                || i_79_ + 128 >> 7 >= is[0].length))
            return this;
        if (i == 4 || i == 5) {
            if (is_71_ == null)
                return this;
            if (i_76_ < 0 || i_77_ + 128 >> 7 >= is_71_.length || i_78_ < 0
                    || i_79_ + 128 >> 7 >= is_71_[0].length)
                return this;
        } else {
            i_76_ >>= 7;
            i_77_ = i_77_ + 127 >> 7;
            i_78_ >>= 7;
            i_79_ = i_79_ + 127 >> 7;
            if (is[i_76_][i_78_] == i_73_ && is[i_77_][i_78_] == i_73_
                    && is[i_76_][i_79_] == i_73_ && is[i_77_][i_79_] == i_73_)
                return this;
        }
        Class1_Sub4 class1_sub4_80_;
        if (bool) {
            class1_sub4_80_ = new Class1_Sub4();
            class1_sub4_80_.anInt2445 = anInt2445;
            class1_sub4_80_.anInt2475 = anInt2475;
            class1_sub4_80_.anInt2459 = anInt2459;
            class1_sub4_80_.anIntArray2446 = anIntArray2446;
            class1_sub4_80_.anIntArray2486 = anIntArray2486;
            class1_sub4_80_.anIntArray2463 = anIntArray2463;
            class1_sub4_80_.aByteArray2476 = aByteArray2476;
            class1_sub4_80_.aByteArray2480 = aByteArray2480;
            class1_sub4_80_.aByteArray2479 = aByteArray2479;
            class1_sub4_80_.aByteArray2492 = aByteArray2492;
            class1_sub4_80_.aShortArray2462 = aShortArray2462;
            class1_sub4_80_.aShortArray2465 = aShortArray2465;
            class1_sub4_80_.aByte2489 = aByte2489;
            class1_sub4_80_.aByteArray2461 = aByteArray2461;
            class1_sub4_80_.aShortArray2454 = aShortArray2454;
            class1_sub4_80_.aShortArray2452 = aShortArray2452;
            class1_sub4_80_.aShortArray2457 = aShortArray2457;
            class1_sub4_80_.aShortArray2472 = aShortArray2472;
            class1_sub4_80_.aShortArray2456 = aShortArray2456;
            class1_sub4_80_.aShortArray2467 = aShortArray2467;
            class1_sub4_80_.aByteArray2447 = aByteArray2447;
            class1_sub4_80_.aByteArray2455 = aByteArray2455;
            class1_sub4_80_.aByteArray2460 = aByteArray2460;
            class1_sub4_80_.aByteArray2464 = aByteArray2464;
            class1_sub4_80_.aByteArray2485 = aByteArray2485;
            class1_sub4_80_.anIntArray2481 = anIntArray2481;
            class1_sub4_80_.anIntArray2471 = anIntArray2471;
            class1_sub4_80_.anIntArrayArray2487 = anIntArrayArray2487;
            class1_sub4_80_.anIntArrayArray2484 = anIntArrayArray2484;
            class1_sub4_80_.aShort2468 = aShort2468;
            class1_sub4_80_.aShort2474 = aShort2474;
            class1_sub4_80_.aClass107Array2451 = aClass107Array2451;
            class1_sub4_80_.aClass104Array2448 = aClass104Array2448;
            class1_sub4_80_.aClass107Array2478 = aClass107Array2478;
            if (i == 3) {
                class1_sub4_80_.anIntArray2477
                        = Class106.method1645(anIntArray2477, -105);
                class1_sub4_80_.anIntArray2473
                        = Class106.method1645(anIntArray2473, -33);
                class1_sub4_80_.anIntArray2466
                        = Class106.method1645(anIntArray2466, -98);
            } else {
                class1_sub4_80_.anIntArray2477 = anIntArray2477;
                class1_sub4_80_.anIntArray2473
                        = new int[class1_sub4_80_.anInt2445];
                class1_sub4_80_.anIntArray2466 = anIntArray2466;
            }
        } else
            class1_sub4_80_ = this;
        if (i == 1) {
            for (int i_81_ = 0; i_81_ < class1_sub4_80_.anInt2445; i_81_++) {
                int i_82_ = anIntArray2477[i_81_] + i_72_;
                int i_83_ = anIntArray2466[i_81_] + i_74_;
                int i_84_ = i_82_ & 0x7f;
                int i_85_ = i_83_ & 0x7f;
                int i_86_ = i_82_ >> 7;
                int i_87_ = i_83_ >> 7;
                int i_88_ = ((is[i_86_][i_87_] * (128 - i_84_)
                        + is[i_86_ + 1][i_87_] * i_84_)
                        >> 7);
                int i_89_ = ((is[i_86_][i_87_ + 1] * (128 - i_84_)
                        + is[i_86_ + 1][i_87_ + 1] * i_84_)
                        >> 7);
                int i_90_ = i_88_ * (128 - i_85_) + i_89_ * i_85_ >> 7;
                class1_sub4_80_.anIntArray2473[i_81_]
                        = anIntArray2473[i_81_] + i_90_ - i_73_;
            }
        } else if (i == 2) {
            for (int i_91_ = 0; i_91_ < class1_sub4_80_.anInt2445; i_91_++) {
                int i_92_ = (anIntArray2473[i_91_] << 16) / aShort2470;
                if (i_92_ < i_70_) {
                    int i_93_ = anIntArray2477[i_91_] + i_72_;
                    int i_94_ = anIntArray2466[i_91_] + i_74_;
                    int i_95_ = i_93_ & 0x7f;
                    int i_96_ = i_94_ & 0x7f;
                    int i_97_ = i_93_ >> 7;
                    int i_98_ = i_94_ >> 7;
                    int i_99_ = ((is[i_97_][i_98_] * (128 - i_95_)
                            + is[i_97_ + 1][i_98_] * i_95_)
                            >> 7);
                    int i_100_ = ((is[i_97_][i_98_ + 1] * (128 - i_95_)
                            + is[i_97_ + 1][i_98_ + 1] * i_95_)
                            >> 7);
                    int i_101_ = i_99_ * (128 - i_96_) + i_100_ * i_96_ >> 7;
                    class1_sub4_80_.anIntArray2473[i_91_]
                            = (anIntArray2473[i_91_]
                            + (i_101_ - i_73_) * (i_70_ - i_92_) / i_70_);
                } else
                    class1_sub4_80_.anIntArray2473[i_91_]
                            = anIntArray2473[i_91_];
            }
        } else if (i == 3) {
            int i_102_ = (i_70_ & 0xff) * 4;
            int i_103_ = (i_70_ >> 8 & 0xff) * 4;
            method119(is, i_72_, i_73_, i_74_, i_102_, i_103_);
        } else if (i == 4) {
            int i_104_ = aShort2469 - aShort2470;
            for (int i_105_ = 0; i_105_ < anInt2445; i_105_++) {
                int i_106_ = anIntArray2477[i_105_] + i_72_;
                int i_107_ = anIntArray2466[i_105_] + i_74_;
                int i_108_ = i_106_ & 0x7f;
                int i_109_ = i_107_ & 0x7f;
                int i_110_ = i_106_ >> 7;
                int i_111_ = i_107_ >> 7;
                int i_112_ = ((is_71_[i_110_][i_111_] * (128 - i_108_)
                        + is_71_[i_110_ + 1][i_111_] * i_108_)
                        >> 7);
                int i_113_ = ((is_71_[i_110_][i_111_ + 1] * (128 - i_108_)
                        + is_71_[i_110_ + 1][i_111_ + 1] * i_108_)
                        >> 7);
                int i_114_ = i_112_ * (128 - i_109_) + i_113_ * i_109_ >> 7;
                class1_sub4_80_.anIntArray2473[i_105_]
                        = anIntArray2473[i_105_] + (i_114_ - i_73_) + i_104_;
            }
        } else if (i == 5) {
            int i_115_ = aShort2469 - aShort2470;
            for (int i_116_ = 0; i_116_ < anInt2445; i_116_++) {
                int i_117_ = anIntArray2477[i_116_] + i_72_;
                int i_118_ = anIntArray2466[i_116_] + i_74_;
                int i_119_ = i_117_ & 0x7f;
                int i_120_ = i_118_ & 0x7f;
                int i_121_ = i_117_ >> 7;
                int i_122_ = i_118_ >> 7;
                int i_123_ = ((is[i_121_][i_122_] * (128 - i_119_)
                        + is[i_121_ + 1][i_122_] * i_119_)
                        >> 7);
                int i_124_ = ((is[i_121_][i_122_ + 1] * (128 - i_119_)
                        + is[i_121_ + 1][i_122_ + 1] * i_119_)
                        >> 7);
                int i_125_ = i_123_ * (128 - i_120_) + i_124_ * i_120_ >> 7;
                i_123_ = (is_71_[i_121_][i_122_] * (128 - i_119_)
                        + is_71_[i_121_ + 1][i_122_] * i_119_) >> 7;
                i_124_ = (is_71_[i_121_][i_122_ + 1] * (128 - i_119_)
                        + is_71_[i_121_ + 1][i_122_ + 1] * i_119_) >> 7;
                int i_126_ = i_123_ * (128 - i_120_) + i_124_ * i_120_ >> 7;
                int i_127_ = i_125_ - i_126_;
                class1_sub4_80_.anIntArray2473[i_116_]
                        = (((anIntArray2473[i_116_] << 8) / i_115_ * i_127_ >> 8)
                        - (i_73_ - i_125_));
            }
        }
        if (bool_75_)
            class1_sub4_80_.method122();
        else
            aBoolean2482 = false;
        return class1_sub4_80_;
    }

    public void method112() {
        if (anIntArray2481 != null) {
            int[] is = new int[256];
            int i = 0;
            for (int i_128_ = 0; i_128_ < anInt2445; i_128_++) {
                int i_129_ = anIntArray2481[i_128_];
                is[i_129_]++;
                if (i_129_ > i)
                    i = i_129_;
            }
            anIntArrayArray2487 = new int[i + 1][];
            for (int i_130_ = 0; i_130_ <= i; i_130_++) {
                anIntArrayArray2487[i_130_] = new int[is[i_130_]];
                is[i_130_] = 0;
            }
            for (int i_131_ = 0; i_131_ < anInt2445; i_131_++) {
                int i_132_ = anIntArray2481[i_131_];
                anIntArrayArray2487[i_132_][is[i_132_]++] = i_131_;
            }
            anIntArray2481 = null;
        }
        if (anIntArray2471 != null) {
            int[] is = new int[256];
            int i = 0;
            for (int i_133_ = 0; i_133_ < anInt2475; i_133_++) {
                int i_134_ = anIntArray2471[i_133_];
                is[i_134_]++;
                if (i_134_ > i)
                    i = i_134_;
            }
            anIntArrayArray2484 = new int[i + 1][];
            for (int i_135_ = 0; i_135_ <= i; i_135_++) {
                anIntArrayArray2484[i_135_] = new int[is[i_135_]];
                is[i_135_] = 0;
            }
            for (int i_136_ = 0; i_136_ < anInt2475; i_136_++) {
                int i_137_ = anIntArray2471[i_136_];
                anIntArrayArray2484[i_137_][is[i_137_]++] = i_136_;
            }
            anIntArray2471 = null;
        }
    }

    public void method52(Animable class1, int i, int i_138_, int i_139_,
                         boolean bool) {
        Class1_Sub4 class1_sub4_140_ = (Class1_Sub4) class1;
        class1_sub4_140_.method121();
        class1_sub4_140_.method120();
        anInt2458++;
        int i_141_ = 0;
        int[] is = class1_sub4_140_.anIntArray2477;
        int i_142_ = class1_sub4_140_.anInt2445;
        for (int i_143_ = 0; i_143_ < anInt2445; i_143_++) {
            Class107 class107 = aClass107Array2451[i_143_];
            if (class107.anInt1814 != 0) {
                int i_144_ = anIntArray2473[i_143_] - i_138_;
                if (i_144_ >= class1_sub4_140_.aShort2470
                        && i_144_ <= class1_sub4_140_.aShort2469) {
                    int i_145_ = anIntArray2477[i_143_] - i;
                    if (i_145_ >= class1_sub4_140_.aShort2490
                            && i_145_ <= class1_sub4_140_.aShort2449) {
                        int i_146_ = anIntArray2466[i_143_] - i_139_;
                        if (i_146_ >= class1_sub4_140_.aShort2450
                                && i_146_ <= class1_sub4_140_.aShort2483) {
                            for (int i_147_ = 0; i_147_ < i_142_; i_147_++) {
                                Class107 class107_148_
                                        = (class1_sub4_140_.aClass107Array2451
                                        [i_147_]);
                                if (i_145_ == is[i_147_]
                                        && i_146_ == (class1_sub4_140_
                                        .anIntArray2466[i_147_])
                                        && i_144_ == (class1_sub4_140_
                                        .anIntArray2473[i_147_])
                                        && class107_148_.anInt1814 != 0) {
                                    if (aClass107Array2478 == null)
                                        aClass107Array2478
                                                = new Class107[anInt2445];
                                    if (class1_sub4_140_.aClass107Array2478
                                            == null)
                                        class1_sub4_140_.aClass107Array2478
                                                = new Class107[i_142_];
                                    Class107 class107_149_
                                            = aClass107Array2478[i_143_];
                                    if (class107_149_ == null)
                                        class107_149_
                                                = aClass107Array2478[i_143_]
                                                = new Class107(class107);
                                    Class107 class107_150_
                                            = (class1_sub4_140_.aClass107Array2478
                                            [i_147_]);
                                    if (class107_150_ == null)
                                        class107_150_
                                                = class1_sub4_140_
                                                .aClass107Array2478[i_147_]
                                                = new Class107(class107_148_);
                                    class107_149_.anInt1820
                                            += class107_148_.anInt1820;
                                    class107_149_.anInt1822
                                            += class107_148_.anInt1822;
                                    class107_149_.anInt1811
                                            += class107_148_.anInt1811;
                                    class107_149_.anInt1814
                                            += class107_148_.anInt1814;
                                    class107_150_.anInt1820
                                            += class107.anInt1820;
                                    class107_150_.anInt1822
                                            += class107.anInt1822;
                                    class107_150_.anInt1811
                                            += class107.anInt1811;
                                    class107_150_.anInt1814
                                            += class107.anInt1814;
                                    i_141_++;
                                    anIntArray2488[i_143_] = anInt2458;
                                    anIntArray2453[i_147_] = anInt2458;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i_141_ >= 3 && bool) {
            for (int i_151_ = 0; i_151_ < anInt2475; i_151_++) {
                if (anIntArray2488[anIntArray2446[i_151_]] == anInt2458
                        && anIntArray2488[anIntArray2486[i_151_]] == anInt2458
                        && anIntArray2488[anIntArray2463[i_151_]] == anInt2458) {
                    if (aByteArray2476 == null)
                        aByteArray2476 = new byte[anInt2475];
                    aByteArray2476[i_151_] = (byte) 2;
                }
            }
            for (int i_152_ = 0; i_152_ < class1_sub4_140_.anInt2475;
                 i_152_++) {
                if ((anIntArray2453[class1_sub4_140_.anIntArray2446[i_152_]]
                        == anInt2458)
                        && (anIntArray2453[class1_sub4_140_.anIntArray2486[i_152_]]
                        == anInt2458)
                        && (anIntArray2453[class1_sub4_140_.anIntArray2463[i_152_]]
                        == anInt2458)) {
                    if (class1_sub4_140_.aByteArray2476 == null)
                        class1_sub4_140_.aByteArray2476
                                = new byte[class1_sub4_140_.anInt2475];
                    class1_sub4_140_.aByteArray2476[i_152_] = (byte) 2;
                }
            }
        }
    }

    public int method113(Class1_Sub4 class1_sub4_153_, int i) {
        int i_154_ = -1;
        int i_155_ = class1_sub4_153_.anIntArray2477[i];
        int i_156_ = class1_sub4_153_.anIntArray2473[i];
        int i_157_ = class1_sub4_153_.anIntArray2466[i];
        for (int i_158_ = 0; i_158_ < anInt2445; i_158_++) {
            if (i_155_ == anIntArray2477[i_158_]
                    && i_156_ == anIntArray2473[i_158_]
                    && i_157_ == anIntArray2466[i_158_]) {
                i_154_ = i_158_;
                break;
            }
        }
        if (i_154_ == -1) {
            anIntArray2477[anInt2445] = i_155_;
            anIntArray2473[anInt2445] = i_156_;
            anIntArray2466[anInt2445] = i_157_;
            if (class1_sub4_153_.anIntArray2481 != null)
                anIntArray2481[anInt2445] = class1_sub4_153_.anIntArray2481[i];
            i_154_ = anInt2445++;
        }
        return i_154_;
    }

    public void method114() {
        for (int i = 0; i < anInt2445; i++)
            anIntArray2466[i] = -anIntArray2466[i];
        for (int i = 0; i < anInt2475; i++) {
            int i_159_ = anIntArray2446[i];
            anIntArray2446[i] = anIntArray2463[i];
            anIntArray2463[i] = i_159_;
        }
        method122();
    }

    public static Class1_Sub4 method115(Class21renamed class21, int i, int i_160_) {
        byte[] is = class21.method338(i_160_, 0, i);
        if (is == null)
            return null;
        return new Class1_Sub4(is);
    }

    public void method51(int i, int i_161_, int i_162_, int i_163_, int i_164_,
                         int i_165_, int i_166_, int i_167_, long l) {
        /* empty */
    }

    public static void method116() {
        anIntArray2488 = null;
        anIntArray2453 = null;
        anIntArray2491 = null;
        anIntArray2444 = null;
    }

    public void method117(int i) {
        int i_168_ = anIntArray2491[i];
        int i_169_ = anIntArray2444[i];
        for (int i_170_ = 0; i_170_ < anInt2445; i_170_++) {
            int i_171_ = ((anIntArray2473[i_170_] * i_168_
                    + anIntArray2477[i_170_] * i_169_)
                    >> 16);
            anIntArray2473[i_170_] = (anIntArray2473[i_170_] * i_169_
                    - anIntArray2477[i_170_] * i_168_) >> 16;
            anIntArray2477[i_170_] = i_171_;
        }
        method122();
    }

    public Class1_Sub3_Sub1 method118(int i, int i_172_, int i_173_,
                                      int i_174_, int i_175_) {
        return new Class1_Sub3_Sub1(this, i, i_172_, i_173_, i_174_, i_175_);
    }

    public void method119(int[][] is, int i, int i_176_, int i_177_,
                          int i_178_, int i_179_) {
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
        if (i_179_ != 0) {
            int i_198_ = ((int) (Math.atan2((double) (i_194_ - i_195_),
                    (double) i_179_)
                    * 325.95)
                    & 0x7ff);
            if (i_198_ != 0)
                method124(i_198_);
        }
        if (i_178_ != 0) {
            int i_199_ = ((int) (Math.atan2((double) (i_197_ - i_196_),
                    (double) i_178_)
                    * 325.95)
                    & 0x7ff);
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

    public void method120() {
        if (aClass107Array2451 == null) {
            aClass107Array2451 = new Class107[anInt2445];
            for (int i = 0; i < anInt2445; i++)
                aClass107Array2451[i] = new Class107();
            for (int i = 0; i < anInt2475; i++) {
                int i_201_ = anIntArray2446[i];
                int i_202_ = anIntArray2486[i];
                int i_203_ = anIntArray2463[i];
                int i_204_ = anIntArray2477[i_202_] - anIntArray2477[i_201_];
                int i_205_ = anIntArray2473[i_202_] - anIntArray2473[i_201_];
                int i_206_ = anIntArray2466[i_202_] - anIntArray2466[i_201_];
                int i_207_ = anIntArray2477[i_203_] - anIntArray2477[i_201_];
                int i_208_ = anIntArray2473[i_203_] - anIntArray2473[i_201_];
                int i_209_ = anIntArray2466[i_203_] - anIntArray2466[i_201_];
                int i_210_ = i_205_ * i_209_ - i_208_ * i_206_;
                int i_211_ = i_206_ * i_207_ - i_209_ * i_204_;
                int i_212_;
                for (i_212_ = i_204_ * i_208_ - i_207_ * i_205_;
                     (i_210_ > 8192 || i_211_ > 8192 || i_212_ > 8192
                             || i_210_ < -8192 || i_211_ < -8192 || i_212_ < -8192);
                     i_212_ >>= 1) {
                    i_210_ >>= 1;
                    i_211_ >>= 1;
                }
                int i_213_ = (int) Math.sqrt((double) (i_210_ * i_210_
                        + i_211_ * i_211_
                        + i_212_ * i_212_));
                if (i_213_ <= 0)
                    i_213_ = 1;
                i_210_ = i_210_ * 256 / i_213_;
                i_211_ = i_211_ * 256 / i_213_;
                i_212_ = i_212_ * 256 / i_213_;
                byte i_214_;
                if (aByteArray2476 == null)
                    i_214_ = (byte) 0;
                else
                    i_214_ = aByteArray2476[i];
                if (i_214_ == 0) {
                    Class107 class107 = aClass107Array2451[i_201_];
                    class107.anInt1820 += i_210_;
                    class107.anInt1822 += i_211_;
                    class107.anInt1811 += i_212_;
                    class107.anInt1814++;
                    class107 = aClass107Array2451[i_202_];
                    class107.anInt1820 += i_210_;
                    class107.anInt1822 += i_211_;
                    class107.anInt1811 += i_212_;
                    class107.anInt1814++;
                    class107 = aClass107Array2451[i_203_];
                    class107.anInt1820 += i_210_;
                    class107.anInt1822 += i_211_;
                    class107.anInt1811 += i_212_;
                    class107.anInt1814++;
                } else if (i_214_ == 1) {
                    if (aClass104Array2448 == null)
                        aClass104Array2448 = new Class104[anInt2475];
                    Class104 class104 = aClass104Array2448[i] = new Class104();
                    class104.anInt1781 = i_210_;
                    class104.anInt1788 = i_211_;
                    class104.anInt1782 = i_212_;
                }
            }
        }
    }

    public void method121() {
        if (!aBoolean2482) {
            aBoolean2482 = true;
            int i = 32767;
            int i_215_ = 32767;
            int i_216_ = 32767;
            int i_217_ = -32768;
            int i_218_ = -32768;
            int i_219_ = -32768;
            for (int i_220_ = 0; i_220_ < anInt2445; i_220_++) {
                int i_221_ = anIntArray2477[i_220_];
                int i_222_ = anIntArray2473[i_220_];
                int i_223_ = anIntArray2466[i_220_];
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
            aShort2490 = (short) i;
            aShort2449 = (short) i_217_;
            aShort2470 = (short) i_215_;
            aShort2469 = (short) i_218_;
            aShort2450 = (short) i_216_;
            aShort2483 = (short) i_219_;
        }
    }

    public int method56() {
        if (!aBoolean2482)
            method121();
        return aShort2470;
    }

    public void method122() {
        aClass107Array2451 = null;
        aClass107Array2478 = null;
        aClass104Array2448 = null;
        aBoolean2482 = false;
    }

    public void method123() {
        for (int i = 0; i < anInt2445; i++) {
            anIntArray2477[i] = -anIntArray2477[i];
            anIntArray2466[i] = -anIntArray2466[i];
        }
        method122();
    }

    public void method124(int i) {
        int i_224_ = anIntArray2491[i];
        int i_225_ = anIntArray2444[i];
        for (int i_226_ = 0; i_226_ < anInt2445; i_226_++) {
            int i_227_ = ((anIntArray2473[i_226_] * i_225_
                    - anIntArray2466[i_226_] * i_224_)
                    >> 16);
            anIntArray2466[i_226_] = (anIntArray2473[i_226_] * i_224_
                    + anIntArray2466[i_226_] * i_225_) >> 16;
            anIntArray2473[i_226_] = i_227_;
        }
        method122();
    }

    public void method125(int i, int i_228_, int i_229_) {
        if (i_229_ != 0) {
            int i_230_ = anIntArray2491[i_229_];
            int i_231_ = anIntArray2444[i_229_];
            for (int i_232_ = 0; i_232_ < anInt2445; i_232_++) {
                int i_233_ = ((anIntArray2473[i_232_] * i_230_
                        + anIntArray2477[i_232_] * i_231_)
                        >> 16);
                anIntArray2473[i_232_]
                        = (anIntArray2473[i_232_] * i_231_
                        - anIntArray2477[i_232_] * i_230_) >> 16;
                anIntArray2477[i_232_] = i_233_;
            }
        }
        if (i != 0) {
            int i_234_ = anIntArray2491[i];
            int i_235_ = anIntArray2444[i];
            for (int i_236_ = 0; i_236_ < anInt2445; i_236_++) {
                int i_237_ = ((anIntArray2473[i_236_] * i_235_
                        - anIntArray2466[i_236_] * i_234_)
                        >> 16);
                anIntArray2466[i_236_]
                        = (anIntArray2473[i_236_] * i_234_
                        + anIntArray2466[i_236_] * i_235_) >> 16;
                anIntArray2473[i_236_] = i_237_;
            }
        }
        if (i_228_ != 0) {
            int i_238_ = anIntArray2491[i_228_];
            int i_239_ = anIntArray2444[i_228_];
            for (int i_240_ = 0; i_240_ < anInt2445; i_240_++) {
                int i_241_ = ((anIntArray2466[i_240_] * i_238_
                        + anIntArray2477[i_240_] * i_239_)
                        >> 16);
                anIntArray2466[i_240_]
                        = (anIntArray2466[i_240_] * i_239_
                        - anIntArray2477[i_240_] * i_238_) >> 16;
                anIntArray2477[i_240_] = i_241_;
            }
        }
    }

    public void method126(byte[] is) {
        boolean bool = false;
        boolean bool_242_ = false;
        Stream class68_sub14 = new Stream(is);
        Stream class68_sub14_243_ = new Stream(is);
        Stream class68_sub14_244_ = new Stream(is);
        Stream class68_sub14_245_ = new Stream(is);
        Stream class68_sub14_246_ = new Stream(is);
        class68_sub14.currentOffset = is.length - 18;
        int i = class68_sub14.readUnsignedWord(1355769544);
        int i_247_ = class68_sub14.readUnsignedWord(1355769544);
        int i_248_ = class68_sub14.readUnsignedByte(-6677);
        int i_249_ = class68_sub14.readUnsignedByte(-6677);
        int i_250_ = class68_sub14.readUnsignedByte(-6677);
        int i_251_ = class68_sub14.readUnsignedByte(-6677);
        int i_252_ = class68_sub14.readUnsignedByte(-6677);
        int i_253_ = class68_sub14.readUnsignedByte(-6677);
        int i_254_ = class68_sub14.readUnsignedWord(1355769544);
        int i_255_ = class68_sub14.readUnsignedWord(1355769544);
        int i_256_ = class68_sub14.readUnsignedWord(1355769544);
        int i_257_ = class68_sub14.readUnsignedWord(1355769544);
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
        anInt2445 = i;
        anInt2475 = i_247_;
        anInt2459 = i_248_;
        anIntArray2477 = new int[i];
        anIntArray2473 = new int[i];
        anIntArray2466 = new int[i];
        anIntArray2446 = new int[i_247_];
        anIntArray2486 = new int[i_247_];
        anIntArray2463 = new int[i_247_];
        if (i_248_ > 0) {
            aByteArray2461 = new byte[i_248_];
            aShortArray2454 = new short[i_248_];
            aShortArray2452 = new short[i_248_];
            aShortArray2457 = new short[i_248_];
        }
        if (i_253_ == 1)
            anIntArray2481 = new int[i];
        if (i_249_ == 1) {
            aByteArray2476 = new byte[i_247_];
            aByteArray2492 = new byte[i_247_];
            aShortArray2465 = new short[i_247_];
        }
        if (i_250_ == 255)
            aByteArray2480 = new byte[i_247_];
        else
            aByte2489 = (byte) i_250_;
        if (i_251_ == 1)
            aByteArray2479 = new byte[i_247_];
        if (i_252_ == 1)
            anIntArray2471 = new int[i_247_];
        aShortArray2462 = new short[i_247_];
        class68_sub14.currentOffset = i_259_;
        class68_sub14_243_.currentOffset = i_269_;
        class68_sub14_244_.currentOffset = i_270_;
        class68_sub14_245_.currentOffset = i_271_;
        class68_sub14_246_.currentOffset = i_264_;
        int i_272_ = 0;
        int i_273_ = 0;
        int i_274_ = 0;
        for (int i_275_ = 0; i_275_ < i; i_275_++) {
            int i_276_ = class68_sub14.readUnsignedByte(-6677);
            int i_277_ = 0;
            if ((i_276_ & 0x1) != 0)
                i_277_ = class68_sub14_243_.method960(32767);
            int i_278_ = 0;
            if ((i_276_ & 0x2) != 0)
                i_278_ = class68_sub14_244_.method960(32767);
            int i_279_ = 0;
            if ((i_276_ & 0x4) != 0)
                i_279_ = class68_sub14_245_.method960(32767);
            anIntArray2477[i_275_] = i_272_ + i_277_;
            anIntArray2473[i_275_] = i_273_ + i_278_;
            anIntArray2466[i_275_] = i_274_ + i_279_;
            i_272_ = anIntArray2477[i_275_];
            i_273_ = anIntArray2473[i_275_];
            i_274_ = anIntArray2466[i_275_];
            if (i_253_ == 1)
                anIntArray2481[i_275_] = class68_sub14_246_.readUnsignedByte(-6677);
        }
        class68_sub14.currentOffset = i_267_;
        class68_sub14_243_.currentOffset = i_263_;
        class68_sub14_244_.currentOffset = i_261_;
        class68_sub14_245_.currentOffset = i_265_;
        class68_sub14_246_.currentOffset = i_262_;
        for (int i_280_ = 0; i_280_ < i_247_; i_280_++) {
            aShortArray2462[i_280_]
                    = (short) class68_sub14.readUnsignedWord(1355769544);
            if (i_249_ == 1) {
                int i_281_ = class68_sub14_243_.readUnsignedByte(-6677);
                if ((i_281_ & 0x1) == 1) {
                    aByteArray2476[i_280_] = (byte) 1;
                    bool = true;
                } else
                    aByteArray2476[i_280_] = (byte) 0;
                if ((i_281_ & 0x2) == 2) {
                    aByteArray2492[i_280_] = (byte) (i_281_ >> 2);
                    aShortArray2465[i_280_] = aShortArray2462[i_280_];
                    aShortArray2462[i_280_] = (short) 127;
                    if (aShortArray2465[i_280_] != -1)
                        bool_242_ = true;
                } else {
                    aByteArray2492[i_280_] = (byte) -1;
                    aShortArray2465[i_280_] = (short) -1;
                }
            }
            if (i_250_ == 255)
                aByteArray2480[i_280_] = class68_sub14_244_.method955(3390);
            if (i_251_ == 1)
                aByteArray2479[i_280_] = class68_sub14_245_.method955(3390);
            if (i_252_ == 1)
                anIntArray2471[i_280_] = class68_sub14_246_.readUnsignedByte(-6677);
        }
        class68_sub14.currentOffset = i_266_;
        class68_sub14_243_.currentOffset = i_260_;
        int i_282_ = 0;
        int i_283_ = 0;
        int i_284_ = 0;
        int i_285_ = 0;
        for (int i_286_ = 0; i_286_ < i_247_; i_286_++) {
            int i_287_ = class68_sub14_243_.readUnsignedByte(-6677);
            if (i_287_ == 1) {
                i_282_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_282_;
                i_283_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_283_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                anIntArray2446[i_286_] = i_282_;
                anIntArray2486[i_286_] = i_283_;
                anIntArray2463[i_286_] = i_284_;
            }
            if (i_287_ == 2) {
                i_283_ = i_284_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                anIntArray2446[i_286_] = i_282_;
                anIntArray2486[i_286_] = i_283_;
                anIntArray2463[i_286_] = i_284_;
            }
            if (i_287_ == 3) {
                i_282_ = i_284_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                anIntArray2446[i_286_] = i_282_;
                anIntArray2486[i_286_] = i_283_;
                anIntArray2463[i_286_] = i_284_;
            }
            if (i_287_ == 4) {
                int i_288_ = i_282_;
                i_282_ = i_283_;
                i_283_ = i_288_;
                i_284_ = class68_sub14.method960(32767) + i_285_;
                i_285_ = i_284_;
                anIntArray2446[i_286_] = i_282_;
                anIntArray2486[i_286_] = i_283_;
                anIntArray2463[i_286_] = i_284_;
            }
        }
        class68_sub14.currentOffset = i_268_;
        for (int i_289_ = 0; i_289_ < i_248_; i_289_++) {
            aByteArray2461[i_289_] = (byte) 0;
            aShortArray2454[i_289_]
                    = (short) class68_sub14.readUnsignedWord(1355769544);
            aShortArray2452[i_289_]
                    = (short) class68_sub14.readUnsignedWord(1355769544);
            aShortArray2457[i_289_]
                    = (short) class68_sub14.readUnsignedWord(1355769544);
        }
        if (aByteArray2492 != null) {
            boolean bool_290_ = false;
            for (int i_291_ = 0; i_291_ < i_247_; i_291_++) {
                int i_292_ = aByteArray2492[i_291_] & 0xff;
                if (i_292_ != 255) {
                    if (((aShortArray2454[i_292_] & 0xffff)
                            == anIntArray2446[i_291_])
                            && ((aShortArray2452[i_292_] & 0xffff)
                            == anIntArray2486[i_291_])
                            && ((aShortArray2457[i_292_] & 0xffff)
                            == anIntArray2463[i_291_]))
                        aByteArray2492[i_291_] = (byte) -1;
                    else
                        bool_290_ = true;
                }
            }
            if (!bool_290_)
                aByteArray2492 = null;
        }
        if (!bool_242_)
            aShortArray2465 = null;
        if (!bool)
            aByteArray2476 = null;
    }

    public Class1_Sub3 method127(int i, int i_293_, int i_294_, int i_295_,
                                 int i_296_) {
        return new Class1_Sub3_Sub1(this, i, i_293_, i_294_, i_295_, i_296_);
    }

    public void method128(int i, int i_297_, int i_298_) {
        for (int i_299_ = 0; i_299_ < anInt2445; i_299_++) {
            anIntArray2477[i_299_] += i;
            anIntArray2473[i_299_] += i_297_;
            anIntArray2466[i_299_] += i_298_;
        }
        method122();
    }

    public void method129(short i, short i_300_) {
        for (int i_301_ = 0; i_301_ < anInt2475; i_301_++) {
            if (aShortArray2462[i_301_] == i)
                aShortArray2462[i_301_] = i_300_;
        }
    }

    public boolean method58() {
        return true;
    }

    public void method130() {
        for (int i = 0; i < anInt2445; i++) {
            int i_302_ = anIntArray2477[i];
            anIntArray2477[i] = anIntArray2466[i];
            anIntArray2466[i] = -i_302_;
        }
        method122();
    }

    public int method131(int i, int i_303_, int i_304_) {
        for (int i_305_ = 0; i_305_ < anInt2445; i_305_++) {
            if (anIntArray2477[i_305_] == i && anIntArray2473[i_305_] == i_303_
                    && anIntArray2466[i_305_] == i_304_)
                return i_305_;
        }
        anIntArray2477[anInt2445] = i;
        anIntArray2473[anInt2445] = i_303_;
        anIntArray2466[anInt2445] = i_304_;
        return anInt2445++;
    }

    public Animable method57(int i, int i_306_, int i_307_) {
        return method127(aShort2468, aShort2474, i, i_306_, i_307_);
    }

    public void method132() {
        anIntArray2481 = null;
        anIntArray2471 = null;
        anIntArrayArray2487 = null;
        anIntArrayArray2484 = null;
    }

    public void method133() {
        for (int i = 0; i < anInt2445; i++) {
            int i_308_ = anIntArray2466[i];
            anIntArray2466[i] = anIntArray2477[i];
            anIntArray2477[i] = -i_308_;
        }
        method122();
    }

    public static int method134(int[][] is, int i, int i_309_) {
        int i_310_ = i >> 7;
        int i_311_ = i_309_ >> 7;
        if (i_310_ < 0 || i_311_ < 0 || i_310_ >= is.length
                || i_311_ >= is[0].length)
            return 0;
        int i_312_ = i & 0x7f;
        int i_313_ = i_309_ & 0x7f;
        int i_314_ = ((is[i_310_][i_311_] * (128 - i_312_)
                + is[i_310_ + 1][i_311_] * i_312_)
                >> 7);
        int i_315_ = ((is[i_310_][i_311_ + 1] * (128 - i_312_)
                + is[i_310_ + 1][i_311_ + 1] * i_312_)
                >> 7);
        return i_314_ * (128 - i_313_) + i_315_ * i_313_ >> 7;
    }

    public void method135(int i, int i_316_, int i_317_) {
        for (int i_318_ = 0; i_318_ < anInt2445; i_318_++) {
            anIntArray2477[i_318_] = anIntArray2477[i_318_] * i / 128;
            anIntArray2473[i_318_] = anIntArray2473[i_318_] * i_316_ / 128;
            anIntArray2466[i_318_] = anIntArray2466[i_318_] * i_317_ / 128;
        }
        method122();
    }

    public Class1_Sub4() {
        /* empty */
    }

    public Class1_Sub4(byte[] is) {
        if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
            method108(is);
        else
            method126(is);
    }

    public Class1_Sub4(int i, int i_319_, int i_320_) {
        anIntArray2477 = new int[i];
        anIntArray2473 = new int[i];
        anIntArray2466 = new int[i];
        anIntArray2481 = new int[i];
        anIntArray2446 = new int[i_319_];
        anIntArray2486 = new int[i_319_];
        anIntArray2463 = new int[i_319_];
        aByteArray2476 = new byte[i_319_];
        aByteArray2480 = new byte[i_319_];
        aByteArray2479 = new byte[i_319_];
        aShortArray2462 = new short[i_319_];
        aShortArray2465 = new short[i_319_];
        aByteArray2492 = new byte[i_319_];
        anIntArray2471 = new int[i_319_];
        if (i_320_ > 0) {
            aByteArray2461 = new byte[i_320_];
            aShortArray2454 = new short[i_320_];
            aShortArray2452 = new short[i_320_];
            aShortArray2457 = new short[i_320_];
            aShortArray2472 = new short[i_320_];
            aShortArray2456 = new short[i_320_];
            aShortArray2467 = new short[i_320_];
            aByteArray2447 = new byte[i_320_];
            aByteArray2455 = new byte[i_320_];
            aByteArray2460 = new byte[i_320_];
            aByteArray2464 = new byte[i_320_];
            aByteArray2485 = new byte[i_320_];
        }
    }

    public int method136(int i, int i_321_, int i_322_, byte i_323_,
                         short i_324_, byte i_325_) {
        anIntArray2446[anInt2475] = i;
        anIntArray2486[anInt2475] = i_321_;
        anIntArray2463[anInt2475] = i_322_;
        aByteArray2476[anInt2475] = i_323_;
        aByteArray2492[anInt2475] = (byte) -1;
        aShortArray2462[anInt2475] = i_324_;
        aShortArray2465[anInt2475] = (short) -1;
        aByteArray2479[anInt2475] = i_325_;
        return anInt2475++;
    }

    public Class1_Sub4(Class1_Sub4[] class1_sub4s, int i) {
        boolean bool = false;
        boolean bool_326_ = false;
        boolean bool_327_ = false;
        boolean bool_328_ = false;
        boolean bool_329_ = false;
        boolean bool_330_ = false;
        anInt2445 = 0;
        anInt2475 = 0;
        anInt2459 = 0;
        aByte2489 = (byte) -1;
        for (int i_331_ = 0; i_331_ < i; i_331_++) {
            Class1_Sub4 class1_sub4_332_ = class1_sub4s[i_331_];
            if (class1_sub4_332_ != null) {
                anInt2445 += class1_sub4_332_.anInt2445;
                anInt2475 += class1_sub4_332_.anInt2475;
                anInt2459 += class1_sub4_332_.anInt2459;
                if (class1_sub4_332_.aByteArray2480 != null)
                    bool_326_ = true;
                else {
                    if (aByte2489 == -1)
                        aByte2489 = class1_sub4_332_.aByte2489;
                    if (aByte2489 != class1_sub4_332_.aByte2489)
                        bool_326_ = true;
                }
                bool = bool | class1_sub4_332_.aByteArray2476 != null;
                bool_327_
                        = bool_327_ | class1_sub4_332_.aByteArray2479 != null;
                bool_328_
                        = bool_328_ | class1_sub4_332_.anIntArray2471 != null;
                bool_329_
                        = bool_329_ | class1_sub4_332_.aShortArray2465 != null;
                bool_330_
                        = bool_330_ | class1_sub4_332_.aByteArray2492 != null;
            }
        }
        anIntArray2477 = new int[anInt2445];
        anIntArray2473 = new int[anInt2445];
        anIntArray2466 = new int[anInt2445];
        anIntArray2481 = new int[anInt2445];
        anIntArray2446 = new int[anInt2475];
        anIntArray2486 = new int[anInt2475];
        anIntArray2463 = new int[anInt2475];
        if (bool)
            aByteArray2476 = new byte[anInt2475];
        if (bool_326_)
            aByteArray2480 = new byte[anInt2475];
        if (bool_327_)
            aByteArray2479 = new byte[anInt2475];
        if (bool_328_)
            anIntArray2471 = new int[anInt2475];
        if (bool_329_)
            aShortArray2465 = new short[anInt2475];
        if (bool_330_)
            aByteArray2492 = new byte[anInt2475];
        aShortArray2462 = new short[anInt2475];
        if (anInt2459 > 0) {
            aByteArray2461 = new byte[anInt2459];
            aShortArray2454 = new short[anInt2459];
            aShortArray2452 = new short[anInt2459];
            aShortArray2457 = new short[anInt2459];
            aShortArray2472 = new short[anInt2459];
            aShortArray2456 = new short[anInt2459];
            aShortArray2467 = new short[anInt2459];
            aByteArray2447 = new byte[anInt2459];
            aByteArray2455 = new byte[anInt2459];
            aByteArray2460 = new byte[anInt2459];
            aByteArray2464 = new byte[anInt2459];
            aByteArray2485 = new byte[anInt2459];
        }
        anInt2445 = 0;
        anInt2475 = 0;
        anInt2459 = 0;
        for (int i_333_ = 0; i_333_ < i; i_333_++) {
            Class1_Sub4 class1_sub4_334_ = class1_sub4s[i_333_];
            if (class1_sub4_334_ != null) {
                for (int i_335_ = 0; i_335_ < class1_sub4_334_.anInt2475;
                     i_335_++) {
                    if (bool && class1_sub4_334_.aByteArray2476 != null)
                        aByteArray2476[anInt2475]
                                = class1_sub4_334_.aByteArray2476[i_335_];
                    if (bool_326_) {
                        if (class1_sub4_334_.aByteArray2480 != null)
                            aByteArray2480[anInt2475]
                                    = class1_sub4_334_.aByteArray2480[i_335_];
                        else
                            aByteArray2480[anInt2475]
                                    = class1_sub4_334_.aByte2489;
                    }
                    if (bool_327_ && class1_sub4_334_.aByteArray2479 != null)
                        aByteArray2479[anInt2475]
                                = class1_sub4_334_.aByteArray2479[i_335_];
                    if (bool_328_ && class1_sub4_334_.anIntArray2471 != null)
                        anIntArray2471[anInt2475]
                                = class1_sub4_334_.anIntArray2471[i_335_];
                    if (bool_329_) {
                        if (class1_sub4_334_.aShortArray2465 != null)
                            aShortArray2465[anInt2475]
                                    = class1_sub4_334_.aShortArray2465[i_335_];
                        else
                            aShortArray2465[anInt2475] = (short) -1;
                    }
                    if (bool_330_) {
                        if (class1_sub4_334_.aByteArray2492 != null
                                && class1_sub4_334_.aByteArray2492[i_335_] != -1)
                            aByteArray2492[anInt2475]
                                    = (byte) ((class1_sub4_334_.aByteArray2492
                                    [i_335_])
                                    + anInt2459);
                        else
                            aByteArray2492[anInt2475] = (byte) -1;
                    }
                    aShortArray2462[anInt2475]
                            = class1_sub4_334_.aShortArray2462[i_335_];
                    anIntArray2446[anInt2475]
                            = method113(class1_sub4_334_,
                            class1_sub4_334_.anIntArray2446[i_335_]);
                    anIntArray2486[anInt2475]
                            = method113(class1_sub4_334_,
                            class1_sub4_334_.anIntArray2486[i_335_]);
                    anIntArray2463[anInt2475]
                            = method113(class1_sub4_334_,
                            class1_sub4_334_.anIntArray2463[i_335_]);
                    anInt2475++;
                }
                for (int i_336_ = 0; i_336_ < class1_sub4_334_.anInt2459;
                     i_336_++) {
                    byte i_337_ = (aByteArray2461[anInt2459]
                            = class1_sub4_334_.aByteArray2461[i_336_]);
                    if (i_337_ == 0) {
                        aShortArray2454[anInt2459]
                                = (short) method113(class1_sub4_334_,
                                (class1_sub4_334_
                                        .aShortArray2454[i_336_]));
                        aShortArray2452[anInt2459]
                                = (short) method113(class1_sub4_334_,
                                (class1_sub4_334_
                                        .aShortArray2452[i_336_]));
                        aShortArray2457[anInt2459]
                                = (short) method113(class1_sub4_334_,
                                (class1_sub4_334_
                                        .aShortArray2457[i_336_]));
                    }
                    if (i_337_ >= 1 && i_337_ <= 3) {
                        aShortArray2454[anInt2459]
                                = class1_sub4_334_.aShortArray2454[i_336_];
                        aShortArray2452[anInt2459]
                                = class1_sub4_334_.aShortArray2452[i_336_];
                        aShortArray2457[anInt2459]
                                = class1_sub4_334_.aShortArray2457[i_336_];
                        aShortArray2472[anInt2459]
                                = class1_sub4_334_.aShortArray2472[i_336_];
                        aShortArray2456[anInt2459]
                                = class1_sub4_334_.aShortArray2456[i_336_];
                        aShortArray2467[anInt2459]
                                = class1_sub4_334_.aShortArray2467[i_336_];
                        aByteArray2447[anInt2459]
                                = class1_sub4_334_.aByteArray2447[i_336_];
                        aByteArray2455[anInt2459]
                                = class1_sub4_334_.aByteArray2455[i_336_];
                        aByteArray2460[anInt2459]
                                = class1_sub4_334_.aByteArray2460[i_336_];
                    }
                    if (i_337_ == 2) {
                        aByteArray2464[anInt2459]
                                = class1_sub4_334_.aByteArray2464[i_336_];
                        aByteArray2485[anInt2459]
                                = class1_sub4_334_.aByteArray2485[i_336_];
                    }
                    anInt2459++;
                }
            }
        }
    }

    public Class1_Sub4(Class1_Sub4 class1_sub4_338_, boolean bool,
                       boolean bool_339_, boolean bool_340_,
                       boolean bool_341_) {
        anInt2445 = class1_sub4_338_.anInt2445;
        anInt2475 = class1_sub4_338_.anInt2475;
        anInt2459 = class1_sub4_338_.anInt2459;
        if (bool) {
            anIntArray2477 = class1_sub4_338_.anIntArray2477;
            anIntArray2473 = class1_sub4_338_.anIntArray2473;
            anIntArray2466 = class1_sub4_338_.anIntArray2466;
        } else {
            anIntArray2477 = new int[anInt2445];
            anIntArray2473 = new int[anInt2445];
            anIntArray2466 = new int[anInt2445];
            for (int i = 0; i < anInt2445; i++) {
                anIntArray2477[i] = class1_sub4_338_.anIntArray2477[i];
                anIntArray2473[i] = class1_sub4_338_.anIntArray2473[i];
                anIntArray2466[i] = class1_sub4_338_.anIntArray2466[i];
            }
        }
        if (bool_339_)
            aShortArray2462 = class1_sub4_338_.aShortArray2462;
        else {
            aShortArray2462 = new short[anInt2475];
            for (int i = 0; i < anInt2475; i++)
                aShortArray2462[i] = class1_sub4_338_.aShortArray2462[i];
        }
        if (bool_340_ || class1_sub4_338_.aShortArray2465 == null)
            aShortArray2465 = class1_sub4_338_.aShortArray2465;
        else {
            aShortArray2465 = new short[anInt2475];
            for (int i = 0; i < anInt2475; i++)
                aShortArray2465[i] = class1_sub4_338_.aShortArray2465[i];
        }
        if (bool_341_)
            aByteArray2479 = class1_sub4_338_.aByteArray2479;
        else {
            aByteArray2479 = new byte[anInt2475];
            if (class1_sub4_338_.aByteArray2479 == null) {
                for (int i = 0; i < anInt2475; i++)
                    aByteArray2479[i] = (byte) 0;
            } else {
                for (int i = 0; i < anInt2475; i++)
                    aByteArray2479[i] = class1_sub4_338_.aByteArray2479[i];
            }
        }
        anIntArray2446 = class1_sub4_338_.anIntArray2446;
        anIntArray2486 = class1_sub4_338_.anIntArray2486;
        anIntArray2463 = class1_sub4_338_.anIntArray2463;
        aByteArray2476 = class1_sub4_338_.aByteArray2476;
        aByteArray2480 = class1_sub4_338_.aByteArray2480;
        aByteArray2492 = class1_sub4_338_.aByteArray2492;
        aByte2489 = class1_sub4_338_.aByte2489;
        aByteArray2461 = class1_sub4_338_.aByteArray2461;
        aShortArray2454 = class1_sub4_338_.aShortArray2454;
        aShortArray2452 = class1_sub4_338_.aShortArray2452;
        aShortArray2457 = class1_sub4_338_.aShortArray2457;
        aShortArray2472 = class1_sub4_338_.aShortArray2472;
        aShortArray2456 = class1_sub4_338_.aShortArray2456;
        aShortArray2467 = class1_sub4_338_.aShortArray2467;
        aByteArray2447 = class1_sub4_338_.aByteArray2447;
        aByteArray2455 = class1_sub4_338_.aByteArray2455;
        aByteArray2460 = class1_sub4_338_.aByteArray2460;
        aByteArray2464 = class1_sub4_338_.aByteArray2464;
        aByteArray2485 = class1_sub4_338_.aByteArray2485;
        anIntArray2481 = class1_sub4_338_.anIntArray2481;
        anIntArray2471 = class1_sub4_338_.anIntArray2471;
        anIntArrayArray2487 = class1_sub4_338_.anIntArrayArray2487;
        anIntArrayArray2484 = class1_sub4_338_.anIntArrayArray2484;
        aClass107Array2451 = class1_sub4_338_.aClass107Array2451;
        aClass104Array2448 = class1_sub4_338_.aClass104Array2448;
        aClass107Array2478 = class1_sub4_338_.aClass107Array2478;
        aShort2468 = class1_sub4_338_.aShort2468;
        aShort2474 = class1_sub4_338_.aShort2474;
    }
}
