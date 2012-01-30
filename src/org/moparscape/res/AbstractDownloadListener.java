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

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 3/15/11
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractDownloadListener implements DownloadListener {

    private Status status = Status.NOT_STARTED;
    // we are going to synchronize around this ourselves
    private Queue<Status> statusQueue = new LinkedList<Status>();

    protected long length;
    protected String info;

    protected int progress = 0;
    protected String title = null;
    protected String extraInfo = null;
    protected Exception exception = null;

    public Status getStatus() {
        return status;
    }

    private synchronized void setStatus(Status stat){
        status = stat;
        statusQueue.offer(stat);
    }

    public synchronized Status pollStatus(){
        //printQueue();
        return statusQueue.poll();
    }

    public synchronized Status peekStatus(){
        //printQueue();
        Status ret = statusQueue.peek();
        if(ret == null)
            ret = status;
        return ret;
        //return statusQueue.peek();
    }
    /*
    private synchronized void printQueue(){
        int i = 0;
        for(Status s : (LinkedList<Status>)statusQueue)
            System.out.println("queue["+(i++)+"]: "+s);
        System.out.println("status: "+status);
    } */

    public void setStopped() {
        setStatus(Status.STOPPED);
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

    public void reset(String title, long length, String info) {
        this.title = title;
        this.length = length;
        this.info = info;

    }

    public void starting(String title, long length, String info) {
        setStatus(Status.STARTING);
        reset(title, length, info);
        setStatus(Status.RUNNING);
    }

    public void extracting(String title, long length, String info) {
        setStatus(Status.EXTRACTING);
        reset(title, length, info);
        setStatus(Status.RUNNING);
    }

    public void finished(String savePath, String... filesDownloaded) {
        // if it's an error, we want to ignore stopped
        if (status == Status.ERROR)
            return;
        setStatus(Status.FINISHED);

        synchronized (this) {
            this.notify();//waiter.interrupt();
        }
    }

    public void stopped() {
        // if it's an error, we want to ignore stopped
        if (status == Status.ERROR)
            return;
        setStatus(Status.STOPPED);

        // lets go ahead and notify ourselves again anyhow, can't hurt
        synchronized (this) {
            this.notify();
        }
    }

    public void error(String msg, Exception e) {
        // if we already have an error, chances are it will cause more
        // this is here to preserve the original error
        if(status == Status.ERROR)
            return;
        setStatus(Status.ERROR);
        this.extraInfo = msg;
        this.exception = e;
        progress = 0;
        //System.out.println("error!");
        //System.out.println(msg);
        //if (e != null) e.printStackTrace();

        synchronized (this) {
            this.notify();//waiter.interrupt();
        }
    }
}
