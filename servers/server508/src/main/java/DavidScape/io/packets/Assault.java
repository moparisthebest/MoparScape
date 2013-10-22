package DavidScape.io.packets;

import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.util.Misc;

import java.util.ArrayList;
/*
** 
*** 
**** 
*****   Author Davidi2--This has no effect on game play... unless you want to be called a leecher, keep it... 
*****   IDK if you remove it, just dont say you made it. I also know it has bad convetions, but who friken cares?
****     Lastly: I know I didn't have to put "this." in front of everything, but in beta testing there was an error and I put them there, and am to lazy to take them out.
*** 
** 
*/

public class Assault {

    public int wave = 1;
    public int healers = 0;
    public int rangers = 0;
    public int fighters = 0;
    public int runners = 0;
    public int khealers = 0;
    public int krangers = 0;
    public int kfighters = 0;
    public int krunners = 0;
    public int[] waiting = {0, 0, 0, 0, 0};
    public boolean gameGoing = false;
    public boolean[] dead = {false, false, false, false}; //H Ra F Ru
    public int[] numNPC = {2, 4, 6, 8, 10}; //How many of each NPC to spawn each wave. Currently 5 waves
    public int[] hp = {25, 40, 65, 80, 100}; //How much HP each NPC should have each level
    public int[] mh = {5, 9, 13, 15, 18};
    public int[] healerID = {5238, 5239, 5240, 5241, 5242};
    public int[] rangerID = {5229, 5230, 5231, 5232, 5233};
    public int[] fighterID = {5044, 5045, 5213, 5214, 5215};
    public int[] runnerID = {5220, 5221, 5222, 5223, 5224};
    public int gamen = 0;
    public ArrayList<Player> inGame = new ArrayList<Player>();

    public void startWave(int wave) {
        this.wave = wave;
        this.khealers = 0;
        this.krangers = 0;
        this.kfighters = 0;
        this.krunners = 0;
        for (int i = 0; i < dead.length; i++) {
            dead[i] = false;
        }
        this.gameGoing = true;
        this.healers = numNPC[wave - 1];
        this.rangers = numNPC[wave - 1];
        this.fighters = numNPC[wave - 1];
        this.runners = numNPC[wave - 1];
        newAssaultNPC(healerID[wave - 1], hp[wave - 1], mh[wave - 1], numNPC[wave - 1]);
        newAssaultNPC(rangerID[wave - 1], hp[wave - 1], mh[wave - 1], numNPC[wave - 1]);
        newAssaultNPC(fighterID[wave - 1], hp[wave - 1], mh[wave - 1], numNPC[wave - 1]);
        newAssaultNPC(runnerID[wave - 1], hp[wave - 1], mh[wave - 1], numNPC[wave - 1]);
        gamen++;
    }

    public void deadNPC(int type) {
        switch (type) {
            case 5242:
            case 5238:
            case 5239:
            case 5240:
            case 5241:
                this.khealers++;
                break;

            case 5233:
            case 5229:
            case 5230:
            case 5231:
            case 5232:
                this.krangers++;
                break;

            case 5224:
            case 5220:
            case 5221:
            case 5222:
            case 5223:
                this.krunners++;
                break;

            case 5215:
            case 5044:
            case 5045:
            case 5213:
            case 5214:
                this.kfighters++;
                break;
        }
        if (this.healers - this.khealers < 1)
            this.healers = 0;
        if (this.runners - this.krunners < 1)
            this.runners = 0;
        if (this.fighters - this.kfighters < 1)
            this.fighters = 0;
        if (this.rangers - this.krangers < 1)
            this.rangers = 0;
        for (Player p : Engine.players) {
            if (p != null) {
                if (p.inAssault) {
                    if (this.healers == 0) {
                        this.dead[0] = true;
                    }
                    if (this.rangers == 0) {
                        this.dead[1] = true;
                    }
                    if (this.runners == 0) {
                        this.dead[3] = true;
                    }
                    if (this.fighters == 0) {
                        this.dead[2] = true;
                    }
                    if (this.dead[0] && this.dead[1] && this.dead[2] && this.dead[3]) {
                        p.frames.sendMessage(p, "Wave " + wave + " completed!");
                        p.inAssault = false;
                        endAssault(p);
                        this.gameGoing = false;
                    } else {
                        p.frames.sendMessage(p, "Left to kill:");
                        if (!this.dead[0]) {
                            p.frames.sendMessage(p, "Healers: " + (this.healers - this.khealers));
                        }
                        if (!this.dead[2]) {
                            p.frames.sendMessage(p, "Fighters: " + (this.fighters - this.kfighters));
                        }
                        if (!this.dead[3]) {
                            p.frames.sendMessage(p, "Runners: " + (this.runners - this.krunners));
                        }
                        if (!this.dead[1]) {
                            p.frames.sendMessage(p, "Rangers: " + (this.rangers - this.krangers));
                        }
                    }
                }
            }
        }
    }

