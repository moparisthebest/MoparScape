/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.moparscape.iface.ClientInterface;
import rs.stream.Stream;

import java.awt.image.BufferedImage;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mopar
 */
public class client extends rs.client implements ClientInterface {

    public void setServer(String server) {
        serverAddress = server;
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

    // implemented
    public void setMapLock(boolean maplock, int mapface) {
        this.maplock = maplock;
        this.mapface = mapface;
    }

    // implemented
    public void setHPheads(boolean on) {
        this.hpOn = on;
    }

    // implemented
    public void setZoom(boolean on) {
        this.zoomOn = on;
    }

    public void setKeyListener(java.awt.event.KeyListener kl) {
        //keyListener = kl;
        this.addKeyListener(kl);
    }

    // implemented
    public void modZoomInts(int zoom, int fwdbwd, int lftrit) {
        this.zoom = zoom;
        this.fwdbwd = fwdbwd;
        this.lftrit = lftrit;
    }

    public int getPort() {
        return serverPort;
    }

    public String getServer() {
        return serverAddress;
    }

    public Map<String, String> getParams() {
        HashMap<String, String> ret = new HashMap<String, String>();
        // set params
        ret.put("getCodeBase", "http://localhost");
        ret.put("getDocumentBase", "http://localhost/index.php");
        ret.put("nodeid", "32");
        ret.put("portoff", "0");
        ret.put("lowmem", "1");
        ret.put("free", "0");
        ret.put("width", "765");
        ret.put("height", "503");
        return ret;
    }

    public org.moparscape.userver.Server[] getUpdateServers(String defaultLocation, String customLocation) {
        org.moparscape.userver.Server[] ret = new org.moparscape.userver.Server[2];
        ret[0] = new org.moparscape.userver.v317.JaggrabServer(defaultLocation, customLocation);
        ret[1] = new org.moparscape.userver.v317.ConcurrentOndemandServer(defaultLocation, customLocation);
        return ret;
    }

    public java.awt.Dimension getDimension() {
        return new java.awt.Dimension(765, 503);
    }

    public void setBackground(java.awt.Image image) {
        if (image == null)
            return;
        int newWidth = 766;
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
        // mirror the right half, since 317 requires it
        bgImage = image;
        int w = bgImage.getWidth(null);
        int h = bgImage.getHeight(null);
        bgImage.getGraphics().drawImage(bgImage,
                w / 2, 0, w, h,
                w, 0, w / 2, h,
                null);
    }

    public void setPublicKey(RSAPublicKey key) {
        Stream.publicKey = key.getPublicExponent();
        Stream.modulus = key.getModulus();
    }

    public void setHasher(org.moparscape.iface.Hasher hasher){
        this.hasher = hasher;
    }

}
