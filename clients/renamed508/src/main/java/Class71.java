/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

class Class71
{
    static MutableString aClass100_1288;
    static MutableString aClass100_1289;
    private static MutableString aClass100_1290 = Class112.makeMutableString(43, "Free world");
    static int anInt1291;
    static int anInt1292;
    static int anInt1293;
    static int[] anIntArray1294;
    static int anInt1295;
    static MutableString aClass100_1296;
    static int anInt1297;
    static int anInt1298;
    static int anInt1299;
    static short[] aShortArray1300;

    static final void method1338(int i, int i_0_, int i_1_)
    {
        if (NPCDefinition.anInt1467 > 0)
        {
            Class68_Sub4.method660(NPCDefinition.anInt1467, (byte) 60);
            NPCDefinition.anInt1467 = 0;
        }
        int i_2_ = 0;
        anInt1292++;
        int i_3_ = 256;
        int i_4_ = i * Class79.anInt1403;
        int i_5_ = 0;
        if (i_1_ == 95)
        {
            for (int i_6_ = 1; i_6_ < i_3_ - 1; i_6_++)
            {
                int i_7_ = ((i_3_ - i_6_) * Class68_Sub20_Sub16.anIntArray4418[i_6_] / i_3_);
                if (i_7_ < 0)
                    i_7_ = 0;
                i_2_ += i_7_;
                for (int i_8_ = i_7_; i_8_ < 128; i_8_++)
                {
                    int i_9_ = NodeSub.anIntArray3092[i_2_++];
                    int i_10_ = Class79.anIntArray1404[i_0_ + i_4_++];
                    if (i_9_ == 0)
                        ((Sprite) GameException.aClass68_Sub20_Sub10_Sub1_2248).pixels[i_5_++] = i_10_;
                    else
                    {
                        int i_11_ = i_9_ + 18;
                        if (i_11_ > 255)
                            i_11_ = 255;
                        int i_12_ = 256 - (i_9_ + 18);
                        if (i_12_ > 255)
                            i_12_ = 255;
                        i_9_ = Class68_Sub25.anIntArray3174[i_9_];
                        ((Sprite) GameException.aClass68_Sub20_Sub10_Sub1_2248).pixels[i_5_++] = (((Class120.method1746((Class120.method1746(65280, i_9_) * i_11_ + i_12_ * Class120.method1746(i_10_, 65280)), 16711680)) + (Class120.method1746(-16711936, (i_11_ * Class120.method1746(i_9_, 16711935) + (i_12_ * Class120.method1746(i_10_, 16711935)))))) >> 8);
                    }
                }
                for (int i_13_ = 0; i_7_ > i_13_; i_13_++)
                    ((Sprite) GameException.aClass68_Sub20_Sub10_Sub1_2248).pixels[i_5_++] = Class79.anIntArray1404[i_4_++ + i_0_];
                i_4_ += Class79.anInt1403 - 128;
            }
            GameException.aClass68_Sub20_Sub10_Sub1_2248.method1108(i_0_, i);
        }
    }

    static final void method1339(String string, Throwable throwable, int i)
    {
        anInt1291++;
        do
        {
            try
            {
                String string_14_ = "";
                if (throwable != null)
                    string_14_ = PlayerDefinition.method1782(throwable, -113);
                if (string != null)
                {
                    if (throwable != null)
                        string_14_ += " | ";
                    string_14_ += (String) string;
                }
                System.out.println("Error: " + string_14_);
                string_14_ = string_14_.replace(':', '.');
                string_14_ = string_14_.replace('@', '_');
                string_14_ = string_14_.replace((char) i, '_');
                string_14_ = string_14_.replace('#', '_');
                if (Class85.signlink.gameApplet != null)
                {
                    Class31 class31 = (Class85.signlink.method562(new URL(Class85.signlink.gameApplet.getCodeBase(), ("clienterror.ws?c=" + Class92.clientVersion + "&u=" + Class72_Sub1.aLong3287 + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&e=" + string_14_)), i - 38));
                    while (class31.anInt555 == 0)
                        Class50.method528(i ^ ~0x22, 1L);
                    if (class31.anInt555 != 1)
                        break;
                    DataInputStream datainputstream = (DataInputStream) class31.playerDefSocket;
                    datainputstream.read();
                    datainputstream.close();
                }
            } catch (Exception exception)
            {
                /* empty */
            }
            break;
        } while (false);
    }

    static final void method1340(int i, int i_15_)
    {
        anInt1295++;
        if (i_15_ != -1 && Class68_Sub13_Sub25.method824(i_15_, (byte) -2))
        {
            if (i != -1)
                method1340(104, 115);
            Widget[] class45s = Class68_Sub13_Sub36.widgetCache[i_15_];
            for (int i_16_ = 0; i_16_ < class45s.length; i_16_++)
            {
                Widget class45 = class45s[i_16_];
                if (((Widget) class45).anObjectArray759 != null)
                {
                    ScriptParameters class68_sub29 = new ScriptParameters();
                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray759;
                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                    Class68_Sub28_Sub1.method1260(class68_sub29, (byte) 124, 2000000);
                }
            }
        }
    }

    static final void method1341(byte i)
    {
        for (int i_17_ = -1; client.localPlayerCount > i_17_; i_17_++)
        {
            int i_18_;
            if (i_17_ != -1)
                i_18_ = Class85.localPlayerIndices[i_17_];
            else
                i_18_ = 2047;
            Player class1_sub6_sub2 = Class68_Sub13_Sub4.localPlayers[i_18_];
            if (class1_sub6_sub2 != null && ((Character) class1_sub6_sub2).messageCycle > 0)
            {
                ((Character) class1_sub6_sub2).messageCycle--;
                if (((Character) class1_sub6_sub2).messageCycle == 0)
                    ((Character) class1_sub6_sub2).message = null;
            }
        }
        for (int i_19_ = 0; Class13_Sub2.localNPCCount > i_19_; i_19_++)
        {
            int i_20_ = Class68_Sub10.localNPCIndices[i_19_];
            NPC class1_sub6_sub1 = Class102.localNPCs[i_20_];
            if (class1_sub6_sub1 != null && ((Character) class1_sub6_sub1).messageCycle > 0)
            {
                ((Character) class1_sub6_sub1).messageCycle--;
                if (((Character) class1_sub6_sub1).messageCycle == 0)
                    ((Character) class1_sub6_sub1).message = null;
            }
        }
        int i_21_ = 49 % ((i - 54) / 63);
        anInt1299++;
    }

    public static void method1342(boolean bool)
    {
        anIntArray1294 = null;
        aClass100_1288 = null;
        aShortArray1300 = null;
        if (bool == true)
        {
            aClass100_1290 = null;
            aClass100_1289 = null;
            aClass100_1296 = null;
        }
    }

    static
    {
        aClass100_1288 = Class112.makeMutableString(43, "Fps:");
        aClass100_1289 = aClass100_1290;
        anInt1293 = 0;
        aClass100_1296 = Class112.makeMutableString(43, "_labels");
        anInt1298 = -1;
        anIntArray1294 = new int[100];
        aShortArray1300 = new short[] { 960, 957, -21568, -21571, 22464 };
    }
}
