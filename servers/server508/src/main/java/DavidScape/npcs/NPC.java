package DavidScape.npcs;


import DavidScape.Engine;
import DavidScape.io.Frames;
import DavidScape.players.Player;
import DavidScape.util.Misc;
import DavidScape.util.Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class NPC {
    public Stream update = new Stream(500, 5000);
    public int followPlayer = 0;
    public int gfxHeight;


    public boolean npccanloot = false;

    public void npcDied(Player p, int npcID, int abSX, int abSY) {
        Random rand = new Random();
        try {

            BufferedReader in = new BufferedReader(new FileReader(DavidScape.Server.workingDir + "data/npcs/npcdrops.cfg"));
            String input;
            int on = 0;
            String[] splitEQL;
            String[] splitCOM;
            String[] splitDSH;
            String[] splitCLN;
            String[] splitSCL;
            while ((input = in.readLine()) != null) {
                splitEQL = null;
                splitEQL = null;
                splitDSH = null;
                splitCLN = null;
                splitSCL = null;
                if (!input.startsWith("/") && input.contains("=") && input.contains(",") && input.contains("-") && input.contains(":")) {
                    try {
                        splitEQL = input.split("=");
                        if (Integer.parseInt(splitEQL[0]) == npcID) {
                            splitSCL = splitEQL[1].split(";");
                            int Wealth = 0;

                            for (int i = Wealth; i < splitSCL.length; i++) {
                                splitCOM = splitSCL[i].split(",");
                                splitDSH = splitCOM[1].split("-");
                                splitCLN = splitCOM[2].split(":");
                                int item = Integer.parseInt(splitCOM[0]);

                                int min = Integer.parseInt(splitDSH[0]);
                                int max = Integer.parseInt(splitDSH[1]);
                                int chance = Integer.parseInt(splitCLN[0]);
                                int outOf = Integer.parseInt(splitCLN[1]);
                                int amount = rand.nextInt((max - min) + 1) + min;
                                int ifDrop = rand.nextInt(outOf) + 1;
                                if (ifDrop <= chance) {
                                    Engine.items.createGroundItem(item, amount, abSX, abSY, heightLevel, "");

                                }
                            }
                        }
                    } catch (Exception e) {

                    }
                    ++on;
                }
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    /**
     * The position this NPC is stored in the npc array in the Engine class.
     */
    public int npcId = -1;

    /**
     * The NPC's id, such as 50 for king black dragon.
     */
    public int npcType = 0;

    /**
     * The name of this NPC.
     */
    public String name = "";

    /**
     * If it should hit 0 HP, how long it should take to respawn.
     */
    public int respawnDelay = 1;

    /**
     * Emotes attacking, blocking and death.
     */
    public int attackEmote = 0;
    public boolean isPen = false;

    public boolean summoned = false;
    public Player owner;

    public int defendEmote = 0;
    public int deathEmote = 0;

    /**
     * Delay between attacking.
     */
    public int attackDelay = 5;

    /**
     * Its combat level, used for calculating its accuracy and defence.
     */
    public int combatLevel = 0;

    /**
     * Max hitpoints it can have.
     */
    public int maxHP = 100;
    /**
     * If the Monster is praying. 0 = none, 1 = melle, 2 = range, 3 = magic, 4 = retribution
     */
    public int praying = 100;

    /**
     * The basic max hit it can have, with an attack method you  can get more specific.
     */
    public int maxHit = Misc.random(3);

    /**
     * Attack type, 0 for melee, 1 for range, 2 for magic.
     */
    public int atkType = 0;

    /**
     * The weakness, same setup as atkType.
     */
    public int weakness = 2;

    /**
     * The current HP this NPC has.
     */
    public int currentHP = 100;

    /**
     * The direction this NPC is moving in.
     */
    public int direction = -1;

    /**
     * The height level its at.
     */
    public int heightLevel = 0;

    /**
     * Request for updating facing.
     */
    public boolean faceToUpdateReq = false;
    public int faceToRequest = -1;

    /**
     * If the NPC is dead or not.
     */
    public boolean isDead = false;

    /**
     * If the death emote has been requested, move on to the next part of the death process.
     */
    public boolean deadEmoteDone = true;

    /**
     * Hide the NPC until it is ready to respawn.
     */
    public boolean hiddenNPC = false;

    /**
     * Absolute positioning.
     */
    public int absX = 0, absY = 0;

    /**
     * If false, the NPC will not respawn if it dies.
     */
    public boolean needsRespawn = false;

    /**
     * If set to true, this NPC will randomly walk around.
     */
    public boolean randomWalk = true;

    /**
     * If an update is needed.
     */
    public boolean updateReq = false;

    /**
     * If the NPC should speak.
     */
    public boolean speakTextUpdateReq = false;
    public String speakText = "";

    /**
     * Hit requests.
     */
    public boolean hit1UpdateReq = false;
    public boolean hit2UpdateReq = false;
    public int hitDiff1 = 0;
    public int posionHit1 = 0;
    public int hitDiff2 = 0;
    public int posionHit2 = 0;

    /**
     * Animation request.
     */
    public boolean animUpdateReq = false;
    public int animRequest = 65535;
    public int animDelay = 0;

    /**
     * Graphic request.
     */
    public boolean gfxUpdateReq = false;
    public int gfxRequest = 65535;
    public int gfxDelay = 0;

    /**
     * Facing request.
     */
    public boolean faceCoordsUpdateReq = false;
    public int faceCoordsX = -1;
    public int faceCoordsY = -1;

    /**
     * The area this NPC can randomly walk around.
     */
    public int moveRangeX1 = 0;
    public int moveRangeY1 = 0;
    public int moveRangeX2 = 0;
    public int moveRangeY2 = 0;
    public boolean doingRet = false;

    /**
     * What should be added onto the absolute positioning if this NPC moves.
     */
    public int moveX = 0;
    public int moveY = 0;

    /**
     * The original position the NPC spawned at.
     */
    public int makeX = 0;
    public int makeY = 0;
    public int followCounter = 0;
    /**
     * Delay before the NPC can attack again.
     */
    public int combatDelay = 0;
    public int attackPlayer = 0;
    public boolean attackingPlayer = false;

    /**
     * Gives quick access to the frame class.
     */
    public Frames frames = Engine.frames;


    /**
     * Constructs a new NPC class.
     *
     * @param type  The type of NPC.
     * @param index The position the NPC is at.
     */
    public NPC(int type, int index) {
        npcType = type;
        npcId = index;
    }

    /**
     * This method is called every 600 milliseconds.
     */
    public void appendPlayerFollowing(Player p, NPC n) {
        if (n.followCounter >= 3) {
            n.followPlayer = 0;
            n.attackingPlayer = false;
            n.attackPlayer = 0;
            n.followCounter = 0;
            n.requestFaceCoords(3333, 3333);
            n.requestFaceTo(-1);
            return;
        }
        if (n.attackPlayer != p.playerId) {
            return;
        }
        if (p.attackingNPC == false && n.followCounter < 4 && n.owner == null) {
            n.followCounter++;
        } else {
            n.followCounter = 0;
        }
        if (p == null || n.followPlayer == 0) {
            n.requestFaceCoords(3333, 3333);
            n.requestFaceTo(-1);
            n.attackingPlayer = false;
            n.attackPlayer = 0;
            return;
        }
        int pX = p.absX;
        int pY = p.absY;

        n.requestFaceCoords(pX, pY);

        if (n.absX > pX + 15 || n.absY > pY + 15 || n.absX < pX - 15 || n.absY < pY - 15 || n.heightLevel < p.heightLevel || n.heightLevel > p.heightLevel) {
            if ((p.FamiliarID > 0 || p.FamiliarType > 0)) {
                requestGFX(1315, 0);
                n.absX = p.absX + 1;
                n.absY = p.absY;
            } else {
                n.attackingPlayer = false;
                n.followPlayer = 0;
                n.requestFaceCoords(3333, 3333);
                n.requestFaceTo(-1);
                return;
            }
        }
        if (p.heightLevel != n.heightLevel) {
            n.heightLevel = p.heightLevel;
        }
        if (pY < n.absY && pX == n.absX) {
            n.moveX = 0;
            n.moveY = Engine.npcMovement.getMove(n.absY, pY + 1);
        } else if (pY > n.absY && pX == n.absX) {
            n.moveX = 0;
            n.moveY = Engine.npcMovement.getMove(n.absY, pY - 1);
        } else if (pX < n.absX && pY == n.absY) {
            n.moveX = Engine.npcMovement.getMove(n.absX, pX + 1);
            n.moveY = 0;
        } else if (pX > n.absX && pY == n.absY) {
            n.moveX = Engine.npcMovement.getMove(n.absX, pX - 1);
            n.moveY = 0;
        } else if (pX < n.absX && pY < n.absY) {
            n.moveX = Engine.npcMovement.getMove(n.absX, pX + 1);
            n.moveY = Engine.npcMovement.getMove(n.absY, pY + 1);
        } else if (pX > n.absX && pY > n.absY) {
            n.moveX = Engine.npcMovement.getMove(n.absX, pX - 1);
            n.moveY = Engine.npcMovement.getMove(n.absY, pY - 1);
        } else if (pX < n.absX && pY > n.absY) {
            n.moveX = Engine.npcMovement.getMove(n.absX, pX + 1);
            n.moveY = Engine.npcMovement.getMove(n.absY, pY - 1);
        } else if (pX > n.absX && pY < n.absY) {
            n.moveX = Engine.npcMovement.getMove(n.absX, pX - 1);
            n.moveY = Engine.npcMovement.getMove(n.absY, pY + 1);
        }
        Engine.npcMovement.getNextNPCMovement(n);
    }

    public void process() {

        if (followPlayer != 0) {
            Player fp = Engine.players[followPlayer];
            if (fp != null) {
                appendPlayerFollowing(fp, this);
            } else {
                isDead = true;
            }

        }
        if (respawnDelay > 0 && isDead) {
            respawnDelay--;
        }
        if (combatDelay > 0) {
            combatDelay--;
        }
        if (attackingPlayer) {
            Engine.npcPlayerCombat.attackPlayer(this);
        }
    }

    /**
     * Request an animation for this NPC.
     *
     * @param animId The amination to perform.
     * @param animD  The delay before doing the animation.
     */
    public void requestAnim(int animId, int animD) {
        animRequest = animId;
        animDelay = animD;
        animUpdateReq = true;
        updateReq = true;
    }

    /**
     * Request text for this NPC.
     *
     * @param message The message to make the NPC say.
     */
    public void requestText(String message) {
        speakText = message;
        animUpdateReq = true;
        speakTextUpdateReq = true;
    }

    /**
     * Request an graphic for this NPC.
     *
     * @param gfxId The graphic to perform.
     * @param gfxD  The delay or height or the gfx depending on the value.
     */
    public void requestGFX(int gfxId, int gfxD) {
        if (gfxD >= 100) {
            gfxD += 6553500;
        }
        gfxRequest = gfxId;
        gfxDelay = gfxD;
        gfxUpdateReq = true;
        updateReq = true;
    }

    /**
     * Request this NPC faces two coordinates.
     *
     * @param x The x coordinate to face.
     * @param y The y coordinate to face.
     */
    public void requestFaceCoords(int x, int y) {
        faceCoordsX = 2 * x + 1;
        faceCoordsY = 2 * y + 1;
        faceCoordsUpdateReq = true;
        updateReq = true;
    }

    /**
     * Request this NPC faces another NPC or player.
     *
     * @param faceId The target to face.
     */
    public void requestFaceTo(int faceId) {
        faceToRequest = faceId;
        faceToUpdateReq = true;
        updateReq = true;
    }

    /**
     * Add damage to this NPC.
     *
     * @param damage To amount of damage.
     * @param posion 0 for normal damage, 1 for posion.
     */
    public void appendHit(int damage, int posion) {
        if (damage > currentHP) {
            damage = currentHP;
        }
        currentHP -= damage;
        if (currentHP <= 0) {
            currentHP = 0;
            if (isPen) {
                Engine.Assult.deadNPC(npcType);
            }
            if (doingRet) {
                speakText = "Retribution!";
                speakTextUpdateReq = true;
                animUpdateReq = true;
                for (Player ps : Engine.players) {
                    if (ps != null) {
                        if (ps.absX < absX + 2 && ps.absY < absY + 2 && ps.absX > absX - 2 && ps.absY > absY - 2) {
                            ps.requestGFX(437, 0);
                            ps.appendHit(1 + Misc.random(9), 0);
                        }
                    }
                }
            }
            attackingPlayer = false;
            isDead = true;
        }
        if (!hit1UpdateReq) {
            hitDiff1 = damage;
            posionHit1 = posion;
            hit1UpdateReq = true;
        } else {
            hitDiff2 = damage;
            posionHit2 = posion;
            hit2UpdateReq = true;
        }
        updateReq = true;
    }
}
