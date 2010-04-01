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

    // two permissions allowed if using java.util.GregorianCalendar
    private Permission p1 = new java.lang.RuntimePermission("accessClassInPackage.sun.util.resources");
    private Permission reflectPerm = new java.lang.reflect.ReflectPermission("suppressAccessChecks");

    public void addPermissions(ClassLoader cl, Permissions perms) {
        //if the key already exists, just return, we only support setting the permissions once
        if (permissionMap.containsKey(cl))
            return;
        perms.setReadOnly();
        permissionMap.put(cl, perms);
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
        if(true) return;

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
            if (lastCName.startsWith("java.util.") && lastCName.endsWith("Calendar") && (perm.equals(p1) || perm.equals(reflectPerm)) )
                return;
            // some more exceptions for when java classes use reflection. why?...
            if(lastCName.equals("java.awt.Component") && perm.equals(reflectPerm))
                return;
            // it must be in our map, so update allow appropriatly
            allow &= clPerms.implies(perm);
        }

        // if allow is true, just return to allow the permission
        if (allow)
            return;

        System.out.println("denying: " + perm.toString());

        // class stack for debugging
        //for (int i = 1; i < c.length; i++) System.out.println(i + ": " + c[i].getName());
        Thread.dumpStack();

        // otherwise allow is false, throw a SecurityException
        throw new SecurityException("Permission denied: "+perm.toString());
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
        // ignore context
        this.checkPermission(perm);
    }

}
