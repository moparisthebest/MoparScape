import org.moparscape.Debug;
import org.moparscapebla.HackMe;
import org.moparscapebla.MyInterface;

import java.lang.reflect.Field;
import java.security.Permissions;
import java.util.Map;

public class MyEntry implements org.moparscapebla.MyInterface {

    private static final String[] safePackages = new String[]{"java.", "sun.", "javax."};

    public static void main(String[] args) throws Exception {
/*
        String[] classes = new String[]{"org.moparscape.security.SecurityManager", "java.lang.SecurityManager", "java.lang.System", "org.moparscape.security.SecurityManager"};
        //classes = new String[]{"org.moparscape.security.SecurityManager", "java.lang.SecurityManager", "java.lang.System", "MyEntry", "doesntmatter", "hopewedontgetthisfar", "org.moparscape.security.SecurityManager"};
        classes = new String[]{"org.moparscape.security.SecurityManager", "java.lang.SecurityManager", "sun.lang.System", "javax.lang.System","org.moparscape.security.SecurityManager", "MyEntry", "doesntmatter", "hopewedontgetthisfar"};


        for (int x = 1; x < classes.length; x++) System.out.println(x + ": " + classes[x]);
        //boolean requestFromThisClass = true;
        for (int x = 1; x < classes.length; x++) {
            String className = classes[x].toLowerCase();
            System.out.println("className: " + className);
            if (className.equals("org.moparscape.security.securitymanager")) {
                System.out.println("Request is from this class, returning");
                return;
            }
            boolean unSafePackage = true;
            for (String safePackage : safePackages) {
                if (className.startsWith(safePackage)) {
                    System.out.println("true breaking");
                    unSafePackage = false;
                    break;
                }
            }
            if (unSafePackage) {
                System.out.println("not safe breaking");
                //requestFromThisClass = false;
                break;
            }
        }
        //System.out.println("requestFromThisClass: " + requestFromThisClass);

        System.exit(0);
*/
        //System.setOut(new PrintStream(new FileOutputStream("./secman.log")));
        System.setErr(System.out);
        Debug.debug = true;
        System.setSecurityManager(new org.moparscape.security.SecurityManager(true));

        String allowedDir = "./allowed/";
        ((org.moparscape.security.SecurityManager) System.getSecurityManager()).addPermissions(ClassLoader.getSystemClassLoader(), HackMe.getPermissions(allowedDir));
//        System.getProperty("java.library.path2");
//
        //System.getSecurityManager().checkPermission(new java.io.FilePermission("./-", "read"));
        /**/
//Object o = loader.loadClass("MyEntry").newInstance();
        Object o = new MyEntry();

        MyInterface mi = (MyInterface) o;

        mi.doSomething("i send string");
        mi.doSomethingElse(15);

        System.out.println("HackMe is finished, did you hack it?");

    }

    /*
      public static void main(String[] args) throws Exception{
      System.setSecurityManager(new org.moparscape.security.SecurityManager());

      String allowedDir = "./allowed/";
      ((org.moparscape.security.SecurityManager)System.getSecurityManager()).addPermissions(loader, this.getPermissions(allowedDir));

      Class c = loader.loadClass("MyEntry");

      Object o = c.newInstance();

      MyInterface mi = (MyInterface) o;

      mi.doSomething("i send string");
      mi.doSomethingElse(15);

      System.out.println("HackMe is finished, did you hack it?");

  }
    */
    public MyEntry() {
        System.out.println("in MyEntry\n");
    }

    public void doSomething(String s) {
        doTheNaughty();
    }

    public void doSomethingElse(int i) {

    }

    private void doTheNaughty() {
        System.out.println("doing something that is allowed");
        System.getProperty("user.home");

//        System.out.println("doing GregorianCalendar");
//        Calendar cal = new GregorianCalendar();

        boolean failed = false;
        try {
            System.out.println("a quick test to make sure illegalMethod() will actually fail");
            illegalMethod();
        } catch (Exception e) {
            failed = true;
        }
        System.out.println("failed: " + failed);
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

    private void illegalMethod() {
        System.getProperty("java.library.path");
        System.out.println("illegalMethod() successful!");
        System.out.println("Sucess! I defeated the hackme!\n");
    }

}
