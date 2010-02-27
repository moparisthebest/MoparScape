/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class36
{
    static MutableString aClass100_639 = Class112.makeMutableString(43, ")1p");
    static boolean aBoolean640 = false;
    static int anInt641;
    static int anInt642;
    static int baseX;
    static long aLong644 = 0L;
    static int anInt645;

    static final synchronized long method438(int i)
    {
        if (i != 17161)
            return -108L;
        anInt645++;
        long l = System.currentTimeMillis();
        if (l < GameSocket.aLong1143)
            Class21.aLong476 += -l + GameSocket.aLong1143;
        GameSocket.aLong1143 = l;
        return l + Class21.aLong476;
    }

    public static void method439(byte i)
    {
        if (i < 8)
            aLong644 = -105L;
        aClass100_639 = null;
    }

    static
    {
        anInt642 = 0;
    }
}
