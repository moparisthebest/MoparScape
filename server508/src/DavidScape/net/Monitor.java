package DavidScape.net;

import DavidScape.Engine;

public class Monitor implements Runnable {
    /* Varibles */
    public static final boolean restart = true;
    public static final int timer = 60;

    public void Restarter() {
        if (Engine.getPlayerCount() == 0) {
            //new Thread(this)).start();
        }
    }

    public void run() {
        try {

            Thread.sleep(timer * 300);
        } catch (Exception e) {
        }
        System.out.println("[SERVER] Server restarted.");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        try {
            Thread.sleep(200);
        } catch (Exception e) {
        }
        System.exit(0);

    }
}