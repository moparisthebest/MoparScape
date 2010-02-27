/* Class1_Sub6_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends Character
{
    static int anInt3401;
    static int anInt3402;
    private int anInt3403;
    int anInt3404;
    static int anInt3405;
    static int anInt3406;
    static int anInt3407;
    int anInt3408 = 0;
    int anInt3409;
    int anInt3410;
    int anInt3411;
    PlayerDefinition definition;
    Model model;
    int anInt3414;
    static MutableString aClass100_3415 = Class112.makeMutableString(43, "Lade Titelbild )2 ");
    MutableString name;
    int combatLevel;
    int anInt3418;
    static int anInt3419;
    static Login aClass82_3420;
    int anInt3421;
    static int anInt3422;
    int anInt3423;
    int anInt3424;
    static int anInt3425;
    boolean aBoolean3426;
    private short pkHeadIcon;
    private short prayerHeadIcon;
    int anInt3429;
    static MutableString aClass100_3430 = Class112.makeMutableString(43, "::");
    static MutableString aClass100_3431;
    static int[] anIntArray3432 = new int[100];
    int anInt3433;
    static int anInt3434;
    int anInt3435;
    int anInt3436;
    int anInt3437;
    static int anInt3438;
    static int anInt3439;
    int anInt3440;
    int anInt3441;
    static MutableString aClass100_3442;
    static MutableString aClass100_3443;
    private static MutableString aClass100_3444;

    static final void method157(int i, int i_0_, int i_1_, int i_2_)
    {
        Class108.aClass68_Sub1ArrayArrayArray1835 = new Ground[i][i_0_][i_1_];
        Class74.anIntArrayArrayArray1335 = new int[i][i_0_ + 1][i_1_ + 1];
        Class68_Sub13_Sub1.method706(false);
        GameApplet.anInt7 = i_0_;
        Class97.anInt1716 = i_1_;
        Class72.anIntArrayArrayArray1311 = new int[i][i_0_ + 1][i_1_ + 1];
        Class68_Sub13_Sub4.method716();
        ClientScript.anInt4386 = i_2_;
        Class68_Sub9.aBooleanArrayArray2889 = (new boolean[(ClientScript.anInt4386 + ClientScript.anInt4386 + 1)][(ClientScript.anInt4386 + ClientScript.anInt4386 + 1)]);
        Class68_Sub13_Sub18.aBooleanArrayArray3740 = (new boolean[(ClientScript.anInt4386 + ClientScript.anInt4386 + 2)][(ClientScript.anInt4386 + ClientScript.anInt4386 + 2)]);
    }

    private final void method158(int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, Model class1_sub3)
    {
        do
        {
            try
            {
                anInt3402++;
                int i_13_ = i_9_ * i_9_ + i_3_ * i_3_;
                if (bool != true)
                    ((Player) this).anInt3410 = 113;
                if (i_13_ >= 16 && i_13_ <= 360000)
                {
                    int i_14_ = ((int) (325.949 * Math.atan2((double) i_9_, (double) i_3_)) & 0x7ff);
                    Model class1_sub3_15_ = Class88.method1500(i_4_, ((Character) this).y, ((Character) this).anInt2584, i_14_, -10, class1_sub3, ((Character) this).x);
                    if (class1_sub3_15_ == null)
                        break;
                    class1_sub3_15_.render(0, i_6_, i_5_, i_12_, i_10_, i_11_, i, i_7_, -1L);
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("fa.FA(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + bool + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + (class1_sub3 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void parseAppearance(Stream vec)
    {
        try
        {
            vec.position = 0;
            int headIcons = vec.readUByte();
            if ((0x2 & headIcons) == 2)
            {
                prayerHeadIcon = (short) (vec.readUByte() << 2);
                pkHeadIcon = (short) (vec.readUByte() << 2);
            } else
            {
                pkHeadIcon = (short) 0;
                prayerHeadIcon = (short) 0;
            }
            anInt3403 = 0x3 & headIcons >> 6;
            int rr = raw_range;
            raw_range = (0x7 & headIcons >> 3) + 1;
            y += (raw_range - rr) * 64;
            int i_18_ = -1;
            boolean bool = (0x4 & headIcons) != 0;
            int i_19_ = headIcons & 0x1;
            x += 64 * (raw_range - rr);
            anInt3437 = vec.readByte();
            int[] is = new int[12];
            anInt3424 = vec.readByte();
            anInt3433 = 0;
            for (int idx = 0; idx < 12; idx++)
            {
                int i_21_ = vec.readUByte();
                if (i_21_ == 0)
                    is[idx] = 0;
                else
                {
                    int i_22_ = vec.readUByte();
                    int i_23_ = i_22_ + (i_21_ << 8);
                    if (idx == 0 && i_23_ == 65535)
                    {
                        i_18_ = vec.readUShort();
                        break;
                    }
                    if (i_23_ >= 32768)
                    {
                        i_23_ = (Class68_Sub20_Sub13.anIntArray4369[i_23_ - 32768]);
                        is[idx] = Class70.OR(i_23_, 1073741824);
                        int i_24_ = (((ItemDefinition) GameApplet.method18(-25672, i_23_)).team);
                        if (i_24_ != 0)
                            ((Player) this).anInt3433 = i_24_;
                    } else
                        is[idx] = Class70.OR(-2147483648, i_23_ - 256);
                }
            }
            int[] is_25_ = new int[5];
            for (int i_26_ = 0; i_26_ < 5; i_26_++)
            {
                int i_27_ = vec.readUByte();
                if (i_27_ < 0 || i_27_ >= Class56.aShortArrayArray1065[i_26_].length)
                    i_27_ = 0;
                is_25_[i_26_] = i_27_;
            }
            ((Character) this).anInt2532 = vec.readUShort();
            if (((Character) this).anInt2532 == 65535)
                ((Character) this).anInt2532 = -1;
            ((Character) this).anInt2567 = vec.readUShort();
            if (((Character) this).anInt2567 == 65535)
                ((Character) this).anInt2567 = -1;
            ((Character) this).anInt2566 = ((Character) this).anInt2567;
            ((Character) this).anInt2545 = vec.readUShort();
            if (((Character) this).anInt2545 == 65535)
                ((Character) this).anInt2545 = -1;
            ((Character) this).anInt2534 = vec.readUShort();
            if (((Character) this).anInt2534 == 65535)
                ((Character) this).anInt2534 = -1;
            ((Character) this).anInt2576 = vec.readUShort();
            if (((Character) this).anInt2576 == 65535)
                ((Character) this).anInt2576 = -1;
            ((Character) this).anInt2565 = vec.readUShort();
            if (((Character) this).anInt2565 == 65535)
                ((Character) this).anInt2565 = -1;
            ((Character) this).anInt2542 = vec.readUShort();
            if (((Character) this).anInt2542 == 65535)
                ((Character) this).anInt2542 = -1;
            ((Player) this).name = Class56.method570(vec.readLong(), -1).method1603(12688);
            ((Player) this).combatLevel = vec.readUByte();
            if (bool)
                ((Player) this).anInt3408 = vec.readUShort();
            else
                ((Player) this).anInt3408 = 0;
            int i_28_ = ((Player) this).anInt3429;
            ((Player) this).anInt3429 = vec.readUByte();
            if (((Player) this).anInt3429 == 0)
                NodeCache.method1687(-1, this);
            else
            {
                int i_29_ = ((Player) this).anInt3423;
                int i_30_ = ((Player) this).anInt3404;
                int i_31_ = ((Player) this).anInt3411;
                ((Player) this).anInt3404 = vec.readUShort();
                ((Player) this).anInt3423 = vec.readUShort();
                ((Player) this).anInt3411 = vec.readUShort();
                if (i_28_ != ((Player) this).anInt3429 || i_30_ != ((Player) this).anInt3404 || ((Player) this).anInt3423 != i_29_ || i_31_ != ((Player) this).anInt3411)
                    Class13_Sub2.method255((byte) -10, this);
            }
            if (definition == null)
                definition = new PlayerDefinition();
            definition.method1779(is_25_, is, i_19_ == 1, (byte) -126, i_18_);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "fa.BA(" + (vec != null ? "{...}" : "null") + ')');
        }
    }

    final MutableString method160()
    {
        MutableString _name = name;
        anInt3419++;
        if (ObjectDefinition.aClass100Array1994 != null)
            _name = Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (ObjectDefinition.aClass100Array1994[anInt3403]), _name }));
        if (NodeSub.aClass100Array3095 != null)
            _name = Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { _name, (NodeSub.aClass100Array3095[anInt3403]) }));
        return _name;
    }

    final boolean hasDefinition()
    {
        return definition != null;
    }

    final void render(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, long l)
    {
        if (definition != null)
        {
            Animation class117 = ((animationID != -1 && anInt2547 == 0) ? Object1.getAnimation(animationID) : null);
            Animation class117_39_ = ((anInt2526 != -1 && !aBoolean3426 && ((anInt2526 != anInt2532) || class117 == null)) ? Object1.getAnimation(anInt2526) : null);
            Model class1_sub3 = (((Player) this).definition.method1774(((Character) this).anInt2524, class117, ((Character) this).anInt2557, class117_39_, (byte) 97));
            if (class1_sub3 != null)
            {
                ((Character) this).height = class1_sub3.method56();
                if (Class68_Sub20_Sub13_Sub2.aBoolean4631 && ((((PlayerDefinition) ((Player) this).definition).anInt2203) == -1 || ((NPCDefinition) (Class68_Sub13_Sub11.getNPCDefinition((((PlayerDefinition) (((Player) this).definition)).anInt2203)))).aBoolean1450))
                {
                    Model class1_sub3_40_ = (GameException.method1799(((Character) this).y, i, ((Character) this).anInt2584, class1_sub3, (class117_39_ != null ? ((Character) this).anInt2557 : ((Character) this).anInt2524), class117_39_ != null ? class117_39_ : class117, 240, 0, ((Character) this).x, 1, 160, 0, 64, ((Character) this).aBoolean2585));
                    class1_sub3_40_.render(0, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, -1L);
                }
                if (Class68_Sub7.localPlayer == this)
                {
                    for (int i_41_ = Class34.aClass23Array594.length - 1; i_41_ >= 0; i_41_--)
                    {
                        Class23 class23 = Class34.aClass23Array594[i_41_];
                        if (class23 != null && ((Class23) class23).anInt495 != -1)
                        {
                            if (((Class23) class23).anInt489 == 1 && ((Class23) class23).anInt493 >= 0 && (((Class23) class23).anInt493 < (Class102.localNPCs).length))
                            {
                                NPC class1_sub6_sub1 = (Class102.localNPCs[((Class23) class23).anInt493]);
                                if (class1_sub6_sub1 != null)
                                {
                                    int i_42_ = ((((Character) class1_sub6_sub1).y) / 32 - (((Character) (Class68_Sub7.localPlayer)).y) / 32);
                                    int i_43_ = ((((Character) class1_sub6_sub1).x) / 32 - (((Character) (Class68_Sub7.localPlayer)).x) / 32);
                                    method158(i_37_, i_42_, ((Class23) class23).anInt495, i_33_, i_32_, true, i_38_, i, i_43_, i_35_, i_36_, i_34_, class1_sub3);
                                }
                            }
                            if (((Class23) class23).anInt489 == 2)
                            {
                                int i_44_ = ((((Class23) class23).anInt492 - Class68_Sub13_Sub35.baseY) * 4 - ((((Character) (Class68_Sub7.localPlayer)).y) / 32 - 2));
                                int i_45_ = (4 * (((Class23) class23).anInt496 - Class36.baseX) + 2 - (((Character) Class68_Sub7.localPlayer).x) / 32);
                                method158(i_37_, i_44_, ((Class23) class23).anInt495, i_33_, i_32_, true, i_38_, i, i_45_, i_35_, i_36_, i_34_, class1_sub3);
                            }
                            if (((Class23) class23).anInt489 == 10 && ((Class23) class23).anInt493 >= 0 && (((Class23) class23).anInt493 < (Class68_Sub13_Sub4.localPlayers).length))
                            {
                                Player class1_sub6_sub2_46_ = (Class68_Sub13_Sub4.localPlayers[((Class23) class23).anInt493]);
                                if (class1_sub6_sub2_46_ != null)
                                {
                                    int i_47_ = ((((Character) class1_sub6_sub2_46_).x) / 32 - (((Character) (Class68_Sub7.localPlayer)).x) / 32);
                                    int i_48_ = ((((Character) class1_sub6_sub2_46_).y) / 32 - (((Character) (Class68_Sub7.localPlayer)).y) / 32);
                                    method158(i_37_, i_48_, ((Class23) class23).anInt495, i_33_, i_32_, true, i_38_, i, i_47_, i_35_, i_36_, i_34_, class1_sub3);
                                }
                            }
                        }
                    }
                }
                int i_49_ = 0;
                int i_50_ = 0;
                int i_51_ = 0;
                if (prayerHeadIcon != 0 && pkHeadIcon != 0)
                {
                    int i_52_ = Class62.PRECOMPUTED_SINE_CACHE[i];
                    int i_53_ = Class62.PRECOMUPTED_COSINE_CACHE[i];
                    int i_54_ = prayerHeadIcon;
                    int i_55_ = pkHeadIcon;
                    int i_56_ = -i_54_ / 2;
                    int i_57_ = -i_55_ / 2;
                    int i_58_ = i_53_ * i_57_ - i_52_ * i_56_ >> 16;
                    int i_59_ = i_53_ * i_56_ + i_52_ * i_57_ >> 16;
                    int i_60_ = i_54_ / 2;
                    int i_61_ = -i_55_ / 2;
                    int i_62_ = fixZ(i_59_ + ((Character) this).x, GameSocket.plane, i_58_ + ((Character) this).y);
                    int i_63_ = i_52_ * i_61_ + i_60_ * i_53_ >> 16;
                    int i_64_ = i_61_ * i_53_ - i_60_ * i_52_ >> 16;
                    int i_65_ = fixZ(((Character) this).x + i_63_, GameSocket.plane, i_64_ + ((Character) this).y);
                    int i_66_ = -i_54_ / 2;
                    int i_67_ = i_55_ / 2;
                    int i_68_ = i_66_ * i_53_ + i_52_ * i_67_ >> 16;
                    int i_69_ = i_53_ * i_67_ - i_52_ * i_66_ >> 16;
                    int i_70_ = fixZ(i_68_ + ((Character) this).x, GameSocket.plane, ((Character) this).y + i_69_);
                    int i_71_ = i_54_ / 2;
                    int i_72_ = i_55_ / 2;
                    int i_73_ = i_53_ * i_71_ + i_52_ * i_72_ >> 16;
                    int i_74_ = i_72_ * i_53_ - i_52_ * i_71_ >> 16;
                    int i_75_ = fixZ(i_73_ + ((Character) this).x, GameSocket.plane, ((Character) this).y + i_74_);
                    i_51_ = i_75_ + i_62_;
                    int i_76_ = i_62_ >= i_65_ ? i_65_ : i_62_;
                    if (i_51_ > i_65_ + i_70_)
                        i_51_ = i_70_ + i_65_;
                    int i_77_ = i_70_ <= i_62_ ? i_70_ : i_62_;
                    int i_78_ = i_75_ <= i_65_ ? i_75_ : i_65_;
                    int i_79_ = i_75_ <= i_70_ ? i_75_ : i_70_;
                    i_50_ = 0x7ff & (int) (Math.atan2((double) (i_76_ - i_79_), (double) i_55_) * 325.95);
                    if (i_50_ != 0)
                        class1_sub3.method78(i_50_);
                    i_49_ = (int) (Math.atan2((double) (i_77_ - i_78_), (double) i_54_) * 325.95) & 0x7ff;
                    if (i_49_ != 0)
                        class1_sub3.method85(i_49_);
                    i_51_ = (i_51_ >> 1) - ((Character) this).anInt2584;
                    if (i_51_ != 0)
                        class1_sub3.method92(0, i_51_, 0);
                }
                Model class1_sub3_80_ = null;
                if (!((Player) this).aBoolean3426 && ((Character) this).anInt2554 != -1 && ((Character) this).anInt2580 != -1)
                {
                    Class70 class70 = Class68_Sub20_Sub13.method1160(((Character) this).anInt2554, 1);
                    class1_sub3_80_ = class70.method1337(((Character) this).anInt2580, -10);
                    if (class1_sub3_80_ != null)
                    {
                        class1_sub3_80_.method92(0, -((Character) this).anInt2562, 0);
                        if (((Class70) class70).aBoolean1279)
                        {
                            if (i_50_ != 0)
                                class1_sub3_80_.method78(i_50_);
                            if (i_49_ != 0)
                                class1_sub3_80_.method85(i_49_);
                            if (i_51_ != 0)
                                class1_sub3_80_.method92(0, i_51_, 0);
                        }
                    }
                }
                Model class1_sub3_81_ = null;
                if (!((Player) this).aBoolean3426 && ((Player) this).model != null)
                {
                    if (Class68_Sub3.loopCycle >= ((Player) this).anInt3441)
                        ((Player) this).model = null;
                    if ((Class68_Sub3.loopCycle >= ((Player) this).anInt3414) && (((Player) this).anInt3441 > Class68_Sub3.loopCycle))
                    {
                        class1_sub3_81_ = ((Player) this).model;
                        class1_sub3_81_.method92((((Player) this).anInt3418 - ((Character) this).x), (((Player) this).anInt3436 - ((Character) this).anInt2584), (((Player) this).anInt3409 - ((Character) this).y));
                        if (((Character) this).turnDirection == 512)
                            class1_sub3_81_.method88();
                        else if (((Character) this).turnDirection == 1024)
                            class1_sub3_81_.method83();
                        else if (((Character) this).turnDirection == 1536)
                            class1_sub3_81_.method80();
                    }
                }
                if (class1_sub3_80_ != null)
                    class1_sub3 = ((SpriteFactory) class1_sub3).method106(class1_sub3_80_);
                if (class1_sub3_81_ != null)
                    class1_sub3 = ((SpriteFactory) class1_sub3).method106(class1_sub3_81_);
                ((Model) class1_sub3).aBoolean2445 = true;
                class1_sub3.render(i, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, l);
                if (class1_sub3_81_ != null)
                {
                    if (((Character) this).turnDirection == 512)
                        class1_sub3_81_.method80();
                    else if (((Character) this).turnDirection != 1024)
                    {
                        if (((Character) this).turnDirection == 1536)
                            class1_sub3_81_.method88();
                    } else
                        class1_sub3_81_.method83();
                    class1_sub3_81_.method92((((Character) this).x - ((Player) this).anInt3418), (((Character) this).anInt2584 - ((Player) this).anInt3436), (((Character) this).y - ((Player) this).anInt3409));
                }
            }
        }
    }

    static final void method161(int i)
    {
        if (i != 64)
            aClass100_3444 = null;
        anInt3439++;
        Class68_Sub13_Sub10.anInt3597 = Class124.anInt2141;
        GameCanvas.method47(false, i + 576);
        NodeList.method292((byte) 124);
        Class71.method1340(i ^ ~0x40, Class68_Sub13_Sub10.anInt3597);
        Class68_Sub7.localPlayer = new Player();
        ((Character) Class68_Sub7.localPlayer).x = 3000;
        ((Character) Class68_Sub7.localPlayer).y = 3000;
        Class43.method481(i ^ 0x43, Class52.aClass21_Sub1_1011);
        Class17.method296(10, (byte) -94);
    }

    final int method56()
    {
        anInt3438++;
        return ((Character) this).height;
    }

    public static void method162(byte i)
    {
        aClass100_3431 = null;
        if (i <= 27)
            method162((byte) 69);
        aClass100_3430 = null;
        aClass82_3420 = null;
        aClass100_3443 = null;
        anIntArray3432 = null;
        aClass100_3444 = null;
        aClass100_3415 = null;
        aClass100_3442 = null;
    }

    static final int fixZ(int x, int plane, int y)
    {
        anInt3407++;
        int i_84_ = y >> 7;
        int i_85_ = x >> 7;
        if (i_85_ < 0 || i_84_ < 0 || i_85_ > 103 || i_84_ > 103)
            return 0;
        int i_86_ = plane;
        int i_87_ = 0x7f & x;
        int i_88_ = y & 0x7f;
        if (i_86_ < 3 && (Object1.byteGroundArray[1][i_85_][i_84_] & 0x2) == 2)
            i_86_++;
        int i_89_ = (((Class68_Sub20_Sub12.intGroundArray[i_86_][i_85_ + 1][i_84_]) * i_87_ + (128 - i_87_) * (Class68_Sub20_Sub12.intGroundArray[i_86_][i_85_][i_84_])) >> 7);
        int i_90_ = ((i_87_ * (Class68_Sub20_Sub12.intGroundArray[i_86_][i_85_ + 1][i_84_ + 1]) + (Class68_Sub20_Sub12.intGroundArray[i_86_][i_85_][i_84_ + 1]) * (128 - i_87_)) >> 7);
        return (128 - i_88_) * i_89_ + i_90_ * i_88_ >> 7;
    }

    static final int method164(int i, int i_91_)
    {
        if (i < 94)
            method164(-31, -69);
        anInt3405++;
        return 0x3f & i_91_ >> 11;
    }

    Player()
    {
        anInt3403 = 0;
        ((Player) this).anInt3404 = -1;
        ((Player) this).anInt3423 = -1;
        ((Player) this).anInt3414 = 0;
        ((Player) this).anInt3411 = -1;
        ((Player) this).aBoolean3426 = false;
        prayerHeadIcon = (short) 0;
        ((Player) this).anInt3429 = 0;
        ((Player) this).anInt3433 = 0;
        pkHeadIcon = (short) 0;
        ((Player) this).anInt3424 = -1;
        ((Player) this).combatLevel = 0;
        ((Player) this).anInt3437 = -1;
        ((Player) this).anInt3441 = 0;
    }

    static
    {
        aClass100_3431 = Class112.makeMutableString(43, "blinken1:");
        aClass82_3420 = new Login(64);
        aClass100_3444 = Class112.makeMutableString(43, "flash2:");
        aClass100_3442 = aClass100_3444;
        aClass100_3443 = aClass100_3444;
    }
}
