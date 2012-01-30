/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23 {
    public int anInt489;
    public static byte[][] aByteArrayArray490;
    public static int anInt491;
    public int anInt492;
    public int anInt493;
    public static int anInt494;
    public int anInt495 = -1;
    public int anInt496;
    public int anInt497;
    public static int[] anIntArray498 = {1, 2, 4, 8};
    public int anInt499;
    public static int anInt500;
    public static boolean aBoolean501 = true;
    public int anInt502;
    public int anInt503;

    public static int method376(int i, boolean bool) {
        anInt500++;
        if (bool != false)
            anIntArray498 = null;
        return 0xff & i;
    }

    public static void method377(int i, int i_0_, int i_1_, int i_2_,
                                 Animable class1, Animable class1_3_, int i_4_,
                                 int i_5_, int i_6_, int i_7_, long l) {
        if (class1 != null) {
            Class76 class76 = new Class76();
            class76.aLong1364 = l;
            class76.anInt1349 = i_0_ * 128 + 64;
            class76.anInt1352 = i_1_ * 128 + 64;
            class76.anInt1361 = i_2_;
            class76.aClass1_1358 = class1;
            class76.aClass1_1360 = class1_3_;
            class76.anInt1362 = i_4_;
            class76.anInt1359 = i_5_;
            class76.anInt1356 = i_6_;
            class76.anInt1363 = i_7_;
            for (int i_8_ = i; i_8_ >= 0; i_8_--) {
                if (Class22.aClass68_Sub1ArrayArrayArray484[i_8_][i_0_][i_1_]
                        == null)
                    Class22.aClass68_Sub1ArrayArrayArray484[i_8_][i_0_][i_1_]
                            = new Class68_Sub1(i_8_, i_0_, i_1_);
            }
            Class22.aClass68_Sub1ArrayArrayArray484[i][i_0_][i_1_]
                    .aClass76_2764
                    = class76;
        }
    }

    public static void method378(int i) {
        if (i != 8)
            aBoolean501 = false;
        anIntArray498 = null;
        aByteArrayArray490 = null;
    }

    public static RSString method379(int i, String string) {
        byte[] is;
        try {
            is = string.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
            is = string.getBytes();
        }
        RSString class100 = new RSString();
        class100.bytes = is;
        if (i != 25732)
            anIntArray498 = null;
        class100.anInt2293 = 0;
        anInt494++;
        for (int i_9_ = 0; (is.length ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
             i_9_++) {
            if ((is[i_9_] ^ 0xffffffff) != -1)
                is[class100.anInt2293++] = is[i_9_];
        }
        return class100;
    }
}
