import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Players {
    public void println_debug(String str) {
        System.out.println("[player-" + playerId + "]: " + str);
    }

    public void println(String str) {
        System.out.println("[player-" + playerId + "]: " + str);
    }

    // some remarks: one map region is 8x8
    // a 7-bit (i.e. 128) value thus ranges over 16 such regions
    // the active area of 104x104 is comprised of 13x13 such regions, i.e. from
    // the center region that is 6 regions in each direction (notice the magical 6
    // appearing also in map region arithmetics...)

    public Players(int _playerId) {
        playerId = _playerId;
        //playerName = "player"+playerId;
        playerRights = 0; //player rights

        for (int i = 0; i < playerItems.length; i++) { //Setting player items
            playerItems[i] = 0;
        }
        for (int i = 0; i < playerItemsN.length; i++) { //Setting Items amounts
            playerItemsN[i] = 0;
        }

        for (int i = 0; i < playerLevel.length; i++) { //Setting Levels
            if (i == 3) {
                playerLevel[i] = 10;
                playerXP[i] = 1155;
            } else {
                playerLevel[i] = 1;
                playerXP[i] = 0;
            }
        }

        for (int i = 0; i < playerBankSize; i++) { //Setting bank items
            bankItems[i] = 0;
        }

        for (int i = 0; i < playerBankSize; i++) { //Setting bank item amounts
            bankItemsN[i] = 0;
        }

        //Setting Welcomescreen information
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int calc = ((year * 10000) + (month * 100) + day);
        playerLastLogin = calc;
        playerLastConnect = "";
        playerIsMember = 1;
        playerMessages = 0;

        //Setting player standard look
        playerLook[0] = 0;
        playerLook[1] = 7;
        playerLook[2] = 8;
        playerLook[3] = 9;
        playerLook[4] = 5;
        playerLook[5] = 0;

        //Giving the player an unique look
        playerEquipment[playerHat] = Items.randomHat();
        playerEquipment[playerCape] = Items.randomCape();
        playerEquipment[playerAmulet] = Items.randomAmulet();
        playerEquipment[playerChest] = Items.randomBody();
        playerEquipment[playerShield] = Items.randomShield();
        playerEquipment[playerLegs] = Items.randomLegs();
        playerEquipment[playerHands] = Items.randomGloves();
        playerEquipment[playerFeet] = Items.randomBoots();
        playerEquipment[playerRing] = Items.randomRing();
        playerEquipment[playerArrows] = Items.randomArrows();
        playerEquipment[playerWeapon] = 1275;

/*
0-9: male head
10-17: male beard
18-25: male torso
26-32: male arms
33-35: male hands
36-41: male legs
42-44: male feet

45-55: fem head
56-60: fem torso
61-66: fem arms
67-69: fem hands
70-78: fem legs
79-81: fem feet
*/

        pHead = 7;
        pTorso = 25;
        pArms = 29;
        pHands = 35;
        pLegs = 39;
        pFeet = 44;
        pBeard = 14;

        // initial x and y coordinates of the player
        heightLevel = 0;
        // the first call to updateThisPlayerMovement() will craft the proper initialization packet
        teleportToX = 3254;//3072;
        teleportToY = 3420;//3312;

        // ClientHandler initially doesn't know those values yet
        absX = absY = -1;
        mapRegionX = mapRegionY = -1;
        currentX = currentY = 0;
        resetWalkingQueue();
    }

    void destruct() {
        playerListSize = 0;
        for (int i = 0; i < maxPlayerListSize; i++) playerList[i] = null;
        npcListSize = 0;
        for (int i = 0; i < maxNPCListSize; i++) npcList[i] = null;

        absX = absY = -1;
        mapRegionX = mapRegionY = -1;
        currentX = currentY = 0;
        resetWalkingQueue();
    }

    public boolean isNpc;
    public int npcId;
    public boolean initialized = false, disconnected = false, savefile = true;
    public boolean isActive = false;
    public boolean isKicked = false;
    public boolean CrackerMsg = false;
    public boolean CrackerForMe = false;

    public int actionTimer = 0;
    public int actionAmount = 0;
    public String actionName = "";

    public String connectedFrom = "";
    public String globalMessage = "";

    public int tradeRequest = 0;
    public int tradeDecline = 0;
    public int tradeWith = 0;
    public int tradeWaitingTime = 0;
    public int tradeStatus = 0;
    public boolean tradeUpdateOther = false;
    public boolean tradeOtherDeclined = false;
    public int[] playerTItems = new int[28]; //player Trade Items
    public int[] playerTItemsN = new int[28];
    public int[] playerOTItems = new int[28]; //player Other Trade Items
    public int[] playerOTItemsN = new int[28];

    public boolean takeAsNote = false;

    public abstract void initialize();

    public abstract void update();

    public int playerId = -1;        // -1 denotes world is full, otherwise this is the playerId
    // corresponds to the index in Players players[]

    public String playerName = null;            // name of the connecting ClientHandler
    public String playerPass = null;            // name of the connecting ClientHandler
    public boolean isRunning2 = false;


    public int playerRights;        // 0=normal player, 1=player mod, 2=real mod, 3=admin?

    public PlayerHandler handler = null;

    public int maxItemAmount = /*2000000000*/999999999;

    public int[] playerItems = new int[28];
    public int[] playerItemsN = new int[28];

    public int playerBankSize = 350;
    public int[] bankItems = new int[800];
    public int[] bankItemsN = new int[800];
    public boolean bankNotes = false;


    //Default appearance
    public int pHead;
    public int pTorso;
    public int pArms;
    public int pHands;
    public int pLegs;
    public int pFeet;
    public int pBeard;
    public int pEmote = 0x328; // this being the original standing state

    public int[] playerEquipment = new int[14];
    public int[] playerEquipmentN = new int[14];

    public int playerHat = 0;
    public int playerCape = 1;
    public int playerAmulet = 2;
    public int playerWeapon = 3;
    public int playerChest = 4;
    public int playerShield = 5;
    public int playerLegs = 7;
    public int playerHands = 9;
    public int playerFeet = 10;
    public int playerRing = 12;
    public int playerArrows = 13;

    public int playerAttack = 0;
    public int playerDefence = 1;
    public int playerStrength = 2;
    public int playerHitpoints = 3;
    public int playerRanged = 4;
    public int playerPrayer = 5;
    public int playerMagic = 6;
    public int playerCooking = 7;
    public int playerWoodcutting = 8;
    public int playerFletching = 9;
    public int playerFishing = 10;
    public int playerFiremaking = 11;
    public int playerCrafting = 12;
    public int playerSmithing = 13;
    public int playerMining = 14;
    public int playerHerblore = 15;
    public int playerAgility = 16;
    public int playerThieving = 17;
    public int playerSlayer = 18;
    public int playerFarming = 19;
    public int playerRunecrafting = 20;

    public int i = 0;

    public int[] playerLevel = new int[25];
    public int[] playerXP = new int[25];

    // the list of players currently seen by thisPlayer
    // this has to be remembered because the ClientHandler will build up exactly the same list
    // and will be used on subsequent player movement update packets for efficiency
    public final static int maxPlayerListSize = PlayerHandler.maxPlayers;
    public Players playerList[] = new Players[maxPlayerListSize];
    public int playerListSize = 0;
    // bit at position playerId is set to 1 incase player is currently in playerList
    public byte playerInListBitmap[] = new byte[(PlayerHandler.maxPlayers + 7) >> 3];

    // the list of npcs currently seen by thisPlayer
    // this has to be remembered because the ClientHandler will build up exactly the same list
    // and will be used on subsequent player movement update packets for efficiency
    public final static int maxNPCListSize = NPCHandler.maxNPCs;
    public NPCs npcList[] = new NPCs[maxNPCListSize];
    public int npcListSize = 0;
    // bit at position npcId is set to 1 incase player is currently in playerList
    public byte npcInListBitmap[] = new byte[(NPCHandler.maxNPCs + 7) >> 3];


    // supported within the packet adding new players are coordinates relative to thisPlayer
    // that are >= -16 and <= 15 (i.e. a signed 5-bit number)
    public boolean withinDistance(Players otherPlr) {
        if (heightLevel != otherPlr.heightLevel) return false;
        int deltaX = otherPlr.absX - absX, deltaY = otherPlr.absY - absY;
        return deltaX <= 15 && deltaX >= -16 && deltaY <= 15 && deltaY >= -16;
    }

    public boolean withinDistance(NPCs npc) {
        if (heightLevel != npc.heightLevel) return false;
        if (npc.NeedRespawn == true) return false;
        int deltaX = npc.absX - absX, deltaY = npc.absY - absY;
        return deltaX <= 15 && deltaX >= -16 && deltaY <= 15 && deltaY >= -16;
    }


    public int mapRegionX, mapRegionY;        // the map region the player is currently in
    public int absX, absY;                    // absolute x/y coordinates
    public int currentX, currentY;            // relative x/y coordinates (to map region)
    // Note that mapRegionX*8+currentX yields absX
    public int heightLevel;        // 0-3 supported by the ClientHandler

    public boolean updateRequired = true;        // set to true if, in general, updating for this player is required
    // i.e. this should be set to true whenever any of the other
    // XXXUpdateRequired flags are set to true
    // Important: this does NOT include chatTextUpdateRequired!

    // walking related stuff - walking queue etc...
    public static final int walkingQueueSize = 50;
    public int walkingQueueX[] = new int[walkingQueueSize], walkingQueueY[] = new int[walkingQueueSize];
    public int wQueueReadPtr = 0;        // points to slot for reading from queue
    public int wQueueWritePtr = 0;        // points to (first free) slot for writing to the queue
    public boolean isRunning = false;
    public int teleportToX = -1, teleportToY = -1;    // contain absolute x/y coordinates of destination we want to teleport to


    public void resetWalkingQueue() {
        wQueueReadPtr = wQueueWritePtr = 0;
        // properly initialize this to make the "travel back" algorithm work
        for (int i = 0; i < walkingQueueSize; i++) {
            walkingQueueX[i] = currentX;
            walkingQueueY[i] = currentY;
        }
    }

    public void addToWalkingQueue(int x, int y) {
        int next = (wQueueWritePtr + 1) % walkingQueueSize;
        if (next == wQueueWritePtr) return;        // walking queue full, silently discard the data
        walkingQueueX[wQueueWritePtr] = x;
        walkingQueueY[wQueueWritePtr] = y;
        wQueueWritePtr = next;
    }

    // returns 0-7 for next walking direction or -1, if we're not moving
    public int getNextWalkingDirection() {
        if (wQueueReadPtr == wQueueWritePtr) return -1;        // walking queue empty
        int dir;
        do {
            dir = misc.direction(currentX, currentY, walkingQueueX[wQueueReadPtr], walkingQueueY[wQueueReadPtr]);
            if (dir == -1) wQueueReadPtr = (wQueueReadPtr + 1) % walkingQueueSize;
            else if ((dir & 1) != 0) {
                println_debug("Invalid waypoint in walking queue!");
                resetWalkingQueue();
                return -1;
            }
        } while (dir == -1 && wQueueReadPtr != wQueueWritePtr);
        if (dir == -1) return -1;
        dir >>= 1;
        currentX += misc.directionDeltaX[dir];
        currentY += misc.directionDeltaY[dir];
        absX += misc.directionDeltaX[dir];
        absY += misc.directionDeltaY[dir];
        return dir;
    }

    // calculates directions of player movement, or the new coordinates when teleporting
    public boolean didTeleport = false;        // set to true if char did teleport in this cycle
    public boolean mapRegionDidChange = false;
    public int dir1 = -1, dir2 = -1;        // direction char is going in this cycle
    public int poimiX = 0, poimiY = 0;

    public void getNextPlayerMovement() {
        mapRegionDidChange = false;
        didTeleport = false;
        dir1 = dir2 = -1;

        if (teleportToX != -1 && teleportToY != -1) {
            mapRegionDidChange = true;
            if (mapRegionX != -1 && mapRegionY != -1) {
                // check, whether destination is within current map region
                int relX = teleportToX - mapRegionX * 8, relY = teleportToY - mapRegionY * 8;
                if (relX >= 2 * 8 && relX < 11 * 8 && relY >= 2 * 8 && relY < 11 * 8)
                    mapRegionDidChange = false;
            }
            if (mapRegionDidChange) {
                // after map region change the relative coordinates range between 48 - 55
                mapRegionX = (teleportToX >> 3) - 6;
                mapRegionY = (teleportToY >> 3) - 6;

                playerListSize = 0;        // completely rebuild playerList after teleport AND map region change
            }

            currentX = teleportToX - 8 * mapRegionX;
            currentY = teleportToY - 8 * mapRegionY;
            absX = teleportToX;
            absY = teleportToY;
            resetWalkingQueue();

            teleportToX = teleportToY = -1;
            didTeleport = true;
        } else {
            dir1 = getNextWalkingDirection();
            if (dir1 == -1) return;        // standing

            if (isRunning) {
                dir2 = getNextWalkingDirection();
            }

            // check, if we're required to change the map region
            int deltaX = 0, deltaY = 0;
            if (currentX < 2 * 8) {
                deltaX = 4 * 8;
                mapRegionX -= 4;
                mapRegionDidChange = true;
            } else if (currentX >= 11 * 8) {
                deltaX = -4 * 8;
                mapRegionX += 4;
                mapRegionDidChange = true;
            }
            if (currentY < 2 * 8) {
                deltaY = 4 * 8;
                mapRegionY -= 4;
                mapRegionDidChange = true;
            } else if (currentY >= 11 * 8) {
                deltaY = -4 * 8;
                mapRegionY += 4;
                mapRegionDidChange = true;
            }

            if (mapRegionDidChange) {
                // have to adjust all relative coordinates
                currentX += deltaX;
                currentY += deltaY;
                for (int i = 0; i < walkingQueueSize; i++) {
                    walkingQueueX[i] += deltaX;
                    walkingQueueY[i] += deltaY;
                }
            }

        }
    }

    // handles anything related to character position, i.e. walking,running and teleportation
    // applies only to the char and the ClientHandler which is playing it
    public void updateThisPlayerMovement(stream str) {
        if (mapRegionDidChange) {
            str.createFrame(73);
            str.writeWordA(mapRegionX + 6);    // for some reason the ClientHandler substracts 6 from those values
            str.writeWord(mapRegionY + 6);
        }

        if (didTeleport == true) {
            str.createFrameVarSizeWord(81);
            str.initBitAccess();
            str.writeBits(1, 1);
            str.writeBits(2, 3);            // updateType
            str.writeBits(2, heightLevel);
            str.writeBits(1, 1);            // set to true, if discarding (clientside) walking queue
            str.writeBits(1, (updateRequired) ? 1 : 0);
            str.writeBits(7, currentY);
            str.writeBits(7, currentX);
            if (IsDead == true && IsDeadTimer == true && IsDeadTeleporting == true) {
                IsDead = false;
                IsDeadTimer = false;
                SafeMyLife = false;
                IsUsingSkill = false;
            }
            return;
        }

        if (dir1 == -1) {
            // don't have to update the character position, because we're just standing
            str.createFrameVarSizeWord(81);
            str.initBitAccess();
            if (updateRequired) {
                // tell ClientHandler there's an update block appended at the end
                str.writeBits(1, 1);
                str.writeBits(2, 0);
            } else {
                str.writeBits(1, 0);
            }
            if (DirectionCount < 50) {
                DirectionCount++;
            }
        } else {
            DirectionCount = 0;
            str.createFrameVarSizeWord(81);
            str.initBitAccess();
            str.writeBits(1, 1);

            if (dir2 == -1) {
                // send "walking packet"
                str.writeBits(2, 1);        // updateType
                str.writeBits(3, misc.xlateDirectionToClient[dir1]);
                if (updateRequired)
                    str.writeBits(1, 1);        // tell ClientHandler there's an update block appended at the end
                else str.writeBits(1, 0);
            } else {
                // send "running packet"
                str.writeBits(2, 2);        // updateType
                str.writeBits(3, misc.xlateDirectionToClient[dir1]);
                str.writeBits(3, misc.xlateDirectionToClient[dir2]);
                if (updateRequired)
                    str.writeBits(1, 1);        // tell ClientHandler there's an update block appended at the end
                else str.writeBits(1, 0);
                if (playerEnergy > 0) {
                    playerEnergy -= 1;
                } else {
                    isRunning2 = false;
                }
            }
        }

    }

    // handles anything related to character position basically walking, running and standing
    // applies to only to "non-thisPlayer" characters
    public void updatePlayerMovement(stream str) {
        if (dir1 == -1) {
            // don't have to update the character position, because the char is just standing
            if (updateRequired || chatTextUpdateRequired) {
                // tell ClientHandler there's an update block appended at the end
                str.writeBits(1, 1);
                str.writeBits(2, 0);
            } else str.writeBits(1, 0);
        } else if (dir2 == -1) {
            // send "walking packet"
            str.writeBits(1, 1);
            str.writeBits(2, 1);
            str.writeBits(3, misc.xlateDirectionToClient[dir1]);
            str.writeBits(1, (updateRequired || chatTextUpdateRequired) ? 1 : 0);
        } else {
            // send "running packet"
            str.writeBits(1, 1);
            str.writeBits(2, 2);
            str.writeBits(3, misc.xlateDirectionToClient[dir1]);
            str.writeBits(3, misc.xlateDirectionToClient[dir2]);
            str.writeBits(1, (updateRequired || chatTextUpdateRequired) ? 1 : 0);
        }
    }

    // a bitmap of players that we want to keep track of whether char appearance has changed so
    // we know if we have to transmit those or can make use of the cached char appearances in the ClientHandler
    public byte cachedPropertiesBitmap[] = new byte[(PlayerHandler.maxPlayers + 7) >> 3];

    public void addNewNPC(NPCs npc, stream str, stream updateBlock) {
        int id = npc.npcId;
        npcInListBitmap[id >> 3] |= 1 << (id & 7);    // set the flag
        npcList[npcListSize++] = npc;

        str.writeBits(14, id);    // ClientHandler doesn't seem to like id=0

        int z = npc.absY - absY;
        if (z < 0) z += 32;
        str.writeBits(5, z);    // y coordinate relative to thisPlayer
        z = npc.absX - absX;
        if (z < 0) z += 32;
        str.writeBits(5, z);    // x coordinate relative to thisPlayer

        str.writeBits(1, 0); //something??
        str.writeBits(12, npc.npcType);

        boolean savedUpdateRequired = npc.updateRequired;
        npc.updateRequired = true;
        npc.appendNPCUpdateBlock(updateBlock);
        npc.updateRequired = savedUpdateRequired;
        str.writeBits(1, 1); // update required
    }

    public void addNewPlayer(Players plr, stream str, stream updateBlock) {
        int id = plr.playerId;
        playerInListBitmap[id >> 3] |= 1 << (id & 7);    // set the flag
        playerList[playerListSize++] = plr;

        str.writeBits(11, id);    // ClientHandler doesn't seem to like id=0

        // TODO: properly implement the character appearance handling
        // send this everytime for now and don't make use of the cached ones in ClientHandler
        str.writeBits(1, 1);    // set to true, if player definitions follow below
        boolean savedFlag = plr.appearanceUpdateRequired;
        boolean savedUpdateRequired = plr.updateRequired;
        plr.appearanceUpdateRequired = true;
        plr.updateRequired = true;
        plr.appendPlayerUpdateBlock(updateBlock);
        plr.appearanceUpdateRequired = savedFlag;
        plr.updateRequired = savedUpdateRequired;


        str.writeBits(1, 1);    // set to true, if we want to discard the (clientside) walking queue
        // no idea what this might be useful for yet
        int z = plr.absY - absY;
        if (z < 0) z += 32;
        str.writeBits(5, z);    // y coordinate relative to thisPlayer
        z = plr.absX - absX;
        if (z < 0) z += 32;
        str.writeBits(5, z);    // x coordinate relative to thisPlayer
    }


    // player appearance related stuff
    protected boolean appearanceUpdateRequired = true;    // set to true if the player appearance wasn't synchronized
    // with the clients yet or changed recently

    protected static stream playerProps;

    static {
        playerProps = new stream(new byte[100]);
    }

    protected void appendPlayerAppearance(stream str) {
        playerProps.currentOffset = 0;

        // TODO: yet some things to figure out on this block + properly implement this
        playerProps.writeByte(playerLook[0]);        // player sex. 0=Male and 1=Female
        playerProps.writeByte(0);        // playerStatusMask - skull, prayers etc alkup 0

        // defining the character shape - 12 slots following - 0 denotes a null entry and just a byte is used
        // slot 0,8,11,1 is head part - missing additional things are beard and eyepatch like things either 11 or 1
        // cape, apron, amulet... the remaining things...

        if (isNpc == false) {
            if (playerEquipment[playerHat] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerHat]);
            } else {
                playerProps.writeByte(0);
            }
            if (playerEquipment[playerCape] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerCape]);
            } else {
                playerProps.writeByte(0);
            }
            if (playerEquipment[playerAmulet] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerAmulet]);
            } else {
                playerProps.writeByte(0);
            }
            if (playerEquipment[playerWeapon] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerWeapon]);
            } else {
                playerProps.writeByte(0);
            }
            if (playerEquipment[playerChest] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerChest]);
            } else {
                playerProps.writeWord(0x100 + pTorso);
            }
            if (playerEquipment[playerShield] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerShield]);
            } else {
                playerProps.writeByte(0);
            }
            if (!Items.isPlate(playerEquipment[playerChest])) {
                playerProps.writeWord(0x100 + pArms);
            } else {
                playerProps.writeByte(0);
            }
            if (playerEquipment[playerLegs] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerLegs]);
            } else {
                playerProps.writeWord(0x100 + pLegs);
            }
            if (!Items.isFullHelm(playerEquipment[playerHat]) && !Items.isFullMask(playerEquipment[playerHat])) {
                playerProps.writeWord(0x100 + pHead);        // head
            } else {
                playerProps.writeByte(0);
            }
            if (playerEquipment[playerHands] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerHands]);
            } else {
                playerProps.writeWord(0x100 + pHands);
            }
            if (playerEquipment[playerFeet] > 1) {
                playerProps.writeWord(0x200 + playerEquipment[playerFeet]);
            } else {
                playerProps.writeWord(0x100 + pFeet);
            }
            playerProps.writeByte(0);
        } else {
            playerProps.writeWord(-1);
            playerProps.writeWord(npcId);

        }

        // array of 5 bytes defining the colors
        playerProps.writeByte(playerLook[1]);    // hair color
        playerProps.writeByte(playerLook[2]);    // torso color.
        playerProps.writeByte(playerLook[3]);    // leg color
        playerProps.writeByte(playerLook[4]);    // feet color
        playerProps.writeByte(playerLook[5]);    // skin color (0-6)

        playerProps.writeWord(pEmote);        // standAnimIndex
        playerProps.writeWord(0x337);        // standTurnAnimIndex
        playerProps.writeWord(playerSEW);    // walkAnimIndex
        playerProps.writeWord(0x334);        // turn180AnimIndex
        playerProps.writeWord(0x335);        // turn90CWAnimIndex
        playerProps.writeWord(0x336);        // turn90CCWAnimIndex
        playerProps.writeWord(playerSER);    // runAnimIndex

        playerProps.writeQWord(misc.playerNameToInt64(playerName));

        //Stat fix, combat decreases when your hp or any of these skills get lowerd, this fixes that problem.
        /*int att = (int)((double)(getLevelForXP(playerXP[0])) * 0.325);
          int def = (int)((double)(getLevelForXP(playerXP[1])) * 0.25);
          int str = (int)((double)(getLevelForXP(playerXP[2])) * 0.325);
          int hit = (int)((double)(getLevelForXP(playerXP[3])) * 0.25);
          int mag = (int)((double)(getLevelForXP(playerXP[4])) * 0.4875);
          int pra = (int)((double)(getLevelForXP(playerXP[5])) * 0.125);
          int ran = (int)((double)(getLevelForXP(playerXP[6])) * 0.4875);*/

        int mag = (int) ((double) (getLevelForXP(playerXP[4])) * 1.5);
        int ran = (int) ((double) (getLevelForXP(playerXP[6])) * 1.5);
        int attstr = (int) ((double) (getLevelForXP(playerXP[0])) + (double) (getLevelForXP(playerXP[2])));

        int combatLevel = 0;
        if (ran > attstr) {
            combatLevel = (int) (((double) (getLevelForXP(playerXP[1])) * 0.25) + ((double) (getLevelForXP(playerXP[3])) * 0.25) + ((double) (getLevelForXP(playerXP[5])) * 0.125) + ((double) (getLevelForXP(playerXP[6])) * 0.4875));
        } else if (mag > attstr) {
            combatLevel = (int) (((double) (getLevelForXP(playerXP[1])) * 0.25) + ((double) (getLevelForXP(playerXP[3])) * 0.25) + ((double) (getLevelForXP(playerXP[5])) * 0.125) + ((double) (getLevelForXP(playerXP[4])) * 0.4875));
        } else {
            combatLevel = (int) (((double) (getLevelForXP(playerXP[1])) * 0.25) + ((double) (getLevelForXP(playerXP[3])) * 0.25) + ((double) (getLevelForXP(playerXP[5])) * 0.125) + ((double) (getLevelForXP(playerXP[0])) * 0.325) + ((double) (getLevelForXP(playerXP[2])) * 0.325));
        }
        playerProps.writeByte(combatLevel);        // combat level
        playerProps.writeWord(0);            // incase != 0, writes skill-%d

        str.writeByteC(playerProps.currentOffset);        // size of player appearance block
        str.writeBytes(playerProps.buffer, playerProps.currentOffset, 0);
    }

    protected boolean chatTextUpdateRequired = false;
    protected byte chatText[] = new byte[4096], chatTextSize = 0;
    protected int chatTextEffects = 0, chatTextColor = 0;

    protected void appendPlayerChatText(stream str) {
        str.writeWordBigEndian(((chatTextColor & 0xFF) << 8) + (chatTextEffects & 0xFF));
        str.writeByte(playerRights);
        str.writeByteC(chatTextSize);        // no more than 256 bytes!!!
        str.writeBytes_reverse(chatText, chatTextSize, 0);
    }

    public void appendPlayerUpdateBlock(stream str) {
        if (!updateRequired && !chatTextUpdateRequired) return;        // nothing required
        int updateMask = 0;
        if (chatTextUpdateRequired) updateMask |= 0x80;
        if (appearanceUpdateRequired) updateMask |= 0x10;
        if (hitUpdateRequired) updateMask |= 0x20;
        if (dirUpdateRequired) updateMask |= 0x40;

        if (updateMask >= 0x100) {
            // byte isn't sufficient
            updateMask |= 0x40;            // indication for the ClientHandler that updateMask is stored in a word
            str.writeByte(updateMask & 0xFF);
            str.writeByte(updateMask >> 8);
        } else str.writeByte(updateMask);

        // now writing the various update blocks itself - note that their order crucial
        if (chatTextUpdateRequired) appendPlayerChatText(str);
        if (appearanceUpdateRequired) appendPlayerAppearance(str);
        if (hitUpdateRequired) appendHitUpdate(str);
        if (dirUpdateRequired) appendDirUpdate(str);

        // TODO: add the various other update blocks

    }

    public void clearUpdateFlags() {
        updateRequired = false;
        chatTextUpdateRequired = false;
        appearanceUpdateRequired = false;
        hitUpdateRequired = false;
        dirUpdateRequired = false;
        IsStair = false;
    }


    protected static int newWalkCmdX[] = new int[walkingQueueSize];
    protected static int newWalkCmdY[] = new int[walkingQueueSize];
    protected static int tmpNWCX[] = new int[walkingQueueSize];
    protected static int tmpNWCY[] = new int[walkingQueueSize];
    protected static int newWalkCmdSteps = 0;
    protected static boolean newWalkCmdIsRunning = false;
    protected static int travelBackX[] = new int[walkingQueueSize];
    protected static int travelBackY[] = new int[walkingQueueSize];
    protected static int numTravelBackSteps = 0;

    public void preProcessing() {
        newWalkCmdSteps = 0;
    }

    // is being called regularily every 500ms - do any automatic player actions herein
    public abstract boolean process();

    public void postProcessing() {
        if (newWalkCmdSteps > 0) {
            // place this into walking queue
            // care must be taken and we can't just append this because usually the starting point (clientside) of
            // this packet and the current position (serverside) do not coincide. Therefore we might have to go
            // back in time in order to find a proper connecting vertex. This is also the origin of the character
            // walking back and forth when there's noticeable lag and we keep on seeding walk commands.
            int firstX = newWalkCmdX[0], firstY = newWalkCmdY[0];    // the point we need to connect to from our current position...

            // travel backwards to find a proper connection vertex
            int lastDir = 0;
            boolean found = false;
            numTravelBackSteps = 0;
            int ptr = wQueueReadPtr;
            int dir = misc.direction(currentX, currentY, firstX, firstY);
            if (dir != -1 && (dir & 1) != 0) {
                // we can't connect first and current directly
                do {
                    lastDir = dir;
                    if (--ptr < 0) ptr = walkingQueueSize - 1;

                    travelBackX[numTravelBackSteps] = walkingQueueX[ptr];
                    travelBackY[numTravelBackSteps++] = walkingQueueY[ptr];
                    dir = misc.direction(walkingQueueX[ptr], walkingQueueY[ptr], firstX, firstY);
                    if (lastDir != dir) {
                        found = true;
                        break;        // either of those two, or a vertex between those is a candidate
                    }

                } while (ptr != wQueueWritePtr);
            } else found = true;    // we didn't need to go back in time because the current position
            // already can be connected to first

            if (!found) {
                println_debug("Fatal: couldn't find connection vertex! Dropping packet.");
                disconnected = true;
            } else {
                wQueueWritePtr = wQueueReadPtr;        // discard any yet unprocessed waypoints from queue

                addToWalkingQueue(currentX, currentY);    // have to add this in order to keep consistency in the queue

                if (dir != -1 && (dir & 1) != 0) {
                    // need to place an additional waypoint which lies between walkingQueue[numTravelBackSteps-2] and
                    // walkingQueue[numTravelBackSteps-1] but can be connected to firstX/firstY

                    for (int i = 0; i < numTravelBackSteps - 1; i++) {
                        addToWalkingQueue(travelBackX[i], travelBackY[i]);
                    }
                    int wayPointX2 = travelBackX[numTravelBackSteps - 1], wayPointY2 = travelBackY[numTravelBackSteps - 1];
                    int wayPointX1, wayPointY1;
                    if (numTravelBackSteps == 1) {
                        wayPointX1 = currentX;
                        wayPointY1 = currentY;
                    } else {
                        wayPointX1 = travelBackX[numTravelBackSteps - 2];
                        wayPointY1 = travelBackY[numTravelBackSteps - 2];
                    }
                    // we're coming from wayPoint1, want to go in direction wayPoint2 but only so far that
                    // we get a connection to first

                    // the easiest, but somewhat ugly way:
                    // maybe there is a better way, but it involves shitload of different
                    // cases so it seems like it isn't anymore
                    dir = misc.direction(wayPointX1, wayPointY1, wayPointX2, wayPointY2);
                    if (dir == -1 || (dir & 1) != 0) {
                        println_debug("Fatal: The walking queue is corrupt! wp1=(" + wayPointX1 + ", " + wayPointY1 + "), " +
                                "wp2=(" + wayPointX2 + ", " + wayPointY2 + ")");
                    } else {
                        dir >>= 1;
                        found = false;
                        int x = wayPointX1, y = wayPointY1;
                        while (x != wayPointX2 || y != wayPointY2) {
                            x += misc.directionDeltaX[dir];
                            y += misc.directionDeltaY[dir];
                            if ((misc.direction(x, y, firstX, firstY) & 1) == 0) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            println_debug("Fatal: Internal error: unable to determine connection vertex!" +
                                    "  wp1=(" + wayPointX1 + ", " + wayPointY1 + "), wp2=(" + wayPointX2 + ", " + wayPointY2 + "), " +
                                    "first=(" + firstX + ", " + firstY + ")");
                        } else addToWalkingQueue(wayPointX1, wayPointY1);
                    }
                } else {
                    for (int i = 0; i < numTravelBackSteps; i++) {
                        addToWalkingQueue(travelBackX[i], travelBackY[i]);
                    }
                }

                // now we can finally add those waypoints because we made sure about the connection to first
                for (int i = 0; i < newWalkCmdSteps; i++) {
                    addToWalkingQueue(newWalkCmdX[i], newWalkCmdY[i]);
                }

            }
            isRunning = newWalkCmdIsRunning || isRunning2;
        }
    }

    public void kick() {
        isKicked = true;
    }

    protected int hitDiff = 0;
    protected boolean hitUpdateRequired = false;
    protected boolean IsDead = false;
    protected int NewHP = 100;
    protected boolean SafeMyLife = false;
    protected boolean IsStair = false;
    protected boolean IsDeadTeleporting = false;
    protected boolean IsDeadTimer = false;

    protected void appendHitUpdate(stream str) {
        try {
            str.writeByte(hitDiff); // What the perseon got 'hit' for
            if (hitDiff > 0) {
                str.writeByteA(1); // 0: red hitting - 1: blue hitting
            } else {
                str.writeByteA(0); // 0: red hitting - 1: blue hitting
            }
            NewHP = (playerLevel[playerHitpoints] - hitDiff);
            if ((playerLevel[playerHitpoints] - hitDiff) <= 0) {
                NewHP = 0;
                IsDead = true;
            }
            str.writeByteC(NewHP); // Their current hp, for HP bar
            str.writeByte(getLevelForXP(playerXP[playerHitpoints])); // Their max hp, for HP bar
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getLevelForXP(int exp) {
        int points = 0;
        int output = 0;

        for (int lvl = 1; lvl <= 99; lvl++) {
            points += Math.floor((double) lvl + 300.0 * Math.pow(2.0, (double) lvl / 7.0));
            output = (int) Math.floor(points / 4);
            if (output >= exp)
                return lvl;
        }
        return 0;
    }

    public void appendDirUpdate(stream str) {
        if (playerMD != -1) {
            /*str.writeBits(2, 1);		// updateType
               str.writeBits(3, misc.xlateDirectionToClient[playerMD]);
               if(updateRequired) {
                   str.writeBits(1, 1);		// tell ClientHandler there's an update block appended at the end
               } else {
                   str.writeBits(1, 0);
               }*/
            str.writeWord(playerMD);
            playerMD = -1;
        }
    }

    public boolean[] IsDropped = new boolean[server.itemHandler.MaxDropItems];
    public boolean[] MustDelete = new boolean[server.itemHandler.MaxDropItems];
    public boolean IsDropping = false;

    //PM Stuff
    public abstract boolean isinpm(long l);

    public abstract void loadpm(long l, int world);

    public abstract void pmupdate(int pmid, int world);

    public int Privatechat = 0;

    public abstract void sendpm(long name, int rights, byte[] chatmessage, int messagesize);

    public long friends[] = new long[200];
    public long ignores[] = new long[100];
    public boolean IsPMLoaded = false;

    public int playerIsMember;
    public int playerMessages;
    public String playerLastConnect;
    public int playerLastLogin;
    public int playerEnergy;
    public int playerEnergyGian;
    public int playerLook[] = new int[6];
    public boolean IsUsingSkill = false;
    public int playerBonus[] = new int[12];
    public int StrPotion = 0;
    public int StrPrayer = 0;
    public int FightType = 1;
    public int playerMaxHit = 0;
    public int playerSE = 0x328; //SE = Standard Emotion
    public int playerSEW = 0x333; //SEW = Standard Emotion Walking
    public int playerSER = 0x338; //SER = Standard Emotion Run
    public int playerSEA = 0x326; //SEA = Standard Emotion Attack
    public int playerMD = -1;
    protected boolean dirUpdateRequired = false;
    public boolean IsCutting = false;
    public boolean WannePickUp = false;
    public boolean IsInWilderness = false;
    public boolean IsAttacking = false;
    public boolean IsMining = false;
    public boolean IsAttackingNPC = false;
    public int attacknpc = -1;
    public int Essence;
    public boolean IsShopping = false;
    public int MyShopID = 0;
    public boolean UpdateShop = false;
    public boolean RebuildNPCList = false;
    public int IsSnowing = 0;
    public int NpcDialogue = 0;
    public int NpcTalkTo = 0;
    public boolean NpcDialogueSend = false;
    public int NpcWanneTalk = 0;
    public boolean IsBanking = false;
    public int WanneTrade = 0;
    public int WanneTradeWith = 0;
    public boolean TradeConfirmed = false;
    public boolean AntiTradeScam = false;
    public int playerFollow[] = new int[PlayerHandler.maxPlayers];
    public int playerFollowID = 0;
    public int DirectionCount = 0;
    public boolean playerAncientMagics = false;
    public String playerServer;
    public int playerGameTime;
    public int playerGameCount;

}