/* Class68_Sub20_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub20_Sub12 extends NodeSub
{
    static int anInt4345;
    MutableString aClass100_4346;
    int anInt4347;
    static int anInt4348;
    static int anInt4349;
    static MRUNodes objectDefinitionNodes = new MRUNodes(64);
    static int anInt4351;
    private int anInt4352;
    static int anInt4353;
    static int anInt4354 = 0;
    static int[][][] intGroundArray;
    static int anInt4356;
    static int anInt4357;

    static final void method1150(int i, int i_0_)
    {
        if (i != 9)
            method1152(false);
        anInt4348++;
        Class68_Sub13_Sub27.aClass98_3895.method1570(-18767, i_0_);
        ClientScript.aClass98_4374.method1570(-18767, i_0_);
    }

    static final boolean method1151(int i, int i_1_, int i_2_, int i_3_, int i_4_)
    {
        int i_5_ = i_3_ * NodeSubList.anInt2222 + i * NodeList.anInt278 >> 16;
        int i_6_ = i_3_ * NodeList.anInt278 - i * NodeSubList.anInt2222 >> 16;
        int i_7_ = i_1_ * Class13_Sub2.anInt2653 + i_6_ * Class66.anInt1205 >> 16;
        int i_8_ = i_1_ * Class66.anInt1205 - i_6_ * Class13_Sub2.anInt2653 >> 16;
        if (i_7_ < 1)
            i_7_ = 1;
        int i_9_ = (i_5_ << 9) / i_7_;
        int i_10_ = (i_8_ << 9) / i_7_;
        int i_11_ = i_2_ * Class13_Sub2.anInt2653 + i_6_ * Class66.anInt1205 >> 16;
        int i_12_ = i_2_ * Class66.anInt1205 - i_6_ * Class13_Sub2.anInt2653 >> 16;
        if (i_11_ < 1)
            i_11_ = 1;
        int i_13_ = (i_5_ << 9) / i_11_;
        int i_14_ = (i_12_ << 9) / i_11_;
        if (i_7_ < 50 && i_11_ < 50)
            return false;
        if (i_7_ > i_4_ && i_11_ > i_4_)
            return false;
        if (i_9_ < NPCDefinition.anInt1429 && i_13_ < NPCDefinition.anInt1429)
            return false;
        if (i_9_ > Class111.anInt1877 && i_13_ > Class111.anInt1877)
            return false;
        if (i_10_ < Animable.anInt63 && i_14_ < Animable.anInt63)
            return false;
        if (i_10_ > Class68_Sub13_Sub38.anInt4081 && i_14_ > Class68_Sub13_Sub38.anInt4081)
            return false;
        return true;
    }

    public static void method1152(boolean bool)
    {
        if (bool != true)
            method1151(29, 48, -43, -20, -24);
        objectDefinitionNodes = null;
        intGroundArray = null;
    }

    private final void method1153(Stream class68_sub14, int i, int i_15_)
    {
        try
        {
            if (i != 5)
                method1155(29);
            if (i_15_ == 1)
                anInt4352 = class68_sub14.readUByte();
            else if (i_15_ != 2)
            {
                if (i_15_ == 5)
                    ((Class68_Sub20_Sub12) this).aClass100_4346 = class68_sub14.readString();
            } else
                ((Class68_Sub20_Sub12) this).anInt4347 = class68_sub14.readInteger();
            anInt4345++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("mi.A(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_15_ + ')'));
        }
    }

    static final void method1154(Character class1_sub6, int i)
    {
        do
        {
            try
            {
                ((Character) class1_sub6).aBoolean2585 = false;
                if (((Character) class1_sub6).anInt2526 != -1)
                {
                    Animation class117 = Object1.getAnimation((((Character) class1_sub6).anInt2526));
                    if (class117 == null || ((Animation) class117).anIntArray2037 == null)
                        ((Character) class1_sub6).anInt2526 = -1;
                    else
                    {
                        ((Character) class1_sub6).anInt2579++;
                        if ((((Character) class1_sub6).anInt2557 < ((Animation) class117).anIntArray2037.length) && ((((Animation) class117).anIntArray2060[((Character) class1_sub6).anInt2557]) < ((Character) class1_sub6).anInt2579))
                        {
                            ((Character) class1_sub6).anInt2579 = 1;
                            ((Character) class1_sub6).anInt2557++;
                            Class44.method489(false, ((Character) class1_sub6).anInt2557, ((Character) class1_sub6).x, class117, (Class68_Sub7.localPlayer == class1_sub6), ((Character) class1_sub6).y);
                        }
                        if (((Character) class1_sub6).anInt2557 >= ((Animation) class117).anIntArray2037.length)
                        {
                            ((Character) class1_sub6).anInt2557 = 0;
                            ((Character) class1_sub6).anInt2579 = 0;
                            Class44.method489(false, ((Character) class1_sub6).anInt2557, ((Character) class1_sub6).x, class117, (Class68_Sub7.localPlayer == class1_sub6), ((Character) class1_sub6).y);
                        }
                    }
                }
                if (((Character) class1_sub6).anInt2554 != -1 && (((Character) class1_sub6).anInt2543 <= Class68_Sub3.loopCycle))
                {
                    if (((Character) class1_sub6).anInt2580 < 0)
                        ((Character) class1_sub6).anInt2580 = 0;
                    int i_16_ = ((Class70) Class68_Sub20_Sub13.method1160((((Character) class1_sub6).anInt2554), 1)).anInt1282;
                    if (i_16_ != -1)
                    {
                        Animation class117 = Object1.getAnimation(i_16_);
                        if (class117 != null && ((Animation) class117).anIntArray2037 != null)
                        {
                            ((Character) class1_sub6).anInt2588++;
                            if ((((Character) class1_sub6).anInt2580 < ((Animation) class117).anIntArray2037.length) && ((((Animation) class117).anIntArray2060[((Character) class1_sub6).anInt2580]) < ((Character) class1_sub6).anInt2588))
                            {
                                ((Character) class1_sub6).anInt2588 = 1;
                                ((Character) class1_sub6).anInt2580++;
                                Class44.method489(false, ((Character) class1_sub6).anInt2580, ((Character) class1_sub6).x, class117, (class1_sub6 == Class68_Sub7.localPlayer), ((Character) class1_sub6).y);
                            }
                            if (((Animation) class117).anIntArray2037.length <= ((Character) class1_sub6).anInt2580)
                                ((Character) class1_sub6).anInt2554 = -1;
                        } else
                            ((Character) class1_sub6).anInt2554 = -1;
                    } else
                        ((Character) class1_sub6).anInt2554 = -1;
                }
                anInt4349++;
                if (i != 1)
                    anInt4354 = -38;
                if (((Character) class1_sub6).animationID != -1 && ((Character) class1_sub6).anInt2547 <= 1)
                {
                    Animation class117 = Object1.getAnimation((((Character) class1_sub6).animationID));
                    if (((Animation) class117).anInt2045 == 1 && ((Character) class1_sub6).anInt2559 > 0 && (Class68_Sub3.loopCycle >= ((Character) class1_sub6).anInt2552) && (Class68_Sub3.loopCycle > ((Character) class1_sub6).anInt2523))
                    {
                        ((Character) class1_sub6).anInt2547 = 1;
                        break;
                    }
                }
                if (((Character) class1_sub6).animationID != -1 && ((Character) class1_sub6).anInt2547 == 0)
                {
                    Animation class117 = Object1.getAnimation((((Character) class1_sub6).animationID));
                    if (class117 != null && ((Animation) class117).anIntArray2037 != null)
                    {
                        ((Character) class1_sub6).anInt2558++;
                        if ((((Character) class1_sub6).anInt2524 < ((Animation) class117).anIntArray2037.length) && ((((Animation) class117).anIntArray2060[((Character) class1_sub6).anInt2524]) < ((Character) class1_sub6).anInt2558))
                        {
                            ((Character) class1_sub6).anInt2558 = 1;
                            ((Character) class1_sub6).anInt2524++;
                            Class44.method489(false, ((Character) class1_sub6).anInt2524, ((Character) class1_sub6).x, class117, (class1_sub6 == Class68_Sub7.localPlayer), ((Character) class1_sub6).y);
                        }
                        if (((Character) class1_sub6).anInt2524 >= ((Animation) class117).anIntArray2037.length)
                        {
                            ((Character) class1_sub6).anInt2524 -= ((Animation) class117).anInt2074;
                            ((Character) class1_sub6).anInt2551++;
                            if (((Character) class1_sub6).anInt2551 >= ((Animation) class117).anInt2039)
                                ((Character) class1_sub6).animationID = -1;
                            else if (((Character) class1_sub6).anInt2524 >= 0 && ((((Animation) class117).anIntArray2037).length > (((Character) class1_sub6).anInt2524)))
                                Class44.method489(false, ((Character) class1_sub6).anInt2524, ((Character) class1_sub6).x, class117, (Class68_Sub7.localPlayer == class1_sub6), ((Character) class1_sub6).y);
                            else
                                ((Character) class1_sub6).animationID = -1;
                        }
                        ((Character) class1_sub6).aBoolean2585 = ((Animation) class117).aBoolean2056;
                    } else
                        ((Character) class1_sub6).animationID = -1;
                }
                if (((Character) class1_sub6).anInt2547 <= 0)
                    break;
                ((Character) class1_sub6).anInt2547--;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("mi.B(" + (class1_sub6 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    final boolean method1155(int i)
    {
        anInt4353++;
        if (i != 115)
            method1151(-88, -16, 25, 34, 28);
        if (anInt4352 != 115)
            return false;
        return true;
    }

    final void method1156(int i, Stream class68_sub14)
    {
        try
        {
            if (i != 1)
                anInt4354 = 122;
            anInt4351++;
            for (;;)
            {
                int i_17_ = class68_sub14.readUByte();
                if (i_17_ == 0)
                    break;
                method1153(class68_sub14, i ^ 0x4, i_17_);
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("mi.G(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    public Class68_Sub20_Sub12()
    {
        /* empty */
    }
}
