/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

final class Class114
{
    private Inflater anInflater1926;
    static int anInt1927;
    static MutableString aClass100_1928 = Class112.makeMutableString(43, "blinken3:");
    static int anInt1929;
    static MutableString aClass100_1930;
    static int anInt1931;
    static MutableString aClass100_1932;
    static int anInt1933;
    static MutableString aClass100_1934;
    static int anInt1935;
    static int anInt1936;
    static int anInt1937;
    static int anInt1938;
    static byte[][] allocatedTinyBuffers;
    static int anInt1940;

    final void method1694(Stream class68_sub14, int i, byte[] is)
    {
        try
        {
            anInt1937++;
            if ((((Stream) class68_sub14).buffer[((Stream) class68_sub14).position]) != 31 || (((Stream) class68_sub14).buffer[((Stream) class68_sub14).position + 1]) != -117)
                throw new RuntimeException("Invalid GZIP header!");
            if (anInflater1926 == null)
                anInflater1926 = new Inflater(true);
            try
            {
                anInflater1926.setInput(((Stream) class68_sub14).buffer, ((Stream) class68_sub14).position + 10, (-((Stream) class68_sub14).position - (10 - ((((Stream) class68_sub14).buffer).length - 8))));
                anInflater1926.inflate(is);
            } catch (Exception exception)
            {
                anInflater1926.reset();
                throw new RuntimeException("Invalid GZIP compressed data!");
            }
            if (i < 98)
                method1698(-48);
            anInflater1926.reset();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("th.D(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1695(boolean bool)
    {
        aClass100_1930 = null;
        aClass100_1932 = null;
        if (bool != true)
            anInt1927 = 70;
        aClass100_1928 = null;
        aClass100_1934 = null;
        allocatedTinyBuffers = null;
    }

    static final void method1696(byte i, boolean bool, GroundData[] class38s)
    {
        do
        {
            try
            {
                anInt1933++;
                if (i != -111)
                    method1695(true);
                int i_0_;
                if (!bool)
                    i_0_ = 4;
                else
                    i_0_ = 1;
                if (!bool)
                {
                    for (int i_1_ = 0; i_1_ < 4; i_1_++)
                    {
                        for (int i_2_ = 0; i_2_ < 104; i_2_++)
                        {
                            for (int i_3_ = 0; i_3_ < 104; i_3_++)
                            {
                                if ((0x1 & (Object1.byteGroundArray[i_1_][i_2_][i_3_])) == 1)
                                {
                                    int i_4_ = i_1_;
                                    if (((Object1.byteGroundArray[1][i_2_][i_3_]) & 0x2) == 2)
                                        i_4_--;
                                    if (i_4_ >= 0)
                                        class38s[i_4_].method443(i_3_, i_2_);
                                }
                            }
                        }
                    }
                    Class18.anInt316 += (int) (5.0 * Math.random()) - 2;
                    Class1_Sub1.anInt2426 += (int) (Math.random() * 5.0) - 2;
                    if (Class18.anInt316 < -16)
                        Class18.anInt316 = -16;
                    if (Class1_Sub1.anInt2426 < -8)
                        Class1_Sub1.anInt2426 = -8;
                    if (Class1_Sub1.anInt2426 > 8)
                        Class1_Sub1.anInt2426 = 8;
                    if (Class18.anInt316 > 16)
                        Class18.anInt316 = 16;
                }
                int[][] is = new int[104][104];
                int[][] is_5_ = new int[104][104];
                int i_6_ = Class1_Sub1.anInt2426 >> 2 << 10;
                int i_7_ = Class18.anInt316 >> 1;
                for (int i_8_ = 0; i_8_ < i_0_; i_8_++)
                {
                    byte[][] is_9_ = GroundData.aByteArrayArrayArray676[i_8_];
                    int i_10_ = (int) Math.sqrt(5100.0);
                    int i_11_ = 768 * i_10_ >> 8;
                    for (int i_12_ = 1; i_12_ < 103; i_12_++)
                    {
                        for (int i_13_ = 1; i_13_ < 103; i_13_++)
                        {
                            int i_14_ = ((Class68_Sub20_Sub12.intGroundArray[i_8_][i_13_ + 1][i_12_]) - (Class68_Sub20_Sub12.intGroundArray[i_8_][i_13_ - 1][i_12_]));
                            int i_15_ = 74;
                            int i_16_ = ((Class68_Sub20_Sub12.intGroundArray[i_8_][i_13_][i_12_ + 1]) - (Class68_Sub20_Sub12.intGroundArray[i_8_][i_13_][i_12_ - 1]));
                            int i_17_ = (int) Math.sqrt((double) (i_14_ * i_14_ - (-65536 - (i_16_ * i_16_))));
                            int i_18_ = (i_14_ << 8) / i_17_;
                            int i_19_ = -65536 / i_17_;
                            int i_20_ = (i_16_ << 8) / i_17_;
                            i_15_ += (i_20_ * -50 + (i_18_ * -50 + -10 * i_19_)) / i_11_;
                            int i_21_ = ((is_9_[i_13_][i_12_] >> 1) + ((is_9_[i_13_][i_12_ + 1] >> 3) + (is_9_[i_13_][i_12_ - 1] >> 2)) + ((is_9_[i_13_ - 1][i_12_] >> 2) + (is_9_[i_13_ + 1][i_12_] >> 3)));
                            is[i_13_][i_12_] = i_15_ - i_21_;
                        }
                    }
                    for (int i_22_ = 0; i_22_ < 104; i_22_++)
                    {
                        Stream.anIntArray3007[i_22_] = 0;
                        Class68_Sub13_Sub15.anIntArray3681[i_22_] = 0;
                        Object1.anIntArray1180[i_22_] = 0;
                        Class14.anIntArray236[i_22_] = 0;
                        Class68_Sub13_Sub22.anIntArray3807[i_22_] = 0;
                    }
                    for (int i_23_ = -5; i_23_ < 104; i_23_++)
                    {
                        for (int i_24_ = 0; i_24_ < 104; i_24_++)
                        {
                            int i_25_ = i_23_ + 5;
                            if (i_25_ < 104)
                            {
                                int i_26_ = 0xff & (Class52.aByteArrayArrayArray1014[i_8_][i_25_][i_24_]);
                                if (i_26_ > 0)
                                {
                                    Class53 class53 = (Class68_Sub13_Sub2.method707(i_26_ - 1, (byte) -128));
                                    Stream.anIntArray3007[i_24_] += ((Class53) class53).anInt1022;
                                    Class68_Sub13_Sub15.anIntArray3681[i_24_] += ((Class53) class53).anInt1027;
                                    Object1.anIntArray1180[i_24_] += ((Class53) class53).anInt1017;
                                    Class14.anIntArray236[i_24_] += ((Class53) class53).anInt1015;
                                    Class68_Sub13_Sub22.anIntArray3807[i_24_]++;
                                }
                            }
                            int i_27_ = i_23_ - 5;
                            if (i_27_ >= 0)
                            {
                                int i_28_ = ((Class52.aByteArrayArrayArray1014[i_8_][i_27_][i_24_]) & 0xff);
                                if (i_28_ > 0)
                                {
                                    Class53 class53 = (Class68_Sub13_Sub2.method707(i_28_ - 1, (byte) -128));
                                    Stream.anIntArray3007[i_24_] -= ((Class53) class53).anInt1022;
                                    Class68_Sub13_Sub15.anIntArray3681[i_24_] -= ((Class53) class53).anInt1027;
                                    Object1.anIntArray1180[i_24_] -= ((Class53) class53).anInt1017;
                                    Class14.anIntArray236[i_24_] -= ((Class53) class53).anInt1015;
                                    Class68_Sub13_Sub22.anIntArray3807[i_24_]--;
                                }
                            }
                        }
                        if (i_23_ >= 0)
                        {
                            int i_29_ = 0;
                            int i_30_ = 0;
                            int i_31_ = 0;
                            int i_32_ = 0;
                            int i_33_ = 0;
                            for (int i_34_ = -5; i_34_ < 104; i_34_++)
                            {
                                int i_35_ = i_34_ - 5;
                                int i_36_ = i_34_ + 5;
                                if (i_36_ < 104)
                                {
                                    i_31_ += Class14.anIntArray236[i_36_];
                                    i_32_ += (Class68_Sub13_Sub22.anIntArray3807[i_36_]);
                                    i_33_ += Object1.anIntArray1180[i_36_];
                                    i_29_ += Stream.anIntArray3007[i_36_];
                                    i_30_ += (Class68_Sub13_Sub15.anIntArray3681[i_36_]);
                                }
                                if (i_35_ >= 0)
                                {
                                    i_30_ -= (Class68_Sub13_Sub15.anIntArray3681[i_35_]);
                                    i_33_ -= Object1.anIntArray1180[i_35_];
                                    i_32_ -= (Class68_Sub13_Sub22.anIntArray3807[i_35_]);
                                    i_29_ -= Stream.anIntArray3007[i_35_];
                                    i_31_ -= Class14.anIntArray236[i_35_];
                                }
                                if (i_34_ >= 0 && i_32_ > 0)
                                    is_5_[i_23_][i_34_] = Class68_Sub9.method677(i_30_ / i_32_, (byte) -76, i_33_ / i_32_, (256 * i_29_ / i_31_));
                            }
                        }
                    }
                    for (int i_37_ = 1; i_37_ < 103; i_37_++)
                    {
                        for (int i_38_ = 1; i_38_ < 103; i_38_++)
                        {
                            if (bool || Class28.method398(i + 24892) || (0x2 & (Object1.byteGroundArray[0][i_37_][i_38_])) != 0 || (((Object1.byteGroundArray[i_8_][i_37_][i_38_]) & 0x10) == 0 && (Mouse.method1490(i_38_, i_8_, i_37_, (byte) -103) == Class68_Sub13_Sub18.anInt3739)))
                            {
                                if (Class68_Sub25.anInt3176 > i_8_)
                                    Class68_Sub25.anInt3176 = i_8_;
                                int i_39_ = ((Class52.aByteArrayArrayArray1014[i_8_][i_37_][i_38_]) & 0xff);
                                int i_40_ = ((Class68_Sub13_Sub35.aByteArrayArrayArray4030[i_8_][i_37_][i_38_]) & 0xff);
                                if (i_39_ > 0 || i_40_ > 0)
                                {
                                    int i_41_ = (Class68_Sub20_Sub12.intGroundArray[i_8_][i_37_][i_38_]);
                                    int i_42_ = (Class68_Sub20_Sub12.intGroundArray[i_8_][i_37_ + 1][i_38_]);
                                    int i_43_ = (Class68_Sub20_Sub12.intGroundArray[i_8_][i_37_ + 1][i_38_ + 1]);
                                    int i_44_ = (Class68_Sub20_Sub12.intGroundArray[i_8_][i_37_][i_38_ + 1]);
                                    if (i_8_ > 0)
                                    {
                                        boolean bool_45_ = true;
                                        if (i_39_ == 0 && (Class109.aByteArrayArrayArray1849[i_8_][i_37_][i_38_]) != 0)
                                            bool_45_ = false;
                                        if (i_40_ > 0 && !(((Class9) Class94.method1547((byte) 53, (i_40_ - 1))).aBoolean170))
                                            bool_45_ = false;
                                        if (bool_45_ && i_41_ == i_42_ && i_43_ == i_41_ && i_41_ == i_44_)
                                            Class74.anIntArrayArrayArray1336[i_8_][i_37_][i_38_] = (Class70.OR((Class74.anIntArrayArrayArray1336[i_8_][i_37_][i_38_]), 4));
                                    }
                                    int i_46_;
                                    int i_47_;
                                    if (i_39_ > 0)
                                    {
                                        i_47_ = is_5_[i_37_][i_38_];
                                        int i_48_ = (0x7f & i_47_) + i_7_;
                                        if (i_48_ < 0)
                                            i_48_ = 0;
                                        else if (i_48_ > 127)
                                            i_48_ = 127;
                                        int i_49_ = i_48_ + ((i_47_ + i_6_ & 0xfc00) + (0x380 & i_47_));
                                        i_46_ = (Class62.anIntArray1158[Class4.method185(2, 96, i_49_)]);
                                    } else
                                    {
                                        i_46_ = 0;
                                        i_47_ = -1;
                                    }
                                    int i_50_ = is[i_37_][i_38_];
                                    int i_51_ = is[i_37_ + 1][i_38_];
                                    int i_52_ = is[i_37_][i_38_ + 1];
                                    int i_53_ = is[i_37_ + 1][i_38_ + 1];
                                    if (i_40_ != 0)
                                    {
                                        int i_54_ = ((Class109.aByteArrayArrayArray1849[i_8_][i_37_][i_38_]) + 1);
                                        byte i_55_ = (Class85.aByteArrayArrayArray1556[i_8_][i_37_][i_38_]);
                                        Class9 class9 = Class94.method1547((byte) 53, i_40_ - 1);
                                        int i_56_ = ((Class9) class9).anInt175;
                                        if (i_56_ >= 0 && !Class62.anInterface4_1159.method8((byte) 39, i_56_))
                                            i_56_ = -1;
                                        int i_57_;
                                        int i_58_;
                                        if (i_56_ >= 0)
                                        {
                                            i_58_ = -1;
                                            i_57_ = (Class62.anIntArray1158[(Class53.method547((byte) -91, (Class62.anInterface4_1159.method12(i_56_, 121)), 96))]);
                                        } else if (((Class9) class9).anInt168 == -1)
                                        {
                                            i_57_ = 0;
                                            i_58_ = -2;
                                        } else
                                        {
                                            i_58_ = ((Class9) class9).anInt168;
                                            int i_59_ = i_7_ + (i_58_ & 0x7f);
                                            if (i_59_ < 0)
                                                i_59_ = 0;
                                            else if (i_59_ > 127)
                                                i_59_ = 127;
                                            int i_60_ = i_59_ + ((0x380 & i_58_) + (0xfc00 & i_6_ + i_58_));
                                            i_57_ = (Class62.anIntArray1158[(Class53.method547((byte) -91, i_60_, 96))]);
                                        }
                                        if (((Class9) class9).anInt172 >= 0)
                                        {
                                            int i_61_ = ((Class9) class9).anInt172;
                                            int i_62_ = (i_61_ & 0x7f) + i_7_;
                                            if (i_62_ < 0)
                                                i_62_ = 0;
                                            else if (i_62_ > 127)
                                                i_62_ = 127;
                                            int i_63_ = (i_62_ + (i_61_ & 0x380) + (0xfc00 & i_6_ + i_61_));
                                            i_57_ = (Class62.anIntArray1158[(Class53.method547((byte) -91, i_63_, 96))]);
                                        }
                                        Ground.method648(i_8_, i_37_, i_38_, i_54_, i_55_, i_56_, i_41_, i_42_, i_43_, i_44_, Class4.method185(2, i_50_, i_47_), Class4.method185(i ^ ~0x6c, i_51_, i_47_), Class4.method185(2, i_53_, i_47_), Class4.method185(2, i_52_, i_47_), Class53.method547((byte) -91, i_58_, i_50_), Class53.method547((byte) -91, i_58_, i_51_), Class53.method547((byte) -91, i_58_, i_53_), Class53.method547((byte) -91, i_58_, i_52_), i_46_, i_57_);
                                    } else
                                        Ground.method648(i_8_, i_37_, i_38_, 0, 0, -1, i_41_, i_42_, i_43_, i_44_, Class4.method185(2, i_50_, i_47_), Class4.method185(2, i_51_, i_47_), Class4.method185(2, i_53_, i_47_), Class4.method185(i + 113, i_52_, i_47_), 0, 0, 0, 0, i_46_, 0);
                                }
                            }
                        }
                    }
                    Class52.aByteArrayArrayArray1014[i_8_] = null;
                    Class68_Sub13_Sub35.aByteArrayArrayArray4030[i_8_] = null;
                    Class109.aByteArrayArrayArray1849[i_8_] = null;
                    Class85.aByteArrayArrayArray1556[i_8_] = null;
                    GroundData.aByteArrayArrayArray676[i_8_] = null;
                }
                Class89.method1504(-50, -10, -50);
                if (bool)
                    break;
                for (int i_64_ = 0; i_64_ < 104; i_64_++)
                {
                    for (int i_65_ = 0; i_65_ < 104; i_65_++)
                    {
                        if ((Object1.byteGroundArray[1][i_64_][i_65_] & 0x2) == 2)
                            Class68_Sub13_Sub11.method748(i_64_, i_65_);
                    }
                }
                for (int i_66_ = 0; i_66_ < 4; i_66_++)
                {
                    for (int i_67_ = 0; i_67_ <= 104; i_67_++)
                    {
                        for (int i_68_ = 0; i_68_ <= 104; i_68_++)
                        {
                            if ((0x1 & (Class74.anIntArrayArrayArray1336[i_66_][i_68_][i_67_])) != 0)
                            {
                                int i_69_;
                                for (i_69_ = i_67_; (i_69_ < 104 && (0x1 & (Class74.anIntArrayArrayArray1336[i_66_][i_68_][i_69_ + 1])) != 0); i_69_++)
                                {
                                    /* empty */
                                }
                                int i_70_ = i_66_;
                                int i_71_ = i_66_;
                                int i_72_;
                                for (i_72_ = i_67_; i_72_ > 0; i_72_--)
                                {
                                    if (((Class74.anIntArrayArrayArray1336[i_66_][i_68_][i_72_ - 1]) & 0x1) == 0)
                                        break;
                                }
                                while_162_: for (/**/; i_70_ > 0; i_70_--)
                                {
                                    for (int i_73_ = i_72_; i_73_ <= i_69_; i_73_++)
                                    {
                                        if (((Class74.anIntArrayArrayArray1336[i_70_ - 1][i_68_][i_73_]) & 0x1) == 0)
                                            break while_162_;
                                    }
                                }
                                while_163_: for (/**/; i_71_ < 3; i_71_++)
                                {
                                    for (int i_74_ = i_72_; i_69_ >= i_74_; i_74_++)
                                    {
                                        if (((Class74.anIntArrayArrayArray1336[i_71_ + 1][i_68_][i_74_]) & 0x1) == 0)
                                            break while_163_;
                                    }
                                }
                                int i_75_ = ((i_69_ + 1 - i_72_) * (i_71_ - i_70_ + 1));
                                if (i_75_ >= 8)
                                {
                                    int i_76_ = 240;
                                    int i_77_ = (Class68_Sub20_Sub12.intGroundArray[i_70_][i_68_][i_72_]);
                                    int i_78_ = ((Class68_Sub20_Sub12.intGroundArray[i_71_][i_68_][i_72_]) - i_76_);
                                    Class28.method397(1, 128 * i_68_, i_68_ * 128, i_72_ * 128, i_69_ * 128 + 128, i_78_, i_77_);
                                    for (int i_79_ = i_70_; i_71_ >= i_79_; i_79_++)
                                    {
                                        for (int i_80_ = i_72_; i_69_ >= i_80_; i_80_++)
                                            Class74.anIntArrayArrayArray1336[i_79_][i_68_][i_80_] = (Class120.method1746((Class74.anIntArrayArrayArray1336[i_79_][i_68_][i_80_]), -2));
                                    }
                                }
                            }
                            if (((Class74.anIntArrayArrayArray1336[i_66_][i_68_][i_67_]) & 0x2) != 0)
                            {
                                int i_81_ = i_68_;
                                int i_82_ = i_68_;
                                int i_83_ = i_66_;
                                for (/**/; (i_81_ > 0 && (0x2 & (Class74.anIntArrayArrayArray1336[i_66_][i_81_ - 1][i_67_])) != 0); i_81_--)
                                {
                                    /* empty */
                                }
                                int i_84_ = i_66_;
                                for (/**/; i_82_ < 104; i_82_++)
                                {
                                    if (((Class74.anIntArrayArrayArray1336[i_66_][i_82_ + 1][i_67_]) & 0x2) == 0)
                                        break;
                                }
                                while_164_: for (/**/; i_83_ > 0; i_83_--)
                                {
                                    for (int i_85_ = i_81_; i_85_ <= i_82_; i_85_++)
                                    {
                                        if (((Class74.anIntArrayArrayArray1336[i_83_ - 1][i_85_][i_67_]) & 0x2) == 0)
                                            break while_164_;
                                    }
                                }
                                while_165_: for (/**/; i_84_ < 3; i_84_++)
                                {
                                    for (int i_86_ = i_81_; i_82_ >= i_86_; i_86_++)
                                    {
                                        if (((Class74.anIntArrayArrayArray1336[i_84_ + 1][i_86_][i_67_]) & 0x2) == 0)
                                            break while_165_;
                                    }
                                }
                                int i_87_ = ((i_82_ - i_81_ + 1) * (i_84_ + (1 - i_83_)));
                                if (i_87_ >= 8)
                                {
                                    int i_88_ = 240;
                                    int i_89_ = ((Class68_Sub20_Sub12.intGroundArray[i_84_][i_81_][i_67_]) - i_88_);
                                    int i_90_ = (Class68_Sub20_Sub12.intGroundArray[i_83_][i_81_][i_67_]);
                                    Class28.method397(2, 128 * i_81_, 128 * i_82_ + 128, i_67_ * 128, 128 * i_67_, i_89_, i_90_);
                                    for (int i_91_ = i_83_; i_91_ <= i_84_; i_91_++)
                                    {
                                        for (int i_92_ = i_81_; i_82_ >= i_92_; i_92_++)
                                            Class74.anIntArrayArrayArray1336[i_91_][i_92_][i_67_] = (Class120.method1746((Class74.anIntArrayArrayArray1336[i_91_][i_92_][i_67_]), -3));
                                    }
                                }
                            }
                            if ((0x4 & (Class74.anIntArrayArrayArray1336[i_66_][i_68_][i_67_])) != 0)
                            {
                                int i_93_ = i_68_;
                                int i_94_ = i_68_;
                                int i_95_ = i_67_;
                                int i_96_ = i_67_;
                                for (/**/; i_95_ > 0; i_95_--)
                                {
                                    if (((Class74.anIntArrayArrayArray1336[i_66_][i_68_][i_95_ - 1]) & 0x4) == 0)
                                        break;
                                }
                                for (/**/; i_96_ < 104; i_96_++)
                                {
                                    if (((Class74.anIntArrayArrayArray1336[i_66_][i_68_][i_96_ + 1]) & 0x4) == 0)
                                        break;
                                }
                                while_166_: for (/**/; i_93_ > 0; i_93_--)
                                {
                                    for (int i_97_ = i_95_; i_96_ >= i_97_; i_97_++)
                                    {
                                        if ((0x4 & (Class74.anIntArrayArrayArray1336[i_66_][i_93_ - 1][i_97_])) == 0)
                                            break while_166_;
                                    }
                                }
                                while_167_: for (/**/; i_94_ < 104; i_94_++)
                                {
                                    for (int i_98_ = i_95_; i_98_ <= i_96_; i_98_++)
                                    {
                                        if (((Class74.anIntArrayArrayArray1336[i_66_][i_94_ + 1][i_98_]) & 0x4) == 0)
                                            break while_167_;
                                    }
                                }
                                if ((1 - i_95_ + i_96_) * (i_94_ + 1 - i_93_) >= 4)
                                {
                                    int i_99_ = (Class68_Sub20_Sub12.intGroundArray[i_66_][i_93_][i_95_]);
                                    Class28.method397(4, 128 * i_93_, 128 * i_94_ + 128, i_95_ * 128, 128 * i_96_ + 128, i_99_, i_99_);
                                    for (int i_100_ = i_93_; i_94_ >= i_100_; i_100_++)
                                    {
                                        for (int i_101_ = i_95_; i_96_ >= i_101_; i_101_++)
                                            Class74.anIntArrayArrayArray1336[i_66_][i_100_][i_101_] = (Class120.method1746((Class74.anIntArrayArrayArray1336[i_66_][i_100_][i_101_]), -5));
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("th.B(" + i + ',' + bool + ',' + (class38s != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    public Class114()
    {
        this(-1, 1000000, 1000000);
    }

    static final void method1697(int i)
    {
        anInt1940++;
        int i_102_ = 128 * Stream.cameraPositionX_local + 64;
        int i_103_ = Class68_Sub13_Sub37.cameraPositionY_local * 128 + 64;
        int i_104_ = (Player.fixZ(i_102_, GameSocket.plane, i_103_) - Class68_Sub13_Sub31.cameraPositionZ_local);
        do
        {
            if (Class68_Sub24.cameraTurnStep_local >= 100)
            {
                Class68_Sub7.cameraPositionX = 128 * Stream.cameraPositionX_local + 64;
                Class85.cameraPositionY = Class68_Sub13_Sub37.cameraPositionY_local * 128 + 64;
                Class68_Sub5.cameraPositionZ = (Player.fixZ(Class68_Sub7.cameraPositionX, GameSocket.plane, Class85.cameraPositionY) - Class68_Sub13_Sub31.cameraPositionZ_local);
                if (client.anInt2387 == 0)
                    break;
            }
            if (Class68_Sub7.cameraPositionX < i_102_)
            {
                Class68_Sub7.cameraPositionX += ((i_102_ - Class68_Sub7.cameraPositionX) * Class68_Sub24.cameraTurnStep_local / 1000) + Class125.cameraTurnSpeed_local;
                if (i_102_ < Class68_Sub7.cameraPositionX)
                    Class68_Sub7.cameraPositionX = i_102_;
            }
            if (i_103_ > Class85.cameraPositionY)
            {
                Class85.cameraPositionY += ((i_103_ - Class85.cameraPositionY) * Class68_Sub24.cameraTurnStep_local / 1000) + Class125.cameraTurnSpeed_local;
                if (Class85.cameraPositionY > i_103_)
                    Class85.cameraPositionY = i_103_;
            }
            if (i_103_ < Class85.cameraPositionY)
            {
                Class85.cameraPositionY -= Class125.cameraTurnSpeed_local + (Class68_Sub24.cameraTurnStep_local * (Class85.cameraPositionY - i_103_) / 1000);
                if (Class85.cameraPositionY < i_103_)
                    Class85.cameraPositionY = i_103_;
            }
            if (i_102_ < Class68_Sub7.cameraPositionX)
            {
                Class68_Sub7.cameraPositionX -= ((Class68_Sub7.cameraPositionX - i_102_) * Class68_Sub24.cameraTurnStep_local / 1000) + Class125.cameraTurnSpeed_local;
                if (Class68_Sub7.cameraPositionX < i_102_)
                    Class68_Sub7.cameraPositionX = i_102_;
            }
            if (i_104_ > Class68_Sub5.cameraPositionZ)
            {
                Class68_Sub5.cameraPositionZ += (Class68_Sub24.cameraTurnStep_local * (i_104_ - Class68_Sub5.cameraPositionZ) / 1000) + Class125.cameraTurnSpeed_local;
                if (i_104_ < Class68_Sub5.cameraPositionZ)
                    Class68_Sub5.cameraPositionZ = i_104_;
            }
            if (Class68_Sub5.cameraPositionZ > i_104_)
            {
                Class68_Sub5.cameraPositionZ -= Class125.cameraTurnSpeed_local + ((Class68_Sub5.cameraPositionZ - i_104_) * Class68_Sub24.cameraTurnStep_local / 1000);
                if (Class68_Sub5.cameraPositionZ < i_104_)
                    Class68_Sub5.cameraPositionZ = i_104_;
            }
        } while (false);
        i_103_ = 128 * PlayerDefinition.cameraViewToY + 64;
        i_102_ = 128 * Class8.cameraViewToX + 64;
        i_104_ = Player.fixZ(i_102_, GameSocket.plane, i_103_) - Class68_Sub13.cameraViewToZ;
        if (i != -128)
            method1699((byte) 116, null);
        int i_105_ = i_104_ - Class68_Sub5.cameraPositionZ;
        int i_106_ = i_102_ - Class68_Sub7.cameraPositionX;
        int i_107_ = i_103_ - Class85.cameraPositionY;
        int i_108_ = (int) Math.sqrt((double) (i_107_ * i_107_ + i_106_ * i_106_));
        int i_109_ = 0x7ff & (int) (325.949 * Math.atan2((double) i_105_, (double) i_108_));
        if (i_109_ < 128)
            i_109_ = 128;
        if (i_109_ > 383)
            i_109_ = 383;
        int i_110_ = 0x7ff & (int) (Math.atan2((double) i_106_, (double) i_107_) * -325.949);
        int i_111_ = i_110_ - Class74.cameraYaw;
        if (i_111_ > 1024)
            i_111_ -= 2048;
        if (i_111_ < -1024)
            i_111_ += 2048;
        if (GameCanvas.cameraPitch < i_109_)
        {
            GameCanvas.cameraPitch += (Class72.anInt1321 * (i_109_ - GameCanvas.cameraPitch) / 1000 + Class68_Sub20_Sub12.anInt4356);
            if (GameCanvas.cameraPitch > i_109_)
                GameCanvas.cameraPitch = i_109_;
        }
        if (i_111_ > 0)
        {
            Class74.cameraYaw += (Class68_Sub20_Sub12.anInt4356 + Class72.anInt1321 * i_111_ / 1000);
            Class74.cameraYaw &= 0x7ff;
        }
        if (i_111_ < 0)
        {
            Class74.cameraYaw -= (Class68_Sub20_Sub12.anInt4356 + Class72.anInt1321 * -i_111_ / 1000);
            Class74.cameraYaw &= 0x7ff;
        }
        int i_112_ = i_110_ - Class74.cameraYaw;
        if (GameCanvas.cameraPitch > i_109_)
        {
            GameCanvas.cameraPitch -= (Class72.anInt1321 * (GameCanvas.cameraPitch - i_109_) / 1000 + Class68_Sub20_Sub12.anInt4356);
            if (GameCanvas.cameraPitch < i_109_)
                GameCanvas.cameraPitch = i_109_;
        }
        if (i_112_ > 1024)
            i_112_ -= 2048;
        if (i_112_ < -1024)
            i_112_ += 2048;
        if (i_112_ < 0 && i_111_ > 0 || i_112_ > 0 && i_111_ < 0)
            Class74.cameraYaw = i_110_;
    }

    static final void method1698(int i)
    {
        if (i != 0)
            anInt1929 = -60;
        anInt1936++;
        if (!Class28.method398(i ^ 0x60cd) && GameSocket.plane != Class68_Sub13_Sub18.anInt3739)
            RandomNumberGenerator.method1461((((Character) Class68_Sub7.localPlayer).walkQueueY[0]), GameSocket.plane, false, (((Character) Class68_Sub7.localPlayer).walkQueueX[0]), ItemDefinition.anInt365, Class43.anInt732);
        else if (Class68_Sub13_Sub32.anInt3983 != GameSocket.plane)
        {
            Class68_Sub13_Sub32.anInt3983 = GameSocket.plane;
            Class13_Sub1.method246((byte) -124, GameSocket.plane);
            Class107.method1660(i - 13401);
        }
    }

    static final void method1699(byte i, Class21 class21)
    {
        try
        {
            Class28.aClass21_531 = class21;
            Class112.anInt1881 = Class28.aClass21_531.method355(4, 0);
            if (i >= -70)
                aClass100_1932 = null;
            anInt1938++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("th.E(" + i + ',' + (class21 != null ? "{...}" : "null") + ')'));
        }
    }

    private Class114(int i, int i_113_, int i_114_)
    {
        /* empty */
    }

    static
    {
        anInt1927 = -1;
        aClass100_1930 = Class112.makeMutableString(43, "k");
        aClass100_1932 = Class112.makeMutableString(43, " )2> <col=00ffff>");
        anInt1929 = 0;
        aClass100_1934 = Class112.makeMutableString(43, "Spielwelt erstellt)3");
        allocatedTinyBuffers = new byte[1000][];
    }
}
