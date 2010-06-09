package DavidScape.players;


import DavidScape.Engine;


public class PlayerSave implements Runnable {

    /**
     * Class thread.
     */
    private Thread saveThread;

    /**
     * True to run the charater saver.
     */
    private boolean saveRunning = true;

    /**
     * Constructs a new PlayerSave class.
     */
    public PlayerSave() {
        saveThread = new Thread(this);
        saveThread.start();
    }

    /**
     * Save character files every 10 seconds or so.
     */
    public void run() {
        while (saveRunning) {
            for (Player p : Engine.players) {
                if (p == null) {
                    continue;
                }
                try {
                    if (p == null || !p.online) {
                        continue;
                    }
                    Engine.fileManager.saveCharacter(p);

                } catch (Exception e) {
                }
            }
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
            }
        }
    }
}
