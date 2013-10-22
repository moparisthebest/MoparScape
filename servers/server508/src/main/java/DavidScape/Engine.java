package DavidScape;

import DavidScape.io.FileManager;
import DavidScape.io.Frames;
import DavidScape.io.Login;
import DavidScape.io.Packets;
import DavidScape.io.packets.Assault;
import DavidScape.io.packets.bountyHunter;
import DavidScape.npcs.NPC;
import DavidScape.npcs.combat.NPCPlayerCombat;
import DavidScape.npcs.loading.LoadNPCLists;
import DavidScape.npcs.loading.NPCList;
import DavidScape.npcs.update.NPCMovement;
import DavidScape.npcs.update.NPCUpdate;
import DavidScape.players.Player;
import DavidScape.players.PlayerFollow;
import DavidScape.players.castlewars.CastleWarsFL;
import DavidScape.players.combat.PlayerCombat;
import DavidScape.players.combat.PlayerNPCCombat;
import DavidScape.players.items.PlayerBank;
import DavidScape.players.items.PlayerItems;
import DavidScape.players.items.PlayerTrade;
import DavidScape.players.objectLoader;
import DavidScape.players.update.PlayerMovement;
import DavidScape.players.update.PlayerUpdate;
import DavidScape.util.Misc;
import DavidScape.util.ShopHandler;
import DavidScape.world.items.Items;
import DavidScape.world.mapdata.MapData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.Socket;


public class Engine implements Runnable {

    /**
     * When a new player logs in, a new player is created and stored in this array.
     * <p>The server cannot exceed 2000 players.
     * The id 0 cannot be used as it is not handled by the client corrently.
     */
    public static Player[] players = new Player[2000];
    /**
     * Max id an NPC can have loaded out of the npclist config.
     */
    public static int maxListedNPCs = 8041;

