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
