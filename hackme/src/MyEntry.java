import org.moparscape.MyInterface;

import java.lang.reflect.Field;
import java.security.Permissions;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

public class MyEntry implements MyInterface {

    public MyEntry() {
        System.out.println("in MyEntry\n");
        doTheNaughty();
    }

    public void doSomething(String s) {

    }

    public void doSomethingElse(int i) {

    }

    private void doTheNaughty() {
        System.out.println("doing something that is allowed");
        System.getProperty("user.home");

//        System.out.println("doing GregorianCalendar");
//        Calendar cal = new GregorianCalendar();

        try {
            System.out.println("a quick test to make sure illegalMethod() will actually fail");
            illegalMethod();
        } catch (Exception e) {
            System.out.println("failed, trying something else\n");
        }
/*
        try {
            System.out.println("trying to set SecurityManager to null");
            System.setSecurityManager(null);
            illegalMethod();
        } catch (Exception e) {
            System.out.println("failed, trying something else\n");
        }

        try {
            System.out.println("trying to add java.security.AllPermission()");
            org.moparscape.security.SecurityManager sm = (org.moparscape.security.SecurityManager) System.getSecurityManager();

            Field permMap = org.moparscape.security.SecurityManager.class.getDeclaredField("permissionMap");

            permMap.setAccessible(true);

            Map<ClassLoader, Permissions> permissionMap = (Map<ClassLoader, Permissions>) permMap.get(sm);

            Permissions myPerms = permissionMap.get(this.getClass().getClassLoader());

            //System.out.println("My permissions: "+myPerms.toString());

            // we need to set it to be not readOnly to modify it.
            myPerms.add(new java.security.AllPermission());

            illegalMethod();
        } catch (Exception e) {
            System.out.println("failed, trying something else\n");
        }
 */
        try {
            System.out.println("trying to remove all permissions for this classloader");
            org.moparscape.security.SecurityManager sm = (org.moparscape.security.SecurityManager) System.getSecurityManager();

            Field permMap = org.moparscape.security.SecurityManager.class.getDeclaredField("permissionMap");

            permMap.setAccessible(true);

            Map<ClassLoader, Permissions> permissionMap = (Map<ClassLoader, Permissions>) permMap.get(sm);

            permissionMap.remove(this.getClass().getClassLoader());

            illegalMethod();
        } catch (Exception e) {
            System.out.println("failed, trying something else\n");
        }


    }

    private void illegalMethod(){
        System.getProperty("java.library.path");
        System.out.println("illegalMethod() successful!");
        System.out.println("Sucess! I defeated the hackme!\n");
    }

}
