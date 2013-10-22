package mudclient;

import java.awt.Component;

public final class GameImageMiddleMan extends GameImage {

    public GameImageMiddleMan(int i, int l, int i1, Component c) {
        super(i, l, i1, c);
    }

    public final void drawVisibleEntity(int i, int l, int i1, int j1, int k1, int l1, int i2) {
        if(k1 >= 50000) {
            gameReference.drawTeleBubble(i, l, i1, j1, k1 - 50000, l1, i2);
            return;
        }
        if(k1 >= 40000) {
            gameReference.drawItem(i, l, i1, j1, k1 - 40000, l1, i2);
            return;
        }
        if(k1 >= 20000) {
            gameReference.drawNPC(i, l, i1, j1, k1 - 20000, l1, i2);
            return;
        }
        if(k1 >= 5000) {
            gameReference.drawPlayer(i, l, i1, j1, k1 - 5000, l1, i2);
            return;
        } else {
            super.ccc(i, l, i1, j1, k1);
            return;
        }
    }

    public mudclient gameReference;
}
