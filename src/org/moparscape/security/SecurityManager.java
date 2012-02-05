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

import org.moparscape.Debug;

import javax.swing.*;
import java.security.Permission;
import java.security.Permissions;
import java.util.Map;

/**
 * Very flexible SecurityManager that restricts permissions based on class loader. Fixes some painful problems with
 * default JVM classes.
 */
public class SecurityManager extends java.lang.SecurityManager {

    // IdentityHashMap is faster than HashMap and better in this case as the ClassLoader is the SAME OBJECT
    // and therefore will compare better and faster with == rather than the .equals() HashMap uses
    private final Map<ClassLoader, Permissions> permissionMap = new java.util.IdentityHashMap<ClassLoader, Permissions>();


    // single socket permission that is allowed
    private java.net.SocketPermission allowedSocket = new java.net.SocketPermission("localhost", "connect,accept,resolve");

    // some permissions we need for special cases
    private static final Permission p1 = new java.lang.RuntimePermission("accessClassInPackage.sun.util.resources");
    private static final Permission reflectPerm = new java.lang.reflect.ReflectPermission("suppressAccessChecks");
    private static final Permission classLoaderPerm = new java.lang.RuntimePermission("createClassLoader");

    public static final String[] safePackages = new String[]{"java.", "sun.", "javax."};

    private final String thisClassLowercase = this.getClass().getName().toLowerCase();
    private final boolean allowManualOverride;


    public SecurityManager() {
        this(false);
    }

    public SecurityManager(boolean allowManualOverride) {
        int choice = -1;

        if (allowManualOverride)
            choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to allow manual override of the SecurityManager?\n" +
                    "It is what keeps you safe from malicious code and viruses running on your computer.\n" +
                    "You should only ever do this if you are a developer and know exactly what code you are running.", "Security Question", JOptionPane.YES_NO_OPTION);

