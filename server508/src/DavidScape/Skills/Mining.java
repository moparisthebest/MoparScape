package DavidScape.Skills;

import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;

public class Mining {
    public Player p;

    public int anim;

    public int speed;

    public int time;

    public int amount;

    public int objid;

    public int rockid;

    public int oreTimer = -1;

    public int secondtimer = 2;

    public int ores = 0;

    public int maxores = 0;

    public boolean hacking = false;

    public Mining(Player p2) {
        p = p2;
    }

    public void startCutting(int objectid) {
        if (getPlayerPickaxe() == -1) {
            p.frames.sendMessage(p, "You don't have a pickaxe wich you have the Mining level to use.");
            return;
        }


        objid = objectid;
        rockid = getRockIDForObject(objid);
        if (getLevelForOre(rockid) > getMiningLevel()) {
            p.frames.sendMessage(p, "You need a mining level of " + getLevelForOre(rockid) + " to mine this ore.");
            return;
        }
        p.frames.sendMessage(p, "You swing your pickaxe at the rock.");
        //p.frames.sendMessage(p, "You will get " + maxores + " ores from this ore");
        setAnimAndSpeed(rockid, getPlayerPickaxe(), getMiningLevel());
        oreTimer = time;
        p.requestAnim(anim, 0);
        hacking = true;
    }

    public void process() {
        if (hacking) {
            secondtimer--;
            if (secondtimer == 0) {
                secondtimer = 2;
                oreTimer--;
                p.requestAnim(anim, 0);
            }
            if (oreTimer == 0) {
                oreTimer = time;
                ores++;
                doOre();
            }
        }
    }

    public void resetMining() {
        oreTimer = -1;
        hacking = false;
    }

    public void doOre() {
        PlayerItems pit = new PlayerItems();
        if (pit.freeSlotCount(p) < 1) {
            resetMining();
            p.frames.sendMessage(p, "Not enough invintory space to mine any more ore!");
        }
        if (pit.freeSlotCount(p) > 0) {
            p.frames.sendMessage(p, "You get some ore.");
            giveItem(getOreForRock(rockid));
            giveMiningXP((getXpForOre(rockid) * p.skillLvl[14]) / 3);
            p.requestAnim(anim, 0);
        }
    }

    public int getMiningLevel() {
        return p.skillLvl[14];
    }

    public void giveMiningXP(int xp) {
        p.addSkillXP(xp / 3, 14);
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

    public int getPlayerPickaxe() {
        if (hasItem(1265)) return 1265;
        if (hasItem(1267)) return 1267;
        if (hasItem(1269)) return 1269;
        if (hasItem(1271)) return 1271;
        if (hasItem(1273)) return 1273;
        if (hasItem(1275)) return 1275;
        if (p.equipment[3] == 1265) return 1265;
        if (p.equipment[3] == 1267) return 1267;
        if (p.equipment[3] == 1269) return 1269;
        if (p.equipment[3] == 1271) return 1271;
        if (p.equipment[3] == 1273) return 1273;
        if (p.equipment[3] == 1275) return 1275;
        return -1;
    }

    public int getRockIDForObject(int ore) {
        switch (ore) {
            case 2110:
            case 2090:
            case 11189:
            case 11190:
            case 11191:
            case 2091://Copper
                return 1;
            case 2094:
            case 11186:
            case 11187:
            case 11188:
            case 2095://Tin
                return 2;
            case 2092:
            case 2093:// Iron
                return 3;
            case 2100:
            case 2101://Silver
                return 4;
            case 11183:
            case 11184:
            case 11185:
            case 2098:
            case 2099://Gold
                return 6;
            case 2096:
            case 2097://Coal
                return 5;
            case 2102:
            case 2103://Mithril
                return 7;
            case 2104:
            case 2105://Adamantite
                return 8;
            case 2106:
            case 2107://Rune
                return 9;
            case 4028:
            case 4029:
            case 4030://Limestone
                return 10;
            case 6669:
            case 6670:
            case 6671://Elemental
                return 11;
            case 16687:
                return 12;


        }
        return -1;
    }

    public int getOreForRock(int Ore) {
        switch (Ore) {
            case 1://Copper
                return 436;

            case 2://Tin
                return 438;

            case 3://Iron
                return 440;

            case 4://Silver
                return 442;

            case 5://Coal
                return 453;

            case 6://Gold
                return 444;

            case 7://Mithril
                return 447;

            case 8://Adamantite
                return 449;

            case 9://Runite
                return 451;

            case 10://Limestone
                return 3211;

            case 11://Elemental
                return 2892;
            case 12://Rune ess
                return 1436;


        }
        return -1;
    }

    public int getMaxAmountOfOre(int Ore) {
        switch (Ore) {
            case 1://Copper
                return 1;

            case 2://Tin
                return 1;

            case 3://Iron
                return 1;

            case 4://Silver
                return 1;

            case 5://Coal
                return 1;

            case 6://Gold
                return 1;

            case 7://Mithril
                return 1;

            case 8://Adamantite
                return 1;

            case 9://Runite
                return 1;

            case 10://Limestone
                return 1;

            case 11://Elemental
            case 12:
                return 1;

        }
        return -1;
    }

    public int getXpForOre(int Ore) {
        switch (Ore) {
            case 1://Copper
                return 50;

            case 2://Tin
                return 50;

            case 3://Iron
            case 12:
                return 75;

            case 4://Silver
                return 100;

            case 5://Coal
                return 150;

            case 6://Gold
                return 240;

            case 7://Mithril
                return 300;

            case 8://Adamantite
                return 400;

            case 9://Runite
                return 600;

            case 10://Limestone
                return 5;

            case 11://Elemental
                return 20;

        }
        return -1;
    }

    public int getLevelForOre(int Ore) {
        switch (Ore) {
            case 1://Copper
            case 12:
                return 1;

            case 2://Tin
                return 1;

            case 3://Iron
                return 15;

            case 4://Silver
                return 20;

            case 5://Coal
                return 30;

            case 6://Gold
                return 40;

            case 7://Mithril
                return 55;

            case 8://Adamantite
                return 70;

            case 9://Runite
                return 80;

            case 10://Limestone
                return 1;

            case 11://Elemental
                return 10;

        }
        return -1;
    }

    public int getLevelForPickAxe(int axe) {
        switch (axe) {
            case 1265://Bronze Pickaxe
                return 0;

            case 1267://Iron Pickaxe
                return 0;

            case 1269://Steel Pickaxe
                return 5;

            case 1271://Mithril Pickaxe
                return 21;

            case 1273://Adamant Pickaxe
                return 31;

            case 1275://Rune Pickaxe
                return 41;

        }
        return -1;
    }

    public void setAnimAndSpeed(int ore, int axe, int level) {
        switch (axe) {
            case 1265://Bronze Axe
                anim = 625;
                speed = 1;
                break;
            case 1267://Iron Axe
                anim = 626;
                speed = 2;
                break;
            case 1269://Steel Axe
                anim = 627;
                speed = 5;
                break;
            case 1271://Mithril Axe
                anim = 629;
                speed = 13;
                break;
            case 1273://Adamant Axe
                anim = 628;
                speed = 15;
                break;
            case 1275://Rune Axe
                anim = 624;
                speed = 20;
                break;
        }
        if (ore == 12) {
            time = 1;
        }
        speed = (speed - (speed * 2)) / 10;
        time = 4;
        if (time < 0) time = 1;
        if (time == 1) anim++;
    }
}