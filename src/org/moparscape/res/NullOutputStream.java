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

package org.moparscape.res;

import java.io.IOException;
import java.io.OutputStream;

/**
* Created by IntelliJ IDEA.
* User: mopar
* Date: 1/5/12
* Time: 2:21 PM
* To change this template use File | Settings | File Templates.
*/
public class NullOutputStream extends OutputStream {

    @Override
    public void write(byte[] b, int off, int len) {

    }

    @Override
    public void write(int b) {

    }

    @Override
    public void write(byte[] b) throws IOException {

    }

}
