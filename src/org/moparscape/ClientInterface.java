/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.moparscape;

/**
 * @author mopar
 */
public interface ClientInterface {

    public static final long serialVersionUID = 42L;

    public void setServer(String server);

    public void setPort(int port);

    public void setCacheDir(String cacheDir);

    public void setOndemandPort(int port);

    public void setJaggrabPort(int port);

    public void setMapLock(boolean maplock, int mapface);

    public void setHPheads(boolean on);

    public void setZoom(boolean on);

    public void setKeyListener(java.awt.event.KeyListener kl);

    public void modZoomInts(int zoom, int fwdbwd, int lftrit);

    public int getPort();

    /*
    These are only meant to be called once.
     */
    public java.util.HashMap<String, String> getParams();

    // should always return org.moparscape.userver.Server[2]
    public org.moparscape.userver.Server[] getUpdateServers(String defaultLocation, String customLocation);

    public java.awt.Dimension getDimension();

    public void setBackground(java.awt.Image image);

}
