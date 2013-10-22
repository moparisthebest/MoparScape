/* Class68_Sub20_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class68_Sub20_Sub13 extends NodeSub
{
    static int anInt4358;
    static int anInt4359;
    static int anInt4360;
    static MRUNodes aClass98_4361;
    static int anInt4362;
    static int anInt4363;
    static int anInt4364;
    static int anInt4365 = 0;
    static Class50 aClass50_4366;
    static volatile int mouseY;
    static NodeCache aClass113_4368;
    static int[] anIntArray4369;
    static int anInt4370;

    static final void method1157(byte i, long l)
    {
        anInt4363++;
        if (l != 0L)
        {
            if (Class32.friendCount >= 100 && Class26.anInt519 != 1 || Class32.friendCount >= 200)
                Class48.method520(Class68_Sub28_Sub2.aClass100_4558, -74, Class68_Sub13_Sub21.aClass100_3797, 0);
            else
            {
                MutableString class100 = Class56.method570(l, -1).method1603(12688);
                for (int i_0_ = 0; i_0_ < Class32.friendCount; i_0_++)
                {
                    if (l == Class68_Sub13_Sub21.friendList[i_0_])
                    {
                        Class48.method520(Class68_Sub28_Sub2.aClass100_4558, 127, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100, Class50.aClass100_985 }))), 0);
                        return;
                    }
                }
                for (int i_1_ = 0; i_1_ < Class68_Sub13_Sub26.anInt3882; i_1_++)
                {
                    if (Class21_Sub1.aLongArray2705[i_1_] == l)
                    {
                        Class48.method520(Class68_Sub28_Sub2.aClass100_4558, 126, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (ClientScript.aClass100_4389), class100, Class75.aClass100_1341 }))), 0);
                        return;
                    }
                }
                if (class100.equalTo((((Player) Class68_Sub7.localPlayer).name)))
                    Class48.method520(Class68_Sub28_Sub2.aClass100_4558, -89, Class68_Sub8.aClass100_2868, 0);
                else
                {
                    Class68_Sub13_Sub38.aClass100Array4086[Class32.friendCount] = class100;
                    Class68_Sub20_Sub10.anInt4312++;
                    Class68_Sub13_Sub21.friendList[Class32.friendCount] = l;
                    MRUNodes.friendNodeIDs[Class32.friendCount] = 0;
                    Ground.aClass100Array2756[Class32.friendCount] = Class68_Sub28_Sub2.aClass100_4558;
                    Class68_Sub4.anIntArray2830[Class32.friendCount] = 0;
                    Class68_Sub13_Sub29.aBooleanArray3943[Class32.friendCount] = false;
                    Class32.friendCount++;
                    Keyboard.anInt2132 = Class68_Sub22.anInt3150;
                    if (i > 89)
                    {
                        Class21.connectionVector.startPacket(30);
                        Class21.connectionVector.writeLong(l);
                    }
                }
            }
        }
    }

    static final void method1158(int i, int i_2_, int i_3_, int i_4_, boolean bool)
    {
        anInt4364++;
        if (bool != true)
            aClass98_4361 = null;
        if (i_4_ - i_3_ < GroundData.anInt677 || i_4_ + i_3_ > NodeCache.anInt1920 || i_2_ - i_3_ < Class35.anInt605 || Class51.anInt2257 < i_3_ + i_2_)
            Class68_Sub13_Sub18.method786((byte) 83, i, i_4_, i_3_, i_2_);
        else
            Class68_Sub20_Sub10.method1111(i, bool, i_3_, i_4_, i_2_);
    }

    static final void method1159(int i, Widget class45, int i_5_, int i_6_)
    {
        do
        {
            try
            {
                anInt4358++;
                if (i_6_ != -1198502738)
                    anIntArray4369 = null;
                if (((Widget) class45).aByte904 != 0)
                {
                    if (((Widget) class45).aByte904 != 1)
                    {
                        if (((Widget) class45).aByte904 == 2)
                            ((Widget) class45).x = (i_5_ - ((Widget) class45).anInt892 - ((Widget) class45).anInt810);
                        else if (((Widget) class45).aByte904 == 3)
                            ((Widget) class45).x = ((Widget) class45).anInt810 * i_5_ >> 14;
                        else if (((Widget) class45).aByte904 != 4)
                            ((Widget) class45).x = (i_5_ - ((Widget) class45).anInt892 - (((Widget) class45).anInt810 * i_5_ >> 14));
                        else
                            ((Widget) class45).x = ((i_5_ - ((Widget) class45).anInt892) / 2 + (((Widget) class45).anInt810 * i_5_ >> 14));
                    } else
                        ((Widget) class45).x = (((Widget) class45).anInt810 + (i_5_ - ((Widget) class45).anInt892) / 2);
                } else
                    ((Widget) class45).x = ((Widget) class45).anInt810;
                if (((Widget) class45).aByte820 == 0)
                    ((Widget) class45).y = ((Widget) class45).anInt914;
                else if (((Widget) class45).aByte820 != 1)
                {
                    if (((Widget) class45).aByte820 == 2)
                        ((Widget) class45).y = (i - ((Widget) class45).anInt873 - ((Widget) class45).anInt914);
                    else if (((Widget) class45).aByte820 != 3)
                    {
                        if (((Widget) class45).aByte820 != 4)
                            ((Widget) class45).y = (i - ((Widget) class45).anInt873 - (i * ((Widget) class45).anInt914 >> 14));
                        else
                            ((Widget) class45).y = ((i - ((Widget) class45).anInt873) / 2 + (((Widget) class45).anInt914 * i >> 14));
                    } else
                        ((Widget) class45).y = ((Widget) class45).anInt914 * i >> 14;
                } else
                    ((Widget) class45).y = (((Widget) class45).anInt914 + (i - ((Widget) class45).anInt873) / 2);
                if (!NodeSub.aBoolean3096)
                    break;
                if (client.method41(class45) != 0 || ((Widget) class45).type == 0)
                {
                    if (((Widget) class45).x < 0)
                        ((Widget) class45).x = 0;
                    else if ((((Widget) class45).x + ((Widget) class45).anInt892) > i_5_)
                        ((Widget) class45).x = i_5_ - ((Widget) class45).anInt892;
                    if (((Widget) class45).y >= 0)
                    {
                        if (i < (((Widget) class45).anInt873 + ((Widget) class45).y))
                            ((Widget) class45).y = i - ((Widget) class45).anInt873;
                    } else
                        ((Widget) class45).y = 0;
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("qj.C(" + i + ',' + (class45 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
            }
            break;
        } while (false);
    }

    static final Class70 method1160(int i, int i_7_)
    {
        anInt4359++;
        Class70 class70 = ((Class70) Class68_Sub13_Sub27.aClass98_3895.getNodeForID((long) i));
        if (class70 != null)
            return class70;
        byte[] is = (Class68_Sub13_Sub30.aClass21_3949.method338(Character.UNSIGN_BYTE(i), 0, Class68_Sub13_Sub19.method793(i_7_ ^ ~0x57, i)));
        class70 = new Class70();
        if (i_7_ != 1)
            anInt4365 = -10;
        ((Class70) class70).anInt1277 = i;
        if (is != null)
            class70.method1336(new Stream(is), -1);
        Class68_Sub13_Sub27.aClass98_3895.addObject(class70, (long) i);
        return class70;
    }

    abstract Object method1161(int i);

    public static void method1162(boolean bool)
    {
        aClass50_4366 = null;
        aClass113_4368 = null;
        if (bool == true)
        {
            aClass98_4361 = null;
            anIntArray4369 = null;
        }
    }

    abstract boolean method1163(int i);

    static
    {
        aClass98_4361 = new MRUNodes(64);
        mouseY = -1;
        aClass113_4368 = new NodeCache(32);
        anInt4370 = 0;
    }
}
