/* PacketStream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class PacketStream extends Stream {
    public static int[] anIntArray4110;
    public static int anInt4111;
    public static int anInt4112;
    public static int anInt4113;
    public static int anInt4114;
    public static int anInt4115;
    public ISAACRandomGen encryption;
    public static Class1_Sub4[] aClass1_Sub4Array4117;
    public static Class98 aClass98_4118;
    public static int anInt4119;
    public static RSString aRSString_4120;
    public static RSString aRSString_4121
            = RSString.newRsString("<col=ffff00>");
    public static int anInt4122;
    public static int anInt4123;
    public static int anInt4124;
    public static int anInt4125;
    public int anInt4126;
    public static boolean aBoolean4127;
    public static int anInt4128;
    public static int anInt4129;
    public static int anInt4130;
    public static int anInt4131;
    public static int[] anIntArray4132;
    public static Class21_Sub1 aClass21_Sub1_4133;
    public static RSString aRSString_4134;

    public void setISAAC(int[] is) {
        encryption = new ISAACRandomGen(is);
        anInt4125++;
    }

    public void method965(int i) {
        int i_0_ = 2 % ((i - 58) / 51);
        anInt4126 = 8 * currentOffset;
        anInt4112++;
    }

    public void method966(byte i) {
        if (i != -59)
            anIntArray4110 = null;
        currentOffset = (7 + anInt4126) / 8;
        anInt4124++;
    }

    public int method967(byte i, int i_1_) {
        anInt4130++;
        int i_2_ = anInt4126 >> -611460541;
        if (i != 0)
            aBoolean4127 = true;
        int i_3_ = 8 - (anInt4126 & 0x7);
        anInt4126 += i_1_;
        int i_4_ = 0;
        for (/**/; (i_3_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_3_ = 8) {
            i_4_ += ((buffer[i_2_++] & Class96.anIntArray1701[i_3_])
                    << i_1_ - i_3_);
            i_1_ -= i_3_;
        }
        if ((i_1_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff))
            i_4_ += (buffer[i_2_] >> i_3_ - i_1_
                    & Class96.anIntArray1701[i_1_]);
        else
            i_4_ += Class96.anIntArray1701[i_3_] & buffer[i_2_];
        return i_4_;
    }

    public static int method968(int i, int i_5_) {
        anInt4122++;
        if ((i ^ 0xffffffff) == -16711936)
            return -1;
        if (i_5_ != -16844)
            return -120;
        return Class74.method1382(i, -82);
    }

    public PacketStream(int i) {
        super(i);
    }

    public static void method969(RSString class100, int i, int i_6_) {
        anInt4114++;
        Class36.anInt641++;
        Class21renamed.stream.createFrame(111);
        if (i == -32443) {
            Class21renamed.stream.writeByte(i_6_);
            Class21renamed.stream.method926(128, class100.toLong(10908));
        }
    }

    public int method970(int i, int i_7_) {
        anInt4113++;
        if (i_7_ > -71)
            return 1;
        return 8 * i - anInt4126;
    }

    public static void method971(int i) {
        Class78.method1410(103);
        Class18.method301(-93);
        Class68_Sub13_Sub31.method855((byte) -103);
        Class59.method585((byte) -88);
        Class68_Sub26.method1215((byte) -108);
        Class1_Sub1.method68((byte) -96);
        Class68_Sub28_Sub2.method1267(125);
        Class75_Sub1_Sub1.method1392(true);
        Class68_Sub13_Sub28.method845((byte) -115);
        anInt4128++;
        Class69.method1329((byte) 78);
        Class44.method493((byte) -59);
        Class64.method625(-27434);
        Class68_Sub13_Sub4.method718((byte) -88);
        Class80.method1445(-10705);
        ((Class90) Class62.anInterface4_1159).method1513((byte) -95);
        Class68_Sub13_Sub16.aLogin_3702.method1470((byte) -11);
        Class68_Sub28_Sub1.aClass21_Sub1_4519.method357(0);
        Class58.aClass21_Sub1_1097.method357(0);
        Class68_Sub13_Sub21.aClass21_Sub1_3804.method357(i ^ i);
        Class78.aClass21_Sub1_1388.method357(i ^ 0x89);
        Class92.aClass21_Sub1_1644.method357(0);
        Class21renamed.aClass21_Sub1_459.method357(0);
        Class120.aClass21_Sub1_2095.method357(0);
        Class52.aClass21_Sub1_1011.method357(0);
        Class84.aClass21_Sub1_1532.method357(0);
        Class21renamed.aClass21_Sub1_472.method357(0);
        Class13.aClass21_Sub1_221.method357(0);
        Class108.aClass98_1827.method1566((byte) 94);
    }

    public int method972(int i) {
        anInt4115++;
        if (i != 255)
            method965(21);
        return ((buffer[currentOffset++] + -encryption.getNextKey((byte) -55)) & 0xff);
    }

    public void createFrame(int packetId) {
        anInt4119++;
        buffer[currentOffset++] = (byte) (packetId + encryption.getNextKey((byte) -23));
    }

    public static void method974(boolean bool) {
        aClass98_4118 = null;
        aRSString_4121 = null;
        aClass1_Sub4Array4117 = null;
        if (bool != false)
            method974(true);
        aRSString_4120 = null;
        aRSString_4134 = null;
        aClass21_Sub1_4133 = null;
        anIntArray4132 = null;
        anIntArray4110 = null;
    }

    public static Class68_Sub20_Sub16 method975(int i, int i_10_, int i_11_) {
        anInt4123++;
        for (Class68_Sub20_Sub16 class68_sub20_sub16
                     = ((Class68_Sub20_Sub16)
                Class35.aClass16_602.method293((byte) 76));
             class68_sub20_sub16 != null;
             class68_sub20_sub16
                     = ((Class68_Sub20_Sub16)
                     Class35.aClass16_602.method290((byte) -110))) {
            if (class68_sub20_sub16.aBoolean4413
                    && class68_sub20_sub16.method1174(67, i_10_, i))
                return class68_sub20_sub16;
        }
        if (i_11_ != 111)
            aClass1_Sub4Array4117 = null;
        return null;
    }

    public void method976(byte[] is, int i, int i_12_, boolean bool) {
        for (int i_13_ = 0; i_13_ < i; i_13_++)
            is[i_13_ + i_12_]
                    = (byte) (buffer[currentOffset++]
                    + -encryption.getNextKey((byte) 64));
        anInt4131++;
        if (bool != false)
            aClass21_Sub1_4133 = null;
    }

    static {
        aClass1_Sub4Array4117 = new Class1_Sub4[4];
        anIntArray4110 = new int[2048];
        aRSString_4120
                = RSString.newRsString("Ladevorgang )2 bitte warten Sie)3");
        aBoolean4127 = false;
        anIntArray4132 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
        aClass98_4118 = new Class98(64);
        aRSString_4134 = RSString.newRsString("sl_arrows");
    }
}
