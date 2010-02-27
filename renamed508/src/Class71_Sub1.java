/* Class71_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.math.BigInteger;

final class Class71_Sub1 extends Class71
{
    static int anInt3252;
    static BigInteger RSA_DECRYPT_KEY = (new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579"));
    static int anInt3254;
    static int anInt3255;
    static int anInt3256;
    static int[] anIntArray3257;
    static MutableString aClass100_3258 = Class112.makeMutableString(43, "<col=ff0000>");
    static MutableString[] menuActions = new MutableString[500];

    public static void method1343(boolean bool)
    {
        aClass100_3258 = null;
        if (bool == false)
        {
            RSA_DECRYPT_KEY = null;
            menuActions = null;
            anIntArray3257 = null;
        }
    }

    static final int method1344(byte i)
    {
        anInt3256++;
        int i_0_ = -121 / ((i + 31) / 48);
        return 0;
    }

    static final void method1345(int i, Component component)
    {
        try
        {
            if (i <= -7)
            {
                anInt3252++;
                component.removeKeyListener(Class66.keyboard);
                component.removeFocusListener(Class66.keyboard);
                Class33.anInt576 = -1;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("tj.H(" + i + ',' + (component != null ? "{...}" : "null") + ')'));
        }
    }

    static final Class68_Sub20_Sub9 method1346(byte i)
    {
        anInt3254++;
        Class68_Sub20_Sub9 class68_sub20_sub9 = (Class68_Sub20_Sub9) Class30.aClass128_550.method1790(1742);
        if (class68_sub20_sub9 != null)
        {
            class68_sub20_sub9.unlink();
            class68_sub20_sub9.unlinkSub();
            return class68_sub20_sub9;
        }
        if (i != 37)
            RSA_DECRYPT_KEY = null;
        do
        {
            class68_sub20_sub9 = ((Class68_Sub20_Sub9) Class13_Sub3.aClass128_2664.method1790(i + 1705));
            if (class68_sub20_sub9 == null)
                return null;
            if (class68_sub20_sub9.method1098(i + 218) > Class36.method438(17161))
                return null;
            class68_sub20_sub9.unlink();
            class68_sub20_sub9.unlinkSub();
        } while ((((NodeSub) class68_sub20_sub9).nodeSubID & ~0x7fffffffffffffffL) == 0L);
        return class68_sub20_sub9;
    }
}
