/* Class68_Sub13_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub20 extends Class68_Sub13
{
    private int anInt3762 = 0;
    private int anInt3763;
    static int anInt3764;
    static int anInt3765;
    private int anInt3766;
    static MRUNodes aClass98_3767 = new MRUNodes(30);
    private int anInt3768;
    static int anInt3769;
    static int anInt3770;
    private int anInt3771 = 0;
    private int anInt3772 = 0;
    private int anInt3773;
    static int anInt3774;
    static int anInt3775;
    static int anInt3776;
    private int anInt3777;
    static int anInt3778;
    private int anInt3779;
    static MRUNodes aClass98_3780 = new MRUNodes(20);
    static short[] aShortArray3781;
    static int anInt3782;
    static MutableString aClass100_3783 = Class112.makeMutableString(43, "Speicher wird zugewiesen)3");
    static MutableString aClass100_3784;
    static MutableString aClass100_3785;
    private static MutableString aClass100_3786;

    static final int method798(int i, int i_0_)
    {
        anInt3778++;
        if (i != 26151)
            method803(-53, 103, -43);
        int i_1_ = i_0_ * 6 - 61440;
        int i_2_ = (i_1_ * i_0_ >> 12) + 40960;
        int i_3_ = (i_0_ * i_0_ >> 12) * i_0_ >> 12;
        return i_3_ * i_2_ >> 12;
    }

    final void method700(Stream class68_sub14, int i, int i_4_)
    {
        try
        {
            int i_5_ = i;
            while_93_: do
            {
                do
                {
                    if (i_5_ != 0)
                    {
                        if (i_5_ != 1)
                        {
                            if (i_5_ == 2)
                                break;
                            break while_93_;
                        }
                    } else
                    {
                        anInt3772 = class68_sub14.readShort();
                        break while_93_;
                    }
                    anInt3762 = (class68_sub14.readByte() << 12) / 100;
                    break while_93_;
                } while (false);
                anInt3771 = (class68_sub14.readByte() << 12) / 100;
            } while (false);
            if (i_4_ != -1)
                method803(-91, -92, 95);
            anInt3776++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("m.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_4_ + ')'));
        }
    }

    final int[][] method697(int i, boolean bool)
    {
        anInt3774++;
        if (bool != true)
            return null;
        int[][] is = ((Class68_Sub13) this).aClass88_2941.method1502(i, (byte) 87);
        if (((Class88) ((Class68_Sub13) this).aClass88_2941).aBoolean1612)
        {
            int[][] is_6_ = this.method699(-40, 0, i);
            int[] is_7_ = is_6_[1];
            int[] is_8_ = is[0];
            int[] is_9_ = is_6_[2];
            int[] is_10_ = is[1];
            int[] is_11_ = is_6_[0];
            int[] is_12_ = is[2];
            for (int i_13_ = 0; Class68_Sub13_Sub19.anInt3748 > i_13_; i_13_++)
            {
                method800(is_7_[i_13_], is_9_[i_13_], is_11_[i_13_], false);
                anInt3768 += anInt3771;
                anInt3766 += anInt3772;
                if (anInt3768 < 0)
                    anInt3768 = 0;
                anInt3779 += anInt3762;
                if (anInt3768 > 4096)
                    anInt3768 = 4096;
                for (/**/; anInt3766 < 0; anInt3766 += 4096)
                {
                    /* empty */
                }
                if (anInt3779 < 0)
                    anInt3779 = 0;
                for (/**/; anInt3766 > 4096; anInt3766 -= 4096)
                {
                    /* empty */
                }
                if (anInt3779 > 4096)
                    anInt3779 = 4096;
                method804(anInt3768, false, anInt3766, anInt3779);
                is_8_[i_13_] = anInt3763;
                is_10_[i_13_] = anInt3777;
                is_12_[i_13_] = anInt3773;
            }
        }
        return is;
    }

    public Class68_Sub13_Sub20()
    {
        super(1, false);
    }

    static final void method799(byte i)
    {
        if (NodeList.anInt275 < 128)
            NodeList.anInt275 = 128;
        if (NodeList.anInt275 > 383)
            NodeList.anInt275 = 383;
        anInt3769++;
        Class8.minimapInt2 &= 0x7ff;
        int i_14_ = Class68_Sub20_Sub2.anInt4188 >> 7;
        int i_15_ = CachedItem.anInt4451 >> 7;
        int i_16_ = Player.fixZ(Class68_Sub20_Sub2.anInt4188, GameSocket.plane, CachedItem.anInt4451);
        int i_17_ = 0;
        if (i_14_ > 3 && i_15_ > 3 && i_14_ < 100 && i_15_ < 100)
        {
            for (int i_18_ = i_14_ - 4; i_18_ <= i_14_ + 4; i_18_++)
            {
                for (int i_19_ = i_15_ - 4; i_19_ <= i_15_ + 4; i_19_++)
                {
                    int i_20_ = GameSocket.plane;
                    if (i_20_ < 3 && (Object1.byteGroundArray[1][i_18_][i_19_] & 0x2) == 2)
                        i_20_++;
                    int i_21_ = i_16_ - (Class68_Sub20_Sub12.intGroundArray[i_20_][i_18_][i_19_]);
                    if (i_17_ < i_21_)
                        i_17_ = i_21_;
                }
            }
        }
        int i_22_ = 192 * i_17_;
        if (i <= -22)
        {
            if (i_22_ > 98048)
                i_22_ = 98048;
            if (i_22_ < 32768)
                i_22_ = 32768;
            if (i_22_ > ScriptParameters.anInt3235)
                ScriptParameters.anInt3235 += (i_22_ - ScriptParameters.anInt3235) / 24;
            else if (ScriptParameters.anInt3235 > i_22_)
                ScriptParameters.anInt3235 += (i_22_ - ScriptParameters.anInt3235) / 80;
        }
    }

    private final void method800(int i, int i_23_, int i_24_, boolean bool)
    {
        anInt3764++;
        int i_25_ = i_24_ < i ? i_24_ : i;
        int i_26_ = i_24_ <= i ? i : i_24_;
        i_26_ = i_23_ > i_26_ ? i_23_ : i_26_;
        i_25_ = i_25_ > i_23_ ? i_23_ : i_25_;
        anInt3768 = (i_26_ + i_25_) / 2;
        int i_27_ = i_26_ - i_25_;
        if (anInt3768 > 0 && anInt3768 < 4096)
            anInt3779 = (i_27_ << 12) / (anInt3768 <= 2048 ? anInt3768 * 2 : 8192 - 2 * anInt3768);
        else
            anInt3779 = 0;
        if (i_27_ > 0)
        {
            int i_28_ = (i_26_ - i_24_ << 12) / i_27_;
            int i_29_ = (i_26_ - i << 12) / i_27_;
            int i_30_ = (i_26_ - i_23_ << 12) / i_27_;
            if (i_26_ != i_24_)
            {
                if (i == i_26_)
                    anInt3766 = i_25_ != i_23_ ? 12288 - i_30_ : i_28_ + 4096;
                else
                    anInt3766 = i_25_ != i_24_ ? 20480 - i_28_ : i_29_ + 12288;
            } else
                anInt3766 = i_25_ != i ? 4096 - i_29_ : i_30_ + 20480;
            anInt3766 /= 6;
        } else
            anInt3766 = 0;
        if (bool != false)
            aClass100_3783 = null;
    }

    public static void method801(int i)
    {
        aClass100_3783 = null;
        aClass98_3767 = null;
        aShortArray3781 = null;
        aClass100_3785 = null;
        aClass100_3786 = null;
        aClass100_3784 = null;
        if (i != -22338)
            updateLocalPlayersPositions();
        aClass98_3780 = null;
    }

    static final void updateLocalPlayersPositions()
    {
        while (Class68_Sub13_Sub8.connectionVector.distanceToBitPosition(Class106.packetSize) >= 11)
        {
            int index = Class68_Sub13_Sub8.connectionVector.readBits(11);
            if (index == 2047)
                break;
            boolean bool = false;
            if (Class68_Sub13_Sub4.localPlayers[index] == null)
            {
                bool = true;
                Class68_Sub13_Sub4.localPlayers[index] = new Player();
                if (Ground.aClass68_Sub14Array2757[index] != null)
                    Class68_Sub13_Sub4.localPlayers[index].parseAppearance(Ground.aClass68_Sub14Array2757[index]);
            }
            Class85.localPlayerIndices[client.localPlayerCount++] = index;
            Player player = Class68_Sub13_Sub4.localPlayers[index];
            player.lastUpdate = Class68_Sub3.loopCycle;
            int x = Class68_Sub13_Sub8.connectionVector.readBits(5);
            int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
            if (has_ublock == 1)
                CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = index;
            int i_34_ = (Class68_Sub13_Sub9.anIntArray3580[Class68_Sub13_Sub8.connectionVector.readBits(3)]);
            if (x > 15)
                x -= 32;
            if (bool)
                ((Character) player).turnDirection = ((Character) player).anInt2550 = i_34_;
            int teleported = Class68_Sub13_Sub8.connectionVector.readBits(1);
            int y = Class68_Sub13_Sub8.connectionVector.readBits(5);
            if (y > 15)
                y -= 32;
            player.setPosition(Class68_Sub7.localPlayer.walkQueueY[0] + y, Class68_Sub7.localPlayer.walkQueueX[0] + x, teleported == 1);
        }
        Class68_Sub13_Sub8.connectionVector.byteAccess();
    }

    static final boolean method803(int i, int i_38_, int i_39_)
    {
        if (i_39_ != -32276)
            anInt3782 = 11;
        anInt3765++;
        if ((i_38_ >> i + 1 & 0x1) == 0)
            return false;
        return true;
    }

    private final void method804(int i, boolean bool, int i_40_, int i_41_)
    {
        if (bool != false)
            anInt3771 = -97;
        int i_42_ = (i > 2048 ? i_41_ - (i_41_ * i >> 12) + i : i * (i_41_ + 4096) >> 12);
        while_97_: do
        {
            if (i_42_ <= 0)
                anInt3763 = anInt3777 = anInt3773 = i;
            else
            {
                i_40_ *= 6;
                int i_43_ = i_40_ >> 12;
                int i_44_ = i - i_42_ + i;
                int i_45_ = i_42_;
                int i_46_ = (i_42_ - i_44_ << 12) / i_42_;
                int i_47_ = i_40_ - (i_43_ << 12);
                i_45_ = i_46_ * i_45_ >> 12;
                i_45_ = i_45_ * i_47_ >> 12;
                int i_48_ = i_45_ + i_44_;
                int i_49_ = i_42_ - i_45_;
                int i_50_ = i_43_;
                while_96_: do
                {
                    while_95_: do
                    {
                        while_94_: do
                        {
                            do
                            {
                                if (i_50_ != 0)
                                {
                                    if (i_50_ != 1)
                                    {
                                        if (i_50_ != 2)
                                        {
                                            if (i_50_ != 3)
                                            {
                                                if (i_50_ != 4)
                                                {
                                                    if (i_50_ != 5)
                                                        break while_97_;
                                                } else
                                                    break while_95_;
                                                break while_96_;
                                            }
                                        } else
                                            break;
                                        break while_94_;
                                    }
                                } else
                                {
                                    anInt3777 = i_48_;
                                    anInt3773 = i_44_;
                                    anInt3763 = i_42_;
                                    break while_97_;
                                }
                                anInt3773 = i_44_;
                                anInt3777 = i_42_;
                                anInt3763 = i_49_;
                                break while_97_;
                            } while (false);
                            anInt3773 = i_48_;
                            anInt3777 = i_42_;
                            anInt3763 = i_44_;
                            break while_97_;
                        } while (false);
                        anInt3763 = i_44_;
                        anInt3773 = i_42_;
                        anInt3777 = i_49_;
                        break while_97_;
                    } while (false);
                    anInt3773 = i_42_;
                    anInt3777 = i_44_;
                    anInt3763 = i_48_;
                    break while_97_;
                } while (false);
                anInt3763 = i_42_;
                anInt3777 = i_44_;
                anInt3773 = i_49_;
            }
        } while (false);
        anInt3770++;
    }

    static
    {
        anInt3782 = 0;
        aShortArray3781 = new short[] { -10304, 9104, -1, -1, -1 };
        aClass100_3786 = Class112.makeMutableString(43, "flash1:");
        aClass100_3785 = aClass100_3786;
        aClass100_3784 = aClass100_3786;
    }
}
