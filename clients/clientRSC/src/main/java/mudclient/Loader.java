package mudclient;

import java.applet.Applet;
import java.awt.Graphics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@SuppressWarnings("serial")
public class Loader extends Applet implements Runnable {

    private mudclient client;
    private boolean running;
    private String files[];
    
    public void init() {
        running = false;
        files = new String[] {
                "config.jag", "entity.jag", "entity.mem", "filter.jag", "fonts.jag",
                "land.jag", "land.mem", "maps.jag", "maps.mem", "media.jag", "models.jag",
                "sounds.mem", "textures.jag"
        };
        new Thread(this).start();
        while(!running)
            try {
                Thread.sleep(100);
            } catch(Exception e) { }
        new Thread(this).start();
    }

    public void run() {
        if(running) {
            runGame();
            return;
        }
        running = true;
        try {
            link.gameApplet = this;
            link.currentFile = 0;
            for(int i = 0; i < files.length; i++) {
                byte bytes[] = load(files[i]);
                link.addFile(files[i], bytes);
            }
            client = new mudclient();
            client.init();
            client.start();
            this.addKeyListener(client);
            this.addMouseListener(client);
            this.addMouseMotionListener(client);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private byte[] load(String file) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte buffer[] = new byte[4096];
        int read = 0;
        try {
            InputStream in = getClass().getResourceAsStream("/" + file);
            while((read = in.read(buffer)) > 0) {
                baos.write(buffer, 0, read);
                buffer = new byte[4096];
            }
            in.close();
            baos.close();
            return baos.toByteArray();
        } catch(Exception e) { }
        baos.reset();
        buffer = new byte[4096];
        read = 0;
        try {
            InputStream in = new FileInputStream(new File(Config.CONF_DIR, file));
            while((read = in.read(buffer)) > 0) {
                baos.write(buffer, 0, read);
                buffer = new byte[4096];
            }
            in.close();
            baos.close();
            return baos.toByteArray();
        } catch(Exception e) { }
        baos.reset();
        buffer = new byte[4096];
        read = 0;
        try {
            InputStream in = (new URL(Config.CACHE_URL)).openStream();
            while((read = in.read(buffer)) > 0) {
                baos.write(buffer, 0, read);
                buffer = new byte[4096];
            }
            in.close();
            baos.close();
            return baos.toByteArray();
        } catch(Exception e) { }
        return null;
    }
    
    private void runGame() {
        while(true) {
            if(link.port != 0) {
                try {
                    Socket socket = new Socket(InetAddress.getByName(Config.SERVER_IP), link.port);
                    socket.setSoTimeout(30000);
                    socket.setTcpNoDelay(true);
                    link.socket = socket;
                } catch(Exception e) {
                    e.printStackTrace();
                    link.socket = null;
                }
                link.port = 0;
            }
            if(link.thread != null) {
                Thread thread = new Thread(link.thread);
                thread.setDaemon(true);
                thread.start();
                link.thread = null;
            }
            if(link.iplookup != null) {
                String s = "unknown";
                try {
                    s = InetAddress.getByName(link.iplookup).getHostName();
                } catch(Exception e) { }
                link.address = s;
                link.iplookup = null;
            }
            try {
                Thread.sleep(100);
            } catch(Exception e) { }
        }
    }
    
    public void update(Graphics g) {
        paint(g);
    }
    
    public void paint(Graphics g) {
        if(client != null)
            client.paint(g);
    }
    
    public void start() {
        if(client != null)
            client.start();
    }
    
    public void stop() {
        if(client != null)
            client.stop();
    }
    
    public void destroy() {
        if(client != null)
            client.destroy();
    }
}
