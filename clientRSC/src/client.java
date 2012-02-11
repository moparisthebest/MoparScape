/*
 * Copyright (C) 2012  moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com , I read it but don't usually respond.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import mudclient.Config;
import mudclient.LoginDataEncryption;
import org.moparscape.iface.ClientInterface;

import java.awt.image.BufferedImage;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mopar
 */
public class client extends mudclient.mudclient implements ClientInterface {

    int width = 512;
    int height = 344;

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

    public String getServer() {
        return Config.SERVER_IP;
    }

    public java.awt.Dimension getDimension() {
        return new java.awt.Dimension(width, height);
    }

    public Map<String, String> getParams() {
        HashMap<String, String> ret = new HashMap<String, String>();
        // set params
        ret.put("getCodeBase", "http://localhost");
        ret.put("getDocumentBase", "http://localhost/index.php");
        return ret;
    }

    public void setPublicKey(RSAPublicKey key) {
        LoginDataEncryption.customPublicKey = key;
    }

    public void setHasher(org.moparscape.iface.Hasher hasher) {
        this.hasher = hasher;
    }

    public void setBackground(java.awt.Image image) {
        //image = null; System.out.println("image disabled!");
        if (image == null)
            return;
        // the login screen image needs to be this size, and an array of pixels
        int newWidth = width;
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

        // the loading screen image can be full size, and an image
        newWidth = width;
        newHeight = height;
        bgImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        bgImage.getGraphics().drawImage(image,
                0, 0, newWidth, newHeight,
                0, 0, oldWidth, oldHeight,
                null);

    }

    public void setKeyListener(java.awt.event.KeyListener kl) {
        super.addKeyListener(kl);
    }

    // below here are unused imports

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

    static {
        Config.CONF_DIR = "/home/mopar/.moparscape4/devCache/";
        Config.MEDIA_DIR = Config.CONF_DIR;
        Config.SERVER_IP = "localhost";
        Config.SERVER_PORT = 43594;
    }

}
