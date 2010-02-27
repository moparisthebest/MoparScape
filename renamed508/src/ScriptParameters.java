/* Class68_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ScriptParameters extends Node
{
    static int anInt3231;
    int anInt3232;
    private static MutableString aClass100_3233;
    int anInt3234;
    static int anInt3235 = 0;
    MutableString eventOperationBase;
    static MutableString aClass100_3237;
    static int anInt3238;
    Object[] parameters;
    static int anInt3240;
    Widget aClass45_3241;
    int anInt3242;
    int anInt3243;
    boolean aBoolean3244;
    static int anInt3245 = 0;
    Widget aClass45_3246;
    static int anInt3247;
    int anInt3248;
    static int anInt3249;
    static MutableString[] aClass100Array3250;
    static int anInt3251;

    static final Sprite method1319(int i, Class21 class21, int i_0_)
    {
        try
        {
            anInt3249++;
            if (i_0_ < 53)
                aClass100Array3250 = null;
            if (!Class56.method572(class21, -1, i))
                return null;
            return Class124.method1757((byte) -83);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("wj.G(" + i + ',' + (class21 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    static final void method1320(int i)
    {
        anInt3247++;
        int i_1_ = Class49.menuX;
        int i_2_ = Class68_Sub13_Sub14.menuY;
        int i_3_ = Class33.anInt588;
        int i_4_ = Class68_Sub13_Sub15.anInt3689;
        int i_5_ = 6116423;
        Class79.method1445(i_1_, i_2_, i_4_, i_3_, i_5_);
        Class79.method1445(i_1_ + 1, i_2_ + 1, i_4_ - 2, 16, 0);
        Class79.method1421(i_1_ + 1, i_2_ + 18, i_4_ - 2, i_3_ - 19, 0);
        Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1030(Class68_Sub13_Sub26_Sub1.aClass100_4607, i_1_ + 3, i_2_ + 14, i_5_, -1);
        int i_6_ = Class96.anInt1697;
        int i_7_ = Class13.anInt223;
        int i_8_ = 0;
        if (i == 4)
        {
            for (/**/; i_8_ < Class68_Sub13_Sub21.menuOptionsCount; i_8_++)
            {
                int i_9_ = ((Class68_Sub13_Sub21.menuOptionsCount - i_8_ - 1) * 15 + (i_2_ + 31));
                int i_10_ = 16777215;
                if (i_6_ > i_1_ && i_4_ + i_1_ > i_6_ && i_7_ > i_9_ - 13 && i_7_ < i_9_ + 3)
                    i_10_ = 16776960;
                Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513.method1030(Class58.method579((byte) -103, i_8_), i_1_ + 3, i_9_, i_10_, 0);
            }
            Class13.method242(-97, Class68_Sub13_Sub15.anInt3689, Class33.anInt588, Class49.menuX, Class68_Sub13_Sub14.menuY);
        }
    }

    static final void method1321(byte i)
    {
        anInt3240++;
        if (i > -99)
            method1325(93, null);
        for (int i_11_ = 0; i_11_ < Item.anInt2437; i_11_++)
        {
            Class34.anIntArray596[i_11_]--;
            if (Class34.anIntArray596[i_11_] < -10)
            {
                Item.anInt2437--;
                for (int i_12_ = i_11_; i_12_ < Item.anInt2437; i_12_++)
                {
                    Login.anIntArray1517[i_12_] = Login.anIntArray1517[i_12_ + 1];
                    Class3.aClass46Array80[i_12_] = Class3.aClass46Array80[i_12_ + 1];
                    Class111.anIntArray1878[i_12_] = Class111.anIntArray1878[i_12_ + 1];
                    Class34.anIntArray596[i_12_] = Class34.anIntArray596[i_12_ + 1];
                    Class102.anIntArray1759[i_12_] = Class102.anIntArray1759[i_12_ + 1];
                }
                i_11_--;
            } else
            {
                Class46 class46 = Class3.aClass46Array80[i_11_];
                if (class46 == null)
                {
                    class46 = Class46.method509(Class78.aClass21_Sub1_1390, Login.anIntArray1517[i_11_], 0);
                    if (class46 == null)
                        continue;
                    Class34.anIntArray596[i_11_] += class46.method510();
                    Class3.aClass46Array80[i_11_] = class46;
                }
                if (Class34.anIntArray596[i_11_] < 0)
                {
                    int i_13_;
                    if (Class102.anIntArray1759[i_11_] == 0)
                        i_13_ = Class106.anInt1803;
                    else
                    {
                        int i_14_ = Class102.anIntArray1759[i_11_] >> 16 & 0xff;
                        int i_15_ = (Class102.anIntArray1759[i_11_] & 0xff26) >> 8;
                        int i_16_ = (i_14_ * 128 + 64 - (((Character) Class68_Sub7.localPlayer).x));
                        int i_17_ = (0xff & Class102.anIntArray1759[i_11_]) * 128;
                        if (i_16_ < 0)
                            i_16_ = -i_16_;
                        int i_18_ = (i_15_ * 128 + 64 - (((Character) Class68_Sub7.localPlayer).y));
                        if (i_18_ < 0)
                            i_18_ = -i_18_;
                        int i_19_ = i_16_ + i_18_ - 128;
                        if (i_17_ < i_19_)
                        {
                            Class34.anIntArray596[i_11_] = -100;
                            continue;
                        }
                        if (i_19_ < 0)
                            i_19_ = 0;
                        i_13_ = ((i_17_ - i_19_) * Class68_Sub20_Sub15.anInt4401 / i_17_);
                    }
                    if (i_13_ > 0)
                    {
                        Class68_Sub11_Sub1 class68_sub11_sub1 = class46.method508().method685(NodeSub.aClass95_3081);
                        Class68_Sub28_Sub3 class68_sub28_sub3 = Class68_Sub28_Sub3.method1299(class68_sub11_sub1, 100, i_13_);
                        class68_sub28_sub3.method1272(Class111.anIntArray1878[i_11_] - 1);
                        NPCDefinition.aClass68_Sub28_Sub4_1420.method1316(class68_sub28_sub3);
                    }
                    Class34.anIntArray596[i_11_] = -100;
                }
            }
        }
        if (Keyboard.aBoolean2129 && !Class111.method1670(20778))
        {
            if (Class68_Sub13_Sub25.anInt3857 != 0 && Class101.anInt1747 != -1)
                Class68_Sub13_Sub38.method899(Class101.anInt1747, Class21.aClass21_Sub1_459, false, 0, Class68_Sub13_Sub25.anInt3857, false);
            Keyboard.aBoolean2129 = false;
        } else if (Class68_Sub13_Sub25.anInt3857 != 0 && Class101.anInt1747 != -1 && !Class111.method1670(20778))
        {
            Class21.connectionVector.startPacket(247);
            Class70.anInt1268++;
            Class21.connectionVector.writeDWord(Class101.anInt1747);
            Class101.anInt1747 = -1;
        }
    }

    static final MutableString method1322(int i, long l, int i_20_, boolean bool)
    {
        anInt3238++;
        if (i < 2 || i > 36)
            throw new IllegalArgumentException("Invalid radix:" + i);
        int i_21_ = 1;
        long l_22_ = l / (long) i;
        while (l_22_ != 0L)
        {
            l_22_ /= (long) i;
            i_21_++;
        }
        int i_23_ = i_21_;
        if (l < 0L || bool)
            i_23_++;
        byte[] is = new byte[i_23_];
        if (l < 0L)
            is[0] = (byte) 45;
        else if (bool)
            is[0] = (byte) 43;
        if (i_20_ < 18)
            method1324(36);
        for (int i_24_ = 0; i_21_ > i_24_; i_24_++)
        {
            int i_25_ = (int) (l % (long) i);
            if (i_25_ < 0)
                i_25_ = -i_25_;
            if (i_25_ > 9)
                i_25_ += 39;
            is[i_23_ - i_24_ - 1] = (byte) (i_25_ + 48);
            l /= (long) i;
        }
        MutableString class100 = new MutableString();
        ((MutableString) class100).length = i_23_;
        ((MutableString) class100).data = is;
        return class100;
    }

    static final void method1323(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_)
    {
        anInt3231++;
        int i_34_ = i_33_ - i_29_;
        int i_35_ = (i_30_ - i_28_ << 16) / i_34_;
        if (i_31_ == 1391070128)
        {
            int i_36_ = i_27_ - i_26_;
            int i_37_ = (i_32_ - i << 16) / i_36_;
            Character.method144(i_35_, i_37_, i_33_, true, 0, 0, i_27_, i, i_26_, i_28_, i_29_);
        }
    }

    public static void method1324(int i)
    {
        aClass100_3237 = null;
        aClass100_3233 = null;
        if (i > -88)
            method1320(-124);
        aClass100Array3250 = null;
    }

    static final void method1325(int i, Stream class68_sub14)
    {
        do
        {
            try
            {
                anInt3251++;
                while (((Stream) class68_sub14).position < (((Stream) class68_sub14).buffer).length)
                {
                    int i_38_ = 0;
                    boolean bool = false;
                    int i_39_ = 0;
                    if (class68_sub14.readUByte() == 1)
                    {
                        i_38_ = class68_sub14.readUByte();
                        i_39_ = class68_sub14.readUByte();
                        bool = true;
                    }
                    int i_40_ = class68_sub14.readUByte();
                    int i_41_ = class68_sub14.readUByte();
                    int i_42_ = (Class103.anInt1770 - (1 - (Ground.anInt2762 - i_41_ * 64)));
                    int i_43_ = 64 * i_40_ - Class70.anInt1273;
                    if (i_43_ < 0 || i_42_ - 63 < 0 || i_43_ + 63 >= Class68_Sub6.anInt2848 || Class103.anInt1770 <= i_42_)
                    {
                        for (int i_44_ = 0; i_44_ < (!bool ? 4096 : 64); i_44_++)
                        {
                            int i_45_ = class68_sub14.readUByte();
                            if (i_45_ != 0)
                            {
                                if ((0x1 & i_45_) == 1)
                                    ((Stream) class68_sub14).position++;
                                if ((i_45_ & 0x2) == 2)
                                    ((Stream) class68_sub14).position += 2;
                                if ((0x4 & i_45_) == 4)
                                    ((Stream) class68_sub14).position += 3;
                            }
                        }
                    } else
                    {
                        int i_46_ = i_42_ >> 6;
                        int i_47_ = i_43_ >> 6;
                        for (int i_48_ = 0; i_48_ < 64; i_48_++)
                        {
                            for (int i_49_ = 0; i_49_ < 64; i_49_++)
                            {
                                if (!bool || (i_38_ * 8 <= i_48_ && i_38_ * 8 + 8 > i_48_ && i_49_ >= 8 * i_39_ && 8 * i_39_ + 8 > i_49_))
                                {
                                    int i_50_ = class68_sub14.readUByte();
                                    if (i_50_ != 0)
                                    {
                                        if ((i_50_ & 0x1) == 1)
                                        {
                                            int i_51_ = class68_sub14.readUByte();
                                            if ((Class68_Sub13_Sub11.aByteArrayArrayArray3624[i_47_][i_46_]) == null)
                                                Class68_Sub13_Sub11.aByteArrayArrayArray3624[i_47_][i_46_] = new byte[4096];
                                            Class68_Sub13_Sub11.aByteArrayArrayArray3624[i_47_][i_46_][(63 - i_49_ << 6) + i_48_] = (byte) i_51_;
                                        }
                                        if ((i_50_ & 0x2) == 2)
                                        {
                                            int i_52_ = class68_sub14.readUShort();
                                            if ((Class68_Sub13_Sub11.aShortArrayArrayArray3628[i_47_][i_46_]) == null)
                                                Class68_Sub13_Sub11.aShortArrayArrayArray3628[i_47_][i_46_] = new short[4096];
                                            Class68_Sub13_Sub11.aShortArrayArrayArray3628[i_47_][i_46_][(63 - i_49_ << 6) + i_48_] = (short) i_52_;
                                        }
                                        if ((0x4 & i_50_) == 4)
                                        {
                                            int i_53_ = ((0xff0000 & (class68_sub14.readUByte() << 16)) - (-(0xff00 & (class68_sub14.readUByte()) << 8) - (class68_sub14.readUByte() & 0xff)));
                                            if ((Class68_Sub20_Sub17.anIntArrayArrayArray4444[i_47_][i_46_]) == null)
                                                Class68_Sub20_Sub17.anIntArrayArrayArray4444[i_47_][i_46_] = new int[4096];
                                            ObjectDefinition class116 = Class1_Sub5.method140(114, --i_53_);
                                            if ((((ObjectDefinition) class116).childrenIDs) != null)
                                            {
                                                class116 = class116.method1716(-1);
                                                if (class116 == null || (((ObjectDefinition) class116).anInt1982) == -1)
                                                    continue;
                                            }
                                            Class68_Sub20_Sub17.anIntArrayArrayArray4444[i_47_][i_46_][(63 - i_49_ << 6) + i_48_] = (((ObjectDefinition) class116).type) + 1;
                                            Class68_Sub8 class68_sub8 = new Class68_Sub8();
                                            ((Class68_Sub8) class68_sub8).anInt2880 = (((ObjectDefinition) class116).anInt1982);
                                            ((Class68_Sub8) class68_sub8).anInt2871 = i_43_;
                                            ((Class68_Sub8) class68_sub8).anInt2877 = i_42_;
                                            Class75.aClass16_1343.pushFront(class68_sub8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i == 14904)
                    break;
                method1323(69, 76, -109, 33, -58, -2, 39, 107, -25);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("wj.B(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public ScriptParameters()
    {
        /* empty */
    }

    static
    {
        aClass100_3233 = Class112.makeMutableString(43, "");
        aClass100_3237 = aClass100_3233;
    }
}