        this.allowManualOverride = (choice == JOptionPane.YES_OPTION);
    }

    public void addPermissions(ClassLoader cl, Permissions perms) {
        allowedToModifySecurityManager();
        //if the key already exists, just return, we only support setting the permissions once
        if (permissionMap.containsKey(cl))
            return;

        //perms.setReadOnly();  // no need for this anymore
        permissionMap.put(cl, perms);
    }

    public void allowSocketTo(String host) {
        allowedToModifySecurityManager();
        allowedSocket = new java.net.SocketPermission(host, "connect,accept,resolve");
    }

    /**
     * We are allowed to modify this only if no classloaders from classes on the stack are in permissionMap
     *
     * @return
     */
    private void allowedToModifySecurityManager() {
        for (Class c : getClassContext())
            if (permissionMap.get(c.getClassLoader()) != null)
                throw new SecurityException("You are not allowed to modify this SecurityManager.");
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

        //System.out.println("in checkPermission: "+perm.toString());

        // this isn't ready to go live yet, so just return and allow it all
        //if (true) return;

        // we are now going to go through the ClassLoaders of all Classes on the stack
        // if any of them are in perms, then check the permissions, sticking to the most
        // restrictive of the permissions of any class in the stack (if any are false, deny the request)

        // get all classes on stack
        Class[] classes = getClassContext();

        // if this is true, the request came from this class, so allow it.
        // this stops Circularity errors, and is only used when ran as an applet, why the hell?...
        for (int x = 1; x < classes.length; x++) {
            String className = classes[x].getName().toLowerCase();
            // if we get here and are still in the loop, request came from us, so return
            if (className.equals(thisClassLowercase))
                return;
            // check if this class is in a 'safe package', classloaders used with this SecurityManager
            // shouldn't allow potentially unsafe classes in these packages to be loaded
            boolean unSafePackage = true;
            for (String safePackage : safePackages) {
                if (className.startsWith(safePackage)) {
                    unSafePackage = false;
                    break;
                }
            }
            // then this class isn't in a 'safe' package or this class, the request didn't come from
            // this class, so continue
            if (unSafePackage)
                break;
        }

        //System.out.println("requesting perm: " + perm);

        for (int i = 1; i < classes.length; i++) {
            ClassLoader cl = classes[i].getClassLoader();

            // getClassLoader() can return null, if it is the bootstrap class
            // loader, since our Map implementation handles nulls, go ahead
            // and ignore whether or not it is null (my tests show speed is the same)
            //if (cl == null)     continue;

            Permissions clPerms = permissionMap.get(cl);
            // if the classloader isn't in our map, we don't have any say on it so continue
            if (clPerms == null)
                continue;

            // if the permissions allows this, continue and avoid all the following time-consuming checks
            // TODO: I've since discovered .implies() is rather slow, so find out what is slower, this or the following...
            if (clPerms.implies(perm))
                continue;

            // 2 exceptions here for java.util.GregorianCalendar, java.util.Calendar, java.text.SimpleDateFormat:
            // java.lang.RuntimePermission accessClassInPackage.sun.util.resources
            // java.lang.reflect.ReflectPermission suppressAccessChecks
            String lastCName = classes[i - 1].getName();
            if (((lastCName.startsWith("java.util.") && lastCName.endsWith("Calendar"))
                    || lastCName.equals("java.text.SimpleDateFormat"))
                    && (perm.equals(p1) || perm.equals(reflectPerm)))
                return;
            // some more exceptions for when java classes use reflection. why?...
            // also an exception for jsound, we can't just allow loadlibrary.jsound* because there could be malicious
            // code in a custom library named jsoundhacks and it would be allowed to load, so we only allow
            // loadlibrary.jsound* if the next class on the stack is javax.sound.sampled.AudioSystem
            // known examples are jsoundds and jsoundalsa
            if ((lastCName.equals("javax.sound.sampled.AudioSystem") || lastCName.equals("sun.audio.AudioPlayer")) && (perm.equals(reflectPerm) || perm.getName().startsWith("loadLibrary.jsound")))
                return;
            // or sun.java2d.SunGraphics2D for Mac OSX Leopard...
            if (lastCName.equals("java.awt.Component") || lastCName.equals("sun.font.FontDesignMetrics") || lastCName.equals("sun.java2d.SunGraphics2D")) {
                // component uses reflection, and sometimes creates a classloader, yay...
                if (perm.equals(reflectPerm) || perm.equals(classLoaderPerm))
                    return;
                // it also loads about a million fonts, with no platform independent way to handle this, so we are going to kludge it
                // we are going to allow reading (only) of all .ttf files
                if (perm instanceof java.io.FilePermission && perm.getActions().equals("read")) {
                    String lowName = perm.getName().toLowerCase();
                    // most end with .ttf
                    if (lowName.endsWith(".ttf"))
                        return;
                    // some end with .ttc
                    if (lowName.endsWith(".ttc"))
                        return;
                    // others are named something stupid, like 'ttf-arabeyes', or even 'kochi'
                    // something they all have in common (at least on linux) is they all contain 'font' in the path
                    if (lowName.contains("font"))
                        return;
                }
            }
            // java.security.KeyFactory also uses reflection
            if (lastCName.equals("java.security.KeyFactory")) {
                if (perm.equals(reflectPerm))
                    return;
                Permissions permissions = new Permissions();
                permissions.add(new java.lang.RuntimePermission("accessClassInPackage.sun.security.provider"));
                permissions.add(new java.util.PropertyPermission("java.security.egd", "read"));
                permissions.add(new java.security.SecurityPermission("getProperty.securerandom.source"));
                permissions.add(new java.lang.RuntimePermission("accessClassInPackage.sun.security.rsa"));
                permissions.add(new java.security.SecurityPermission("putProviderProperty.SunRsaSign"));
                permissions.add(new java.util.PropertyPermission("sun.security.rsa.restrictRSAExponent", "read"));
                if (permissions.implies(perm))
                    return;

                if (perm instanceof java.io.FilePermission && perm.getActions().equals("read")) {
                    String lowName = perm.getName().toLowerCase();
                    if (lowName.contains("random"))
                        return;
                }
            }

            if (lastCName.equals("javax.crypto.Cipher")) {
                if (perm.equals(reflectPerm) || perm.equals(classLoaderPerm))
                    return;

                Permissions permissions = new Permissions();
                permissions.add(new java.lang.RuntimePermission("createSecurityManager"));
                permissions.add(new java.security.SecurityPermission("putProviderProperty.SunJSSE"));
                permissions.add(new java.util.PropertyPermission("com.sun.security.preserveOldDCEncoding", "read"));
                permissions.add(new java.util.PropertyPermission("sun.security.key.serial.interop", "read"));
                permissions.add(new java.security.SecurityPermission("putProviderProperty.SunJCE"));
                permissions.add(new java.lang.RuntimePermission("getProtectionDomain"));
                permissions.add(new java.lang.RuntimePermission("accessClassInPackage.sun.security.rsa"));

                permissions.add(new java.util.PropertyPermission("*", "read,write"));

                if (permissions.implies(perm))
                    return;
            }


            // one last check, which I found is very slow
            // if this is the allowed socket, allow it
            if (allowedSocket.implies(perm))
                return;

            if (allowManualOverride) {
                String warning = "";
                if (perm.equals(reflectPerm) || perm.equals(classLoaderPerm))
                    warning = "\n\nBE EXTRA CAREFUL WITH THIS PERMISSION, IT WILL ALLOW MALICIOUS CODE TO" +
                            "\nCOMPLETELY BYPASS THIS SECURITYMANAGER, YOU WON'T BE ASKED ANY MORE" +
                            "\nQUESTIONS, AND BAD STUFF CAN HAPPEN!!!!! THIS IS YOUR FINAL WARNING.";
                int choice = JOptionPane.showConfirmDialog(null, "The untrusted applet is requesting this permission, allow? (you probably shouldn't):\n" + perm.toString() + warning, "Security Question", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    if (Debug.debug()) {
                        //Debug.debug("Manually allowing this permission:");
                        String actions = "";
                        if (!perm.getActions().isEmpty())
                            actions = ", \"" + perm.getActions() + "\"";
                        Debug.debug("permissions.add(new %s(\"%s\"%s));", perm.getClass().getName(), perm.getName(), actions);
                    }
                    //Debug.debug("new "+perm.getClass().getName()+"(")
                    //clPerms.setReadOnly();
                    clPerms.add(perm);
                    return;
                }
            }

            // if we get all the way down here, the permission was denied and wasn't an exception, so throw an exception
            Debug.debug("denying: " + perm.toString());

            if (Debug.debug()) {
                // class stack for debugging
                for (int x = 1; x < classes.length; x++) System.out.println(x + ": " + classes[x].getName());

                    Thread.dumpStack();
            }

            // otherwise allow is false, throw a SecurityException
            throw new SecurityException("Permission denied: " + perm.toString());
            //return;
        }

    }

    @Override
    public void checkPermission(Permission perm, Object context) {
        //System.out.printf("perm: '%s' context: '%s", perm, context);
        // ignore context
        this.checkPermission(perm);
    }

    public static Permissions getClientPermissions(String allowedDir) {
        //printSystemPropertiesExit();
        // java.library.path=/opt/jdk1.6.0_18/jre/lib/i386/server:/opt/jdk1.6.0_18/jre/lib/i386:/opt/jdk1.6.0_18/jre/../lib/i386:.::/usr/java/packages/lib/i386:/lib:/usr/lib
        // to allow recursively everything under allowedDir
        allowedDir += "-";
        Debug.debug("allowedDir: " + allowedDir);
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
        permissions.add(new RuntimePermission("accessClassInPackage.sun.audio"));
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

        // needed for RSC
        permissions.add(new java.util.PropertyPermission("http.nonProxyHosts", "read"));
        permissions.add(new java.security.SecurityPermission("getProperty.security.provider.*"));
        permissions.add(new java.security.SecurityPermission("getPolicy"));

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
        permissions.add(new java.util.PropertyPermission("sun.net.maxDatagramSockets", "read"));

        //System.out.println(permissions.toString());
        return permissions;
    }

    @Override
    public String toString() {
        return "SecurityManager{" +
                "allowManualOverride=" + allowManualOverride +
                ", thisClassLowercase='" + thisClassLowercase + '\'' +
                ", allowedSocket=" + allowedSocket +
                ", permissionMap=" + permissionMap +
                '}';
    }
}