    public void playerDied() {
        for (Player p : Engine.players) {
            if (p != null) {
                if (p.inAssault) {
                    p.inAssault = false;
                    switch (p.waveID) {
                        case 1:
                            p.setCoords(2579, 5299, 0);
                            break;

                        case 2:
                            p.setCoords(2587, 5299, 0);
                            break;

                        case 3:
                            p.setCoords(2599, 5299, 0);
                            break;

                        case 4:
                            p.setCoords(2607, 5299, 0);
                            break;

                        case 5:
                            p.setCoords(2579, 5289, 0);
                            break;
                    }
                    p.frames.sendMessage(p, "Oh no! Someone died!");
                    gameGoing = false;
                }
            }
        }
    }

    public void endGame() {
        for (Player p : inGame) {
            gameGoing = false;
            if (p != null) {
                switch (p.waveID) {
                    case 1:
                        p.setCoords(2579, 5299, 0);
                        break;

                    case 2:
                        p.setCoords(2587, 5299, 0);
                        break;

                    case 3:
                        p.setCoords(2599, 5299, 0);
                        break;

                    case 4:
                        p.setCoords(2607, 5299, 0);
                        break;

                    case 5:
                        p.setCoords(2579, 5289, 0);
                        break;
                }
                p.inAssault = false;
            }
        }
        inGame.clear();
    }

    public void endAssault(Player p) {
        gameGoing = false;
        switch (p.waveID) {
            case 1:
                p.setCoords(2579, 5299, 0);
                break;

            case 2:
                p.setCoords(2587, 5299, 0);
                break;

            case 3:
                p.setCoords(2599, 5299, 0);
                break;

            case 4:
                p.setCoords(2607, 5299, 0);
                break;

            case 5:
                p.setCoords(2579, 5289, 0);
                break;
        }
        if (p.waveID == 5) {
            p.waveID = 1;
            p.frames.sendMessage(p, "You have finished wave 5! Go get your reward!");
            p.rewards++;
            p.frames.sendMessage(p, "You have " + p.rewards + " reward  point(s)");
        } else {
            p.waveID++;
        }
    }

