/* Class55 - Decompiled by JODE
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

public class Signlink implements Runnable {
    public static String javaVendor;
    private Thread cacheThread;
    private Class31 aClass31_1038 = null;
    public FileOnDisk[] mainFileCacheIndices;
    public static String os_lower;
    public FileOnDisk userIDFile;
    public Applet gameApplet;
    public File cacheRootCopy = null;
    public static Method setFocusCycleRoot;
    public FileOnDisk mainFileCacheData;
    public static String operatingSystem;
    public static String os_architecture;
    private Class31 aClass31_1048;
    public static Method setFocusTraversalKeysEnabled;
    private Interface1 anInterface1_1050;
    private static String homeDirectory;
    private File cacheRoot;
    public static String os_version;
    public static int anInt1054 = 3;
    private boolean aBoolean1055;
    public EventQueue eventQueue;
    public FileOnDisk mainFileCacheIndex;
    public static String javaVersion;

    private final Class31 method556(int i, Object object, int i_0_, int i_1_, int i_2_) {
        Class31 class31 = new Class31();
        class31.anInt559 = i_0_;
        ((Class31) class31).anObject554 = object;
        ((Class31) class31).anInt556 = i;
        synchronized (this) {
            if (aClass31_1038 == null)
                aClass31_1038 = aClass31_1048 = class31;
            else {
                ((Class31) aClass31_1038).aClass31_557 = class31;
                aClass31_1038 = class31;
            }
            this.notify();
            int i_3_ = 20 / ((i_1_ + 48) / 48);
        }
        return class31;
    }

    public final Class31 method557(Class var_class, byte i) {
        if (i > -81)
            anInterface1_1050 = null;
        return method556(13, var_class, 0, -101, 0);
    }

    public final Class31 method558(byte i, int i_4_, Runnable runnable) {
        if (i >= -28)
            method557(null, (byte) -110);
        return method556(2, runnable, i_4_, -123, 0);
    }

    public final Class31 method559(String string, byte i, int i_5_) {
        if (i < 107)
            method563(-9, 4);
        return method556(1, string, i_5_, -107, 0);
    }

    public final Class31 method560(Class var_class, int i) {
        if (i < 12)
            return null;
        return method556(11, var_class, 0, 88, 0);
    }

    public final void run() {
        for (; ;) {
            Class31 class31;
            synchronized (this) {
                for (; ;) {
                    if (aBoolean1055)
                        return;
                    if (aClass31_1048 != null) {
                        class31 = aClass31_1048;
                        aClass31_1048 = ((Class31) aClass31_1048).aClass31_557;
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
                int i = ((Class31) class31).anInt556;
                if (i == 1)
                    class31.playerDefSocket = new Socket(InetAddress.getByName((String) (((Class31) class31).anObject554)), class31.anInt559);
                else if (i == 2) {
                    Thread thread = new Thread((Runnable) (((Class31) class31).anObject554));
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(class31.anInt559);
                    class31.playerDefSocket = thread;
                } else if (i != 4) {
                    if (i != 8) {
                        if (i != 9)
                            throw new Exception();
                        Object[] objects = (Object[]) ((Class31) class31).anObject554;
                        class31.playerDefSocket = ((Class) objects[0]).getDeclaredField((String) objects[1]);
                    } else {
                        Object[] objects = (Object[]) ((Class31) class31).anObject554;
                        class31.playerDefSocket = (((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]));
                    }
                } else
                    class31.playerDefSocket = new DataInputStream(((URL) ((Class31) class31).anObject554).openStream());
                class31.anInt555 = 1;
            } catch (ThreadDeath threaddeath) {
                throw threaddeath;
            } catch (Throwable throwable) {
                class31.anInt555 = 2;
            }
        }
    }

    public final Class31 method561(int i, String string, Class var_class) {
        if (i != 30810)
            return null;
        return method556(9, new Object[]{var_class, string}, 0, -104, 0);
    }

    public final Class31 method562(URL url, int i) {
        if (i != 0)
            run();
        return method556(4, url, 0, 12, 0);
    }

    public final Class31 method563(int i, int i_6_) {
        if (i_6_ != 0)
            cacheRootCopy = null;
        return method556(3, null, i, i_6_ + 28, 0);
    }

    public final Class31 method564(Class[] var_classes, int i, String string, Class var_class) {
        if (i != 0)
            loadCache(-119, null, -51);
        return method556(8, new Object[]{var_class, string, var_classes}, 0, -98, 0);
    }

    private final void loadCache(int storeID, String sub_file, int indices_count) {
        //if (storeID < 32 || storeID > 34)
        storeID = 32;
        //String[] cache_folders = { ".jagex_cache_" + storeID, ".file_store_" + storeID };
        //String[] cache_directories = { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", homeDirectory, "/tmp/", "" };
        //String[] cache_directories = { "./cache508/rs2" };
        String[] cache_directories = {client.cacheDir};
        for (int did = 0; did < cache_directories.length; did++) {
            try {
                File cache_root = new File(cache_directories[did]);
                System.out.println("findcachedir" + cache_root.getAbsolutePath());
                if (!cache_root.exists()) {
                    boolean bool = cache_root.mkdir();
                    if (!bool) {
                        continue;
                    }
                }
                if (userIDFile == null) {
                    try {
                        File f = new File(cache_root, "random.dat");
                        if (f.exists())
                            userIDFile = new FileOnDisk(f, "rw", 25L);
                    } catch (Exception exception) {
                        userIDFile = null;
                    }
                }
                if (cacheRoot == null) {
                    try {
                        //cache_root = new File(cache_root, sub_file);
                        if (!cache_root.exists()) {
                            boolean bool = cache_root.mkdir();
                            if (!bool)
                                continue;
                        }
                        File main_file_cache = new File(cache_root, "main_file_cache.dat2");
                        if (!main_file_cache.exists())
                            continue;
                        mainFileCacheData = new FileOnDisk(main_file_cache, "rw", 104857600L);
                        mainFileCacheIndices = new FileOnDisk[indices_count];
                        for (int i = 0; i < indices_count; i++)
                            mainFileCacheIndices[i] = (new FileOnDisk(new File(cache_root, ("main_file_cache.idx" + i)), "rw", 1048576L));
                        mainFileCacheIndex = (new FileOnDisk(new File(cache_root, "main_file_cache.idx255"), "rw", 1048576L));
                        cacheRootCopy = cacheRoot = cache_root;
                    } catch (Exception exception) {
                        try {
                            mainFileCacheData.close();
                            for (int i_17_ = 0; i_17_ < indices_count; i_17_++)
                                mainFileCacheIndices[i_17_].close();
                            mainFileCacheIndex.close();
                        } catch (Exception exception_18_) {
                            /* empty */
                        }
                        cacheRootCopy = cacheRoot = null;
                        mainFileCacheIndices = null;
                        mainFileCacheData = mainFileCacheIndex = null;
                    }
                }
            } catch (Exception exception) {
                /* empty */
            }
            if (userIDFile != null && cacheRoot != null)
                return;
        }
        if (cacheRoot == null)
            throw new RuntimeException();
    }

    public final void method566(int i) {
        synchronized (this) {
            if (i != 0)
                method560(null, -14);
            aBoolean1055 = true;
            this.notifyAll();
        }
        try {
            cacheThread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (mainFileCacheData != null) {
            try {
                mainFileCacheData.close();
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (mainFileCacheIndex != null) {
            try {
                mainFileCacheIndex.close();
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (mainFileCacheIndices != null) {
            for (int i_19_ = 0; i_19_ < mainFileCacheIndices.length; i_19_++) {
                if (mainFileCacheIndices[i_19_] != null) {
                    try {
                        mainFileCacheIndices[i_19_].close();
                    } catch (java.io.IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
        if (userIDFile != null) {
            try {
                userIDFile.close();
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
    }

    public final Interface1 method567(int i) {
        if (i != 0)
            return null;
        return anInterface1_1050;
    }

    public final Class31 method568(boolean bool, String string) {
        if (bool != true)
            return null;
        return method556(12, string, 0, -124, 0);
    }

    public Signlink(boolean loadcache, Applet applet, int storeID, String cache_file, int cache_id) {
        // app:    SignLink(boolean true, Applet null, int 32, String runescape, int 27)
        // applet: SignLink(boolean false, Applet client[panel0,0,0,0x0,invalid,layout=java.awt.FlowLayout], int 33, String null, int 0)
        // System.out.println("SignLink(boolean "+signed+", Applet "+applet+", int "+i+", String "+string+", int "+i_20_+")");
        //xxx it's signed
        loadcache = true;
        cache_file = "runescape";
        storeID = 32;
        cache_id = 27;
        // xxx to here
        userIDFile = null;
        cacheRoot = null;
        aClass31_1048 = null;
        gameApplet = null;
        mainFileCacheData = null;
        aBoolean1055 = false;
        mainFileCacheIndex = null;
        javaVersion = "1.1";
        gameApplet = applet;
        javaVendor = "Unknown";
        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }
        try {
            operatingSystem = System.getProperty("os.name");
        } catch (Exception exception) {
            operatingSystem = "Unknown";
        }
        os_lower = operatingSystem.toLowerCase();
        try {
            os_architecture = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            os_architecture = "";
        }
        try {
            os_version = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            os_version = "";
        }
        try {
            homeDirectory = System.getProperty("user.home");
            if (homeDirectory != null)
                homeDirectory += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (homeDirectory == null)
            homeDirectory = "~/";
        try {
            eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }
        try {
            if (applet == null)
                setFocusTraversalKeysEnabled = (Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE}));
            else
                setFocusTraversalKeysEnabled = (applet.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[]{Boolean.TYPE}));
        } catch (Exception exception) {
            /* empty */
        }
        try {
            if (applet == null)
                setFocusCycleRoot = (Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[]{Boolean.TYPE}));
            else
                setFocusCycleRoot = applet.getClass().getMethod("setFocusCycleRoot", (new Class[]{Boolean.TYPE}));
        } catch (Exception exception) {
            /* empty */
        }
        if (loadcache)
            loadCache(storeID, cache_file, cache_id);
        aBoolean1055 = false;
        cacheThread = new Thread(this);
        cacheThread.setPriority(10);
        cacheThread.setDaemon(true);
        cacheThread.start();
    }
}
