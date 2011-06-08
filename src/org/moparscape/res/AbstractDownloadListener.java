/*
 * Copyright (C) 2011  moparisthebest
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
 * Date: 3/15/11
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractDownloadListener implements DownloadListener{

    private Status status = Status.NOT_STARTED;

    protected long length;
    protected String info;

    protected int progress = 0;
    protected String title = null;
    protected String extraInfo = null;

    public Status getStatus(){
        return status;
    }

    public void setRunning() {
        status = Status.RUNNING;
    }

    public void setStopped() {
        status = Status.STOPPED;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public void reset(String title, long length, String info){
        this.title = title;
        this.length = length;
        this.info = info;

    }

    public void starting(String title, long length, String info) {
        status = Status.STARTING;
        reset(title, length, info);
    }

    public void extracting(String title, long length, String info) {
        status = Status.EXTRACTING;
        reset(title, length, info);
    }

    public void finished(String savePath, String... filesDownloaded) {
        // if it's an error, we want to ignore stopped
        if(status == Status.ERROR)
            return;
        status = Status.FINISHED;
    }

    public void stopped() {
        // if it's an error, we want to ignore stopped
        if(status == Status.ERROR)
            return;
        status = Status.STOPPED;
    }

    public void error(String msg, Exception e) {
        status = Status.ERROR;
        this.extraInfo = msg;
        progress = 0;
        System.out.println("error!");
        System.out.println(msg);
        if(e != null) e.printStackTrace();
    }
}
