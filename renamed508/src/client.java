/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.HashMap;

import nativeadvert.browsercontrol;
import org.moparscape.iface.ClientInterface;
import org.moparscape.userver.v508.OndemandServer;

public final class client extends GameApplet implements ClientInterface {

    public static java.awt.event.KeyListener keyListener;
    public static int[] bgImage = null;
    public static int serverPort = 43594;
    public static int ondemandPort = 43596;
    public static int jaggrabPort = 43597;
    public static String cacheDir = System.getProperty("user.home") + "/.moparscape/cache508/";
    boolean maplock, hpOn, zoomOn;
    int mapface, zoom, fwdbwd, lftrit;

    public void setServer(String server) {
        Class68_Sub9.serverAddress = server;
    }

    public void setPort(int port) {
        serverPort = port;
    }

    public void setCacheDir(String cacheDir) {
        client.cacheDir = cacheDir;
    }

    public void setOndemandPort(int port) {
        ondemandPort = port;
    }

    public void setJaggrabPort(int port) {
        jaggrabPort = port;
    }

    public void setMapLock(boolean maplock, int mapface) {
        this.maplock = maplock;
        this.mapface = mapface;
    }

    public void setHPheads(boolean on) {
        this.hpOn = on;
    }

    public void setZoom(boolean on) {
        this.zoomOn = on;
    }

    public void setKeyListener(java.awt.event.KeyListener kl) {
        keyListener = kl;
    }

    public void modZoomInts(int zoom, int fwdbwd, int lftrit) {
        this.zoom = zoom;
        this.fwdbwd = fwdbwd;
        this.lftrit = lftrit;
    }

    public int getPort() {
        return serverPort;
    }

    public HashMap<String, String> getParams() {
        HashMap<String, String> ret = new HashMap<String, String>();
        // set params
        ret.put("getCodeBase", "http://localhost");
        ret.put("getDocumentBase", "http://localhost/index.php");
        ret.put("worldid", "1");
        ret.put("portoff", "0");
        ret.put("lowmem", "1");
        ret.put("members", "0");
        ret.put("width", "765");
        ret.put("height", "503");
        ret.put("modewhat", "1");
        ret.put("modewhere", "0");
        ret.put("lang", "0");
        ret.put("js", "0");
        ret.put("plug", "0");
        ret.put("safemode", "0");
        ret.put("advert", "0");
        ret.put("game", "0");
        return ret;
    }

    public org.moparscape.userver.Server[] getUpdateServers(String defaultLocation, String customLocation) {
        org.moparscape.userver.Server[] ret = new org.moparscape.userver.Server[2];
        //ret[0] = new org.moparscape.userver.v508.OndemandServer443(defaultLocation, customLocation);
        ret[1] = new OndemandServer(defaultLocation, customLocation);
        return ret;
    }

    public java.awt.Dimension getDimension() {
        return new java.awt.Dimension(765, 503);
    }

