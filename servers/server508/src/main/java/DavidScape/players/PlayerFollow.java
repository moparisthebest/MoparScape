package DavidScape.players;

import DavidScape.Engine;

public class PlayerFollow {

    public void followPlayer(Player p) {

        if (p.followPlayer <= 0 || p.followPlayer >= Engine.players.length || Engine.players[p.followPlayer] == null || Engine.players[p.followPlayer].isDead) {
            resetFollow(p);
        }
        Player p2 = Engine.players[p.followPlayer];
        int n;
        n = p2.absY - p.absY; // This will get updated in process.
        if ((p2.absX - p.absX) <= (n * (-1)) && (p2.absX - p.absX) >= (n - 1)) {
            if (n < 0) {
                p.WalkingTo(p2.absX, p2.absY + 1);
            }
            if (n > 0) {
                p.WalkingTo(p2.absX, p2.absY - 1);
            }
        } else if ((p2.absX - p.absX) > 0) {
            p.WalkingTo(p2.absX - 1, p2.absY);
        } else if ((p2.absX - p.absX) < 0) {
            p.WalkingTo(p2.absX + 1, p2.absY);
        }

        if (((p2.absX - p.absX) == 0) && (n < 0)) {
            p.WalkingTo(p2.absX, p2.absY + 1);
        }
        if (((p2.absX - p.absX) == 0) && (n >= 0)) {
            p.WalkingTo(p2.absX, p2.absY - 1);
        }
        if (p2.absX - p.absX > 12 || p.absX - p2.absX > 12 || p2.absY - p.absY > 12 || p.absY - p2.absY > 12) {
            p.WalkingTo(p.absX, p.absY); //Reset walking if the other player is further then 12 squares (To prevent the following if p2 teleports away)
        }
        p.requestFaceTo(p.followPlayer + 32768);
    }

    public void resetFollow(Player p) {
        if (p == null) {
            return;
        }
        p.followingPlayer = false;
    }
}