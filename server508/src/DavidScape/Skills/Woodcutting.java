package DavidScape.Skills;

import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;

public class Woodcutting {
    public Player p;

    public int anim;

    public int speed;

    public int time;

    public int amount;

    public int objid;

    public int treeid;

    public int logTimer = -1;

    public int secondtimer = 2;

    public int logs = 0;

    public int maxlogs = 0;

    public boolean chopping = false;

    public Woodcutting(Player p2) {
        p = p2;
    }

    public void startCutting(int objectid) {
        if (getPlayerAxe() == -1) {
            p.frames.sendMessage(p, "You don't have an axe wich you have the woodcutting level to use.");
            return;
        }


        objid = objectid;
        treeid = getTreeIDForObject(objid);
        if (getLevelForTree(treeid) > getWoodcuttingLevel()) {
            p.frames.sendMessage(p, "You need level " + getLevelForTree(treeid) + " to chop down this tree");
            return;
        }
        p.frames.sendMessage(p, "You swing your axe at the tree");
        maxlogs = getMaxAmountOfLogs(treeid);
        if (maxlogs == 0) maxlogs = 1;
        //p.frames.sendMessage(p, "You will get " + maxlogs + " logs from this tree");
        setAnimAndSpeed(treeid, getPlayerAxe(), getWoodcuttingLevel());
        logTimer = time;
        p.requestAnim(anim, 0);
        chopping = true;
    }

    public void process() {
        if (chopping) {
            secondtimer--;
            if (secondtimer == 0) {
                secondtimer = 2;
                logTimer--;
                p.requestAnim(anim, 0);
            }
            if (logTimer == 0) {
                logTimer = time;
                logs++;
                doLog();
            }
        }
    }

    public void resetWoodcutting() {
        logTimer = -1;
        chopping = false;
    }

    public void doLog() {
        PlayerItems pit = new PlayerItems();
        if (pit.freeSlotCount(p) < 1) {
            resetWoodcutting();
            p.frames.sendMessage(p, "Not enough invintory space to cut any more logs!");
        }
        if (pit.freeSlotCount(p) > 0) {
            p.frames.sendMessage(p, "You cut some logs.");
            giveItem(getLogsForTree(treeid));
            giveWoodcuttingXP(getXpForLog(treeid) * p.skillLvl[8]);
            p.requestAnim(anim, 0);

        }
        pit = null;
    }

    public int getWoodcuttingLevel() {
        return p.skillLvl[8];
    }

    public void giveWoodcuttingXP(int xp) {
        p.addSkillXP(xp / 3, 8);
    }

    public boolean hasItem(int id) {
        PlayerItems pi = new PlayerItems();
        return pi.invItemCount(p, id) > 0;
    }

    public void giveItem(int id) {
        PlayerItems pi = new PlayerItems();
        pi.addItem(p, id, 1);
        pi = null;
    }

    public int getPlayerAxe() {
        if (hasItem(1351)) return 1351;
        if (hasItem(1349)) return 1349;
        if (hasItem(1353)) return 1353;
        if (hasItem(1361)) return 1361;
        if (hasItem(1355)) return 1355;
        if (hasItem(1357)) return 1357;
        if (hasItem(1359)) return 1359;
        if (hasItem(6739)) return 6739;
        if (p.equipment[3] == 1351) return 1351;
        if (p.equipment[3] == 1349) return 1349;
        if (p.equipment[3] == 1353) return 1353;
        if (p.equipment[3] == 1361) return 1361;
        if (p.equipment[3] == 1355) return 1355;
        if (p.equipment[3] == 1357) return 1357;
        if (p.equipment[3] == 1359) return 1359;
        if (p.equipment[3] == 6739) return 6739;
        return -1;
    }

    public int getTreeIDForObject(int tree) {
        switch (tree) {
            case 1277:
            case 1278:
            case 1276://Normal Trees:Tree,Dead tree, Evergreen
                return 1;

            case 1281://Oak
                return 2;

            case 1308://Willow
                return 3;

            case 9036://Teak
                return 4;

            case 1307://Maple
                return 5;

            case 9034://Mahogany
                return 6;

            case 1309://Yew
                return 7;

            case 1306://Magic
                return 8;

        }
        return -1;
    }

    public int getLogsForTree(int tree) {
        switch (tree) {
            case 1://Normal Trees:Tree,Dead tree, Evergreen
                return 1511;

            case 2://Oak
                return 1521;

            case 3://Willow
                return 1519;

            case 4://Teak
                return 6333;

            case 5://Maple
                return 1517;

            case 6://Mahogany
                return 6332;

            case 7://Yew
                return 1515;

            case 8://Magic
                return 1513;

        }
        return -1;
    }

    public int getMaxAmountOfLogs(int tree) {
        switch (tree) {
            case 1://Normal Trees:Tree,Dead tree, Evergreen
                return 1;

            case 2://Oak
                return 2;

            case 3://Willow
                return 3;

            case 4://Teak
                return 4;

            case 5://Maple
                return 5;

            case 6://Mahogany
                return 5;

            case 7://Yew
                return 4;

            case 8://Magic
                return 8;

        }
        return -1;
    }

    public int getXpForLog(int tree) {
        switch (tree) {
            case 1://Normal Trees:Tree,Dead tree, Evergreen
                return 50;

            case 2://Oak
                return 75;

            case 3://Willow
                return 100;

            case 4://Teak
                return 150;

            case 5://Maple
                return 175;

            case 6://Mahogany
                return 250;

            case 7://Yew
                return 300;

            case 8://Magic
                return 500;

        }
        return -1;
    }

    public int getLevelForTree(int tree) {
        switch (tree) {
            case 1://Normal Trees:Tree,Dead tree, Evergreen
                return 1;

            case 2://Oak
                return 15;

            case 3://Willow
                return 30;

            case 4://Teak
                return 35;

            case 5://Maple
                return 45;

            case 6://Mahogany
                return 50;

            case 7://Yew
                return 60;

            case 8://Magic
                return 75;

        }
        return -1;
    }

    public int getLevelForAxe(int axe) {
        switch (axe) {
            case 1351://Bronze Axe
                return 0;

            case 1349://Iron Axe
                return 0;

            case 1353://Steel Axe
                return 5;

            case 1361://Black Axe
                return 10;

            case 1355://Mithril Axe
                return 21;

            case 1357://Adamant Axe
                return 31;

            case 1359://Rune Axe
                return 41;

            case 6739://Dragon Axe
                return 61;

        }
        return -1;
    }

    public void setAnimAndSpeed(int tree, int axe, int level) {
        switch (axe) {
            case 1351://Bronze Axe
                anim = 879;
                speed = 1;
                break;
            case 1349://Iron Axe
                anim = 877;
                speed = 2;
                break;
            case 1353://Steel Axe
                anim = 875;
                speed = 5;
                break;
            case 1361://Black Axe
                anim = 873;
                speed = 7;
                break;
            case 1355://Mithril Axe
                anim = 871;
                speed = 13;
                break;
            case 1357://Adamant Axe
                anim = 869;
                speed = 20;
                break;
            case 1359://Rune Axe
                anim = 867;
                speed = 100;
                break;
            case 6739://Dragon Axe
                anim = 2846;
                speed = 35;
                break;
        }
        speed = (speed - (speed * 2)) / 10;
        time = 4;
        if (time < 0) time = 1;
        if (time == 1) anim++;
    }
}