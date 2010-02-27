/* Class75_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class75_Sub1_Sub1 extends Class75_Sub1
{
    static int anInt4578;
    static MRUNodes aClass98_4579;
    static int anInt4580;
    static int anInt4581;
    static int anInt4582;
    static MutableString aClass100_4583 = Class112.makeMutableString(43, "::gc");
    static int anInt4584;
    static int anInt4585;
    static int anInt4586;
    static int anInt4587;
    static Class21 aClass21_4588;
    static MutableString aClass100_4589;
    static Login aClass82_4590;
    static Signlink signlink;
    static int anInt4592;
    static Class21 aClass21_4593;

    static final boolean method1391(boolean bool, Ground[][][] class68_sub1s, int i, int i_0_, int i_1_, byte i_2_)
    {
        try
        {
            byte i_3_ = !bool ? (byte) (Class3.anInt84 & 0xff) : (byte) 1;
            anInt4578++;
            if ((NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_0_][i]) == i_3_)
                return false;
            if ((Object1.byteGroundArray[GameSocket.plane][i_0_][i] & 0x4) == 0)
                return false;
            int i_4_ = 0;
            Class68_Sub13_Sub37.anIntArray4068[i_4_] = i_0_;
            int i_5_ = -107 % ((i_2_ + 16) / 61);
            int i_6_ = 0;
            Class68_Sub13_Sub21.anIntArray3799[i_4_++] = i;
            NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_0_][i] = i_3_;
            while (i_6_ != i_4_)
            {
                int i_7_ = ((Class68_Sub13_Sub37.anIntArray4068[i_6_] & 0xff5d07) >> 16);
                int i_8_ = Class68_Sub13_Sub37.anIntArray4068[i_6_] & 0xffff;
                int i_9_ = Class68_Sub13_Sub37.anIntArray4068[i_6_] >> 24 & 0xff;
                int i_10_ = 0xffff & Class68_Sub13_Sub21.anIntArray3799[i_6_];
                int i_11_ = ((0xff055a & Class68_Sub13_Sub21.anIntArray3799[i_6_]) >> 16);
                boolean bool_12_ = false;
                i_6_ = i_6_ + 1 & 0xfff;
                if ((0x4 & (Object1.byteGroundArray[GameSocket.plane][i_8_][i_10_])) == 0)
                    bool_12_ = true;
                boolean bool_13_ = false;
                while_149_: for (int i_14_ = GameSocket.plane + 1; i_14_ <= 3; i_14_++)
                {
                    if ((0x8 & (Object1.byteGroundArray[i_14_][i_8_][i_10_])) == 0)
                    {
                        if (bool_12_ && class68_sub1s[i_14_][i_8_][i_10_] != null)
                        {
                            if (((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_1 != null)
                            {
                                int i_15_ = Class91.method1526(i_7_, false);
                                if (i_15_ == ((Object1) (((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_1)).anInt1187 || i_15_ == (((Object1) ((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_1).anInt1177))
                                    continue;
                                if (i_9_ != 0)
                                {
                                    int i_16_ = Class91.method1526(i_9_, false);
                                    if (((Object1) (((Ground) class68_sub1s[i_14_][i_8_][i_10_]).object_1)).anInt1187 == i_16_ || (i_16_ == ((Object1) (((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_1)).anInt1177))
                                        continue;
                                }
                                if (i_11_ != 0)
                                {
                                    int i_17_ = Class91.method1526(i_11_, false);
                                    if (((Object1) (((Ground) class68_sub1s[i_14_][i_8_][i_10_]).object_1)).anInt1187 == i_17_ || (((Object1) (((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_1)).anInt1177) == i_17_)
                                        continue;
                                }
                            }
                            if (((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_5 != null)
                            {
                                for (int i_18_ = 0; (i_18_ < (((Ground) class68_sub1s[i_14_][i_8_][i_10_]).anInt2773)); i_18_++)
                                {
                                    int i_19_ = (int) (0x3fL & (((Object5) (((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_5[i_18_])).uid >> 14));
                                    if (i_19_ == 21)
                                        i_19_ = 19;
                                    int i_20_ = (int) (0x3L & (((Object5) (((Ground) (class68_sub1s[i_14_][i_8_][i_10_])).object_5[i_18_])).uid >> 20));
                                    int i_21_ = i_20_ << 6 | i_19_;
                                    if (i_21_ == i_7_ || i_9_ != 0 && i_9_ == i_21_ || i_11_ != 0 && i_21_ == i_11_)
                                        continue while_149_;
                                }
                            }
                        }
                        bool_13_ = true;
                        Ground class68_sub1 = class68_sub1s[i_14_][i_8_][i_10_];
                        if (class68_sub1 != null && ((Ground) class68_sub1).anInt2773 > 0)
                        {
                            for (int i_22_ = 0; (((Ground) class68_sub1).anInt2773 > i_22_); i_22_++)
                            {
                                Object5 class69 = (((Ground) class68_sub1).object_5[i_22_]);
                                if ((((Object5) class69).anInt1238 != ((Object5) class69).anInt1254) || (((Object5) class69).anInt1234 != ((Object5) class69).anInt1253))
                                {
                                    for (int i_23_ = ((Object5) class69).anInt1254; (((Object5) class69).anInt1238 >= i_23_); i_23_++)
                                    {
                                        for (int i_24_ = (((Object5) class69).anInt1253); (((Object5) class69).anInt1234 >= i_24_); i_24_++)
                                            NodeSub.aByteArrayArrayArray3097[i_14_][i_23_][i_24_] = i_3_;
                                    }
                                }
                            }
                        }
                        NodeSub.aByteArrayArrayArray3097[i_14_][i_8_][i_10_] = i_3_;
                    }
                }
                if (bool_13_)
                {
                    if (Class21_Sub1.anIntArray2695[i_1_] < (Class68_Sub20_Sub12.intGroundArray[GameSocket.plane + 1][i_8_][i_10_]))
                        Class21_Sub1.anIntArray2695[i_1_] = (Class68_Sub20_Sub12.intGroundArray[GameSocket.plane + 1][i_8_][i_10_]);
                    int i_25_ = i_8_ << 7;
                    if (i_25_ >= PlayerDefinition.anIntArray2182[i_1_])
                    {
                        if (i_25_ > Class7.anIntArray134[i_1_])
                            Class7.anIntArray134[i_1_] = i_25_;
                    } else
                        PlayerDefinition.anIntArray2182[i_1_] = i_25_;
                    int i_26_ = i_10_ << 7;
                    if (i_26_ < Class68_Sub20_Sub16.anIntArray4410[i_1_])
                        Class68_Sub20_Sub16.anIntArray4410[i_1_] = i_26_;
                    else if (i_26_ > Login.anIntArray1512[i_1_])
                        Login.anIntArray1512[i_1_] = i_26_;
                }
                if (!bool_12_)
                {
                    if (i_8_ >= 1 && (NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ - 1][i_10_]) != i_3_)
                    {
                        Class68_Sub13_Sub37.anIntArray4068[i_4_] = Class70.OR(Class70.OR(1179648, i_8_ - 1), -754974720);
                        Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(1245184, i_10_);
                        i_4_ = i_4_ + 1 & 0xfff;
                        NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ - 1][i_10_] = i_3_;
                    }
                    if (++i_10_ < 104)
                    {
                        if (i_8_ - 1 >= 0 && i_3_ != (NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ - 1][i_10_]) && ((Object1.byteGroundArray[GameSocket.plane][i_8_][i_10_]) & 0x4) == 0 && ((Object1.byteGroundArray[GameSocket.plane][i_8_ - 1][i_10_ - 1]) & 0x4) == 0)
                        {
                            Class68_Sub13_Sub37.anIntArray4068[i_4_] = (Class70.OR(Class70.OR(1179648, i_8_ - 1), 1375731712));
                            Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(i_10_, 1245184);
                            i_4_ = i_4_ + 1 & 0xfff;
                            NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ - 1][i_10_] = i_3_;
                        }
                        if (i_3_ != (NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_][i_10_]))
                        {
                            Class68_Sub13_Sub37.anIntArray4068[i_4_] = (Class70.OR(Class70.OR(5373952, i_8_), 318767104));
                            Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(5439488, i_10_);
                            i_4_ = i_4_ + 1 & 0xfff;
                            NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_][i_10_] = i_3_;
                        }
                        if (i_8_ + 1 < 104 && (NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ + 1][i_10_]) != i_3_ && (0x4 & (Object1.byteGroundArray[GameSocket.plane][i_8_][i_10_])) == 0 && (0x4 & (Object1.byteGroundArray[GameSocket.plane][i_8_ + 1][i_10_ - 1])) == 0)
                        {
                            Class68_Sub13_Sub37.anIntArray4068[i_4_] = (Class70.OR(Class70.OR(i_8_ + 1, 5373952), -1845493760));
                            Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(5439488, i_10_);
                            NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ + 1][i_10_] = i_3_;
                            i_4_ = i_4_ + 1 & 0xfff;
                        }
                    }
                    i_10_--;
                    if (i_8_ + 1 < 104 && (NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ + 1][i_10_]) != i_3_)
                    {
                        Class68_Sub13_Sub37.anIntArray4068[i_4_] = Class70.OR(1392508928, Class70.OR(i_8_ + 1, 9568256));
                        Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(i_10_, 9633792);
                        i_4_ = i_4_ + 1 & 0xfff;
                        NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ + 1][i_10_] = i_3_;
                    }
                    if (--i_10_ >= 0)
                    {
                        if (i_8_ - 1 >= 0 && i_3_ != (NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ - 1][i_10_]) && ((Object1.byteGroundArray[GameSocket.plane][i_8_][i_10_]) & 0x4) == 0 && (0x4 & (Object1.byteGroundArray[GameSocket.plane][i_8_ - 1][i_10_ + 1])) == 0)
                        {
                            Class68_Sub13_Sub37.anIntArray4068[i_4_] = (Class70.OR(Class70.OR(13762560, i_8_ - 1), 301989888));
                            Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(i_10_, 13828096);
                            i_4_ = 0xfff & i_4_ + 1;
                            NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ - 1][i_10_] = i_3_;
                        }
                        if ((NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_][i_10_]) != i_3_)
                        {
                            Class68_Sub13_Sub37.anIntArray4068[i_4_] = (Class70.OR(Class70.OR(i_8_, 13762560), -1828716544));
                            Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(i_10_, 13828096);
                            NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_][i_10_] = i_3_;
                            i_4_ = 0xfff & i_4_ + 1;
                        }
                        if (i_8_ + 1 < 104 && i_3_ != (NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ + 1][i_10_]) && (0x4 & (Object1.byteGroundArray[GameSocket.plane][i_8_][i_10_])) == 0 && ((Object1.byteGroundArray[GameSocket.plane][i_8_ + 1][i_10_ + 1]) & 0x4) == 0)
                        {
                            Class68_Sub13_Sub37.anIntArray4068[i_4_] = (Class70.OR(Class70.OR(9568256, i_8_ + 1), -771751936));
                            Class68_Sub13_Sub21.anIntArray3799[i_4_] = Class70.OR(9633792, i_10_);
                            i_4_ = i_4_ + 1 & 0xfff;
                            NodeSub.aByteArrayArrayArray3097[GameSocket.plane][i_8_ + 1][i_10_] = i_3_;
                        }
                    }
                }
            }
            if (Class21_Sub1.anIntArray2695[i_1_] != -1000000)
            {
                Class21_Sub1.anIntArray2695[i_1_] += 10;
                PlayerDefinition.anIntArray2182[i_1_] -= 50;
                Class7.anIntArray134[i_1_] += 50;
                Login.anIntArray1512[i_1_] += 50;
                Class68_Sub20_Sub16.anIntArray4410[i_1_] -= 50;
            }
            return true;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("rj.D(" + bool + ',' + (class68_sub1s != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
        }
    }

    static final void method1392(boolean bool)
    {
        if (bool == true)
        {
            anInt4584++;
            Class68_Sub13_Sub27.aClass98_3895.method1572((byte) 94);
            ClientScript.aClass98_4374.method1572((byte) 94);
        }
    }

    static final void method1393(int i, Stream class68_sub14)
    {
        try
        {
            anInt4585++;
            if (i < 28)
                aClass82_4590 = null;
            int i_27_ = Class75_Sub3.anInt3329 >> 2 << 10;
            byte[][] is = new byte[Class68_Sub6.anInt2848][Class103.anInt1770];
            int i_28_ = Class101.anInt1746 >> 1;
            while (((Stream) class68_sub14).buffer.length > ((Stream) class68_sub14).position)
            {
                int i_29_ = 0;
                int i_30_ = 0;
                boolean bool = false;
                if (class68_sub14.readUByte() == 1)
                {
                    i_29_ = class68_sub14.readUByte();
                    i_30_ = class68_sub14.readUByte();
                    bool = true;
                }
                int i_31_ = class68_sub14.readUByte();
                int i_32_ = class68_sub14.readUByte();
                int i_33_ = i_31_ * 64 - Class70.anInt1273;
                int i_34_ = (Class103.anInt1770 + (-1 - (i_32_ * 64 - Ground.anInt2762)));
                if (i_33_ < 0 || i_34_ - 63 < 0 || i_33_ + 63 >= Class68_Sub6.anInt2848 || Class103.anInt1770 <= i_34_)
                {
                    if (bool)
                        ((Stream) class68_sub14).position += 64;
                    else
                        ((Stream) class68_sub14).position += 4096;
                } else
                {
                    for (int i_35_ = 0; i_35_ < 64; i_35_++)
                    {
                        byte[] is_36_ = is[i_35_ + i_33_];
                        for (int i_37_ = 0; i_37_ < 64; i_37_++)
                        {
                            if (!bool || (8 * i_29_ <= i_35_ && 8 * i_29_ + 8 > i_35_ && i_37_ >= i_30_ * 8 && 8 * i_30_ + 8 > i_37_))
                                is_36_[i_34_ - i_37_] = class68_sub14.readByte();
                        }
                    }
                }
            }
            int i_38_ = Class68_Sub6.anInt2848;
            int i_39_ = Class103.anInt1770;
            int[] is_40_ = new int[i_39_];
            int[] is_41_ = new int[i_39_];
            int[] is_42_ = new int[i_39_];
            int[] is_43_ = new int[i_39_];
            int[] is_44_ = new int[i_39_];
            for (int i_45_ = -5; i_45_ < i_38_; i_45_++)
            {
                for (int i_46_ = 0; i_39_ > i_46_; i_46_++)
                {
                    int i_47_ = i_45_ + 5;
                    if (i_38_ > i_47_)
                    {
                        int i_48_ = 0xff & is[i_47_][i_46_];
                        if (i_48_ > 0)
                        {
                            Class53 class53 = Class68_Sub13_Sub2.method707(i_48_ - 1, (byte) -128);
                            is_42_[i_46_] += ((Class53) class53).anInt1022;
                            is_40_[i_46_] += ((Class53) class53).anInt1027;
                            is_41_[i_46_] += ((Class53) class53).anInt1017;
                            is_43_[i_46_] += ((Class53) class53).anInt1015;
                            is_44_[i_46_]++;
                        }
                    }
                    int i_49_ = i_45_ - 5;
                    if (i_49_ >= 0)
                    {
                        int i_50_ = is[i_49_][i_46_] & 0xff;
                        if (i_50_ > 0)
                        {
                            Class53 class53 = Class68_Sub13_Sub2.method707(i_50_ - 1, (byte) -128);
                            is_42_[i_46_] -= ((Class53) class53).anInt1022;
                            is_40_[i_46_] -= ((Class53) class53).anInt1027;
                            is_41_[i_46_] -= ((Class53) class53).anInt1017;
                            is_43_[i_46_] -= ((Class53) class53).anInt1015;
                            is_44_[i_46_]--;
                        }
                    }
                }
                if (i_45_ >= 0)
                {
                    int i_51_ = 0;
                    int[][] is_52_ = Class33.anIntArrayArrayArray584[i_45_ >> 6];
                    int i_53_ = 0;
                    int i_54_ = 0;
                    int i_55_ = 0;
                    int i_56_ = 0;
                    for (int i_57_ = -5; i_57_ < i_39_; i_57_++)
                    {
                        int i_58_ = i_57_ - 5;
                        int i_59_ = i_57_ + 5;
                        if (i_39_ > i_59_)
                        {
                            i_51_ += is_42_[i_59_];
                            i_53_ += is_40_[i_59_];
                            i_55_ += is_44_[i_59_];
                            i_54_ += is_41_[i_59_];
                            i_56_ += is_43_[i_59_];
                        }
                        if (i_58_ >= 0)
                        {
                            i_55_ -= is_44_[i_58_];
                            i_51_ -= is_42_[i_58_];
                            i_54_ -= is_41_[i_58_];
                            i_56_ -= is_43_[i_58_];
                            i_53_ -= is_40_[i_58_];
                        }
                        if (i_57_ >= 0 && i_55_ > 0)
                        {
                            int[] is_60_ = is_52_[i_57_ >> 6];
                            int i_61_ = (i_56_ == 0 ? 0 : Class68_Sub9.method677(i_53_ / i_55_, (byte) -82, i_54_ / i_55_, (i_51_ * 256 / i_56_)));
                            if (is[i_45_][i_57_] == 0)
                            {
                                if (is_60_ != null)
                                    is_60_[(Class120.method1746(63, i_45_) + (Class120.method1746(63, i_57_) << 6))] = 0;
                            } else
                            {
                                if (is_60_ == null)
                                    is_60_ = is_52_[i_57_ >> 6] = new int[4096];
                                int i_62_ = i_28_ + (i_61_ & 0x7f);
                                if (i_62_ < 0)
                                    i_62_ = 0;
                                else if (i_62_ > 127)
                                    i_62_ = 127;
                                int i_63_ = (i_62_ + (i_61_ + i_27_ & 0xfc00) + (0x380 & i_61_));
                                is_60_[(Class120.method1746(63, i_45_) + (Class120.method1746(63, i_57_) << 6))] = (Class62.anIntArray1158[Class4.method185(2, 96, i_63_)]);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("rj.C(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    static final int method1394(byte i, int i_64_, int i_65_)
    {
        if (i != 20)
            return -120;
        anInt4582++;
        int i_66_ = i_65_ - 1 & i_64_ >> 31;
        return (i_64_ + (i_64_ >>> 31)) % i_65_ + i_66_;
    }

    static final void method1395(byte i, Class68_Sub28 class68_sub28)
    {
        try
        {
            if (i < -3)
            {
                ((Class68_Sub28) class68_sub28).aBoolean3229 = false;
                anInt4581++;
                if (((Class68_Sub28) class68_sub28).aClass68_Sub11_3227 != null)
                    ((Class68_Sub11) (((Class68_Sub28) class68_sub28).aClass68_Sub11_3227)).anInt2917 = 0;
                for (Class68_Sub28 class68_sub28_67_ = class68_sub28.method1226(); class68_sub28_67_ != null; class68_sub28_67_ = class68_sub28.method1228())
                    method1395((byte) -10, class68_sub28_67_);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("rj.E(" + i + ',' + (class68_sub28 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1396(byte i)
    {
        if (i != 15)
            method1394((byte) -48, 88, 69);
        aClass98_4579 = null;
        aClass100_4583 = null;
        aClass21_4593 = null;
        aClass21_4588 = null;
        signlink = null;
        aClass100_4589 = null;
        aClass82_4590 = null;
    }

    static
    {
        aClass98_4579 = new MRUNodes(5);
        anInt4587 = 0;
        aClass100_4589 = Class112.makeMutableString(43, "Lade Wordpack )2 ");
        aClass82_4590 = new Login(64);
        anInt4592 = 0;
    }
}
