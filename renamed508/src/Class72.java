/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

abstract class Class72
{
    static int anInt1301;
    static MutableString aClass100_1302 = Class112.makeMutableString(43, "www");
    static int anInt1303;
    static int anInt1304;
    static Class65 aClass65_1305;
    static MutableString aClass100_1306;
    int[] anIntArray1307;
    int anInt1308;
    static int anInt1309;
    static int anInt1310;
    static int[][][] anIntArrayArrayArray1311;
    static NodeList aClass16_1312;
    static int anInt1313;
    Image anImage1314;
    static int anInt1315;
    static int anInt1316;
    static int anInt1317;
    private static MutableString aClass100_1318 = Class112.makeMutableString(43, "Connection lost)3");
    static int anInt1319;
    static int anInt1320;
    static int anInt1321;
    int anInt1322;

    static final void updateLocalNPCs()
    {
        Class75_Sub3_Sub1.removeEntityCount = 0;
        Class68_Sub20_Sub16.updateBlockCount = 0;
        Class22.parseLocalNPCUpdateHeader();
        Class68_Sub13_Sub7.updateLocalNPCPositions();
        Class89.parseLocalNPCUpdateFlag();
        for (int i = 0; i < Class75_Sub3_Sub1.removeEntityCount; i++)
        {
            int i_0_ = Class68_Sub13_Sub14.removeEntityIndices[i];
            if (Class102.localNPCs[i_0_].lastUpdate != Class68_Sub3.loopCycle)
            {
                if ((Class102.localNPCs[i_0_]).definition.method1450())
                    Class68_Sub13_Sub4.method717((Class102.localNPCs[i_0_]), 2);
                ((NPC) Class102.localNPCs[i_0_]).definition = null;
                Class102.localNPCs[i_0_] = null;
            }
        }
        if (Class106.packetSize != (((Stream) Class68_Sub13_Sub8.connectionVector).position))
            throw new RuntimeException("gnp1 pos:" + (((Stream) (Class68_Sub13_Sub8.connectionVector)).position) + " psize:" + Class106.packetSize);
        for (int i = 0; i < Class13_Sub2.localNPCCount; i++)
        {
            if ((Class102.localNPCs[Class68_Sub10.localNPCIndices[i]]) == null)
                throw new RuntimeException("gnp2 pos:" + i + " size:" + Class13_Sub2.localNPCCount);
        }
    }

    static final void method1348(int i)
    {
        anInt1316++;
        int i_1_ = Class52.anInt1013;
        int i_2_ = Class68_Sub13_Sub25.anInt3860;
        if (i != 0)
            aClass16_1312 = null;
        int i_3_ = Class68_Sub20_Sub17.appletWidth - Class13_Sub3.appletWidth - i_1_;
        int i_4_ = Class21.appletHeight - Class68_Sub13_Sub9.appletHeight - i_2_;
        do
        {
            if (i_1_ > 0 || i_3_ > 0 || i_2_ > 0 || i_4_ > 0)
            {
                try
                {
                    int i_5_ = 0;
                    java.awt.Container container;
                    if (Item.aFrame2431 == null)
                    {
                        if (Class108.gameFrame != null)
                            container = Class108.gameFrame;
                        else
                            container = Class75_Sub1_Sub1.signlink.gameApplet;
                    } else
                        container = Item.aFrame2431;
                    int i_6_ = 0;
                    if (container == Class108.gameFrame)
                    {
                        Insets insets = Class108.gameFrame.getInsets();
                        i_6_ = insets.left;
                        i_5_ = insets.top;
                    }
                    Graphics graphics = container.getGraphics();
                    graphics.setColor(Color.black);
                    if (i_1_ > 0)
                        graphics.fillRect(i_6_, i_5_, i_1_, Class21.appletHeight);
                    if (i_2_ > 0)
                        graphics.fillRect(i_6_, i_5_, Class68_Sub20_Sub17.appletWidth, i_2_);
                    if (i_3_ > 0)
                        graphics.fillRect((i_6_ + Class68_Sub20_Sub17.appletWidth - i_3_), i_5_, i_3_, Class21.appletHeight);
                    if (i_4_ <= 0)
                        break;
                    graphics.fillRect(i_6_, Class21.appletHeight + (i_5_ - i_4_), Class68_Sub20_Sub17.appletWidth, i_4_);
                } catch (Exception exception)
                {
                    /* empty */
                }
                break;
            }
        } while (false);
    }

