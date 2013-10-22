/* Class68_Sub13_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68_Sub13_Sub11 extends Class68_Sub13
{
    private int anInt3600;
    static int anInt3601;
    private int anInt3602;
    static int anInt3603;
    static int anInt3604;
    static long aLong3605;
    static int anInt3606;
    static Class68_Sub20_Sub10[] mapMarkers;
    private int anInt3608;
    static int anInt3609;
    private int anInt3610 = 2048;
    private int anInt3611;
    static int anInt3612;
    static MutableString aClass100_3613;
    static int anInt3614;
    private int anInt3615 = 8192;
    private static MutableString aClass100_3616 = Class112.makeMutableString(43, "K");
    static int anInt3617;
    static short aShort3618;
    static int anInt3619;
    static int anInt3620;
    static volatile long mouseClickTime;
    static int anInt3622;
    static int anInt3623;
    static byte[][][] aByteArrayArrayArray3624;
    static int anInt3625;
    static int anInt3626;
    private int anInt3627;
    static short[][][] aShortArrayArrayArray3628;
    static MutableString aClass100_3629;

    private final boolean method745(int i, byte i_0_, int i_1_)
    {
        anInt3609++;
        int i_2_ = 81 % ((50 - i_0_) / 41);
        int i_3_ = (i_1_ - i) * anInt3608 >> 12;
        int i_4_ = Class78.anIntArray1396[0xff & 255 * i_3_ >> 12];
        i_4_ = (i_4_ << 12) / anInt3608;
        i_4_ = (i_4_ << 12) / anInt3615;
        i_4_ = i_4_ * anInt3600 >> 12;
        if (i + i_1_ >= i_4_ || -i_4_ >= i + i_1_)
            return false;
        return true;
    }

    static final void method746(int i, Stream class68_sub14)
    {
        try
        {
            if (i > 65)
            {
                while (((Stream) class68_sub14).buffer.length > ((Stream) class68_sub14).position)
                {
                    boolean bool = false;
                    int i_5_ = 0;
                    int i_6_ = 0;
                    if (class68_sub14.readUByte() == 1)
                    {
                        bool = true;
                        i_5_ = class68_sub14.readUByte();
                        i_6_ = class68_sub14.readUByte();
                    }
                    int i_7_ = class68_sub14.readUByte();
                    int i_8_ = class68_sub14.readUByte();
                    int i_9_ = i_7_ * 64 - Class70.anInt1273;
                    int i_10_ = (Ground.anInt2762 - 64 * i_8_ + (Class103.anInt1770 - 1));
                    if (i_9_ < 0 || i_10_ - 63 < 0 || Class68_Sub6.anInt2848 <= i_9_ + 63 || Class103.anInt1770 <= i_10_)
                    {
                        for (int i_11_ = 0; ((i_11_ ^ 0xffffffff) > ((bool ? 64 : 4096) ^ 0xffffffff)); i_11_++)
                        {
                            byte i_12_ = class68_sub14.readByte();
                            if (i_12_ != 0)
                                ((Stream) class68_sub14).position++;
                        }
                    } else
                    {
                        int i_13_ = i_9_ >> 6;
                        int i_14_ = i_10_ >> 6;
                        for (int i_15_ = 0; i_15_ < 64; i_15_++)
                        {
                            for (int i_16_ = 0; i_16_ < 64; i_16_++)
                            {
                                if (!bool || (i_15_ >= 8 * i_5_ && i_5_ * 8 + 8 > i_15_ && 8 * i_6_ <= i_16_ && i_16_ < 8 * i_6_ + 8))
                                {
                                    byte i_17_ = class68_sub14.readByte();
                                    if (i_17_ != 0)
                                    {
                                        if ((Class12.aByteArrayArrayArray212[i_13_][i_14_]) == null)
                                            Class12.aByteArrayArrayArray212[i_13_][i_14_] = new byte[4096];
                                        Class12.aByteArrayArrayArray212[i_13_][i_14_][(63 - i_16_ << 6) + i_15_] = i_17_;
                                        byte i_18_ = class68_sub14.readByte();
                                        if ((Class68_Sub13_Sub16.aByteArrayArrayArray3712[i_13_][i_14_]) == null)
                                            Class68_Sub13_Sub16.aByteArrayArrayArray3712[i_13_][i_14_] = new byte[4096];
                                        Class68_Sub13_Sub16.aByteArrayArrayArray3712[i_13_][i_14_][(63 - i_16_ << 6) + i_15_] = i_18_;
                                    }
                                }
                            }
                        }
                    }
                }
                anInt3612++;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "i.F(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')');
        }
    }

    static final void method747(MutableString class100, byte i)
    {
        try
        {
            anInt3626++;
            Class26.aClass100_521 = class100;
            if (Class75_Sub1_Sub1.signlink.gameApplet != null)
            {
                try
                {
                    MutableString class100_19_ = (Class68_Sub13_Sub7.aClass100_3553.method1616(Class75_Sub1_Sub1.signlink.gameApplet, (byte) -31));
                    MutableString class100_20_ = (Class68_Sub13_Sub16.aClass100_3696.method1616(Class75_Sub1_Sub1.signlink.gameApplet, (byte) -31));
                    MutableString class100_21_ = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100_19_, Class68_Sub28_Sub2.aClass100_4550, class100, Class75_Sub3.aClass100_3324, class100_20_ })));
                    do
                    {
                        if (class100.getLength() != 0)
                        {
                            class100_21_ = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { class100_21_, Class75_Sub3.aClass100_3322, Class51.method538(-118, (Class36.method438(17161) + 94608000000L)), Class68_Sub27.aClass100_3217, PlayerDefinition.method1771(94608000L, -96) })));
                            if (client.anInt2387 == 0)
                                break;
                        }
                        class100_21_ = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { class100_21_, GameApplet.aClass100_33 }));
                    } while (false);
                    if (i > 118)
                        Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { Class49.aClass100_963, class100_21_, NodeSub.aClass100_3093 }).method1605((byte) -45, Class75_Sub1_Sub1.signlink.gameApplet);
                } catch (Throwable throwable)
                {
                    /* empty */
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "i.J(" + (class100 != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    static final void method748(int i, int i_22_)
    {
        Ground class68_sub1 = Class22.groundArray[0][i][i_22_];
        for (int i_23_ = 0; i_23_ < 3; i_23_++)
        {
            Ground class68_sub1_24_ = (Class22.groundArray[i_23_][i][i_22_] = (Class22.groundArray[i_23_ + 1][i][i_22_]));
            if (class68_sub1_24_ != null)
            {
                ((Ground) class68_sub1_24_).plane_2--;
                for (int i_25_ = 0; i_25_ < ((Ground) class68_sub1_24_).anInt2773; i_25_++)
                {
                    Object5 class69 = (((Ground) class68_sub1_24_).object_5[i_25_]);
                    if ((((Object5) class69).uid >> 29 & 0x3L) == 2L && ((Object5) class69).anInt1254 == i && ((Object5) class69).anInt1253 == i_22_)
                        ((Object5) class69).anInt1249--;
                }
            }
        }
        if (Class22.groundArray[0][i][i_22_] == null)
            Class22.groundArray[0][i][i_22_] = new Ground(0, i, i_22_);
        ((Ground) Class22.groundArray[0][i][i_22_]).aClass68_Sub1_2782 = class68_sub1;
        Class22.groundArray[3][i][i_22_] = null;
    }

    final void method700(Stream class68_sub14, int i, int i_26_)
    {
        while_68_: do
        {
            try
            {
                anInt3619++;
                if (i_26_ != -1)
                    anInt3608 = -119;
                int i_27_ = i;
                while_67_: do
                {
                    while_66_: do
                    {
                        while_65_: do
                        {
                            while_64_: do
                            {
                                while_63_: do
                                {
                                    do
                                    {
                                        if (i_27_ != 0)
                                        {
                                            if (i_27_ == 1)
                                                break;
                                            if (i_27_ == 2)
                                                break while_63_;
                                            if (i_27_ == 3)
                                                break while_64_;
                                            if (i_27_ == 4)
                                                break while_65_;
                                            if (i_27_ == 5)
                                                break while_66_;
                                            if (i_27_ != 6)
                                                break while_68_;
                                            if (client.anInt2387 == 0)
                                                break while_67_;
                                        }
                                        anInt3610 = class68_sub14.readUShort();
                                        return;
                                    } while (false);
                                    anInt3602 = class68_sub14.readUShort();
                                    return;
                                } while (false);
                                anInt3627 = class68_sub14.readUShort();
                                return;
                            } while (false);
                            anInt3611 = class68_sub14.readUShort();
                            return;
                        } while (false);
                        anInt3608 = class68_sub14.readUShort();
                        return;
                    } while (false);
                    anInt3600 = class68_sub14.readUShort();
                    return;
                } while (false);
                anInt3615 = class68_sub14.readUShort();
                break;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("i.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ')'));
            }
        } while (false);
    }

    public Class68_Sub13_Sub11()
    {
        super(0, true);
        anInt3611 = 2048;
        anInt3608 = 12288;
        anInt3602 = 0;
        anInt3600 = 4096;
        anInt3627 = 0;
    }

    static final void updateLocalPlayersMovement()
    {
        int to_update = Class68_Sub13_Sub8.connectionVector.readBits(8);
        if (client.localPlayerCount > to_update)
        {
            for (int idx = to_update; idx < client.localPlayerCount; idx++)
                Class68_Sub13_Sub14.removeEntityIndices[Class75_Sub3_Sub1.removeEntityCount++] = Class85.localPlayerIndices[idx];
        }
        if (to_update > client.localPlayerCount)
            throw new RuntimeException("gppov1");
        client.localPlayerCount = 0;
        for (int idx = 0; to_update > idx; idx++)
        {
            int index = Class85.localPlayerIndices[idx];
            Player player = Class68_Sub13_Sub4.localPlayers[index];
            int has_update = Class68_Sub13_Sub8.connectionVector.readBits(1);
            if (has_update == 0)
            {
                Class85.localPlayerIndices[client.localPlayerCount++] = index;
                player.lastUpdate = Class68_Sub3.loopCycle;
            } else
            {
                int update_type = Class68_Sub13_Sub8.connectionVector.readBits(2);
                if (update_type == 0)
                {
                    Class85.localPlayerIndices[client.localPlayerCount++] = index;
                    player.lastUpdate = Class68_Sub3.loopCycle;
                    CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = index;
                } else if (update_type == 1)
                {
                    Class85.localPlayerIndices[client.localPlayerCount++] = index;
                    player.lastUpdate = Class68_Sub3.loopCycle;
                    int dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                    player.moveInDirection(false, dir);
                    int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
                    if (has_ublock == 1)
                        CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = index;
                } else if (update_type == 2)
                {
                    Class85.localPlayerIndices[client.localPlayerCount++] = index;
                    player.lastUpdate = Class68_Sub3.loopCycle;
                    int dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                    player.moveInDirection(true, dir);
                    dir = Class68_Sub13_Sub8.connectionVector.readBits(3);
                    player.moveInDirection(true, dir);
                    int has_ublock = Class68_Sub13_Sub8.connectionVector.readBits(1);
                    if (has_ublock == 1)
                        CipheredByteVector.updateBlockIndices[Class68_Sub20_Sub16.updateBlockCount++] = index;
                } else if (update_type == 3)
                    Class68_Sub13_Sub14.removeEntityIndices[Class75_Sub3_Sub1.removeEntityCount++] = index;
            }
        }
    }

    final void method690(byte i)
    {
        Class68_Sub10.method683((byte) -128);
        if (i <= -22)
            anInt3617++;
    }

    private final boolean method750(int i, byte i_39_, int i_40_)
    {
        anInt3614++;
        int i_41_ = (i_40_ + i) * anInt3608 >> 12;
        if (i_39_ <= 13)
            anInt3627 = 10;
        int i_42_ = Class78.anIntArray1396[(255 * i_41_ & 0xfffa8) >> 12];
        i_42_ = (i_42_ << 12) / anInt3608;
        i_42_ = (i_42_ << 12) / anInt3615;
        i_42_ = anInt3600 * i_42_ >> 12;
        if (i_42_ <= i_40_ - i || i_40_ - i <= -i_42_)
            return false;
        return true;
    }

    public static void method751(byte i)
    {
        aClass100_3616 = null;
        aByteArrayArrayArray3624 = null;
        aShortArrayArrayArray3628 = null;
        mapMarkers = null;
        aClass100_3629 = null;
        aClass100_3613 = null;
        if (i != -66)
            anInt3622 = -85;
    }

    final int[] method698(byte i, int i_43_)
    {
        anInt3601++;
        if (i != -61)
            aClass100_3613 = null;
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_43_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_44_ = Class13_Sub3.anIntArray2674[i_43_] - 2048;
            for (int i_45_ = 0; Class68_Sub13_Sub19.anInt3748 > i_45_; i_45_++)
            {
                int i_46_ = Class68_Sub13_Sub3.anIntArray3481[i_45_] - 2048;
                int i_47_ = anInt3602 + i_44_;
                i_47_ = i_47_ >= -2048 ? i_47_ : i_47_ + 4096;
                i_47_ = i_47_ > 2048 ? i_47_ - 4096 : i_47_;
                int i_48_ = anInt3610 + i_46_;
                i_48_ = i_48_ >= -2048 ? i_48_ : i_48_ + 4096;
                i_48_ = i_48_ > 2048 ? i_48_ - 4096 : i_48_;
                int i_49_ = anInt3627 + i_46_;
                int i_50_ = anInt3611 + i_44_;
                i_49_ = i_49_ >= -2048 ? i_49_ : i_49_ + 4096;
                i_49_ = i_49_ > 2048 ? i_49_ - 4096 : i_49_;
                i_50_ = i_50_ >= -2048 ? i_50_ : i_50_ + 4096;
                i_50_ = i_50_ > 2048 ? i_50_ - 4096 : i_50_;
                is[i_45_] = (!method745(i_48_, (byte) 118, i_47_) && !method750(i_49_, (byte) 35, i_50_)) ? 0 : 4096;
            }
        }
        return is;
    }

    static final Class48 method752(byte i, int i_51_)
    {
        anInt3606++;
        Class48 class48 = (Class48) Class68_Sub13_Sub8.aClass98_3563.getNodeForID((long) i_51_);
        if (class48 != null)
            return class48;
        byte[] is = (Class66.aClass21_1203.method338(GameException.method1801(i_51_, 72), i ^ 0x51, Class68_Sub20_Sub8.method1094(i_51_, 654593194)));
        class48 = new Class48();
        if (is != null)
            class48.method517(126, new Stream(is));
        if (i != 81)
            return null;
        Class68_Sub13_Sub8.aClass98_3563.addObject(class48, (long) i_51_);
        return class48;
    }

    static final NPCDefinition getNPCDefinition(int i)
    {
        anInt3603++;
        NPCDefinition class80 = (NPCDefinition) Class93.aClass98_1664.getNodeForID((long) i);
        if (class80 != null)
            return class80;
        byte[] is = Class1_Sub1.aClass21_2429.method338(Class90.method1521(i, 522), 0, Character.method148(i, -95));
        class80 = new NPCDefinition();
        ((NPCDefinition) class80).type = i;
        if (is != null)
            class80.method1449(new Stream(is), (byte) -53);
        class80.method1458(24381);
        Class93.aClass98_1664.addObject(class80, (long) i);
        return class80;
    }

    static
    {
        aClass100_3613 = aClass100_3616;
        mouseClickTime = 0L;
        aLong3605 = 0L;
        aShort3618 = (short) 256;
        anInt3623 = 0;
        anInt3620 = 0;
        anInt3604 = 1;
        aClass100_3629 = aClass100_3616;
    }
}