    /**
     * When a new NPC is created, it is stored in this array.
     * <p>There can not be more than 5000 NPCs spawned at a time.
     * The id 0 cannot be used as it is not handled by the client corrently.
     */
    public static NPC[] npcs = new NPC[50000];
    public static int FightPitTimer = 120;
    public static int playersingame = 0;
    public static int constPlayers = 0;
    public static int sR = 0;
    public static int SaradominP = 0;
    public static int ZamorakP = 0;
    public static int pdT = -1;
    public static int[] houseX = {2828, 2816, 2815, 2805, 3234, 3235, 3230, 3228, 3219, 3204, 3128, 3088, 3102, 3089, 3098, 3092, 3092, 3093, 3100, 2635, 2652, 2659, 2672, 2672, 2674, 2615, 2616, 2758, 2757, 2606, 2563, 2580};
    public static int[] houseY = {3450, 3438, 3448, 3452, 3207, 3199, 3235, 3234, 3265, 3245, 3247, 3250, 3258, 3258, 3271, 3269, 3273, 3274, 3276, 3319, 3312, 3319, 3308, 3301, 3314, 3303, 3303, 3482, 3482, 3219, 3082, 3297};
    public static int[] hMoveX = {-1, 0, 0, 1, -1, 0, 0, 1, 1, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0, -1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, -1};
    public static int[] hMoveY = {0, 1, 1, 0, 0, -1, 1, 0, 0, -1, -1, 1, 0, 0, -1, -1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, -1, 0, 0};
    public static String[] houseOwners = {"Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Woods", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Nobody", "Justinxg27", "Nobody", "Nobody", "Nobody", "Nobody", "Alla", "Dudette551", "Dudette551", "Richman55", "Richman55", "Gizmo", "L Rozanwater", "Mother Earth and Abbo"};
    public static int[] itemsToDrop;
    public static int[] itemsToDropN;
    public static int[] partyItems = new int[40];
    public static int[] partyItemsN = new int[40];
    public static int[] generalN = new int[40];
    public static int[] general = new int[40];
    public static int[] shop2 = {590, 946, 1359, 1275, 12844, 301, 305, 307, 311, 11259};
    public static int[] shop2N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop2p = {1, 1, 1, 1, 60, 1, 1, 1, 1, 1};

    public static int[] shop3 = {1135, 1099, 1065, 2499, 2493, 2487, 2501, 2495, 2489, 2503, 2497, 2491, 10382, 10378, 10380, 10376, 10390, 10386, 10388, 10384, 10374, 10370, 10372, 10368, 2581, 2577, -1};
    public static int[] shop3N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop3p = {100, 100, 100, 205, 205, 205, 400, 400, 400, 605, 605, 605, 800, 800, 800, 800, 300, 800, 800, 800, 800, 800, 800, 800, 905, 905, 0};

    public static int[] shop4 = {11335, 11283, 11732, 3140, 4087, 1187, 4151, 391, 1305, 4587, 5698, 10828, 1149, 8850, 121, 113, 11758, 4675};
    public static int[] shop4N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop4p = {15000, 34500, 3500, 50000, 25000, 13500, 16000, 500, 950, 1000, 1000, 3500, 5000, 2500, 350, 350, 5000, 12500};

    public static int[] shop5 = {1321, 1323, 1325, 1327, 1329, 1331, 1333, 1117, 1115, 1119, 1121, 1125, 1123, 1127, 1075, 1067, 1069, 1077, 1071, 1073, 1079, 1155, 1153, 1157, 1165, 1159, 1161, 1163, 1191, 1193, 1195, 1197, 1199, 1201};
    public static int[] shop5N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop5p = {30, 50, 70, 100, 230, 350, 500, 30, 50, 70, 100, 230, 350, 500, 20, 30, 50, 80, 150, 300, 400, 10, 30, 50, 70, 130, 200, 300, 20, 40, 60, 120, 200, 300};

    public static int[] shop6 = {1052, 6585, 775, 1837, 2643, 3061, 10075, 10065, 10067, 10069, 10071, 6568, 1704, 10402, 10406, 10748, 10750, 13192, 13190};
    public static int[] shop6N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop6p = {100, 1750, 50, 50, 500, 50, 50, 50, 50, 50, 50, 500, 250, 3250, 3500, 3250, 3500, 4000, 4000};

    public static int[] shop7 = {1755, 1623, 1621, 1619, 1617, 1631, 6571, 1733, 1734, 1746, 2505, 2507, 2509, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};  //CRAFTING
    public static int[] shop7N = {1, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop7p = {1, 2, 3, 4, 5, 10, 15, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static int[] shop8 = {4155, 13263, 13290, 7159, 4156, 4158, 4170, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static int[] shop8N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop8p = {10, 4500, 1500, 50, 400, 400, 1900, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


    public static int[] shop9 = {1038, 1040, 1042, 1044, 1046, 1048, 1050, 1057, 1055, 1053, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static int[] shop9N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop9p = {9900, 9900, 9900, 9900, 9900, 9900, 9900, 9900, 9900, 9900, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static int[] shop10 = {4708, 4712, 4714, 4710, 4716, 4720, 4722, 4718, 4724, 4728, 4730, 4726, 4730, 4734, 4736, 4732, 4745, 4749, 4751, 4747, 4753, 4757, 4759, 4755, 4740, 7462, 7461};
    public static int[] shop10N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop10p = {2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 20, 750, 400};


    public static int[] shop11 = {12047, 12043, 12059, 12808, 12073, 12075, 12077, 12079, 12081, 12083, 12802, 12804, 12806, 12776, 12788, 12786, 12796, 12822, 12790, 12469, 12471, 12473, 12475, 12210, 12216, 12219, 12222};
    public static int[] shop11N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop11p = {10, 20, 20, 30, 40, 40, 40, 50, 50, 70, 70, 80, 80, 90, 110, 120, 120, 120, 150, 7000, 7000, 7000, 700, 100, 250, 500, 1000};

    public static int[] shop12 = {13614, 13615, 13616, 13617, 13618, 13619, 13620, 13621, 13622, 13623, 13624, 13625, 13626, 13627, 13629, 13630, 13631, 13632, 13633, 13634, 13635, 13636, 13637, 13638, 13639, 13640, 13642};
    public static int[] shop12N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop12p = {500, 500, 500, 500, 500, 1500, 1500, 1500, 1500, 1500, 2500, 2500, 2500, 2500, 2500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500};

    public static int[] shop13 = {7806, 7807, 7808, 7809, 6106, 6107, 6108, 6109, 6110, 6111, 4345, 6856, 6857, 6858, 6859, 6860, 6861, 6862, 6863, 8942, 3101, 1361, 1231, 1337, 4353, 1203, 4331};
    public static int[] shop13N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
    public static int[] shop13p = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10, 5000, 5000, 5000, 5000, 5000, 5000, 5000};

    public static int[] shop14 = {4566, 5553, 5554, 5555, 5556, 5557, 2653, 2655, 2657, 2659, 2661, 2663, 2665, 2667, 2669, 2671, 2673, 2675, 3481, 3483, 3486, 3488, 12222, 534, 3101, 1337, 1361};
    public static int[] shop14N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 1, 5, 5};
    public static int[] shop14p = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000, 1000, 5000};

    public static int[] shop16 = {8798, 8799, 8800, 8802, 8803};
    public static int[] shop16N = {10, 10, 10, 10, 10};
    public static int[] shop16p = {5000, 5000, 5000, 5000, 5000};

    public static int[] shop18 = {4089, 4091, 4093, 4095, 4097, 4099, 4101, 4103, 4105, 4107, 4109, 4111, 4113, 4115, 4117, 6918, 6916, 6920, 6922, 6924, 3840, 3842, 3844, 6889, 4675, 6908, 6910, 6912, 6914};
    public static int[] shop18N = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};

    public static int restartT = 6000;
    public static int CWarsTimer = 240;
    public static int CWGameTime = -1;
    public static int geT = 10;
    public static int geT1 = 100;
    public static int SaradominScore = 0;
    public static int ZamorakScore = 0;
    public static int ZamorakTeam = 0;

    public static int SaradominTeam = 0;
    public static boolean SaradominFlag = false;
    public static boolean ZamorakFlag = false;
    public static ShopHandler shopHandler = new ShopHandler();
    /**
     * Contains NPC data such as respawn times, names, examines, etc.
     */
    public static NPCList[] npcLists = new NPCList[maxListedNPCs];

    /**
     * The class thread.
     */
    private Thread engineThread = new Thread(this);
    /**
     * Set true if the engine should run.
     */
    private boolean engineRunning = true;

    /**
     * Handles packets recieved from the server.
     */
    public static Packets packets = new Packets();
    public static objectLoader oL = new objectLoader();
    public static Assault Assult = new Assault();


    /**
     * Loads and stores map data for map regions.
     */
    public static MapData mapData = new MapData();


    /**
     * Contains a method for every known frame.
     */
    public static Frames frames = new Frames();

    /**
     * Handles player movement.
     */
    public static PlayerMovement playerMovement = new PlayerMovement();


    /**
     * Contains all item information.
     */
    public static Items items;

    /**
     * Handles player updates.
     */
    public static PlayerUpdate playerUpdate = new PlayerUpdate();

    /**
     * Handles NPC movement.
     */
    public static NPCMovement npcMovement = new NPCMovement();


    /**
     * Handles NPC updates.
     */
    public static NPCUpdate npcUpdate = new NPCUpdate();

    /**
     * Handles players items.
     */
    public static PlayerItems playerItems = new PlayerItems();

    /**
     * Handles file saving and loading.
     */
    public static FileManager fileManager = new FileManager();
    public static PlayerBank playerBank = new PlayerBank();
    public static PlayerCombat playerCombat = new PlayerCombat();
    public static PlayerFollow playerFollow = new PlayerFollow();
    public static PlayerNPCCombat playerNPCCombat = new PlayerNPCCombat();
    public static NPCPlayerCombat npcPlayerCombat = new NPCPlayerCombat();
    public static CastleWarsFL cwFl = new CastleWarsFL();
    public static bountyHunter BH = new bountyHunter();


    /**
     * player trading. - by mad turnip
     */
    public static PlayerTrade playerTrade = new PlayerTrade();

    /**
     * Constructs a new Engine and loads item and NPC data from configs.
     */

    public static void saveHouses() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(DavidScape.Server.workingDir + "data/houses.txt"));
            for (String s : houseOwners) {
                out.write(s);
                out.newLine();
                out.flush();
            }
        }
        catch (Exception e) {
            System.out.println("Error writing house file!");
        }
    }