    static final int method1349(NPC class1_sub6_sub1, boolean bool)
    {
        try
        {
            anInt1309++;
            if (bool != false)
                anInt1321 = 75;
            NPCDefinition class80 = ((NPC) class1_sub6_sub1).definition;
            if (((NPCDefinition) class80).anIntArray1433 != null)
            {
                class80 = class80.method1453(-94);
                if (class80 == null)
                    return -1;
            }
            int i = ((NPCDefinition) class80).anInt1432;
            if (((Character) class1_sub6_sub1).anInt2526 != ((Character) class1_sub6_sub1).anInt2532)
            {
                if (((Character) class1_sub6_sub1).anInt2526 == ((Character) class1_sub6_sub1).anInt2542)
                    i = ((NPCDefinition) class80).anInt1473;
            } else
                i = ((NPCDefinition) class80).anInt1431;
            return i;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "me.N(" + (class1_sub6_sub1 != null ? "{...}" : "null") + ',' + bool + ')');
        }
    }

    abstract void method1350(int i, int i_7_, int i_8_, Graphics graphics);

    public static void method1351(byte i)
    {
        aClass100_1306 = null;
        anIntArrayArrayArray1311 = null;
        aClass16_1312 = null;
        aClass100_1302 = null;
        aClass65_1305 = null;
        if (i < 75)
            method1352(52);
        aClass100_1318 = null;
    }

    static final void method1352(int i)
    {
        anInt1304++;
        int i_9_ = -15 / ((i - 7) / 57);
        Class68_Sub20_Sub12.objectDefinitionNodes.method1573(-120);
        Class52.aClass98_1000.method1573(-64);
        Class68_Sub13_Sub20.aClass98_3767.method1573(-128);
        Class68_Sub13_Sub37.aClass98_4066.method1573(-121);
    }

    static final void method1353(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_)
    {
        anInt1315++;
        int i_17_ = i_13_ + i;
        int i_18_ = i_11_ - i;
        int i_19_ = i_14_ - i;
        int i_20_ = i + i_10_;
        for (int i_21_ = i_13_; i_21_ < i_17_; i_21_++)
            Class34.method416(i_10_, (byte) -17, i_12_, Class68_Sub22.anIntArrayArray3134[i_21_], i_14_);
        if (i_16_ == -17229)
        {
            for (int i_22_ = i_11_; i_18_ < i_22_; i_22_--)
                Class34.method416(i_10_, (byte) -17, i_12_, Class68_Sub22.anIntArrayArray3134[i_22_], i_14_);
            for (int i_23_ = i_17_; i_18_ >= i_23_; i_23_++)
            {
                int[] is = Class68_Sub22.anIntArrayArray3134[i_23_];
                Class34.method416(i_10_, (byte) -17, i_12_, is, i_20_);
                Class34.method416(i_20_, (byte) -17, i_15_, is, i_19_);
                Class34.method416(i_19_, (byte) -17, i_12_, is, i_14_);
            }
        }
    }

    static final void method1354(MutableString class100, int i)
    {
        do
        {
            try
            {
                anInt1319++;
                int i_24_ = Class68_Sub13_Sub31.method858(64, class100);
                if (i != i_24_)
                {
                    Class3.anInt85 = (((Class91) Class102.aClass91_1758).aShortArray1633[i_24_]) - Class70.anInt1273;
                    int i_25_ = (Class3.anInt85 - (int) ((float) (((Widget) Node.aClass45_1231).anInt892) / Class68_Sub9.aFloat2894));
                    int i_26_ = (Class3.anInt85 + (int) ((float) (((Widget) Node.aClass45_1231).anInt892) / Class68_Sub9.aFloat2894));
                    Class68_Sub22.anInt3147 = (Ground.anInt2762 - (((Class91) Class102.aClass91_1758).aShortArray1636[i_24_]) + (Class103.anInt1770 - 1));
                    int i_27_ = (Class68_Sub22.anInt3147 - (int) ((float) (((Widget) Node.aClass45_1231).anInt873) / Class68_Sub9.aFloat2894));
                    if (i_25_ < 0)
                        Class3.anInt85 = (int) ((float) (((Widget) Node.aClass45_1231).anInt892) / Class68_Sub9.aFloat2894);
                    if (i_26_ > Class68_Sub6.anInt2848)
                        Class3.anInt85 = (Class68_Sub6.anInt2848 - (int) ((float) (((Widget) Node.aClass45_1231).anInt892) / Class68_Sub9.aFloat2894));
                    int i_28_ = ((int) ((float) (((Widget) Node.aClass45_1231).anInt873) / Class68_Sub9.aFloat2894) + Class68_Sub22.anInt3147);
                    if (i_27_ < 0)
                        Class68_Sub22.anInt3147 = (int) ((float) (((Widget) Node.aClass45_1231).anInt873) / Class68_Sub9.aFloat2894);
                    if (Class103.anInt1770 >= i_28_)
                        break;
                    Class68_Sub22.anInt3147 = (Class103.anInt1770 - (int) ((float) (((Widget) Node.aClass45_1231).anInt873) / Class68_Sub9.aFloat2894));
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, ("me.L(" + (class100 != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    static final Class21_Sub1 method1355(byte i, boolean bool, boolean bool_29_, int i_30_, boolean bool_31_)
    {
        int i_32_ = 28 % ((-13 - i) / 59);
        anInt1310++;
        Class89 class89 = null;
        if (Class68_Sub20_Sub10.aClass124_4320 != null)
            class89 = new Class89(i_30_, Class68_Sub20_Sub10.aClass124_4320, Class26.aClass124Array520[i_30_], 1000000);
        return new Class21_Sub1(class89, Class43.aClass89_734, i_30_, bool, bool_29_, bool_31_);
    }

    abstract void method1356(Component component, int i, int i_33_, int i_34_);

    static final int method1357(int i, int i_35_, byte[] is)
    {
        try
        {
            anInt1320++;
            if (i_35_ != -1)
                return 65;
            return Object1.method622(i, false, 0, is);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("me.K(" + i + ',' + i_35_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1358(int i)
    {
        anInt1303++;
        Class79.method1438(((Class72) this).anIntArray1307, ((Class72) this).anInt1322, ((Class72) this).anInt1308);
        if (i < 7)
            anInt1321 = 45;
    }

    abstract void method1359(Graphics graphics, boolean bool, int i, int i_36_, int i_37_, int i_38_);

    static final void method1360(Class21_Sub1 class21_sub1, int i, int i_39_)
    {
        try
        {
            anInt1317++;
            if (Class50.aClass68_Sub14_979 != null)
            {
                ((Stream) Class50.aClass68_Sub14_979).position = i_39_ * 8 + 5;
                int i_40_ = Class50.aClass68_Sub14_979.readInteger();
                int i_41_ = Class50.aClass68_Sub14_979.readInteger();
                class21_sub1.method368(i_41_, (byte) 80, i_40_);
            } else
            {
                if (i != -5720)
                    aClass65_1305 = null;
                GameException.method1804(true, 0, 255, (byte) 0, 255, null, (byte) 22);
                NodeSub.aClass21_Sub1Array3083[i_39_] = class21_sub1;
            }
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("me.H(" + (class21_sub1 != null ? "{...}" : "null") + ',' + i + ',' + i_39_ + ')'));
        }
    }

    static final Class50 method1361(int i)
    {
        if (i >= -4)
            method1349(null, false);
        anInt1301++;
        try
        {
            //xxx return (Class50) Class.forName("Class50_Sub1").newInstance();
            return new Class50_Sub1();
        } catch (Throwable throwable)
        {
            return new Class50_Sub2();
        }
    }

    protected Class72()
    {
        /* empty */
    }

    static
    {
        aClass100_1306 = aClass100_1318;
        aClass16_1312 = new NodeList();
    }
}
