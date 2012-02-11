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

import org.moparscape.res.impl.Downloader;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: 3/14/11
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DownloadListener {
    public static enum Status {
        NOT_STARTED, RUNNING, STARTING, FINISHED, EXTRACTING, STOPPED, ERROR
    }

    public Status getStatus();

    public void setProgress(int progress);

    public void setTitle(String title);

    public void setExtraInfo(String extraInfo);

    public void reset(String title, long length, String info);

    public void starting(String title, long length, String info);

    public void extracting(String title, long length, String info);

    public void finished(String savePath, String... filesDownloaded);

    public void stopped();

    public void error(String msg, Exception e);

    public boolean download(String url, String savePath, boolean extract, ChecksumInfo ci, Downloader dl) throws Exception;
}
