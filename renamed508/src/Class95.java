/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class95
{
    static int anInt1681;
    static Stream aClass68_Sub14_1682;
    static int anInt1683;
    static int anInt1684;
    static int[] anIntArray1685 = new int[1000];
    static int destinationX = 0;
    private int anInt1687;
    static int anInt1688;
    static int anInt1689;
    private int[][] anIntArrayArray1690;
    static int anInt1691;
    private int anInt1692;
    static MutableString aClass100_1693 = Class112.makeMutableString(43, "0(U");
    static int anInt1694;

    public static void method1551(int i)
    {
        aClass100_1693 = null;
        aClass68_Sub14_1682 = null;
        if (i != -26412)
            aClass100_1693 = null;
        anIntArray1685 = null;
    }

    final byte[] method1552(byte i, byte[] is)
    {
        try
        {
            if (anIntArrayArray1690 != null)
            {
                int i_0_ = ((int) ((long) is.length * (long) anInt1687 / (long) anInt1692) + 14);
                int[] is_1_ = new int[i_0_];
                int i_2_ = 0;
                int i_3_ = 0;
                for (int i_4_ = 0; is.length > i_4_; i_4_++)
                {
                    int i_5_ = is[i_4_];
                    int[] is_6_ = anIntArrayArray1690[i_2_];
                    for (int i_7_ = 0; i_7_ < 14; i_7_++)
                        is_1_[i_7_ + i_3_] += is_6_[i_7_] * i_5_;
                    i_2_ += anInt1687;
                    int i_8_ = i_2_ / anInt1692;
                    i_2_ -= anInt1692 * i_8_;
                    i_3_ += i_8_;
                }
                is = new byte[i_0_];
                for (int i_9_ = 0; i_0_ > i_9_; i_9_++)
                {
                    int i_10_ = is_1_[i_9_] + 32768 >> 16;
                    if (i_10_ < -128)
                        is[i_9_] = (byte) -128;
                    else if (i_10_ <= 127)
                        is[i_9_] = (byte) i_10_;
                    else
                        is[i_9_] = (byte) 127;
                }
            }
            anInt1691++;
            if (i >= -118)
                method1558(-122, (byte) -69);
            return is;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ph.A(" + i + ',' + (is != null ? "{...}" : "null") + ')');
        }
    }

    final int method1553(int i, int i_11_)
    {
        if (anIntArrayArray1690 != null)
            i = (int) ((long) anInt1687 * (long) i / (long) anInt1692);
        if (i_11_ > -75)
            method1558(98, (byte) 124);
        anInt1684++;
        return i;
    }

    static final Widget method1554(Widget class45, byte i)
    {
        try
        {
            anInt1681++;
            Widget class45_12_ = client.method36(class45);
            if (class45_12_ == null)
                class45_12_ = ((Widget) class45).aClass45_893;
            if (i != 3)
                return null;
            return class45_12_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ph.F(" + (class45 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final void method1555(Object5 class69)
    {
        for (int i = ((Object5) class69).anInt1254; i <= ((Object5) class69).anInt1238; i++)
        {
            for (int i_13_ = ((Object5) class69).anInt1253; i_13_ <= ((Object5) class69).anInt1234; i_13_++)
            {
                Ground class68_sub1 = (Class22.groundArray[((Object5) class69).anInt1249][i][i_13_]);
                if (class68_sub1 != null)
                {
                    for (int i_14_ = 0; i_14_ < ((Ground) class68_sub1).anInt2773; i_14_++)
                    {
                        if ((((Ground) class68_sub1).object_5[i_14_]) == class69)
                        {
                            ((Ground) class68_sub1).anInt2773--;
                            for (int i_15_ = i_14_; (i_15_ < ((Ground) class68_sub1).anInt2773); i_15_++)
                            {
                                ((Ground) class68_sub1).object_5[i_15_] = (((Ground) class68_sub1).object_5[i_15_ + 1]);
                                ((Ground) class68_sub1).modifiers[i_15_] = (((Ground) class68_sub1).modifiers[i_15_ + 1]);
                            }
                            ((Ground) class68_sub1).object_5[((Ground) class68_sub1).anInt2773] = null;
                            break;
                        }
                    }
                    ((Ground) class68_sub1).anInt2770 = 0;
                    for (int i_16_ = 0; i_16_ < ((Ground) class68_sub1).anInt2773; i_16_++)
                        ((Ground) class68_sub1).anInt2770 |= (((Ground) class68_sub1).modifiers[i_16_]);
                }
            }
        }
    }

    Class95(int i, int i_17_)
    {
        if (i_17_ != i)
        {
            int i_18_ = ObjectDefinition.method1714(i_17_, (byte) -124, i);
            i_17_ /= i_18_;
            anInt1687 = i_17_;
            i /= i_18_;
            anIntArrayArray1690 = new int[i][14];
            anInt1692 = i;
            for (int i_19_ = 0; i > i_19_; i_19_++)
            {
                double d = (double) i_19_ / (double) i + 6.0;
                int[] is = anIntArrayArray1690[i_19_];
                int i_20_ = (int) Math.floor(d - 7.0 + 1.0);
                if (i_20_ < 0)
                    i_20_ = 0;
                double d_21_ = (double) i_17_ / (double) i;
                int i_22_ = (int) Math.ceil(d + 7.0);
                if (i_22_ > 14)
                    i_22_ = 14;
                for (/**/; i_22_ > i_20_; i_20_++)
                {
                    double d_23_ = d_21_;
                    double d_24_ = (-d + (double) i_20_) * 3.141592653589793;
                    if (d_24_ < -1.0E-4 || d_24_ > 1.0E-4)
                        d_23_ *= Math.sin(d_24_) / d_24_;
                    d_23_ *= 0.46 * Math.cos(((double) i_20_ - d) * 0.2243994752564138) + 0.54;
                    is[i_20_] = (int) Math.floor(65536.0 * d_23_ + 0.5);
                }
            }
        }
    }

    static final void method1556(int i, int i_25_, int i_26_, int i_27_, Character class1_sub6, int i_28_, int i_29_)
    {
        do
        {
            try
            {
                Class67.method641(i_25_, i_26_, i_28_, ((Character) class1_sub6).y, i_29_, i_27_, ((Character) class1_sub6).x, (byte) -127);
                anInt1689++;
                if (i >= 16)
                    break;
                method1554(null, (byte) 64);
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("ph.E(" + i + ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + (class1_sub6 != null ? "{...}" : "null") + ',' + i_28_ + ',' + i_29_ + ')'));
            }
            break;
        } while (false);
    }

    static final void updateLocalPlayers()
    {
        Class75_Sub3_Sub1.removeEntityCount = 0;
        Class68_Sub20_Sub16.updateBlockCount = 0;
        Class68_Sub20_Sub6.parseLocalPlayerUpdateHeader();
        Class68_Sub13_Sub11.updateLocalPlayersMovement();
        Class68_Sub13_Sub20.updateLocalPlayersPositions();
        NodeList.parseLocalPlayersUpdateFlags();
        for (int idx = 0; Class75_Sub3_Sub1.removeEntityCount > idx; idx++)
        {
            int i_31_ = Class68_Sub13_Sub14.removeEntityIndices[idx];
            if (Class68_Sub13_Sub4.localPlayers[i_31_].lastUpdate != Class68_Sub3.loopCycle)
            {
                if (Class68_Sub13_Sub4.localPlayers[i_31_].anInt3429 > 0)
                    NodeCache.method1687(-1, (Class68_Sub13_Sub4.localPlayers[i_31_]));
                Class68_Sub13_Sub4.localPlayers[i_31_] = null;
            }
        }
        if ((Class68_Sub13_Sub8.connectionVector.position) != Class106.packetSize)
            throw new RuntimeException("gpp1 pos:" + Class68_Sub13_Sub8.connectionVector.position + " psize:" + Class106.packetSize);
        for (int idx = 0; idx < client.localPlayerCount; idx++)
        {
            if ((Class68_Sub13_Sub4.localPlayers[Class85.localPlayerIndices[idx]]) == null)
                throw new RuntimeException("gpp2 pos:" + idx + " size:" + client.localPlayerCount);
        }
    }

    final int method1558(int i, byte i_33_)
    {
        if (i_33_ != 127)
            return -26;
        if (anIntArrayArray1690 != null)
            i = (int) ((long) anInt1687 * (long) i / (long) anInt1692) + 6;
        anInt1694++;
        return i;
    }

    static
    {
        aClass68_Sub14_1682 = new Stream(new byte[5000]);
    }
}
