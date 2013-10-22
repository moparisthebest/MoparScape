/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127 {
    public static int anInt2202;
    public static int anInt2203;
    public static int anInt2204;
    public static Class16 aClass16_2205 = new Class16();
    public static RSString aRSString_2206;
    public static RSString[] aRSStringArray2207;
    public static RSString aRSString_2208;
    public static int anInt2209;
    public static int anInt2210;
    public static RSString aRSString_2211 = RSString.newRsString(":trade:");

    public static void method1777(byte i) {
        anInt2210++;
        Class113.method1682(Class35.aClass45_606, -127);
        Class68_Sub26.anInt3200++;
        if (!Class124.aBoolean2159 || !Class68_Sub18.aBoolean3058) {
            if ((Class68_Sub26.anInt3200 ^ 0xffffffff) < -2)
                Class35.aClass45_606 = null;
        } else {
            int i_0_ = Class96.anInt1695;
            i_0_ -= Class68_Sub13_Sub25.anInt3853;
            if ((Class68_Sub13_Sub37.anInt4073 ^ 0xffffffff)
                    < (i_0_ ^ 0xffffffff))
                i_0_ = Class68_Sub13_Sub37.anInt4073;
            int i_1_ = Class13.anInt223;
            i_1_ -= Class58.anInt1087;
            if ((Class113.anInt1903 ^ 0xffffffff) < (i_1_ ^ 0xffffffff))
                i_1_ = Class113.anInt1903;
            if (Class35.aClass45_606.anInt892 + i_0_
                    > (Class68_Sub13_Sub37.anInt4073
                    + Class68_Sub13_Sub26_Sub1.aClass45_4607.anInt892))
                i_0_ = (Class68_Sub13_Sub26_Sub1.aClass45_4607.anInt892
                        + (Class68_Sub13_Sub37.anInt4073
                        - Class35.aClass45_606.anInt892));
            if (i > -112)
                aRSString_2211 = null;
            if (((Class113.anInt1903
                    - -Class68_Sub13_Sub26_Sub1.aClass45_4607.anInt873)
                    ^ 0xffffffff)
                    > (i_1_ - -Class35.aClass45_606.anInt873 ^ 0xffffffff))
                i_1_ = (Class68_Sub13_Sub26_Sub1.aClass45_4607.anInt873
                        + Class113.anInt1903 + -Class35.aClass45_606.anInt873);
            int i_2_ = i_0_ - Class68_Sub28_Sub2.anInt4545;
            int i_3_ = -Class22.anInt481 + i_1_;
            int i_4_ = Class35.aClass45_606.anInt870;
            if (Class35.aClass45_606.anInt909 < Class68_Sub26.anInt3200
                    && ((i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff)
                    || (i_2_ ^ 0xffffffff) > (-i_4_ ^ 0xffffffff)
                    || i_3_ > i_4_
                    || (-i_4_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff)))
                Class15.aBoolean247 = true;
            int i_5_ = (Class68_Sub13_Sub26_Sub1.aClass45_4607.anInt847 + i_0_
                    - Class68_Sub13_Sub37.anInt4073);
            int i_6_ = (Class68_Sub13_Sub26_Sub1.aClass45_4607.anInt818
                    + (-Class113.anInt1903 + i_1_));
            if (Class35.aClass45_606.anObjectArray807 != null
                    && Class15.aBoolean247) {
                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                class68_sub29.anInt3232 = i_6_;
                class68_sub29.anObjectArray3237
                        = Class35.aClass45_606.anObjectArray807;
                class68_sub29.anInt3240 = i_5_;
                class68_sub29.aClass45_3239 = Class35.aClass45_606;
                Class68_Sub13_Sub16.method776(class68_sub29, 16);
            }
            if (Class68_Sub20_Sub12.anInt4352 == 0) {
                if (Class15.aBoolean247) {
                    if (Class35.aClass45_606.anObjectArray778 != null) {
                        Class68_Sub29 class68_sub29 = new Class68_Sub29();
                        class68_sub29.aClass45_3244 = Animable.aClass45_61;
                        class68_sub29.anInt3232 = i_6_;
                        class68_sub29.anObjectArray3237
                                = Class35.aClass45_606.anObjectArray778;
                        class68_sub29.aClass45_3239 = Class35.aClass45_606;
                        class68_sub29.anInt3240 = i_5_;
                        Class68_Sub13_Sub16.method776(class68_sub29, 16);
                    }
                    if (Animable.aClass45_61 != null
                            && client.method36(Class35.aClass45_606) != null) {
                        Class21renamed.stream.createFrame(179);
                        Class116.anInt1959++;
                        Class21renamed.stream
                                .writeDWord(Animable.aClass45_61.anInt792);
                        Class21renamed.stream.writeDWord
                                (Class35.aClass45_606.anInt792);
                        Class21renamed.stream
                                .writeWord(Class35.aClass45_606.anInt867);
                        Class21renamed.stream
                                .writeWordBigEndian(Animable.aClass45_61.anInt867, (byte) 38);
                    }
                } else if ((Class14.anInt228 == 1
                        || Applet_Sub1.method17((byte) -126,
                        -1 + (Class68_Sub13_Sub21
                                .anInt3803)))
                        && ((Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff)
                        < -3))
                    Class68_Sub13_Sub18.method787((byte) -25);
                else if ((Class68_Sub13_Sub21.anInt3803 ^ 0xffffffff) < -1)
                    Class68_Sub13_Sub39.method901((byte) 49);
                Class35.aClass45_606 = null;
            }
        }
    }

    public static boolean method1778(int i) {
        anInt2202++;
        if (i != Class68_Sub13_Sub10.anInt3597) {
            try {
                Class103.aRSString_1771.method1604((Class75_Sub1_Sub1
                        .signlink
                        .anApplet1042),
                        (byte) -123);
                return true;
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        return false;
    }

    public static void method1779(int i) {
        aRSString_2208 = null;
        aRSStringArray2207 = null;
        if (i != 0)
            aClass16_2205 = null;
        aClass16_2205 = null;
        aRSString_2211 = null;
        aRSString_2206 = null;
    }

    public static Class68_Sub20_Sub10[] method1780(int i, int i_7_, int i_8_,
                                                   Class21renamed class21) {
        anInt2204++;
        if (i != 0)
            method1778(-51);
        if (!Class68_Sub13_Sub36.method880(-29381, i_7_, class21, i_8_))
            return null;
        return Class68_Sub13_Sub38.method897((byte) 15);
    }

    public static void method1781(int i, int i_9_, int i_10_, int i_11_,
                                  byte i_12_) {
        int i_13_ = 0;
        if (i_12_ >= -25)
            method1779(-89);
        for (/**/; (i_13_ ^ 0xffffffff) > (Class56.anInt1061 ^ 0xffffffff);
                 i_13_++) {
            if ((i ^ 0xffffffff) > ((Class105.anIntArray1795[i_13_]
                    - -ItemDef.anIntArray376[i_13_])
                    ^ 0xffffffff)
                    && Class105.anIntArray1795[i_13_] < i_10_ + i
                    && (Class1_Sub6_Sub2.anIntArray3430[i_13_]
                    + Class71.anIntArray1294[i_13_]) > i_9_
                    && ((Class71.anIntArray1294[i_13_] ^ 0xffffffff)
                    > (i_9_ - -i_11_ ^ 0xffffffff)))
                Class121.aBooleanArray2109[i_13_] = true;
        }
        anInt2203++;
    }

    static {
        aRSStringArray2207 = new RSString[8];
        anInt2209 = 0;
        aRSString_2206 = RSString.newRsString(" has logged in)3");
        aRSString_2208 = aRSString_2206;
    }
}
