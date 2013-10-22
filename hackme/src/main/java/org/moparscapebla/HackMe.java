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

package org.moparscapebla;

import java.net.URL;
import java.net.URLClassLoader;
import java.security.Permissions;

public class HackMe {

    public String pub_var = "not modified";
    private String prv_var = "not modified";

    public static String pub_static_var = "not modified";
    private static String prv_static_var = "not modified";

    public static void main(String[] args) throws Exception{
        if (args.length != 1) {
            System.out.println("Usage: java -jar hackme.jar url_to_your_jar");
            return;
        }
        new HackMe(args[0]);
    }

    public HackMe(String jar) throws Exception{

        URLClassLoader loader = new URLClassLoader(new URL[]{new URL(jar)});

        System.setSecurityManager(new org.moparscape.security.SecurityManager());

        String allowedDir = "./allowed/";
        ((org.moparscape.security.SecurityManager)System.getSecurityManager()).addPermissions(loader, this.getPermissions(allowedDir));

        Object o = loader.loadClass("MyEntry").newInstance();
        //Object o = new MyEntry();

        MyInterface mi = (MyInterface) o;

        mi.doSomething("i send string");
        mi.doSomethingElse(15);

        System.out.println("HackMe is finished, did you hack it?");

    }

    public void doPublicStuff() {
        System.out.println("doPublicStuff() pub_var: " + pub_var);
    }

    private void doPrivateStuff() {
        System.out.println("doPrivateStuff() prv_var: " + prv_var);
    }

    public void doPublicStaticStuff() {
        System.out.println("doPublicStaticStuff() pub_static_var: " + pub_static_var);
    }

    private void doPrivateStaticStuff() {
        System.out.println("doPrivateStaticStuff() prv_static_var: " + prv_static_var);
    }

    public static Permissions getPermissions(String allowedDir) {
        //printSystemPropertiesExit();
        // java.library.path=/opt/jdk1.6.0_18/jre/lib/i386/server:/opt/jdk1.6.0_18/jre/lib/i386:/opt/jdk1.6.0_18/jre/../lib/i386:.::/usr/java/packages/lib/i386:/lib:/usr/lib
        // to allow recursively everything under allowedDir
        allowedDir += "-";
        Permissions permissions = new Permissions();
        //permissions.add(new java.security.AllPermission());
        //questionable
        permissions.add(new java.util.PropertyPermission("user.home", "read"));
        permissions.add(new java.lang.RuntimePermission("accessDeclaredMembers"));
        permissions.add(new java.lang.RuntimePermission("setFactory"));
        permissions.add(new java.lang.RuntimePermission("loadLibrary.awt"));
        permissions.add(new java.io.FilePermission("./-", "read"));
        permissions.add(new java.security.SecurityPermission("putProviderProperty.SUN"));
        // very questionable
        //permissions.add(new java.lang.reflect.ReflectPermission("suppressAccessChecks"));
        permissions.add(new java.net.NetPermission("getProxySelector"));
        //needed
        //String javaHome = "${java.home}/-";
        String javaHome = System.getProperty("java.home") + "/-";
        //System.out.println("java.home: "+javaHome);
        permissions.add(new java.io.FilePermission(javaHome, "read"));
        permissions.add(new java.io.FilePermission(allowedDir, "read,write,delete"));
        permissions.add(new java.net.SocketPermission("localhost:1024-", "accept,connect,listen"));
        // following needed for networking and file read/write
        // this is OK because we restrict FilePermissions and SocketPermission
        permissions.add(new java.lang.RuntimePermission("readFileDescriptor"));
        permissions.add(new java.lang.RuntimePermission("writeFileDescriptor"));

        /*       //platform specific? :( (all for fonts, whats a better way?)
               permissions.add(new java.io.FilePermission("/usr/share/fonts/-", "read"));
               permissions.add(new java.io.FilePermission("/usr/lib/jvm/-", "read"));
               permissions.add(new java.io.FilePermission("/var/lib/defoma/-", "read"));
               permissions.add(new java.io.FilePermission(System.getProperty("user.home")+"/.fonts", "read"));
               permissions.add(new java.io.FilePermission("/usr/X11R6/lib/X11/fonts/-", "read"));
        */       //System.out.println(permissions.toString());
        return permissions;
    }
}
