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

package org.moparscape.security;

import org.moparscape.MainPanel;

import java.security.Permission;
import java.security.Permissions;
import java.util.HashMap;
import java.util.Map;

/**
 * Very flexible SecurityManager that restricts permissions based on class loader. Fixes some painful problems with
 * default JVM classes.
 */
public class SecurityManager extends java.lang.SecurityManager {

    private Map<ClassLoader, Permissions> permissionMap = new HashMap<ClassLoader, Permissions>();

    // single socket permission that is allowed
    private java.net.SocketPermission allowedSocket = new java.net.SocketPermission("localhost", "connect,accept,resolve");

    // some permissions we need for special cases
    private Permission p1 = new java.lang.RuntimePermission("accessClassInPackage.sun.util.resources");
    private Permission reflectPerm = new java.lang.reflect.ReflectPermission("suppressAccessChecks");
    private Permission classLoaderPerm = new java.lang.RuntimePermission("createClassLoader");

    public SecurityManager() {
        try {
            new java.net.URL("http://localhost/");
        } catch (Exception e) {

        }
    }

    public void addPermissions(ClassLoader cl, Permissions perms) {
        // if they can't set the SecurityManager, they shouldn't be able to modify this one, so check...
        System.getSecurityManager().checkPermission(new java.lang.RuntimePermission("setSecurityManager"));
        //if the key already exists, just return, we only support setting the permissions once
        if (permissionMap.containsKey(cl))
            return;
        perms.setReadOnly();
        permissionMap.put(cl, perms);
    }

    public void allowSocketTo(String host) {
        // if they can't set the SecurityManager, they shouldn't be able to modify this one, so check...
        System.getSecurityManager().checkPermission(new java.lang.RuntimePermission("setSecurityManager"));
        allowedSocket = new java.net.SocketPermission(host, "connect,accept,resolve");
    }

    /**
     * Throws a <code>SecurityException</code> if the requested
     * access, specified by the given permission, is not permitted based
     * on the security policy currently in effect.
     * <p/>
     * This method calls <code>AccessController.checkPermission</code>
     * with the given permission.
     *
     * @param perm the requested permission.
     * @throws SecurityException    if access is not permitted based on
     *                              the current security policy.
     * @throws NullPointerException if the permission argument is
     *                              <code>null</code>.
     * @since 1.2
     */
    @Override
    public void checkPermission(Permission perm) {
        if (perm == null)
            throw new NullPointerException("Permission cannot be null.");

        // this isn't ready to go live yet, so just return and allow it all
        //if (true) return;

        // if this is the allowed socket, allow it
        if (allowedSocket.implies(perm))
            return;
        // we are now going to go through the ClassLoaders of all Classes on the stack
        // if any of them are in perms, then check the permissions, sticking to the most
        // restrictive of the permissions of any class in the stack (ANDing them all together)
        // so default value should be true or it would never be true ((false & anything) == false)
        boolean allow = true;
        // get all classes on stack
        Class c[] = getClassContext();

        // if this is true, the request came from SecurityManager or this class, so allow it.
        // this stops Circularity errors, and is only used when ran as an applet, why the hell?...
        if (c[2].getName().equals("org.moparscape.security.SecurityManager"))
            return;

        //System.out.println("requesting perm: "+perm);

        for (int i = 1; i < c.length; i++) {
            ClassLoader cl = c[i].getClassLoader();
            // if the ClassLoader is null (can it be?) continue...
            if (cl == null)
                continue;
            Permissions clPerms = permissionMap.get(cl);
            // if the classloader isn't in our map, we don't have any say on it so continue
            if (clPerms == null)
                continue;
            // 2 exceptions here for java.util.GregorianCalendar, java.util.Calendar, java.text.SimpleDateFormat:
            // java.lang.RuntimePermission accessClassInPackage.sun.util.resources
            // java.lang.reflect.ReflectPermission suppressAccessChecks
            String lastCName = c[i - 1].getName();
            if (((lastCName.startsWith("java.util.") && lastCName.endsWith("Calendar"))
                    || lastCName.equals("java.text.SimpleDateFormat"))
                    && (perm.equals(p1) || perm.equals(reflectPerm)))
                return;
            // some more exceptions for when java classes use reflection. why?...
            // also an exception for jsound, we can't just allow loadlibrary.jsound* because there could be malicious
            // code in a custom library named jsoundhacks and it would be allowed to load, so we only allow
            // loadlibrary.jsound* if the next class on the stack is javax.sound.sampled.AudioSystem
            // known examples are jsoundds and jsoundalsa
            if (lastCName.equals("javax.sound.sampled.AudioSystem") && (perm.equals(reflectPerm) || perm.getName().startsWith("loadLibrary.jsound")))
                return;
            // or sun.java2d.SunGraphics2D for Mac OSX Leopard...
            if (lastCName.equals("java.awt.Component") || lastCName.equals("sun.font.FontDesignMetrics") || lastCName.equals("sun.java2d.SunGraphics2D")) {
                // component uses reflection, and sometimes creates a classloader, yay...
                if (perm.equals(reflectPerm) || perm.equals(classLoaderPerm))
                    return;
                // it also loads about a million fonts, with no platform independent way to handle this, so we are going to kludge it
                // we are going to allow reading (only) of all .ttf files
                if (perm instanceof java.io.FilePermission && perm.getActions().equals("read")) {
                    // most end with .ttf
                    if (perm.getName().endsWith(".ttf"))
                        return;
                    // some end with .ttc
                    if (perm.getName().endsWith(".ttc"))
                        return;
                    // others are named something stupid, like 'ttf-arabeyes', or even 'kochi'
                    // something they all have in common (at least on linux) is they all contain 'font' in the path
                    if (perm.getName().toLowerCase().contains("font"))
                        return;
                }
            }
            // it must be in our map, so update allow appropriatly
            allow &= clPerms.implies(perm);
        }

        // if allow is true, just return to allow the permission
        if (allow)
            return;


        System.err.println("denying: " + perm.toString());

        if (org.moparscape.MainPanel.debug()) {
            // class stack for debugging
            for (int i = 1; i < c.length; i++) System.out.println(i + ": " + c[i].getName());

            Thread.dumpStack();
        }

        // otherwise allow is false, throw a SecurityException
        //throw new SecurityException("Permission denied: " + perm.toString());
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
        // ignore context
        this.checkPermission(perm);
    }

