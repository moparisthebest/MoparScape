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

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 1/27/12
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CompleteRunnable implements Runnable {

    protected ResourceGrabber rg = null;
    protected int uid = -1;
    protected String url = null;
    protected String savePath = null;
    protected boolean extract, uniqueFolder, success;
    protected ChecksumInfo ci = null;
    protected Exception ex = null;

    public void set(ResourceGrabber rg, boolean success, int uid, String url, String savePath, boolean extract, ChecksumInfo ci, boolean uniqueFolder) {
        this.rg = rg;
        this.success = success;
        this.uid = uid;
        this.url = url;
        this.savePath = savePath;
        this.extract = extract;
        this.ci = ci;
        this.uniqueFolder = uniqueFolder;
    }

    public void setEx(Exception ex) {
        this.ex = ex;
    }

    @Override
    public String toString() {
        return "CompleteRunnable{" +
                "uid=" + uid +
                ", url='" + url + '\'' +
                ", savePath='" + savePath + '\'' +
                ", extract=" + extract +
                ", uniqueFolder=" + uniqueFolder +
                ", ci=" + ci +
                ", ex=" + ex +
                '}';
    }

    public abstract void run();
}
