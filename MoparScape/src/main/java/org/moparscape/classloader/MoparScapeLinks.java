/*
 * Copyright (C) 2009-2013 moparisthebest
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Official forums are http://www.moparscape.org/smf/
 * Email me at admin@moparisthebest.com.
 */

package org.moparscape.classloader;

import org.moparscape.res.impl.Downloader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * This outputs some HTML with handy links to test clients/servers/caches in MoparScape.
 *
 * @author mopar
 */
public class MoparScapeLinks {

	//public static final String mscpLink = "<a href=\"https://www.moparscape.org/moparscape4.php?version=317&customClient=%s&customClientCRC=%d&customCache=%s&customCacheCRC=%d&customServer=%s&customServerCRC=%d\">%s %s %s</a><br />\n";
	public static final String mscpLink = "<a href=\"https://www.moparscape.org/moparscape4.php?version=317&debug=true&customClient=file://%s&customClientCRC=%d&customCache=file://%s&customCacheCRC=%d&customServer=file://%s&customServerCRC=%d\">%s %s %s</a><br />\n";
	public static final String mavenArtifact = "%1$s/%2$s/target/%2$s.%3$s";

	public static void main(String[] args) throws Exception {
		//System.out.println("args: "+ Arrays.toString(args)); if(true) return;
		if (args.length < 2) {
			System.out.println("Usage: CRCJar rootDir htmlFile");
			return;
		}
		final File rootDir = new File(args[0]).getCanonicalFile();
		final PrintStream html;
		if (args[1].equals("-"))
			html = System.out;
		else
			html = new PrintStream(new FileOutputStream(args[1]));

		html.println("<html><head><title>MoparScape Test Links</title></head><body>");

		outputLink(rootDir, html, "client317", "server317", "complete317");
		outputLink(rootDir, html, "client508", "server508", "complete508");
		outputLink(rootDir, html, "renamed508", "server508", "complete508");
		outputLink(rootDir, html, "clientRSC", "server317", "completeRSC");

		html.println("</body></html>");
	}

	public static void outputLink(final File rootDir, final PrintStream html, final String client, final String server, final String cache) {
		try {
			final String clientJar = new File(rootDir, String.format(mavenArtifact, "clients", client, "jar")).getAbsolutePath();
			final String serverJar = new File(rootDir, String.format(mavenArtifact, "servers", server, "jar")).getAbsolutePath();
			final String serverZip = new File(rootDir, String.format(mavenArtifact, "servers", server, "zip")).getAbsolutePath();
			final String cacheZip = new File(rootDir, String.format("cachedump/%s.zip", cache)).getAbsolutePath();
			final long clientCRC = new CRCClassLoader(clientJar).getCRC();
			final long serverCRC = new CRCClassLoader(serverJar).getCRC();
			final long cacheCRC = Downloader.crcExtractFile(cacheZip);
			html.printf(mscpLink, clientJar, clientCRC, cacheZip, cacheCRC, serverZip, serverCRC, client, server, cache);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