    public Engine() {
        for (int i = 0; i < 40; i++) {
            general[i] = -1;
            generalN[i] = 0;
            partyItems[i] = -1;
            partyItemsN[i] = 0;
        }
        items = new Items(this);
        LoadNPCLists lnl = new LoadNPCLists();

        lnl = null;
        engineThread.start();
    }

    /**
     * The thread's process.
     * <p>This processes at a rate of 100 milliseconds, and the processing time
     * is subtracted from the amount of time it sleeps to keep at a rate of 100
     * milliseonds. Packets are checked every 100 milliseconds for faster response time,
     * and most other updates are processed every 600 milliseconds.
     */
    public void run() {
        long lastEntityUpdate = 0;
        long curTime;
        while (engineRunning) {
            if (pdT % 100 == 0 && pdT != 0) {
                for (Player p2 : players) {
                    if (p2 != null)
                        p2.frames.sendMessage(p2, "<col=00CC33>[Server] A Drop Party is starting in " + (pdT / 100) * 10 + " seconds! ::party");
                }
            }
            if (pdT == 0) {
                try {
                    for (int i = 0; i < 40; i++) {
                        if (i < 0 || partyItems[i] < 1 || partyItemsN[i] < 1) {
                            continue;
                        }
                        int x = 3053 - Misc.random(13);
                        int y = 3373 + Misc.random(9);
                        if (!items.itemLists[partyItems[i]].itemStackable && partyItemsN[i] > 1) {
                            for (int h = 0; h < partyItemsN[i]; h++) {
                                while (testPartyDrop(x, y)) {
                                    x = 3053 - Misc.random(13);
                                    y = 3373 + Misc.random(9);
                                }
                                Engine.items.createGroundItem(partyItems[i], 1, x, y, 0, "");
                                x = 3053 - Misc.random(13);
                                y = 3373 + Misc.random(9);
                            }
                        } else {
                            while (testPartyDrop(x, y)) {
                                x = 3053 - Misc.random(13);
                                y = 3373 + Misc.random(9);
                            }
                            Engine.items.createGroundItem(partyItems[i], partyItemsN[i], x, y, 0, "");
                            x = 3053 - Misc.random(13);
                            y = 3373 + Misc.random(9);
                        }
                        partyItems[i] = -1;
                        partyItemsN[i] = 0;
                    }
                    pdT = -1;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (pdT > 0) pdT -= 1;
            curTime = System.currentTimeMillis();
            connectAwaitingPlayers();
            packets.parseIncomingPackets();
            if (curTime - lastEntityUpdate >= 600) {
                items.process();
                if (FightPitTimer > 0) FightPitTimer -= 1;
                shopHandler.process();
                if (FightPitTimer == 0) {
                    FightPitTimer = -1;
                }
                if (FightPitTimer == -1 && playersingame == 0) {
                    FightPitTimer = 120;
                }
                if (CWarsTimer > 0) CWarsTimer -= 1;
                if (CWarsTimer == 0) {
                    CWarsTimer = -1;
                    CWGameTime = 600;
                    ZamorakScore = 0;
                    SaradominScore = 0;
                }
                if (CWGameTime > 0) CWGameTime -= 1;

                if (CWGameTime == 0) {
                    CWarsTimer = 240;
                    CWGameTime = -1;
                }
                Player z = players[ZamorakP];
                Player s = players[SaradominP];
                if (z == null) {
                    ZamorakFlag = false;
                    ZamorakP = 0;
                }
                if (ZamorakP > 0) {
                    ZamorakFlag = true;
                }
                if (s == null) {
                    SaradominFlag = false;
                    SaradominP = 0;
                }
                if (SaradominP > 0) {
                    SaradominFlag = true;
                }
                for (Player p : players) {
                    // Proccess and player movement, removing disconnected players.
                    if (p == null || !p.online) {
                        continue;
                    }
                    if (p.disconnected[0] && p.disconnected[1]) {
                        removePlayer(p.playerId);
                        continue;
                    }
                    if (p.interfaceId != 762 &&
                            p.interfaceId != 335 &&
                            p.interfaceId != 334 &&
                            p.interfaceId != 620) {
                        p.frames.restoreTabs(p);
                    }
                    p.process();

                    playerMovement.getNextPlayerMovement(p);
                }
                for (Player p : players) {
                    // Update players.
                    if (p == null || !p.online) {
                        continue;
                    }
                    playerUpdate.update(p);
                }
                for (Player p : players) {
                    // Reset masks and send bytes.
                    if (p == null || !p.online) {
                        continue;
                    }
                    playerUpdate.clearUpdateReqs(p);
                    Server.socketListener.writeBuffer(p);
                }
                for (NPC n : npcs) {
                    if (n == null) {
                        continue;
                    }
                    npcUpdate.clearUpdateMasks(n);
                }
                for (NPC n : npcs) {
                    if (n == null) {
                        continue;
                    }
                    n.process();
                    if (!n.isDead) {
                        if (n.randomWalk && !n.attackingPlayer) {
                            npcMovement.randomWalk(n);
                        }
                    } else {
                        if (!n.deadEmoteDone) {
                            n.requestAnim(n.deathEmote, 0);
                            n.deadEmoteDone = true;
                            n.combatDelay = 3;
                        } else if (n.deadEmoteDone && !n.hiddenNPC && n.combatDelay <= 0) {
                            n.npccanloot = true;
                            n.npcDied(Engine.players[1], n.npcType, n.absX, n.absY);
                            n.hiddenNPC = true;
                        } else if (n.deadEmoteDone && !n.hiddenNPC
                                && n.combatDelay <= 0) {
                            n.hiddenNPC = true;
                        } else if (n.hiddenNPC && n.respawnDelay <= 0) {
                            if (n.needsRespawn) {
                                newNPC(n.npcType, n.makeX, n.makeY,
                                        n.heightLevel, n.moveRangeX1,
                                        n.moveRangeY1, n.moveRangeX2,
                                        n.moveRangeY2, true);
                            }
                            npcs[n.npcId] = null;
                            rebuildNPCs();
                        }
                    }
                    lastEntityUpdate = curTime;
                }
            }
            try {
                Thread.sleep(100 - (System.currentTimeMillis() - curTime));
            } catch (Exception e) {
            }
        }
    }

    /**
     * Assign a player to the connection.
     * <p>When a new connection is recieved, a new Player class is created which waits for the run method
     * to run the Login class to finish the connection. If the id is 0, or the server is full, no
     * connection is made and the socket is closed.
     *
     * @param socket The socket the new player is connected to.
     * @param id     The id which the new player will be created at.
     */
    public void addConnection(Socket socket, int id) {
        if (id == 0) {
            Server.socketListener.removeSocket(id);
            return;
        }
        try {
            players[id] = new Player(socket, id);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean testPartyDrop(int X, int Y) {
        if (X == 3051) {
            if (Y == 3375 || Y == 3381) {
                return true;
            }
        }
        if (X == 3040) {
            if (Y == 3375 || Y == 3381) {
                return true;
            }
        }
        if (X > 3041 && X < 3050) {
            if (Y == 3378) {
                return true;
            }
        }
        return false;
    }

    /**
     * Run the login class to finish a new connection.
     * <p>Loops through all the players looking for any that are not online.
     * Because the socket can't cause the server to process slower, there
     * are multiple login stages, and the player will go through the login class
     * two or three times before fully logging in.
     */
    public void connectAwaitingPlayers() {
        Login login = null;

        for (Player p : players) {
            if (p == null || p.online) {
                continue;
            }
            if (login == null) {
                login = new Login();
            }
            login.login(p);
            if (!p.online && p.loginStage == -1
                    || (System.currentTimeMillis() - p.loginTimeout) >= 15000) {

                /*
                 * Remove the player if he failed to connect or it was the update server.
                 */
                removePlayer(p.playerId);
            }
        }
    }

    /**
     * Discard a player with the specified id in the player array.
     * <p>This method should only be called when the player is ready to be removed.
     * This nulls closes the players socket and then nulls the player.
     *
     * @param id The position in the player array that should be removed.
     */
    public void removePlayer(int id) {
        if (players[id] == null) {
            return;
        }
        if (players[id].online) {
            try {
                fileManager.saveCharacter(players[id]);
            } catch (Exception e) {
            }
        }
        players[id].destruct();
        players[id] = null;
        Server.socketListener.removeSocket(id);
    }

    /**
     * This method tells every player to re-add any NPCs within distance.
     * <p>By calling this method, with the next NPC update it will discard the NPC list and
     * re-loop through every NPC and re-add them if they fit the specifications.
     */
    public void rebuildNPCs() {
        for (Player p : players) {
            if (p == null) {
                continue;
            }
            p.rebuildNPCList = true;
        }
    }

    /**
     * Returns a players id based on their username, or 0 if the player is not online.
     * <p>This will check if a player is online based on searching every characters username,
     * and comparing it to playerName. Because index 0 is not used and won't throw an
     * ArrayoutofBounds exception error, 0 is returned if the username isn't found.
     *
     * @param playerName The name to compare with the other online player names.
     * @return Returns the index of the player with that username, or 0 if the username isn't found.
     */
    /* public static int getIdFromName(String playerName) {
    playerName.replaceAll("_", " ");
    for (Player p : players) {
    if (p == null) {
    continue;
    }
    if (p.username.equalsIgnoreCase(playerName)) {
    return p.playerId;
    }
    }
    return 0;
    }*/
    public static int getIdFromName(String playerName) {
        playerName.replaceAll("_", " ");
        for (Player p : players) {
            if (p == null) {
                continue;
            }
            if (p.username.equalsIgnoreCase(playerName)) {
                return p.playerId;
            }
        }
        return 0;
    }

    /**
     * boolean to check if player is in wild.
     */
    public static boolean wildernessArea(int absX, int absY) {
        return (absX >= 2363 && absY >= 3071 && absX <= 2432 && absY <= 3135 || absX >= 2370 && absY >= 5128 && absX <= 2426 && absY <= 5167 || absX >= 2940 && absX <= 3395 && absY >= 3524 && absY <= 4000 || absX >= 3362 && absY >= 3228 && absX <= 3391 && absY <= 3241);

    }

    public static boolean cwarea(int absX, int absY) {
        return (absX >= 2368 && absX <= 2428 && absY >= 3072 && absY <= 3132);
    }


    /**
     * Returns the description of npcId.
     *
     * @param npcId The NPC to get the examine for.
     * @return Returns the examine.
     */
    public String getNPCDescription(int npcId) {
        if (npcId == -1 || npcId >= maxListedNPCs) {
            return new String("An NPC.");
        }
        if (npcLists[npcId] != null) {
            return (npcLists[npcId].examine);
        }
        return new String("NPC " + npcId);
    }

    /**
     * Check player count.
     */
    public static int getPlayerCount() {
        int count = 0;

        for (Player p : players) {
            if (p != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Spawn a new NPC.
     * <p>This will create a new visible NPC, with the default values from its list and the parameters.
     *
     * @param type         The type of NPC this is, such as 50 for the King black dragon.
     * @param absX         The absolute x coordinate to spawn the NPC.
     * @param absY         The absolute y coordinate to spawn the NPC.
     * @param height       The height level to set the NPC.
     * @param mRXY1        The distance it can walk west; must be lower than absX to have any effect.
     * @param mRY1         The distance it can walk south; must be lower than absY to have any effect.
     * @param mRX2         The distance it can walk east; must be higher than absX to have any effect.
     * @param mRY2         The distance it can walk north; must be higher than absY to have any effect.
     * @param needsRespawn Set to true if the NPC should respawn after it dies.
     * @return Returns the index the NPC was placed at.
     */
    public static int newNPC(int type, int absX, int absY, int height, int mRX1, int mRY1, int mRX2, int mRY2, boolean needsRespawn) {
        int index = -1;

        for (int i = 1; i < npcs.length; i++) {
            if (npcs[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Misc.println("Max number of NPCs spawned.");
            return -1;
        }
        NPC n = npcs[index] = new NPC(type, index);

        n.absX = absX;
        n.absY = absY;
        n.makeX = absX;
        n.makeY = absY;
        n.heightLevel = height;
        n.moveRangeX1 = mRX1;
        n.moveRangeY1 = mRY1;
        n.moveRangeX2 = mRX2;
        n.moveRangeY2 = mRY2;
        n.needsRespawn = needsRespawn;
        n.requestFaceCoords(n.absX, (n.absY - 1));
        NPCList nl = npcLists[type];

        if (nl != null) {
            n.name = nl.npcName;
            n.combatLevel = nl.combatLevel;
            n.maxHP = nl.maxHP;
            n.currentHP = n.maxHP;
            n.maxHit = nl.maxHit;
            n.atkType = nl.atkType;
            n.weakness = nl.weakness;
            n.respawnDelay = nl.respawnDelay;
            n.attackEmote = nl.attackEmote;
            n.defendEmote = nl.defendEmote;
            n.deathEmote = nl.deathEmote;
            n.attackDelay = nl.attackDelay;
            n.requestFaceCoords(n.absX, (n.absY - 1));
        }
        n.requestFaceCoords(n.absX, (n.absY - 1));
        return index;

    }

    public static int newSummonNPC(int type, int absX, int absY, int height, int mRX1, int mRY1, int mRX2, int mRY2, boolean needsRespawn, int dude) {
        int index = -1;

        for (int i = 1; i < npcs.length; i++) {
            if (npcs[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Misc.println("Max number of NPCs spawned.");
            return -1;
        }
        NPC n = npcs[index] = new NPC(type, index);

        n.absX = absX;
        n.absY = absY;
        n.makeX = absX;
        n.makeY = absY;
        n.summoned = true;
        n.heightLevel = height;
        NPCList nl = npcLists[type];
        n.followPlayer = dude;
        Player p = Engine.players[dude];
        p.FamiliarID = n.npcId;
        n.owner = p;
        p.follower = n;
        if (type != 6901 && type != 6903 && type != 6905 && type != 6907) {
            p.requestAnim(1979, 0);
            n.requestGFX(1315, 0);
        }

        if (nl != null) {

            n.name = nl.npcName;
            n.combatLevel = nl.combatLevel;
            n.maxHP = nl.maxHP;
            n.currentHP = n.maxHP;
            n.maxHit = nl.maxHit;
            n.atkType = nl.atkType;
            n.weakness = nl.weakness;
            n.attackEmote = nl.attackEmote;
            n.defendEmote = nl.defendEmote;
            n.deathEmote = nl.deathEmote;
            n.attackDelay = nl.attackDelay;
        }
        return index;
    }
}
