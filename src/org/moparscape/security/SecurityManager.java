package org.moparscape.security;

import java.security.Permission;
import java.security.Permissions;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: mopar
 * Date: Mar 2, 2010
 * Time: 7:37:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class SecurityManager extends java.lang.SecurityManager {

    private Map<ClassLoader, Permissions> permissionMap = new HashMap<ClassLoader, Permissions>();

    // single socket permission that is allowed
    private java.net.SocketPermission allowedSocket = new java.net.SocketPermission("localhost", "connect,accept,resolve");

    // some permissions we need for special cases
    private Permission p1 = new java.lang.RuntimePermission("accessClassInPackage.sun.util.resources");
    private Permission reflectPerm = new java.lang.reflect.ReflectPermission("suppressAccessChecks");
    private Permission classLoaderPerm = new java.lang.RuntimePermission("createClassLoader");

    public void addPermissions(ClassLoader cl, Permissions perms) {
        // if they can't set the SecurityManager, they shouldn't be able to modify this one, so check...
        System.getSecurityManager().checkPermission(new java.lang.RuntimePermission("setSecurityManager"));
        //if the key already exists, just return, we only support setting the permissions once
        if (permissionMap.containsKey(cl))
            return;
        perms.setReadOnly();
        permissionMap.put(cl, perms);
    }

    public void allowSocketTo(String host){
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
        //if(true) return;

        // if this is the allowed socket, allow it
        if(allowedSocket.implies(perm))
                return;

        // we are now going to go through the ClassLoaders of all Classes on the stack
        // if any of them are in perms, then check the permissions, sticking to the most
        // restrictive of the permissions of any class in the stack (ANDing them all together)

        // so default value should be true or it would never be true ((false & anything) == false)
        boolean allow = true;
        // get all classes on stack
        Class c[] = getClassContext();

        for (int i = 1; i < c.length; i++) {
            ClassLoader cl = c[i].getClassLoader();
            // if the ClassLoader is null (can it be?) continue...
            if (cl == null)
                continue;
            Permissions clPerms = permissionMap.get(cl);
            // if the classloader isn't in our map, we don't have any say on it so continue
            if (clPerms == null)
                continue;
            // 2 exceptions here for java.util.GregorianCalendar and java.util.Calendar:
            // java.lang.RuntimePermission accessClassInPackage.sun.util.resources
            // java.lang.reflect.ReflectPermission suppressAccessChecks
            String lastCName = c[i - 1].getName();
            if (lastCName.startsWith("java.util.") && lastCName.endsWith("Calendar") && (perm.equals(p1) || perm.equals(reflectPerm)))
                return;
            // some more exceptions for when java classes use reflection. why?...
            // also an exception for jsound, we can't just allow loadlibrary.jsound* because there could be malicious
            // code in a custom library named jsoundhacks and it would be allowed to load, so we only allow
            // loadlibrary.jsound* if the next class on the stack is javax.sound.sampled.AudioSystem
            // known examples are jsoundds and jsoundalsa
            if (lastCName.equals("javax.sound.sampled.AudioSystem") && (perm.equals(reflectPerm) || perm.getName().startsWith("loadLibrary.jsound")))
                return;
            if (lastCName.equals("java.awt.Component") || lastCName.equals("sun.font.FontDesignMetrics")) {
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
                    // something they all have in common (at least on linux) is they all contain 'fonts' in the path
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

        if(org.moparscape.MainPanel.debug()){
            System.out.println("denying: " + perm.toString());

            // class stack for debugging
            for (int i = 1; i < c.length; i++) System.out.println(i + ": " + c[i].getName());
                Thread.dumpStack();
        }

        // otherwise allow is false, throw a SecurityException
        throw new SecurityException("Permission denied: "+perm.toString());
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
        // ignore context
        this.checkPermission(perm);
    }

}
