/* Class68_Sub13_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class68_Sub13_Sub4 extends Class68_Sub13
{
    static Player[] localPlayers;
    private int anInt3486;
    private int[] anIntArray3487;
    static Class124 aClass124_3488;
    private int anInt3489;
    static int anInt3490 = 0;
    private int anInt3491;
    private int anInt3492;
    private int[][] anIntArrayArray3493;
    static MutableString aClass100_3494;
    static int anInt3495;
    private int anInt3496 = 0;
    private int[][] anIntArrayArray3497;
    static int anInt3498;
    static int anInt3499;
    private int anInt3500 = 1024;
    static int anInt3501;
    private int anInt3502;
    static int anInt3503;
    private int anInt3504;
    static int[][][] anIntArrayArrayArray3505;
    static int anInt3506;
    private int anInt3507;
    static int anInt3508;
    private int anInt3509;
    static int anInt3510;
    static int anInt3511;
    private int anInt3512;
    static Class68_Sub20_Sub1 aClass68_Sub20_Sub1_3513;

    final int[] method698(byte i, int i_0_)
    {
        int[] is = ((Class68_Sub13) this).aClass115_2938.method1703(false, i_0_);
        if (((Class115) ((Class68_Sub13) this).aClass115_2938).aBoolean1959)
        {
            int i_1_ = 0;
            int i_2_;
            for (i_2_ = anInt3496 + Class13_Sub3.anIntArray2674[i_0_]; i_2_ < 0; i_2_ += 4096)
            {
                /* empty */
            }
            for (/**/; i_2_ > 4096; i_2_ -= 4096)
            {
                /* empty */
            }
            for (/**/; i_1_ < anInt3486; i_1_++)
            {
                if (anIntArray3487[i_1_] > i_2_)
                    break;
            }
            int i_3_ = anIntArray3487[i_1_ - 1];
            int i_4_ = i_1_ - 1;
            boolean bool = (0x1 & i_1_) == 0;
            int i_5_ = anIntArray3487[i_1_];
            if (i_2_ <= i_3_ + anInt3492 || i_5_ - anInt3492 <= i_2_)
                Class39.method464(is, 0, Class68_Sub13_Sub19.anInt3748, 0);
            else
            {
                for (int i_6_ = 0; i_6_ < Class68_Sub13_Sub19.anInt3748; i_6_++)
                {
                    int i_7_ = 0;
                    int i_8_ = !bool ? -anInt3504 : anInt3504;
                    int i_9_;
                    for (i_9_ = (Class68_Sub13_Sub3.anIntArray3481[i_6_] + (anInt3509 * i_8_ >> 12)); i_9_ < 0; i_9_ += 4096)
                    {
                        /* empty */
                    }
                    for (/**/; i_9_ > 4096; i_9_ -= 4096)
                    {
                        /* empty */
                    }
                    for (/**/; anInt3507 > i_7_; i_7_++)
                    {
                        if (i_9_ < anIntArrayArray3493[i_4_][i_7_])
                            break;
                    }
                    int i_10_ = anIntArrayArray3493[i_4_][i_7_];
                    int i_11_ = i_7_ - 1;
                    int i_12_ = anIntArrayArray3493[i_4_][i_11_];
                    if (i_12_ + anInt3492 < i_9_ && i_9_ < i_10_ - anInt3492)
                        is[i_6_] = anIntArrayArray3497[i_4_][i_11_];
                    else
                        is[i_6_] = 0;
                }
            }
        }
        anInt3501++;
        if (i != -61)
            method698((byte) -77, -48);
        return is;
    }

    final void method690(byte i)
    {
        method715(0);
        if (i > -22)
            anIntArray3487 = null;
        anInt3508++;
    }

    public static void method714(int i)
    {
        if (i >= -97)
            method717(null, 122);
        aClass100_3494 = null;
        anIntArrayArrayArray3505 = null;
        aClass124_3488 = null;
        localPlayers = null;
        aClass68_Sub20_Sub1_3513 = null;
    }

    private final void method715(int i)
    {
        Random random = new Random((long) anInt3486);
        anInt3492 = anInt3489 / 2;
        anInt3510++;
        anInt3509 = 4096 / anInt3507;
        anIntArrayArray3497 = new int[anInt3486][anInt3507];
        anIntArray3487 = new int[anInt3486 + 1];
        anIntArrayArray3493 = new int[anInt3486][anInt3507 + 1];
        int i_13_ = anInt3509 / 2;
        anInt3512 = 4096 / anInt3486;
        anIntArray3487[0] = 0;
        int i_14_ = anInt3512 / 2;
        for (int i_15_ = i; i_15_ < anInt3486; i_15_++)
        {
            if (i_15_ > 0)
            {
                int i_16_ = anInt3512;
                int i_17_ = ((Class68_Sub20_Sub10.method1114(4096, (byte) 70, random) - 2048) * anInt3491 >> 12);
                i_16_ += i_14_ * i_17_ >> 12;
                anIntArray3487[i_15_] = anIntArray3487[i_15_ - 1] + i_16_;
            }
            anIntArrayArray3493[i_15_][0] = 0;
            for (int i_18_ = 0; anInt3507 > i_18_; i_18_++)
            {
                if (i_18_ > 0)
                {
                    int i_19_ = anInt3509;
                    int i_20_ = ((Class68_Sub20_Sub10.method1114(4096, (byte) 70, random) - 2048) * anInt3502 >> 12);
                    i_19_ += i_13_ * i_20_ >> 12;
                    anIntArrayArray3493[i_15_][i_18_] = anIntArrayArray3493[i_15_][i_18_ - 1] + i_19_;
                }
                anIntArrayArray3497[i_15_][i_18_] = (anInt3500 <= 0 ? 4096 : 4096 - Class68_Sub20_Sub10.method1114(anInt3500, (byte) 70, random));
            }
            anIntArrayArray3493[i_15_][anInt3507] = 4096;
        }
        anIntArray3487[anInt3486] = 4096;
    }

    final void method700(Stream class68_sub14, int i, int i_21_)
    {
        do
        {
            try
            {
                int i_22_ = i;
                while_12_: do
                {
                    while_11_: do
                    {
                        while_10_: do
                        {
                            while_9_: do
                            {
                                while_8_: do
                                {
                                    while_7_: do
                                    {
                                        do
                                        {
                                            if (i_22_ != 0)
                                            {
                                                if (i_22_ != 1)
                                                {
                                                    if (i_22_ != 2)
                                                    {
                                                        if (i_22_ != 3)
                                                        {
                                                            if (i_22_ != 4)
                                                            {
                                                                if (i_22_ != 5)
                                                                {
                                                                    if (i_22_ != 6)
                                                                    {
                                                                        if (i_22_ != 7)
                                                                            break while_12_;
                                                                    } else
                                                                        break while_10_;
                                                                    break while_11_;
                                                                }
                                                            } else
                                                                break while_8_;
                                                            break while_9_;
                                                        }
                                                    } else
                                                        break;
                                                    break while_7_;
                                                }
                                            } else
                                            {
                                                anInt3507 = class68_sub14.readUByte();
                                                break while_12_;
                                            }
                                            anInt3486 = (class68_sub14.readUByte());
                                            break while_12_;
                                        } while (false);
                                        anInt3502 = class68_sub14.readUShort();
                                        break while_12_;
                                    } while (false);
                                    anInt3491 = class68_sub14.readUShort();
                                    break while_12_;
                                } while (false);
                                anInt3504 = class68_sub14.readUShort();
                                break while_12_;
                            } while (false);
                            anInt3496 = class68_sub14.readUShort();
                            break while_12_;
                        } while (false);
                        anInt3489 = class68_sub14.readUShort();
                        break while_12_;
                    } while (false);
                    anInt3500 = class68_sub14.readUShort();
                } while (false);
                anInt3498++;
                if (i_21_ == -1)
                    break;
                anInt3509 = 120;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("db.K(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ',' + i_21_ + ')'));
            }
            break;
        } while (false);
    }

    static final void method716()
    {
        for (int i = 0; i < Mouse.anInt1584; i++)
        {
            for (int i_23_ = 0; i_23_ < GameApplet.anInt7; i_23_++)
            {
                for (int i_24_ = 0; i_24_ < Class97.anInt1716; i_24_++)
                    Class22.groundArray[i][i_23_][i_24_] = null;
            }
        }
        for (int i = 0; i < Class54.anInt1029; i++)
            Class121.aClass8Array2104[i] = null;
        Class54.anInt1029 = 0;
        for (int i = 0; i < Animation.anInt2057; i++)
            Node.aClass69Array1222[i] = null;
        Animation.anInt2057 = 0;
        for (int i = 0; i < Class75_Sub1.aClass69Array3308.length; i++)
            Class75_Sub1.aClass69Array3308[i] = null;
    }

    static final void method717(NPC class1_sub6_sub1, int i)
    {
        do
        {
            try
            {
                anInt3495++;
                for (Class68_Sub18 class68_sub18 = ((Class68_Sub18) Class51.aClass16_2253.method293((byte) 76)); class68_sub18 != null; class68_sub18 = ((Class68_Sub18) Class51.aClass16_2253.method290((byte) 80)))
                {
                    if (((Class68_Sub18) class68_sub18).aClass1_Sub6_Sub1_3062 == class1_sub6_sub1)
                    {
                        if ((((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042) != null)
                        {
                            NPCDefinition.aClass68_Sub28_Sub4_1420.method1314(((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042);
                            ((Class68_Sub18) class68_sub18).aClass68_Sub28_Sub3_3042 = null;
                        }
                        class68_sub18.unlink();
                        return;
                    }
                }
                if (i == 2)
                    break;
                aClass124_3488 = null;
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("db.E(" + (class1_sub6_sub1 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public Class68_Sub13_Sub4()
    {
        super(0, true);
        anInt3491 = 204;
        anInt3504 = 1024;
        anInt3489 = 81;
        anInt3507 = 4;
        anInt3502 = 409;
        anInt3486 = 8;
    }

    static final void method718(byte i)
    {
        if (i == -88)
        {
            anInt3506++;
            Class68_Sub28_Sub2.aClass98_4546.method1572((byte) 94);
        }
    }

    static
    {
        localPlayers = new Player[2048];
        anInt3499 = 0;
        aClass100_3494 = Class112.makeMutableString(43, "<img=1>");
        anInt3503 = 2;
        anIntArrayArrayArray3505 = new int[2][][];
    }
}
