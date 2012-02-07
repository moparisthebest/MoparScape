/*
 * Copyright (C) 2010  moparisthebest
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

package org.moparscape.iface;

import java.security.interfaces.RSAPublicKey;

/**
 * This interface must be implemented for moparscape to load this applet as a client.
 * For two different working examples, check the 317 and 508 clients implementing this interface.
 * <p/>
 * The only methods that *MUST* be implemented correctly are the ones that say so, namely setServer, setPort, getPort,
 * setCacheDir, setKeyListener, and getParams.
 *
 * @author mopar
 */
public interface ClientInterface {

    public static final long serialVersionUID = 43L;

    /**
     * Sets the server address the user wishes to connect to.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @param server The address of the private server the client should connect to next time 'login' is pressed.
     */
    public void setServer(String server);

    /**
     * Sets the port of the private server the user wishes to connect to.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @param port The port number to be used when connecting to the server.
     */
    public void setPort(int port);

    /**
     * Returns the server's address.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @return The address the client would try to connect to, as set by setServer().
     */
    public String getServer();

    /**
     * Returns the server's port.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @return The port the client would try to connect to, as set by setPort().
     */
    public int getPort();

    /**
     * Tells the client where the cache will reside, this is the only folder the client has write permissions to.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @param cacheDir The directory the cache files for the client are in.
     */
    public void setCacheDir(String cacheDir);

    /**
     * Called to get the size of the client.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @return Size of client.
     */
    public java.awt.Dimension getDimension();

    /**
     * Gives the client a KeyListener to send left-over keyPressed events back to that the client doesn't recognize.
     * This is needed because the client grabs all key events and moparscape doesn't receive them,
     * causing the key bindings not to work. The way to implement this is to find your 'keyPressed(KeyEvent keyevent)'
     * method in your client, and at the end of it add 'client.keyListener.keyPressed(keyevent);', assuming
     * you save this 'kl' as client.keyListener.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @param kl KeyListener to save and send events back to.
     */
    public void setKeyListener(java.awt.event.KeyListener kl);

    /**
     * Tells the client what port on localhost the Ondemand server is listening on.
     * If this client doesn't use this server, you can ignore this call.
     *
     * @param port The port the server is listening on on the localhost address.
     */
    public void setOndemandPort(int port);

    /**
     * Tells the client what port on localhost the Jaggrab server is listening on.
     * If this client doesn't use this server, you can ignore this call.
     *
     * @param port The port the server is listening on on the localhost address.
     */
    public void setJaggrabPort(int port);

    /**
     * Turns maplock on or off and also sets the direction the map should be locked to.
     * If you don't have this functionality, just ignore this call. (currently 508 does)
     *
     * @param maplock True for on, false for off.
     * @param mapface 0 for North, 1030 for South, 1545 for East, 515 for West. Look at 317 for reference.
     */
    public void setMapLock(boolean maplock, int mapface);

    /**
     * Turns HP over heads on or off.
     * If you don't have this functionality, just ignore this call. (currently 508 ignores it)
     *
     * @param on True for on, false for off.
     */
    public void setHPheads(boolean on);

    /**
     * Turns camera zoom on or off.
     * If you don't have this functionality, just ignore this call. (currently 508 ignores it)
     *
     * @param on True for on, false for off.
     */
    public void setZoom(boolean on);

    /**
     * Modifies the camera zoom and position.
     * For example functionality, look at moparscape's 317.
     * If you don't have this functionality, just ignore this call. (currently 508 ignores it)
     *
     * @param zoom   The amount to add to the zoom integer.
     * @param fwdbwd The amount to add to the fwdbwd integer.
     * @param lftrit The amount to add to the lftrit integer.
     */
    public void modZoomInts(int zoom, int fwdbwd, int lftrit);


    // The following are only meant to be called once.

    /**
     * Moparscape feeds these parameters back to the client when it requests them, just like a browser would.
     * <p/>
     * This *MUST* be implemented correctly.
     *
     * @return A Map with the param name as the key, and the value as the value.
     */
    public java.util.Map<String, String> getParams();

    /**
     * Called once to get update servers for moparscape to start and manage.
     *
     * @param defaultLocation Default location of cache.
     * @param customLocation  Custom location of cache.
     * @return Should always return org.moparscape.userver.Server[2] (but each index can be null)
     */
    public org.moparscape.userver.Server[] getUpdateServers(String defaultLocation, String customLocation);

    /**
     * Sets the background the client should use.
     * Optional, but much better if you use it.
     *
     * @param image Image to use as the client background.
     */
    public void setBackground(java.awt.Image image);

    /**
     * Sets the public RSA key the client should use.
     * Optional, but good to allow your client to use any public key.
     *
     * @param key RSAPublicKey to use for encryption
     */
    public void setPublicKey(RSAPublicKey key);

    /**
     * Sets the hasher you should use to hash your passwords before sending them across the network.
     * Optional, but good to allow your client to hash passwordsp
     *
     * @param hasher Hasher to use for hashing strings
     */
    public void setHasher(org.moparscape.iface.Hasher hasher);

}
