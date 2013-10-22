package DavidScape.Skills;

import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;

public class Fishing {
    public Player p;

    public void FishthatFish(int FishType) {
        p.frames.removeShownInterface(p);
        p.frames.removeChatboxInterface(p);
        if (p.Fishing == true && p.FishTimer == 0) {

            if (p.NetType == 1) p.requestAnim(620, 0);
            if (p.NetType == 2) p.requestAnim(622, 0);
            if (p.NetType == 3) p.requestAnim(619, 0);
            if (p.NetType == 4) p.requestAnim(618, 0);

            if (p.NetType == 2) {
                if (p.Bait == true && Engine.playerItems.HasItemAmount(p, 313, 1) == true) {
                    Engine.playerItems.deleteItem(p, 313, Engine.playerItems.getItemSlot(p, 313), 1);
                    Engine.playerItems.addItem(p, FishType, 1);
                    p.frames.sendMessage(p, "You catch a fish.");
                } else {
                    p.Fishing = false;
                    p.NetType = 0;
                    p.Bait = false;
                    p.frames.sendMessage(p, "You need more fishing bait!");
                }
            } else {
                Engine.playerItems.addItem(p, FishType, 1);
                p.frames.sendMessage(p, "You catch a fish.");
            }
            p.addSkillXP(p.FishXP * p.skillLvl[10] / 3, 10);
            p.FishTimer = 4 + Misc.random(6);
        }
    }


    public void process() {
        if (p.FishTimer > 0) p.FishTimer -= 1;
        if (p.FishTimer == 0 && p.Fishing == true) FishthatFish(p.FishMan);
    }


}
