/* Class71_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.math.BigInteger;

public class Class71_Sub1 extends Class71 {
    public static int anInt3250;
    public static BigInteger aBigInteger3251
            = (new BigInteger
            ("111425062890301051365206642964372080941130087045221691750738418203817739415579"));
    public static int anInt3252;
    public static int anInt3253;
    public static int anInt3254;
    public static int[] anIntArray3255;
    public static RSString aRSString_3256
            = RSString.newRsString("<col=ff0000>");
    public static RSString[] aRSStringArray3257 = new RSString[500];

    public static void method1343(boolean bool) {
        aRSString_3256 = null;
        if (bool == false) {
            aBigInteger3251 = null;
            aRSStringArray3257 = null;
            anIntArray3255 = null;
        }
    }

    public static int method1344(byte i) {
        anInt3254++;
        int i_0_ = -121 / ((i - -31) / 48);
        return 0;
    }

    public static void method1345(int i, Component component) {
        if (i <= -7) {
            anInt3250++;
            component.removeKeyListener(Class66.aClass123_1200);
            component.removeFocusListener(Class66.aClass123_1200);
            Class33.anInt576 = -1;
        }
    }

    public static Class68_Sub20_Sub9 method1346(byte i) {
        anInt3252++;
        Class68_Sub20_Sub9 class68_sub20_sub9
                = (Class68_Sub20_Sub9) Class30.aClass128_550.method1784(1742);
        if (class68_sub20_sub9 != null) {
            class68_sub20_sub9.method647(-17554);
            class68_sub20_sub9.method1005((byte) 73);
            return class68_sub20_sub9;
        }
        if (i != 37)
            aBigInteger3251 = null;
        do {
            class68_sub20_sub9
                    = ((Class68_Sub20_Sub9)
                    Class13_Sub3.aClass128_2662.method1784(i + 1705));
            if (class68_sub20_sub9 == null)
                return null;
            if (class68_sub20_sub9.method1098(i + 218)
                    > Class36.method438(17161))
                return null;
            class68_sub20_sub9.method647(-17554);
            class68_sub20_sub9.method1005((byte) 73);
        } while ((class68_sub20_sub9.aLong3085 & ~0x7fffffffffffffffL
                ^ 0xffffffffffffffffL)
                == -1L);
        return class68_sub20_sub9;
    }
}