    public static Permissions getClientPermissions(String allowedDir) {
        //printSystemPropertiesExit();
        // java.library.path=/opt/jdk1.6.0_18/jre/lib/i386/server:/opt/jdk1.6.0_18/jre/lib/i386:/opt/jdk1.6.0_18/jre/../lib/i386:.::/usr/java/packages/lib/i386:/lib:/usr/lib
        // to allow recursively everything under allowedDir
        allowedDir += "-";
        MainPanel.debug("allowedDir: " + allowedDir);
        Permissions permissions = new Permissions();
        //permissions.add(new java.security.AllPermission());

        // only needed when not in a jar
        // will deny this later
        permissions.add(new java.io.FilePermission("./-", "read"));
        permissions.add(new java.net.SocketPermission("graveman.info", "connect,accept,resolve"));
        //questionable
        permissions.add(new RuntimePermission("accessDeclaredMembers"));
        permissions.add(new RuntimePermission("setFactory"));
        permissions.add(new RuntimePermission("loadLibrary.awt"));
        permissions.add(new java.security.SecurityPermission("putProviderProperty.SUN"));
        // very questionable
        permissions.add(new RuntimePermission("modifyThreadGroup"));
        permissions.add(new java.net.NetPermission("getProxySelector"));
        //needed
        String javaHome = System.getProperty("java.home") + "/-";
        permissions.add(new java.io.FilePermission(javaHome, "read"));
        permissions.add(new java.io.FilePermission(allowedDir, "read,write,delete"));
        permissions.add(new java.io.FilePermission(allowedDir.substring(0, allowedDir.length() - 2), "read,write,delete"));
        permissions.add(new java.net.SocketPermission("localhost:1024-", "accept,connect,listen"));
        permissions.add(new java.util.PropertyPermission("socksProxyHost", "read"));
        permissions.add(new java.util.PropertyPermission("line.separator", "read"));
        permissions.add(new java.util.PropertyPermission("java.protocol.handler.pkgs", "read"));
        // java.util.Calendar screwing with things again, write isn't too harmful, it only
        // lasts for the run of that individual JVM
        permissions.add(new java.util.PropertyPermission("user.timezone", "read,write"));
        permissions.add(new java.util.PropertyPermission("user.country", "read"));
        permissions.add(new java.util.PropertyPermission("sun.timezone.ids.oldmapping", "read"));
        permissions.add(new java.util.PropertyPermission("sun.net.inetaddr.ttl", "read"));
        permissions.add(new java.util.PropertyPermission("java.net.useSystemProxies", "read"));
        permissions.add(new java.security.SecurityPermission("getProperty.networkaddress.*"));
        // following needed for networking and file read/write
        // this is OK because we restrict FilePermissions and SocketPermission
        permissions.add(new RuntimePermission("readFileDescriptor"));
        permissions.add(new RuntimePermission("writeFileDescriptor"));

        // asked for with java5 runtime
        permissions.add(new java.util.PropertyPermission("sun.java2d.remote", "read"));

        // the above is sufficient for 317, following is needed for 508
        permissions.add(new java.util.PropertyPermission("user.home", "read"));
        permissions.add(new java.util.PropertyPermission("line.separator", "read"));
        permissions.add(new java.util.PropertyPermission("java.vendor", "read"));
        permissions.add(new java.util.PropertyPermission("java.version", "read"));
        permissions.add(new java.util.PropertyPermission("java.home", "read"));
        permissions.add(new java.util.PropertyPermission("java.class.path", "read"));
        permissions.add(new java.util.PropertyPermission("os.*", "read"));
        permissions.add(new java.util.PropertyPermission("sun.awt.*", "read"));
        permissions.add(new java.util.PropertyPermission("javax.*", "read"));
        permissions.add(new java.awt.AWTPermission("accessEventQueue"));
        permissions.add(new java.net.NetPermission("getCookieHandler"));
        permissions.add(new java.net.NetPermission("getResponseCache"));
        permissions.add(new RuntimePermission("loadLibrary.jsound"));

        // following for OSX leopard
        permissions.add(new java.util.PropertyPermission("socksNonProxyHosts", "read"));
        permissions.add(new java.util.PropertyPermission("sun.java2d.*", "read"));
        permissions.add(new RuntimePermission("accessClassInPackage.sun.text.resources"));
        // apparantly the following isn't in System.getProperty("java.home")? whatever, osx blows...
        permissions.add(new java.io.FilePermission("/System/Library/Frameworks/JavaVM.framework/-", "read"));

        return permissions;
    }

    public static Permissions getServerPermissions(String allowedDir) {
        // basically the same, why not?
        Permissions permissions = getClientPermissions(allowedDir);

        // for 508
        permissions.add(new java.util.PropertyPermission("python.home", "read,write"));
        permissions.add(new java.util.PropertyPermission("java.vm.vendor", "read"));
        permissions.add(new java.util.PropertyPermission("python.home", "read"));

        //System.out.println(permissions.toString());
        return permissions;
    }
}
