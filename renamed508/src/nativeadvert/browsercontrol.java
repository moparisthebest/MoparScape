/* browsercontrol - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package nativeadvert;

public class browsercontrol
{
    private static boolean aBoolean1387;
    private static boolean aBoolean1388;

    public static boolean method1410(String string)
    {
        if (aBoolean1387)
            throw new IllegalStateException();
        if (aBoolean1388)
            return false;
        boolean bool = browsercontrol0(string);
        if (bool)
            aBoolean1387 = true;
        else
            aBoolean1388 = true;
        return bool;
    }

    public static boolean method1411()
    {
        return aBoolean1387;
    }

    public static void method1412(int i, int i_0_, int i_1_, int i_2_)
    {
        if (!aBoolean1387)
            throw new IllegalStateException();
        setposition0(i, i_0_, i_1_, i_2_);
    }

    public static void method1413()
    {
        if (!aBoolean1387)
            throw new IllegalStateException();
        detach0();
    }

    public static void method1414(String string)
    {
        if (!aBoolean1387)
            throw new IllegalStateException();
        navigate0(string);
    }

    public static void method1415()
    {
        if (!aBoolean1387)
            throw new IllegalStateException();
        destroy0();
        aBoolean1387 = false;
    }

    private static native boolean browsercontrol0(String string);

    private static native void setposition0(int i, int i_3_, int i_4_, int i_5_);

    private static native void navigate0(String string);

    private static native void destroy0();

    private static native void detach0();
}
