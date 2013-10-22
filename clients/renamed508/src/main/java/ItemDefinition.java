/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ItemDefinition
{
    private int anInt327 = 0;
    static int anInt328;
    private int anInt329;
    private int anInt330;
    int[][] anIntArrayArray331;
    private short[] aShortArray332;
    static int anInt333;
    private byte[] aByteArray334;
    static int anInt335;
    int anInt336;
    private int anInt337;
    private int anInt338;
    int anInt339;
    MutableString[] actions;
    int anInt341 = 0;
    private short[] aShortArray342;
    int[] anIntArray343;
    private int anInt344;
    int anInt345;
    static int anInt346;
    private int anInt347;
    private int anInt348 = 0;
    private int anInt349;
    int id;
    static int anInt351;
    private int anInt352;
    int[] anIntArray353;
    static int anInt354;
    int anInt355;
    private short[] aShortArray356;
    private short[] aShortArray357;
    int anInt358;
    static int anInt359;
    private int anInt360;
    static int anInt361;
    MutableString name;
    private int anInt363;
    static int anInt364;
    static int anInt365;
    boolean aBoolean366;
    static int anInt367;
    static MutableString aClass100_368 = Class112.makeMutableString(43, "Lade Konfiguration )2 ");
    MutableString[] groundActions;
    private int anInt370;
    boolean membersObject;
    static int anInt372;
    static int anInt373;
    private int anInt374;
    int anInt375;
    static int[] anIntArray376 = new int[100];
    private int anInt377;
    int anInt378;
    static int anInt379;
    private int anInt380;
    int anInt381;
    static int anInt382;
    int team;
    private int anInt384;
    int certTemplateID;
    private int anInt386;
    int anInt387;
    private int anInt388;
    int anInt389;
    int anInt390;
    int anInt391;
    static int anInt392;
    static int anInt393;
    NodeCache aClass113_394;
    int anInt395;
    static MutableString aClass100_396 = Class112.makeMutableString(43, "Fps:");
    private int anInt397;

    final int method303(int i, byte i_0_, int i_1_)
    {
        anInt354++;
        if (((ItemDefinition) this).aClass113_394 == null)
            return i;
        if (i_0_ != -79)
            return -115;
        Class68_Sub10 class68_sub10 = ((Class68_Sub10) ((ItemDefinition) this).aClass113_394.method1684((long) i_1_, 115));
        if (class68_sub10 == null)
            return i;
        return ((Class68_Sub10) class68_sub10).anInt2904;
    }

    private final void method304(int i, byte i_2_, Stream class68_sub14)
    {
        do
        {
            try
            {
                anInt359++;
                if (i_2_ > -11)
                    method315(-82);
                if (i == 1)
                {
                    anInt330 = class68_sub14.readUShort();
                    break;
                }
                if (i == 2)
                {
                    ((ItemDefinition) this).name = class68_sub14.readString();
                    break;
                }
                if (i == 4)
                {
                    ((ItemDefinition) this).anInt336 = class68_sub14.readUShort();
                    break;
                }
                if (i == 5)
                {
                    ((ItemDefinition) this).anInt389 = class68_sub14.readUShort();
                    break;
                }
                if (i != 6)
                {
                    if (i != 7)
                    {
                        if (i != 8)
                        {
                            if (i != 11)
                            {
                                if (i == 12)
                                    ((ItemDefinition) this).anInt375 = class68_sub14.readInteger();
                                else if (i == 16)
                                    ((ItemDefinition) this).membersObject = true;
                                else if (i != 23)
                                {
                                    if (i == 24)
                                        anInt347 = class68_sub14.readUShort();
                                    else if (i != 25)
                                    {
                                        if (i == 26)
                                            anInt344 = class68_sub14.readUShort();
                                        else if (i < 30 || i >= 35)
                                        {
                                            if (i >= 35 && i < 40)
                                                ((ItemDefinition) this).actions[i - 35] = class68_sub14.readString();
                                            else if (i == 40)
                                            {
                                                int i_3_ = class68_sub14.readUByte();
                                                aShortArray342 = new short[i_3_];
                                                aShortArray332 = new short[i_3_];
                                                for (int i_4_ = 0; i_3_ > i_4_; i_4_++)
                                                {
                                                    aShortArray342[i_4_] = (short) (class68_sub14.readUShort());
                                                    aShortArray332[i_4_] = (short) (class68_sub14.readUShort());
                                                }
                                            } else if (i != 41)
                                            {
                                                if (i == 42)
                                                {
                                                    int i_5_ = (class68_sub14.readUByte());
                                                    aByteArray334 = new byte[i_5_];
                                                    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
                                                        aByteArray334[i_6_] = (class68_sub14.readByte());
                                                } else if (i != 65)
                                                {
                                                    if (i == 78)
                                                        anInt377 = (class68_sub14.readUShort());
                                                    else if (i != 79)
                                                    {
                                                        if (i != 90)
                                                        {
                                                            if (i == 91)
                                                                anInt337 = (class68_sub14.readUShort());
                                                            else if (i != 92)
                                                            {
                                                                if (i == 93)
                                                                    anInt349 = (class68_sub14.readUShort());
                                                                else if (i != 95)
                                                                {
                                                                    if (i != 96)
                                                                    {
                                                                        if (i != 97)
                                                                        {
                                                                            if (i == 98)
                                                                                ((ItemDefinition) this).certTemplateID = class68_sub14.readUShort();
                                                                            else if (i >= 100 && i < 110)
                                                                            {
                                                                                if (((ItemDefinition) this).anIntArray343 == null)
                                                                                {
                                                                                    ((ItemDefinition) this).anIntArray353 = new int[10];
                                                                                    ((ItemDefinition) this).anIntArray343 = new int[10];
                                                                                }
                                                                                ((ItemDefinition) this).anIntArray343[i - 100] = class68_sub14.readUShort();
                                                                                ((ItemDefinition) this).anIntArray353[i - 100] = class68_sub14.readUShort();
                                                                            } else if (i == 110)
                                                                                anInt397 = class68_sub14.readUShort();
                                                                            else if (i == 111)
                                                                                anInt338 = class68_sub14.readUShort();
                                                                            else if (i != 112)
                                                                            {
                                                                                if (i == 113)
                                                                                    anInt363 = class68_sub14.readByte();
                                                                                else if (i == 114)
                                                                                    anInt348 = 5 * class68_sub14.readByte();
                                                                                else if (i == 115)
                                                                                    ((ItemDefinition) this).team = class68_sub14.readUByte();
                                                                                else if (i == 121)
                                                                                    ((ItemDefinition) this).anInt345 = class68_sub14.readUShort();
                                                                                else if (i == 122)
                                                                                    ((ItemDefinition) this).anInt339 = class68_sub14.readUShort();
                                                                                else if (i != 124)
                                                                                {
                                                                                    if (i == 125)
                                                                                    {
                                                                                        anInt352 = class68_sub14.readByte();
                                                                                        anInt370 = class68_sub14.readByte();
                                                                                        anInt384 = class68_sub14.readByte();
                                                                                    } else if (i != 126)
                                                                                    {
                                                                                        if (i == 249)
                                                                                        {
                                                                                            int i_7_ = class68_sub14.readUByte();
                                                                                            if (((ItemDefinition) this).aClass113_394 == null)
                                                                                            {
                                                                                                int i_8_ = Class90.method1523(i_7_, -21189);
                                                                                                ((ItemDefinition) this).aClass113_394 = new NodeCache(i_8_);
                                                                                            }
                                                                                            for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
                                                                                            {
                                                                                                boolean bool = class68_sub14.readUByte() == 1;
                                                                                                int i_10_ = class68_sub14.readTInteger();
                                                                                                Node class68;
                                                                                                if (bool)
                                                                                                    class68 = new Class68_Sub5(class68_sub14.readString());
                                                                                                else
                                                                                                    class68 = new Class68_Sub10(class68_sub14.readInteger());
                                                                                                ((ItemDefinition) this).aClass113_394.method1683((byte) -57, class68, (long) i_10_);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                    {
                                                                                        anInt374 = class68_sub14.readByte();
                                                                                        anInt327 = class68_sub14.readByte();
                                                                                        anInt360 = class68_sub14.readByte();
                                                                                    }
                                                                                } else
                                                                                {
                                                                                    if (((ItemDefinition) this).anIntArrayArray331 == null)
                                                                                        ((ItemDefinition) this).anIntArrayArray331 = new int[11][];
                                                                                    int i_11_ = class68_sub14.readUByte();
                                                                                    ((ItemDefinition) this).anIntArrayArray331[i_11_] = new int[6];
                                                                                    for (int i_12_ = 0; i_12_ < 6; i_12_++)
                                                                                        ((ItemDefinition) this).anIntArrayArray331[i_11_][i_12_] = class68_sub14.readShort();
                                                                                }
                                                                            } else
                                                                                anInt386 = class68_sub14.readUShort();
                                                                        } else
                                                                            ((ItemDefinition) this).anInt378 = class68_sub14.readUShort();
                                                                    } else
                                                                        ((ItemDefinition) this).anInt341 = class68_sub14.readUByte();
                                                                } else
                                                                    ((ItemDefinition) this).anInt355 = (class68_sub14.readUShort());
                                                            } else
                                                                anInt329 = (class68_sub14.readUShort());
                                                        } else
                                                            anInt388 = (class68_sub14.readUShort());
                                                    } else
                                                        anInt380 = (class68_sub14.readUShort());
                                                } else
                                                    ((ItemDefinition) this).aBoolean366 = true;
                                            } else
                                            {
                                                int i_13_ = class68_sub14.readUByte();
                                                aShortArray357 = new short[i_13_];
                                                aShortArray356 = new short[i_13_];
                                                for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
                                                {
                                                    aShortArray357[i_14_] = (short) (class68_sub14.readUShort());
                                                    aShortArray356[i_14_] = (short) (class68_sub14.readUShort());
                                                }
                                            }
                                        } else
                                        {
                                            ((ItemDefinition) this).groundActions[i - 30] = class68_sub14.readString();
                                            if (((ItemDefinition) this).groundActions[i - 30].method1606(false, Class13_Sub2.aClass100_2649))
                                                ((ItemDefinition) this).groundActions[i - 30] = null;
                                        }
                                    } else
                                        ((ItemDefinition) this).anInt387 = class68_sub14.readUShort();
                                } else
                                    ((ItemDefinition) this).anInt390 = class68_sub14.readUShort();
                            } else
                                ((ItemDefinition) this).anInt381 = 1;
                        } else
                        {
                            ((ItemDefinition) this).anInt391 = class68_sub14.readUShort();
                            if (((ItemDefinition) this).anInt391 > 32767)
                                ((ItemDefinition) this).anInt391 -= 65536;
                        }
                    } else
                    {
                        ((ItemDefinition) this).anInt358 = class68_sub14.readUShort();
                        if (((ItemDefinition) this).anInt358 <= 32767)
                            break;
                        ((ItemDefinition) this).anInt358 -= 65536;
                    }
                    break;
                }
                ((ItemDefinition) this).anInt395 = class68_sub14.readUShort();
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("cf.L(" + i + ',' + i_2_ + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
            }
        } while (false);
    }

    final SpriteFactory method305(int i)
    {
        Class1_Sub4 class1_sub4 = Class1_Sub4.method115(Class68_Sub26.aClass21_3193, anInt330, 0);
        anInt364++;
        if (class1_sub4 == null)
            return null;
        if (aShortArray342 != null)
        {
            for (int i_15_ = 0; i_15_ < aShortArray342.length; i_15_++)
            {
                if (aByteArray334 == null || i_15_ >= aByteArray334.length)
                    class1_sub4.method129(aShortArray342[i_15_], aShortArray332[i_15_]);
                else
                    class1_sub4.method129(aShortArray342[i_15_], (Class68_Sub20_Sub7.aShortArray4268[aByteArray334[i_15_] & 0xff]));
            }
        }
        if (aShortArray357 != null)
        {
            for (int i_16_ = 0; i_16_ < aShortArray357.length; i_16_++)
                class1_sub4.method110(aShortArray357[i_16_], aShortArray356[i_16_]);
        }
        SpriteFactory class1_sub3_sub1 = class1_sub4.method118(anInt363 + 64, anInt348 + 768, i, -10, -50);
        if (anInt397 != 128 || anInt338 != 128 || anInt386 != 128)
            class1_sub3_sub1.method72(anInt397, anInt338, anInt386);
        return class1_sub3_sub1;
    }

    final void method306(byte i, ItemDefinition class19_17_, ItemDefinition class19_18_)
    {
        try
        {
            ((ItemDefinition) this).anInt381 = 1;
            anInt330 = class19_18_.anInt330;
            aShortArray357 = class19_18_.aShortArray357;
            ((ItemDefinition) this).anInt391 = ((ItemDefinition) class19_18_).anInt391;
            ((ItemDefinition) this).anInt358 = ((ItemDefinition) class19_18_).anInt358;
            anInt351++;
            aShortArray342 = class19_18_.aShortArray342;
            ((ItemDefinition) this).anInt395 = ((ItemDefinition) class19_18_).anInt395;
            aShortArray356 = class19_18_.aShortArray356;
            ((ItemDefinition) this).anInt355 = ((ItemDefinition) class19_18_).anInt355;
            ((ItemDefinition) this).anInt375 = ((ItemDefinition) class19_17_).anInt375;
            aShortArray332 = class19_18_.aShortArray332;
            ((ItemDefinition) this).anInt336 = ((ItemDefinition) class19_18_).anInt336;
            ((ItemDefinition) this).membersObject = ((ItemDefinition) class19_17_).membersObject;
            aByteArray334 = class19_18_.aByteArray334;
            ((ItemDefinition) this).name = ((ItemDefinition) class19_17_).name;
            if (i <= -62)
                ((ItemDefinition) this).anInt389 = ((ItemDefinition) class19_18_).anInt389;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cf.O(" + i + ',' + (class19_17_ != null ? "{...}" : "null") + ',' + (class19_18_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method307(int i)
    {
        anInt333++;
        if (i != 1)
            aShortArray356 = null;
    }

    final boolean method308(boolean bool, int i)
    {
        anInt328++;
        int i_19_ = ((ItemDefinition) this).anInt390;
        int i_20_ = anInt347;
        if (i != -116)
            return false;
        int i_21_ = anInt377;
        if (bool)
        {
            i_20_ = anInt344;
            i_21_ = anInt380;
            i_19_ = ((ItemDefinition) this).anInt387;
        }
        if (i_19_ == -1)
            return true;
        boolean bool_22_ = true;
        if (!Class68_Sub26.aClass21_3193.method344(i_19_, 0, (byte) -127))
            bool_22_ = false;
        if (i_20_ != -1 && !Class68_Sub26.aClass21_3193.method344(i_20_, 0, (byte) -107))
            bool_22_ = false;
        if (i_21_ != -1 && !Class68_Sub26.aClass21_3193.method344(i_21_, 0, (byte) -125))
            bool_22_ = false;
        return bool_22_;
    }

    final void method309(byte i, Stream class68_sub14)
    {
        try
        {
            for (;;)
            {
                int i_23_ = class68_sub14.readUByte();
                if (i_23_ == 0)
                    break;
                method304(i_23_, (byte) -39, class68_sub14);
            }
            if (i != -7)
                ((ItemDefinition) this).anInt395 = -16;
            anInt392++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cf.E(" + i + ',' + (class68_sub14 != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method310(boolean bool, byte i)
    {
        if (i != 75)
            return false;
        int i_24_ = anInt388;
        int i_25_ = anInt329;
        if (bool)
        {
            i_24_ = anInt337;
            i_25_ = anInt349;
        }
        anInt372++;
        if (i_24_ == -1)
            return true;
        boolean bool_26_ = true;
        if (!Class68_Sub26.aClass21_3193.method344(i_24_, 0, (byte) -105))
            bool_26_ = false;
        if (i_25_ != -1 && !Class68_Sub26.aClass21_3193.method344(i_25_, 0, (byte) -128))
            bool_26_ = false;
        return bool_26_;
    }

    final void method311(ItemDefinition class19_27_, int i, ItemDefinition class19_28_)
    {
        try
        {
            ((ItemDefinition) this).team = ((ItemDefinition) class19_28_).team;
            anInt329 = class19_28_.anInt329;
            anInt349 = class19_28_.anInt349;
            anInt370 = class19_28_.anInt370;
            ((ItemDefinition) this).anInt358 = ((ItemDefinition) class19_27_).anInt358;
            ((ItemDefinition) this).anInt387 = ((ItemDefinition) class19_28_).anInt387;
            ((ItemDefinition) this).anInt389 = ((ItemDefinition) class19_27_).anInt389;
            ((ItemDefinition) this).anInt375 = 0;
            anInt330 = class19_27_.anInt330;
            anInt388 = class19_28_.anInt388;
            ((ItemDefinition) this).groundActions = ((ItemDefinition) class19_28_).groundActions;
            anInt384 = class19_28_.anInt384;
            anInt374 = class19_28_.anInt374;
            aShortArray342 = class19_28_.aShortArray342;
            anInt377 = class19_28_.anInt377;
            anInt360 = class19_28_.anInt360;
            anInt327 = class19_28_.anInt327;
            aShortArray356 = class19_28_.aShortArray356;
            if (i != -50)
                method308(true, -108);
            anInt337 = class19_28_.anInt337;
            ((ItemDefinition) this).anInt355 = ((ItemDefinition) class19_27_).anInt355;
            aShortArray332 = class19_28_.aShortArray332;
            ((ItemDefinition) this).name = ((ItemDefinition) class19_28_).name;
            anInt352 = class19_28_.anInt352;
            anInt347 = class19_28_.anInt347;
            ((ItemDefinition) this).aClass113_394 = ((ItemDefinition) class19_28_).aClass113_394;
            ((ItemDefinition) this).anInt391 = ((ItemDefinition) class19_27_).anInt391;
            anInt344 = class19_28_.anInt344;
            anInt361++;
            aShortArray357 = class19_28_.aShortArray357;
            ((ItemDefinition) this).anInt395 = ((ItemDefinition) class19_27_).anInt395;
            ((ItemDefinition) this).anInt336 = ((ItemDefinition) class19_27_).anInt336;
            ((ItemDefinition) this).actions = new MutableString[5];
            anInt380 = class19_28_.anInt380;
            aByteArray334 = class19_28_.aByteArray334;
            ((ItemDefinition) this).anInt390 = ((ItemDefinition) class19_28_).anInt390;
            ((ItemDefinition) this).membersObject = ((ItemDefinition) class19_28_).membersObject;
            if (((ItemDefinition) class19_28_).actions != null)
            {
                for (int i_29_ = 0; i_29_ < 4; i_29_++)
                    ((ItemDefinition) this).actions[i_29_] = ((ItemDefinition) class19_28_).actions[i_29_];
            }
            ((ItemDefinition) this).actions[4] = Class68_Sub20_Sub13_Sub2.aClass100_4626;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cf.I(" + (class19_27_ != null ? "{...}" : "null") + ',' + i + ',' + (class19_28_ != null ? "{...}" : "null") + ')'));
        }
    }

    final MutableString method312(MutableString class100, byte i, int i_30_)
    {
        try
        {
            anInt346++;
            if (((ItemDefinition) this).aClass113_394 == null)
                return class100;
            if (i != 21)
                method314(23, 81);
            Class68_Sub5 class68_sub5 = ((Class68_Sub5) ((ItemDefinition) this).aClass113_394.method1684((long) i_30_, -123));
            if (class68_sub5 == null)
                return class100;
            return ((Class68_Sub5) class68_sub5).aClass100_2832;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cf.N(" + (class100 != null ? "{...}" : "null") + ',' + i + ',' + i_30_ + ')'));
        }
    }

    public static void method313(int i)
    {
        aClass100_368 = null;
        aClass100_396 = null;
        if (i != -1)
            aClass100_368 = null;
        anIntArray376 = null;
    }

    static final void method314(int i, int i_31_)
    {
        anInt367++;
        if (i_31_ != -1 && GameSocket.validWidgets[i_31_])
        {
            client.aClass21_2382.method341(i_31_, i ^ i);
            if (Class68_Sub13_Sub36.widgetCache[i_31_] != null)
            {
                boolean bool = true;
                for (int i_32_ = 0; (Class68_Sub13_Sub36.widgetCache[i_31_].length > i_32_); i_32_++)
                {
                    if ((Class68_Sub13_Sub36.widgetCache[i_31_][i_32_]) != null)
                    {
                        if (((Widget) (Class68_Sub13_Sub36.widgetCache[i_31_][i_32_])).type != 2)
                            Class68_Sub13_Sub36.widgetCache[i_31_][i_32_] = null;
                        else
                            bool = false;
                    }
                }
                if (bool)
                    Class68_Sub13_Sub36.widgetCache[i_31_] = null;
                GameSocket.validWidgets[i_31_] = false;
            }
        }
    }

    static final void method315(int i)
    {
        int i_33_ = -75 / ((-68 - i) / 45);
        anInt335++;
        synchronized (Class63.anObject1169)
        {
            if (Class9.anInt169 != 0)
            {
                Class9.anInt169 = 1;
                try
                {
                    Class63.anObject1169.wait();
                } catch (InterruptedException interruptedexception)
                {
                    /* empty */
                }
            }
        }
    }

    final Class1_Sub4 method316(int i, boolean bool)
    {
        if (i != -31779)
            return null;
        int i_34_ = anInt388;
        anInt382++;
        int i_35_ = anInt329;
        if (bool)
        {
            i_34_ = anInt337;
            i_35_ = anInt349;
        }
        if (i_34_ == -1)
            return null;
        Class1_Sub4 class1_sub4 = Class1_Sub4.method115(Class68_Sub26.aClass21_3193, i_34_, 0);
        if (i_35_ != -1)
        {
            Class1_Sub4 class1_sub4_36_ = Class1_Sub4.method115(Class68_Sub26.aClass21_3193, i_35_, 0);
            Class1_Sub4[] class1_sub4s = { class1_sub4, class1_sub4_36_ };
            class1_sub4 = new Class1_Sub4(class1_sub4s, 2);
        }
        if (aShortArray342 != null)
        {
            for (int i_37_ = 0; i_37_ < aShortArray342.length; i_37_++)
                class1_sub4.method129(aShortArray342[i_37_], aShortArray332[i_37_]);
        }
        if (aShortArray357 != null)
        {
            for (int i_38_ = 0; i_38_ < aShortArray357.length; i_38_++)
                class1_sub4.method110(aShortArray357[i_38_], aShortArray356[i_38_]);
        }
        return class1_sub4;
    }

    final ItemDefinition method317(int i, int i_39_)
    {
        anInt379++;
        if (i_39_ != -126)
            method303(109, (byte) 24, -67);
        if (((ItemDefinition) this).anIntArray343 != null && i > 1)
        {
            int i_40_ = -1;
            for (int i_41_ = 0; i_41_ < 10; i_41_++)
            {
                if (((ItemDefinition) this).anIntArray353[i_41_] <= i && ((ItemDefinition) this).anIntArray353[i_41_] != 0)
                    i_40_ = ((ItemDefinition) this).anIntArray343[i_41_];
            }
            if (i_40_ != -1)
                return GameApplet.method18(-25672, i_40_);
        }
        return this;
    }

    final Model method318(int i, Animation class117, int i_42_, int i_43_)
    {
        try
        {
            anInt393++;
            if (i_43_ != 13895)
                ((ItemDefinition) this).anInt381 = 83;
            if (((ItemDefinition) this).anIntArray343 != null && i > 1)
            {
                int i_44_ = -1;
                for (int i_45_ = 0; i_45_ < 10; i_45_++)
                {
                    if (i >= ((ItemDefinition) this).anIntArray353[i_45_] && ((ItemDefinition) this).anIntArray353[i_45_] != 0)
                        i_44_ = ((ItemDefinition) this).anIntArray343[i_45_];
                }
                if (i_44_ != -1)
                    return GameApplet.method18(-25672, i_44_).method318(1, class117, i_42_, 13895);
            }
            Model class1_sub3 = ((Model) Keyboard.aClass98_2131.getNodeForID((long) ((ItemDefinition) this).id));
            if (class1_sub3 == null)
            {
                Class1_Sub4 class1_sub4 = Class1_Sub4.method115(Class68_Sub26.aClass21_3193, anInt330, 0);
                if (class1_sub4 == null)
                    return null;
                if (aShortArray342 != null)
                {
                    for (int i_46_ = 0; i_46_ < aShortArray342.length; i_46_++)
                    {
                        if (aByteArray334 != null && i_46_ < aByteArray334.length)
                            class1_sub4.method129(aShortArray342[i_46_], (Class68_Sub20_Sub7.aShortArray4268[0xff & (aByteArray334[i_46_])]));
                        else
                            class1_sub4.method129(aShortArray342[i_46_], aShortArray332[i_46_]);
                    }
                }
                if (aShortArray357 != null)
                {
                    for (int i_47_ = 0; i_47_ < aShortArray357.length; i_47_++)
                        class1_sub4.method110(aShortArray357[i_47_], aShortArray356[i_47_]);
                }
                class1_sub3 = class1_sub4.method127(anInt363 + 64, anInt348 + 768, -50, -10, -50);
                if (anInt397 != 128 || anInt338 != 128 || anInt386 != 128)
                    class1_sub3.method72(anInt397, anInt338, anInt386);
                ((Model) class1_sub3).aBoolean2445 = true;
                Keyboard.aClass98_2131.addObject(class1_sub3, (long) (((ItemDefinition) this).id));
            }
            if (class117 != null)
                class1_sub3 = class117.method1728((byte) -127, class1_sub3, i_42_);
            return class1_sub3;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("cf.A(" + i + ',' + (class117 != null ? "{...}" : "null") + ',' + i_42_ + ',' + i_43_ + ')'));
        }
    }

    final Class1_Sub4 method319(boolean bool, byte i)
    {
        int i_48_ = ((ItemDefinition) this).anInt390;
        anInt373++;
        int i_49_ = anInt347;
        int i_50_ = anInt377;
        if (bool)
        {
            i_48_ = ((ItemDefinition) this).anInt387;
            i_49_ = anInt344;
            i_50_ = anInt380;
        }
        if (i_48_ == -1)
            return null;
        Class1_Sub4 class1_sub4 = Class1_Sub4.method115(Class68_Sub26.aClass21_3193, i_48_, 0);
        if (i_49_ != -1)
        {
            Class1_Sub4 class1_sub4_51_ = Class1_Sub4.method115(Class68_Sub26.aClass21_3193, i_49_, 0);
            if (i_50_ == -1)
            {
                Class1_Sub4[] class1_sub4s = { class1_sub4, class1_sub4_51_ };
                class1_sub4 = new Class1_Sub4(class1_sub4s, 2);
            } else
            {
                Class1_Sub4 class1_sub4_52_ = Class1_Sub4.method115(Class68_Sub26.aClass21_3193, i_50_, 0);
                Class1_Sub4[] class1_sub4s = { class1_sub4, class1_sub4_51_, class1_sub4_52_ };
                class1_sub4 = new Class1_Sub4(class1_sub4s, 3);
            }
        }
        int i_53_ = 39 / ((i - 47) / 52);
        if (!bool && (anInt352 != 0 || anInt370 != 0 || anInt384 != 0))
            class1_sub4.method128(anInt352, anInt370, anInt384);
        if (bool && (anInt374 != 0 || anInt327 != 0 || anInt360 != 0))
            class1_sub4.method128(anInt374, anInt327, anInt360);
        if (aShortArray342 != null)
        {
            for (int i_54_ = 0; aShortArray342.length > i_54_; i_54_++)
                class1_sub4.method129(aShortArray342[i_54_], aShortArray332[i_54_]);
        }
        if (aShortArray357 != null)
        {
            for (int i_55_ = 0; i_55_ < aShortArray357.length; i_55_++)
                class1_sub4.method110(aShortArray357[i_55_], aShortArray356[i_55_]);
        }
        return class1_sub4;
    }

    public ItemDefinition()
    {
        anInt338 = 128;
        anInt344 = -1;
        ((ItemDefinition) this).anInt336 = 2000;
        ((ItemDefinition) this).anInt339 = -1;
        ((ItemDefinition) this).aBoolean366 = false;
        ((ItemDefinition) this).anInt345 = -1;
        ((ItemDefinition) this).membersObject = false;
        ((ItemDefinition) this).groundActions = new MutableString[] { null, null, Class68_Sub13_Sub24.aClass100_3836, null, null };
        anInt349 = -1;
        anInt337 = -1;
        ((ItemDefinition) this).actions = new MutableString[] { null, null, null, null, Class122.aClass100_2114 };
        anInt360 = 0;
        anInt329 = -1;
        anInt377 = -1;
        anInt347 = -1;
        ((ItemDefinition) this).anInt355 = 0;
        ((ItemDefinition) this).anInt378 = -1;
        ((ItemDefinition) this).anInt381 = 0;
        anInt374 = 0;
        ((ItemDefinition) this).name = Class68_Sub7.aClass100_2860;
        anInt363 = 0;
        ((ItemDefinition) this).anInt389 = 0;
        ((ItemDefinition) this).anInt358 = 0;
        anInt352 = 0;
        anInt380 = -1;
        ((ItemDefinition) this).anInt390 = -1;
        anInt370 = 0;
        ((ItemDefinition) this).anInt391 = 0;
        anInt386 = 128;
        anInt388 = -1;
        ((ItemDefinition) this).anInt375 = 1;
        anInt384 = 0;
        ((ItemDefinition) this).anInt387 = -1;
        ((ItemDefinition) this).team = 0;
        ((ItemDefinition) this).certTemplateID = -1;
        ((ItemDefinition) this).anInt395 = 0;
        anInt397 = 128;
    }
}
