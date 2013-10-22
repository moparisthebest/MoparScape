/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class17
{
    static int anInt279;
    static int anInt280;
    static int anInt281;
    static int anInt282;
    static int[] anIntArray283;
    static boolean aBoolean284 = true;
    static int anInt285;

    public static void method295(int i)
    {
        anIntArray283 = null;
        if (i != 1)
            method297(-128, -96, 87, -108, -32, -125);
    }

    static final void method296(int i, byte i_0_)
    {
        if (i_0_ >= -66)
            aBoolean284 = true;
        anInt282++;
        if (i != GameException.anInt2233)
        {
            if (GameException.anInt2233 == 0)
                Class68_Sub20_Sub2.method1044((byte) -79);
            if (i == 40)
                NodeList.method283(Class68_Sub28_Sub2.password, 104, Class68_Sub28_Sub2.username, Class68_Sub13_Sub5.anInt3520);
            boolean bool = i == 5 || i == 10 || i == 28;
            if (i != 40 && Class106.aClass61_1800 != null)
            {
                Class106.aClass61_1800.method594(-23);
                Class106.aClass61_1800 = null;
            }
            if (i == 25 || i == 28)
            {
                Class68_Sub13_Sub19.anInt3750 = 0;
                Class68_Sub13_Sub11.anInt3604 = 1;
                Class50_Sub2.anInt2747 = 1;
                Class21.anInt480 = 0;
                Widget.anInt925 = 0;
                Class68_Sub13_Sub34.method875((byte) 108);
            }
            if (i == 5)
                Class75.method1386(-10509, Class52.aClass21_Sub1_1011);
            else
                Class13_Sub1.method253(20);
            boolean bool_1_ = (GameException.anInt2233 == 5 || GameException.anInt2233 == 10 || GameException.anInt2233 == 28);
            if (!bool_1_ != !bool)
            {
                if (bool)
                {
                    Class101.anInt1747 = Class68_Sub13_Sub15.anInt3683;
                    if (Class68_Sub13_Sub25.anInt3857 != 0)
                        Class111.method1668(false, 0, 2, Class68_Sub13_Sub15.anInt3683, Class21.aClass21_Sub1_459, false, 255);
                    else
                        Class68_Sub13.method692(2, (byte) 125);
                    Class50.method530(false, false);
                } else
                {
                    Class68_Sub13.method692(2, (byte) 127);
                    Class50.method530(true, false);
                }
            }
            GameException.anInt2233 = i;
        }
    }

    static final void method297(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_)
    {
        anInt285++;
        Class34.method416(i_4_, (byte) -17, i_2_, Class68_Sub22.anIntArrayArray3134[i_3_++], i);
        Class34.method416(i_4_, (byte) -17, i_2_, Class68_Sub22.anIntArrayArray3134[i_5_--], i);
        for (int i_7_ = i_3_; i_7_ <= i_5_; i_7_++)
        {
            int[] is = Class68_Sub22.anIntArrayArray3134[i_7_];
            is[i_4_] = is[i] = i_2_;
        }
        if (i_6_ < 12)
            anIntArray283 = null;
    }

    static final void method298(int i, byte i_8_, int i_9_, MutableString class100, int i_10_)
    {
        do
        {
            try
            {
                Widget class45 = Class66.method637(i, false, i_10_);
                anInt281++;
                if (class45 != null)
                {
                    if (((Widget) class45).anObjectArray856 != null)
                    {
                        ScriptParameters class68_sub29 = new ScriptParameters();
                        ((ScriptParameters) class68_sub29).eventOperationBase = class100;
                        ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                        ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray856;
                        ((ScriptParameters) class68_sub29).anInt3248 = i_9_;
                        Class68_Sub13_Sub16.method776(class68_sub29, 16);
                    }
                    boolean bool = true;
                    if (((Widget) class45).anInt808 > 0)
                        bool = Class54.method554(class45, 29905);
                    if (i_8_ <= 38)
                        method297(21, 24, -15, -70, -12, 109);
                    if (bool && (Class68_Sub13_Sub20.method803(i_9_ - 1, client.method41(class45), -32276)))
                    {
                        if (i_9_ == 1)
                        {
                            Class103.anInt1774++;
                            Class21.connectionVector.startPacket(233);
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 2)
                        {
                            Class71_Sub1.anInt3255++;
                            Class21.connectionVector.startPacket(21);
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 3)
                        {
                            Class102.anInt1752++;
                            Class21.connectionVector.startPacket(169);
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 4)
                        {
                            Class21.connectionVector.startPacket(214);
                            CipheredByteVector.anInt4113++;
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 5)
                        {
                            Object4.anInt1079++;
                            Class21.connectionVector.startPacket(173);
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 6)
                        {
                            Class68_Sub13_Sub6.anInt3529++;
                            Class21.connectionVector.startPacket(232);
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 7)
                        {
                            Class75_Sub3_Sub1.anInt4602++;
                            Class21.connectionVector.startPacket(133);
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 8)
                        {
                            Class21.connectionVector.startPacket(102);
                            Class68_Sub13_Sub34.anInt4013++;
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ == 9)
                        {
                            Class21.connectionVector.startPacket(226);
                            Class72_Sub1.anInt3284++;
                            Class21.connectionVector.writeDWord(i);
                            Class21.connectionVector.writeShort(i_10_);
                        }
                        if (i_9_ != 10)
                            break;
                        Class29.anInt534++;
                        Class21.connectionVector.startPacket(90);
                        Class21.connectionVector.writeDWord(i);
                        Class21.connectionVector.writeShort(i_10_);
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ca.A(" + i + ',' + i_8_ + ',' + i_9_ + ',' + (class100 != null ? "{...}" : "null") + ',' + i_10_ + ')'));
            }
            break;
        } while (false);
    }

    static
    {
        anInt279 = -1;
    }
}
