/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class23
{
    int anInt489;
    static byte[][] aByteArrayArray490;
    static int anInt491;
    int anInt492;
    int anInt493;
    static int anInt494;
    int anInt495 = -1;
    int anInt496;
    int anInt497;
    static int[] anIntArray498 = { 1, 2, 4, 8 };
    int anInt499;
    static int anInt500;
    static boolean aBoolean501 = true;
    int anInt502;
    int anInt503;

    static final int method376(int i, boolean bool)
    {
        anInt500++;
        if (bool != false)
            anIntArray498 = null;
        return 0xff & i;
    }

    static final void method377(int i, int i_0_, int i_1_, int i_2_, Animable class1, Animable class1_3_, int i_4_, int i_5_, int i_6_, int i_7_, long l)
    {
        if (class1 != null)
        {
            Object2 class76 = new Object2();
            ((Object2) class76).uid = l;
            ((Object2) class76).anInt1349 = i_0_ * 128 + 64;
            ((Object2) class76).anInt1352 = i_1_ * 128 + 64;
            ((Object2) class76).anInt1361 = i_2_;
            ((Object2) class76).aClass1_1358 = class1;
            ((Object2) class76).aClass1_1360 = class1_3_;
            ((Object2) class76).anInt1362 = i_4_;
            ((Object2) class76).anInt1359 = i_5_;
            ((Object2) class76).anInt1356 = i_6_;
            ((Object2) class76).anInt1363 = i_7_;
            for (int i_8_ = i; i_8_ >= 0; i_8_--)
            {
                if (Class22.groundArray[i_8_][i_0_][i_1_] == null)
                    Class22.groundArray[i_8_][i_0_][i_1_] = new Ground(i_8_, i_0_, i_1_);
            }
            ((Ground) (Class22.groundArray[i][i_0_][i_1_])).object_2 = class76;
        }
    }

    public static void method378(int i)
    {
        if (i != 8)
            aBoolean501 = false;
        anIntArray498 = null;
        aByteArrayArray490 = null;
    }

    static final MutableString method379(int i, String string)
    {
        try
        {
            byte[] is;
            try
            {
                is = string.getBytes("ISO-8859-1");
            } catch (java.io.UnsupportedEncodingException unsupportedencodingexception)
            {
                is = string.getBytes();
            }
            MutableString class100 = new MutableString();
            ((MutableString) class100).data = is;
            if (i != 25732)
                anIntArray498 = null;
            ((MutableString) class100).length = 0;
            anInt494++;
            for (int i_9_ = 0; is.length > i_9_; i_9_++)
            {
                if (is[i_9_] != 0)
                    is[((MutableString) class100).length++] = is[i_9_];
            }
            return class100;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("d.B(" + i + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    public Class23()
    {
        /* empty */
    }
}
