/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

final class GameCanvas extends Canvas
{
    static int cameraPitch;
    static int anInt46;
    static int anInt47;
    static int anInt48 = 0;
    static int anInt49;
    static int anInt50;
    static MutableString aClass100_51 = Class112.makeMutableString(43, "hint_mapmarkers");
    static int anInt52;
    private Component gameComponent;

    static final void method46(Signlink class55, Object object, byte i)
    {
        do
        {
            try
            {
                if (i >= -49)
                    method48((byte) -99);
                anInt49++;
                if (class55.eventQueue != null)
                {
                    for (int i_0_ = 0; (i_0_ < 50 && class55.eventQueue.peekEvent() != null); i_0_++)
                        Class50.method528(-5, 1L);
                    if (object == null)
                        break;
                    class55.eventQueue.postEvent(new ActionEvent(object, 1001, "dummy"));
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("hc.D(" + (class55 != null ? "{...}" : "null") + ',' + (object != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public final void paint(Graphics graphics)
    {
        try
        {
            anInt50++;
            gameComponent.paint(graphics);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "hc.paint(" + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    static final void method47(boolean bool, int i)
    {
        Class11.method234((byte) 99, Class68_Sub13_Sub9.appletHeight, bool, Class13_Sub3.appletWidth, Class68_Sub13_Sub10.anInt3597);
        anInt52++;
        if (i != 640)
            cameraPitch = 80;
    }

    public static void method48(byte i)
    {
        aClass100_51 = null;
    }

    public final void update(Graphics graphics)
    {
        try
        {
            gameComponent.update(graphics);
            anInt46++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hc.update(" + (graphics != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method49(Widget class45, int i, int i_2_, int i_3_, byte i_4_)
    {
        try
        {
            Class49.method524(16322);
            anInt47++;
            Class79.method1433(i, i_2_, ((Widget) class45).anInt892 + i, ((Widget) class45).anInt873 + i_2_);
            if (i_4_ < -9)
            {
                if (Class68_Sub9.anInt2884 == 2 || Class68_Sub9.anInt2884 == 5 || GameSocket.minimapSprite == null)
                    Class79.method1425(i, i_2_, 0, ((Widget) class45).anIntArray854, ((Widget) class45).anIntArray783);
                else
                {
                    int i_5_ = ((((Character) Class68_Sub7.localPlayer).x) / 32 + 48);
                    int i_6_ = (0x7ff & Class8.minimapInt2 + Class68_Sub13_Sub26.minimapInt1);
                    int i_7_ = 464 - (((Character) Class68_Sub7.localPlayer).y) / 32;
                    ((Sprite) GameSocket.minimapSprite).method1132(i, i_2_, ((Widget) class45).anInt892, ((Widget) class45).anInt873, i_5_, i_7_, i_6_, Class68_Sub20_Sub16.minimapInt3 + 256, ((Widget) class45).anIntArray854, ((Widget) class45).anIntArray783);
                    if (Class68_Sub13_Sub21.aClass91_3790 != null)
                    {
                        for (int i_8_ = 0; (i_8_ < (((Class91) Class68_Sub13_Sub21.aClass91_3790).anInt1639)); i_8_++)
                        {
                            if (Class68_Sub13_Sub21.aClass91_3790.method1527((byte) 95, i_8_))
                            {
                                int i_9_ = (4 * ((((Class91) (Class68_Sub13_Sub21.aClass91_3790)).aShortArray1636[i_8_]) - Class68_Sub13_Sub35.baseY) + 2 - (((Character) Class68_Sub7.localPlayer).y) / 32);
                                int i_10_ = (2 - (((Character) Class68_Sub7.localPlayer).x) / 32 + ((((Class91) Class68_Sub13_Sub21.aClass91_3790).aShortArray1633[i_8_]) - Class36.baseX) * 4);
                                int i_11_ = Class62.PRECOMPUTED_SINE_CACHE[i_6_];
                                int i_12_ = Class62.PRECOMUPTED_COSINE_CACHE[i_6_];
                                i_12_ = (256 * i_12_ / (Class68_Sub20_Sub16.minimapInt3 + 256));
                                Class68_Sub20_Sub1 class68_sub20_sub1 = (Class68_Sub13_Sub21.aClass68_Sub20_Sub1_3803);
                                i_11_ = (256 * i_11_ / (Class68_Sub20_Sub16.minimapInt3 + 256));
                                int i_13_ = i_9_ * i_11_ + i_10_ * i_12_ >> 16;
                                int i_14_ = i_12_ * i_9_ - i_11_ * i_10_ >> 16;
                                if (Class68_Sub13_Sub21.aClass91_3790.method1531(126, i_8_) == 1)
                                    class68_sub20_sub1 = (Class68_Sub6.aClass68_Sub20_Sub1_2849);
                                if (Class68_Sub13_Sub21.aClass91_3790.method1531(-21, i_8_) == 2)
                                    class68_sub20_sub1 = (Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513);
                                int i_15_ = (class68_sub20_sub1.method1018((((Class91) (Class68_Sub13_Sub21.aClass91_3790)).aClass100Array1637[i_8_]), 100));
                                i_13_ -= i_15_ / 2;
                                if (-((Widget) class45).anInt892 <= i_13_ && i_13_ <= ((Widget) class45).anInt892 && i_14_ >= -((Widget) class45).anInt873 && ((Widget) class45).anInt873 >= i_14_)
                                {
                                    int i_16_ = 16777215;
                                    if ((((Class91) Class68_Sub13_Sub21.aClass91_3790).anIntArray1642[i_8_]) != -1)
                                        i_16_ = (((Class91) (Class68_Sub13_Sub21.aClass91_3790)).anIntArray1642[i_8_]);
                                    Class79.method1430((((Widget) class45).anIntArray854), (((Widget) class45).anIntArray783));
                                    class68_sub20_sub1.method1034((((Class91) Class68_Sub13_Sub21.aClass91_3790).aClass100Array1637[i_8_]), (i_13_ + i + ((Widget) class45).anInt892 / 2), (i_2_ + ((Widget) class45).anInt873 / 2 - i_14_), i_15_, 50, i_16_, 0, 256, 1, 0, 0);
                                    Class79.method1444();
                                }
                            }
                        }
                    }
                    for (int i_17_ = 0; Class52.anInt1006 > i_17_; i_17_++)
                    {
                        int i_18_ = (NodeCache.anIntArray1923[i_17_] * 4 - (((Character) Class68_Sub7.localPlayer).y) / 32 + 2);
                        int i_19_ = (2 - (((Character) Class68_Sub7.localPlayer).x) / 32 + Class95.anIntArray1685[i_17_] * 4);
                        ObjectDefinition class116 = Class1_Sub5.method140(95, (Class68_Sub20_Sub19.anIntArray4454[i_17_]));
                        if (((ObjectDefinition) class116).childrenIDs != null)
                        {
                            class116 = class116.method1716(-1);
                            if (class116 == null || ((ObjectDefinition) class116).anInt1982 == -1)
                                continue;
                        }
                        Class33.method413(i_18_, -69, class45, i, i_19_, (Class68_Sub13_Sub11.mapMarkers[((ObjectDefinition) class116).anInt1982]), i_2_);
                    }
                    for (int i_20_ = 0; i_20_ < 104; i_20_++)
                    {
                        for (int i_21_ = 0; i_21_ < 104; i_21_++)
                        {
                            NodeList class16 = (Widget.groundItems[GameSocket.plane][i_20_][i_21_]);
                            if (class16 != null)
                            {
                                int i_22_ = (4 * i_21_ + 2 - (((Character) Class68_Sub7.localPlayer).y) / 32);
                                int i_23_ = (4 * i_20_ + 2 - (((Character) Class68_Sub7.localPlayer).x) / 32);
                                Class33.method413(i_22_, -35, class45, i, i_23_, Class112.minimapDots[0], i_2_);
                            }
                        }
                    }
                    for (int i_24_ = 0; i_24_ < Class13_Sub2.localNPCCount; i_24_++)
                    {
                        NPC class1_sub6_sub1 = (Class102.localNPCs[Class68_Sub10.localNPCIndices[i_24_]]);
                        if (class1_sub6_sub1 != null && class1_sub6_sub1.hasDefinition())
                        {
                            NPCDefinition class80 = (((NPC) class1_sub6_sub1).definition);
                            if (class80 != null && ((NPCDefinition) class80).anIntArray1433 != null)
                                class80 = class80.method1453(-94);
                            if (class80 != null && ((NPCDefinition) class80).aBoolean1440 && ((NPCDefinition) class80).aBoolean1435)
                            {
                                int i_25_ = ((((Character) class1_sub6_sub1).x) / 32 - (((Character) Class68_Sub7.localPlayer).x) / 32);
                                int i_26_ = ((((Character) class1_sub6_sub1).y) / 32 - (((Character) Class68_Sub7.localPlayer).y) / 32);
                                Class33.method413(i_26_, -89, class45, i, i_25_, Class112.minimapDots[1], i_2_);
                            }
                        }
                    }
                    for (int i_27_ = 0; i_27_ < client.localPlayerCount; i_27_++)
                    {
                        Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[Class85.localPlayerIndices[i_27_]]);
                        if (class1_sub6_sub2 != null && class1_sub6_sub2.hasDefinition())
                        {
                            int i_28_ = ((((Character) class1_sub6_sub2).x / 32) - (((Character) Class68_Sub7.localPlayer).x) / 32);
                            boolean bool = false;
                            int i_29_ = ((((Character) class1_sub6_sub2).y / 32) - (((Character) Class68_Sub7.localPlayer).y) / 32);
                            long l = ((Player) class1_sub6_sub2).name.method1615(10908);
                            for (int i_30_ = 0; Class32.friendCount > i_30_; i_30_++)
                            {
                                if ((Class68_Sub13_Sub21.friendList[i_30_] == l) && MRUNodes.friendNodeIDs[i_30_] != 0)
                                {
                                    bool = true;
                                    break;
                                }
                            }
                            boolean bool_31_ = false;
                            if ((((Player) Class68_Sub7.localPlayer).anInt3433) != 0 && (((Player) class1_sub6_sub2).anInt3433) != 0 && ((((Player) Class68_Sub7.localPlayer).anInt3433) == (((Player) class1_sub6_sub2).anInt3433)))
                                bool_31_ = true;
                            if (!bool)
                            {
                                if (!bool_31_)
                                    Class33.method413(i_29_, -52, class45, i, i_28_, (Class112.minimapDots[2]), i_2_);
                                else
                                    Class33.method413(i_29_, -92, class45, i, i_28_, (Class112.minimapDots[4]), i_2_);
                            } else
                                Class33.method413(i_29_, -27, class45, i, i_28_, Class112.minimapDots[3], i_2_);
                        }
                    }
                    Class23[] class23s = Class34.aClass23Array594;
                    for (int i_32_ = 0; class23s.length > i_32_; i_32_++)
                    {
                        Class23 class23 = class23s[i_32_];
                        if (class23 != null && ((Class23) class23).anInt489 != 0 && Class68_Sub3.loopCycle % 20 < 10)
                        {
                            if (((Class23) class23).anInt489 == 1 && ((Class23) class23).anInt493 >= 0 && (((Class23) class23).anInt493 < (Class102.localNPCs).length))
                            {
                                NPC class1_sub6_sub1 = (Class102.localNPCs[((Class23) class23).anInt493]);
                                if (class1_sub6_sub1 != null)
                                {
                                    int i_33_ = ((((Character) class1_sub6_sub1).x) / 32 - (((Character) (Class68_Sub7.localPlayer)).x) / 32);
                                    int i_34_ = ((((Character) class1_sub6_sub1).y) / 32 - (((Character) (Class68_Sub7.localPlayer)).y) / 32);
                                    Class53.method551((((Class23) class23).anInt499), (byte) 122, i_33_, class45, i_2_, i, i_34_);
                                }
                            }
                            if (((Class23) class23).anInt489 == 2)
                            {
                                int i_35_ = ((((Class23) class23).anInt496 - Class36.baseX) * 4 + 2 - (((Character) Class68_Sub7.localPlayer).x) / 32);
                                int i_36_ = (2 - (((Character) Class68_Sub7.localPlayer).y) / 32 + ((((Class23) class23).anInt492 - Class68_Sub13_Sub35.baseY) * 4));
                                Class53.method551(((Class23) class23).anInt499, (byte) 119, i_35_, class45, i_2_, i, i_36_);
                            }
                            if (((Class23) class23).anInt489 == 10 && ((Class23) class23).anInt493 >= 0 && (((Class23) class23).anInt493 < (Class68_Sub13_Sub4.localPlayers).length))
                            {
                                Player class1_sub6_sub2 = (Class68_Sub13_Sub4.localPlayers[((Class23) class23).anInt493]);
                                if (class1_sub6_sub2 != null)
                                {
                                    int i_37_ = ((((Character) class1_sub6_sub2).x) / 32 - (((Character) (Class68_Sub7.localPlayer)).x) / 32);
                                    int i_38_ = ((((Character) class1_sub6_sub2).y) / 32 - (((Character) (Class68_Sub7.localPlayer)).y) / 32);
                                    Class53.method551((((Class23) class23).anInt499), (byte) 110, i_37_, class45, i_2_, i, i_38_);
                                }
                            }
                        }
                    }
                    if (Class95.destinationX != 0)
                    {
                        int i_39_ = (Class95.destinationX * 4 + 2 - (((Character) Class68_Sub7.localPlayer).x) / 32);
                        int i_40_ = (4 * Class75_Sub2.destinationY - (((Character) Class68_Sub7.localPlayer).y) / 32 + 2);
                        Class33.method413(i_40_, -65, class45, i, i_39_, (Class68_Sub20_Sub17.aClass68_Sub20_Sub10_4442), i_2_);
                    }
                    Class79.method1445((((Widget) class45).anInt892 / 2 + i - 1), (i_2_ + ((Widget) class45).anInt873 / 2 - 1), 3, 3, 16777215);
                }
                Class68_Sub17.aBooleanArray3039[i_3_] = true;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hc.B(" + (class45 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
        }
    }

    GameCanvas(Component component)
    {
        try
        {
            gameComponent = component;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("hc.<init>(" + (component != null ? "{...}" : "null") + ')'));
        }
    }
}