    public void goIn(Player p, int wave) {
        if (!p.waiting) {
            if (p.waveID < wave) {
                p.frames.sendMessage(p, "Current Wave: " + p.waveID + ". Please go in a wave that is the same or lower then yours.");
                return;
            }
            if (p.waveID > wave) {
                p.waveID = wave;
                p.frames.sendMessage(p, "Current Wave: " + p.waveID + ".");
            }
            if (p.waveID == wave) {
                p.frames.sendMessage(p, "You have entered wave " + p.waveID + ".");
                p.waveID = wave;
            }
            switch (wave) {
                case 1:
                    p.setCoords(2579, 5298, 0);
                    break;

                case 2:
                    p.setCoords(2587, 5298, 0);
                    break;

                case 3:
                    p.setCoords(2599, 5298, 0);
                    break;

                case 4:
                    p.setCoords(2607, 5298, 0);
                    break;

                case 5:
                    p.setCoords(2579, 5288, 0);
                    break;
            }
            p.waiting = true;
        } else {
            switch (wave) {
                case 1:
                    p.setCoords(2579, 5299, 0);
                    break;

                case 2:
                    p.setCoords(2587, 5299, 0);
                    break;

                case 3:
                    p.setCoords(2599, 5299, 0);
                    break;

                case 4:
                    p.setCoords(2607, 5299, 0);
                    break;

                case 5:
                    p.setCoords(2579, 5289, 0);
                    break;
            }
            p.waiting = false;
        }
        for (int i = 0; i < waiting.length; i++) {
            waiting[i] = 0;
        }
        for (Player pz : Engine.players) {
            if (pz != null && pz.waiting) {
                waiting[p.waveID - 1]++;
            }
        }
        if (waiting[wave - 1] > 2 && !gameGoing) {
            for (Player po : Engine.players) {
                if (po != null && po.waiting && po.waveID == wave) {
                    po.setCoords(1886, 5472, gamen * 4);
                    p.absX = 1886;
                    p.absY = 5472;
                    inGame.add(po);
                    po.frames.sendMessage(po, "Wave " + wave + " has begun!");
                    po.frames.sendMessage(po, "Remember, you can only kill Runners and Healers with magic!");
                    po.frames.sendMessage(po, "Get runes at the healer spring South West!");
                    po.waiting = false;
                    po.inAssault = true;
                    po.waveID = wave;
                }
            }
            startWave(wave);
        } else if (waiting[wave - 1] > 2 && gameGoing) {
            for (Player po : Engine.players) {
                if (po != null && po.waiting && po.waveID == wave) {
                    po.frames.sendMessage(po, "You have enough players, but a game is already in progress. Please wait.");
                }
            }
        } else if (waiting[wave - 1] < 3) {
            for (Player po : Engine.players) {
                if (po != null && po.waiting && po.waveID == wave) {
                    po.frames.sendMessage(po, "You need more players to start. You need " + (int) (3 - (waiting[wave - 1])) + " more.");
                }
            }
        }
    }

    public void newAssaultNPC(int type, int HP, int MH, int AMT) {
        for (int a = 0; a < AMT; a++) {
            int index = -1;
            for (int i = 1; i < Engine.npcs.length; i++) {
                if (Engine.npcs[i] == null) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                Misc.println("Not Enough Room for BarbAssault NPCS!");
            }
            NPC n = Engine.npcs[index] = new NPC(type, index);
            int rnd = Misc.random(3);
            switch (rnd) {
                case 0:
                case 4:
                    n.absX = 1874 + Misc.random(8);
                    n.absY = 5485 - Misc.random(8);
                    n.makeX = 1874 + Misc.random(8);
                    n.makeY = 5485 - Misc.random(8);
                    break;

                case 1:
                    n.absX = 1880 + Misc.random(4);
                    n.absY = 5485 - Misc.random(8);
                    n.makeX = 1880 + Misc.random(4);
                    n.makeY = 5485 - Misc.random(8);
                    break;

                case 2:
                    n.absX = 1892 - Misc.random(4);
                    n.absY = 5485 - Misc.random(8);
                    n.makeX = 1892 - Misc.random(4);
                    n.makeY = 5485 - Misc.random(8);
                    break;

                case 3:
                    n.absX = 1898 - Misc.random(8);
                    n.absY = 5485 - Misc.random(8);
                    n.makeX = 1898 - Misc.random(8);
                    n.makeY = 5485 - Misc.random(8);
                    break;
            }
            n.heightLevel = gamen * 4;
            n.isPen = true;
            n.moveRangeX1 = 1899;
            n.moveRangeY1 = 5486;
            n.moveRangeX2 = 1873;
            n.moveRangeY2 = 5476;
            n.needsRespawn = false;
            n.maxHP = HP;
            n.currentHP = HP;
            n.maxHit = MH;
            n.respawnDelay = 1;
            n.attackDelay = 6;
        }
    }

}//End Class
