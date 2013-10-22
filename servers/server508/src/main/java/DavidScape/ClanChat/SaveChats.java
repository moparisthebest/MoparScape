package DavidScape.ClanChat;

public class SaveChats implements Runnable {

    private boolean bool = true;
    public ClanMain ClanMain = new ClanMain();

    public SaveChats() {
        Thread save = new Thread(this);
        save.start();
    }

    public void run() {
        while (bool) {
            try {
                ClanMain.saveChats();
                Thread.sleep(60000);
            } catch (Exception e) {
            }
        }
    }

}