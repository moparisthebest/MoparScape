/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import client.Config;
import org.moparscape.iface.ClientInterface;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mopar
 */
public class mudclient extends client.mudclient implements ClientInterface {

    public void setServer(String server) {
        Config.SERVER_IP = server;
    }

    public void setPort(int port) {
        Config.SERVER_PORT = port;
    }

    public void setCacheDir(String cacheDir) {
        Config.CONF_DIR = cacheDir;
        Config.MEDIA_DIR = cacheDir;
    }

    public int getPort() {
        return Config.SERVER_PORT;
    }

    public java.awt.Dimension getDimension() {
        return new java.awt.Dimension(512, 344);
    }

    public Map<String, String> getParams() {
        HashMap<String, String> ret = new HashMap<String, String>();
        // set params
        ret.put("getCodeBase", "http://localhost");
        ret.put("getDocumentBase", "http://localhost/index.php");
        return ret;
    }

    public void setBackground(java.awt.Image image) {
        //image = null;
        if (image == null)
            return;
        int newWidth = 512;
        int newHeight = 200;
        bgPixels = new int[newWidth][newHeight];
        int oldWidth = image.getWidth(null);
        int oldHeight = image.getHeight(null);
        bgImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);

        bgImage.getGraphics().drawImage(image,
                0, 0, newWidth, newHeight,
                0, 0, oldWidth, oldHeight,
                null);

        for (int x = 0; x < newWidth; x++)
            for (int y = 0; y < newHeight; y++)
                bgPixels[x][y] = bgImage.getRGB(x, y);
    }

    // below here are unused imports

    public void setKeyListener(java.awt.event.KeyListener kl) {
    }

    public org.moparscape.userver.Server[] getUpdateServers(String defaultLocation, String customLocation) {
        return null;
    }

    public void setOndemandPort(int port) {
    }

    public void setJaggrabPort(int port) {

    }

    public void setMapLock(boolean maplock, int mapface) {

    }

    public void setHPheads(boolean on) {

    }

    public void setZoom(boolean on) {

    }

    public void modZoomInts(int zoom, int fwdbwd, int lftrit) {

    }

}
