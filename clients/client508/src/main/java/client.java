/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import org.moparscape.iface.ClientInterface;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.net.Socket;
import java.security.interfaces.RSAPublicKey;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class client extends Applet_Sub1 implements ClientInterface {

    public static org.moparscape.iface.Hasher hasher = null;
    public static java.awt.event.KeyListener keyListener;
    public static int[] bgImage = null;
    public static int serverPort = 43594;
    public static int ondemandPort = 43594;
    public static int jaggrabPort = 43594;
    public static String cacheDir = "./cache508/";
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

    public String getServer() {
        if(Class68_Sub9.serverAddress == null)
            Class68_Sub9.serverAddress = "localhost";
        return Class68_Sub9.serverAddress;
    }

    public Map<String, String> getParams() {
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
        ret[1] = new org.moparscape.userver.v508.OndemandServer(defaultLocation, customLocation);
        return ret;
    }

    public java.awt.Dimension getDimension() {
        return new java.awt.Dimension(765, 503);
    }

    // 508 wants an array of pixels instead of an image, oblige it
    public void setBackground(java.awt.Image image) {
        if (image == null)
            return;
        int newWidth = 956;
        int newHeight = 503;
        int oldWidth = image.getWidth(null);
        int oldHeight = image.getHeight(null);
        if (newWidth != oldWidth || newHeight != oldHeight) {
            BufferedImage bi = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
            int onEachSide = (newWidth - oldWidth) / 2;
            bi.getGraphics().drawImage(image,
                    onEachSide, 0, newWidth - onEachSide, newHeight,
                    0, 0, oldWidth, oldHeight,
                    null);
            image = bi;
        }
/*        // this kind of stretches the image, but might be needed with HD
        bi.getGraphics().drawImage(image,
                0, 0, 956, 503,
                0, 0, 766, 503,
                null);
*/
        bgImage = new int[newWidth * newHeight];
        PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, newWidth, newHeight, bgImage, 0, newWidth);
        try {
            pixelgrabber.grabPixels();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPublicKey(RSAPublicKey key) {
        Stream.publicKey = key.getPublicExponent();
        Stream.modulus = key.getModulus();
    }

    public void setHasher(org.moparscape.iface.Hasher hasher){
        client.hasher = hasher;
    }

    public static int anInt2366;
    public static int anInt2367;
    public static int anInt2368;
    public static int anInt2369;
    public static int anInt2370;
    public static int anInt2371;
    public static volatile int anInt2372 = 0;
    public static int anInt2373;
    public static int anInt2374;
    public static int anInt2375;
    public static int anInt2376 = 0;
    public static int anInt2377;
    public static int anInt2378;
    public static Class68_Sub12 aClass68_Sub12_2379;
    public static Class21renamed aClass21_2380;
    public static int anInt2381;
    public static int anInt2382 = 0;
    public static int anInt2383;
    public static int anInt2384;
    public static int anInt2385;

    public void method29(int i) {
        anInt2373++;
        if (Class75_Sub1_Sub1.signlink != null)
            Class75_Sub1_Sub1.signlink.method560(this.getClass(), 50);
        if (Class14.aClass84_241 != null)
            Class14.aClass84_241.aBoolean1533 = false;
        Class14.aClass84_241 = null;
        if (PlayerDefinition.connection != null) {
            PlayerDefinition.connection.method594(-67);
            PlayerDefinition.connection = null;
        }
        Class71_Sub1.method1345(-91, Class86.aCanvas1585);
        Class68_Sub20.method1007(Class86.aCanvas1585, true);
        if (RSString.aClass97_2261 != null)
            RSString.aClass97_2261.method1558(100, Class86.aCanvas1585);
        Class68_Sub26.method1216(2);
        Class1_Sub7.method170(255);
        RSString.aClass97_2261 = null;
        if (Class68_Sub13_Sub36.aClass35_4035 != null)
            Class68_Sub13_Sub36.aClass35_4035.method431(7759444);
        if (Animable.aClass35_66 != null)
            Animable.aClass35_66.method431(7759444);
        Class32.method408(-111);
        ItemDef.method315(103);
        do {
            try {
                if (Class68_Sub20_Sub10.aClass124_4318 != null)
                    Class68_Sub20_Sub10.aClass124_4318.method1759(-9715);
                int i_0_ = 126 % ((i - -5) / 62);
                if (Class26.aClass124Array520 != null)
                    for (int i_1_ = 0; Class26.aClass124Array520.length > i_1_;
                         i_1_++)
                        if (Class26.aClass124Array520[i_1_] != null)
                            Class26.aClass124Array520[i_1_].method1759(-9715);
                if (Class75_Sub2.aClass124_3311 != null)
                    Class75_Sub2.aClass124_3311.method1759(-9715);
                if (Class68_Sub13_Sub4.aClass124_3486 == null)
                    break;
                Class68_Sub13_Sub4.aClass124_3486.method1759(-9715);
            } catch (java.io.IOException ioexception) {
                break;
            }
            break;
        } while (false);
    }

    public static void method34(byte i) {
        anInt2371++;
        int i_2_ = -36 % ((i - -7) / 60);
        if (GameException.anInt2231 == 30)
            Class17.method296(25, (byte) -81);
    }

    public void method35(byte i) {
        anInt2368++;
        if (Class107.anInt1815 == 0) {
            Runtime runtime = Runtime.getRuntime();
            int i_3_ = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
            long l = Class36.method438(i ^ 0x434d);
            if ((Class75_Sub1.aLong3304 ^ 0xffffffffffffffffL) == -1L)
                Class75_Sub1.aLong3304 = l;
            if (i_3_ > 16384 && (l - Class75_Sub1.aLong3304 ^ 0xffffffffffffffffL) > -5001L) {
                if ((-Class1_Sub6_Sub1.aLong3392 + l ^ 0xffffffffffffffffL) < -1001L) {
                    System.gc();
                    Class1_Sub6_Sub1.aLong3392 = l;
                }
                Class68_Sub29.aRSString_3235 = Class72_Sub1.aRSString_3277;
                Class68_Sub13_Sub28.anInt3917 = 5;
            } else {
                Class107.anInt1815 = 10;
                Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub5.aRSString_3517;
                Class68_Sub13_Sub28.anInt3917 = 5;
            }
        } else if ((Class107.anInt1815 ^ 0xffffffff) == -11) {
            Class1_Sub6_Sub2.method157(4, 104, 104, 25);
            for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -5; i_4_++)
                Class109.aClass38Array1843[i_4_] = new GroundData(104, 104);
            Class68_Sub13_Sub28.anInt3917 = 10;
            Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub26_Sub1.aRSString_4603;
            Class107.anInt1815 = 30;
        } else if ((Class107.anInt1815 ^ 0xffffffff) == -31) {
            Class68_Sub28_Sub1.aClass21_Sub1_4519 = Class72.method1355((byte) 116, false, true, 0, true);
            Class58.aClass21_Sub1_1097 = Class72.method1355((byte) 57, false, true, 1, true);
            Class68_Sub6.aClass21_Sub1_2843 = Class72.method1355((byte) 66, true, false, 2, true);
            Class68_Sub13_Sub21.aClass21_Sub1_3804 = Class72.method1355((byte) -73, false, true, 3, true);
            Class78.aClass21_Sub1_1388 = Class72.method1355((byte) 105, false, true, 4, true);
            Class92.aClass21_Sub1_1644 = Class72.method1355((byte) 71, true, true, 5, true);
            Class21renamed.aClass21_Sub1_459 = Class72.method1355((byte) -111, true, true, 6, false);
            Class120.aClass21_Sub1_2095 = Class72.method1355((byte) -117, false, true, 7, true);
            Class52.aClass21_Sub1_1011 = Class72.method1355((byte) 102, false, true, 8, true);
            Class68_Sub13_Sub30.aClass21_Sub1_3953 = Class72.method1355((byte) -93, false, true, 9, true);
            Class84.aClass21_Sub1_1532 = Class72.method1355((byte) 50, false, true, 10, true);
            Class21renamed.aClass21_Sub1_472 = Class72.method1355((byte) -121, false, true, 11, true);
            Class13.aClass21_Sub1_221 = Class72.method1355((byte) 107, false, true, 12, true);
            Class63.aClass21_Sub1_1173 = Class72.method1355((byte) -99, false, true, 13, true);
            Class68_Sub20_Sub4.aClass21_Sub1_4217 = Class72.method1355((byte) -89, false, true, 14, false);
            Class28.aClass21_Sub1_529 = Class72.method1355((byte) -75, false, true, 15, true);
            Class7.aClass21_Sub1_136 = Class72.method1355((byte) 94, false, true, 16, true);
            Class33.aClass21_Sub1_583 = Class72.method1355((byte) -114, false, true, 17, true);
            Class68.aClass21_Sub1_1228 = Class72.method1355((byte) 74, false, true, 18, true);
            Class55.aClass21_Sub1_2038 = Class72.method1355((byte) -95, false, true, 19, true);
            Class57.aClass21_Sub1_1068 = Class72.method1355((byte) 57, false, true, 20, true);
            Class68_Sub13_Sub31.aClass21_Sub1_3971 = Class72.method1355((byte) -81, false, true, 21, true);
            Class14.aClass21_Sub1_229 = Class72.method1355((byte) 88, false, true, 22, true);
            Class68_Sub20_Sub5.aClass21_Sub1_4221 = Class72.method1355((byte) 70, true, true, 23, true);
            Class68_Sub13_Sub5.aClass21_Sub1_3522 = Class72.method1355((byte) -109, false, true, 24, true);
            GroundData.aClass21_Sub1_659 = Class72.method1355((byte) -90, false, true, 25, true);
            PacketStream.aClass21_Sub1_4133 = Class72.method1355((byte) 65, true, true, 26, true);
            Class68_Sub13_Sub28.anInt3917 = 15;
            Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub12.aRSString_3635;
            Class107.anInt1815 = 40;
        } else if ((Class107.anInt1815 ^ 0xffffffff) == -41) {
            int i_5_ = 0;
            i_5_ += (Class68_Sub28_Sub1.aClass21_Sub1_4519.method365(i + -13) * 4 / 100);
            i_5_ += 4 * Class58.aClass21_Sub1_1097.method365(-88) / 100;
            i_5_ += Class68_Sub6.aClass21_Sub1_2843.method365(-76) / 100;
            i_5_ += (2 * Class68_Sub13_Sub21.aClass21_Sub1_3804.method365(65) / 100);
            i_5_ += Class78.aClass21_Sub1_1388.method365(i + -195) * 6 / 100;
            i_5_ += Class92.aClass21_Sub1_1644.method365(-115) * 4 / 100;
            i_5_ += 2 * Class21renamed.aClass21_Sub1_459.method365(-94) / 100;
            i_5_ += 50 * Class120.aClass21_Sub1_2095.method365(i + 45) / 100;
            i_5_ += 2 * Class52.aClass21_Sub1_1011.method365(i + -155) / 100;
            i_5_ += (Class68_Sub13_Sub30.aClass21_Sub1_3953.method365(87) * 2 / 100);
            i_5_ += Class84.aClass21_Sub1_1532.method365(i) * 2 / 100;
            i_5_ += Class21renamed.aClass21_Sub1_472.method365(-74) * 2 / 100;
            i_5_ += Class13.aClass21_Sub1_221.method365(117) * 2 / 100;
            i_5_ += 2 * Class63.aClass21_Sub1_1173.method365(i + -3) / 100;
            i_5_ += (2 * Class68_Sub20_Sub4.aClass21_Sub1_4217.method365(58) / 100);
            i_5_ += 2 * Class28.aClass21_Sub1_529.method365(-89) / 100;
            i_5_ += Class7.aClass21_Sub1_136.method365(112) / 100;
            i_5_ += Class33.aClass21_Sub1_583.method365(-101) / 100;
            i_5_ += Class68.aClass21_Sub1_1228.method365(106) / 100;
            i_5_ += Class55.aClass21_Sub1_2038.method365(52) / 100;
            i_5_ += Class57.aClass21_Sub1_1068.method365(i + -184) / 100;
            i_5_ += Class68_Sub13_Sub31.aClass21_Sub1_3971.method365(84) / 100;
            i_5_ += Class14.aClass21_Sub1_229.method365(48) / 100;
            i_5_ += (Class68_Sub20_Sub5.aClass21_Sub1_4221.method365(i + -175) / 100);
            i_5_ += Class68_Sub13_Sub5.aClass21_Sub1_3522.method365(-96) / 100;
            i_5_ += GroundData.aClass21_Sub1_659.method365(-95) / 100;
            i_5_ += PacketStream.aClass21_Sub1_4133.method365(-79) / 100;
            if ((i_5_ ^ 0xffffffff) != -101) {
                if (i_5_ != 0)
                    Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class68_Sub13_Sub5.aRSString_3520,
                            Class68_Sub13_Sub24.method816(i_5_, 0),
                            Class68_Sub20_Sub7.aRSString_4267})));
                Class68_Sub13_Sub28.anInt3917 = 20;
            } else {
                Class68_Sub29.aRSString_3235 = Class85.aRSString_1564;
                Class68_Sub13_Sub28.anInt3917 = 20;
                Class35.method435((byte) 105, Class52.aClass21_Sub1_1011);
                Class28.method395((byte) -128, Class52.aClass21_Sub1_1011);
                Class68_Sub15.method979(Class52.aClass21_Sub1_1011, 1);
                Class68_Sub7.method667(Class52.aClass21_Sub1_1011, -5545);
                Class107.anInt1815 = 45;
            }
        } else if (Class107.anInt1815 == 45) {
            Class68_Sub13_Sub36.method887(22050, 2, Class74.aBoolean1324,
                    -126);
            Class54.aClass68_Sub28_Sub1_1028 = new Class68_Sub28_Sub1();
            Class54.aClass68_Sub28_Sub1_1028.method1238(9, 128, i ^ 0x5e);
            Class68_Sub13_Sub36.aClass35_4035 = Class55.method1717(Class75_Sub1_Sub1.signlink,
                    (byte) 104, Class86.aCanvas1585, 22050,
                    0);
            Class68_Sub13_Sub36.aClass35_4035.method425(false, Class54.aClass68_Sub28_Sub1_1028);
            Login.method1468(Class54.aClass68_Sub28_Sub1_1028,
                    Class78.aClass21_Sub1_1388, false,
                    Class28.aClass21_Sub1_529,
                    Class68_Sub20_Sub4.aClass21_Sub1_4217);
            Animable.aClass35_66 = Class55.method1717(Class75_Sub1_Sub1.signlink,
                    (byte) 104, Class86.aCanvas1585, 2048,
                    1);
            Class80.aClass68_Sub28_Sub4_1418 = new Class68_Sub28_Sub4();
            Animable.aClass35_66.method425(false,
                    Class80.aClass68_Sub28_Sub4_1418);
            Class68_Sub20.aClass95_3079 = new Class95(22050, Class93.anInt1660);
            Class68_Sub13_Sub15.anInt3681 = Class21renamed.aClass21_Sub1_459.method335(RSString.aRSString_2297,
                    (byte) -84);
            Class68_Sub13_Sub28.anInt3917 = 30;
            Class68_Sub29.aRSString_3235 = Class68_Sub7.aRSString_2861;
            Class107.anInt1815 = 50;
        } else if ((Class107.anInt1815 ^ 0xffffffff) == -51) {
            int i_6_ = Class68_Sub13_Sub7.method731(Class52.aClass21_Sub1_1011, 53,
                    Class63.aClass21_Sub1_1173);
            int i_7_ = Class7.method201(i + -167);
            if ((i_7_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff)) {
                Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2,
                        (new RSString[]{Class75_Sub3.aRSString_3324,
                                Class68_Sub13_Sub24.method816(100 * i_6_ / i_7_, 0),
                                Class68_Sub20_Sub7.aRSString_4267})));
                Class68_Sub13_Sub28.anInt3917 = 35;
            } else {
                Class68_Sub13_Sub28.anInt3917 = 35;
                Class107.anInt1815 = 60;
                Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub29.aRSString_3940;
            }
        } else if (Class107.anInt1815 == 60) {
            int i_8_ = ISAACRandomGen.method1454((byte) -126, Class52.aClass21_Sub1_1011);
            int i_9_ = GroundData.method457(false);
            if ((i_8_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
                Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2,
                        (new RSString[]{Class74.aRSString_1331,
                                Class68_Sub13_Sub24.method816(100 * i_8_ / i_9_, 0),
                                Class68_Sub20_Sub7.aRSString_4267})));
                Class68_Sub13_Sub28.anInt3917 = 40;
            } else {
                Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub36.aRSString_4049;
                Class68_Sub13_Sub28.anInt3917 = 40;
                Class107.anInt1815 = 65;
            }
        } else if ((Class107.anInt1815 ^ 0xffffffff) == -66) {
            Class20.method321(Class52.aClass21_Sub1_1011, (byte) 83,
                    Class63.aClass21_Sub1_1173);
            Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub25.aRSString_3868;
            Class68_Sub13_Sub28.anInt3917 = 45;
            Class17.method296(5, (byte) -89);
            Class107.anInt1815 = 70;
        } else if ((Class107.anInt1815 ^ 0xffffffff) == -71) {
            Class68_Sub6.aClass21_Sub1_2843.method353((byte) -62);
            int i_10_ = 0;
            i_10_ += Class68_Sub6.aClass21_Sub1_2843.method352(0);
            Class7.aClass21_Sub1_136.method353((byte) -62);
            i_10_ += Class7.aClass21_Sub1_136.method352(0);
            Class33.aClass21_Sub1_583.method353((byte) -62);
            i_10_ += Class33.aClass21_Sub1_583.method352(0);
            Class68.aClass21_Sub1_1228.method353((byte) -62);
            i_10_ += Class68.aClass21_Sub1_1228.method352(0);
            Class55.aClass21_Sub1_2038.method353((byte) -62);
            i_10_ += Class55.aClass21_Sub1_2038.method352(0);
            Class57.aClass21_Sub1_1068.method353((byte) -62);
            i_10_ += Class57.aClass21_Sub1_1068.method352(0);
            Class68_Sub13_Sub31.aClass21_Sub1_3971.method353((byte) -62);
            i_10_ += Class68_Sub13_Sub31.aClass21_Sub1_3971.method352(0);
            Class14.aClass21_Sub1_229.method353((byte) -62);
            i_10_ += Class14.aClass21_Sub1_229.method352(0);
            Class68_Sub13_Sub5.aClass21_Sub1_3522.method353((byte) -62);
            i_10_ += Class68_Sub13_Sub5.aClass21_Sub1_3522.method352(0);
            GroundData.aClass21_Sub1_659.method353((byte) -62);
            i_10_ += GroundData.aClass21_Sub1_659.method352(i + -68);
            if (i_10_ < 1000) {
                Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class68_Sub28_Sub1.aRSString_4509,
                        Class68_Sub13_Sub24.method816(i_10_ / 10, 0),
                        Class68_Sub20_Sub7.aRSString_4267})));
                Class68_Sub13_Sub28.anInt3917 = 50;
            } else {
                Class68_Sub16.method987(Class68_Sub6.aClass21_Sub1_2843,
                        -7486);
                Class114.method1693((byte) -88,
                        Class68_Sub6.aClass21_Sub1_2843);
                Class13_Sub3.method260(Class68_Sub6.aClass21_Sub1_2843, 11053);
                Class68_Sub20_Sub10.method1109(-124,
                        Class120.aClass21_Sub1_2095,
                        (Class68_Sub6.aClass21_Sub1_2843));
                Class68_Sub20_Sub16.method1177(12800,
                        Class120.aClass21_Sub1_2095,
                        Class1_Sub7.aBoolean2612,
                        Class7.aClass21_Sub1_136);
                PacketParser.method1665(Class68.aClass21_Sub1_1228, (byte) 82,
                        Class120.aClass21_Sub1_2095);
                Class14.method271(Class1_Sub7.aBoolean2612,
                        Class120.aClass21_Sub1_2095,
                        Class55.aClass21_Sub1_2038, (byte) 112,
                        Class72_Sub1.aClass68_Sub20_Sub1_Sub1_3276);
                Class45.method501(Class68_Sub6.aClass21_Sub1_2843, 1);
                Class68_Sub13_Sub19.method797(Class57.aClass21_Sub1_1068,
                        Class58.aClass21_Sub1_1097,
                        (Class68_Sub28_Sub1.aClass21_Sub1_4519),
                        -118);
                Class105.method1643(Class120.aClass21_Sub1_2095,
                        Class68_Sub13_Sub31.aClass21_Sub1_3971,
                        i + -27687);
                Class22.method374((byte) 58, Class14.aClass21_Sub1_229);
                Class109.method1659((byte) -101,
                        Class68_Sub6.aClass21_Sub1_2843);
                Class124.method1752(Class120.aClass21_Sub1_2095,
                        Class63.aClass21_Sub1_1173,
                        Class68_Sub13_Sub21.aClass21_Sub1_3804,
                        true, Class52.aClass21_Sub1_1011);
                Class68_Sub20_Sub4.method1059(Class68_Sub6.aClass21_Sub1_2843,
                        116);
                Stream.method934(-83, Class33.aClass21_Sub1_583);
                Class68_Sub13_Sub38.method898(GroundData.aClass21_Sub1_659,
                        (Class68_Sub13_Sub5.aClass21_Sub1_3522),
                        new Class51(), (byte) -117);
                Class21renamed.method348(Class68_Sub13_Sub5.aClass21_Sub1_3522,
                        (byte) -72, GroundData.aClass21_Sub1_659);
                Class68_Sub13_Sub28.anInt3917 = 50;
                Class68_Sub29.aRSString_3235 = Login.aRSString_1521;
                Class44.method492(4);
                Class107.anInt1815 = 80;
            }
        } else if (Class107.anInt1815 == 80) {
            int i_11_ = Class68_Sub13_Sub17.method783(0, Class52.aClass21_Sub1_1011);
            int i_12_ = Class68_Sub13_Sub27.method836(0);
            if (i_12_ > i_11_) {
                Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(i ^ 0x46,
                        (new RSString[]{Class32.aRSString_562,
                                Class68_Sub13_Sub24.method816(100 * i_11_ / i_12_,
                                        0),
                                Class68_Sub20_Sub7.aRSString_4267})));
                Class68_Sub13_Sub28.anInt3917 = 60;
            } else {
                GameSocket.method592(12339, Class52.aClass21_Sub1_1011);
                Class107.anInt1815 = 90;
                Class68_Sub13_Sub28.anInt3917 = 60;
                Class68_Sub29.aRSString_3235 = Class97.aRSString_1718;
            }
        } else if ((Class107.anInt1815 ^ 0xffffffff) == -91)
            if (!PacketStream.aClass21_Sub1_4133.method353((byte) -62)) {
                Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(i ^ 0x46,
                        new RSString[]{Class68_Sub24.aRSString_3152,
                                (Class68_Sub13_Sub24.method816(PacketStream.aClass21_Sub1_4133.method352(0),
                                        0)),
                                Class68_Sub20_Sub7.aRSString_4267}));
                Class68_Sub13_Sub28.anInt3917 = 70;
            } else {
                Class90 class90 = new Class90(Class68_Sub13_Sub30.aClass21_Sub1_3953,
                        PacketStream.aClass21_Sub1_4133,
                        Class52.aClass21_Sub1_1011, 20,
                        !Class1_Sub2.aBoolean2432);
                Class62.method611(class90);
                if ((Class45.anInt919 ^ 0xffffffff) == -2)
                    Class62.method614(0.9F);
                if ((Class45.anInt919 ^ 0xffffffff) == -3)
                    Class62.method614(0.8F);
                if ((Class45.anInt919 ^ 0xffffffff) == -4)
                    Class62.method614(0.7F);
                if ((Class45.anInt919 ^ 0xffffffff) == -5)
                    Class62.method614(0.6F);
                Class68_Sub13_Sub28.anInt3917 = 70;
                Class107.anInt1815 = 100;
                Class68_Sub29.aRSString_3235 = Class59.aRSString_1108;
            }
        else if (Class107.anInt1815 == 100) {
            if (Class103.method1634(Class52.aClass21_Sub1_1011, -1))
                Class107.anInt1815 = 110;
        } else {
            if (i != 68)
                method29(-56);
            if ((Class107.anInt1815 ^ 0xffffffff) == -111) {
                Class14.aClass84_241 = new Class84();
                Class75_Sub1_Sub1.signlink.method558((byte) -61, 10, Class14.aClass84_241);
                Class107.anInt1815 = 120;
                Class68_Sub29.aRSString_3235 = Class67.aRSString_1207;
                Class68_Sub13_Sub28.anInt3917 = 75;
            } else if (Class107.anInt1815 == 120)
                if (!Class84.aClass21_Sub1_1532.method362((byte) 124,
                        (Class68_Sub5.aRSString_2835),
                        (Class68_Sub28_Sub2.aRSString_4556))) {
                    Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2, new RSString[]{RSString.aRSString_2317,
                            Class95.aRSString_1691}));
                    Class68_Sub13_Sub28.anInt3917 = 80;
                } else {
                    Class103 class103 = new Class103(Class84.aClass21_Sub1_1532.method351(Class68_Sub5.aRSString_2835,
                            Class68_Sub28_Sub2.aRSString_4556,
                            (byte) 81));
                    Class68_Sub13_Sub26.method829(class103, 127);
                    Class107.anInt1815 = 130;
                    Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub29.aRSString_3939;
                    Class68_Sub13_Sub28.anInt3917 = 80;
                }
            else if (Class107.anInt1815 == 130)
                if (!Class68_Sub13_Sub21.aClass21_Sub1_3804.method353((byte) -62)) {
                    Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class13_Sub1.aRSString_2633,
                            (Class68_Sub13_Sub24.method816(3 * Class68_Sub13_Sub21.aClass21_Sub1_3804.method352(0) / 4,
                                    0)),
                            Class68_Sub20_Sub7.aRSString_4267})));
                    Class68_Sub13_Sub28.anInt3917 = 85;
                } else if (!Class13.aClass21_Sub1_221.method353((byte) -62)) {
                    Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class13_Sub1.aRSString_2633,
                            (Class68_Sub13_Sub24.method816(75 - -(Class13.aClass21_Sub1_221.method352(i + -68) / 10),
                                    0)),
                            Class68_Sub20_Sub7.aRSString_4267})));
                    Class68_Sub13_Sub28.anInt3917 = 85;
                } else if (!Class63.aClass21_Sub1_1173.method353((byte) -62)) {
                    Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(2,
                            (new RSString[]{Class13_Sub1.aRSString_2633,
                                    (Class68_Sub13_Sub24.method816((Class63.aClass21_Sub1_1173.method352(i + -68) / 20) + 85,
                                            i + -68)),
                                    Class68_Sub20_Sub7.aRSString_4267})));
                    Class68_Sub13_Sub28.anInt3917 = 85;
                } else if (!Class68_Sub20_Sub5.aClass21_Sub1_4221.method354(0, ISAACRandomGen.aRSString_1481)) {
                    Class68_Sub29.aRSString_3235 = (Class68_Sub20_Sub13_Sub2.method1166(i + -66,
                            (new RSString[]{Class13_Sub1.aRSString_2633,
                                    (Class68_Sub13_Sub24.method816((Class68_Sub20_Sub5.aClass21_Sub1_4221.method363(126, ISAACRandomGen.aRSString_1481) / 10) + 90,
                                            0)),
                                    Class68_Sub20_Sub7.aRSString_4267})));
                    Class68_Sub13_Sub28.anInt3917 = 85;
                } else {
                    Class85.method1480(-10675,
                            Stream.aSpriteArray3006,
                            Class68_Sub20_Sub5.aClass21_Sub1_4221,
                            Class68_Sub13_Sub19.aClass92_Sub1Array3745,
                            Class104.aClass92_Sub1Array1779,
                            Class112.aClass92_Sub1Array1886,
                            Class68_Sub20_Sub17.aClass92_Sub1Array4431);
                    Class68_Sub13_Sub28.anInt3917 = 100;
                    Class107.anInt1815 = 140;
                    Class68_Sub29.aRSString_3235 = Class68_Sub13_Sub19.aRSString_3740;
                }
            else if ((Class107.anInt1815 ^ 0xffffffff) == -141) {
                Class124.anInt2139 = (Class68_Sub13_Sub21.aClass21_Sub1_3804.method335(Class68_Sub10.aRSString_2901, (byte) -106));
                Class92.aClass21_Sub1_1644.method342(false, (byte) 113, true);
                Class21renamed.aClass21_Sub1_459.method342(true, (byte) 113, true);
                Class52.aClass21_Sub1_1011.method342(true, (byte) 113, true);
                Class63.aClass21_Sub1_1173.method342(true, (byte) 113, true);
                Class84.aClass21_Sub1_1532.method342(true, (byte) 113, true);
                Class68_Sub13_Sub21.aClass21_Sub1_3804.method342(true, (byte) 113, true);
                Class67.aBoolean1210 = true;
                Class1_Sub6_Sub2.method161(64);
            }
        }
    }

    public void init() {
        anInt2367++;
        if (this.validateHost((byte) -106)) {
            Class106.anInt1799 = Integer.parseInt(this.getParameter("worldid"));
            Class13_Sub4.anInt2690 = Integer.parseInt(this.getParameter("modewhat"));
            Class75_Sub3.anInt3328 = Integer.parseInt(this.getParameter("modewhere"));
            String string = this.getParameter("safemode");
            if (string != null && string.equals("1"))
                Class75_Sub2.safeMode = true;
            else
                Class75_Sub2.safeMode = false;
            String string_13_ = this.getParameter("members");
            if (string_13_ == null || !string_13_.equals("1"))
                Class1_Sub7.aBoolean2612 = false;
            else
                Class1_Sub7.aBoolean2612 = true;
            String string_14_ = this.getParameter("lang");
            if (string_14_ != null && string_14_.equals("1")) {
                Class72_Sub1.method1369(-54);
                Class68_Sub13_Sub27.anInt3915 = 1;
            }
            String string_15_ = this.getParameter("game");
            if (string_15_ == null || !string_15_.equals("1"))
                Class68_Sub13_Sub34.anInt4008 = 0;
            else
                Class68_Sub13_Sub34.anInt4008 = 1;
            try {
                Class68_Sub13_Sub10.anInt3597 = Integer.parseInt(this.getParameter("js"));
                Class20.anInt403 = Integer.parseInt(this.getParameter("plug"));
                Class68_Sub13_Sub20.anInt3780 = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception exception) {
                /* empty */
            }
            Class26.aRSString_521 = Class68_Sub24.aRSString_3162.method1610(this, (byte) -31);
            if (Class26.aRSString_521 == null)
                Class26.aRSString_521 = Class68_Sub28_Sub2.aRSString_4556;
            String string_16_ = this.getParameter("advert");
            if (string_16_ != null) {
                byte[] is;
                try {
                    is = string_16_.getBytes("ISO-8859-1");
                } catch (java.io.UnsupportedEncodingException unsupportedencodingexception) {
                    is = string_16_.getBytes();
                }
                RSString class100 = Class68_Sub13_Sub27.method842(is.length, is, 127, 0);
                boolean bool = Class68_Sub13_Sub26_Sub1.method833((byte) -101,
                        class100);
                if (bool)
                    Applet_Sub1.aRSString_31 = class100;
            }
            Class68_Sub9.serverAddress = this.getCodeBase().getHost();
            this.method19(-9, Class13_Sub4.anInt2690 + 32, 503, 765, 508);
        }
    }

    public static Class45 method36(Class45 class45) {
        int i = Class68_Sub8.method674(method41(class45), -528748559);
        if (i == 0)
            return null;
        for (int i_17_ = 0; i_17_ < i; i_17_++) {
            class45 = Class68_Sub20_Sub15.method1170(class45.anInt799, (byte) -80);
            if (class45 == null)
                return null;
        }
        return class45;
    }

    public static void method37(int i, boolean bool) {
        anInt2375++;
        if (bool != true)
            method45(null);
        Class68_Sub13_Sub36.anInt4033 = 50;
        Class68_Sub13_Sub12.anInt3644 = i;
    }

    public void method38(int i) {
        anInt2370++;
        Class68_Sub13_Sub19.method795(this, (byte) 100);
        if (i != 1)
            method38(114);
        for (Class43.anInt739 = 0;
             Class68_Sub25.method1210((byte) 111) && Class43.anInt739 < 128;
             Class43.anInt739++) {
            Class68_Sub20_Sub14.anIntArray4385[Class43.anInt739] = Class59.anInt1104;
            Class50.anIntArray983[Class43.anInt739] = Class1_Sub6.anInt2536;
        }
        Class109.anInt1844++;
        if (Class68_Sub13_Sub10.anInt3595 != -1)
            Class25.method384(-59, Class68_Sub13_Sub10.anInt3595,
                    Class13_Sub3.width, 0, 0, 0, 0,
                    Class68_Sub13_Sub9.height);
        Class68_Sub22.anInt3148++;
        Class30.method404((byte) 113);
        for (; ; ) {
            Class68_Sub29 class68_sub29 = (Class68_Sub29) Class35.aClass16_623.method294(-120);
            if (class68_sub29 == null)
                break;
            Class45 class45 = class68_sub29.aClass45_3239;
            if (class45.anInt867 >= 0) {
                Class45 class45_18_ = Class68_Sub20_Sub15.method1170(class45.anInt799,
                        (byte) -80);
                if (class45_18_ == null || class45_18_.aClass45Array769 == null || class45_18_.aClass45Array769.length <= class45.anInt867 || (class45 != class45_18_.aClass45Array769[class45.anInt867]))
                    continue;
            }
            Class68_Sub13_Sub16.method776(class68_sub29, 16);
        }
        for (; ; ) {
            Class68_Sub29 class68_sub29 = (Class68_Sub29) Class13_Sub1.aClass16_2627.method294(54);
            if (class68_sub29 == null)
                break;
            Class45 class45 = class68_sub29.aClass45_3239;
            if ((class45.anInt867 ^ 0xffffffff) <= -1) {
                Class45 class45_19_ = Class68_Sub20_Sub15.method1170(class45.anInt799,
                        (byte) -80);
                if (class45_19_ == null || class45_19_.aClass45Array769 == null || ((class45.anInt867 ^ 0xffffffff) <= (class45_19_.aClass45Array769.length ^ 0xffffffff)) || (class45_19_.aClass45Array769[class45.anInt867] != class45))
                    continue;
            }
            Class68_Sub13_Sub16.method776(class68_sub29, i + 15);
        }
        for (; ; ) {
            Class68_Sub29 class68_sub29 = (Class68_Sub29) Class115.aClass16_1955.method294(103);
            if (class68_sub29 == null)
                break;
            Class45 class45 = class68_sub29.aClass45_3239;
            if (class45.anInt867 >= 0) {
                Class45 class45_20_ = Class68_Sub20_Sub15.method1170(class45.anInt799,
                        (byte) -80);
                if (class45_20_ == null || class45_20_.aClass45Array769 == null || class45.anInt867 >= class45_20_.aClass45Array769.length || (class45 != class45_20_.aClass45Array769[class45.anInt867]))
                    continue;
            }
            Class68_Sub13_Sub16.method776(class68_sub29, i ^ 0x11);
        }
        if (Class35.aClass45_606 != null)
            Class127.method1777((byte) -118);
    }

    public void method39(byte i) {
        if (i == -122) {
            anInt2366++;
            boolean bool = Class44.method488(-127);
            if (!bool)
                doUpdateServer(0);
        }
    }

    public static void method40(boolean bool) {
        if (bool == true) {
            aClass21_2380 = null;
            aClass68_Sub12_2379 = null;
        }
    }

    public void method33(int i) {
        anInt2381++;
        if (i == 2 && GameException.anInt2231 != 1000) {
            Class68_Sub3.anInt2812++;
            if ((Class68_Sub3.anInt2812 % 1000 ^ 0xffffffff) == -2) {
                GregorianCalendar gregoriancalendar = new GregorianCalendar();
                Class68_Sub13_Sub4.anInt3509 = (gregoriancalendar.get(11) * 600 - (-(gregoriancalendar.get(12) * 10) - gregoriancalendar.get(13) / 6));
                Class68_Sub13_Sub26.aRandom3873.setSeed((long) Class68_Sub13_Sub4.anInt3509);
            }
            method39((byte) -122);
            Class68_Sub28_Sub2.method1271((byte) -38);
            Class68_Sub13_Sub9.method737(true);
            Class49.method524(16322);
            Class68_Sub24.method1206(i ^ 0x7c);
            Class67.method640(-1);
            if (RSString.aClass97_2261 != null) {
                int i_21_ = RSString.aClass97_2261.method1557(false);
                Class68_Sub13_Sub30.anInt3948 = i_21_;
            }
            if ((GameException.anInt2231 ^ 0xffffffff) != -1) {
                if (GameException.anInt2231 == 5) {
                    method35((byte) 68);
                    Class20.method327((byte) 50);
                } else if (((GameException.anInt2231 ^ 0xffffffff) == -26) || ((GameException.anInt2231 ^ 0xffffffff) == -29))
                    GameSocket.method598(94);
            } else {
                method35((byte) 68);
                Class20.method327((byte) 104);
            }
            if ((GameException.anInt2231 ^ 0xffffffff) != -11)
                if (GameException.anInt2231 != 30) {
                    if (GameException.anInt2231 == 40) {
                        Login.login(false);
                        if ((Class68_Sub20_Sub7.anInt4257 ^ 0xffffffff) != 2)
                            if ((Class68_Sub20_Sub7.anInt4257 ^ 0xffffffff) != -16) {
                                if (Class68_Sub20_Sub7.anInt4257 != 2)
                                    Class1_Sub6_Sub2.method161(i + 62);
                            } else
                                Class68_Sub13_Sub34.method874(2);
                    }
                } else
                    Class90.method1511(true);
            else {
                method38(1);
                Class49.method525((byte) 42);
                Login.login(false);
            }
        }
    }

    public static int method41(Class45 class45) {
        Class68_Sub10 class68_sub10 = ((Class68_Sub10) Class106.aClass113_1803.method1678((((long) class45.anInt792 << 32) + (long) class45.anInt867),
                109));
        if (class68_sub10 != null)
            return class68_sub10.anInt2902;
        return class45.anInt763;
    }

    private void doUpdateServernew(int i) {
        anInt2385++;
        if (i == 0) {
            if (Class75_Sub1_Sub1.anInt4585 >= 4) {
                this.error_fatal(i + 690, "js5crc");
                GameException.anInt2233 = 1000;
            } else {
                if (Class68_Sub10.anInt2911 >= 4) {
                    if (GameException.anInt2233 == 0 || GameException.anInt2233 == 5) {
                        this.error_fatal(690, "js5io");
                        GameException.anInt2233 = 1000;
                        return;
                    }
                    Class13_Sub2.anInt2654 = 3000;
                    Class68_Sub10.anInt2911 = 3;
                }
                if (Class13_Sub2.anInt2654-- <= 0) {
                    do {
                        try {
                            if (Class84.anInt1542 == 0) {
                                //System.out.println(Class103.port);
                                Class103.port = client.ondemandPort;
                                Class68_Sub9.serverAddress = "localhost";
                                Class68_Sub13_Sub9.unknownSocket = (Class75_Sub1_Sub1.signlink.newJagSocket(Class68_Sub9.serverAddress, (byte) 115, Class103.port));
                                Class84.anInt1542++;
                            }
                            if (Class84.anInt1542 == 1) {
                                if (Class68_Sub13_Sub9.unknownSocket.anInt555 == 2) {
                                    resetUpdateServer(-5, -1);
                                    break;
                                }
                                if (Class68_Sub13_Sub9.unknownSocket.anInt555 == 1)
                                    Class84.anInt1542++;
                            }
                            if (Class84.anInt1542 == 2) {
                                Class109.updateServer = new GameSocket((Socket) (Class68_Sub13_Sub9.unknownSocket.playerDefSocket), (Class75_Sub1_Sub1.signlink));
                                Stream class68_sub14 = new Stream(5);
                                class68_sub14.writeByte(15);
                                class68_sub14.writeDWord(508);
                                Class109.updateServer.queueBytes(5, (((Stream) class68_sub14).buffer));
                                Class84.anInt1542++;
                                Class1_Sub6.aLong2585 = Class36.method438(17161);
                            }
                            if (Class84.anInt1542 == 3) {
                                if (GameException.anInt2233 != 0 && GameException.anInt2233 != 5 && Class109.updateServer.available() <= 0) {
                                    if ((Class36.method438(i + 17161) - Class1_Sub6.aLong2585) > 30000L) {
                                        resetUpdateServer(i - 5, -2);
                                        break;
                                    }
                                } else {
                                    int i_22_ = Class109.updateServer.read();
                                    if (i_22_ != 0) {
                                        resetUpdateServer(-5, i_22_);
                                        break;
                                    }
                                    Class84.anInt1542++;
                                }
                            }
                            if (Class84.anInt1542 != 4)
                                break;
                            boolean bool = (GameException.anInt2233 == 5 || GameException.anInt2233 == 10 || GameException.anInt2233 == 28);
                            Class113.doUpdateServer(Class109.updateServer, false, !bool);
                            Class127.anInt2209 = 0;
                            Class68_Sub13_Sub9.unknownSocket = null;
                            Class84.anInt1542 = 0;
                            Class109.updateServer = null;
                        } catch (java.io.IOException ioexception) {
                            resetUpdateServer(-5, -3);
                        }
                        break;
                    } while (false);
                }
            }
        }
    }

    public void doUpdateServer(int i) {
        anInt2383++;
        if (i == 0)
            if (Class75_Sub1_Sub1.anInt4585 >= 4) {
                this.error_fatal(i + 690, "js5crc");
                GameException.anInt2231 = 1000;
            } else {
                if ((Class68_Sub10.anInt2909 ^ 0xffffffff) <= -5) {
                    if (GameException.anInt2231 == 0 || GameException.anInt2231 == 5) {
                        this.error_fatal(690, "js5io");
                        GameException.anInt2231 = 1000;
                        return;
                    }
                    Class13_Sub2.anInt2652 = 3000;
                    Class68_Sub10.anInt2909 = 3;
                }
                if ((Class13_Sub2.anInt2652-- ^ 0xffffffff) >= -1)
                    do {
                        try {
                            if ((Class84.anInt1540 ^ 0xffffffff) == -1) {
                                // xxx believe this to be update server
                                Class103.port = client.ondemandPort;
                                Class68_Sub9.serverAddress = "localhost";
                                Class68_Sub13_Sub9.unknownSocket = (Class75_Sub1_Sub1.signlink.newJagSocket(Class68_Sub9.serverAddress, (byte) 115, Class103.port));
                                //System.out.println("update server? port:"+Class103.port);
                                //Class68_Sub13_Sub9.unknownSocket = (Class75_Sub1_Sub1.signlink.newJagSocket("localhost", (byte) 115, client.jaggrabPort));
                                Class84.anInt1540++;
                            }
                            if (Class84.anInt1540 == 1) {
                                if (Class68_Sub13_Sub9.unknownSocket.anInt555 == 2) {
                                    //                   System.out.println("WARNING: this should not execute");
                                    resetUpdateServer(-5, -1);
                                    break;
                                }
                                if ((Class68_Sub13_Sub9.unknownSocket.anInt555 ^ 0xffffffff) == -2)
                                    Class84.anInt1540++;
                            }
                            if ((Class84.anInt1540 ^ 0xffffffff) == -3) {
                                // xxx this is update server
                                //Class109.updateServer = new GameSocket(new Socket("localhost", client.ondemandPort), (Class75_Sub1_Sub1.signlink));
                                Class109.updateServer = new GameSocket((Socket) (Class68_Sub13_Sub9.unknownSocket.playerDefSocket), (Class75_Sub1_Sub1.signlink));
                                Stream class68_sub14 = new Stream(5);
                                class68_sub14.writeByte(15);
                                class68_sub14.writeDWord(508);
                                Class109.updateServer.queueBytes(5, class68_sub14.buffer);
                                Class84.anInt1540++;
                                Class1_Sub6.aLong2585 = Class36.method438(17161);
                            }
                            if (Class84.anInt1540 == 3)
                                if ((GameException.anInt2231 ^ 0xffffffff) != -1 && GameException.anInt2231 != 5 && (Class109.updateServer.available() ^ 0xffffffff) >= -1) {
                                    if (((Class36.method438(i + 17161) + -Class1_Sub6.aLong2585) ^ 0xffffffffffffffffL) < -30001L) {
                                        //                 System.out.println("WARNING: this should not execute");
                                        resetUpdateServer(i + -5, -2);
                                        break;
                                    }
                                } else {
                                    int i_22_ = Class109.updateServer.read();
                                    if ((i_22_ ^ 0xffffffff) != -1) {
                                        //                       System.out.println("WARNING: this should not execute");
                                        resetUpdateServer(-5, i_22_);
                                        break;
                                    }
                                    Class84.anInt1540++;
                                }
                            // the following is needed to connect:
                            if (Class84.anInt1540 != 4)
                                break;
                            boolean bool = (GameException.anInt2231 == 5 || (GameException.anInt2231 ^ 0xffffffff) == -11 || (GameException.anInt2231 ^ 0xffffffff) == -29);
                            Class113.doUpdateServer(Class109.updateServer, false, !bool);
                            Class127.anInt2209 = 0;
                            Class68_Sub13_Sub9.unknownSocket = null;
                            Class84.anInt1540 = 0;
                            Class109.updateServer = null;
                        } catch (java.io.IOException ioexception) {
                            //           System.out.println("WARNING: this should not execute");
                            //           ioexception.printStackTrace();
                            resetUpdateServer(-5, -3);
                            break;
                        }
                        break;
                    } while (false);
            }
    }

    public static void method43(Class45[] class45s, int i, int i_23_,
                                int i_24_, int i_25_, int i_26_, int i_27_,
                                int i_28_) {
        for (int i_29_ = 0; i_29_ < class45s.length; i_29_++) {
            Class45 class45 = class45s[i_29_];
            if (class45 != null && class45.anInt799 == i && (!class45.aBoolean863 || class45.anInt896 == 0 || class45.aBoolean851 || method41(class45) != 0 || class45 == Class68_Sub13_Sub26_Sub1.aClass45_4607 || class45.anInt808 == 1338) && (!class45.aBoolean863 || !method45(class45))) {
                int i_30_ = class45.anInt815 + i_27_;
                int i_31_ = class45.anInt903 + i_28_;
                int i_32_;
                int i_33_;
                int i_34_;
                int i_35_;
                if (class45.anInt896 == 2) {
                    i_32_ = i_23_;
                    i_33_ = i_24_;
                    i_34_ = i_25_;
                    i_35_ = i_26_;
                } else {
                    int i_36_ = i_30_ + class45.anInt892;
                    int i_37_ = i_31_ + class45.anInt873;
                    if (class45.anInt896 == 9) {
                        i_36_++;
                        i_37_++;
                    }
                    i_32_ = i_30_ > i_23_ ? i_30_ : i_23_;
                    i_33_ = i_31_ > i_24_ ? i_31_ : i_24_;
                    i_34_ = i_36_ < i_25_ ? i_36_ : i_25_;
                    i_35_ = i_37_ < i_26_ ? i_37_ : i_26_;
                }
                if (class45 == Class35.aClass45_606) {
                    Class124.aBoolean2159 = true;
                    Class68_Sub28_Sub2.anInt4545 = i_30_;
                    Class22.anInt481 = i_31_;
                }
                if (!class45.aBoolean863 || i_32_ < i_34_ && i_33_ < i_35_) {
                    if (class45.anInt896 == 0) {
                        if (!class45.aBoolean863 && method45(class45) && Class108.aClass45_1825 != class45)
                            continue;
                        if (class45.aBoolean916 && Class96.anInt1695 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1695 < i_34_ && Class13.anInt223 < i_35_) {
                            for (Class68_Sub29 class68_sub29 = ((Class68_Sub29) Class115.aClass16_1955.method293((byte) 76));
                                 class68_sub29 != null;
                                 class68_sub29 = ((Class68_Sub29) Class115.aClass16_1955.method290((byte) -110)))
                                if (class68_sub29.aBoolean3242)
                                    class68_sub29.method647(-17554);
                            if (Class68_Sub26.anInt3200 == 0) {
                                Class35.aClass45_606 = null;
                                Class68_Sub13_Sub26_Sub1.aClass45_4607 = null;
                            }
                            Class68_Sub10.aBoolean2903 = false;
                        }
                    }
                    if (class45.aBoolean863) {
                        boolean bool;
                        if (Class96.anInt1695 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1695 < i_34_ && Class13.anInt223 < i_35_)
                            bool = true;
                        else
                            bool = false;
                        boolean bool_38_ = false;
                        if (Class68_Sub20_Sub12.anInt4352 == 1 && bool)
                            bool_38_ = true;
                        boolean bool_39_ = false;
                        if (Class29.anInt537 == 1 && Class68_Sub13_Sub37.anInt4077 >= i_32_ && Class125.anInt2173 >= i_33_ && Class68_Sub13_Sub37.anInt4077 < i_34_ && Class125.anInt2173 < i_35_)
                            bool_39_ = true;
                        if (Class43.anInt739 > 0 && class45.aByteArray907 != null)
                            for (int i_40_ = 0;
                                 i_40_ < class45.aByteArray907.length;
                                 i_40_++)
                                for (int i_41_ = 0; i_41_ < Class43.anInt739;
                                     i_41_++) {
                                    int i_42_ = class45.aByteArray907[i_40_] & 0xff;
                                    if (i_42_ == (Class68_Sub20_Sub14.anIntArray4385[i_41_]))
                                        Class17.method298(class45.anInt792,
                                                (byte) 111,
                                                i_40_ + 1,
                                                (Class68_Sub28_Sub2.aRSString_4556),
                                                -1);
                                }
                        if (bool_39_)
                            Class91.method1523((Class68_Sub13_Sub37.anInt4077 - i_30_),
                                    Class125.anInt2173 - i_31_,
                                    -4798, class45);
                        if (Class35.aClass45_606 != null && Class35.aClass45_606 != class45 && bool && Class68_Sub13_Sub19.method794(32157, method41(class45)))
                            Animable.aClass45_61 = class45;
                        if (class45 == Class68_Sub13_Sub26_Sub1.aClass45_4607) {
                            Class68_Sub18.aBoolean3058 = true;
                            Class68_Sub13_Sub37.anInt4073 = i_30_;
                            Class113.anInt1903 = i_31_;
                        }
                        if (class45.aBoolean851 || class45.anInt808 != 0) {
                            if (bool && Class68_Sub13_Sub30.anInt3948 != 0 && class45.anObjectArray848 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aBoolean3242 = true;
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anInt3232 = Class68_Sub13_Sub30.anInt3948;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray848;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (Class35.aClass45_606 != null || Class54.aClass45_1033 != null || Class120.aBoolean2099 || (class45.anInt808 != 1400 && Class68_Sub10.aBoolean2903)) {
                                bool_39_ = false;
                                bool_38_ = false;
                                bool = false;
                            }
                            if (class45.anInt808 != 0) {
                                if (class45.anInt808 == 1337) {
                                    Class68_Sub20_Sub17.aClass45_4441 = class45;
                                    Class113.method1682(class45, -120);
                                    continue;
                                }
                                if (class45.anInt808 == 1338) {
                                    if (bool_39_)
                                        Class68_Sub20_Sub11.method1149(99, class45,
                                                Class125.anInt2173 - i_31_,
                                                (Class68_Sub13_Sub37.anInt4077 - i_30_));
                                    continue;
                                }
                                if (class45.anInt808 == 1400) {
                                    Class68.aClass45_1231 = class45;
                                    if (bool_39_)
                                        if (Class128.aBooleanArray2228[82] && (Class68_Sub13_Sub13.anInt3663 > 0)) {
                                            int i_43_ = (int) ((double) ((Class68_Sub13_Sub37.anInt4077) - i_30_ - ((class45.anInt892) / 2)) * 2.0 / (double) (Class68_Sub9.aFloat2892));
                                            int i_44_ = (int) ((double) ((Class125.anInt2173) - i_31_ - ((class45.anInt873) / 2)) * 2.0 / (double) (Class68_Sub9.aFloat2892));
                                            int i_45_ = ((Class68_Sub13_Sub24.anInt3844) + i_43_);
                                            int i_46_ = Class85.anInt1551 + i_44_;
                                            int i_47_ = i_45_ + Class70.anInt1273;
                                            int i_48_ = (Class103.anInt1768 - 1 - i_46_ + Class68_Sub1.anInt2760);
                                            Class51.method539(i_47_, 0, i_48_,
                                                    24867);
                                            Class20.method320(636);
                                        } else {
                                            Class68_Sub10.aBoolean2903 = true;
                                            Class68_Sub13_Sub25.anInt3853 = Class96.anInt1695;
                                            Class58.anInt1087 = Class13.anInt223;
                                            Applet_Sub1.anInt2 = (Class68_Sub13_Sub24.anInt3844);
                                            Class80.anInt1445 = Class85.anInt1551;
                                        }
                                    else if (bool_38_ && Class68_Sub10.aBoolean2903) {
                                        Class68_Sub8.method675((Applet_Sub1.anInt2 + (int) ((double) ((Class68_Sub13_Sub25.anInt3853) - (Class96.anInt1695)) * 2.0 / (double) (Class68_Sub13_Sub27.aFloat3913))),
                                                -1);
                                        Class68_Sub13_Sub12.method754((Class80.anInt1445 + (int) ((double) ((Class58.anInt1087) - (Class13.anInt223)) * 2.0 / (double) (Class68_Sub13_Sub27.aFloat3913))),
                                                112);
                                    } else
                                        Class68_Sub10.aBoolean2903 = false;
                                    continue;
                                }
                                if (class45.anInt808 == 1401) {
                                    if (bool_38_)
                                        Class68_Sub17.method991(class45.anInt873, false,
                                                Class13.anInt223 - i_31_,
                                                class45.anInt892,
                                                Class96.anInt1695 - i_30_);
                                    continue;
                                }
                                if (class45.anInt808 == 1402) {
                                    Class113.method1682(class45, -121);
                                    continue;
                                }
                                if (class45.anInt808 == 1404) {
                                    Class113.method1682(class45, -119);
                                    continue;
                                }
                            }
                            if (!class45.aBoolean850 && bool_39_) {
                                class45.aBoolean850 = true;
                                if (class45.anObjectArray788 != null) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aBoolean3242 = true;
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anInt3240 = (Class68_Sub13_Sub37.anInt4077 - i_30_);
                                    class68_sub29.anInt3232 = Class125.anInt2173 - i_31_;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray788;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                }
                            }
                            if (class45.aBoolean850 && bool_38_ && class45.anObjectArray911 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aBoolean3242 = true;
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anInt3240 = Class96.anInt1695 - i_30_;
                                class68_sub29.anInt3232 = Class13.anInt223 - i_31_;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray911;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (class45.aBoolean850 && !bool_38_) {
                                class45.aBoolean850 = false;
                                if (class45.anObjectArray790 != null) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aBoolean3242 = true;
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anInt3240 = Class96.anInt1695 - i_30_;
                                    class68_sub29.anInt3232 = Class13.anInt223 - i_31_;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray790;
                                    Class13_Sub1.aClass16_2627.method286(class68_sub29, true);
                                }
                            }
                            if (bool_38_ && class45.anObjectArray821 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aBoolean3242 = true;
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anInt3240 = Class96.anInt1695 - i_30_;
                                class68_sub29.anInt3232 = Class13.anInt223 - i_31_;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray821;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (!class45.aBoolean905 && bool) {
                                class45.aBoolean905 = true;
                                if (class45.anObjectArray784 != null) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aBoolean3242 = true;
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anInt3240 = Class96.anInt1695 - i_30_;
                                    class68_sub29.anInt3232 = Class13.anInt223 - i_31_;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray784;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                }
                            }
                            if (class45.aBoolean905 && bool && class45.anObjectArray838 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aBoolean3242 = true;
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anInt3240 = Class96.anInt1695 - i_30_;
                                class68_sub29.anInt3232 = Class13.anInt223 - i_31_;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray838;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (class45.aBoolean905 && !bool) {
                                class45.aBoolean905 = false;
                                if (class45.anObjectArray772 != null) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aBoolean3242 = true;
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anInt3240 = Class96.anInt1695 - i_30_;
                                    class68_sub29.anInt3232 = Class13.anInt223 - i_31_;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray772;
                                    Class13_Sub1.aClass16_2627.method286(class68_sub29, true);
                                }
                            }
                            if (class45.anObjectArray878 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray878;
                                Class35.aClass16_623.method286(class68_sub29,
                                        true);
                            }
                            if (class45.anObjectArray875 != null && Class13_Sub1.anInt2639 > class45.anInt879) {
                                if (class45.anIntArray900 == null || (Class13_Sub1.anInt2639 - class45.anInt879) > 32) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray875;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                } else
                                    while_1_:
                                            for (int i_49_ = class45.anInt879;
                                                 i_49_ < Class13_Sub1.anInt2639;
                                                 i_49_++) {
                                                int i_50_ = (Class125.anIntArray2169[i_49_ & 0x1f]);
                                                for (int i_51_ = 0;
                                                     (i_51_ < class45.anIntArray900.length);
                                                     i_51_++)
                                                    if (class45.anIntArray900[i_51_] == i_50_) {
                                                        Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                                        class68_sub29.aClass45_3239 = class45;
                                                        class68_sub29.anObjectArray3237 = class45.anObjectArray875;
                                                        Class115.aClass16_1955.method286(class68_sub29, true);
                                                        break while_1_;
                                                    }
                                            }
                                class45.anInt879 = Class13_Sub1.anInt2639;
                            }
                            if (class45.anObjectArray835 != null && (Class68_Sub10.anInt2908 > class45.anInt877)) {
                                if (class45.anIntArray780 == null || (Class68_Sub10.anInt2908 - class45.anInt877) > 32) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray835;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                } else
                                    while_2_:
                                            for (int i_52_ = class45.anInt877;
                                                 i_52_ < Class68_Sub10.anInt2908;
                                                 i_52_++) {
                                                int i_53_ = (Class68_Sub13_Sub31.anIntArray3970[i_52_ & 0x1f]);
                                                for (int i_54_ = 0;
                                                     (i_54_ < class45.anIntArray780.length);
                                                     i_54_++)
                                                    if (class45.anIntArray780[i_54_] == i_53_) {
                                                        Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                                        class68_sub29.aClass45_3239 = class45;
                                                        class68_sub29.anObjectArray3237 = class45.anObjectArray835;
                                                        Class115.aClass16_1955.method286(class68_sub29, true);
                                                        break while_2_;
                                                    }
                                            }
                                class45.anInt877 = Class68_Sub10.anInt2908;
                            }
                            if (class45.anObjectArray786 != null && Class68_Sub4.anInt2815 > class45.anInt855) {
                                if (class45.anIntArray787 == null || (Class68_Sub4.anInt2815 - class45.anInt855) > 32) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray786;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                } else
                                    while_3_:
                                            for (int i_55_ = class45.anInt855;
                                                 i_55_ < Class68_Sub4.anInt2815;
                                                 i_55_++) {
                                                int i_56_ = (Class68_Sub13_Sub34.anIntArray4012[i_55_ & 0x1f]);
                                                for (int i_57_ = 0;
                                                     (i_57_ < class45.anIntArray787.length);
                                                     i_57_++)
                                                    if (class45.anIntArray787[i_57_] == i_56_) {
                                                        Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                                        class68_sub29.aClass45_3239 = class45;
                                                        class68_sub29.anObjectArray3237 = class45.anObjectArray786;
                                                        Class115.aClass16_1955.method286(class68_sub29, true);
                                                        break while_3_;
                                                    }
                                            }
                                class45.anInt855 = Class68_Sub4.anInt2815;
                            }
                            if (class45.anObjectArray837 != null && (Class68_Sub29.anInt3243 > class45.anInt889)) {
                                if (class45.anIntArray887 == null || (Class68_Sub29.anInt3243 - class45.anInt889) > 32) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray837;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                } else
                                    while_4_:
                                            for (int i_58_ = class45.anInt889;
                                                 i_58_ < Class68_Sub29.anInt3243;
                                                 i_58_++) {
                                                int i_59_ = (Class68_Sub13_Sub39.anIntArray4102[i_58_ & 0x1f]);
                                                for (int i_60_ = 0;
                                                     (i_60_ < class45.anIntArray887.length);
                                                     i_60_++)
                                                    if (class45.anIntArray887[i_60_] == i_59_) {
                                                        Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                                        class68_sub29.aClass45_3239 = class45;
                                                        class68_sub29.anObjectArray3237 = class45.anObjectArray837;
                                                        Class115.aClass16_1955.method286(class68_sub29, true);
                                                        break while_4_;
                                                    }
                                            }
                                class45.anInt889 = Class68_Sub29.anInt3243;
                            }
                            if (class45.anObjectArray861 != null && Class30.anInt544 > class45.anInt839) {
                                if (class45.anIntArray891 == null || (Class30.anInt544 - class45.anInt839 > 32)) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray861;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                } else
                                    while_5_:
                                            for (int i_61_ = class45.anInt839;
                                                 i_61_ < Class30.anInt544; i_61_++) {
                                                int i_62_ = (Class68_Sub13_Sub36.anIntArray4044[i_61_ & 0x1f]);
                                                for (int i_63_ = 0;
                                                     (i_63_ < class45.anIntArray891.length);
                                                     i_63_++)
                                                    if (class45.anIntArray891[i_63_] == i_62_) {
                                                        Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                                        class68_sub29.aClass45_3239 = class45;
                                                        class68_sub29.anObjectArray3237 = class45.anObjectArray861;
                                                        Class115.aClass16_1955.method286(class68_sub29, true);
                                                        break while_5_;
                                                    }
                                            }
                                class45.anInt839 = Class30.anInt544;
                            }
                            if (Class68_Sub20_Sub3.anInt4196 > class45.anInt836 && class45.anObjectArray812 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray812;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (Class123.anInt2130 > class45.anInt836 && class45.anObjectArray843 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray843;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (Class68_Sub28_Sub2.anInt4547 > class45.anInt836 && class45.anObjectArray871 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray871;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (Class4.anInt93 > class45.anInt836 && class45.anObjectArray872 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray872;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            if (Class68_Sub20_Sub5.anInt4220 > class45.anInt836 && class45.anObjectArray874 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray874;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                            class45.anInt836 = Class68_Sub22.anInt3148;
                            if (class45.anObjectArray868 != null)
                                for (int i_64_ = 0; i_64_ < Class43.anInt739;
                                     i_64_++) {
                                    Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                    class68_sub29.aClass45_3239 = class45;
                                    class68_sub29.anInt3230 = (Class68_Sub20_Sub14.anIntArray4385[i_64_]);
                                    class68_sub29.anInt3241 = Class50.anIntArray983[i_64_];
                                    class68_sub29.anObjectArray3237 = class45.anObjectArray868;
                                    Class115.aClass16_1955.method286(class68_sub29, true);
                                }
                            if (RSString.aBoolean2279 && class45.anObjectArray801 != null) {
                                Class68_Sub29 class68_sub29 = new Class68_Sub29();
                                class68_sub29.aClass45_3239 = class45;
                                class68_sub29.anObjectArray3237 = class45.anObjectArray801;
                                Class115.aClass16_1955.method286(class68_sub29,
                                        true);
                            }
                        }
                    }
                    if (!class45.aBoolean863 && Class35.aClass45_606 == null && Class54.aClass45_1033 == null && !Class120.aBoolean2099) {
                        if ((class45.anInt844 >= 0 || class45.anInt828 != 0) && Class96.anInt1695 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1695 < i_34_ && Class13.anInt223 < i_35_)
                            if (class45.anInt844 >= 0)
                                Class108.aClass45_1825 = class45s[class45.anInt844];
                            else
                                Class108.aClass45_1825 = class45;
                        if (class45.anInt896 == 8 && Class96.anInt1695 >= i_32_ && Class13.anInt223 >= i_33_ && Class96.anInt1695 < i_34_ && Class13.anInt223 < i_35_)
                            Class121.aClass45_2108 = class45;
                        if (class45.anInt794 > class45.anInt873)
                            Class68_Sub20_Sub11.method1147(i_31_, class45,
                                    class45.anInt873,
                                    class45.anInt794,
                                    25504,
                                    i_30_ + (class45.anInt892),
                                    Class13.anInt223,
                                    Class96.anInt1695);
                    }
                    if (class45.anInt896 == 0) {
                        method43(class45s, class45.anInt792, i_32_, i_33_,
                                i_34_, i_35_, i_30_ - class45.anInt847,
                                i_31_ - class45.anInt818);
                        if (class45.aClass45Array769 != null)
                            method43(class45.aClass45Array769,
                                    class45.anInt792, i_32_, i_33_, i_34_,
                                    i_35_, i_30_ - class45.anInt847,
                                    i_31_ - class45.anInt818);
                        Class68_Sub3 class68_sub3 = ((Class68_Sub3) Login.aClass113_1512.method1678((long) class45.anInt792, 84));
                        if (class68_sub3 != null)
                            Class25.method384(-114, class68_sub3.anInt2803,
                                    i_34_, i_33_, i_31_, i_30_,
                                    i_32_, i_35_);
                    }
                }
            }
        }
    }

    public void method23(int i) {
        method40(true);
        RSString.method1579((byte) -112);
        Class71.method1342(true);
        anInt2377++;
        Class68_Sub20_Sub16.method1175(25465);
        Class91.method1522((byte) -84);
        Applet_Sub1.method22((byte) -26);
        Class50.method527(-116);
        Class72.method1351((byte) 116);
        Class84.method1477((byte) -127);
        Class23.method378(8);
        Stream.method962(false);
        GameSocket.method599((byte) -12);
        Class21_Sub1.method370(-677379135);
        Class124.method1756(true);
        Unknown.method1501((byte) 102);
        Class98.method1565((byte) 127);
        PacketStream.method974(false);
        Class16.method281(0);
        GroundData.method456((byte) -105);
        Class45.method500(104);
        Class1_Sub6_Sub2.method162((byte) 63);
        Class113.method1687(0);
        Class97.method1559(1);
        Class68_Sub19.method998(true);
        Class49.method521(true);
        Class68_Sub20_Sub10.method1116((byte) -126);
        Class68_Sub28_Sub1.method1257((byte) 105);
        Class35.method427((byte) -90);
        Class95.method1545(-26412);
        PlayerDefinition.method1770(63);
        Class55.method1718(31891);
        Class1_Sub6.method145(2);
        Class68_Sub1.method649(0);
        Class68_Sub2.method650((byte) 68);
        Class80.method1446(1);
        Class68_Sub3.method653(true);
        Class68.method643(-120);
        Class128.method1785(-74);
        ISAACRandomGen.method1459((byte) 117);
        Class37.method440(-121);
        Class108.method1656(29889);
        Class94.method1544((byte) -52);
        GameException.method1794(64);
        Class63.method621((byte) 126);
        Class11.method230((byte) 102);
        Class12.method237(-5);
        Class116.method1713(0);
        Class25.method385(0);
        Class56.method569(true);
        Class21renamed.method356(71);
        Class1_Sub4.method116();
        Class44.method494(8412);
        ItemDef.method313(-1);
        Class1_Sub3_Sub1.method96();
        Class123.method1750(24205);
        Class86.method1483(-20033);
        Class36.method439((byte) 127);
        Class66.method636(0);
        Class87.method1488((byte) -126);
        Class78.method1411(5756);
        Class14.method269(false);
        Class125.method1764(110);
        Class29.method402(112);
        Class92.method1530(-1);
        Class68_Sub20_Sub1.method1033();
        Class28.method400(-1);
        Class69.method1330(24);
        Class8.method206((byte) -9);
        Animable.method61(123);
        Class64.method623(-1154);
        Class76.method1408(162);
        Class47.method512((byte) -123);
        Class57.method574(156);
        Class7.method200((byte) 29);
        Class77.method1409();
        Class68_Sub20.method1003((byte) -82);
        Login.method1467((byte) 69);
        Class90.method1519(6287);
        Class62.method602();
        Class79.method1420();
        Class68_Sub20_Sub6.method1069(-116);
        Class68_Sub20_Sub17.method1179(499);
        Class119.method1734(-99);
        Class30.method403(0);
        Class52.method544((byte) -65);
        Class71_Sub1.method1343(false);
        Class65.method632();
        Class109.method1658(20);
        Class114.method1689(true);
        Class120.method1738(0);
        Class68_Sub20_Sub15.method1168((byte) -63);
        Class68_Sub26.method1217(32125);
        Class10.method218();
        Class68_Sub28_Sub2.method1268(-57);
        Class68_Sub27.method1222(-1);
        Class74.method1379(-97);
        Class102.method1626(32768);
        Class68_Sub20_Sub12.method1152(true);
        Class9.method211(-46);
        Class34.method417(true);
        Class53.method550((byte) -28);
        Class112.method1670(133988164);
        Class68_Sub20_Sub7.method1073(-23562);
        Class96.method1553((byte) 71);
        Class67.method639(988656400);
        Class70.method1332((byte) 120);
        Class48.method516(113);
        Class32.method410((byte) -121);
        Class68_Sub20_Sub2.method1042((byte) 23);
        Class68_Sub20_Sub3.method1056(0);
        Class68_Sub20_Sub8.method1092(1);
        Class51.method540(10);
        Class68_Sub20_Sub11.method1146(0);
        Class103.method1636(-11);
        Class106.method1647(0);
        Class17.method295(1);
        Class43.method482(-2);
        Class58.method583(-2);
        Class68_Sub29.method1324(-108);
        Class4.method187(true);
        PacketParser.method1666((byte) -119);
        Class85.method1479(0);
        Class68_Sub15.method981(1);
        Class68_Sub20_Sub9.method1099(false);
        Class68_Sub22.method1201(-1);
        Class68_Sub18.method992(0);
        Class60.method588(-1);
        Class68_Sub20_Sub14.method1167(5285);
        Class54.method555((byte) 116);
        Class42.method476();
        Class59.method584(-1);
        Class121.method1743(1);
        Class118.method1732(32767);
        Class1_Sub1.method69(true);
        Class1_Sub5.method137(2);
        Class68_Sub10.method682(0);
        Class1_Sub2.method70(31756);
        Class1_Sub7.method168(-104);
        Class127.method1779(0);
        Class68_Sub5.method662(0);
        Class33.method411((byte) 127);
        Class68_Sub4.method658(27392);
        Canvas_Sub1.method48((byte) 106);
        Class26.method389(-123);
        Class50_Sub2.method535(25);
        Class72_Sub1.method1368((byte) -98);
        Class104.method1638(0);
        Class107.method1653(125);
        Class15.method274(0);
        Class68_Sub20_Sub13.method1162(true);
        Class68_Sub20_Sub13_Sub2.method1164(-840517817);
        Class105.method1642(190);
        Class68_Sub16.method986(false);
        Class20.method325((byte) 87);
        Class35_Sub1.method436();
        Class6.method197();
        Class110.method1660();
        int i_65_ = 9 / ((i - -12) / 38);
        Class73.method1373();
        Class18.method299(18002);
        Class68_Sub7.method668(304);
        Class68_Sub25.method1211(121);
        Class68_Sub21.method1200();
        Class41.method470();
        Class3.method182(96);
        Class68_Sub13.method691((byte) 50);
        Class68_Sub13_Sub37.method890((byte) -37);
        Class122.method1746(-106);
        Class22.method375(124);
        Class88.method1493((byte) 103);
        Class115.method1699(100);
        Class68_Sub24.method1207((byte) -69);
        Class101.method1624(-31601);
        Class68_Sub9.method680(-19267);
        Class83.method1475(1);
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
        Class68_Sub20_Sub18.method1185((byte) 74);
        Class68_Sub20_Sub4.method1058(1152);
        Class68_Sub20_Sub5.method1063(110);
        Class68_Sub8.method676(61);
        Class93.method1540(92);
        Class68_Sub20_Sub19.method1189(26507);
        Class68_Sub6.method664((byte) -80);
        Class68_Sub17.method989(125);
        Class13.method240(-28590);
        Class13_Sub2.method257((byte) 15);
        Class13_Sub3.method259(0);
        Class13_Sub1.method252(112);
    }

    public void method27(int i) {
        Class68_Sub13_Sub26.method831(Class75_Sub1_Sub1.signlink,
                (byte) -104, Class75_Sub2.safeMode);
        Class68_Sub15.anInt3013 = (i != (Class75_Sub3.anInt3328 ^ 0xffffffff)
                ? Class106.anInt1799 + 50000 : 443);
        anInt2384++;
        if (Class68_Sub13_Sub34.anInt4008 != 1) {
            Class120.aShortArray2098 = Class3.aShortArray75;
            Class92.aShortArrayArray1650 = Class68_Sub20_Sub19.aShortArrayArray4455;
            Class68_Sub13_Sub35.aShortArray4023 = Class68_Sub13_Sub20.aShortArray3779;
            Class56.aShortArrayArray1065 = Class68_Sub13_Sub12.aShortArrayArray3629;
        } else {
            Class120.aShortArray2098 = Class71.aShortArray1300;
            Class92.aShortArrayArray1650 = Class68_Sub5.aShortArrayArray2831;
            Class68_Sub13_Sub35.aShortArray4023 = Class59.aShortArray1107;
            Class56.aShortArrayArray1065 = Class13_Sub3.aShortArrayArray2674;
        }
        Class115.anInt1946 = (Class75_Sub3.anInt3328 == 0 ? 43594
                : 40000 - -Class106.anInt1799);
        Class105.aShortArray1793 = Class33.aShortArray579 = Class68_Sub13_Sub25.aShortArray3854 = Class68_Sub20_Sub7.aShortArray4266 = new short[256];
        Class103.port = Class115.anInt1946;
        Class105.method1644((byte) -109);
        Class53.method545(Class86.aCanvas1585, 1611550343);
        Class72_Sub1.method1362(i + 52, Class86.aCanvas1585);
        RSString.aClass97_2261 = Class68_Sub20_Sub2.method1043((byte) 80);
        if (RSString.aClass97_2261 != null)
            RSString.aClass97_2261.method1562(Class86.aCanvas1585, true);
        Class112.anInt1900 = SignLink.anInt1054;
        try {
            if (Class75_Sub1_Sub1.signlink.aClass2_1045 != null) {
                Class68_Sub20_Sub10.aClass124_4318 = new Class124((Class75_Sub1_Sub1.signlink.aClass2_1045),
                        5200, 0);
                for (int i_66_ = 0; (i_66_ ^ 0xffffffff) > -28; i_66_++)
                    Class26.aClass124Array520[i_66_] = new Class124((Class75_Sub1_Sub1.signlink.aClass2Array1039[i_66_]),
                            6000, 0);
                Class75_Sub2.aClass124_3311 = new Class124((Class75_Sub1_Sub1.signlink.aClass2_1057),
                        6000, 0);
                Class43.aUnknown_734 = new Unknown(255, Class68_Sub20_Sub10.aClass124_4318,
                        Class75_Sub2.aClass124_3311, 500000);
                Class68_Sub13_Sub4.aClass124_3486 = new Class124((Class75_Sub1_Sub1.signlink.aClass2_1041),
                        24, 0);
                Class75_Sub1_Sub1.signlink.aClass2_1041 = null;
                Class75_Sub1_Sub1.signlink.aClass2_1057 = null;
                Class75_Sub1_Sub1.signlink.aClass2_1045 = null;
                Class75_Sub1_Sub1.signlink.aClass2Array1039 = null;
            }
        } catch (java.io.IOException ioexception) {
            Class68_Sub20_Sub10.aClass124_4318 = null;
            Class68_Sub13_Sub4.aClass124_3486 = null;
            Class75_Sub2.aClass124_3311 = null;
            Class43.aUnknown_734 = null;
        }
        if ((Class75_Sub3.anInt3328 ^ 0xffffffff) != -1)
            Class68_Sub22.aBoolean3134 = true;
        Class68_Sub4.aRSString_2819 = Class48.aRSString_952;
    }

    public void resetUpdateServer(int i, int i_67_) {
        anInt2369++;
        if (i != -5)
            method27(-31);
        Class68_Sub13_Sub9.unknownSocket = null;
        Class84.anInt1540 = 0;
        if ((Class103.port ^ 0xffffffff) == (Class115.anInt1946 ^ 0xffffffff))
            Class103.port = Class68_Sub15.anInt3013;
        else
            Class103.port = Class115.anInt1946;
        Class127.anInt2209++;
        Class109.updateServer = null;
        if ((Class127.anInt2209 ^ 0xffffffff) > -3 || (i_67_ ^ 0xffffffff) != -8 && i_67_ != 9)
            if ((Class127.anInt2209 ^ 0xffffffff) > -3 || i_67_ != 6) {
                if ((Class127.anInt2209 ^ 0xffffffff) <= -5)
                    if (GameException.anInt2231 != 0 && ((GameException.anInt2231 ^ 0xffffffff) != -6))
                        Class13_Sub2.anInt2652 = 3000;
                    else {
                        this.error_fatal(690, "js5connect");
                        GameException.anInt2231 = 1000;
                    }
            } else {
                this.error_fatal(690, "js5connect_outofdate");
                GameException.anInt2231 = 1000;
            }
        else if ((GameException.anInt2231 ^ 0xffffffff) == -1 || (GameException.anInt2231 ^ 0xffffffff) == -6) {
            this.error_fatal(i ^ ~0x2b6, "js5connect_full");
            GameException.anInt2231 = 1000;
        } else
            Class13_Sub2.anInt2652 = 3000;
    }

    public static boolean method45(Class45 class45) {
        if (Class68_Sub20.aBoolean3094) {
            if (method41(class45) != 0)
                return false;
            if (class45.anInt896 == 0)
                return false;
        }
        return class45.aBoolean764;
    }

    public void method15(byte i) {
        anInt2374++;
        if (GameException.anInt2231 != 1000) {
            boolean bool = Class68_Sub13_Sub34.method872(0);
            if (bool && Class123.aBoolean2127 && Class68_Sub13_Sub36.aClass35_4035 != null)
                Class68_Sub13_Sub36.aClass35_4035.method428((byte) -100);
            if (i >= -56)
                init();
            boolean bool_68_ = false;
            if ((GameException.anInt2231 ^ 0xffffffff) == -31 || GameException.anInt2231 == 10)
                if (!Class68_Sub13_Sub21.aBoolean3796) {
                    if (Class36.aLong644 != 0L && ((Class36.method438(17161) ^ 0xffffffffffffffffL) < (Class36.aLong644 ^ 0xffffffffffffffffL)))
                        Class44.method485(-1);
                } else
                    Class44.method485(-1);
            if ((ISAACRandomGen.aLong1480 ^ 0xffffffffffffffffL) != -1L && ((Class36.method438(17161) ^ 0xffffffffffffffffL) < (ISAACRandomGen.aLong1480 ^ 0xffffffffffffffffL)) && PlayerDefinition.connection != null && (GameException.anInt2231 == 30 || GameException.anInt2231 == 25))
                Class68_Sub20_Sub6.method1071((byte) -118);
            if (Class103.aBoolean1762) {
                bool_68_ = true;
                Class103.aBoolean1762 = false;
            }
            if (bool_68_)
                Class72.method1348(0);
            if (GameException.anInt2231 == 0)
                Class68_Sub13_Sub16.method779(Class68_Sub13_Sub28.anInt3917,
                        null,
                        Class68_Sub29.aRSString_3235,
                        bool_68_, 23189);
            else if (GameException.anInt2231 != 5)
                if ((GameException.anInt2231 ^ 0xffffffff) != -11)
                    if ((GameException.anInt2231 ^ 0xffffffff) != -26 && ((GameException.anInt2231 ^ 0xffffffff) != -29))
                        if (GameException.anInt2231 != 30) {
                            if ((GameException.anInt2231 ^ 0xffffffff) == -41)
                                Class74.method1381(false,
                                        (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{Class72.aRSString_1306,
                                                Class118.aRSString_2081,
                                                Class55.aRSString_2053}))),
                                        -16678);
                        } else
                            Class68_Sub13_Sub25.method821(true);
                    else if ((Class21renamed.anInt480 ^ 0xffffffff) != -2)
                        if ((Class21renamed.anInt480 ^ 0xffffffff) != -3)
                            Class74.method1381(false,
                                    (Class68_Sub13_Sub19.aRSString_3742),
                                    -16678);
                        else {
                            if (Class45.anInt925 > Class68_Sub13_Sub11.anInt3602)
                                Class68_Sub13_Sub11.anInt3602 = Class45.anInt925;
                            int i_69_ = 50 - -(50 * (Class68_Sub13_Sub11.anInt3602 - Class45.anInt925) / Class68_Sub13_Sub11.anInt3602);
                            Class74.method1381(false,
                                    (Class68_Sub20_Sub13_Sub2.method1166(2,
                                            (new RSString[]{Class68_Sub13_Sub19.aRSString_3742,
                                                    Unknown.aRSString_1621,
                                                    Class68_Sub13_Sub24.method816(i_69_, 0),
                                                    Class83.aRSString_1523}))),
                                    -16678);
                        }
                    else {
                        if (Class50_Sub2.anInt2745 < Class68_Sub13_Sub19.anInt3748)
                            Class50_Sub2.anInt2745 = Class68_Sub13_Sub19.anInt3748;
                        int i_70_ = (50 * (Class50_Sub2.anInt2745 + -Class68_Sub13_Sub19.anInt3748) / Class50_Sub2.anInt2745);
                        Class74.method1381(false,
                                (Class68_Sub20_Sub13_Sub2.method1166(2, (new RSString[]{(Class68_Sub13_Sub19.aRSString_3742),
                                        Unknown.aRSString_1621,
                                        Class68_Sub13_Sub24.method816(i_70_, 0),
                                        Class83.aRSString_1523}))),
                                -16678);
                    }
                else
                    Class56.method571((byte) 46);
            else
                Class68_Sub7.method665((Class68_Sub13_Sub4.aClass68_Sub20_Sub1_3511),
                        -27931);
            if ((GameException.anInt2231 == 30 || (GameException.anInt2231 ^ 0xffffffff) == -11) && (Class68_Sub20_Sub5.anInt4229 ^ 0xffffffff) == -1 && !bool_68_)
                try {
                    Graphics graphics = Class86.aCanvas1585.getGraphics();
                    for (int i_71_ = 0; ((Class56.anInt1061 ^ 0xffffffff) < (i_71_ ^ 0xffffffff)); i_71_++)
                        if (Class68_Sub17.aBooleanArray3037[i_71_]) {
                            Class1_Sub5.aClass72_2496.method1359(graphics, true, ItemDef.anIntArray376[i_71_],
                                    Class105.anIntArray1795[i_71_],
                                    Class71.anIntArray1294[i_71_],
                                    Class1_Sub6_Sub2.anIntArray3430[i_71_]);
                            Class68_Sub17.aBooleanArray3037[i_71_] = false;
                        }
                } catch (Exception exception) {
                    Class86.aCanvas1585.repaint();
                }
            else if (GameException.anInt2231 != 0)
                try {
                    Graphics graphics = Class86.aCanvas1585.getGraphics();
                    Class1_Sub5.aClass72_2496.method1350(73, 0, 0, graphics);
                    for (int i_72_ = 0; Class56.anInt1061 > i_72_; i_72_++)
                        Class68_Sub17.aBooleanArray3037[i_72_] = false;
                } catch (Exception exception) {
                    Class86.aCanvas1585.repaint();
                }
            if (Class67.aBoolean1210)
                Class68_Sub13_Sub31.method861((byte) -128);
            do
                if (Class71.anInt1293 != 0) {
                    try {
                        Point pointn = Class86.aCanvas1585.getLocationOnScreen();
                        Dimension dimension = Class86.aCanvas1585.getSize();
                    } catch (Exception exception) {
                        break;
                    }
                    break;
                }
            while (false);
        }
    }

    public static void main(String[] args) {
        try {
            //String[] strings = new String[]{"0", "live", "live", "software", "members", "english", "game0"};
            String[] strings = new String[]{"66", "live", "live", "software", "members", "english", "game1"};
            if (strings.length < 7 || strings.length > 8)
                Class21renamed.method329(28);
            Class106.anInt1799 = Integer.parseInt(strings[0]);
            if (strings[1].equals("live"))
                Class75_Sub3.anInt3328 = 0;
            else if (strings[1].equals("office"))
                Class75_Sub3.anInt3328 = 1;
            else if (strings[1].equals("local"))
                Class75_Sub3.anInt3328 = 2;
            else
                Class21renamed.method329(-5);
            if (strings[2].equals("live"))
                Class13_Sub4.anInt2690 = 0;
            else if (strings[2].equals("rc"))
                Class13_Sub4.anInt2690 = 1;
            else if (!strings[2].equals("wip"))
                Class21renamed.method329(126);
            else
                Class13_Sub4.anInt2690 = 2;
            if (strings[4].equals("free"))
                Class1_Sub7.aBoolean2612 = false;
            else if (strings[4].equals("members"))
                Class1_Sub7.aBoolean2612 = true;
            else
                Class21renamed.method329(116);
            if (strings[5].equals("english"))
                Class68_Sub13_Sub27.anInt3915 = 0;
            else if (!strings[5].equals("german"))
                Class21renamed.method329(-44);
            else {
                Class72_Sub1.method1369(-40);
                Class68_Sub13_Sub27.anInt3915 = 1;
            }
            if (strings[6].equals("game0"))
                Class68_Sub13_Sub34.anInt4008 = 0;
            else if (!strings[6].equals("game1"))
                Class21renamed.method329(114);
            else
                Class68_Sub13_Sub34.anInt4008 = 1;
            if ((strings.length ^ 0xffffffff) == -9)
                if (strings[7].equals("safemode"))
                    Class75_Sub2.safeMode = true;
                else
                    Class21renamed.method329(127);
            else
                Class75_Sub2.safeMode = false;
            //Class68_Sub9.serverAddress = JOptionPane.showInputDialog(null,"Please enter IP address:");
            //xxx set address
            Class68_Sub9.serverAddress = "localhost";
            //Class68_Sub28_Sub2.username = newRSString("mopar3");
            //Class68_Sub28_Sub2.password = newRSString("tom");
            Class26.aRSString_521 = Class68_Sub28_Sub2.aRSString_4556;
            Class68_Sub13_Sub20.anInt3780 = 0;
            client var_client = new client();
            var_client.method21(765, 503, 109, 27, "runescape", 508, 32 - -Class13_Sub4.anInt2690);
            Class108.aFrame1832.setLocation(40, 40);
        } catch (Exception exception) {
            Class71.method1339(null, exception, 38);
        }
        anInt2378++;
    }

}
