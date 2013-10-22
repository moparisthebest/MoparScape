/* SignLink - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.*;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class SignLink implements Runnable {
    public static String javaVendor;
    public Thread aThread1037;
    public JagSocket aClass31_1038 = null;
    public Class2[] aClass2Array1039;
    public static String osNameLowercase;
    public Class2 aClass2_1041;
    public Applet anApplet1042;
    public File aFile1043 = null;
    public static Method setFocusCycleRoot;
    public Class2 aClass2_1045;
    public static String osName;
    public static String osArch;
    public JagSocket aClass31_1048;
    public static Method setFocusTraversalKeysEnabled;
    public Interface1 anInterface1_1050;
    public static String userHome;
    public File aFile1052;
    public static String osVersion;
    public static int anInt1054 = 3;
    public boolean aBoolean1055;
    public EventQueue anEventQueue1056;
    public Class2 aClass2_1057;
    public static String javaVersion;

    public JagSocket newJagSocket(int i, Object object, int i_0_, int i_1_,
                                  int i_2_) {
        JagSocket jagSocket = new JagSocket();
        jagSocket.port = i_0_;
        jagSocket.hostname = object;
        jagSocket.priority = i;
        //System.out.println("newJagSocket: jagSocket.port:"+jagSocket.port+" jagSocket.hostname:"+jagSocket.hostname+" jagSocket.priority:"+jagSocket.priority);
        synchronized (this) {
            if (aClass31_1038 == null)
                aClass31_1038 = aClass31_1048 = jagSocket;
            else {
                aClass31_1038.aClass31_557 = jagSocket;
                aClass31_1038 = jagSocket;
            }
            this.notify();
            int i_3_ = 20 / ((i_1_ - -48) / 48);
        }
        return jagSocket;
    }

    public JagSocket method557(Class var_class, byte i) {
        if (i > -81)
            anInterface1_1050 = null;
        return newJagSocket(13, var_class, 0, -101, 0);
    }

    public JagSocket method558(byte i, int i_4_, Runnable runnable) {
        if (i >= -28)
            method557(null, (byte) -110);
        return newJagSocket(2, runnable, i_4_, -123, 0);
    }

    public JagSocket newJagSocket(String hostname, byte i, int port) {
        if (i < 107)
            method563(-9, 4);
        return newJagSocket(1, hostname, port, -107, 0);
    }

    public JagSocket method560(Class var_class, int i) {
        if (i < 12)
            return null;
        return newJagSocket(11, var_class, 0, 88, 0);
    }

    public void run() {
        for (; ; ) {
            JagSocket class31;
            synchronized (this) {
                for (; ; ) {
                    if (aBoolean1055)
                        return;
                    if (aClass31_1048 != null) {
                        class31 = aClass31_1048;
                        aClass31_1048 = aClass31_1048.aClass31_557;
                        if (aClass31_1048 == null)
                            aClass31_1038 = null;
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                int i = class31.priority;
                if ((i ^ 0xffffffff) == -2)
                    class31.playerDefSocket
                            = new Socket(InetAddress.getByName((String)
                            (class31
                                    .hostname)),
                            class31.port);
                else if (i == 2) {
                    Thread thread = new Thread((Runnable) class31.hostname);
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(class31.port);
                    class31.playerDefSocket = thread;
                } else if (i != 4) {
                    if (i != 8) {
                        if (i != 9)
                            throw new Exception();
                        Object[] objects = (Object[]) class31.hostname;
                        class31.playerDefSocket
                                = ((Class) objects[0])
                                .getDeclaredField((String) objects[1]);
                    } else {
                        Object[] objects = (Object[]) class31.hostname;
                        class31.playerDefSocket
                                = (((Class) objects[0]).getDeclaredMethod
                                ((String) objects[1], (Class[]) objects[2]));
                    }
                } else
                    class31.playerDefSocket
                            = new DataInputStream(((URL) class31.hostname)
                            .openStream());
                class31.anInt555 = 1;
            } catch (Throwable throwable) {
                class31.anInt555 = 2;
            }
        }
    }

    public JagSocket method561(int i, String string, Class var_class) {
        if (i != 30810)
            return null;
        return newJagSocket(9, new Object[]{var_class, string}, 0, -104, 0);
    }

    public JagSocket method562(URL url, int i) {
        if (i != 0)
            run();
        return newJagSocket(4, url, 0, 12, 0);
    }

    public JagSocket method563(int i, int i_6_) {
        if (i_6_ != 0)
            aFile1043 = null;
        return newJagSocket(3, null, i, i_6_ + 28, 0);
    }

    public JagSocket method564(Class[] var_classes, int i, String string,
                               Class var_class) {
        if (i != 0)
            findcachedir(-119, null, 20, -51);
        return newJagSocket(8, new Object[]{var_class, string, var_classes}, 0,
                -98, 0);
    }

    public void findcachedir(int storeID, String sub_file, int i_7_, int i_8_) {
        //System.out.println("findcachedir called");
        storeID = 32;
        String[] cacheDirs = {client.cacheDir};
        for (int dirId = 0; dirId < cacheDirs.length; dirId++) {
            try {
                File file = new File(cacheDirs[dirId]);
                //System.out.println("findcachedir" + file.getAbsolutePath());
                if (!file.exists()) {
                    boolean bool = file.mkdir();
                    if (!bool) {
                        continue;
                    }
                }
                if (aClass2_1041 == null) {
                    try {
                        File randomFile = new File(file, "random.dat");
                        if (!randomFile.exists()) {
                            randomFile.createNewFile();
                        }
                        if (randomFile.exists()) {
                            aClass2_1041 = new Class2(randomFile, "rw", 25L);
                        }
                    } catch (Exception exception) {
                        aClass2_1041 = null;
                    }
                }
                if (aFile1052 == null) {
                    try {
                        if (!file.exists()) {
                            boolean bool = file.mkdir();
                            if (!bool) {
                                continue;
                            }
                        }
                        File mainCache = new File(file, "main_file_cache.dat2");
                        if (!mainCache.exists()) {
                            mainCache.createNewFile();
                        }
                        aClass2_1045 = new Class2(mainCache, "rw", 104857600L);
                        aClass2Array1039 = new Class2[i_8_];
                        for (int id = 0; id < i_8_; id++) {
                            aClass2Array1039[id] = (new Class2(new File(file, ("main_file_cache.idx" + id)), "rw", 1048576L));
                        }
                        aClass2_1057 = (new Class2(new File(file, "main_file_cache.idx255"), "rw", 1048576L));
                        aFile1043 = aFile1052 = file;
                    } catch (Exception exception) {
                        System.out.println("Unable to find cache files.");
                        try {
                            aClass2_1045.method175(i_7_ ^ ~0x1fec);
                            for (int id = 0; id < i_8_; id++)
                                aClass2Array1039[id].method175(-8143);
                            aClass2_1057.method175(-8143);
                        } catch (Exception exception_18_) {
                        }
                        aFile1043 = aFile1052 = null;
                        aClass2Array1039 = null;
                        aClass2_1045 = aClass2_1057 = null;
                    }
                }
            } catch (Exception exception) {
            }
            if (aClass2_1041 != null && aFile1052 != null)
                return;
        }
        if (aFile1052 == null)
            throw new RuntimeException();
    }

    public void method566(int i) {
        synchronized (this) {
            if (i != 0)
                method560(null, -14);
            aBoolean1055 = true;
            this.notifyAll();
        }
        try {
            aThread1037.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (aClass2_1045 != null) {
            try {
                aClass2_1045.method175(i + -8143);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (aClass2_1057 != null) {
            try {
                aClass2_1057.method175(-8143);
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (aClass2Array1039 != null) {
            for (int i_19_ = 0; i_19_ < aClass2Array1039.length; i_19_++) {
                if (aClass2Array1039[i_19_] != null) {
                    try {
                        aClass2Array1039[i_19_].method175(-8143);
                    } catch (java.io.IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
        do {
            if (aClass2_1041 != null) {
                try {
                    aClass2_1041.method175(-8143);
                } catch (java.io.IOException ioexception) {
                    break;
                }
                break;
            }
        } while (false);
    }

    public Interface1 method567(int i) {
        if (i != 0)
            return null;
        return anInterface1_1050;
    }

    public JagSocket method568(boolean bool, String string) {
        if (bool != true)
            return null;
        return newJagSocket(12, string, 0, -124, 0);
    }

    public SignLink(boolean signed, Applet applet, int i, String string,
                    int i_20_) {
        // app:    SignLink(boolean true, Applet null, int 32, String runescape, int 27)
        // applet: SignLink(boolean false, Applet client[panel0,0,0,0x0,invalid,layout=java.awt.FlowLayout], int 33, String null, int 0)
        // System.out.println("SignLink(boolean "+signed+", Applet "+applet+", int "+i+", String "+string+", int "+i_20_+")");
        //xxx it's signed
        signed = true;
        string = "runescape";
        i = 32;
        i_20_ = 27;
        // xxx to here
        aClass2_1041 = null;
        aFile1052 = null;
        aClass31_1048 = null;
        anApplet1042 = null;
        aClass2_1045 = null;
        aBoolean1055 = false;
        aClass2_1057 = null;
        javaVersion = "1.1";
        anApplet1042 = applet;
        javaVendor = "Unknown";
        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }
        try {
            osName = System.getProperty("os.name");
        } catch (Exception exception) {
            osName = "Unknown";
        }
        osNameLowercase = osName.toLowerCase();
        try {
            osArch = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            osArch = "";
        }
        try {
            osVersion = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            osVersion = "";
        }
        try {
            userHome = System.getProperty("user.home");
            if (userHome != null)
                userHome += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (userHome == null)
            userHome = "~/";
        try {
            anEventQueue1056
                    = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }
        try {
            if (applet == null)
                setFocusTraversalKeysEnabled
                        = (Class.forName("java.awt.Component").getDeclaredMethod
                        ("setFocusTraversalKeysEnabled",
                                new Class[]{Boolean.TYPE}));
            else
                setFocusTraversalKeysEnabled = (applet.getClass().getMethod
                        ("setFocusTraversalKeysEnabled",
                                new Class[]{Boolean.TYPE}));
        } catch (Exception exception) {
            /* empty */
        }
        try {
            if (applet == null)
                setFocusCycleRoot
                        = (Class.forName("java.awt.Container").getDeclaredMethod
                        ("setFocusCycleRoot", new Class[]{Boolean.TYPE}));
            else
                setFocusCycleRoot = applet.getClass().getMethod("setFocusCycleRoot",
                        (new Class[]
                                {Boolean.TYPE}));
        } catch (Exception exception) {
            /* empty */
        }
        if (signed)
            findcachedir(i, string, 34, i_20_);
        aBoolean1055 = false;
        aThread1037 = new Thread(this);
        aThread1037.setPriority(10);
        aThread1037.setDaemon(true);
        aThread1037.start();
    }
}
