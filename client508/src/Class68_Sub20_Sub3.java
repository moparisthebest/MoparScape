/* Class68_Sub20_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68_Sub20_Sub3 extends Class68_Sub20 {
    public static Class21renamed aClass21_4192;
    public Class113 aClass113_4193;
    public static RSString aRSString_4194;
    public static int anInt4195;
    public static int anInt4196 = 0;
    public int anInt4197;
    public static int anInt4198;
    public int anInt4199;
    public static int anInt4200;
    public static int anInt4201;
    public Class113 aClass113_4202;
    public static int anInt4203;
    public static int anInt4204;
    public int anInt4205;
    public static int anInt4206;
    public static int anInt4207;
    public RSString aRSString_4208 = Class50.aRSString_992;
    public static int anInt4209;
    public static int anInt4210;
    public static int anInt4211;
    public static int anInt4212;
    public static int anInt4213;

    public boolean method1046(byte i, int i_0_) {
        anInt4206++;
        if (aClass113_4202 == null)
            return false;
        if (aClass113_4193 == null)
            method1053(113);
        if (i > -78)
            method1055(null, 122, null);
        Class68_Sub10 class68_sub10
                = (Class68_Sub10) aClass113_4193.method1678((long) i_0_, -74);
        if (class68_sub10 == null)
            return false;
        return true;
    }

    public RSString method1047(byte i, int i_1_) {
        int i_2_ = -13 / ((i - -51) / 55);
        anInt4198++;
        if (aClass113_4202 == null)
            return aRSString_4208;
        Class68_Sub5 class68_sub5
                = (Class68_Sub5) aClass113_4202.method1678((long) i_1_, -78);
        if (class68_sub5 == null)
            return aRSString_4208;
        return class68_sub5.aRSString_2830;
    }

    public void method1048(int i, Stream class68_sub14) {
        for (; ; ) {
            int i_3_ = class68_sub14.readUnsignedByte(-6677);
            if (i_3_ == 0)
                break;
            method1057(class68_sub14, (byte) -119, i_3_);
        }
        anInt4203++;
        if (i != 0)
            anInt4199 = 28;
    }

    public void method1049(int i) {
        aClass113_4193 = new Class113(aClass113_4202.method1680(-128));
        if (i == 6) {
            for (Class68_Sub5 class68_sub5
                         = (Class68_Sub5) aClass113_4202.method1679(-32642);
                 class68_sub5 != null;
                 class68_sub5
                         = (Class68_Sub5) aClass113_4202.method1683((byte) -120)) {
                Class68_Sub24 class68_sub24
                        = new Class68_Sub24(class68_sub5.aRSString_2830,
                        (int) class68_sub5.aLong1218);
                aClass113_4193.method1677((byte) -9, class68_sub24,
                        class68_sub5.aRSString_2830
                                .method1580(85));
            }
            anInt4213++;
        }
    }

    public boolean method1050(int i, RSString class100) {
        anInt4204++;
        if (i < 62)
            return true;
        if (aClass113_4202 == null)
            return false;
        if (aClass113_4193 == null)
            method1049(6);
        for (Class68_Sub24 class68_sub24
                     = ((Class68_Sub24)
                aClass113_4193.method1678(class100.method1580(-85), -71));
             class68_sub24 != null;
             class68_sub24 = (Class68_Sub24) aClass113_4193.method1686(127)) {
            if (class68_sub24.aRSString_3163.method1593(class100, (byte) 117))
                return true;
        }
        return false;
    }

    public static int method1051(int i, int i_4_) {
        anInt4195++;
        if ((i_4_ ^ 0xffffffff) > -1)
            return 0;
        Class68_Sub22 class68_sub22
                = ((Class68_Sub22)
                Class68_Sub13_Sub8.aClass113_3564.method1678((long) i_4_,
                        i + -121));
        if (class68_sub22 == null)
            return Class125.method1763((byte) 106, i_4_).anInt4181;
        int i_5_ = 0;
        for (int i_6_ = 0; i_6_ < class68_sub22.anIntArray3144.length;
             i_6_++) {
            if (class68_sub22.anIntArray3144[i_6_] == -1)
                i_5_++;
        }
        i_5_ += (Class125.method1763((byte) 126, i_4_).anInt4181
                - class68_sub22.anIntArray3144.length);
        if (i != 2)
            return -37;
        return i_5_;
    }

    public static Class105 method1052(int i) {
        anInt4212++;
        if (i != 3253)
            method1056(-92);
        try {
            //xxx return (Class105) Class.forName("Class105_Sub1").newInstance();
            return new Class105_Sub1();
        } catch (Throwable throwable) {
            return null;
        }
    }

    public void method1053(int i) {
        aClass113_4193 = new Class113(aClass113_4202.method1680(-128));
        if (i >= 50) {
            for (Class68_Sub10 class68_sub10
                         = (Class68_Sub10) aClass113_4202.method1679(-32642);
                 class68_sub10 != null;
                 class68_sub10 = ((Class68_Sub10)
                         aClass113_4202.method1683((byte) -117))) {
                Class68_Sub10 class68_sub10_7_
                        = new Class68_Sub10((int) class68_sub10.aLong1218);
                aClass113_4193.method1677((byte) 123, class68_sub10_7_,
                        (long) class68_sub10.anInt2902);
            }
            anInt4211++;
        }
    }

    public int method1054(int i, int i_8_) {
        anInt4209++;
        if (aClass113_4202 == null)
            return anInt4205;
        Class68_Sub10 class68_sub10
                = (Class68_Sub10) aClass113_4202.method1678((long) i, -84);
        if (i_8_ != -32511)
            return -78;
        if (class68_sub10 == null)
            return anInt4205;
        return class68_sub10.anInt2902;
    }

    public static RSString method1055(RSString class100, int i,
                                      Class45 class45) {
        try {
            anInt4207++;
            if (class100.method1595(-125, Class68_Sub20_Sub7.aRSString_4267)
                    != -1) {
                for (; ; ) {
                    int i_9_ = class100.method1595(33, Unknown.aRSString_1618);
                    if ((i_9_ ^ 0xffffffff) == 0)
                        break;
                    class100
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2, (new RSString[]
                                    {class100.method1607(0, (byte) -74, i_9_),
                                            (Class68_Sub13_Sub6.method720
                                                    (Class68_Sub24.method1205(0, 20, class45),
                                                            i ^ ~0x6c6d)),
                                            class100.method1615(2 + i_9_, true)})));
                }
                for (; ; ) {
                    int i_10_
                            = class100.method1595(i ^ 0x6c5c, Class4.aRSString_94);
                    if ((i_10_ ^ 0xffffffff) == 0)
                        break;
                    class100
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2, (new RSString[]
                                    {class100.method1607(0, (byte) -74, i_10_),
                                            (Class68_Sub13_Sub6.method720
                                                    (Class68_Sub24.method1205(1, 20, class45),
                                                            -1)),
                                            class100.method1615(i_10_ + 2, true)})));
                }
                for (; ; ) {
                    int i_11_ = class100.method1595(i + -27678,
                            Unknown.aRSString_1619);
                    if (i_11_ == -1)
                        break;
                    class100
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2, (new RSString[]
                                    {class100.method1607(0, (byte) -74, i_11_),
                                            (Class68_Sub13_Sub6.method720
                                                    (Class68_Sub24.method1205(2, i + -27737,
                                                            class45),
                                                            -1)),
                                            class100.method1615(2 + i_11_, true)})));
                }
                for (; ; ) {
                    int i_12_ = class100.method1595(-126, (Class68_Sub13_Sub18
                            .aRSString_3732));
                    if ((i_12_ ^ 0xffffffff) == 0)
                        break;
                    class100
                            = (Class68_Sub20_Sub13_Sub2.method1166
                            (2, (new RSString[]
                                    {class100.method1607(0, (byte) -74, i_12_),
                                            (Class68_Sub13_Sub6.method720
                                                    (Class68_Sub24.method1205(3, 20, class45),
                                                            -1)),
                                            class100.method1615(2 + i_12_, true)})));
                }
                for (; ; ) {
                    int i_13_ = class100.method1595(i + -27855,
                            Class7.aRSString_127);
                    if ((i_13_ ^ 0xffffffff) == 0)
                        break;
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166
                            (i + -27755,
                                    (new RSString[]
                                            {class100.method1607(0, (byte) -74, i_13_),
                                                    (Class68_Sub13_Sub6.method720
                                                            (Class68_Sub24.method1205(4, 20, class45),
                                                                    -1)),
                                                    class100.method1615(2 + i_13_, true)})));
                }
                for (; ; ) {
                    int i_14_
                            = class100.method1595(-73,
                            Class21_Sub1.aRSString_2702);
                    if (i_14_ == -1)
                        break;
                    RSString class100_15_ = Class68_Sub28_Sub2.aRSString_4556;
                    if (Class68_Sub10.aClass31_2914 != null) {
                        class100_15_
                                = Class1_Sub7.method165((Class68_Sub10
                                .aClass31_2914.port),
                                -17516);
                        try {
                            if (Class68_Sub10.aClass31_2914.playerDefSocket
                                    != null) {
                                byte[] is
                                        = ((String)
                                        Class68_Sub10.aClass31_2914.playerDefSocket)
                                        .getBytes("ISO-8859-1");
                                class100_15_
                                        = Class68_Sub13_Sub27.method842(is.length,
                                        is, 43, 0);
                            }
                        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
                            /* empty */
                        }
                    }
                    class100 = (Class68_Sub20_Sub13_Sub2.method1166
                            (i ^ 0x6c6f,
                                    (new RSString[]
                                            {class100.method1607(0, (byte) -74, i_14_),
                                                    class100_15_,
                                                    class100.method1615(4 + i_14_, true)})));
                }
            }
            if (i != 27757)
                aRSString_4194 = null;
            return class100;
        } catch (RuntimeException runtimeexception) {
            throw Class107.method1652(runtimeexception,
                    ("cd.J("
                            + (class100 != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class45 != null ? "{...}" : "null")
                            + ')'));
        }
    }

    public static void method1056(int i) {
        aClass21_4192 = null;
        if (i != 0)
            method1051(18, 45);
        aRSString_4194 = null;
    }

    public void method1057(Stream class68_sub14, byte i, int i_16_) {
        anInt4200++;
        if (i != -119)
            aRSString_4208 = null;
        if ((i_16_ ^ 0xffffffff) == -2)
            anInt4197 = class68_sub14.readUnsignedByte(i + -6558);
        else if ((i_16_ ^ 0xffffffff) == -3)
            anInt4199 = class68_sub14.readUnsignedByte(-6677);
        else if (i_16_ == 3)
            aRSString_4208 = class68_sub14.readString(127);
        else if (i_16_ == 4)
            anInt4205 = class68_sub14.readDWord();
        else if (i_16_ == 5 || i_16_ == 6) {
            int i_17_ = class68_sub14.readUnsignedWord(1355769544);
            aClass113_4202 = new Class113(Class90.method1517(i_17_, -21189));
            for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff);
                 i_18_++) {
                int i_19_ = class68_sub14.readDWord();
                Class68 class68;
                if (i_16_ == 5)
                    class68 = new Class68_Sub5(class68_sub14.readString(127));
                else
                    class68
                            = new Class68_Sub10(class68_sub14.readDWord());
                aClass113_4202.method1677((byte) 2, class68, (long) i_19_);
            }
        }
    }

    static {
        aRSString_4194 = RSString.newRsString("Untersuchen");
        anInt4210 = -1;
    }
}
