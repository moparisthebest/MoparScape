/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class GameApplet extends Applet implements Runnable, FocusListener, WindowListener
{
    static int anInt1;
    static int anInt2;
    static int anInt3;
    static int anInt4;
    static int anInt5;
    private boolean fatalError = false;
    static int anInt7;
    static int anInt8;
    static int anInt9;
    static int anInt10;
    static int anInt11;
    static int anInt12;
    static int anInt13;
    static int anInt14;
    static int anInt15;
    static int anInt16;
    private static MutableString aClass100_17 = (Class112.makeMutableString(43, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729"));
    static int anInt18;
    static int anInt19;
    static int anInt20;
    static int getAppletContextCounter;
    static int anInt22;
    static int anInt23;
    static int numParamsCounter;
    static int anInt25;
    static int anInt26;
    static int anInt27;
    static int numPaints;
    static int anInt29;
    static int anInt30;
    static MutableString aClass100_31;
    static int anInt32;
    static MutableString aClass100_33 = (Class112.makeMutableString(43, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0"));
    static int anInt34;
    static int anInt35;
    static MutableString aClass100_36 = Class112.makeMutableString(43, "titlebg");
    static int anInt37;
    static int anInt38;
    static int anInt39;
    static int anInt40;
    static int anInt41;
    public static boolean aBoolean42;
    public static boolean aBoolean43;
    public static boolean aBoolean44;

    abstract void method15(byte i);

    public final synchronized void paint(Graphics graphics)
    {
        do
        {
            try
            {
                anInt12++;
                if (this == Object5.anApplet_Sub1_1241 && !PlayerDefinition.aBoolean2187)
                {
                    Class103.hasFocus = true;
                    if (Signlink.javaVersion == null || !Signlink.javaVersion.startsWith("1.5") || (Class36.method438(17161) - Class15.aLong248 <= 1000L))
                        break;
                    Rectangle rectangle = graphics.getClipBounds();
                    if (rectangle == null || (rectangle.width >= Class68_Sub20_Sub17.appletWidth && rectangle.height >= Class21.appletHeight))
                        Class68_Sub13_Sub21.aBoolean3798 = true;
                }
            } catch (RuntimeException runtimeexception)
            {
                throw Class107.getException(runtimeexception, "ra.paint(" + (graphics != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    public final void focusLost(FocusEvent focusevent)
    {
        try
        {
            Object5.hasFocus = false;
            anInt15++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ra.focusLost(" + (focusevent != null ? "{...}" : "null") + ')');
        }
    }

    public final void windowDeactivated(WindowEvent windowevent)
    {
        try
        {
            anInt32++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ra.windowDeactivated(" + (windowevent != null ? "{...}" : "null") + ')'));
        }
    }

    public final void windowClosed(WindowEvent windowevent)
    {
        try
        {
            anInt9++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ra.windowClosed(" + (windowevent != null ? "{...}" : "null") + ')');
        }
    }

    public final void run()
    {
        anInt30++;
        try
        {
            if (Signlink.javaVendor != null)
            {
                String string = Signlink.javaVendor.toLowerCase();
                if (string.indexOf("sun") == -1 && string.indexOf("apple") == -1)
                {
                    if (string.indexOf("ibm") != -1 && (Signlink.javaVersion == null || Signlink.javaVersion.equals("1.4.2")))
                    {
                        error_fatal("wrongjava");
                        return;
                    }
                } else
                {
                    String string_0_ = Signlink.javaVersion;
                    if (string_0_.equals("1.1") || string_0_.startsWith("1.1.") || string_0_.equals("1.2") || string_0_.startsWith("1.2."))
                    {
                        error_fatal("wrongjava");
                        return;
                    }
                    Class109.anInt1841 = 5;
                }
            }
            if (Class75_Sub1_Sub1.signlink.gameApplet != null)
            {
                Method method = Signlink.setFocusCycleRoot;
                if (method != null)
                {
                    try
                    {
                        method.invoke((Class75_Sub1_Sub1.signlink.gameApplet), new Object[] { Boolean.TRUE });
                    } catch (Throwable throwable)
                    {
                        /* empty */
                    }
                }
            }
            method31((byte) -104);
            Class1_Sub5.aClass72_2498 = Class28.method396(Mouse.gameCanvas, Class13_Sub3.appletWidth, Class68_Sub13_Sub9.appletHeight, -115);
            method27(-1);
            Class68_Sub20_Sub13.aClass50_4366 = Class72.method1361(-86);
            while (NodeList.aLong277 == 0L || Class36.method438(17161) < NodeList.aLong277)
            {
                Class68_Sub13_Sub22.anInt3812 = (Class68_Sub20_Sub13.aClass50_4366.method532(Class109.anInt1841, -19, Object2.anInt1345));
                for (int i = 0; i < Class68_Sub13_Sub22.anInt3812; i++)
                    method30((byte) -71);
                method25(-16633);
                GameCanvas.method46(Class75_Sub1_Sub1.signlink, Mouse.gameCanvas, (byte) -108);
            }
        } catch (Exception exception)
        {
            Class71.method1339(null, exception, 38);
            error_fatal("crash");
        }
        shutdown(true);
    }

    final void error_fatal(String error)
    {
        try
        {
            anInt20++;
            if (!fatalError)
            {
                fatalError = true;
                System.out.println("error_game_" + error);
                try
                {
                    getAppletContext().showDocument(new URL(getCodeBase(), ("error_game_" + error + ".ws")), "_top");
                } catch (Exception exception)
                {
                    /* empty */
                }
            }
        } catch (RuntimeException e)
        {
            throw Class107.getException(e, ("ra.CA(" + (error != null ? "{...}" : "null") + ')'));
        }
    }

    public final void windowOpened(WindowEvent windowevent)
    {
    }

    static final boolean method17(byte i, int i_1_)
    {
        anInt39++;
        if (i_1_ < 0)
            return false;
        if (i > -120)
            return false;
        int i_2_ = Class68_Sub28_Sub1.menuActionIDs[i_1_];
        if (i_2_ >= 2000)
            i_2_ -= 2000;
        if (i_2_ == 1007)
            return true;
        return false;
    }

    static final ItemDefinition method18(int i, int i_3_)
    {
        if (i != -25672)
            aClass100_33 = null;
        anInt3++;
        ItemDefinition class19 = ((ItemDefinition) Class75_Sub1.itemDefinitionNodes.getNodeForID((long) i_3_));
        if (class19 != null)
            return class19;
        byte[] is = Mouse.aClass21_1568.method338(Class68_Sub20_Sub16.method1176(i_3_, 255), i + 25672, Class15.method273(i_3_, (byte) 117));
        class19 = new ItemDefinition();
        ((ItemDefinition) class19).id = i_3_;
        if (is != null)
            class19.method309((byte) -7, new Stream(is));
        class19.method307(i ^ ~0x6446);
        if (((ItemDefinition) class19).certTemplateID != -1)
            class19.method306((byte) -106, method18(-25672, ((ItemDefinition) class19).anInt378), method18(i, ((ItemDefinition) class19).certTemplateID));
        if (((ItemDefinition) class19).anInt339 != -1)
            class19.method311(method18(-25672, ((ItemDefinition) class19).anInt339), i ^ 0x6476, method18(-25672, ((ItemDefinition) class19).anInt345));
        if (!NodeList.aBoolean272 && ((ItemDefinition) class19).membersObject)
        {
            ((ItemDefinition) class19).groundActions = null;
            ((ItemDefinition) class19).name = Object4.aClass100_1081;
            ((ItemDefinition) class19).team = 0;
            ((ItemDefinition) class19).aBoolean366 = false;
            ((ItemDefinition) class19).actions = null;
        }
        Class75_Sub1.itemDefinitionNodes.addObject(class19, (long) i_3_);
        return class19;
    }

    final void method19(int i, int i_4_, int i_5_, int i_6_, int i_7_)
    {
        anInt29++;
        try
        {
            if (Object5.anApplet_Sub1_1241 != null)
            {
                Class68_Sub20_Sub7.anInt4257++;
                if (Class68_Sub20_Sub7.anInt4257 >= 3)
                    error_fatal("alreadyloaded");
                else
                    getAppletContext().showDocument(getDocumentBase(), "_self");
            } else
            {
                Class52.anInt1013 = 0;
                Object5.anApplet_Sub1_1241 = this;
                Class68_Sub13_Sub25.anInt3860 = 0;
                Class92.clientVersion = i_7_;
                Class68_Sub20_Sub17.appletWidth = Class13_Sub3.appletWidth = i_6_;
                Class21.appletHeight = Class68_Sub13_Sub9.appletHeight = i_5_;
                String string = getParameter("openwinjs");
                if (string != null && string.equals("1"))
                {
                    /* empty */
                }
                if (i < -1)
                {
                    if (Class75_Sub1_Sub1.signlink == null)
                        Class85.signlink = Class75_Sub1_Sub1.signlink = new Signlink(false, this, i_4_, null, 0);
                    Class75_Sub1_Sub1.signlink.method558((byte) -95, 1, this);
                }
            }
        } catch (Exception exception)
        {
            Class71.method1339(null, exception, 38);
            error_fatal("crash");
        }
    }

    public final void stop()
    {
        anInt10++;
        if (this == Object5.anApplet_Sub1_1241 && !PlayerDefinition.aBoolean2187)
            NodeList.aLong277 = Class36.method438(17161) + 4000L;
    }

    private final void shutdown(boolean clean)
    {
        anInt11++;
        synchronized (this)
        {
            if (PlayerDefinition.aBoolean2187)
                return;
            PlayerDefinition.aBoolean2187 = true;
        }
        if (Class75_Sub1_Sub1.signlink.gameApplet != null)
            Class75_Sub1_Sub1.signlink.gameApplet.destroy();
        try
        {
            method29(-121);
        } catch (Exception exception)
        {
            /* empty */
        }
        if (Mouse.gameCanvas != null)
        {
            try
            {
                Mouse.gameCanvas.removeFocusListener(this);
                Mouse.gameCanvas.getParent().remove(Mouse.gameCanvas);
            } catch (Exception exception)
            {
                /* empty */
            }
        }
        if (Class75_Sub1_Sub1.signlink != null)
        {
            try
            {
                Class75_Sub1_Sub1.signlink.method566(0);
            } catch (Exception exception)
            {
                /* empty */
            }
        }
        method23(-61);
        if (Class108.gameFrame != null)
        {
            try
            {
                System.exit(0);
            } catch (Throwable throwable)
            {
                /* empty */
            }
        }
        System.out.println("Shutdown complete - clean:" + clean);
    }

    final void ShowFrame(int width, int height, int i_10_, String string, int version, int i_12_)
    {
        Class68_Sub13_Sub25.anInt3860 = 0;
        Class52.anInt1013 = 0;
        Class68_Sub20_Sub17.appletWidth = Class13_Sub3.appletWidth = width;
        Object5.anApplet_Sub1_1241 = this;
        Class92.clientVersion = version;
        Class21.appletHeight = Class68_Sub13_Sub9.appletHeight = height;
        Class108.gameFrame = new Frame();
        Class108.gameFrame.setTitle("Jagex");
        Class108.gameFrame.setResizable(true);
        Class108.gameFrame.addWindowListener(this);
        Class108.gameFrame.setVisible(true);
        Class108.gameFrame.toFront();
        Insets insets = Class108.gameFrame.getInsets();
        Class108.gameFrame.setSize(insets.left + (Class68_Sub20_Sub17.appletWidth + insets.right), Class21.appletHeight + insets.top + insets.bottom);
        Class85.signlink = Class75_Sub1_Sub1.signlink = new Signlink(true, null, i_12_, string, i_10_);
        Class75_Sub1_Sub1.signlink.method558((byte) -36, 1, this);
    }

    public final void windowDeiconified(WindowEvent windowevent)
    {
    }

    public final URL getDocumentBase()
    {
        anInt14++;
        if (Class108.gameFrame != null)
            return null;
        if (Class75_Sub1_Sub1.signlink != null && this != Class75_Sub1_Sub1.signlink.gameApplet)
            return Class75_Sub1_Sub1.signlink.gameApplet.getDocumentBase();
        return super.getDocumentBase();
    }

    public static void method22(byte i)
    {
        aClass100_17 = null;
        aClass100_31 = null;
        aClass100_36 = null;
        aClass100_33 = null;
    }

    public abstract void init();

    abstract void method23(int i);

    public static final void provideSignlink(Signlink signlink)
    {
        try
        {
            anInt8++;
            Class85.signlink = Class75_Sub1_Sub1.signlink = signlink;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ra.providesignlink(" + (signlink != null ? "{...}" : "null") + ')'));
        }
    }

    private final void method25(int i)
    {
        anInt26++;
        long l = Class36.method438(17161);
        long l_14_ = Mouse.aLongArray1577[Class68_Sub20_Sub5.anInt4229];
        if (i != -16633)
            provideSignlink(null);
        Mouse.aLongArray1577[Class68_Sub20_Sub5.anInt4229] = l;
        if (l_14_ != 0L && l > l_14_)
        {
            int i_15_ = (int) (-l_14_ + l);
            Class34.anInt597 = ((i_15_ >> 1) + 32000) / i_15_;
        }
        Class68_Sub20_Sub5.anInt4229 = Class68_Sub20_Sub5.anInt4229 + 1 & 0x1f;
        do
        {
            if (Class85.anInt1551++ > 50)
            {
                Class103.hasFocus = true;
                Class85.anInt1551 -= 50;
                Mouse.gameCanvas.setSize(Class13_Sub3.appletWidth, Class68_Sub13_Sub9.appletHeight);
                Mouse.gameCanvas.setVisible(true);
                if (Class108.gameFrame == null || Item.aFrame2431 != null)
                {
                    Mouse.gameCanvas.setLocation(Class52.anInt1013, (Class68_Sub13_Sub25.anInt3860));
                    if (client.anInt2387 == 0)
                        break;
                }
                Insets insets = Class108.gameFrame.getInsets();
                Mouse.gameCanvas.setLocation((insets.left + Class52.anInt1013), (Class68_Sub13_Sub25.anInt3860 + insets.top));
            }
        } while (false);
        method15((byte) -75);
    }

    public final void windowActivated(WindowEvent windowevent)
    {
    }

    final boolean checkHost(byte i)
    {
        //xxx just return true here
        if (true)
            return true;
        String string = getDocumentBase().getHost().toLowerCase();
        anInt35++;
        if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
            return true;
        if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
            return true;
        if (string.endsWith("127.0.0.1"))
            return true;
        for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1))
        {
            /* empty */
        }
        if (string.endsWith("192.168.1."))
            return true;
        error_fatal("invalidhost");
        return false;
    }

    abstract void method27(int i);

    static final void method28(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_)
    {
        anInt18++;
        if (i_20_ != 1000)
            anInt7 = -56;
        if (GroundData.anInt677 <= i_22_ && NodeCache.anInt1920 >= i_19_ && Class35.anInt605 <= i_23_ && Class51.anInt2257 >= i_17_)
            Class72.method1353(i_18_, i_22_, i_17_, i_21_, i_23_, i_19_, i, i_20_ - 18229);
        else
            Class7.method199(i_18_, i_23_, i_19_, i, i_21_, i_17_, false, i_22_);
    }

    public final URL getCodeBase()
    {
        anInt19++;
        if (Class108.gameFrame != null)
            return null;
        if (Class75_Sub1_Sub1.signlink != null && Class75_Sub1_Sub1.signlink.gameApplet != this)
            return Class75_Sub1_Sub1.signlink.gameApplet.getCodeBase();
        return super.getCodeBase();
    }

    abstract void method29(int i);

    private final void method30(byte i)
    {
        long l = Class36.method438(17161);
        anInt1++;
        long l_24_ = Class122.aLongArray2115[Class14.anInt225];
        Class122.aLongArray2115[Class14.anInt225] = l;
        Class14.anInt225 = Class14.anInt225 + 1 & 0x1f;
        synchronized (this)
        {
            if (i > -60)
                destroy();
            Class15.aBoolean250 = Object5.hasFocus;
        }
        method33(2);
        if (l_24_ != 0L && l_24_ < l)
        {
            /* empty */
        }
    }

    public final void windowIconified(WindowEvent windowevent)
    {
    }

    public final void update(Graphics graphics)
    {
        try
        {
            paint(graphics);
            numPaints++;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ra.update(" + (graphics != null ? "{...}" : "null") + ')'));
        }
    }

    public final void focusGained(FocusEvent focusevent)
    {
        Object5.hasFocus = true;
        Class103.hasFocus = true;
    }

    public final String getParameter(String string)
    {
        try
        {
            numParamsCounter++;
            if (Class108.gameFrame != null)
                return null;
            if (Class75_Sub1_Sub1.signlink != null && this != Class75_Sub1_Sub1.signlink.gameApplet)
                return Class75_Sub1_Sub1.signlink.gameApplet.getParameter(string);
            return super.getParameter(string);
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ra.getParameter(" + (string != null ? "{...}" : "null") + ')'));
        }
    }

    final synchronized void method31(byte i)
    {
        if (Mouse.gameCanvas != null)
        {
            Mouse.gameCanvas.removeFocusListener(this);
            Mouse.gameCanvas.getParent().remove(Mouse.gameCanvas);
        }
        int i_25_ = 42 / ((32 - i) / 53);
        Container container;
        if (Item.aFrame2431 == null)
        {
            if (Class108.gameFrame != null)
                container = Class108.gameFrame;
            else
                container = Class75_Sub1_Sub1.signlink.gameApplet;
        } else
            container = Item.aFrame2431;
        anInt23++;
        container.setLayout(null);
        Mouse.gameCanvas = new GameCanvas(this);
        container.add(Mouse.gameCanvas);
        Mouse.gameCanvas.setSize(Class13_Sub3.appletWidth, Class68_Sub13_Sub9.appletHeight);
        Mouse.gameCanvas.setVisible(true);
        if (Class108.gameFrame != container)
            Mouse.gameCanvas.setLocation(Class52.anInt1013, Class68_Sub13_Sub25.anInt3860);
        else
        {
            Insets insets = Class108.gameFrame.getInsets();
            Mouse.gameCanvas.setLocation(insets.left + Class52.anInt1013, (Class68_Sub13_Sub25.anInt3860 + insets.top));
        }
        Mouse.gameCanvas.addFocusListener(this);
        Mouse.gameCanvas.requestFocus();
        Object5.hasFocus = true;
        Class15.aBoolean250 = true;
        Class103.hasFocus = true;
        Class68_Sub13_Sub21.aBoolean3798 = false;
        Class15.aLong248 = Class36.method438(17161);
    }

    static final int method32(Player aPlayer, int i)
    {
        try
        {
            anInt38++;
            if (i != -6694)
                provideSignlink(null);
            int i_26_ = ((Player) aPlayer).anInt3423;
            if (((Character) aPlayer).anInt2526 != ((Character) aPlayer).anInt2532)
            {
                if (((Character) aPlayer).anInt2526 == ((Character) aPlayer).anInt2542)
                    i_26_ = ((Player) aPlayer).anInt3411;
            } else
                i_26_ = ((Player) aPlayer).anInt3404;
            return i_26_;
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, "ra.BA(" + (aPlayer != null ? "{...}" : "null") + ',' + i + ')');
        }
    }

    public final void start()
    {
        anInt13++;
        if (Object5.anApplet_Sub1_1241 == this && !PlayerDefinition.aBoolean2187)
            NodeList.aLong277 = 0L;
    }

    abstract void method33(int i);

    public final void windowClosing(WindowEvent windowevent)
    {
        try
        {
            anInt34++;
            destroy();
        } catch (RuntimeException runtimeexception)
        {
            throw Class107.getException(runtimeexception, ("ra.windowClosing(" + (windowevent != null ? "{...}" : "null") + ')'));
        }
    }

    public final AppletContext getAppletContext()
    {
        getAppletContextCounter++;
        if (Class108.gameFrame != null)
            return null;
        if (Class75_Sub1_Sub1.signlink != null && this != Class75_Sub1_Sub1.signlink.gameApplet)
            return Class75_Sub1_Sub1.signlink.gameApplet.getAppletContext();
        return super.getAppletContext();
    }

    public final void destroy()
    {
        anInt27++;
        if (Object5.anApplet_Sub1_1241 == this && !PlayerDefinition.aBoolean2187)
        {
            NodeList.aLong277 = Class36.method438(17161);
            Class50.method528(-5, 5000L);
            Class85.signlink = null;
            shutdown(false);
        }
    }

    static
    {
        aClass100_31 = aClass100_17;
    }
}
