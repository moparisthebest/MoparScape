/* Class1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class1_Sub5 extends Animable
{
    int anInt2495;
    static int anInt2496;
    private Animation aClass117_2497;
    static Class72 aClass72_2498;
    static int anInt2499;
    static int anInt2500;
    private int anInt2501;
    static int anInt2502;
    static int anInt2503;
    private int anInt2504 = 0;
    int anInt2505;
    static int anInt2506;
    int anInt2507;
    int anInt2508;
    static int anInt2509;
    static int anInt2510;
    static NodeCache aClass113_2511;
    private int anInt2512;
    private int anInt2513;
    boolean aBoolean2514;
    int anInt2515;
    static int anInt2516 = -1;
    static Widget aClass45_2517;
    static int[] skillExperiences;

    public static void method137(int i)
    {
        aClass72_2498 = null;
        skillExperiences = null;
        aClass45_2517 = null;
        if (i != 2)
            skillExperiences = null;
        aClass113_2511 = null;
    }

    static final void method138(int i)
    {
        Object3.anInt944 = i;
        for (int i_0_ = 0; i_0_ < GameApplet.anInt7; i_0_++)
        {
            for (int i_1_ = 0; i_1_ < Class97.anInt1716; i_1_++)
            {
                if (Class22.groundArray[i][i_0_][i_1_] == null)
                    Class22.groundArray[i][i_0_][i_1_] = new Ground(i, i_0_, i_1_);
            }
        }
    }

    final int method56()
    {
        anInt2499++;
        return anInt2512;
    }

    final void render(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, long l)
    {
        anInt2500++;
        Model class1_sub3 = method143(119);
        if (class1_sub3 != null)
        {
            class1_sub3.render(i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, l);
            anInt2512 = class1_sub3.method56();
        }
    }

    final void method139(int i, boolean bool)
    {
        anInt2496++;
        if (!((Class1_Sub5) this).aBoolean2514)
        {
            anInt2504 += i;
            if (bool == false)
            {
                while (anInt2504 > (((Animation) aClass117_2497).anIntArray2060[anInt2501]))
                {
                    anInt2504 -= (((Animation) aClass117_2497).anIntArray2060[anInt2501]);
                    anInt2501++;
                    if (((Animation) aClass117_2497).anIntArray2037.length <= anInt2501)
                    {
                        ((Class1_Sub5) this).aBoolean2514 = true;
                        break;
                    }
                }
            }
        }
    }

    static final ObjectDefinition method140(int i, int i_9_)
    {
        anInt2506++;
        ObjectDefinition class116 = (ObjectDefinition) Class68_Sub20_Sub12.objectDefinitionNodes.getNodeForID((long) i_9_);
        if (class116 != null)
            return class116;
        byte[] is = (Class68_Sub28_Sub1.aClass21_4480.method338(Class106.method1652(i_9_, false), 0, Class68_Sub15.method977(28443, i_9_)));
        class116 = new ObjectDefinition();
        ((ObjectDefinition) class116).type = i_9_;
        if (is != null)
            class116.method1717((byte) 29, new Stream(is));
        class116.method1712(-129);
        if (!Class68_Sub27.aBoolean3222 && ((ObjectDefinition) class116).aBoolean1980)
            ((ObjectDefinition) class116).actions = null;
        if (((ObjectDefinition) class116).aBoolean1970)
        {
            ((ObjectDefinition) class116).anInt2024 = 0;
            ((ObjectDefinition) class116).aBoolean2032 = false;
        }
        Class68_Sub20_Sub12.objectDefinitionNodes.addObject(class116, (long) i_9_);
        if (i < 79)
            anInt2516 = -82;
        return class116;
    }

    static final void method141(Stream class68_sub14, byte i)
    {
        do
        {
            try
            {
                anInt2510++;
                if ((((Stream) class68_sub14).buffer.length - ((Stream) class68_sub14).position) >= 1)
                {
                    int i_10_ = class68_sub14.readUByte();
                    if (i_10_ >= 0 && i_10_ <= 3)
                    {
                        int i_11_;
                        if (i_10_ == 3)
                            i_11_ = 23;
                        else if (i_10_ == 2)
                            i_11_ = 22;
                        else if (i_10_ != 1)
                            i_11_ = 19;
                        else
                            i_11_ = 23;
                        if (i_11_ <= ((((Stream) class68_sub14).buffer).length - ((Stream) class68_sub14).position))
                        {
                            Widget.anInt919 = class68_sub14.readUByte();
                            if (Widget.anInt919 >= 1)
                            {
                                if (Widget.anInt919 > 4)
                                    Widget.anInt919 = 4;
                            } else
                                Widget.anInt919 = 1;
                            if (i <= 89)
                                skillExperiences = null;
                            Class75_Sub3_Sub1.method1403((class68_sub14.readUByte() == 1), 1);
                            Class68_Sub20_Sub2.aBoolean4190 = class68_sub14.readUByte() == 1;
                            RandomNumberGenerator.aBoolean1489 = class68_sub14.readUByte() == 1;
                            Item.aBoolean2434 = class68_sub14.readUByte() == 1;
                            MutableString.aBoolean2264 = class68_sub14.readUByte() == 1;
                            Class68_Sub13_Sub2.aBoolean3462 = class68_sub14.readUByte() == 1;
                            Class68_Sub22.aBoolean3151 = class68_sub14.readUByte() == 1;
                            Class68_Sub20_Sub13_Sub2.aBoolean4631 = class68_sub14.readUByte() == 1;
                            Class68_Sub13_Sub26.anInt3878 = class68_sub14.readUByte();
                            if (Class68_Sub13_Sub26.anInt3878 > 2)
                                Class68_Sub13_Sub26.anInt3878 = 2;
                            if (i_10_ < 2)
                            {
                                Class68_Sub28_Sub1.aBoolean4523 = class68_sub14.readUByte() == 1;
                                class68_sub14.readUByte();
                            } else
                                Class68_Sub28_Sub1.aBoolean4523 = class68_sub14.readUByte() == 1;
                            Class68_Sub6.aBoolean2840 = class68_sub14.readUByte() == 1;
                            Class43.aBoolean741 = class68_sub14.readUByte() == 1;
                            Object5.anInt1245 = class68_sub14.readUByte();
                            if (Object5.anInt1245 > 2)
                                Object5.anInt1245 = 2;
                            Class74.aBoolean1324 = class68_sub14.readUByte() == 1;
                            Class106.anInt1803 = class68_sub14.readUByte();
                            if (Class106.anInt1803 > 127)
                                Class106.anInt1803 = 127;
                            Class68_Sub13_Sub25.anInt3857 = class68_sub14.readUByte();
                            Class68_Sub20_Sub15.anInt4401 = class68_sub14.readUByte();
                            if (Class68_Sub20_Sub15.anInt4401 > 127)
                                Class68_Sub20_Sub15.anInt4401 = 127;
                            if (i_10_ >= 1)
                            {
                                Mouse.anInt1573 = class68_sub14.readUShort();
                                Class54.anInt1032 = class68_sub14.readUShort();
                            }
                            if (i_10_ < 3)
                                break;
                            Class68_Sub13_Sub21.aBoolean3795 = class68_sub14.readUByte() == 1;
                        }
                    }
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("qe.C(" + (class68_sub14 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    static final void method142(int i, Widget[] class45s, int i_12_)
    {
        try
        {
            anInt2509++;
            if (i_12_ != 16)
                anInt2502 = -106;
            int i_13_ = 0;
            for (/**/; i_13_ < class45s.length; i_13_++)
            {
                Widget class45 = class45s[i_13_];
                if (class45 != null)
                {
                    if (((Widget) class45).type == 0)
                    {
                        if (((Widget) class45).widgetCache != null)
                            method142(i, ((Widget) class45).widgetCache, i_12_);
                        Class68_Sub3 class68_sub3 = ((Class68_Sub3) (Login.aClass113_1514.method1684((long) ((Widget) class45).anInt792, -63)));
                        if (class68_sub3 != null)
                            GameException.method1802(113, (((Class68_Sub3) class68_sub3).anInt2805), i);
                    }
                    if (i == 0 && ((Widget) class45).anObjectArray897 != null)
                    {
                        ScriptParameters class68_sub29 = new ScriptParameters();
                        ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                        ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray897;
                        Class68_Sub13_Sub16.method776(class68_sub29, 16);
                    }
                    if (i == 1 && ((Widget) class45).anObjectArray770 != null)
                    {
                        if (((Widget) class45).anInt867 >= 0)
                        {
                            Widget class45_14_ = Class68_Sub20_Sub15.method1170((((Widget) class45).anInt792), (byte) -80);
                            if (class45_14_ == null || (((Widget) class45_14_).widgetCache == null) || ((((Widget) class45_14_).widgetCache).length <= ((Widget) class45).anInt867) || (((Widget) class45_14_).widgetCache[((Widget) class45).anInt867]) != class45)
                                continue;
                        }
                        ScriptParameters class68_sub29 = new ScriptParameters();
                        ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray770;
                        ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                        Class68_Sub13_Sub16.method776(class68_sub29, 16);
                    }
                }
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("qe.I(" + i + ',' + (class45s != null ? "{...}" : "null") + ',' + i_12_ + ')'));
        }
    }

    private final Model method143(int i)
    {
        anInt2503++;
        if (i <= 111)
            aClass113_2511 = null;
        Class70 class70 = Class68_Sub20_Sub13.method1160(anInt2513, 1);
        Model class1_sub3;
        do
        {
            if (((Class1_Sub5) this).aBoolean2514)
            {
                class1_sub3 = class70.method1337(-1, -10);
                if (client.anInt2387 == 0)
                    break;
            }
            class1_sub3 = class70.method1337(anInt2501, -10);
        } while (false);
        if (class1_sub3 == null)
            return null;
        return class1_sub3;
    }

    Class1_Sub5(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_)
    {
        anInt2501 = 0;
        anInt2512 = -32768;
        ((Class1_Sub5) this).aBoolean2514 = false;
        ((Class1_Sub5) this).anInt2508 = i_15_;
        ((Class1_Sub5) this).anInt2515 = i_16_;
        ((Class1_Sub5) this).anInt2505 = i_20_ + i_19_;
        anInt2513 = i;
        ((Class1_Sub5) this).anInt2495 = i_18_;
        ((Class1_Sub5) this).anInt2507 = i_17_;
        int i_21_ = (((Class70) Class68_Sub20_Sub13.method1160(anInt2513, 1)).anInt1282);
        if (i_21_ != -1)
        {
            ((Class1_Sub5) this).aBoolean2514 = false;
            aClass117_2497 = Object1.getAnimation(i_21_);
        } else
            ((Class1_Sub5) this).aBoolean2514 = true;
    }

    static
    {
        aClass113_2511 = new NodeCache(16);
        skillExperiences = new int[25];
    }
}