    // 508 wants an array of pixels instead of an image, oblige it
    public void setBackground(java.awt.Image image) {
        if (image == null)
            return;
        int w = image.getWidth(null);
        int h = image.getHeight(null);
        BufferedImage bi = new BufferedImage(956, 503, BufferedImage.TYPE_INT_ARGB);
        bi.getGraphics().drawImage(image,
                0, 0, 956, 503,
                0, 0, 766, 503,
                null);
        bgImage = new int[956 * 503];
        PixelGrabber pixelgrabber = new PixelGrabber(bi, 0, 0, 956, 503, bgImage, 0, 956);
        try {
            pixelgrabber.grabPixels();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static int anInt2368;
    static int anInt2369;
    static int anInt2370;
    static int anInt2371;
    static int anInt2372;
    static int anInt2373;
    static volatile int mouseClickButton = 0;
    static int anInt2375;
    static int anInt2376;
    static int anInt2377;
    static int anInt2378 = 0;
    static int anInt2379;
    static int anInt2380;
    static Class68_Sub12 aClass68_Sub12_2381;
    static Class21 aClass21_2382;
    static int anInt2383;
    static int localPlayerCount = 0;
    static int anInt2385;
    static int anInt2386;
    public static int anInt2387;

    final void method29(int i)
    {
        anInt2375++;
        if (browsercontrol.method1411())
            browsercontrol.method1415();
        if (Class75_Sub1_Sub1.signlink != null)
            Class75_Sub1_Sub1.signlink.method560(this.getClass(), 50);
        if (Class14.aClass84_241 != null)
            ((Class84) Class14.aClass84_241).aBoolean1535 = false;
        Class14.aClass84_241 = null;
        if (PlayerDefinition.connection != null)
        {
            PlayerDefinition.connection.method594(-67);
            PlayerDefinition.connection = null;
        }
        Class71_Sub1.method1345(-91, Mouse.gameCanvas);
        NodeSub.method1007(Mouse.gameCanvas, true);
        if (MutableString.aClass97_2263 != null)
            MutableString.aClass97_2263.method1564(100, Mouse.gameCanvas);
        Class68_Sub26.method1216(2);
        Class1_Sub7.method170(255);
        MutableString.aClass97_2263 = null;
        if (Class68_Sub13_Sub36.aClass35_4037 != null)
            Class68_Sub13_Sub36.aClass35_4037.method431(7759444);
        if (Animable.aClass35_66 != null)
            Animable.aClass35_66.method431(7759444);
        Class32.method408(-111);
        ItemDefinition.method315(103);
        do
        {
            try
            {
                if (Class68_Sub20_Sub10.aClass124_4320 != null)
                    Class68_Sub20_Sub10.aClass124_4320.method1765(-9715);
                int i_0_ = 126 % ((i + 5) / 62);
                if (Class26.aClass124Array520 != null)
                {
                    for (int i_1_ = 0; Class26.aClass124Array520.length > i_1_; i_1_++)
                    {
                        if (Class26.aClass124Array520[i_1_] != null)
                            Class26.aClass124Array520[i_1_].method1765(-9715);
                    }
                }
                if (Class75_Sub2.aClass124_3313 != null)
                    Class75_Sub2.aClass124_3313.method1765(-9715);
                if (Class68_Sub13_Sub4.aClass124_3488 == null)
                    break;
                Class68_Sub13_Sub4.aClass124_3488.method1765(-9715);
            } catch (java.io.IOException ioexception)
            {
                /* empty */
            }
            break;
        } while (false);
    }

    static final void method34(byte i)
    {
        anInt2373++;
        int i_2_ = -36 % ((i + 7) / 60);
        if (GameException.anInt2233 == 30)
            Class17.method296(25, (byte) -81);
    }

    private final void method35(byte i)
    {
        anInt2370++;
        if (Class107.anInt1817 == 0)
        {
            Runtime runtime = Runtime.getRuntime();
            int i_3_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
            long l = Class36.method438(i ^ 0x434d);
            if (Class75_Sub1.aLong3306 == 0L)
                Class75_Sub1.aLong3306 = l;
            if (i_3_ > 16384 && l - Class75_Sub1.aLong3306 < 5000L)
            {
                if (-NPC.aLong3394 + l > 1000L)
                {
                    System.gc();
                    NPC.aLong3394 = l;
                }
                ScriptParameters.aClass100_3237 = Class72_Sub1.aClass100_3279;
                Class68_Sub13_Sub28.anInt3919 = 5;
            } else
            {
                Class107.anInt1817 = 10;
                ScriptParameters.aClass100_3237 = Class68_Sub13_Sub5.aClass100_3519;
                Class68_Sub13_Sub28.anInt3919 = 5;
            }
        } else if (Class107.anInt1817 == 10)
        {
            Player.method157(4, 104, 104, 25);
            for (int i_4_ = 0; i_4_ < 4; i_4_++)
                Class109.groundDataArray[i_4_] = new GroundData(104, 104);
            Class68_Sub13_Sub28.anInt3919 = 10;
            ScriptParameters.aClass100_3237 = Class68_Sub13_Sub26_Sub1.aClass100_4605;
            Class107.anInt1817 = 30;
        } else if (Class107.anInt1817 == 30)
        {
            Class68_Sub28_Sub1.aClass21_Sub1_4521 = Class72.method1355((byte) 116, false, true, 0, true);
            Class58.aClass21_Sub1_1097 = Class72.method1355((byte) 57, false, true, 1, true);
            Class68_Sub6.aClass21_Sub1_2845 = Class72.method1355((byte) 66, true, false, 2, true);
            Class68_Sub13_Sub21.aClass21_Sub1_3806 = Class72.method1355((byte) -73, false, true, 3, true);
            Class78.aClass21_Sub1_1390 = Class72.method1355((byte) 105, false, true, 4, true);
            Class92.aClass21_Sub1_1646 = Class72.method1355((byte) 71, true, true, 5, true);
            Class21.aClass21_Sub1_459 = Class72.method1355((byte) -111, true, true, 6, false);
            Class120.aClass21_Sub1_2097 = Class72.method1355((byte) -117, false, true, 7, true);
            Class52.aClass21_Sub1_1011 = Class72.method1355((byte) 102, false, true, 8, true);
            Class68_Sub13_Sub30.aClass21_Sub1_3955 = Class72.method1355((byte) -93, false, true, 9, true);
            Class84.aClass21_Sub1_1534 = Class72.method1355((byte) 50, false, true, 10, true);
            Class21.aClass21_Sub1_472 = Class72.method1355((byte) -121, false, true, 11, true);
            Class13.aClass21_Sub1_221 = Class72.method1355((byte) 107, false, true, 12, true);
            Class63.aClass21_Sub1_1173 = Class72.method1355((byte) -99, false, true, 13, true);
            Class68_Sub20_Sub4.aClass21_Sub1_4219 = Class72.method1355((byte) -89, false, true, 14, false);
            Class28.aClass21_Sub1_529 = Class72.method1355((byte) -75, false, true, 15, true);
            Class7.aClass21_Sub1_136 = Class72.method1355((byte) 94, false, true, 16, true);
            Class33.aClass21_Sub1_583 = Class72.method1355((byte) -114, false, true, 17, true);
            Node.aClass21_Sub1_1228 = Class72.method1355((byte) 74, false, true, 18, true);
            Animation.aClass21_Sub1_2040 = Class72.method1355((byte) -95, false, true, 19, true);
            Object4.aClass21_Sub1_1068 = Class72.method1355((byte) 57, false, true, 20, true);
            Class68_Sub13_Sub31.aClass21_Sub1_3973 = Class72.method1355((byte) -81, false, true, 21, true);
            Class14.aClass21_Sub1_229 = Class72.method1355((byte) 88, false, true, 22, true);
            Class68_Sub20_Sub5.aClass21_Sub1_4223 = Class72.method1355((byte) 70, true, true, 23, true);
            Class68_Sub13_Sub5.aClass21_Sub1_3524 = Class72.method1355((byte) -109, false, true, 24, true);
            GroundData.aClass21_Sub1_659 = Class72.method1355((byte) -90, false, true, 25, true);
            CipheredByteVector.aClass21_Sub1_4135 = Class72.method1355((byte) 65, true, true, 26, true);
            Class68_Sub13_Sub28.anInt3919 = 15;
            ScriptParameters.aClass100_3237 = Class68_Sub13_Sub12.aClass100_3637;
            Class107.anInt1817 = 40;
        } else if (Class107.anInt1817 == 40)
        {
            int i_5_ = 0;
            i_5_ += (Class68_Sub28_Sub1.aClass21_Sub1_4521.method365(i - 13) * 4 / 100);
            i_5_ += 4 * Class58.aClass21_Sub1_1097.method365(-88) / 100;
            i_5_ += Class68_Sub6.aClass21_Sub1_2845.method365(-76) / 100;
            i_5_ += (2 * Class68_Sub13_Sub21.aClass21_Sub1_3806.method365(65) / 100);
            i_5_ += Class78.aClass21_Sub1_1390.method365(i - 195) * 6 / 100;
            i_5_ += Class92.aClass21_Sub1_1646.method365(-115) * 4 / 100;
            i_5_ += 2 * Class21.aClass21_Sub1_459.method365(-94) / 100;
            i_5_ += 50 * Class120.aClass21_Sub1_2097.method365(i + 45) / 100;
            i_5_ += 2 * Class52.aClass21_Sub1_1011.method365(i - 155) / 100;
            i_5_ += (Class68_Sub13_Sub30.aClass21_Sub1_3955.method365(87) * 2 / 100);
            i_5_ += Class84.aClass21_Sub1_1534.method365(i) * 2 / 100;
            i_5_ += Class21.aClass21_Sub1_472.method365(-74) * 2 / 100;
            i_5_ += Class13.aClass21_Sub1_221.method365(117) * 2 / 100;
            i_5_ += 2 * Class63.aClass21_Sub1_1173.method365(i - 3) / 100;
            i_5_ += (2 * Class68_Sub20_Sub4.aClass21_Sub1_4219.method365(58) / 100);
            i_5_ += 2 * Class28.aClass21_Sub1_529.method365(-89) / 100;
            i_5_ += Class7.aClass21_Sub1_136.method365(112) / 100;
            i_5_ += Class33.aClass21_Sub1_583.method365(-101) / 100;
            i_5_ += Node.aClass21_Sub1_1228.method365(106) / 100;
            i_5_ += Animation.aClass21_Sub1_2040.method365(52) / 100;
            i_5_ += Object4.aClass21_Sub1_1068.method365(i - 184) / 100;
            i_5_ += Class68_Sub13_Sub31.aClass21_Sub1_3973.method365(84) / 100;
            i_5_ += Class14.aClass21_Sub1_229.method365(48) / 100;
            i_5_ += (Class68_Sub20_Sub5.aClass21_Sub1_4223.method365(i - 175) / 100);
            i_5_ += Class68_Sub13_Sub5.aClass21_Sub1_3524.method365(-96) / 100;
            i_5_ += GroundData.aClass21_Sub1_659.method365(-95) / 100;
            i_5_ += CipheredByteVector.aClass21_Sub1_4135.method365(-79) / 100;
            if (i_5_ != 100)
            {
                if (i_5_ != 0)
                    ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub5.aClass100_3522, Class68_Sub13_Sub24.method816(i_5_, 0), Class68_Sub20_Sub7.aClass100_4269 })));
                Class68_Sub13_Sub28.anInt3919 = 20;
            } else
            {
                ScriptParameters.aClass100_3237 = Class85.aClass100_1566;
                Class68_Sub13_Sub28.anInt3919 = 20;
                Class35.method435((byte) 105, Class52.aClass21_Sub1_1011);
                Class28.method395((byte) -128, Class52.aClass21_Sub1_1011);
                Class68_Sub15.method979(Class52.aClass21_Sub1_1011, 1);
                Class68_Sub7.method667(Class52.aClass21_Sub1_1011, -5545);
                Class107.anInt1817 = 45;
            }
        } else if (Class107.anInt1817 == 45)
        {
            Class68_Sub13_Sub36.method887(22050, 2, Class74.aBoolean1324, -126);
            Class54.aClass68_Sub28_Sub1_1028 = new Class68_Sub28_Sub1();
            Class54.aClass68_Sub28_Sub1_1028.method1238(9, 128, i ^ 0x5e);
            Class68_Sub13_Sub36.aClass35_4037 = Animation.method1723(Class75_Sub1_Sub1.signlink, (byte) 104, Mouse.gameCanvas, 22050, 0);
            Class68_Sub13_Sub36.aClass35_4037.method425(false, Class54.aClass68_Sub28_Sub1_1028);
            Login.method1474(Class54.aClass68_Sub28_Sub1_1028, Class78.aClass21_Sub1_1390, false, Class28.aClass21_Sub1_529, Class68_Sub20_Sub4.aClass21_Sub1_4219);
            Animable.aClass35_66 = Animation.method1723(Class75_Sub1_Sub1.signlink, (byte) 104, Mouse.gameCanvas, 2048, 1);
            NPCDefinition.aClass68_Sub28_Sub4_1420 = new Class68_Sub28_Sub4();
            Animable.aClass35_66.method425(false, NPCDefinition.aClass68_Sub28_Sub4_1420);
            NodeSub.aClass95_3081 = new Class95(22050, Class93.anInt1662);
            Class68_Sub13_Sub15.anInt3683 = Class21.aClass21_Sub1_459.getIndex(MutableString.aClass100_2299, (byte) -84);
            Class68_Sub13_Sub28.anInt3919 = 30;
            ScriptParameters.aClass100_3237 = Class68_Sub7.aClass100_2863;
            Class107.anInt1817 = 50;
        } else if (Class107.anInt1817 == 50)
        {
            int i_6_ = Class68_Sub13_Sub7.method731(Class52.aClass21_Sub1_1011, 53, Class63.aClass21_Sub1_1173);
            int i_7_ = Class7.method201(i - 167);
            if (i_7_ > i_6_)
            {
                ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class75_Sub3.aClass100_3326, Class68_Sub13_Sub24.method816(100 * i_6_ / i_7_, 0), Class68_Sub20_Sub7.aClass100_4269 })));
                Class68_Sub13_Sub28.anInt3919 = 35;
            } else
            {
                Class68_Sub13_Sub28.anInt3919 = 35;
                Class107.anInt1817 = 60;
                ScriptParameters.aClass100_3237 = Class68_Sub13_Sub29.aClass100_3942;
            }
        } else if (Class107.anInt1817 == 60)
        {
            int i_8_ = RandomNumberGenerator.method1460((byte) -126, Class52.aClass21_Sub1_1011);
            int i_9_ = GroundData.method457(false);
            if (i_8_ < i_9_)
            {
                ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class74.aClass100_1331, Class68_Sub13_Sub24.method816(100 * i_8_ / i_9_, 0), Class68_Sub20_Sub7.aClass100_4269 })));
                Class68_Sub13_Sub28.anInt3919 = 40;
            } else
            {
                ScriptParameters.aClass100_3237 = Class68_Sub13_Sub36.aClass100_4051;
                Class68_Sub13_Sub28.anInt3919 = 40;
                Class107.anInt1817 = 65;
            }
        } else if (Class107.anInt1817 == 65)
        {
            Class20.method321(Class52.aClass21_Sub1_1011, (byte) 83, Class63.aClass21_Sub1_1173);
            ScriptParameters.aClass100_3237 = Class68_Sub13_Sub25.aClass100_3870;
            Class68_Sub13_Sub28.anInt3919 = 45;
            Class17.method296(5, (byte) -89);
            Class107.anInt1817 = 70;
        } else if (Class107.anInt1817 == 70)
        {
            Class68_Sub6.aClass21_Sub1_2845.method353((byte) -62);
            int i_10_ = 0;
            i_10_ += Class68_Sub6.aClass21_Sub1_2845.method352(0);
            Class7.aClass21_Sub1_136.method353((byte) -62);
            i_10_ += Class7.aClass21_Sub1_136.method352(0);
            Class33.aClass21_Sub1_583.method353((byte) -62);
            i_10_ += Class33.aClass21_Sub1_583.method352(0);
            Node.aClass21_Sub1_1228.method353((byte) -62);
            i_10_ += Node.aClass21_Sub1_1228.method352(0);
            Animation.aClass21_Sub1_2040.method353((byte) -62);
            i_10_ += Animation.aClass21_Sub1_2040.method352(0);
            Object4.aClass21_Sub1_1068.method353((byte) -62);
            i_10_ += Object4.aClass21_Sub1_1068.method352(0);
            Class68_Sub13_Sub31.aClass21_Sub1_3973.method353((byte) -62);
            i_10_ += Class68_Sub13_Sub31.aClass21_Sub1_3973.method352(0);
            Class14.aClass21_Sub1_229.method353((byte) -62);
            i_10_ += Class14.aClass21_Sub1_229.method352(0);
            Class68_Sub13_Sub5.aClass21_Sub1_3524.method353((byte) -62);
            i_10_ += Class68_Sub13_Sub5.aClass21_Sub1_3524.method352(0);
            GroundData.aClass21_Sub1_659.method353((byte) -62);
            i_10_ += GroundData.aClass21_Sub1_659.method352(i - 68);
            if (i_10_ < 1000)
            {
                ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub28_Sub1.aClass100_4511, Class68_Sub13_Sub24.method816(i_10_ / 10, 0), Class68_Sub20_Sub7.aClass100_4269 })));
                Class68_Sub13_Sub28.anInt3919 = 50;
            } else
            {
                Class68_Sub16.method987(Class68_Sub6.aClass21_Sub1_2845, -7486);
                Class114.method1699((byte) -88, Class68_Sub6.aClass21_Sub1_2845);
                Class13_Sub3.method260(Class68_Sub6.aClass21_Sub1_2845, 11053);
                Class68_Sub20_Sub10.method1109(-124, Class120.aClass21_Sub1_2097, (Class68_Sub6.aClass21_Sub1_2845));
                Class68_Sub20_Sub16.method1177(12800, Class120.aClass21_Sub1_2097, Class1_Sub7.members, Class7.aClass21_Sub1_136);
                Class111.method1671(Node.aClass21_Sub1_1228, (byte) 82, Class120.aClass21_Sub1_2097);
                Class14.method271(Class1_Sub7.members, Class120.aClass21_Sub1_2097, Animation.aClass21_Sub1_2040, (byte) 112, Class72_Sub1.aClass68_Sub20_Sub1_Sub1_3278);
                Widget.method501(Class68_Sub6.aClass21_Sub1_2845, 1);
                Class68_Sub13_Sub19.method797(Object4.aClass21_Sub1_1068, Class58.aClass21_Sub1_1097, (Class68_Sub28_Sub1.aClass21_Sub1_4521), -118);
                Class105.method1649(Class120.aClass21_Sub1_2097, Class68_Sub13_Sub31.aClass21_Sub1_3973, i - 27687);
                Class22.method374((byte) 58, Class14.aClass21_Sub1_229);
                Class109.method1665((byte) -101, Class68_Sub6.aClass21_Sub1_2845);
                Class124.method1758(Class120.aClass21_Sub1_2097, Class63.aClass21_Sub1_1173, Class68_Sub13_Sub21.aClass21_Sub1_3806, true, Class52.aClass21_Sub1_1011);
                Class68_Sub20_Sub4.method1059(Class68_Sub6.aClass21_Sub1_2845, 116);
                Stream.method934(-83, Class33.aClass21_Sub1_583);
                Class68_Sub13_Sub38.method898(GroundData.aClass21_Sub1_659, (Class68_Sub13_Sub5.aClass21_Sub1_3524), new Class51(), (byte) -117);
                Class21.method348(Class68_Sub13_Sub5.aClass21_Sub1_3524, (byte) -72, GroundData.aClass21_Sub1_659);
                Class68_Sub13_Sub28.anInt3919 = 50;
                ScriptParameters.aClass100_3237 = Login.aClass100_1523;
                Class44.method492(4);
                Class107.anInt1817 = 80;
            }
        } else if (Class107.anInt1817 == 80)
        {
            int i_11_ = Class68_Sub13_Sub17.method783(0, Class52.aClass21_Sub1_1011);
            int i_12_ = Class68_Sub13_Sub27.method836(0);
            if (i_12_ > i_11_)
            {
                ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(i ^ 0x46, (new MutableString[] { Class32.aClass100_562, Class68_Sub13_Sub24.method816(100 * i_11_ / i_12_, 0), Class68_Sub20_Sub7.aClass100_4269 })));
                Class68_Sub13_Sub28.anInt3919 = 60;
            } else
            {
                GameSocket.method592(12339, Class52.aClass21_Sub1_1011);
                Class107.anInt1817 = 90;
                Class68_Sub13_Sub28.anInt3919 = 60;
                ScriptParameters.aClass100_3237 = Class97.aClass100_1720;
            }
        } else if (Class107.anInt1817 == 90)
        {
            if (!CipheredByteVector.aClass21_Sub1_4135.method353((byte) -62))
            {
                ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(i ^ 0x46, new MutableString[] { Class68_Sub24.aClass100_3154, (Class68_Sub13_Sub24.method816(CipheredByteVector.aClass21_Sub1_4135.method352(0), 0)), Class68_Sub20_Sub7.aClass100_4269 }));
                Class68_Sub13_Sub28.anInt3919 = 70;
            } else
            {
                Class90 class90 = new Class90(Class68_Sub13_Sub30.aClass21_Sub1_3955, CipheredByteVector.aClass21_Sub1_4135, Class52.aClass21_Sub1_1011, 20, !Item.aBoolean2434);
                Class62.method611(class90);
                if (Widget.anInt919 == 1)
                    Class62.method614(0.9F);
                if (Widget.anInt919 == 2)
                    Class62.method614(0.8F);
                if (Widget.anInt919 == 3)
                    Class62.method614(0.7F);
                if (Widget.anInt919 == 4)
                    Class62.method614(0.6F);
                Class68_Sub13_Sub28.anInt3919 = 70;
                Class107.anInt1817 = 100;
                ScriptParameters.aClass100_3237 = Class59.aClass100_1108;
            }
        } else if (Class107.anInt1817 == 100)
        {
            if (Class103.method1640(Class52.aClass21_Sub1_1011, -1))
                Class107.anInt1817 = 110;
        } else
        {
            if (i != 68)
                method29(-56);
            if (Class107.anInt1817 == 110)
            {
                Class14.aClass84_241 = new Class84();
                Class75_Sub1_Sub1.signlink.method558((byte) -61, 10, Class14.aClass84_241);
                Class107.anInt1817 = 120;
                ScriptParameters.aClass100_3237 = Class67.aClass100_1207;
                Class68_Sub13_Sub28.anInt3919 = 75;
            } else if (Class107.anInt1817 == 120)
            {
                if (!Class84.aClass21_Sub1_1534.method362((byte) 124, (Class68_Sub5.aClass100_2837), (Class68_Sub28_Sub2.aClass100_4558)))
                {
                    ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, new MutableString[] { MutableString.aClass100_2319, Class95.aClass100_1693 }));
                    Class68_Sub13_Sub28.anInt3919 = 80;
                } else
                {
                    Class103 class103 = new Class103(Class84.aClass21_Sub1_1534.method351(Class68_Sub5.aClass100_2837, Class68_Sub28_Sub2.aClass100_4558, (byte) 81));
                    Class68_Sub13_Sub26.method829(class103, 127);
                    Class107.anInt1817 = 130;
                    ScriptParameters.aClass100_3237 = Class68_Sub13_Sub29.aClass100_3941;
                    Class68_Sub13_Sub28.anInt3919 = 80;
                }
            } else if (Class107.anInt1817 == 130)
            {
                if (!Class68_Sub13_Sub21.aClass21_Sub1_3806.method353((byte) -62))
                {
                    ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class13_Sub1.aClass100_2635, (Class68_Sub13_Sub24.method816(3 * Class68_Sub13_Sub21.aClass21_Sub1_3806.method352(0) / 4, 0)), Class68_Sub20_Sub7.aClass100_4269 })));
                    Class68_Sub13_Sub28.anInt3919 = 85;
                } else if (!Class13.aClass21_Sub1_221.method353((byte) -62))
                {
                    ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class13_Sub1.aClass100_2635, (Class68_Sub13_Sub24.method816((Class13.aClass21_Sub1_221.method352(i - 68) / 10) + 75, 0)), Class68_Sub20_Sub7.aClass100_4269 })));
                    Class68_Sub13_Sub28.anInt3919 = 85;
                } else if (!Class63.aClass21_Sub1_1173.method353((byte) -62))
                {
                    ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class13_Sub1.aClass100_2635, (Class68_Sub13_Sub24.method816((Class63.aClass21_Sub1_1173.method352(i - 68) / 20) + 85, i - 68)), Class68_Sub20_Sub7.aClass100_4269 })));
                    Class68_Sub13_Sub28.anInt3919 = 85;
                } else if (!Class68_Sub20_Sub5.aClass21_Sub1_4223.method354(0, RandomNumberGenerator.aClass100_1483))
                {
                    ScriptParameters.aClass100_3237 = (Class68_Sub20_Sub13_Sub2.method1166(i - 66, (new MutableString[] { Class13_Sub1.aClass100_2635, (Class68_Sub13_Sub24.method816((Class68_Sub20_Sub5.aClass21_Sub1_4223.method363(126, RandomNumberGenerator.aClass100_1483) / 10) + 90, 0)), Class68_Sub20_Sub7.aClass100_4269 })));
                    Class68_Sub13_Sub28.anInt3919 = 85;
                } else
                {
                    Class85.method1486(-10675, Stream.aClass68_Sub20_Sub10_Sub1Array3008, Class68_Sub20_Sub5.aClass21_Sub1_4223, Class68_Sub13_Sub19.aClass92_Sub1Array3747, Class104.aClass92_Sub1Array1781, Class112.aClass92_Sub1Array1888, Class68_Sub20_Sub17.aClass92_Sub1Array4433);
                    Class68_Sub13_Sub28.anInt3919 = 100;
                    Class107.anInt1817 = 140;
                    ScriptParameters.aClass100_3237 = Class68_Sub13_Sub19.aClass100_3742;
                }
            } else if (Class107.anInt1817 == 140)
            {
                Class124.anInt2141 = (Class68_Sub13_Sub21.aClass21_Sub1_3806.getIndex(Class68_Sub10.aClass100_2903, (byte) -106));
                Class92.aClass21_Sub1_1646.method342(false, (byte) 113, true);
                Class21.aClass21_Sub1_459.method342(true, (byte) 113, true);
                Class52.aClass21_Sub1_1011.method342(true, (byte) 113, true);
                Class63.aClass21_Sub1_1173.method342(true, (byte) 113, true);
                Class84.aClass21_Sub1_1534.method342(true, (byte) 113, true);
                Class68_Sub13_Sub21.aClass21_Sub1_3806.method342(true, (byte) 113, true);
                Class67.aBoolean1210 = true;
                Player.method161(64);
            }
        }
    }

    public final void init()
    {
        anInt2369++;
        if (this.checkHost((byte) -106))
        {
            Class106.anInt1801 = Integer.parseInt(this.getParameter("worldid"));
            Class13_Sub4.mode = Integer.parseInt(this.getParameter("modewhat"));
            Class75_Sub3.location = Integer.parseInt(this.getParameter("modewhere"));
            String string = this.getParameter("safemode");
            if (string != null && string.equals("1"))
                Class75_Sub2.safemode = true;
            else
                Class75_Sub2.safemode = false;
            String string_13_ = this.getParameter("members");
            if (string_13_ == null || !string_13_.equals("1"))
                Class1_Sub7.members = false;
            else
                Class1_Sub7.members = true;
            String string_14_ = this.getParameter("lang");
            if (string_14_ != null && string_14_.equals("1"))
            {
                Class72_Sub1.method1369(-54);
                Class68_Sub13_Sub27.language = 1;
            }
            String string_15_ = this.getParameter("game");
            if (string_15_ == null || !string_15_.equals("1"))
                Class68_Sub13_Sub34.game = 0;
            else
                Class68_Sub13_Sub34.game = 1;
            try
            {
                Class68_Sub13_Sub10.anInt3599 = Integer.parseInt(this.getParameter("js"));
                Class20.anInt403 = Integer.parseInt(this.getParameter("plug"));
                Class68_Sub13_Sub20.anInt3782 = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception exception)
            {
                /* empty */
            }
            Class26.aClass100_521 = Class68_Sub24.aClass100_3164.method1616(this, (byte) -31);
            if (Class26.aClass100_521 == null)
                Class26.aClass100_521 = Class68_Sub28_Sub2.aClass100_4558;
            String string_16_ = this.getParameter("advert");
            if (string_16_ != null)
            {
                byte[] is;
                try
                {
                    is = string_16_.getBytes("ISO-8859-1");
                } catch (java.io.UnsupportedEncodingException unsupportedencodingexception)
                {
                    is = string_16_.getBytes();
                }
                MutableString class100 = Class68_Sub13_Sub27.method842(is.length, is, 0);
                boolean bool = Class68_Sub13_Sub26_Sub1.method833((byte) -101, class100);
                if (bool)
                    GameApplet.aClass100_31 = class100;
            }
            Class68_Sub9.serverAddress = this.getCodeBase().getHost();
            this.method19(-9, Class13_Sub4.mode + 32, 503, 765, 508);
        }
    }

    static final Widget method36(Widget class45)
    {
        int i = Class68_Sub8.method674(method41(class45), -528748559);
        if (i == 0)
            return null;
        for (int i_17_ = 0; i_17_ < i; i_17_++)
        {
            class45 = Class68_Sub20_Sub15.method1170(((Widget) class45).anInt799, (byte) -80);
            if (class45 == null)
                return null;
        }
        return class45;
    }

    static final void method37(int i, boolean bool)
    {
        anInt2377++;
        if (bool != true)
            method45(null);
        Class68_Sub13_Sub36.anInt4035 = 50;
        Class68_Sub13_Sub12.anInt3646 = i;
    }

    private final void method38(int i)
    {
        anInt2372++;
        Class68_Sub13_Sub19.method795(this, (byte) 100);
        if (i != 1)
            method38(114);
        for (Class43.anInt739 = 0; Class68_Sub25.method1210((byte) 111) && Class43.anInt739 < 128; Class43.anInt739++)
        {
            ClientScript.anIntArray4387[Class43.anInt739] = Class59.anInt1104;
            Class50.anIntArray983[Class43.anInt739] = Character.anInt2538;
        }
        Class109.anInt1846++;
        if (Class68_Sub13_Sub10.anInt3597 != -1)
            Class25.method384(-59, Class68_Sub13_Sub10.anInt3597, Class13_Sub3.appletWidth, 0, 0, 0, 0, Class68_Sub13_Sub9.appletHeight);
        Class68_Sub22.anInt3150++;
        Class30.method404((byte) 113);
        for (;;)
        {
            ScriptParameters class68_sub29 = (ScriptParameters) Class35.aClass16_623.method294(-120);
            if (class68_sub29 == null)
                break;
            Widget class45 = ((ScriptParameters) class68_sub29).aClass45_3241;
            if (((Widget) class45).anInt867 >= 0)
            {
                Widget class45_18_ = Class68_Sub20_Sub15.method1170((((Widget) class45).anInt799), (byte) -80);
                if (class45_18_ == null || ((Widget) class45_18_).widgetCache == null || (((Widget) class45_18_).widgetCache.length <= ((Widget) class45).anInt867) || class45 != (((Widget) class45_18_).widgetCache[((Widget) class45).anInt867]))
                    continue;
            }
            Class68_Sub13_Sub16.method776(class68_sub29, 16);
        }
        for (;;)
        {
            ScriptParameters class68_sub29 = (ScriptParameters) Class13_Sub1.aClass16_2629.method294(54);
            if (class68_sub29 == null)
                break;
            Widget class45 = ((ScriptParameters) class68_sub29).aClass45_3241;
            if (((Widget) class45).anInt867 >= 0)
            {
                Widget class45_19_ = Class68_Sub20_Sub15.method1170((((Widget) class45).anInt799), (byte) -80);
                if (class45_19_ == null || ((Widget) class45_19_).widgetCache == null || (((Widget) class45).anInt867 >= ((Widget) class45_19_).widgetCache.length) || (((Widget) class45_19_).widgetCache[((Widget) class45).anInt867]) != class45)
                    continue;
            }
            Class68_Sub13_Sub16.method776(class68_sub29, i + 15);
        }
        for (;;)
        {
            ScriptParameters class68_sub29 = (ScriptParameters) Class115.aClass16_1957.method294(103);
            if (class68_sub29 == null)
                break;
            Widget class45 = ((ScriptParameters) class68_sub29).aClass45_3241;
            if (((Widget) class45).anInt867 >= 0)
            {
                Widget class45_20_ = Class68_Sub20_Sub15.method1170((((Widget) class45).anInt799), (byte) -80);
                if (class45_20_ == null || ((Widget) class45_20_).widgetCache == null || (((Widget) class45).anInt867 >= ((Widget) class45_20_).widgetCache.length) || class45 != (((Widget) class45_20_).widgetCache[((Widget) class45).anInt867]))
                    continue;
            }
            Class68_Sub13_Sub16.method776(class68_sub29, i ^ 0x11);
        }
        if (Class35.aClass45_606 != null)
            Class127.method1783((byte) -118);
    }

    private final void method39(byte i)
    {
        if (i == -122)
        {
            anInt2368++;
            boolean bool = Class44.method488(-127);
            if (!bool)
                doUpdateServer(0);
        }
    }

    public static void method40(boolean bool)
    {
        if (bool == true)
        {
            aClass21_2382 = null;
            aClass68_Sub12_2381 = null;
        }
    }

    final void method33(int i)
    {
        anInt2383++;
        if (i == 2 && GameException.anInt2233 != 1000)
        {
            Class68_Sub3.loopCycle++;
            if (Class68_Sub3.loopCycle % 1000 == 1)
            {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                Class68_Sub13_Sub4.anInt3511 = (gregoriancalendar.get(11) * 600 - (-(gregoriancalendar.get(12) * 10) - gregoriancalendar.get(13) / 6));
                Class68_Sub13_Sub26.aRandom3875.setSeed((long) Class68_Sub13_Sub4.anInt3511);
            }
            method39((byte) -122);
            Class68_Sub28_Sub2.method1271((byte) -38);
            Class68_Sub13_Sub9.method737(true);
            Class49.method524(16322);
            Class68_Sub24.method1206(i ^ 0x7c);
            Class67.method640(-1);
            if (MutableString.aClass97_2263 != null)
            {
                int i_21_ = MutableString.aClass97_2263.method1563(false);
                Class68_Sub13_Sub30.anInt3950 = i_21_;
            }
            if (GameException.anInt2233 != 0)
            {
                if (GameException.anInt2233 == 5)
                {
                    method35((byte) 68);
                    Class20.method327((byte) 50);
                } else if (GameException.anInt2233 == 25 || GameException.anInt2233 == 28)
                    GameSocket.method598(94);
            } else
            {
                method35((byte) 68);
                Class20.method327((byte) 104);
            }
            if (GameException.anInt2233 != 10)
            {
                if (GameException.anInt2233 != 30)
                {
                    if (GameException.anInt2233 == 40)
                    {
                        Login.login(false);
                        if (Class68_Sub20_Sub7.anInt4259 != -3)
                        {
                            if (Class68_Sub20_Sub7.anInt4259 != 15)
                            {
                                if (Class68_Sub20_Sub7.anInt4259 != 2)
                                    Player.method161(i + 62);
                            } else
                                Class68_Sub13_Sub34.method874(2);
                        }
                    }
                } else
                    Class90.method1517(true);
            } else
            {
                method38(1);
                Class49.method525((byte) 42);
                Login.login(false);
            }
        }
    }

    static final int method41(Widget class45)
    {
        Class68_Sub10 class68_sub10 = (Class68_Sub10) (Class106.aClass113_1805.method1684((((long) ((Widget) class45).anInt792 << 32) + (long) ((Widget) class45).anInt867), 109));
        if (class68_sub10 != null)
            return ((Class68_Sub10) class68_sub10).anInt2904;
        return ((Widget) class45).anInt763;
    }

    private final void doUpdateServer(int i)
    {
        anInt2385++;
        if (i == 0)
        {
            if (Class75_Sub1_Sub1.anInt4587 >= 4)
            {
                this.error_fatal("js5crc");
                GameException.anInt2233 = 1000;
            } else
            {
                if (Class68_Sub10.anInt2911 >= 4)
                {
                    if (GameException.anInt2233 == 0 || GameException.anInt2233 == 5)
                    {
                        this.error_fatal("js5io");
                        GameException.anInt2233 = 1000;
                        return;
                    }
                    Class13_Sub2.anInt2654 = 3000;
                    Class68_Sub10.anInt2911 = 3;
                }
                if (Class13_Sub2.anInt2654-- <= 0)
                {
                    do
                    {
                        try
                        {
                            if (Class84.anInt1542 == 0)
                            {
                                //System.out.println(Class103.port);
                                Class103.port = client.ondemandPort;
                                Class68_Sub9.serverAddress = "localhost";
                                Class68_Sub13_Sub9.unknownSocket = (Class75_Sub1_Sub1.signlink.method559(Class68_Sub9.serverAddress, (byte) 115, Class103.port));
                                Class84.anInt1542++;
                            }
                            if (Class84.anInt1542 == 1)
                            {
                                if (Class68_Sub13_Sub9.unknownSocket.anInt555 == 2)
                                {
                                    resetUpdateServer(-5, -1);
                                    break;
                                }
                                if (Class68_Sub13_Sub9.unknownSocket.anInt555 == 1)
                                    Class84.anInt1542++;
                            }
                            if (Class84.anInt1542 == 2)
                            {
                                Class109.updateServer = new GameSocket((Socket) (Class68_Sub13_Sub9.unknownSocket.playerDefSocket), (Class75_Sub1_Sub1.signlink));
                                Stream class68_sub14 = new Stream(5);
                                class68_sub14.writeByte(15);
                                class68_sub14.writeDWord(508);
                                Class109.updateServer.queueBytes(0, (byte) 82, 5, (((Stream) class68_sub14).buffer));
                                Class84.anInt1542++;
                                Character.aLong2587 = Class36.method438(17161);
                            }
                            if (Class84.anInt1542 == 3)
                            {
                                if (GameException.anInt2233 != 0 && GameException.anInt2233 != 5 && Class109.updateServer.available() <= 0)
                                {
                                    if ((Class36.method438(i + 17161) - Character.aLong2587) > 30000L)
                                    {
                                        resetUpdateServer(i - 5, -2);
                                        break;
                                    }
                                } else
                                {
                                    int i_22_ = Class109.updateServer.method593(96);
                                    if (i_22_ != 0)
                                    {
                                        resetUpdateServer(-5, i_22_);
                                        break;
                                    }
                                    Class84.anInt1542++;
                                }
                            }
                            if (Class84.anInt1542 != 4)
                                break;
                            boolean bool = (GameException.anInt2233 == 5 || GameException.anInt2233 == 10 || GameException.anInt2233 == 28);
                            NodeCache.method1691(Class109.updateServer, false, !bool);
                            Class127.anInt2211 = 0;
                            Class68_Sub13_Sub9.unknownSocket = null;
                            Class84.anInt1542 = 0;
                            Class109.updateServer = null;
                        } catch (java.io.IOException ioexception)
                        {
                            resetUpdateServer(-5, -3);
                        }
                        break;
                    } while (false);
                }
            }
        }
    }

    static final void method43(Widget[] class45s, int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_)
    {
        for (int i_29_ = 0; i_29_ < class45s.length; i_29_++)
        {
            Widget class45 = class45s[i_29_];
            if (class45 != null && ((Widget) class45).anInt799 == i && (!((Widget) class45).aBoolean863 || ((Widget) class45).type == 0 || ((Widget) class45).aBoolean851 || method41(class45) != 0 || class45 == Class68_Sub13_Sub26_Sub1.aClass45_4609 || ((Widget) class45).anInt808 == 1338) && (!((Widget) class45).aBoolean863 || !method45(class45)))
            {
                int i_30_ = ((Widget) class45).x + i_27_;
                int i_31_ = ((Widget) class45).y + i_28_;
                int i_32_;
                int i_33_;
                int i_34_;
                int i_35_;
                if (((Widget) class45).type == 2)
                {
                    i_32_ = i_23_;
                    i_33_ = i_24_;
                    i_34_ = i_25_;
                    i_35_ = i_26_;
                } else
                {
                    int i_36_ = i_30_ + ((Widget) class45).anInt892;
                    int i_37_ = i_31_ + ((Widget) class45).anInt873;
                    if (((Widget) class45).type == 9)
                    {
                        i_36_++;
                        i_37_++;
                    }
                    i_32_ = i_30_ > i_23_ ? i_30_ : i_23_;
                    i_33_ = i_31_ > i_24_ ? i_31_ : i_24_;
                    i_34_ = i_36_ < i_25_ ? i_36_ : i_25_;
                    i_35_ = i_37_ < i_26_ ? i_37_ : i_26_;
                }
                if (class45 == Class35.aClass45_606)
                {
                    Class124.aBoolean2161 = true;
                    Class68_Sub28_Sub2.anInt4547 = i_30_;
                    Class22.anInt481 = i_31_;
                }
                if (!((Widget) class45).aBoolean863 || i_32_ < i_34_ && i_33_ < i_35_)
                {
                    if (((Widget) class45).type == 0)
                    {
                        if (!((Widget) class45).aBoolean863 && method45(class45) && Class108.aClass45_1827 != class45)
                            continue;
                        if (((Widget) class45).aBoolean916 && Class96.anInt1697 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1697 < i_34_ && Class13.anInt223 < i_35_)
                        {
                            for (ScriptParameters class68_sub29 = ((ScriptParameters) Class115.aClass16_1957.method293((byte) 76)); class68_sub29 != null; class68_sub29 = ((ScriptParameters) Class115.aClass16_1957.method290((byte) -110)))
                            {
                                if (((ScriptParameters) class68_sub29).aBoolean3244)
                                    class68_sub29.unlink();
                            }
                            if (Class68_Sub26.anInt3202 == 0)
                            {
                                Class35.aClass45_606 = null;
                                Class68_Sub13_Sub26_Sub1.aClass45_4609 = null;
                            }
                            Class68_Sub10.aBoolean2905 = false;
                        }
                    }
                    if (((Widget) class45).aBoolean863)
                    {
                        boolean bool;
                        if (Class96.anInt1697 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1697 < i_34_ && Class13.anInt223 < i_35_)
                            bool = true;
                        else
                            bool = false;
                        boolean bool_38_ = false;
                        if (Class68_Sub20_Sub12.anInt4354 == 1 && bool)
                            bool_38_ = true;
                        boolean bool_39_ = false;
                        if (Class29.anInt537 == 1 && Class68_Sub13_Sub37.anInt4079 >= i_32_ && Class125.anInt2175 >= i_33_ && Class68_Sub13_Sub37.anInt4079 < i_34_ && Class125.anInt2175 < i_35_)
                            bool_39_ = true;
                        if (Class43.anInt739 > 0 && ((Widget) class45).aByteArray907 != null)
                        {
                            for (int i_40_ = 0; (i_40_ < ((Widget) class45).aByteArray907.length); i_40_++)
                            {
                                for (int i_41_ = 0; i_41_ < Class43.anInt739; i_41_++)
                                {
                                    int i_42_ = ((((Widget) class45).aByteArray907[i_40_]) & 0xff);
                                    if (i_42_ == (ClientScript.anIntArray4387[i_41_]))
                                        Class17.method298((((Widget) class45).anInt792), (byte) 111, i_40_ + 1, (Class68_Sub28_Sub2.aClass100_4558), -1);
                                }
                            }
                        }
                        if (bool_39_)
                            Class91.method1529((Class68_Sub13_Sub37.anInt4079 - i_30_), Class125.anInt2175 - i_31_, -4798, class45);
                        if (Class35.aClass45_606 != null && Class35.aClass45_606 != class45 && bool && Class68_Sub13_Sub19.method794(32157, method41(class45)))
                            Animable.aClass45_61 = class45;
                        if (class45 == Class68_Sub13_Sub26_Sub1.aClass45_4609)
                        {
                            Class68_Sub18.aBoolean3060 = true;
                            Class68_Sub13_Sub37.anInt4075 = i_30_;
                            NodeCache.anInt1905 = i_31_;
                        }
                        if (((Widget) class45).aBoolean851 || ((Widget) class45).anInt808 != 0)
                        {
                            if (bool && Class68_Sub13_Sub30.anInt3950 != 0 && (((Widget) class45).anObjectArray848 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).anInt3234 = Class68_Sub13_Sub30.anInt3950;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray848;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if (Class35.aClass45_606 != null || Class54.aClass45_1033 != null || Class120.menuOpen || (((Widget) class45).anInt808 != 1400 && Class68_Sub10.aBoolean2905))
                            {
                                bool_39_ = false;
                                bool_38_ = false;
                                bool = false;
                            }
                            if (((Widget) class45).anInt808 != 0)
                            {
                                if (((Widget) class45).anInt808 == 1337)
                                {
                                    Class68_Sub20_Sub17.aClass45_4443 = class45;
                                    NodeCache.method1688(class45, -120);
                                    continue;
                                }
                                if (((Widget) class45).anInt808 == 1338)
                                {
                                    if (bool_39_)
                                        Class68_Sub20_Sub11.method1149(99, class45, Class125.anInt2175 - i_31_, (Class68_Sub13_Sub37.anInt4079 - i_30_));
                                    continue;
                                }
                                if (((Widget) class45).anInt808 == 1400)
                                {
                                    Node.aClass45_1231 = class45;
                                    if (bool_39_)
                                    {
                                        if (NodeSubList.aBooleanArray2230[82] && (Class68_Sub13_Sub13.anInt3665 > 0))
                                        {
                                            int i_43_ = (int) ((double) ((Class68_Sub13_Sub37.anInt4079) - i_30_ - ((((Widget) class45).anInt892) / 2)) * 2.0 / (double) (Class68_Sub9.aFloat2894));
                                            int i_44_ = (int) ((double) ((Class125.anInt2175) - i_31_ - ((((Widget) class45).anInt873) / 2)) * 2.0 / (double) (Class68_Sub9.aFloat2894));
                                            int i_45_ = ((Class68_Sub13_Sub24.anInt3846) + i_43_);
                                            int i_46_ = Class85.anInt1553 + i_44_;
                                            int i_47_ = i_45_ + Class70.anInt1273;
                                            int i_48_ = (Class103.anInt1770 - 1 - i_46_ + Ground.anInt2762);
                                            Class51.method539(i_47_, 0, i_48_, 24867);
                                            Class20.method320(636);
                                        } else
                                        {
                                            Class68_Sub10.aBoolean2905 = true;
                                            Class68_Sub13_Sub25.anInt3855 = Class96.anInt1697;
                                            Class58.anInt1087 = Class13.anInt223;
                                            GameApplet.anInt2 = (Class68_Sub13_Sub24.anInt3846);
                                            NPCDefinition.anInt1447 = Class85.anInt1553;
                                        }
                                    } else if (bool_38_ && Class68_Sub10.aBoolean2905)
                                    {
                                        Class68_Sub8.method675((GameApplet.anInt2 + (int) ((double) ((Class68_Sub13_Sub25.anInt3855) - (Class96.anInt1697)) * 2.0 / (double) (Class68_Sub13_Sub27.aFloat3915))), -1);
                                        Class68_Sub13_Sub12.method754((NPCDefinition.anInt1447 + (int) ((double) ((Class58.anInt1087) - (Class13.anInt223)) * 2.0 / (double) (Class68_Sub13_Sub27.aFloat3915))), 112);
                                    } else
                                        Class68_Sub10.aBoolean2905 = false;
                                    continue;
                                }
                                if (((Widget) class45).anInt808 == 1401)
                                {
                                    if (bool_38_)
                                        Class68_Sub17.method991(((Widget) class45).anInt873, false, Class13.anInt223 - i_31_, ((Widget) class45).anInt892, Class96.anInt1697 - i_30_);
                                    continue;
                                }
                                if (((Widget) class45).anInt808 == 1402)
                                {
                                    NodeCache.method1688(class45, -121);
                                    continue;
                                }
                                if (((Widget) class45).anInt808 == 1404)
                                {
                                    NodeCache.method1688(class45, -119);
                                    continue;
                                }
                            }
                            if (!((Widget) class45).aBoolean850 && bool_39_)
                            {
                                ((Widget) class45).aBoolean850 = true;
                                if (((Widget) class45).anObjectArray788 != null)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).anInt3242 = (Class68_Sub13_Sub37.anInt4079 - i_30_);
                                    ((ScriptParameters) class68_sub29).anInt3234 = Class125.anInt2175 - i_31_;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray788;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                }
                            }
                            if (((Widget) class45).aBoolean850 && bool_38_ && (((Widget) class45).anObjectArray911 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).anInt3242 = Class96.anInt1697 - i_30_;
                                ((ScriptParameters) class68_sub29).anInt3234 = Class13.anInt223 - i_31_;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray911;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if (((Widget) class45).aBoolean850 && !bool_38_)
                            {
                                ((Widget) class45).aBoolean850 = false;
                                if (((Widget) class45).anObjectArray790 != null)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).anInt3242 = Class96.anInt1697 - i_30_;
                                    ((ScriptParameters) class68_sub29).anInt3234 = Class13.anInt223 - i_31_;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray790;
                                    Class13_Sub1.aClass16_2629.pushFront(class68_sub29);
                                }
                            }
                            if (bool_38_ && (((Widget) class45).anObjectArray821 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).anInt3242 = Class96.anInt1697 - i_30_;
                                ((ScriptParameters) class68_sub29).anInt3234 = Class13.anInt223 - i_31_;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray821;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if (!((Widget) class45).aBoolean905 && bool)
                            {
                                ((Widget) class45).aBoolean905 = true;
                                if (((Widget) class45).anObjectArray784 != null)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).anInt3242 = Class96.anInt1697 - i_30_;
                                    ((ScriptParameters) class68_sub29).anInt3234 = Class13.anInt223 - i_31_;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray784;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                }
                            }
                            if (((Widget) class45).aBoolean905 && bool && (((Widget) class45).anObjectArray838 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).anInt3242 = Class96.anInt1697 - i_30_;
                                ((ScriptParameters) class68_sub29).anInt3234 = Class13.anInt223 - i_31_;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray838;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if (((Widget) class45).aBoolean905 && !bool)
                            {
                                ((Widget) class45).aBoolean905 = false;
                                if (((Widget) class45).anObjectArray772 != null)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aBoolean3244 = true;
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).anInt3242 = Class96.anInt1697 - i_30_;
                                    ((ScriptParameters) class68_sub29).anInt3234 = Class13.anInt223 - i_31_;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray772;
                                    Class13_Sub1.aClass16_2629.pushFront(class68_sub29);
                                }
                            }
                            if (((Widget) class45).anObjectArray878 != null)
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray878;
                                Class35.aClass16_623.pushFront(class68_sub29);
                            }
                            if (((Widget) class45).anObjectArray875 != null && (Class13_Sub1.anInt2641 > ((Widget) class45).anInt879))
                            {
                                if (((Widget) class45).anIntArray900 == null || (Class13_Sub1.anInt2641 - ((Widget) class45).anInt879) > 32)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray875;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                } else
                                {
                                    while_2_: for (int i_49_ = ((Widget) class45).anInt879; i_49_ < Class13_Sub1.anInt2641; i_49_++)
                                    {
                                        int i_50_ = (Class125.anIntArray2171[i_49_ & 0x1f]);
                                        for (int i_51_ = 0; i_51_ < (((Widget) class45).anIntArray900).length; i_51_++)
                                        {
                                            if ((((Widget) class45).anIntArray900[i_51_]) == i_50_)
                                            {
                                                ScriptParameters class68_sub29 = new ScriptParameters();
                                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                                ((ScriptParameters) class68_sub29).parameters = (((Widget) class45).anObjectArray875);
                                                Class115.aClass16_1957.pushFront(class68_sub29);
                                                break while_2_;
                                            }
                                        }
                                    }
                                }
                                ((Widget) class45).anInt879 = Class13_Sub1.anInt2641;
                            }
                            if (((Widget) class45).anObjectArray835 != null && (Class68_Sub10.anInt2910 > ((Widget) class45).anInt877))
                            {
                                if (((Widget) class45).anIntArray780 == null || (Class68_Sub10.anInt2910 - ((Widget) class45).anInt877) > 32)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray835;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                } else
                                {
                                    while_3_: for (int i_52_ = ((Widget) class45).anInt877; i_52_ < Class68_Sub10.anInt2910; i_52_++)
                                    {
                                        int i_53_ = (Class68_Sub13_Sub31.anIntArray3972[i_52_ & 0x1f]);
                                        for (int i_54_ = 0; i_54_ < (((Widget) class45).anIntArray780).length; i_54_++)
                                        {
                                            if ((((Widget) class45).anIntArray780[i_54_]) == i_53_)
                                            {
                                                ScriptParameters class68_sub29 = new ScriptParameters();
                                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                                ((ScriptParameters) class68_sub29).parameters = (((Widget) class45).anObjectArray835);
                                                Class115.aClass16_1957.pushFront(class68_sub29);
                                                break while_3_;
                                            }
                                        }
                                    }
                                }
                                ((Widget) class45).anInt877 = Class68_Sub10.anInt2910;
                            }
                            if (((Widget) class45).anObjectArray786 != null && (Class68_Sub4.anInt2817 > ((Widget) class45).anInt855))
                            {
                                if (((Widget) class45).anIntArray787 == null || (Class68_Sub4.anInt2817 - ((Widget) class45).anInt855) > 32)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray786;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                } else
                                {
                                    while_4_: for (int i_55_ = ((Widget) class45).anInt855; i_55_ < Class68_Sub4.anInt2817; i_55_++)
                                    {
                                        int i_56_ = (Class68_Sub13_Sub34.anIntArray4014[i_55_ & 0x1f]);
                                        for (int i_57_ = 0; i_57_ < (((Widget) class45).anIntArray787).length; i_57_++)
                                        {
                                            if ((((Widget) class45).anIntArray787[i_57_]) == i_56_)
                                            {
                                                ScriptParameters class68_sub29 = new ScriptParameters();
                                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                                ((ScriptParameters) class68_sub29).parameters = (((Widget) class45).anObjectArray786);
                                                Class115.aClass16_1957.pushFront(class68_sub29);
                                                break while_4_;
                                            }
                                        }
                                    }
                                }
                                ((Widget) class45).anInt855 = Class68_Sub4.anInt2817;
                            }
                            if (((Widget) class45).anObjectArray837 != null && (ScriptParameters.anInt3245 > ((Widget) class45).anInt889))
                            {
                                if (((Widget) class45).anIntArray887 == null || (ScriptParameters.anInt3245 - ((Widget) class45).anInt889) > 32)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray837;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                } else
                                {
                                    while_5_: for (int i_58_ = ((Widget) class45).anInt889; i_58_ < ScriptParameters.anInt3245; i_58_++)
                                    {
                                        int i_59_ = (Class68_Sub13_Sub39.anIntArray4104[i_58_ & 0x1f]);
                                        for (int i_60_ = 0; i_60_ < (((Widget) class45).anIntArray887).length; i_60_++)
                                        {
                                            if ((((Widget) class45).anIntArray887[i_60_]) == i_59_)
                                            {
                                                ScriptParameters class68_sub29 = new ScriptParameters();
                                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                                ((ScriptParameters) class68_sub29).parameters = (((Widget) class45).anObjectArray837);
                                                Class115.aClass16_1957.pushFront(class68_sub29);
                                                break while_5_;
                                            }
                                        }
                                    }
                                }
                                ((Widget) class45).anInt889 = ScriptParameters.anInt3245;
                            }
                            if (((Widget) class45).anObjectArray861 != null && (Class30.anInt544 > ((Widget) class45).anInt839))
                            {
                                if (((Widget) class45).anIntArray891 == null || (Class30.anInt544 - ((Widget) class45).anInt839) > 32)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray861;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                } else
                                {
                                    while_6_: for (int i_61_ = ((Widget) class45).anInt839; i_61_ < Class30.anInt544; i_61_++)
                                    {
                                        int i_62_ = (Class68_Sub13_Sub36.anIntArray4046[i_61_ & 0x1f]);
                                        for (int i_63_ = 0; i_63_ < (((Widget) class45).anIntArray891).length; i_63_++)
                                        {
                                            if ((((Widget) class45).anIntArray891[i_63_]) == i_62_)
                                            {
                                                ScriptParameters class68_sub29 = new ScriptParameters();
                                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                                ((ScriptParameters) class68_sub29).parameters = (((Widget) class45).anObjectArray861);
                                                Class115.aClass16_1957.pushFront(class68_sub29);
                                                break while_6_;
                                            }
                                        }
                                    }
                                }
                                ((Widget) class45).anInt839 = Class30.anInt544;
                            }
                            if ((Class68_Sub20_Sub3.anInt4198 > ((Widget) class45).anInt836) && (((Widget) class45).anObjectArray812 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray812;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if ((Keyboard.anInt2132 > ((Widget) class45).anInt836) && (((Widget) class45).anObjectArray843 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray843;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if ((Class68_Sub28_Sub2.anInt4549 > ((Widget) class45).anInt836) && (((Widget) class45).anObjectArray871 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray871;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if (Class4.anInt93 > ((Widget) class45).anInt836 && (((Widget) class45).anObjectArray872 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray872;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            if ((Class68_Sub20_Sub5.anInt4222 > ((Widget) class45).anInt836) && (((Widget) class45).anObjectArray874 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray874;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                            ((Widget) class45).anInt836 = Class68_Sub22.anInt3150;
                            if (((Widget) class45).anObjectArray868 != null)
                            {
                                for (int i_64_ = 0; i_64_ < Class43.anInt739; i_64_++)
                                {
                                    ScriptParameters class68_sub29 = new ScriptParameters();
                                    ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                    ((ScriptParameters) class68_sub29).anInt3232 = (ClientScript.anIntArray4387[i_64_]);
                                    ((ScriptParameters) class68_sub29).anInt3243 = Class50.anIntArray983[i_64_];
                                    ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray868;
                                    Class115.aClass16_1957.pushFront(class68_sub29);
                                }
                            }
                            if (MutableString.aBoolean2281 && (((Widget) class45).anObjectArray801 != null))
                            {
                                ScriptParameters class68_sub29 = new ScriptParameters();
                                ((ScriptParameters) class68_sub29).aClass45_3241 = class45;
                                ((ScriptParameters) class68_sub29).parameters = ((Widget) class45).anObjectArray801;
                                Class115.aClass16_1957.pushFront(class68_sub29);
                            }
                        }
                    }
                    if (!((Widget) class45).aBoolean863 && Class35.aClass45_606 == null && Class54.aClass45_1033 == null && !Class120.menuOpen)
                    {
                        if ((((Widget) class45).anInt844 >= 0 || ((Widget) class45).anInt828 != 0) && Class96.anInt1697 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1697 < i_34_ && Class13.anInt223 < i_35_)
                        {
                            if (((Widget) class45).anInt844 >= 0)
                                Class108.aClass45_1827 = class45s[((Widget) class45).anInt844];
                            else
                                Class108.aClass45_1827 = class45;
                        }
                        if (((Widget) class45).type == 8 && Class96.anInt1697 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1697 < i_34_ && Class13.anInt223 < i_35_)
                            Class121.aClass45_2110 = class45;
                        if (((Widget) class45).anInt794 > ((Widget) class45).anInt873)
                            Class68_Sub20_Sub11.method1147(i_31_, class45, ((Widget) class45).anInt873, ((Widget) class45).anInt794, 25504, i_30_ + ((Widget) class45).anInt892, Class13.anInt223, Class96.anInt1697);
                    }
                    if (((Widget) class45).type == 0)
                    {
                        method43(class45s, ((Widget) class45).anInt792, i_32_, i_33_, i_34_, i_35_, i_30_ - ((Widget) class45).anInt847, i_31_ - ((Widget) class45).anInt818);
                        if (((Widget) class45).widgetCache != null)
                            method43(((Widget) class45).widgetCache, ((Widget) class45).anInt792, i_32_, i_33_, i_34_, i_35_, i_30_ - ((Widget) class45).anInt847, i_31_ - ((Widget) class45).anInt818);
                        Class68_Sub3 class68_sub3 = ((Class68_Sub3) (Login.aClass113_1514.method1684((long) ((Widget) class45).anInt792, 84)));
                        if (class68_sub3 != null)
                            Class25.method384(-114, (((Class68_Sub3) class68_sub3).anInt2805), i_34_, i_33_, i_31_, i_30_, i_32_, i_35_);
                    }
                }
            }
        }
    }

    final void method23(int i)
    {
        int i_65_ = anInt2387;
        method40(true);
        MutableString.method1585((byte) -112);
        Class71.method1342(true);
        anInt2379++;
        Class68_Sub20_Sub16.method1175(25465);
        Class91.method1528((byte) -84);
        GameApplet.method22((byte) -26);
        Class50.method527(-116);
        Class72.method1351((byte) 116);
        Class84.method1483((byte) -127);
        Class23.method378(8);
        Stream.method962();
        GameSocket.method599((byte) -12);
        Class21_Sub1.method370(-677379135);
        Class124.method1762(true);
        Class89.method1507((byte) 102);
        MRUNodes.method1571((byte) 127);
        CipheredByteVector.method974(false);
        NodeList.method281(0);
        GroundData.method456((byte) -105);
        Widget.method500(104);
        Player.method162((byte) 63);
        NodeCache.method1693(0);
        Class97.method1565(1);
        Class68_Sub19.method998(true);
        Class49.method521(true);
        Class68_Sub20_Sub10.method1116((byte) -126);
        Class68_Sub28_Sub1.method1257((byte) 105);
        Class35.method427((byte) -90);
        Class95.method1551(-26412);
        PlayerDefinition.method1776(63);
        Animation.method1724(31891);
        Character.method145(2);
        Ground.method649(0);
        Class68_Sub2.method650((byte) 68);
        NPCDefinition.method1452(1);
        Class68_Sub3.method653(true);
        Node.method643(-120);
        NodeSubList.method1791(-74);
        RandomNumberGenerator.method1465((byte) 117);
        Class37.method440(-121);
        Class108.method1662(29889);
        Class94.method1550((byte) -52);
        GameException.method1800(64);
        Class63.method621((byte) 126);
        Class11.method230((byte) 102);
        Class12.method237(-5);
        ObjectDefinition.method1719(0);
        Class25.method385(0);
        Class56.method569(true);
        Class21.method356(71);
        Class1_Sub4.method116();
        Class44.method494(8412);
        ItemDefinition.method313(-1);
        SpriteFactory.method96();
        Keyboard.method1756(24205);
        Mouse.method1489(-20033);
        Class36.method439((byte) 127);
        Class66.method636(0);
        Class87.method1494((byte) -126);
        Class78.method1417(5756);
        Class14.method269(false);
        Class125.method1770(110);
        Class29.method402(112);
        Class92.method1536(-1);
        Class68_Sub20_Sub1.method1033();
        Class28.method400(-1);
        Object5.method1330(24);
        Class8.method206((byte) -9);
        Animable.method61(123);
        Object1.method623(-1154);
        Object2.method1408(162);
        Object3.method512((byte) -123);
        Object4.method574(156);
        Class7.method200((byte) 29);
        Class77.method1409();
        NodeSub.method1003((byte) -82);
        Login.method1473((byte) 69);
        Class90.method1525(6287);
        Class62.method602();
        Class79.method1426();
        Class68_Sub20_Sub6.method1069(-116);
        Class68_Sub20_Sub17.method1179(499);
        Class119.method1740(-99);
        Class30.method403(0);
        Class52.method544((byte) -65);
        Class71_Sub1.method1343(false);
        Class65.method632();
        Class109.method1664(20);
        Class114.method1695(true);
        Class120.method1744(0);
        Class68_Sub20_Sub15.method1168((byte) -63);
        Class68_Sub26.method1217(32125);
        Class10.method218();
        Class68_Sub28_Sub2.method1268(-57);
        Class68_Sub27.method1222(-1);
        Class74.method1379(-97);
        Class102.method1632(32768);
        Class68_Sub20_Sub12.method1152(true);
        Class9.method211(-46);
        Class34.method417(true);
        Class53.method550((byte) -28);
        Class112.method1676(133988164);
        Class68_Sub20_Sub7.method1073(-23562);
        Class96.method1559((byte) 71);
        Class67.method639(988656400);
        Class70.unsetStatic();
        Class48.method516(113);
        Class32.method410((byte) -121);
        Class68_Sub20_Sub2.method1042((byte) 23);
        Class68_Sub20_Sub3.method1056(0);
        Class68_Sub20_Sub8.method1092(1);
        Class51.method540(10);
        Class68_Sub20_Sub11.method1146(0);
        Class103.method1642(-11);
        Class106.method1653(0);
        Class17.method295(1);
        Class43.method482(-2);
        Class58.method583(-2);
        ScriptParameters.method1324(-108);
        Class4.method187(true);
        Class111.method1672((byte) -119);
        Class85.method1485(0);
        Class68_Sub15.method981(1);
        Class68_Sub20_Sub9.method1099(false);
        Class68_Sub22.method1201(-1);
        Class68_Sub18.method992(0);
        Class60.method588(-1);
        ClientScript.method1167(5285);
        Class54.method555((byte) 116);
        Class42.method476();
        Class59.method584(-1);
        Class121.method1749(1);
        Class118.method1738(32767);
        Class1_Sub1.method69(true);
        Class1_Sub5.method137(2);
        Class68_Sub10.method682(0);
        Item.method70(31756);
        Class1_Sub7.method168(-104);
        Class127.method1785(0);
        Class68_Sub5.method662(0);
        Class33.method411((byte) 127);
        Class68_Sub4.method658(27392);
        GameCanvas.method48((byte) 106);
        Class26.method389(-123);
        Class50_Sub2.method535(25);
        Class72_Sub1.method1368((byte) -98);
        Class104.method1644(0);
        Class107.method1659(125);
        Class15.method274(0);
        Class68_Sub20_Sub13.method1162(true);
        Class68_Sub20_Sub13_Sub2.method1164(-840517817);
        Class105.method1648(190);
        Class68_Sub16.method986(false);
        Class20.method325((byte) 87);
        Class35_Sub1.method436();
        Class6.method197();
        Class110.method1666();
        int i_66_ = 9 / ((i + 12) / 38);
        Class73.method1373();
        Class18.method299(18002);
        Class68_Sub7.method668(304);
        Class68_Sub25.method1211(121);
        Class68_Sub21.method1200();
        Class41.method470();
        Class3.method182(96);
        Class68_Sub13.method691((byte) 50);
        Class68_Sub13_Sub37.method890((byte) -37);
        Class122.method1752(-106);
        Class22.method375(124);
        Class88.method1499((byte) 103);
        Class115.method1705(100);
        Class68_Sub24.method1207((byte) -69);
        Class101.method1630(-31601);
        Class68_Sub9.method680(-19267);
        Class83.method1481(1);
        Class68_Sub13_Sub7.method727(0);
        Class68_Sub13_Sub26.method828(false);
        Class68_Sub13_Sub13.method758(1);
        Class68_Sub13_Sub16.method773(-119);
        Class68_Sub13_Sub1.method704((byte) -57);
        Class68_Sub13_Sub8.method735(9071);
        Class68_Sub13_Sub4.method714(-108);
        Class68_Sub13_Sub22.method810((byte) 25);
        Class68_Sub13_Sub9.method736(-15578);
        Class68_Sub13_Sub28.method847(true);
        Class68_Sub13_Sub25.method820(-1);
        Class68_Sub13_Sub19.method796(1);
        Class68_Sub13_Sub36.method886(0);
        Class68_Sub13_Sub30.method853(115);
        Class68_Sub13_Sub23.method815(-68);
        Class68_Sub13_Sub2.method708((byte) -47);
        Class68_Sub13_Sub38.method896((byte) -65);
        Class68_Sub13_Sub39.method902(-1);
        Class68_Sub13_Sub24.method817(0);
        Class68_Sub13_Sub20.method801(-22338);
        Class68_Sub13_Sub26_Sub1.method832((byte) -27);
        Class68_Sub13_Sub33.method866(-123);
        Class68_Sub13_Sub29.method849(121);
        Class68_Sub13_Sub34.method873(-26774);
        Class68_Sub13_Sub5.method719(4096);
        Class68_Sub13_Sub14.method762(0);
        Class68_Sub13_Sub18.method788(208);
        Class68_Sub13_Sub17.method782(0);
        Class68_Sub13_Sub10.method741((byte) -126);
        Class68_Sub13_Sub31.method860((byte) 120);
        Class68_Sub13_Sub27.method837(128);
        Class68_Sub13_Sub32.method862(-85);
        Class68_Sub13_Sub3.method712(9927);
        Class68_Sub13_Sub35.method879((byte) -127);
        Class68_Sub13_Sub15.method769((byte) 9);
        Class68_Sub13_Sub6.method722((byte) 126);
        Class68_Sub13_Sub21.method806(-80);
        Class68_Sub13_Sub11.method751((byte) -66);
        Class68_Sub13_Sub12.method755((byte) 24);
        Class75_Sub1.method1390(32655);
        Class75.method1385((byte) 45);
        Class75_Sub1_Sub1.method1396((byte) 15);
        Class75_Sub2.method1397((byte) -63);
        Class75_Sub3_Sub1.method1402(1);
        Class75_Sub3.method1400((byte) 26);
        CachedItem.method1185((byte) 74);
        Class68_Sub20_Sub4.method1058(1152);
        Class68_Sub20_Sub5.method1063(110);
        Class68_Sub8.method676(61);
        Class93.method1546(92);
        Class68_Sub20_Sub19.method1189(26507);
        Class68_Sub6.method664((byte) -80);
        Class68_Sub17.method989(125);
        Class13.method240(-28590);
        Class13_Sub2.method257((byte) 15);
        Class13_Sub3.method259(0);
        Class13_Sub1.method252(112);
        if (GameApplet.aBoolean42)
            anInt2387 = ++i_65_;
    }

    final void method27(int i)
    {
        Class68_Sub13_Sub26.method831(Class75_Sub1_Sub1.signlink, (byte) -104, Class75_Sub2.safemode);
        Class68_Sub15.anInt3015 = (i != (Class75_Sub3.location ^ 0xffffffff) ? Class106.anInt1801 + 50000 : 443);
        anInt2386++;
        if (Class68_Sub13_Sub34.game != 1)
        {
            Class120.aShortArray2100 = Class3.aShortArray75;
            Class92.aShortArrayArray1652 = Class68_Sub20_Sub19.aShortArrayArray4457;
            Class68_Sub13_Sub35.aShortArray4025 = Class68_Sub13_Sub20.aShortArray3781;
            Class56.aShortArrayArray1065 = Class68_Sub13_Sub12.aShortArrayArray3631;
        } else
        {
            Class120.aShortArray2100 = Class71.aShortArray1300;
            Class92.aShortArrayArray1652 = Class68_Sub5.aShortArrayArray2833;
            Class68_Sub13_Sub35.aShortArray4025 = Class59.aShortArray1107;
            Class56.aShortArrayArray1065 = Class13_Sub3.aShortArrayArray2676;
        }
        Class115.anInt1948 = Class75_Sub3.location == 0 ? 43594 : Class106.anInt1801 + 40000;
        Class105.aShortArray1795 = Class33.aShortArray579 = Class68_Sub13_Sub25.aShortArray3856 = Class68_Sub20_Sub7.aShortArray4268 = new short[256];
        Class103.port = Class115.anInt1948;
        Class105.method1650((byte) -109);
        Class53.method545(Mouse.gameCanvas, 1611550343);
        Class72_Sub1.method1362(i + 52, Mouse.gameCanvas);
        MutableString.aClass97_2263 = Class68_Sub20_Sub2.method1043((byte) 80);
        if (MutableString.aClass97_2263 != null)
            MutableString.aClass97_2263.method1568(Mouse.gameCanvas, true);
        Class112.anInt1902 = Signlink.anInt1054;
        try
        {
            if (Class75_Sub1_Sub1.signlink.mainFileCacheData != null)
            {
                Class68_Sub20_Sub10.aClass124_4320 = new Class124((Class75_Sub1_Sub1.signlink.mainFileCacheData), 5200, 0);
                for (int i_67_ = 0; i_67_ < 27; i_67_++)
                    Class26.aClass124Array520[i_67_] = new Class124((Class75_Sub1_Sub1.signlink.mainFileCacheIndices[i_67_]), 6000, 0);
                Class75_Sub2.aClass124_3313 = new Class124((Class75_Sub1_Sub1.signlink.mainFileCacheIndex), 6000, 0);
                Class43.aClass89_734 = new Class89(255, Class68_Sub20_Sub10.aClass124_4320, Class75_Sub2.aClass124_3313, 500000);
                Class68_Sub13_Sub4.aClass124_3488 = new Class124((Class75_Sub1_Sub1.signlink.userIDFile), 24, 0);
                Class75_Sub1_Sub1.signlink.userIDFile = null;
                Class75_Sub1_Sub1.signlink.mainFileCacheIndex = null;
                Class75_Sub1_Sub1.signlink.mainFileCacheData = null;
                Class75_Sub1_Sub1.signlink.mainFileCacheIndices = null;
            }
        } catch (java.io.IOException ioexception)
        {
            Class68_Sub20_Sub10.aClass124_4320 = null;
            Class68_Sub13_Sub4.aClass124_3488 = null;
            Class75_Sub2.aClass124_3313 = null;
            Class43.aClass89_734 = null;
        }
        if (Class75_Sub3.location != 0)
            Class68_Sub22.aBoolean3136 = true;
        Class68_Sub4.aClass100_2821 = Class48.aClass100_952;
    }

    private final void resetUpdateServer(int i, int i_68_)
    {
        anInt2371++;
        if (i != -5)
            method27(-31);
        Class68_Sub13_Sub9.unknownSocket = null;
        Class84.anInt1542 = 0;
        do
        {
            if (Class103.port == Class115.anInt1948)
            {
                Class103.port = Class68_Sub15.anInt3015;
                if (anInt2387 == 0)
                    break;
            }
            Class103.port = Class115.anInt1948;
        } while (false);
        Class127.anInt2211++;
        Class109.updateServer = null;
        if (Class127.anInt2211 < 2 || i_68_ != 7 && i_68_ != 9)
        {
            if (Class127.anInt2211 < 2 || i_68_ != 6)
            {
                if (Class127.anInt2211 >= 4)
                {
                    if (GameException.anInt2233 != 0 && GameException.anInt2233 != 5)
                        Class13_Sub2.anInt2654 = 3000;
                    else
                    {
                        this.error_fatal("js5connect");
                        GameException.anInt2233 = 1000;
                    }
                }
            } else
            {
                this.error_fatal("js5connect_outofdate");
                GameException.anInt2233 = 1000;
            }
        } else if (GameException.anInt2233 == 0 || GameException.anInt2233 == 5)
        {
            this.error_fatal("js5connect_full");
            GameException.anInt2233 = 1000;
        } else
            Class13_Sub2.anInt2654 = 3000;
    }

    static final boolean method45(Widget class45)
    {
        if (NodeSub.aBoolean3096)
        {
            if (method41(class45) != 0)
                return false;
            if (((Widget) class45).type == 0)
                return false;
        }
        return ((Widget) class45).aBoolean764;
    }

    final void method15(byte i)
    {
        anInt2376++;
        if (GameException.anInt2233 != 1000)
        {
            boolean bool = Class68_Sub13_Sub34.method872(0);
            if (bool && Keyboard.aBoolean2129 && Class68_Sub13_Sub36.aClass35_4037 != null)
                Class68_Sub13_Sub36.aClass35_4037.method428((byte) -100);
            if (i >= -56)
                init();
            boolean bool_69_ = false;
            if (GameException.anInt2233 == 30 || GameException.anInt2233 == 10)
            {
                if (!Class68_Sub13_Sub21.aBoolean3798)
                {
                    if (Class36.aLong644 != 0L && Class36.method438(17161) > Class36.aLong644)
                        Class44.method485(-1);
                } else
                    Class44.method485(-1);
            }
            if (RandomNumberGenerator.aLong1482 != 0L && Class36.method438(17161) > RandomNumberGenerator.aLong1482 && PlayerDefinition.connection != null && (GameException.anInt2233 == 30 || GameException.anInt2233 == 25))
                Class68_Sub20_Sub6.method1071((byte) -118);
            if (Class103.hasFocus)
            {
                bool_69_ = true;
                Class103.hasFocus = false;
            }
            if (bool_69_)
                Class72.method1348(0);
            if (GameException.anInt2233 == 0)
                Class68_Sub13_Sub16.method779(Class68_Sub13_Sub28.anInt3919, null, ScriptParameters.aClass100_3237, bool_69_, 23189);
            else if (GameException.anInt2233 != 5)
            {
                if (GameException.anInt2233 != 10)
                {
                    if (GameException.anInt2233 != 25 && GameException.anInt2233 != 28)
                    {
                        if (GameException.anInt2233 != 30)
                        {
                            if (GameException.anInt2233 == 40)
                                Class74.method1381(false, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class72.aClass100_1306, Class118.aClass100_2083, Animation.aClass100_2055 }))), -16678);
                        } else
                            Class68_Sub13_Sub25.method821(true);
                    } else if (Class21.anInt480 != 1)
                    {
                        if (Class21.anInt480 != 2)
                            Class74.method1381(false, (Class68_Sub13_Sub19.aClass100_3744), -16678);
                        else
                        {
                            if (Widget.anInt925 > Class68_Sub13_Sub11.anInt3604)
                                Class68_Sub13_Sub11.anInt3604 = Widget.anInt925;
                            int i_70_ = ((50 * (Class68_Sub13_Sub11.anInt3604 - Widget.anInt925) / Class68_Sub13_Sub11.anInt3604) + 50);
                            Class74.method1381(false, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { Class68_Sub13_Sub19.aClass100_3744, Class89.aClass100_1623, Class68_Sub13_Sub24.method816(i_70_, 0), Class83.aClass100_1525 }))), -16678);
                        }
                    } else
                    {
                        if (Class50_Sub2.anInt2747 < Class68_Sub13_Sub19.anInt3750)
                            Class50_Sub2.anInt2747 = Class68_Sub13_Sub19.anInt3750;
                        int i_71_ = (50 * (Class50_Sub2.anInt2747 - Class68_Sub13_Sub19.anInt3750) / Class50_Sub2.anInt2747);
                        Class74.method1381(false, (Class68_Sub20_Sub13_Sub2.method1166(2, (new MutableString[] { (Class68_Sub13_Sub19.aClass100_3744), Class89.aClass100_1623, Class68_Sub13_Sub24.method816(i_71_, 0), Class83.aClass100_1525 }))), -16678);
                    }
                } else
                    Class56.method571((byte) 46);
            } else
                Class68_Sub7.method665((Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3513), -27931);
            if ((GameException.anInt2233 == 30 || GameException.anInt2233 == 10) && Class68_Sub20_Sub5.anInt4231 == 0 && !bool_69_)
            {
                try
                {
                    Graphics graphics = Mouse.gameCanvas.getGraphics();
                    for (int i_72_ = 0; Class56.anInt1061 > i_72_; i_72_++)
                    {
                        if (Class68_Sub17.aBooleanArray3039[i_72_])
                        {
                            Class1_Sub5.aClass72_2498.method1359(graphics, true, ItemDefinition.anIntArray376[i_72_], Class105.anIntArray1797[i_72_], Class71.anIntArray1294[i_72_], Player.anIntArray3432[i_72_]);
                            Class68_Sub17.aBooleanArray3039[i_72_] = false;
                        }
                    }
                } catch (Exception exception)
                {
                    Mouse.gameCanvas.repaint();
                }
            } else if (GameException.anInt2233 != 0)
            {
                try
                {
                    Graphics graphics = Mouse.gameCanvas.getGraphics();
                    Class1_Sub5.aClass72_2498.method1350(73, 0, 0, graphics);
                    for (int i_73_ = 0; Class56.anInt1061 > i_73_; i_73_++)
                        Class68_Sub17.aBooleanArray3039[i_73_] = false;
                } catch (Exception exception)
                {
                    Mouse.gameCanvas.repaint();
                }
            }
            if (Class67.aBoolean1210)
                Class68_Sub13_Sub31.method861((byte) -128);
            if (browsercontrol.method1411() && Class71.anInt1293 != 0)
            {
                try
                {
                    Point point = Mouse.gameCanvas.getLocationOnScreen();
                    Dimension dimension = Mouse.gameCanvas.getSize();
                    browsercontrol.method1412(point.x, point.y - Class71.anInt1293, dimension.width, Class71.anInt1293);
                } catch (Exception exception)
                {
                    /* empty */
                }
            }
        }
    }

    public static final void main(String[] strings)
    {
        strings = new String[]{"1", "local", "live", "software", "members", "english", "game0"};
        try
        {
            try
            {
            	//Class75_Sub3.location = 0;
            	//Class13_Sub4.mode = 0;
            	//Class1_Sub7.members = false;
            	//Class68_Sub13_Sub27.language = 0;
            	//Class68_Sub13_Sub34.game = 0;
            	
                if (strings.length < 7 || strings.length > 8)
                    Class21.ShowUsage();
                Class106.anInt1801 = Integer.parseInt(strings[0]);
                if (strings[1].equals("live"))
                    Class75_Sub3.location = 0;
                else if (strings[1].equals("office"))
                    Class75_Sub3.location = 1;
                else if (strings[1].equals("local"))
                    Class75_Sub3.location = 2;
                else
                    Class21.ShowUsage();
                if (strings[2].equals("live"))
                    Class13_Sub4.mode = 0;
                else if (strings[2].equals("rc"))
                    Class13_Sub4.mode = 1;
                else if (!strings[2].equals("wip"))
                    Class21.ShowUsage();
                else
                    Class13_Sub4.mode = 2;
                if (strings[4].equals("free"))
                    Class1_Sub7.members = false;
                else if (strings[4].equals("members"))
                    Class1_Sub7.members = true;
                else
                    Class21.ShowUsage();
                if (strings[5].equals("english"))
                    Class68_Sub13_Sub27.language = 0;
                else if (!strings[5].equals("german"))
                    Class21.ShowUsage();
                else
                {
                    Class72_Sub1.method1369(-40);
                    Class68_Sub13_Sub27.language = 1;
                }
                if (strings[6].equals("game0"))
                    Class68_Sub13_Sub34.game = 0;
                else if (!strings[6].equals("game1"))
                    Class21.ShowUsage();
                else
                    Class68_Sub13_Sub34.game = 1;
                if (strings.length == 8)
                {
                    if (strings[7].equals("safemode"))
                        Class75_Sub2.safemode = true;
                    else
                        Class21.ShowUsage();
                } else
                    Class75_Sub2.safemode = false;
                Class68_Sub9.serverAddress = "world127.runescape.com";
                Class26.aClass100_521 = Class68_Sub28_Sub2.aClass100_4558;
                Class68_Sub13_Sub20.anInt3782 = 0;
                client var_client = new client();
                var_client.ShowFrame(765, 503, 27, "runescape", 508, Class13_Sub4.mode + 32);
                Class108.gameFrame.setLocation(40, 40);
            } catch (Exception exception)
            {
                Class71.method1339(null, exception, 38);
            }
            anInt2380++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("client.main(" + (strings != null ? "{...}" : "null") + ')'));
        }
    }
}
