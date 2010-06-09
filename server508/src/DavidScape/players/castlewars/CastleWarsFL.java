package DavidScape.players.castlewars;

import DavidScape.players.Player;

public class CastleWarsFL {


    public void IncreaseFLZam(Player p, int IncreasedBy) {
        p.ZamFL += IncreasedBy;
        p.frames.setString(p, p.ZamFL + "", 59, 0);
    }

    public void IncreaseFLSara(Player p, int IncreasedBy) {
        p.SaraFL += IncreasedBy;
        p.frames.setString(p, p.SaraFL + "", 59, 1);
    }


}