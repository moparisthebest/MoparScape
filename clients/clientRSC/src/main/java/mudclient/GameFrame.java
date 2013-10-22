package mudclient;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings({ "deprecation", "serial" })
public class GameFrame extends Frame implements WindowListener {

    public GameFrame(GameApplet arg0, int width, int height, String title, boolean resizable, boolean translate) {
        yOffset = 28;
        frameWidth = width;
        frameHeight = height;
        gameApplet = arg0;
        if(translate)
            yOffset = 48;
        else
            yOffset = 28;
        gameApplet.mouseYOffset = 24;
        setTitle(title);
        setResizable(resizable);
        show();
        toFront();
        resize(frameWidth, frameHeight);
        
        addWindowListener(this);
    }

    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        if(fej == 0)
            g.translate(0, 24);
        else
            g.translate(-5, 0);
        return g;
    }

    public void resize(int i, int j) {
        super.resize(i, j + yOffset);
    }

    public final void paint(Graphics g) {
        gameApplet.paint(g);
    }

    public void windowClosed(WindowEvent evt) {
        if(gameApplet.runStatus != -1)
            gameApplet.destroy();
    }

    public void windowClosing(WindowEvent evt) {
        if(gameApplet.runStatus != -1)
            gameApplet.destroy();
    }

    public void windowActivated(WindowEvent evt) {
    }

    public void windowDeactivated(WindowEvent evt) {
    }

    public void windowDeiconified(WindowEvent evt) {
    }

    public void windowIconified(WindowEvent evt) {
    }

    public void windowOpened(WindowEvent evt) {
    }

    int frameWidth;
    int frameHeight;
    int fej;
    int yOffset;
    GameApplet gameApplet;
}
