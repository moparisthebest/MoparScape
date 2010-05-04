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
 * This interface must be implemented for moparscape to load this as a server.
 * For two different working examples, check the 317 and 508 clients implementing this interface.
 * @author mopar
 */
public interface ServerInterface {

    public static final long serialVersionUID = 42L;

    /**
     * This is called by moparscape to start the server
     * @param workingDirectory Files server needs are in here, and this is the only place you have permission to read
     * and write.
     */
    public void startServer(String workingDirectory);

}