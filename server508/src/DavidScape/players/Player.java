package DavidScape.players;


import DavidScape.Engine;
import DavidScape.Skills.Mining;
import DavidScape.Skills.Woodcutting;
import DavidScape.io.Frames;
import DavidScape.io.packets.NPCOption1;
import DavidScape.io.packets.Prayer;
import DavidScape.net.PlayerSocket;
import DavidScape.npcs.NPC;
import DavidScape.players.combat.MagicNPC;
import DavidScape.players.items.PlayerItems;
import DavidScape.players.items.PlayerWeapon;
import DavidScape.players.ptrade.PTrade;
import DavidScape.util.Misc;
import DavidScape.util.Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class Player {
    public long lastVeng;
    public int isLunar = 0;
    public boolean graveStone = false;
    public int gsH = 0;
    public int turnEmote = 0x336;
    public int gsX;
    public NPC follower;
    public int gsY;
    public int constInterface = 0;
    public int lastObjectX = 0;
    public int lastObjectY = 0;
    public ArrayList<Integer> gsItems = new ArrayList<Integer>();
    public ArrayList<Integer> gsEquip = new ArrayList<Integer>();
    public ArrayList<Integer> gsItemsN = new ArrayList<Integer>();
    public ArrayList<Integer> gsEquipN = new ArrayList<Integer>();
    public int waveID = 1;
    public int idle;
    public boolean jailed;
    public int jailTimer = -1;
    public int[] shopItems = new int[40];
    public int[] shopItemsN = new int[40];
    public int taken;
    public boolean customMapdata = false;
    public int graveStoneTimer;
    public int actionButtonTimer;
    public int objectTimer;
    public int rewards;
    public int reqY;
    public int reqX;
    public int animTimer = 0;
    public boolean correctClient;
    public boolean houseLocked = true;
    public int iA;
    public boolean[] barrows = {false, false, false, false, false, false};

    public boolean i65() {
        if (iA == 1)
            return true;
        else
            return false;
    }

    public boolean inAssault = i65();
    public boolean waiting = false;
    public boolean vengOn = false;

    public void showInputInterface(Player p, int inputId, String question, int itemId) {
        p.inputId = inputId;
        p.inputItemId = itemId;
        p.frames.runScript(p, 108, new Object[]{question}, "s");
    }

    public void showInputInterface2(Player p, int inputId, String question, int itemIndex) {
        p.inputId = inputId;
        p.inputItemIndex = itemIndex;
        p.frames.runScript(p, 108, new Object[]{question}, "s");
    }

    public void showInputInterface3(Player p, int inputId, String question) {
        p.inputId = inputId;
        p.frames.runScript(p, 110, new Object[]{question}, "s");
    }

    public void showInputInterface4(Player p, int inputId, String question) {
        p.inputId = inputId;
        p.frames.runScript(p, 109, new Object[]{question}, "s");
    }

    public int currentSlot = 0;

    public int gettotalz() {
        return getLevelForXP(0) + getLevelForXP(1) + getLevelForXP(2) + getLevelForXP(3) +
                getLevelForXP(4) + getLevelForXP(5) + getLevelForXP(6) + getLevelForXP(7) +
                getLevelForXP(8) + getLevelForXP(9) + getLevelForXP(10) + getLevelForXP(11) +
                getLevelForXP(12) + getLevelForXP(13) + getLevelForXP(14) + getLevelForXP(15) +
                getLevelForXP(16) + getLevelForXP(17) + getLevelForXP(18) + getLevelForXP(19) +
                getLevelForXP(20) + getLevelForXP(21) + getLevelForXP(22) + getLevelForXP(23);
    }

    public int inputId = -1;
    public int inputItemId = 0;
    public int inputItemIndex = 0;
    public MagicNPC magicNPC;
    public int modernDamageDelay = -1;
    public PTrade pTrade;
    public UserInput uinput = new UserInput(this);
    public int modernMagicDelay;
    public int isAncients = 0;
    public int geoffers = 0;
    public int secHit2;
    public int CV2;
    public int smithType;
    public boolean hasCannon = false;
    public int[] cannonC = {0, 0};
    public int[] sitems = new int[40];
    public int[] sitemsN = new int[1000];
    public int thirdHit2;
    public int fourHit2;

    public void dClaw3(Player p) {
        NPC n = Engine.npcs[p.attackNPC];
        requestAnim(2068, 0);
        requestGFX(274, 100);
        n.appendHit((thirdHit2), 0);
        n.appendHit((fourHit2), 0);
    }

    public int clawTimer2;
    public boolean UseClaws2;

    public boolean inAssault() {
        return (absX >= 1896 && absY >= 5452 && absX <= 1910 && absY <= 5488);
    }

    public int[] offerItem = new int[6];
    public int[] offerAmount = new int[6];
    public int[] currentAmount = new int[6];
    public int[] offerType = new int[6];
    public int[] offerPrice = new int[6];
    public int secHit;
    public int thirdHit;
    public int fourHit;
    public int clawTimer;
    public boolean UseClaws;

    public int[] partyA = new int[20]; //Party Add
    public int[] partyAN = new int[20]; //Party Add Amt
    public boolean party = false; //If person doing party. Used in shophandler

    public void partyAdd(int itemId) {
        if (itemId == -1) {
            return;
        }
        for (int i = 0; i < 31; i++)
            frames.setString(this, "Line " + i, 647, i);
        for (int i = 0; i < partyA.length; i++) {
            frames.sendMessage(this, "" + partyA[i]);
            if (partyA[i] == 0) {
                partyA[i] = itemId;
                partyAN[i] = 1;
                frames.setItems(this, 247, 21, 94, partyA, partyAN);
                return;
            }
        }
    }

    public int hasCollect = 0;
    public String[][] pgeSO = new String[110][5];//all sell the offers: 0 = item, 1 = amt, 2 = price, 3 = username
    public String[][] pgeBO = new String[110][5];//all buy the offers: 0 = item, 1 = amt, 2 = price, 3 = username
    public int modernSpell;
    public String[][] collects = new String[1001][3]; // 0 = item, 1 = amt 2 = string
    public String[][] collectsf = new String[1100][3]; // 0 = item, 1 = amt (f means final)
    public boolean usingAutoCast;
    public boolean starter = false;
    public boolean castAuto = false;
    public int randomSkill;
    public int chosenSkill;
    /**
     * If roomtype == garden {
     * 0 = Center
     * 1 = Small plant space 1
     * 2 = Small plant space 2
     * 3 = Big plant space 1
     * 4 = Small plant space 2
     * 5 = Tree space
     * 6 = Big tree space
     * }
     */
    public int roomSpots[][][][] = new int[4][13][13][10];
    /**
     * 0 = empty
     * 1 = parlour
     * 2 = garden
     */
    public int roomTypes[][][] = new int[4][13][13];
    /**
     * 1 = North
     * 2 = East
     * 3 = South
     * 4 = West
     */
    public int nextRoom[] = new int[3];

    public void randomEvent2() {
        if (chosenSkill == randomSkill) {
            frames.sendMessage(this, "Correct! You may continue.");
            Engine.playerItems.addItem(this, 995, 5);
            ActionTimer = 1;
        } else {
            disconnected[0] = true;
        }
    }

    public void randomEvent() {
        frames.showInterface(this, 134);
        frames.showChatboxInterface(this, 210);
        ActionTimer = 10000;
        randomSkill = Misc.random(23);
        frames.setString(this, "Please click on " + Misc.getSkillName(randomSkill) + ":", 210, 1);

    }

    public void openParty() {
        frames.sendMessage(this, "UNDER CONSTURCION");
    }

    public void fmwalk(int x, int y) {
        int firstX = x - (mapRegionX - 6) * 8;
        int firstY = y - (mapRegionY - 6) * 8;
        Engine.playerMovement.resetWalkingQueue(this);
        Engine.playerMovement.addStepToWalkingQueue(firstX - 1, firstY, this);
    }

    public static int maxPlayers = 2000;
    public int randomInt = 0;
    public boolean IsShopping = false;
    public boolean geb = false;// A GE boolean used through out the GE Class
    public int MyShopID = 0;
    public boolean UpdateShop = false;
    public NPCOption1 NPCS;


    public void collectItems(Player p, int item, int amt, int id) {
        if (Engine.playerItems.freeSlotCount(p) < 1) {
            frames.sendMessage(this, "Not enough inventory space to collect ANY items!");
        }
        if (Engine.playerItems.freeSlotCount(p) < amt && !Engine.items.stackable(item)) {
            frames.sendMessage(this, "Not enough inventory space to collect all items!");
        } else {
            Engine.playerItems.addItem(this, item, amt);
            p.collectsf[id][0] = "";
            p.collectsf[id][1] = "";
            File curFile = new File(DavidScape.Server.workingDir + "data/geoffers/collect/collect" + p.collectsf[id][2] + ".txt");
            p.hasCollect = 0;
            p.geoffers--;
            curFile.delete();
        }
    }

    static public String getContents(File aFile) {

        StringBuilder contents = new StringBuilder();

        try {
            BufferedReader input = new BufferedReader(new FileReader(aFile));
            try {
                String line = null;

                while ((line = input.readLine()) != null) {
                    contents.append(line);

                }
            }
            finally {
                input.close();
            }
        }
        catch (IOException ex) {

        }
        return contents.toString();
    }


    public int Update = 0;
    public int verificationCode = Misc.random(9999);
    public int LoadedBackup = 0;
    public int zkc = 0;
    public int bkc = 0;
    public int akc = 0;
    public int skc = 0;
    public int muted = 0;
    public int banned = 0;
    public int donecode = 0;
    public int DestroyItem = 1042;
    public int DestroyItemSlot = 1;
    public int TradeWithPerson = 0;
    public int QuestPoints = 0;
    public int FamiliarType = 0;
    public int DFStimer = 0;
    public int BoatTimer = -1;
    public int ThunderTimer = -1;
    public int DragonTimer = -1;
    public int CrashTimer = -1;
    public int FadeTimer = -1;
    public String password2 = "";
    public int HeadTimer = -1;
    public int member = 0;
    public boolean swapAsNote = false;
    public boolean noteItems = false;
    public int Hitter = 5;
    public int clanchat = 0;
    public int clanchannel = 0;
    public String clanname = "";
    public boolean usingHD;

    public void sendCoords(Player p, int x, int y) {
        if (p == null || stream == null || disconnected[0]) {
            return;
        }
        stream.createFrame(177);
        stream.writeByte(y);
        stream.writeByteS(x);
    }

    public int Choice = 0;
    public boolean logmessage = false;

    public boolean ClanGame = false;

    public int FamiliarID = 0;

    public int DragonSlayer = 0;

    /**
     * Destroy item arrays
     */
    public int[] destroyItem = new int[28];
    public int[] destroyItemAmt = new int[28];
    public int destroyItemInt;
    public int[] SaraPeople = new int[500];
    public int[] ZammyPeople = new int[500];
    public int CWTeam = 0;

    public boolean AtZamorakRoom() {
        if (absX >= 2409 && absY >= 9513 && absX <= 2432 && absY <= 9535) {
            return true;
        } else {
            return false;
        }
    }

    public boolean AtSaradominRoom() {
        if (absX >= 2367 && absY >= 9480 && absX <= 2394 && absY <= 9496) {
            return true;
        } else {
            return false;
        }
    }

    public boolean AtCastleWars() {
        if (absX >= 2363 && absY >= 3071 && absX <= 2432 && absY <= 3135) {
            return true;
        } else {
            return false;
        }
    }


//====================================FIGHT PITS===================================================
    public int FightEnemys = 0;
    public int PitGame = -1;
    public int[] FightPeople = new int[500];
    public static int rdage[] = {10330, 10332, 10334, 10336, 10338, 10340, 10342, 10344, 10346, 10348, 10350, 10352};

    public static int Age() {
        return rdage[(int) (Math.random() * rdage.length)];
    }

    public boolean GameStarted = false;

    public boolean AtWaitRoom() {
        if (absX >= 2394 && absY >= 5169 && absX <= 2404 && absY <= 5175) {
            return true;
        } else {
            return false;
        }
    }

    public boolean AtPits() {
        if (absX >= 2370 && absY >= 5128 && absX <= 2426 && absY <= 5167) {
            return true;
        } else {
            return false;
        }
    }

//====================================END OF FIGHT PITS===================================================

//====================================DUELING===================================================

    public boolean DuelReady = false;
    public int DuelPartner = 0;
    public boolean DuelCan = false;
    public int DuelTimer = -1;
    public int DuelX = 0;
    public int DuelY = 0;

    public void ResetDuel() {
        DuelReady = false;
        DuelPartner = 0;
        DuelCan = false;
        DuelTimer = -1;
        skulledDelay = -1;
    }

    public boolean AtDuel() {
        if (absX >= 3362 && absY >= 3228 && absX <= 3391 && absY <= 3241) {
            return true;
        } else {
            return false;
        }
    }


//===================================END OF DUELING==============================================

    public void restoreTabs(Player p) {
        for (int b = 16; b <= 21; b++) {
            p.frames.setInterfaceConfig(p, 746, b, false);
        }

        for (int a = 32; a <= 38; a++) {
            p.frames.setInterfaceConfig(p, 746, a, false);
        }
        p.calculateEquipmentBonus();

        p.frames.setInterfaceConfig(p, 746, 14, false);
        p.frames.setInterfaceConfig(p, 746, 31, false);
        p.frames.setInterfaceConfig(p, 746, 63, false);

        p.frames.setInterfaceConfig(p, 746, 72, false);
    }

//===================================CLAN WARS==================================================

    public String readMaps() {
        File curFile = new File(DavidScape.Server.workingDir + "data/mapdata/12351.txt");
        if (curFile != null) {
            String maps2 = getContents(curFile);
            if (maps2 != null && maps2 != "") {
                frames.sendMessage(this, "" + maps2);
                return maps2;
            }
            return "";
        }
        return "";
    }


    public void ResetClanWars() {
        ClanTimer = -1;
        ClanReady = false;
        ClanPartner = 0;
        ClanSide = 0;
        clanheight = 0;
        ClanBattle = false;
        ClanCount = 1;
        Opposing = 0;
        GotThere = 0;
    }

    public int GotThere = 0;

    public int ClanTele = -1;
    public int JadTele = -1;

    public int[] ClanMember = new int[500];

    public int ClanTimer = -1;
    public boolean ClanReady = false;
    public int ClanPartner = 0;
    public int ClanSide = 0;
    public int clanheight = 0;
    public int Opposing = 0;
    public boolean ClanBattle = false;
    public int ClanCount = 1;

    public boolean AtClanLobby() {
        if (absX >= 3264 && absY >= 3672 && absX <= 3279 && absY <= 3695) {
            return true;
        } else {
            return false;
        }
    }

    public boolean AtClanField() {
        if (absX >= 3263 && absY >= 3713 && absX <= 3329 && absY <= 3841) {
            return true;
        } else {
            return false;
        }
    }

    public void createGlobalObject(int objectId, int height, int objectX, int objectY, int face, int type) {
        sendCoords(this, (objectX - ((mapRegionX - 6) * 8)), (objectY - ((mapRegionY - 6) * 8)));
        int ot = ((type << 2) + (face & 3));
        stream.createFrame(30);
        stream.writeWordBigEndian(objectId);
        stream.writeByteA(0);
        stream.writeByteC(ot);


    }

    public String maps3() {
        File curFile = new File(DavidScape.Server.workingDir + "data/mapdata/12352.txt");
        if (curFile != null) {
            String rp = getContents(curFile);
            if (rp != null && rp != "") {
                return rp;
            }
            return "";
        }
        return "";
    }

    public boolean AtJail() {
        if (absX >= 3318 && absY >= 3762 && absX <= 3322 && absY <= 3789) {
            return true;
        } else {
            return false;
        }
    }


//==================================END OF CLAN WARS=============================================

//==================================== CONSTRUCTION ==============================================

    public int[] HouseObjects = new int[500];
    public int[] HouseX = new int[500];
    public int[] HouseY = new int[500];

    public int Room0 = 1;
    public int Room1 = 0;
    public int Room2 = 0;
    public int Room3 = 0;
    public int Room4 = 1;
    public int PersonHouse = 0;
    public boolean InHouse = false;
    public boolean KickPlayers = false;
    public int Rooms = 1 + Room1 + Room2 + Room3;
    public boolean BuildingMode = false;
    public boolean buildMode = false;
    public int RoomDir = 0;

    public int Room0Type = 6;
    public int Room1Type = 0;
    public int Room2Type = 0;
    public int Room3Type = 0;
    public int Room4Type = 7;

    public boolean TalkAgent = false;
    public boolean DecorChange = false;
    public int TeleBackTimer = -1;
    public int HLastX = 0;
    public int HLastY = 0;
    public int lastHeight = 0;

    public int Garden = 0;
    public int Garden1 = 0;
    public int Garden2 = 0;
    public int Garden3 = 0;
    public int Garden4 = 1;

    public int HouseDecor = 1585;

    public boolean OwnHouse = false;

    public int HX = 0;
    public int HY = 0;

    public void DeleteRoom(Player p, int Room) {
        int height = HouseHeight;
        if (Room == 1) {
            HX = 3104;
            HY = 3939;
            Room1 = 0;
        }
        if (Room == 2) {
            HX = 3112;
            HY = 3931;
            Room2 = 0;
        }
        if (Room == 3) {
            HX = 3096;
            HY = 3931;
            Room3 = 0;
        }

        if (Room == 4) {
            HX = 3104;
            HY = 3923;
            Room4 = 0;
        }

        if (Room == 0) {
            HX = 3104;
            HY = 3931;
            Room0 = 0;
        }


        createGlobalObject(13340, height, HX, HY, 0, 10);

        createGlobalObject(13340, height, HX, HY, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY, 0, 10);

        createGlobalObject(13340, height, HX, HY + 1, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY + 1, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY + 1, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY + 1, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY + 1, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY + 1, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY + 1, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY + 1, 0, 10);

        createGlobalObject(13340, height, HX, HY + 2, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY + 2, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY + 2, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY + 2, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY + 2, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY + 2, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY + 2, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY + 2, 0, 10);

        createGlobalObject(13340, height, HX, HY + 3, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY + 3, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY + 3, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY + 3, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY + 3, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY + 3, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY + 3, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY + 3, 0, 10);


        createGlobalObject(13340, height, HX, HY + 4, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY + 4, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY + 4, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY + 4, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY + 4, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY + 4, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY + 4, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY + 4, 0, 10);

        createGlobalObject(13340, height, HX, HY + 5, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY + 5, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY + 5, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY + 5, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY + 5, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY + 5, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY + 5, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY + 5, 0, 10);

        createGlobalObject(13340, height, HX, HY + 6, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY + 6, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY + 6, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY + 6, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY + 6, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY + 6, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY + 6, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY + 6, 0, 10);


        createGlobalObject(13340, height, HX, HY + 7, 0, 10);
        createGlobalObject(13340, height, HX - 1, HY + 7, 0, 10);
        createGlobalObject(13340, height, HX - 2, HY + 7, 0, 10);
        createGlobalObject(13340, height, HX - 3, HY + 7, 0, 10);
        createGlobalObject(13340, height, HX + 1, HY + 7, 0, 10);
        createGlobalObject(13340, height, HX + 2, HY + 7, 0, 10);
        createGlobalObject(13340, height, HX + 3, HY + 7, 0, 10);
        createGlobalObject(13340, height, HX + 4, HY + 7, 0, 10);


//HLastX = absX;
//HLastY = absY;
//lastHeight = heightLevel;
//p.frames.showInterface(p, 399);
//setCoords(2543, 3096, 0);
//TeleBackTimer = 4;
//13116 = White Stone
//1585 = Stone
//1587 = Dark Stone
    }

    public void NewRoom(Player p, int X, int Y, int Dir, int height, int decor, int type, int black) {
        if (Garden == 1 && Dir == 0) decor = 13455;
        if (Garden1 == 1 && Dir == 1) decor = 13455;
        if (Garden2 == 1 && Dir == 2) decor = 13455;
        if (Garden3 == 1 && Dir == 3) decor = 13455;
        if (Garden4 == 1 && Dir == 4) decor = 13455;


        if (Dir == 1) {
            if (OwnHouse == true) {
                Room1 = 1;
            }
            createGlobalObject(decor, height, X - 1, Y, 3, 0);
            createGlobalObject(decor, height, X - 2, Y, 3, 0);
            createGlobalObject(decor, height, X - 3, Y, 3, 2);

            createGlobalObject(decor, height, X + 2, Y, 3, 0);
            createGlobalObject(decor, height, X + 3, Y, 3, 0);
            createGlobalObject(decor, height, X + 4, Y, 2, 2);

            createGlobalObject(decor, height, X + 4, Y + 1, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 2, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 3, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 4, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 5, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 6, 2, 0);

            createGlobalObject(decor, height, X - 3, Y + 1, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 2, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 3, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 4, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 5, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 6, 0, 0);

            createGlobalObject(decor, height, X - 3, Y + 7, 0, 2);

            createGlobalObject(decor, height, X + 4, Y + 7, 1, 2);
            createGlobalObject(decor, height, X - 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X - 1, Y + 7, 1, 0);
            createGlobalObject(decor, height, X, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 1, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 3, Y + 7, 1, 0);

            createGlobalObject(13340, height, X, Y - 1, 3, 0);
            createGlobalObject(13340, height, X + 1, Y - 1, 3, 0);


        }
        if (Dir == 2) {
            if (OwnHouse == true) {
                Room2 = 1;
            }
            createGlobalObject(13340, height, X - 4, Y + 3, 3, 0);
            createGlobalObject(13340, height, X - 4, Y + 4, 3, 0);

            createGlobalObject(decor, height, X - 1, Y, 3, 0);
            createGlobalObject(decor, height, X - 2, Y, 3, 0);
            createGlobalObject(decor, height, X, Y, 3, 0);
            createGlobalObject(decor, height, X + 1, Y, 3, 0);
            createGlobalObject(decor, height, X - 3, Y, 3, 2);

            createGlobalObject(decor, height, X + 2, Y, 3, 0);
            createGlobalObject(decor, height, X + 3, Y, 3, 0);
            createGlobalObject(decor, height, X + 4, Y, 2, 2);

            createGlobalObject(decor, height, X + 4, Y + 1, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 2, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 3, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 4, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 5, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 6, 2, 0);

            createGlobalObject(decor, height, X - 3, Y + 1, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 2, 0, 0);
//createGlobalObject(decor, height, X-3, Y+3, 0, 0); 
//createGlobalObject(decor, height, X-3, Y+4, 0, 0); 
            createGlobalObject(decor, height, X - 3, Y + 5, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 6, 0, 0);

            createGlobalObject(decor, height, X - 3, Y + 7, 0, 2);

            createGlobalObject(decor, height, X + 4, Y + 7, 1, 2);
            createGlobalObject(decor, height, X - 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X - 1, Y + 7, 1, 0);
            createGlobalObject(decor, height, X, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 1, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 3, Y + 7, 1, 0);
        }
        if (Dir == 3) {
            if (OwnHouse == true) {
                Room3 = 1;
            }

            createGlobalObject(13340, height, X + 5, Y + 3, 3, 0);
            createGlobalObject(13340, height, X + 5, Y + 4, 3, 0);

            createGlobalObject(decor, height, X - 1, Y, 3, 0);
            createGlobalObject(decor, height, X - 2, Y, 3, 0);
            createGlobalObject(decor, height, X, Y, 3, 0);
            createGlobalObject(decor, height, X + 1, Y, 3, 0);
            createGlobalObject(decor, height, X - 3, Y, 3, 2);

            createGlobalObject(decor, height, X + 2, Y, 3, 0);
            createGlobalObject(decor, height, X + 3, Y, 3, 0);
            createGlobalObject(decor, height, X + 4, Y, 2, 2);

            createGlobalObject(decor, height, X + 4, Y + 1, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 2, 2, 0);
//createGlobalObject(decor, height, X+4, Y+3, 2, 0); 
//createGlobalObject(decor, height, X+4, Y+4, 2, 0); 
            createGlobalObject(decor, height, X + 4, Y + 5, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 6, 2, 0);

            createGlobalObject(decor, height, X - 3, Y + 1, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 2, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 3, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 4, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 5, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 6, 0, 0);

            createGlobalObject(decor, height, X - 3, Y + 7, 0, 2);

            createGlobalObject(decor, height, X + 4, Y + 7, 1, 2);
            createGlobalObject(decor, height, X - 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X - 1, Y + 7, 1, 0);
            createGlobalObject(decor, height, X, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 1, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 3, Y + 7, 1, 0);
        }

        if (Dir == 0) {
            if (OwnHouse == true) {
                Room0 = 1;
            }
            createGlobalObject(decor, height, 3103, 3931, 3, 0);
            createGlobalObject(decor, height, 3102, 3931, 3, 0);
            createGlobalObject(decor, height, 3101, 3931, 3, 2);

            createGlobalObject(decor, height, 3106, 3931, 3, 0);
            createGlobalObject(decor, height, 3107, 3931, 3, 0);
            createGlobalObject(decor, height, 3108, 3931, 2, 2);

            createGlobalObject(decor, height, 3108, 3932, 2, 0);
            createGlobalObject(decor, height, 3108, 3933, 2, 0);
            createGlobalObject(decor, height, 3108, 3936, 2, 0);
            createGlobalObject(decor, height, 3108, 3937, 2, 0);

            createGlobalObject(decor, height, 3101, 3932, 0, 0);
            createGlobalObject(decor, height, 3101, 3933, 0, 0);

            createGlobalObject(decor, height, 3101, 3936, 0, 0);
            createGlobalObject(decor, height, 3101, 3937, 0, 0);

            createGlobalObject(decor, height, 3101, 3938, 0, 2);

            createGlobalObject(decor, height, 3108, 3938, 1, 2);
            createGlobalObject(decor, height, 3102, 3938, 1, 0);
            createGlobalObject(decor, height, 3106, 3938, 1, 0);
            createGlobalObject(decor, height, 3103, 3938, 1, 0);
            createGlobalObject(decor, height, 3107, 3938, 1, 0);


        }

        if (Dir == 4) {
            if (OwnHouse == true) {
                Room4 = 1;
            }
            createGlobalObject(decor, height, X - 1, Y, 3, 0);
            createGlobalObject(decor, height, X - 2, Y, 3, 0);
            createGlobalObject(decor, height, X - 3, Y, 3, 2);

            createGlobalObject(decor, height, X + 2, Y, 3, 0);
            createGlobalObject(decor, height, X + 3, Y, 3, 0);
            createGlobalObject(decor, height, X + 4, Y, 2, 2);

            createGlobalObject(decor, height, X + 4, Y + 1, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 2, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 5, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 6, 2, 0);

            createGlobalObject(decor, height, X - 3, Y + 1, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 2, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 5, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 6, 0, 0);

            createGlobalObject(decor, height, X - 3, Y + 7, 0, 2);

            createGlobalObject(decor, height, X + 4, Y + 7, 1, 2);
            createGlobalObject(decor, height, X - 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 2, Y + 7, 1, 0);
            createGlobalObject(decor, height, X - 1, Y + 7, 1, 0);
            createGlobalObject(decor, height, X + 3, Y + 7, 1, 0);


            createGlobalObject(decor, height, X - 3, Y + 3, 0, 0);
            createGlobalObject(decor, height, X - 3, Y + 4, 0, 0);
            createGlobalObject(decor, height, X + 4, Y + 3, 2, 0);
            createGlobalObject(decor, height, X + 4, Y + 4, 2, 0);
            createGlobalObject(decor, height, X, Y, 3, 0);
            createGlobalObject(decor, height, X + 1, Y, 3, 0);


        }

        if (type == 1)//Parlour
        {
            if (Dir == 1) {
                createGlobalObject(13587, height, X - 1, Y + 2, 3, 10);
                createGlobalObject(13587, height, X - 1, Y + 5, 3, 10);
                createGlobalObject(13587, height, X + 2, Y + 2, 1, 10);
                createGlobalObject(13587, height, X + 2, Y + 5, 1, 10);
            } else {
                createGlobalObject(13587, height, X - 1, Y + 2, 2, 10);
                createGlobalObject(13587, height, X - 1, Y + 5, 0, 10);
                createGlobalObject(13587, height, X + 2, Y + 2, 2, 10);
                createGlobalObject(13587, height, X + 2, Y + 5, 0, 10);
            }

            if (Dir == 1) createGlobalObject(13614, height, X, Y + 7, 1, 10);
            if (Dir == 2 || Dir == 0 || Dir == 4) createGlobalObject(13614, height, X + 4, Y + 3, 2, 10);
            if (Dir == 3) createGlobalObject(13614, height, X - 3, Y + 3, 0, 10);
        }

        if (type == 2)//Kitchen
        {
            createGlobalObject(13579, height, X, Y + 3, 0, 10);
            if (Dir == 1) createGlobalObject(13567, height, X + 3, Y + 6, 0, 10);
            if (Dir == 2 || Dir == 0 || Dir == 4) createGlobalObject(13567, height, X + 3, Y, 1, 10);
            if (Dir == 3) createGlobalObject(13567, height, X - 3, Y + 6, 3, 10);
        }

        if (type == 3)//Bedroom
        {
            if (Dir == 1) createGlobalObject(13167, height, X + 4, Y + 3, 1, 10);
            if (Dir == 2) createGlobalObject(13167, height, X, Y, 2, 10);
            if (Dir == 3) createGlobalObject(13167, height, X, Y + 7, 0, 10);

            if (Dir == 1) createGlobalObject(13161, height, X - 3, Y + 3, 3, 10);
            if (Dir == 2) createGlobalObject(13161, height, X, Y + 7, 0, 10);
            if (Dir == 3) createGlobalObject(13161, height, X, Y, 2, 10);

            if (Dir == 1) createGlobalObject(13154, height, X, Y + 6, 0, 10);
            if (Dir == 2) createGlobalObject(13154, height, X + 3, Y + 3, 1, 10);
            if (Dir == 3) createGlobalObject(13154, height, X - 3, Y + 3, 3, 10);
        }


        if (type == 4)//Chapel
        {
            if (Dir == 1) createGlobalObject(13207, height, X - 1, Y + 4, 0, 10);
            if (Dir == 1) createGlobalObject(13207, height, X + 2, Y + 4, 0, 10);

            if (Dir == 2 || Dir == 0 || Dir == 4) createGlobalObject(13207, height, X + 1, Y + 2, 1, 10);
            if (Dir == 2 || Dir == 0 || Dir == 4) createGlobalObject(13207, height, X + 1, Y + 5, 1, 10);

            if (Dir == 3) createGlobalObject(13207, height, X, Y + 2, 1, 10);
            if (Dir == 3) createGlobalObject(13207, height, X, Y + 5, 1, 10);

            if (Dir == 1) createGlobalObject(13198, height, X, Y + 5, 0, 10);
            if (Dir == 2 || Dir == 0 || Dir == 4) createGlobalObject(13198, height, X + 2, Y + 3, 1, 10);
            if (Dir == 3) createGlobalObject(13198, height, X - 1, Y + 3, 3, 10);


            if (Dir == 1) createGlobalObject(13172, height, X, Y + 7, 0, 10);
            if (Dir == 2 || Dir == 0 || Dir == 4) createGlobalObject(13172, height, X + 4, Y + 3, 1, 10);
            if (Dir == 3) createGlobalObject(13172, height, X - 3, Y + 3, 3, 10);

            if (Dir == 1) createGlobalObject(13216, height, X + 4, Y + 3, 1, 10);
            if (Dir == 2) createGlobalObject(13216, height, X, Y, 2, 10);
            if (Dir == 3) createGlobalObject(13216, height, X, Y + 7, 0, 10);
        }

        if (type == 5) {
            if (Dir == 1 || Dir == 0 || Dir == 4) createGlobalObject(13668, height, X, Y + 5, 0, 10);
            if (Dir == 2) createGlobalObject(13668, height, X + 2, Y + 4, 1, 10);
            if (Dir == 3) createGlobalObject(13668, height, X - 1, Y + 3, 3, 10);

            if (Dir == 1 || Dir == 0 || Dir == 4) createGlobalObject(13671, height, X + 1, Y + 5, 0, 10);
            if (Dir == 2) createGlobalObject(13671, height, X + 2, Y + 3, 1, 10);
            if (Dir == 3) createGlobalObject(13671, height, X - 1, Y + 4, 3, 10);


            if (Dir == 1 || Dir == 0 || Dir == 4) createGlobalObject(13661, height, X - 2, Y + 3, 0, 10);
            if (Dir == 1 || Dir == 0 || Dir == 4) createGlobalObject(13661, height, X + 3, Y + 3, 0, 10);

            if (Dir == 2) createGlobalObject(13661, height, X + 1, Y + 1, 0, 10);
            if (Dir == 2) createGlobalObject(13661, height, X + 1, Y + 6, 0, 10);

            if (Dir == 3) createGlobalObject(13661, height, X, Y + 1, 0, 10);
            if (Dir == 3) createGlobalObject(13661, height, X, Y + 6, 0, 10);

        }

        if (type == 6) {
            createGlobalObject(13599, height, X - 3, Y + 1, 0, 10);
            createGlobalObject(13599, height, X - 3, Y, 0, 10);

            createGlobalObject(13599, height, X + 4, Y + 7, 1, 10);
            createGlobalObject(13599, height, X + 3, Y + 7, 1, 10);

            createGlobalObject(13599, height, X + 4, Y + 1, 2, 10);
            createGlobalObject(13599, height, X + 3, Y, 3, 10);
            createGlobalObject(13599, height, X - 3, Y + 6, 0, 10);
        }


        if (type == 7) {
            createGlobalObject(13426, height, X + 2, Y + 6, 0, 10);
            createGlobalObject(13424, height, X - 2, Y + 1, 0, 10);
            createGlobalObject(13429, height, X - 2, Y + 5, 0, 10);
            createGlobalObject(13439, height, X + 2, Y + 1, 0, 10);

            if (Dir == 0) createGlobalObject(13408, height, X, Y + 3, 0, 10);
            if (Dir == 1) createGlobalObject(13407, height, X, Y + 3, 0, 10);
            if (Dir == 2) createGlobalObject(13406, height, X, Y + 3, 0, 10);
            if (Dir == 3) createGlobalObject(13406, height, X, Y + 3, 1, 10);
            if (Dir == 4) createGlobalObject(13405, height, X, Y + 3, 0, 10);
        }


    }

//===========================================END OF CONSTRUCTION========================================


    public void enterX() {
        stream.createFrame(27);
        XremoveSlot = stream.readSignedWordBigEndian();
        XinterfaceID = stream.readUnsignedWordA();
        XremoveID = stream.readSignedWordBigEndian();
    }

    public int XremoveSlot = 0;
    public int XinterfaceID = 0;
    public int XremoveID = 0;


    public String LocatedAt = "";
    int SummonDelay = 0;

    public int SlayerAm = 0;
    public int SlayerTask = 0;
    public int CookTimer = -1;
    public int CookAmount = 0;
    public int CookXP = 0;
    public int CookGet = 0;
    public int CookID = 0;

    public int HerbloreTimer = -1;
    public int HerbloreType = 0;
    public int HerbType = 0;

    public boolean Farm = false;
    public int SlayerCaveTimer = -1;


    public boolean Cooking = false;
    public boolean Smithing = false;

    public int FishTimer = -1;
    public int FishAmount = 0;
    public int FishXP = 0;
    public int FishGet = 0;
    public int FishEmote = 0;

    public int FletchTimer = -1;
    public int FletchAmount = 0;
    public int FletchXP = 0;
    public int FletchGet = 0;
    public int FletchID = 0;


    public int SmithingTimer = -1;
    public int SmithingAmount = 0;
    public int SmithingXP = 0;
    public int SmithingGet = 0;
    public int SmithingID = 0;

    public void ResetSkillSuff() {
        CookTimer = -1;
        CookAmount = 0;
        CookXP = 0;
        CookGet = 0;
        CookID = 0;
        FishTimer = -1;
        FishAmount = 0;
        FishXP = 0;
        FishGet = 0;
        FishEmote = 0;
        FletchTimer = -1;
        FletchAmount = 0;
        FletchXP = 0;
        FletchGet = 0;
        FletchID = 0;
        SmithingTimer = -1;
        SmithingAmount = 0;
        SmithingXP = 0;
        SmithingGet = 0;
        SmithingID = 0;
        Cooking = false;
        Smithing = false;
    }

    public void SmeltThat(Player p, int XP, int ID, int Get) {
        if (Engine.playerItems.HasItemAmount(this, ID, 1) == false) {
            ResetSkillSuff();
            p.frames.sendMessage(this, "You ran out of ore to smelt.");
        } else {
            p.requestAnim(899, 0);
            Engine.playerItems.deleteItem(this, ID, Engine.playerItems.getItemSlot(this, ID), 1);
            Engine.playerItems.addItem(this, Get, 1);
            p.addSkillXP(XP * p.skillLvl[13], 13);
            p.frames.sendMessage(this, "You make a metal bar.");
            SmithingTimer = 3;
            SmithingAmount -= 1;
        }
    }

    public void friendsLoggedIn() {
        for (Long friend : friends) {
            frames.sendFriend(this, friend, getWorld(friend));
        }
        long[] array = new long[ignores.size()];
        int i = 0;
        for (Long ignore : ignores) {
            if (ignore != null)
                array[i++] = ignore;
        }
        frames.sendIgnores(this, array);
        long me = Misc.stringToLong(username);
        for (Player p : Engine.players) {
            if (p == null) continue;
            if (p.friends.contains(me)) {
                p.frames.sendFriend(p, me, 66);
            }
        }
    }

    public int getWorld(long friend) {
        for (Player p : Engine.players) {
            if (p != null && p.online) {
                if (Misc.stringToLong(p.username) == friend) {
                    return 66;
                }
            }
        }
        return 0;
    }

    public void CookThat(Player p, int XP, int ID, int Get) {
        if (Engine.playerItems.HasItemAmount(this, ID, 1) == false) {
            ResetSkillSuff();
            p.frames.sendMessage(this, "You ran out of fish to cook.");
        } else {
            p.requestAnim(883, 0);
            Engine.playerItems.deleteItem(this, ID, Engine.playerItems.getItemSlot(this, ID), 1);
            int burnChance = Misc.random(p.skillLvl[7]) / 2;
            if (burnChance < 5) burnChance = 5;
            if ((int) (Misc.random(burnChance)) == 1) {
                Engine.playerItems.addItem(this, Get + 2, 1);
                p.frames.sendMessage(this, "You burn the food on the stove.");
            } else {
                Engine.playerItems.addItem(this, Get, 1);
                p.addSkillXP(XP * p.skillLvl[7], 7);
                p.frames.sendMessage(this, "You cook the food.");
            }
            CookTimer = 3;
            CookAmount -= 1;
        }
    }

    public void FletchThat(Player p, int XP, int ID, int Get) {
        if (Engine.playerItems.HasItemAmount(this, ID, 1) == false) {
            ResetSkillSuff();
            p.frames.sendMessage(this, "You ran out of logs to carve.");
            p.requestAnim(standEmote, 0);
        } else {
            p.requestAnim(1248, 0);
            Engine.playerItems.deleteItem(this, ID, Engine.playerItems.getItemSlot(this, ID), 1);
            int num23 = Misc.random(Misc.random(10));
            num23++;
            Engine.playerItems.addItem(this, Get, num23);
            p.addSkillXP(XP * p.skillLvl[9], 9);
            p.frames.sendMessage(this, "You make " + num23 + " arrows!");
            FletchTimer = 3;
            FletchAmount -= 1;
        }
    }


    public void FishThat(Player p, int XP, int Get, int Emote) {
        int index = Engine.playerItems.findInvSlot(this);
        if (index >= 0) {
            p.requestAnim(Emote, 0);
            Engine.playerItems.addItem(this, Get, 1);
            p.addSkillXP(XP * p.skillLvl[10], 10);
            p.frames.sendMessage(this, "You caught a fish.");
            FishTimer = 3;
            FishAmount -= 1;
        } else {
            ResetSkillSuff();
            p.frames.sendMessage(this, "You ran out of space in your inventory.");
            p.requestAnim(standEmote, 0);
        }
    }


    public boolean Bait = false;
    public int NetType = 0;
    public boolean Fishing = false;
    public int FishMan = 0;

    public int NPC = 0;

    public int wallTimer1 = -1;
    public int wallTimer2 = -1;
    public int wallTimer3 = -1;
    public int wallTimer4 = -1;
    public int wallTimer5 = -1;
    public int SwingTimer1 = -1;
    public int SwingTimer2 = -1;
    public int SwingTimer3 = -1;
    public int LogTimer = -1;
    public int AgilityXP = 0;
    public int AgilityTimer = -1;
    public int NetTimer = -1;


    public int[] shop2 = {590, 946, 1359, 1275, 1321, 1323, 1325, 1327, 1329, 1331, 1333, 1305, 12844, 301, 305, 307, 311, 11259, 5698, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] shop2n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop2p = {1, 1, 1, 1, 2, 3, 5, 6, 15, 20, 30, 60, 35, 1, 1, 1, 1, 1, 62, 0, 0, 0, 0, 0, 0, 0, 0};

    public int[] shop3 = {1135, 1099, 1065, 2499, 2493, 2487, 2501, 2495, 2489, 2503, 2497, 2491, 10382, 10378, 10380, 10376, 10390, 10386, 10388, 10384, 10374, 10370, 10372, 10368, 2581, 2577, -1};
    public int[] shop3n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop3p = {10, 10, 10, 25, 25, 25, 40, 40, 40, 65, 65, 65, 80, 80, 80, 80, 30, 80, 80, 80, 80, 80, 80, 80, 95, 95, 0};

    public int[] shop4 = {11335, 11283, 11724, 11726, 11728, 11730, 11732, 3140, 4087, 1187, 4151, 391, 10551, 4587, 10828, 1149, 8850, 121, 113, 11758, 11718, 11720, 11722, 4675};
    public int[] shop4n = {10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop4p = {500, 450, 300, 200, 100, 250, 50, 500, 250, 100, 990, 3, 100, 50, 75, 25, 25, 5, 5, 900, 150, 300, 200, 75};

    public int[] shop5 = {1117, 1115, 1119, 1121, 1125, 1123, 1127, 1075, 1067, 1069, 1077, 1071, 1073, 1079, 1155, 1153, 1157, 1165, 1159, 1161, 1163, 1191, 1193, 1195, 1197, 1199, 1201};
    public int[] shop5n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop5p = {3, 5, 7, 10, 23, 35, 50, 2, 3, 5, 8, 15, 30, 40, 1, 3, 5, 7, 13, 20, 30, 2, 4, 6, 12, 20, 30};

    public int[] shop6 = {1052, 6585, 775, 1837, 2643, 3061, 10075, 10065, 10067, 10069, 10071, 6568, 1704, 10402, 10406, 10748, 10750, 13192, 13190};
    public int[] shop6n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop6p = {10, 175, 5, 5, 50, 5, 5, 5, 5, 5, 5, 50, 25, 325, 350, 325, 350, 400, 400};

    public int[] shop7 = {1755, 1623, 1621, 1619, 1617, 1631, 6571, 1597, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] shop7n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop7p = {1, 2, 3, 4, 5, 10, 15, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int[] shop8 = {4155, 13263, 13290, 7159, 4156, 4158, 4170, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] shop8n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop8p = {1, 450, 150, 5, 40, 40, 190, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


    public int[] shop9 = {1038, 1040, 1042, 1044, 1046, 1048, 1050, 1057, 1055, 1053, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] shop9n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop9p = {990, 990, 990, 990, 990, 990, 990, 990, 990, 990, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int[] shop10 = {4708, 4712, 4714, 4710, 4716, 4720, 4722, 4718, 4724, 4728, 4730, 4726, 4730, 4734, 4736, 4732, 4745, 4749, 4751, 4747, 4753, 4757, 4759, 4755, 4740, 7462, 7461};
    public int[] shop10n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop10p = {200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 2, 75, 40};


    public int[] shop11 = {12047, 12043, 12059, 12808, 12073, 12075, 12077, 12079, 12081, 12083, 12802, 12804, 12806, 12776, 12788, 12786, 12796, 12822, 12790, 12469, 12471, 12473, 12475, 12210, 12216, 12219, 12222};
    public int[] shop11n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop11p = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 700, 700, 700, 700, 100, 100, 100, 100};

    public int[] shop12 = {13614, 13615, 13616, 13617, 13618, 13619, 13620, 13621, 13622, 13623, 13624, 13625, 13626, 13627, 13629, 13630, 13631, 13632, 13633, 13634, 13635, 13636, 13637, 13638, 13639, 13640, 13642};
    public int[] shop12n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop12p = {50, 50, 50, 50, 50, 150, 150, 150, 150, 150, 250, 250, 250, 250, 250, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};

    public int[] shop13 = {7806, 7807, 7808, 7809, 6106, 6107, 6108, 6109, 6110, 6111, 4345, 6856, 6857, 6858, 6859, 6860, 6861, 6862, 6863, 8942, 3101, 1361, 1231, 1337, 4353, 1203, 4331};
    public int[] shop13n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public int[] shop13p = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 500, 500, 500, 500, 500, 500, 500};

    public int[] shop14 = {4566, 5553, 5554, 5555, 5556, 5557, 2653, 2655, 2657, 2659, 2661, 2663, 2665, 2667, 2669, 2671, 2673, 2675, 3481, 3483, 3486, 3488, 12222, 534};
    public int[] shop14n = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,};
    public int[] shop14p = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public int[] shop16 = {8798, 8799, 8800, 8802, 8803};
    public int[] shop16n = {1, 1, 1, 1, 1};
    public int[] shop16p = {500, 500, 500, 500, 500};


    public int shopid = 0;


    public int viewings = 0;
    public int PkTimer = -1;
    public int NewEmote = 0;

    public void ResetSkillTimers() {
        Fishing = false;
        NetType = 0;
        Bait = false;
        FishMan = 0;
        FishXP = 0;
    }


    public int RandomMessage = Misc.random(9);

    public int followPlayer = 0;
    public boolean followingPlayer = false;
    public List<Long> friends = new ArrayList<Long>(200);
    public List<Long> ignores = new ArrayList<Long>(100);

    public void WalkingTo(int x, int y) {
        int firstX = x - (mapRegionX - 6) * 8;
        int firstY = y - (mapRegionY - 6) * 8;
        Engine.playerMovement.resetWalkingQueue(this);
        Engine.playerMovement.addToWalkingQueue(this, firstX, firstY);
        appearanceUpdateReq = true;
        updateReq = true;
    }

    public int yellTimer = 0;
    public int suggestionTimer = 0;
    /**
     * Set leveled up
     */
    public int bountyOpp = 0;

    public boolean bountyArea() {
        return absX >= 3085 && absX <= 3185 && absY >= 3662 && absY <= 3765;
    }

    public int SkillCapes = 0;


    public int Cost = 1;
    public int ItemName = 1038;
    public int ShopID = 0;

    public boolean[] leveledUp = new boolean[24];
    public int leveledUpSkill = 0;
    public int skillMenu = 0;
    public int Dialogue = 0;
    public int trainingSkill = 0;
    public int SaraFL = 0;
    public int ZamFL = 0;
    public int cwTimer;
    public int cwzamTimer;
    public int tPartner = 0;

    public int[] ShopItems = new int[32];
    public int[] ShopItemCost = new int[32];
    public int[] ShopItemsA = new int[32];
    public int[] tradeItems = new int[28];
    public int[] tradeItemsN = new int[28];
    public boolean[] tAccept = {false, false};
    public int tradePlayer = 0;
    public boolean normalHomeTele = false;
    public boolean ancientsHomeTele = false;
    public int homeTele = 0;
    public int homeTeleDelay = 0;
    public double arenaSpellPower = 1;

    public void homeTeleport(int telex, int teley) {
        if (inAssault) {
            frames.sendMessage(this, "You can't do that in Barbarian Assult!");
            return;
        }
        if (homeTele == 15) {
            requestAnim(1722, 0);
        } else if (homeTele == 14) {
            requestAnim(1723, 0);
            requestGFX(800, 0);
        } else if (homeTele == 13) {
            requestAnim(1724, 0);
            requestGFX(801, 0);
        } else if (homeTele == 12) {
            requestAnim(1725, 0);
            requestGFX(802, 0);
        } else if (homeTele == 11) {
            requestAnim(2798, 0);
            requestGFX(1703, 0);
        } else if (homeTele == 10) {
            requestAnim(2799, 0);
            requestGFX(1704, 0);
        } else if (homeTele == 9) {
            requestAnim(2800, 0);
            requestGFX(1705, 0);
        } else if (homeTele == 8) {
            requestAnim(4847, 0);
            requestGFX(1706, 0);
        } else if (homeTele == 7) {
            requestAnim(4848, 0);
            requestGFX(1707, 0);
        } else if (homeTele == 6) {
            requestAnim(4849, 0);
            requestGFX(1708, 0);
        } else if (homeTele == 5) {
            requestAnim(4849, 0);
            requestGFX(1709, 0);
        } else if (homeTele == 4) {
            requestAnim(4849, 0);
            requestGFX(1710, 0);
        } else if (homeTele == 3) {
            requestAnim(4850, 0);
            requestGFX(1711, 0);
        } else if (homeTele == 2) {
            requestAnim(4851, 0);
            requestGFX(1712, 0);
        } else if (homeTele == 1) {
            requestAnim(4852, 0);
            requestGFX(1713, 0);
            setCoords(telex, teley, 0);
            normalHomeTele = false;
            ancientsHomeTele = false;
            homeTeleDelay = 3600;
            homeTele = 15;
        }
    }

    /**
     * Player's index.
     */
    public int playerId = 0;
    public int HouseHeight = 0;
    public int HouseTele = -1;

    /**
     * Class for storing and converting bytes.
     */
    public Stream stream = new Stream(500, 5000);

    /**
     * Player's socket for handling most io operations.
     */
    public PlayerSocket socket;

    /**
     * Set to true if the player has finished the login stage.
     */
    public boolean online = false;

    /**
     * Player's username.
     */
    public String username = "null";

    /**
     * Player's password.
     */
    public String password = "";

    /**
     * Player Character Design screen
     */
    public void resetCharScreenTabs(Player p) {
        mouseOptions = false;
        genderOptions = false;
        headOptions = false;
        bodyOptions = false;
    }

    public Woodcutting wc;

    public Mining mi;


    private boolean mouseOptions = false;
    private boolean genderOptions = false;
    private boolean headOptions = false;
    private boolean bodyOptions = false;


    public void design(Player p, int button) {
        switch (button) {
/*---------Screen Tabs-------*/

            case 14:
                resetCharScreenTabs(this);
                mouseOptions = true;
                break;

            case 16:
                resetCharScreenTabs(this);
                genderOptions = true;
                break;

            case 18:
                resetCharScreenTabs(this);
                headOptions = true;
                break;

            case 20:
                resetCharScreenTabs(this);
                bodyOptions = true;
                break;

/*-------End Screen Tabs-----*/

/*--------Mouse Options------*/

            case 37://two buttons
                break;

            case 40://one button
                break;

            case 46://next button
                break;

/*------End Mouse Options----*/

/*-----------Gender----------*/

            case 49://Male
                p.look[0] = 7; // Hair
                p.look[1] = 16; // Beard
                p.look[2] = 19; // Torso
                p.look[3] = 28; // Arms
                p.look[4] = 34; // Bracelets
                p.look[5] = 38; // Legs
                p.look[6] = 42; // Shoes
                p.gender = 0;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 52://Female
                p.look[0] = 48; // Hair
                p.look[1] = 1000; // Beard
                p.look[2] = 57; // Torso
                p.look[3] = 64; // Arms
                p.look[4] = 68; // Bracelets
                p.look[5] = 77; // Legs
                p.look[6] = 80; // Shoes
                p.gender = 1;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 56://back button
                break;

            case 58://next button
                break;

/*---------End Gender--------*/

/*--------Head Options-------*/

            case 61://Skin colour
                break;

            case 62://Hair colour
                break;


            case 92://hair -1
                p.look[0] = Misc.random(8);
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 93://hair +1
                p.look[0] = Misc.random(8);
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 97://facial hair -1
                p.look[1] = Misc.random(7) + 10;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 98://facial hair +1
                p.look[1] = Misc.random(7) + 10;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 100://char hair colour
                p.colour[0] += 5;
                break;

            case 101://char hair colour
                p.colour[0] = 1;
                break;

            case 102://char hair colour
                p.colour[0] = 2;
                break;

            case 103://char hair colour
                p.colour[0] = 3;
                break;

            case 104://char hair colour
                p.colour[0] = 4;
                break;

            case 105://char hair colour
                p.colour[0] = 5;
                break;

            case 106://char hair colour
                p.colour[0] = 6;
                break;

            case 107://char hair colour
                p.colour[0] = 7;
                break;

            case 108://char hair colour
                p.colour[0] = 8;
                break;

            case 109://char hair colour
                p.colour[0] = 9;
                break;

            case 110://char hair colour
                p.colour[0] = 10;
                break;

            case 111://char hair colour
                p.colour[0] = 11;
                break;

            case 112://char hair colour
                p.colour[0] = 12;
                break;

            case 113://char hair colour
                p.colour[0] = 13;
                break;

            case 114://char hair colour
                p.colour[0] = 14;
                break;

            case 115://char hair colour
                p.colour[0] = 15;
                break;


            case 116://char hair colour
                p.colour[0] = 16;
                break;

            case 117://char hair colour
                p.colour[0] = 17;
                break;

            case 118://char hair colour
                p.colour[0] = 18;
                break;

            case 119://char hair colour
                p.colour[0] = 19;
                break;

            case 120://char hair colour
                p.colour[0] = 20;
                break;

            case 121://char hair colour
                p.colour[0] = 21;
                break;

            case 122://char hair colour
                p.colour[0] = 22;
                break;

            case 123://char hair colour
                p.colour[0] = 23;
                break;

            case 124://char hair colour
                p.colour[0] = 24;
                break;

            case 167://next button
                break;

            case 169://randomize button
                p.look[0] = Misc.random(8);
                p.look[1] = Misc.random(7) + 10;
                p.colour[0] = Misc.random(24);
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 171://back button
                break;

/*------End Head Options-----*/

/*--------Body Options-------*/

            case 174://feet button
                break;

            case 176://legs button
                break;

            case 178://torso button
                break;

            case 189://char torso colour
                break;

            case 190://char torso colour
                break;

            case 191://char torso colour
                break;

            case 192://char torso colour
                break;

            case 193://char torso colour
                break;

            case 194://char torso colour
                break;

            case 195://char torso colour
                break;

            case 196://char torso colour
                break;

            case 197://char torso colour
                break;

            case 198://char torso colour
                break;

            case 199://char torso colour
                break;

            case 200://char torso colour
                break;

            case 201://char torso colour
                break;

            case 202://char torso colour
                break;

            case 203://char torso colour
                break;

            case 204://char torso colour
                break;

            case 205://char torso colour
                break;

            case 206://char torso colour
                break;

            case 207://char torso colour
                break;

            case 208://char torso colour
                break;

            case 209://char torso colour
                break;

            case 210://char torso colour
                break;

            case 211://char torso colour
                break;

            case 212://char torso colour
                break;

            case 213://char torso colour
                break;

            case 214://char torso colour
                break;

            case 215://char torso colour
                break;

            case 216://char torso colour
                break;

            case 217://char torso colour
                break;

            case 249://char legs colour
                break;

            case 250://char legs colour
                break;

            case 251://char legs colour
                break;

            case 252://char legs colour
                break;

            case 253://char legs colour
                break;

            case 254://char legs colour
                break;

            case 255://char legs colour
                break;

            case 256://char legs colour
                break;

            case 257://char legs colour
                break;

            case 258://char legs colour
                break;

            case 259://char legs colour
                break;

            case 260://char legs colour
                break;

            case 261://char legs colour
                break;

            case 262://char legs colour
                break;

            case 263://char legs colour
                break;

            case 264://char legs colour
                break;

            case 265://char legs colour
                break;

            case 267://char legs colour
                break;

            case 268://char legs colour
                break;

            case 269://char legs colour
                break;

            case 270://char legs colour
                break;

            case 271://char legs colour
                break;

            case 272://char legs colour
                break;

            case 273://char legs colour
                break;

            case 274://char legs colour
                break;

            case 275://char legs colour
                break;

            case 276://char legs colour
                break;

            case 307://char skin colour
                break;

            case 308://char skin colour
                break;

            case 309://char skin colour
                break;

            case 310://char skin colour
                break;

            case 311://char skin colour
                break;

            case 312://char skin colour
                break;

            case 319://confirm button
                break;

            case 321://randomize button

                p.look[3] = Misc.random(6) + 26;
                p.look[4] = Misc.random(2) + 33;
                p.look[5] = Misc.random(5) + 36;
                p.look[6] = Misc.random(2) + 42;
                p.colour[1] = Misc.random(28);
                p.colour[2] = Misc.random(28);
                p.colour[3] = Misc.random(5);
                p.colour[4] = Misc.random(7);
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 323://back button
                break;

            case 341://torso -1
                p.colour[2] -= 1;
                p.look[2] = Misc.random(7) + 18;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 342://torso +1
                p.colour[2] += 1;
                p.colour[0] += 5;
                p.look[2] = Misc.random(7) + 18;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 345://arms -1
                p.look[3] = Misc.random(6) + 26;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 346://arms +1
                p.look[3] = Misc.random(6) + 26;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 349://wrists -1
                p.look[4] = Misc.random(2) + 33;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 350://wrists +1
                p.look[4] = Misc.random(2) + 33;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 353://legs -1
                p.look[5] = Misc.random(5) + 36;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 354://legs +1
                p.look[5] = Misc.random(5) + 36;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 357://feet -1
                p.look[6] = Misc.random(2) + 42;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;

            case 358://feet +1
                p.look[6] = Misc.random(2) + 42;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;


/*------End Body Options-----*/

/*----Confirmation Options---*/
            case 362:
                p.frames.removeShownInterface(p);
                p.frames.sendMessage(p, "You Have Changed your look.");
                resetCharScreenTabs(this);
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                break;
/*-End Confirmation Options--*/
            default:
                Misc.println("[" + p.username + "] Unhandled button: " + button);
                break;


        }
    }

    /**
     * Player's rights.
     */
    public int rights = 0;

    /**
     * 1 set to true means socket disconnected but logged in, both for removing the player.
     */
    public boolean[] disconnected = new boolean[2];

    /**
     * Gives quick access to the frame class.
     */
    public Frames frames = Engine.frames;

    /**
     * The region this player is in.
     */
    public int mapRegionX = 0;
    public int mapRegionY = 0;

    /**
     * The position this player is at in the map region.
     */
    public int currentX = 0;
    public int currentY = 0;

    /**
     * Absolute coordinates this player is at.
     */
    public int absX = 0;
    public int[] killedBy = new int[Engine.players.length];
    public int absY = 0;
    /**
     * KilledBy.
     */

    /**
     * The height level this player is at.
     */
    public int heightLevel = 0;

    /**
     * If either are above -1 then the player is in motion.
     */
    public int walkDir = -1;
    public int runDir = -1;

    /**
     * True if the player is running, false if it isn't.
     */
    public boolean isRunning = false;

    /**
     * Set to true if the player has entered a new map region.
     */
    public boolean mapRegionDidChange = false;

    /**
     * Set to true if teleported.
     */
    public boolean didTeleport = false;

    /**
     * Set Absolute coordinates to these.
     */
    public int teleportToX = -1;
    public int teleportToY = -1;

    /**
     * True if the player is Reqing an update.
     */
    public boolean updateReq = false;

    /**
     * Max number of steps this player can have pending.
     */
    public int walkingQueueSize = 50;
    public int wQueueReadPtr = 0;
    public int wQueueWritePtr = 0;

    /**
     * Positions the player is Reqing to walk to.
     */
    public int[] walkingQueueX = new int[walkingQueueSize];
    public int[] walkingQueueY = new int[walkingQueueSize];
    public int[] walkingQueue = new int[walkingQueueSize];

    /**
     * All the players within distance.
     */
    public Player[] playerList = new Player[Engine.players.length];

    /**
     * All the players stored in distance.
     */
    public byte[] playersInList = new byte[Engine.players.length];
    public int playerListSize = 0;

    /**
     * True if chatting is Reqing to be sent.
     */
    public boolean chatTextUpdateReq = false;
    public String chatText = "";
    public int chatTextEffects = 0;

    /**
     * True if an appearance update is needed.
     */
    public boolean appearanceUpdateReq = false;

    /**
     * Animation data.
     */
    public boolean animUpdateReq = false;
    public int animReq = -1;
    public int animDelay = 0;

    /**
     * GFX data.
     */
    public boolean gfxUpdateReq = false;
    public int gfxReq = -1;
    public int gfxDelay = 0;

    /**
     * Player and NPC facing data.
     */
    public boolean faceToUpdateReq = false;
    public int faceToReq = -1;

    /**
     * Damage data.
     */
    public boolean hit1UpdateReq = false;
    public boolean hit2UpdateReq = false;
    public int hitDiff1 = 0;
    public int hitDiff2 = 0;
    public int posionHit1 = 0;
    public int posionHit2 = 0;

    /**
     * Skill level data.
     */
    public int[] skillLvl = new int[25];
    public int[] skillXP = new int[25];
    public int[] skillLvlA = new int[25];
    public int combatLevel = 0;

    /**
     * Player headicons.
     */
    public int pkIcon = -1;
    public int headIcon = -1;
    public int prayerIcon = -1;

    /**
     * Prayer settings.
     */
    public int prayerDrain = 100;
    public int drainRate = 0;
    public int defLow = 0;
    public int strLow = 1;
    public int atkLow = 2;
    public int rangeLow = 3;
    public int mageLow = 4;
    public int defMid = 5;
    public int strMid = 6;
    public int atkMid = 7;
    public int rapidRestore = 8;
    public int rapidHeal = 9;
    public int protItems = 10;
    public int rangeMid = 11;
    public int mageMid = 12;
    public int defHigh = 13;
    public int strHigh = 14;
    public int atkHigh = 15;
    public int prayMage = 16;
    public int prayRange = 17;
    public int prayMelee = 18;
    public int rangeHigh = 19;
    public int mageHigh = 20;
    public int retribution = 21;
    public int redepmtion = 22;
    public int smite = 23;
    public int praySummon = 24;
    public int chivalry = 25;
    public int piety = 26;
    public boolean prayOn[] = new boolean[27];

    /**
     * Equipment data.
     */
    public int[] equipment = new int[14];
    public int[] equipmentN = new int[14];
    public int[] equipmentBonus = new int[12];

    /**
     * Player appearance.
     */
    public int[] colour = new int[5];
    public int[] look = new int[7];
    public int npcType = -1;
    public int gender = 0;

    /**
     * Player emotes.
     */
    public int runEmote = 0x338;
    public int walkEmote = 0x333;
    public int standEmote = 0x328;
    public int attackEmote = 422;

    /**
     * All the NPCs within distance.
     */
    public NPC[] npcList = new NPC[Engine.npcs.length];

    /**
     * All the npcs stored in distance.
     */
    public byte[] npcsInList = new byte[Engine.npcs.length];
    public int npcListSize = 0;

    /**
     * Rebuild the entire NPC list.
     */
    public boolean rebuildNPCList = false;

    /**
     * An array storing all the players items.
     */
    public int[] items = new int[28];
    public int[] itemsN = new int[28];

    /**
     * Open interfaces, use these to confirm an interface is open when trying to use one.
     */
    public int interfaceId = -1;
    public int chatboxInterfaceId = -1;

    /**
     * The current position in the login stage.
     */
    public int loginStage = 0;

    /**
     * Click x position.
     */
    public int clickX = 0;

    /**
     * Click y position.
     */
    public int clickY = 0;

    /**
     * Click id.
     */
    public int clickId = 0;

    /**
     * True if the player is trying to pickup an item.
     */
    public boolean itemPickup = false;

    /**
     * True if the player is dead.
     */
    public boolean isDead = false;

    /**
     * Set run energy.
     */
    public boolean runEnergyUpdateReq = false;

    /**
     * Wilderness ditch jump data.
     */
    public int jumpDelay = 0;
    public boolean jumpUpdateReq = true;

    /**
     * Amount of current run energy.
     */
    public int runEnergy = 100;

    /**
     * Delay before run energy can increase.
     */
    public int runEnergyDelay = 0;

    /**
     * Clicked the first option on a player.
     */
    public boolean playerOption1 = false;

    /**
     * Clicked the second option on a player.
     */
    public boolean playerOption2 = false;

    /**
     * Clicked the third option on a player.
     */
    public boolean playerOption3 = false;


    /**
     * Clicked the first option on a NPC.
     */
    public boolean npcOption1 = false;
    public boolean npcOption3 = false;

    /**
     * Clicked the first option on an object.
     */
    public boolean objectOption1 = false;

    /**
     * Setting the players weapon.
     */
    public PlayerWeapon playerWeapon = new PlayerWeapon(this);

    /**
     * Clicked the second option on an object.
     */
    public boolean objectOption2 = false;

    /**
     * Clicked the second option on a NPC.
     */
    public boolean npcOption2 = false;

    /**
     * Forced chat.
     */
    public String forceChat = "";
    public boolean forceChatUpdateReq = false;

    /**
     * Stat restore delay.
     */
    public int statRestoreDelay = 75;

    /**
     * Teleporting variables.
     */
    public int teleX = -1;
    public int teleY = -1;
    public int teleDelay = -1;
    public int teleFinishGFX = 0;
    public int teleFinishGFXHeight = 0;
    public int teleFinishAnim = 0;

    /**
     * Attacking interface data.
     */
    public int attackStyle = 0;
    public int autoRetaliate = 0;

    /**
     * Special bar data.
     */
    public boolean specialAmountUpdateReq = false;
    public int specialAmountDelay = 0;
    public int specialAmount = 100;
    public boolean usingSpecial = false;

    /**
     * Skull data.
     */
    public int skulledDelay = 0;
    public boolean skulledUpdateReq = false;

    /**
     * Eat data.
     */
    public int eatDelay = 0;
    public int buryDelay = 0;

    /**
     * Set Drinking
     */
    public int drinkDelay = 0;
    public int statPotRestoreDelay = 5;

    /**
     * Magic on player.
     */
    public int magicDelay = 0;
    public int freezeDelay = 0;

    /**
     * NPC combat.
     */
    public int attackNPC = 0;
    public boolean attackingNPC = false;

    /**
     * Delay before recieving packets.
     */
    public boolean showAttackOption = false;
    public int clickDelay = -1;
    public int attackDelay = 5;
    public long loginTimeout = System.currentTimeMillis();
    public int deathDelay = 7;
    public boolean afterDeathUpdateReq = false;
    public int deathMessage = 0;
    public int attackPlayer = 0;
    public boolean attackingPlayer = false;
    public int combatDelay = 0;
    public int npcDelay = 0;
    public int messageCount = 0;
    public int memberCount = 0;
    /**
     * Arrays holding the items + their amounts of your bank
     */
    public int[] bankItems = new int[Engine.playerBank.SIZE];
    public int[] bankItemsN = new int[Engine.playerBank.SIZE];
    /**
     * The slot at which each bank tab starts at
     */
    public int[] tabStartSlot = new int[11];
    /**
     * The amount of items that you have last withrawn/deposited with the X function
     */
    public int bankX = 50;
    /**
     * The tab you are viewing, used to store items in it when depositing
     */
    public int viewingBankTab = 10;
    /**
     * If you are withrawing items as a note
     */
    public boolean withdrawNote;
    /**
     * If you are using insert mode
     */
    public boolean insertMode;

    /**
     * Constructs a new Player.
     *
     * @param socket The socket this Player belongs to.
     * @param id     The index this player is at.
     */
    public Player(Socket socket, int id) {

        magicNPC = new MagicNPC(this);
        this.socket = new PlayerSocket(this, socket);
        playerId = id;
        look[1] = 10;
        look[2] = 18;
        look[3] = 26;
        look[4] = 33;
        look[5] = 36;
        pTrade = new PTrade(this);
        look[6] = 42;
        wc = new Woodcutting(this);
        mi = new Mining(this);
        File curFile3 = new File(DavidScape.Server.workingDir + "data/characters/mainsave/" + username + ".txt");
        if (!curFile3.exists()) {
            for (int i = 0; i < skillLvl.length; i++) {
                skillLvl[3] = 10;
                skillXP[3] = 1154;

                skillLvl[0] = 1;
                skillLvl[1] = 1;
                skillLvl[2] = 1;
                skillLvl[6] = 1;
                skillLvl[4] = 1;
                skillLvl[5] = 1;
                skillLvl[7] = 1;
                skillLvl[8] = 1;
                skillLvl[9] = 1;
                skillLvl[10] = 1;
                skillLvl[11] = 1;
                skillLvl[12] = 1;
                skillLvl[13] = 1;
                skillLvl[14] = 1;
                skillLvl[15] = 1;
                skillLvl[16] = 1;
                skillLvl[17] = 1;
                skillLvl[18] = 1;
                skillLvl[19] = 1;
                skillLvl[20] = 1;
                skillLvl[21] = 1;
                skillLvl[22] = 1;
                skillLvl[23] = 1;
                skillLvl[24] = 1;
            }

            for (int i = 0; i < items.length; i++) {
                items[i] = -1;
            }
            for (int i = 0; i < equipment.length; i++) {
                equipment[i] = -1;
            }
            for (int i = 0; i < bankItems.length; i++) {
                bankItems[i] = -1;
            }

        }
        for (int i = 0; i < ShopItems.length; i++) {
            ShopItems[i] = -1;
        }

        for (int i = 0; i < ShopItemsA.length; i++) {
            ShopItemsA[i] = 1;
        }
    }

    /**
     * This method is called every 600 milliseconds.
     * <p>While this is good for for changing integers, this
     * should not be abused. Things that can be handled else where should
     * be done in that way, such as clicking the accept button in trade
     * should update in the ActionsButton class rather than Reqing
     * an update for the process to handle.
     */
    public int objectX = 0;
    public int objectY = 0;
    public int objectHeight = 0;

    public int Members = 0;
    public int Counted = 0;
    public int firedelay = 0;
    public int ActionTimer = 0;
    public int MyCount = 0;
    public int MyCount2 = 0;
    public int Overlay = 0;
    public int OverTimer = -1;
    public int totalXP = 0;

    public int totalz = 0;


    public void bumpscores(Player p, int bump) {

    }

    public void setscores(Player p) {
        if (p.rights < 3) {
            if (p.username == Engine.fileManager.placeN01 && p.totalz > Engine.fileManager.place01) {
                Engine.fileManager.place01 = 0;
                Engine.fileManager.placeN01 = "";
            }
            if (p.username == Engine.fileManager.placeN02 && p.totalz > Engine.fileManager.place02) {
                Engine.fileManager.place02 = 0;
                Engine.fileManager.placeN02 = "";
            }
            if (p.username == Engine.fileManager.placeN03 && p.totalz > Engine.fileManager.place03) {
                Engine.fileManager.place03 = 0;
                Engine.fileManager.placeN03 = "";
            }

            if (p.username == Engine.fileManager.placeN04 && p.totalz > Engine.fileManager.place04) {
                Engine.fileManager.place04 = 0;
                Engine.fileManager.placeN04 = "";
            }

            if (p.username == Engine.fileManager.placeN05 && p.totalz > Engine.fileManager.place05) {
                Engine.fileManager.place05 = 0;
                Engine.fileManager.placeN05 = "";
            }
            if (p.username == Engine.fileManager.placeN06 && p.totalz > Engine.fileManager.place06) {
                Engine.fileManager.place06 = 0;
                Engine.fileManager.placeN06 = "";
            }
            if (p.username == Engine.fileManager.placeN07 && p.totalz > Engine.fileManager.place07) {
                Engine.fileManager.place07 = 0;
                Engine.fileManager.placeN07 = "";
            }
            if (p.username == Engine.fileManager.placeN08 && p.totalz > Engine.fileManager.place08) {
                Engine.fileManager.place08 = 0;
                Engine.fileManager.placeN08 = "";
            }
            if (p.username == Engine.fileManager.placeN09 && p.totalz > Engine.fileManager.place09) {
                Engine.fileManager.place09 = 0;
                Engine.fileManager.placeN09 = "";
            }
            if (p.username == Engine.fileManager.placeN10 && p.totalz > Engine.fileManager.place10) {
                Engine.fileManager.place10 = 0;
                Engine.fileManager.placeN10 = "";
            }
            if (p.username == Engine.fileManager.placeN10 && p.totalz > Engine.fileManager.place11) {
                Engine.fileManager.place11 = 0;
                Engine.fileManager.placeN11 = "";
            }
            if (p.username == Engine.fileManager.placeN10 && p.totalz > Engine.fileManager.place12) {
                Engine.fileManager.place12 = 0;
                Engine.fileManager.placeN12 = "";
            }
            if (p.username == Engine.fileManager.placeN13 && p.totalz > Engine.fileManager.place13) {
                Engine.fileManager.place13 = 0;
                Engine.fileManager.placeN13 = "";
            }
            if (p.username == Engine.fileManager.placeN14 && p.totalz > Engine.fileManager.place14) {
                Engine.fileManager.place14 = 0;
                Engine.fileManager.placeN14 = "";
            }
            if (p.username == Engine.fileManager.placeN15 && p.totalz > Engine.fileManager.place15) {
                Engine.fileManager.place15 = 0;
                Engine.fileManager.placeN15 = "";
            }
            if (p.username == Engine.fileManager.placeN16 && p.totalz > Engine.fileManager.place16) {
                Engine.fileManager.place16 = 0;
                Engine.fileManager.placeN16 = "";
            }
            if (p.username == Engine.fileManager.placeN17 && p.totalz > Engine.fileManager.place17) {
                Engine.fileManager.place17 = 0;
                Engine.fileManager.placeN17 = "";
            }
            if (p.username == Engine.fileManager.placeN18 && p.totalz > Engine.fileManager.place18) {
                Engine.fileManager.place18 = 0;
                Engine.fileManager.placeN18 = "";
            }
            if (p.username == Engine.fileManager.placeN19 && p.totalz > Engine.fileManager.place19) {
                Engine.fileManager.place19 = 0;
                Engine.fileManager.placeN19 = "";
            }
            if (p.username == Engine.fileManager.placeN20 && p.totalz > Engine.fileManager.place20) {
                Engine.fileManager.place20 = 0;
                Engine.fileManager.placeN20 = "";
            }
            if (p.username == Engine.fileManager.placeN21 && p.totalz > Engine.fileManager.place21) {
                Engine.fileManager.place21 = 0;
                Engine.fileManager.placeN21 = "";
            }
            if (p.username == Engine.fileManager.placeN22 && p.totalz > Engine.fileManager.place22) {
                Engine.fileManager.place22 = 0;
                Engine.fileManager.placeN22 = "";
            }
            if (p.username == Engine.fileManager.placeN23 && p.totalz > Engine.fileManager.place23) {
                Engine.fileManager.place23 = 0;
                Engine.fileManager.placeN23 = "";
            }
            if (p.username == Engine.fileManager.placeN24 && p.totalz > Engine.fileManager.place24) {
                Engine.fileManager.place24 = 0;
                Engine.fileManager.placeN24 = "";
            }
            if (p.username == Engine.fileManager.placeN25 && p.totalz > Engine.fileManager.place25) {
                Engine.fileManager.place25 = 0;
                Engine.fileManager.placeN25 = "";
            }
            if (p.username == Engine.fileManager.placeN26 && p.totalz > Engine.fileManager.place26) {
                Engine.fileManager.place26 = 0;
                Engine.fileManager.placeN26 = "";
            }
            if (p.username == Engine.fileManager.placeN27 && p.totalz > Engine.fileManager.place27) {
                Engine.fileManager.place27 = 0;
                Engine.fileManager.placeN27 = "";
            }
            if (p.username == Engine.fileManager.placeN28 && p.totalz > Engine.fileManager.place28) {
                Engine.fileManager.place28 = 0;
                Engine.fileManager.placeN28 = "";
            }
            if (p.username == Engine.fileManager.placeN29 && p.totalz > Engine.fileManager.place29) {
                Engine.fileManager.place29 = 0;
                Engine.fileManager.placeN29 = "";
            }
            if (p.username == Engine.fileManager.placeN30 && p.totalz > Engine.fileManager.place30) {
                Engine.fileManager.place30 = 0;
                Engine.fileManager.placeN30 = "";
            }
        }
        Engine.fileManager.places[1] = p.totalz;

        if (p.rights < 3) {
            if (p.totalz > Engine.fileManager.place01 || p.totalz == Engine.fileManager.place01 && p.totalXP >= Engine.fileManager.place01) {
                bumpscores(p, 1);
                Engine.fileManager.placeXP01 = p.totalXP;
                Engine.fileManager.place01 = p.totalz;
                Engine.fileManager.placeN01 = p.username;
            } else if (p.totalz > Engine.fileManager.place02 || p.totalz == Engine.fileManager.place02 && p.totalXP >= Engine.fileManager.placeXP02) {
                bumpscores(p, 2);
                Engine.fileManager.placeXP02 = p.totalXP;
                Engine.fileManager.place02 = p.totalz;
                Engine.fileManager.placeN02 = p.username;
            } else if (p.totalz > Engine.fileManager.place03 || p.totalz == Engine.fileManager.place03 && p.totalXP >= Engine.fileManager.placeXP03) {
                bumpscores(p, 3);
                Engine.fileManager.placeXP03 = p.totalXP;
                Engine.fileManager.place03 = p.totalz;
                Engine.fileManager.placeN03 = p.username;
            } else if (p.totalz > Engine.fileManager.place04 || p.totalz == Engine.fileManager.place04 && p.totalXP >= Engine.fileManager.placeXP04) {
                bumpscores(p, 4);
                Engine.fileManager.placeXP04 = p.totalXP;
                Engine.fileManager.place04 = p.totalz;
                Engine.fileManager.placeN04 = p.username;
            } else if (p.totalz > Engine.fileManager.place05 || p.totalz == Engine.fileManager.place05 && p.totalXP >= Engine.fileManager.placeXP05) {
                bumpscores(p, 5);
                Engine.fileManager.placeXP05 = p.totalXP;
                Engine.fileManager.place05 = p.totalz;
                Engine.fileManager.placeN05 = p.username;
            } else if (p.totalz > Engine.fileManager.place06 || p.totalz == Engine.fileManager.place06 && p.totalXP >= Engine.fileManager.placeXP06) {
                bumpscores(p, 6);
                Engine.fileManager.placeXP06 = p.totalXP;
                Engine.fileManager.place06 = p.totalz;
                Engine.fileManager.placeN06 = p.username;
            } else if (p.totalz > Engine.fileManager.place07 || p.totalz == Engine.fileManager.place07 && p.totalXP >= Engine.fileManager.placeXP07) {
                bumpscores(p, 7);
                Engine.fileManager.placeXP07 = p.totalXP;
                Engine.fileManager.place07 = p.totalz;
                Engine.fileManager.placeN07 = p.username;
            } else if (p.totalz > Engine.fileManager.place08 || p.totalz == Engine.fileManager.place08 && p.totalXP >= Engine.fileManager.placeXP08) {
                bumpscores(p, 8);
                Engine.fileManager.placeXP08 = p.totalXP;
                Engine.fileManager.place08 = p.totalz;
                Engine.fileManager.placeN08 = p.username;
            } else if (p.totalz > Engine.fileManager.place09 || p.totalz == Engine.fileManager.place09 && p.totalXP >= Engine.fileManager.placeXP09) {
                bumpscores(p, 9);
                Engine.fileManager.placeXP09 = p.totalXP;
                Engine.fileManager.place09 = p.totalz;
                Engine.fileManager.placeN09 = p.username;
            } else if (p.totalz > Engine.fileManager.place10 || p.totalz == Engine.fileManager.place10 && p.totalXP >= Engine.fileManager.placeXP10) {
                bumpscores(p, 10);
                Engine.fileManager.placeXP10 = p.totalXP;
                Engine.fileManager.place10 = p.totalz;
                Engine.fileManager.placeN10 = p.username;
            } else if (p.totalz > Engine.fileManager.place11 || p.totalz == Engine.fileManager.place11 && p.totalXP >= Engine.fileManager.placeXP11) {
                bumpscores(p, 11);
                Engine.fileManager.placeXP11 = p.totalXP;
                Engine.fileManager.place11 = p.totalz;
                Engine.fileManager.placeN11 = p.username;
            } else if (p.totalz > Engine.fileManager.place12 || p.totalz == Engine.fileManager.place12 && p.totalXP >= Engine.fileManager.placeXP12) {
                bumpscores(p, 12);
                Engine.fileManager.placeXP12 = p.totalXP;
                Engine.fileManager.place12 = p.totalz;
                Engine.fileManager.placeN12 = p.username;
            } else if (p.totalz > Engine.fileManager.place13 || p.totalz == Engine.fileManager.place13 && p.totalXP >= Engine.fileManager.placeXP13) {
                bumpscores(p, 13);
                Engine.fileManager.placeXP13 = p.totalXP;
                Engine.fileManager.place13 = p.totalz;
                Engine.fileManager.placeN13 = p.username;
            } else if (p.totalz > Engine.fileManager.place14 || p.totalz == Engine.fileManager.place14 && p.totalXP >= Engine.fileManager.placeXP14) {
                bumpscores(p, 14);
                Engine.fileManager.placeXP14 = p.totalXP;
                Engine.fileManager.place14 = p.totalz;
                Engine.fileManager.placeN14 = p.username;
            } else if (p.totalz > Engine.fileManager.place15 || p.totalz == Engine.fileManager.place15 && p.totalXP >= Engine.fileManager.placeXP15) {
                bumpscores(p, 15);
                Engine.fileManager.placeXP15 = p.totalXP;
                Engine.fileManager.place15 = p.totalz;
                Engine.fileManager.placeN15 = p.username;
            } else if (p.totalz > Engine.fileManager.place16 || p.totalz == Engine.fileManager.place16 && p.totalXP >= Engine.fileManager.placeXP16) {
                bumpscores(p, 16);
                Engine.fileManager.placeXP16 = p.totalXP;
                Engine.fileManager.place16 = p.totalz;
                Engine.fileManager.placeN16 = p.username;
            } else if (p.totalz > Engine.fileManager.place17 || p.totalz == Engine.fileManager.place17 && p.totalXP >= Engine.fileManager.placeXP17) {
                bumpscores(p, 17);
                Engine.fileManager.placeXP17 = p.totalXP;
                Engine.fileManager.place17 = p.totalz;
                Engine.fileManager.placeN17 = p.username;
            } else if (p.totalz > Engine.fileManager.place18 || p.totalz == Engine.fileManager.place18 && p.totalXP >= Engine.fileManager.placeXP18) {
                bumpscores(p, 18);
                Engine.fileManager.placeXP18 = p.totalXP;
                Engine.fileManager.place18 = p.totalz;
                Engine.fileManager.placeN18 = p.username;
            } else if (p.totalz > Engine.fileManager.place19 || p.totalz == Engine.fileManager.place19 && p.totalXP >= Engine.fileManager.placeXP19) {
                bumpscores(p, 19);
                Engine.fileManager.placeXP19 = p.totalXP;
                Engine.fileManager.place19 = p.totalz;
                Engine.fileManager.placeN19 = p.username;
            } else if (p.totalz > Engine.fileManager.place20 || p.totalz == Engine.fileManager.place20 && p.totalXP >= Engine.fileManager.placeXP20) {
                bumpscores(p, 20);
                Engine.fileManager.placeXP20 = p.totalXP;
                Engine.fileManager.place20 = p.totalz;
                Engine.fileManager.placeN20 = p.username;
            } else if (p.totalz > Engine.fileManager.place21 || p.totalz == Engine.fileManager.place21 && p.totalXP >= Engine.fileManager.placeXP21) {
                bumpscores(p, 21);
                Engine.fileManager.placeXP21 = p.totalXP;
                Engine.fileManager.place21 = p.totalz;
                Engine.fileManager.placeN21 = p.username;
            } else if (p.totalz > Engine.fileManager.place22 || p.totalz == Engine.fileManager.place22 && p.totalXP >= Engine.fileManager.placeXP22) {
                bumpscores(p, 22);
                Engine.fileManager.placeXP22 = p.totalXP;
                Engine.fileManager.place22 = p.totalz;
                Engine.fileManager.placeN22 = p.username;
            } else if (p.totalz > Engine.fileManager.place23 || p.totalz == Engine.fileManager.place23 && p.totalXP >= Engine.fileManager.placeXP23) {
                bumpscores(p, 23);
                Engine.fileManager.placeXP23 = p.totalXP;
                Engine.fileManager.place23 = p.totalz;
                Engine.fileManager.placeN23 = p.username;
            } else if (p.totalz > Engine.fileManager.place24 || p.totalz == Engine.fileManager.place24 && p.totalXP >= Engine.fileManager.placeXP24) {
                bumpscores(p, 24);
                Engine.fileManager.placeXP24 = p.totalXP;
                Engine.fileManager.place24 = p.totalz;
                Engine.fileManager.placeN24 = p.username;
            } else if (p.totalz > Engine.fileManager.place25 || p.totalz == Engine.fileManager.place25 && p.totalXP >= Engine.fileManager.placeXP25) {
                bumpscores(p, 25);
                Engine.fileManager.placeXP25 = p.totalXP;
                Engine.fileManager.place25 = p.totalz;
                Engine.fileManager.placeN25 = p.username;
            } else if (p.totalz > Engine.fileManager.place26 || p.totalz == Engine.fileManager.place26 && p.totalXP >= Engine.fileManager.placeXP26) {
                bumpscores(p, 26);
                Engine.fileManager.placeXP26 = p.totalXP;
                Engine.fileManager.place26 = p.totalz;
                Engine.fileManager.placeN26 = p.username;
            } else if (p.totalz > Engine.fileManager.place27 || p.totalz == Engine.fileManager.place27 && p.totalXP >= Engine.fileManager.placeXP27) {
                bumpscores(p, 27);
                Engine.fileManager.placeXP27 = p.totalXP;
                Engine.fileManager.place27 = p.totalz;
                Engine.fileManager.placeN27 = p.username;
            } else if (p.totalz > Engine.fileManager.place28 || p.totalz == Engine.fileManager.place28 && p.totalXP >= Engine.fileManager.placeXP28) {
                bumpscores(p, 28);
                Engine.fileManager.placeXP28 = p.totalXP;
                Engine.fileManager.place28 = p.totalz;
                Engine.fileManager.placeN28 = p.username;
            } else if (p.totalz > Engine.fileManager.place29 || p.totalz == Engine.fileManager.place29 && p.totalXP >= Engine.fileManager.placeXP29) {
                bumpscores(p, 29);
                Engine.fileManager.placeXP29 = p.totalXP;
                Engine.fileManager.place29 = p.totalz;
                Engine.fileManager.placeN29 = p.username;
            } else if (p.totalz > Engine.fileManager.place30 || p.totalz == Engine.fileManager.place30 && p.totalXP >= Engine.fileManager.placeXP30) {
                bumpscores(p, 30);
                Engine.fileManager.placeXP30 = p.totalXP;
                Engine.fileManager.place30 = p.totalz;
                Engine.fileManager.placeN30 = p.username;
            }
        }
    }


    public int DragTimer = -1;

    public void dropCake() {
        int item = 1897;
        int x2 = Misc.random(3);
        int y2 = Misc.random(3);
        if (Misc.random(2) == 1) {
            x2 = -x2;
        }
        if (Misc.random(2) == 1) {
            y2 = -y2;
        }
        if (Misc.random(30) == 1) {
            item = 2651;
        }

//Engine.items.createGroundItem(item, 1, absX+x2, absY+y2, heightLevel, username);
    }

    public void attackPlayer(boolean atkPlayer) {
        attackingPlayer = atkPlayer;
    }

    public int saveTimer = 17;

    public void process() {
        if (jailTimer > 0) jailTimer--;
        if (jailTimer == 0) {
            requestForceChat("I have been jailed for breaking the rules.");
            jailTimer = 20;
        }
        if (absX == reqX) {
            reqX = -1;
        }
        if (absY == reqY) {
            reqY = -1;
        }
        if (Misc.random(550) == 75) {
            dropCake();
        }
        if (saveTimer > 0) {
            saveTimer--;
        } else {
            try {

                Engine.fileManager.saveCharacter(this);
                objects();
                saveTimer = 10;
                if (interfaceId != 762 &&
                        interfaceId != 335 &&
                        interfaceId != 334 &&
                        interfaceId != 620) {


                    if (donecode != 1) {
                        frames.setOverlay(this, 524);
                        frames.setString(this, "You have not verified you account!", 524, 2);
                        frames.setString(this, "Please login again for instructions!", 524, 1);
                    }
                }
            } catch (Exception e) {
            }
        }
        if (taken > 0 && !inAssault) {
            Engine.playerItems.deleteItem(this, 554, (int) (30 * taken));
            Engine.playerItems.deleteItem(this, 555, (int) (30 * taken));
            Engine.playerItems.deleteItem(this, 556, (int) (30 * taken));
            Engine.playerItems.deleteItem(this, 557, (int) (30 * taken));
            Engine.playerItems.deleteItem(this, 558, (int) (30 * taken));
            Engine.playerItems.deleteItem(this, 560, (int) (30 * taken));
            Engine.playerItems.deleteItem(this, 565, (int) (30 * taken));
            Engine.playerItems.deleteItem(this, 562, (int) (30 * taken));
            taken = 0;
        }

        if (clawTimer2 > 0) clawTimer2--;
        if (clawTimer2 == 0 && UseClaws2) {
            dClaw3(this);
            UseClaws2 = false;
        }
        if (HeadTimer > 0) HeadTimer -= 1;
        if (actionButtonTimer > 0) actionButtonTimer -= 1;
        if (objectTimer > 0) objectTimer -= 1;
        if (LoadedBackup > 0) LoadedBackup -= 1;

        if (MyCount2 > 0) {
            MyCount2--;
        } else if (MyCount2 <= 0) {
            readMaps();
            MyCount2 = 500;
        }

        if (HeadTimer == 6) {
            requestAnim(6654, 0);
        }
        if (HeadTimer == 0) {
            HeadTimer = -1;
            requestAnim(6655, 0);
        }
        if (jumpDelay > 0) {
            jumpDelay--;
            jumpUpdateReq = true;
        }

        if (jumpUpdateReq) {
            if (jumpDelay >= 1) {
                runEmote = walkEmote = 2750;
                updateReq = appearanceUpdateReq = true;
            }
            if (jumpDelay <= 0) {
                playerWeapon.setWeapon();
                jumpDelay = 0;
                updateReq = appearanceUpdateReq = true;
            }
            jumpUpdateReq = false;
        }
        if (DragonSlayer == 0) {
            frames.setString(this, "Dragon Slayer", 274, 7);
        } else if (DragonSlayer > 0 && DragonSlayer < 5) {
            frames.setString(this, "<col=FFFF00>Dragon Slayer", 274, 7);
        } else if (DragonSlayer == 5) {
            frames.setString(this, "<col=66FF33>Dragon Slayer", 274, 7);
        }
        if (graveStoneTimer > 0) graveStoneTimer -= 1;
        if (BoatTimer > 0) BoatTimer -= 1;
        if (ThunderTimer > 0) ThunderTimer -= 1;
        if (DragonTimer > 0) DragonTimer -= 1;
        if (CrashTimer > 0) CrashTimer -= 1;
        if (DragTimer > 0) DragTimer -= 1;
        if (FadeTimer > 0) FadeTimer -= 1;

        if (BoatTimer == 0) {
            BoatTimer = -1;
            ThunderTimer = 5;
            frames.showInterface(this, 543);
        }
        if (graveStoneTimer == 0) {
            graveStoneTimer = -1;
            graveStone = false;
            gsItems.clear();
            gsItemsN.clear();
            gsEquip.clear();
            gsEquipN.clear();
        }
        if (ThunderTimer == 0) {
            ThunderTimer = -1;
            DragonTimer = 3;
            frames.showInterface(this, 546);
        }
        if (DragonTimer == 0) {
            frames.removeShownInterface(this);
            DragonTimer = -1;
            CrashTimer = 4;
            frames.showChatboxInterface(this, 241);
            frames.animateInterfaceId(this, 9780, 241, 2);
            frames.setNPCId(this, 744, 241, 2);
            frames.setString(this, "Klarense", 241, 3);
            frames.setString(this, "Oh no! Theres a dragon comming this way!", 241, 4);
        }
        if (CrashTimer == 0) {
            CrashTimer = -1;
            DragTimer = 1;
            frames.showInterface(this, 545);
            frames.removeChatboxInterface(this);
        }

        if (DragTimer == 0) {
            DragTimer -= 1;
            FadeTimer = 4;
            frames.showInterface(this, 120);
        }
        if (FadeTimer == 0) {
            setCoords(2833, 9656, 0);
            FadeTimer = -1;
            frames.removeShownInterface(this);
            frames.sendMessage(this, "You wake up inside a cave...?");
        }

        totalz = getLevelForXP(0) + getLevelForXP(1) + getLevelForXP(2) + getLevelForXP(3) +
                getLevelForXP(4) + getLevelForXP(5) + getLevelForXP(6) + getLevelForXP(7) +
                getLevelForXP(8) + getLevelForXP(9) + getLevelForXP(10) + getLevelForXP(11) +
                getLevelForXP(12) + getLevelForXP(13) + getLevelForXP(14) + getLevelForXP(15) +
                getLevelForXP(16) + getLevelForXP(17) + getLevelForXP(18) + getLevelForXP(19) +
                getLevelForXP(20) + getLevelForXP(21) + getLevelForXP(22) + getLevelForXP(23);

        totalXP = skillXP[0] + skillXP[1] + skillXP[2] + skillXP[3] + skillXP[4] +
                skillXP[5] + skillXP[6] + skillXP[7] + skillXP[8] + skillXP[9] +
                skillXP[10] + skillXP[11] + skillXP[12] + skillXP[13] + skillXP[14] +
                skillXP[15] + skillXP[16] + skillXP[17] + skillXP[18] + skillXP[19] +
                skillXP[20] + skillXP[21] + skillXP[22] + skillXP[23];


        if (AtCastleWars() && Engine.CWGameTime < 1) {
            if (CWTeam == 0 && Engine.SaradominScore > Engine.ZamorakScore) {
                Engine.playerItems.addItem(this, 995, 300);
                frames.sendMessage(this, "Your team won!");
            }
            if (CWTeam == 0 && Engine.SaradominScore < Engine.ZamorakScore) {
                frames.sendMessage(this, "Your team lost!");
            }
            if (CWTeam == 1 && Engine.SaradominScore < Engine.ZamorakScore) {
                Engine.playerItems.addItem(this, 995, 300);
                frames.sendMessage(this, "Your team won!");
            }
            if (CWTeam == 1 && Engine.SaradominScore > Engine.ZamorakScore) {
                frames.sendMessage(this, "Your team lost!");
            }
            setCoords(2440 + Misc.random(4), 3085 + Misc.random(10), 0);
            OverTimer = 2;
            equipment[1] = -1;
            equipmentN[1] = 0;
            appearanceUpdateReq = true;
            updateReq = true;
            frames.setItems(this, 387, 28, 94, equipment, equipmentN);

            if (equipment[3] == 4037 && CWTeam == 1) {
                Engine.SaradominFlag = false;
                equipment[3] = -1;
                equipmentN[3] = 0;
                appearanceUpdateReq = true;
                updateReq = true;
                frames.setItems(this, 387, 28, 94, equipment, equipmentN);
            }
            if (equipment[3] == 4039 && CWTeam == 0) {
                Engine.ZamorakFlag = false;
                equipment[3] = -1;
                equipmentN[3] = 0;
                appearanceUpdateReq = true;
                updateReq = true;
                frames.setItems(this, 387, 28, 94, equipment, equipmentN);
            }
        }
        if (inAssault && !inAssault()) {
//inAssault = false;
//Engine.Assult.endGame();
        }

        for (Player pg : Engine.players) {
            if (pg != null) {
                Player ph = Engine.players[pg.playerId];


                Engine.SaradominTeam = SaraPeople[1] +
                        SaraPeople[2] + SaraPeople[3] + SaraPeople[4] + SaraPeople[5] +
                        SaraPeople[6] + SaraPeople[7] + SaraPeople[8] + SaraPeople[9] +
                        SaraPeople[10] + SaraPeople[11] + SaraPeople[12] + SaraPeople[13] +
                        SaraPeople[14] + SaraPeople[15] + SaraPeople[16] + SaraPeople[17] +
                        SaraPeople[18] + SaraPeople[19] + SaraPeople[20] + SaraPeople[21] +
                        SaraPeople[22] + SaraPeople[23] + SaraPeople[24] + SaraPeople[25] +
                        SaraPeople[26] + SaraPeople[27] + SaraPeople[28] + SaraPeople[29] +
                        SaraPeople[30] + SaraPeople[31] + SaraPeople[32] + SaraPeople[33];
                if (AtSaradominRoom()) {
                    pg.SaraPeople[playerId] = 1;
                } else {
                    pg.SaraPeople[playerId] = 0;
                }


                Engine.ZamorakTeam = ZammyPeople[1] +
                        ZammyPeople[2] + ZammyPeople[3] + ZammyPeople[4] + ZammyPeople[5] +
                        ZammyPeople[6] + ZammyPeople[7] + ZammyPeople[8] + ZammyPeople[9] +
                        ZammyPeople[10] + ZammyPeople[11] + ZammyPeople[12] + ZammyPeople[13] +
                        ZammyPeople[14] + ZammyPeople[15] + ZammyPeople[16] + ZammyPeople[17] +
                        ZammyPeople[18] + ZammyPeople[19] + ZammyPeople[20] + ZammyPeople[21] +
                        ZammyPeople[22] + ZammyPeople[23] + ZammyPeople[24] + ZammyPeople[25] +
                        ZammyPeople[26] + ZammyPeople[27] + ZammyPeople[28] + ZammyPeople[29] +
                        ZammyPeople[30] + ZammyPeople[31] + ZammyPeople[32] + ZammyPeople[33];
                if (AtZamorakRoom()) {
                    pg.ZammyPeople[playerId] = 1;
                } else {
                    pg.ZammyPeople[playerId] = 0;
                }
            }
        }


        if (AtSaradominRoom() && Engine.CWarsTimer < 1) {
            OverTimer = 5;
            setCoords(2425 + Misc.random(4), 3075 + Misc.random(4), 1);
            CWTeam = 0;
        }
        if (AtZamorakRoom() && Engine.CWarsTimer < 1) {
            OverTimer = 5;
            setCoords(2370 + Misc.random(4), 3128 + Misc.random(4), 1);
            CWTeam = 1;
        }

        if (AtZamorakRoom() || AtSaradominRoom()) {
            frames.setString(this, "Time till game starts:", 653, 7);
            frames.setString(this, (Engine.CWarsTimer / 2) + "", 653, 8);
            if (Overlay == 0) {
                Overlay = 1;
                frames.setOverlay(this, 653);
            }
        }

        if (AtCastleWars()) {
            if (Engine.SaradominFlag == false) {
                frames.setString(this, "Safe", 58, 4);
            } else {
                frames.setString(this, "<col=ff0000>Taken", 58, 4);
            }
            if (Engine.ZamorakFlag == false) {
                frames.setString(this, "Safe", 58, 5);
            } else {
                frames.setString(this, "<col=ff0000>Taken", 58, 5);
            }
            frames.setString(this, "Zamorak: " + Engine.ZamorakScore, 58, 0);
            frames.setString(this, "Saradomin: " + Engine.SaradominScore, 58, 1);
            frames.setString(this, "" + Engine.CWGameTime, 58, 8);
            if (Overlay == 0) {
                frames.setOverlay(this, 58);
                Overlay = 1;
            }
        }

//====================================FIGHT PITS==========================================
        if (PitGame > 0) PitGame -= 1;
        if (OverTimer > 0) OverTimer -= 1;
        if (OverTimer == 0) {
            OverTimer -= 1;
            Overlay = 0;
        }

        if (!AtPits() && !AtWaitRoom() && !AtZamorakRoom() && !AtSaradominRoom() && !AtCastleWars() && Overlay == 0) {
            Overlay = 1;
            frames.removeOverlay(this);
        }
        if (PitGame == 0 && AtPits() && GameStarted == false) {
            if (FightEnemys > 1) {
                GameStarted = true;
                frames.sendMessage(this, "Game Begins!");
                Overlay = 0;
            } else {
                GameStarted = false;
                frames.sendMessage(this, "No Enemy's to fight.");
                Engine.FightPitTimer = 120;
                setCoords(2395 + Misc.random(8), 5170 + Misc.random(4), 0);
                Overlay = 0;
            }
        }

        if (AtPits() && FightEnemys < 2 && GameStarted == true) {
            GameStarted = false;
            setCoords(2395 + Misc.random(8), 5170 + Misc.random(4), 0);
            frames.sendMessage(this, "You are victorious!");
            Engine.playerItems.addItem(this, Age(), 1);
            skillLvl[3] = getLevelForXP(3);
            frames.setSkillLvl(this, 3);
            Engine.FightPitTimer = 120;
            Overlay = 0;
            for (Player pe : Engine.players) {
                if (pe != null) {
                    frames.sendMessage(pe, "<col=FF00FF>" + username + " Level: " + combatLevel + " won the battle of the fight pits.");
                }
            }
        }
        if (AtPits()) {
            frames.setString(this, "Players:", 653, 7);
            frames.setString(this, FightEnemys + "", 653, 8);
            if (Overlay == 0) {
                frames.setOverlay(this, 653);
                Overlay = 1;
            }
        } else if (AtWaitRoom()) {
            if (Engine.FightPitTimer > 0) {
                frames.setString(this, "Time till game starts:", 653, 7);
                frames.setString(this, (Engine.FightPitTimer / 2) + "", 653, 8);
                if (Overlay == 0) {
                    frames.setOverlay(this, 653);
                    Overlay = 1;
                }
            } else {
                frames.setString(this, "Game has begun", 653, 7);
                frames.setString(this, "", 653, 8);
                if (Overlay == 0) {
                    Overlay = 1;
                    frames.setOverlay(this, 653);
                }
            }
        }

        if (Engine.FightPitTimer >= 0 && Engine.FightPitTimer <= 2 && AtWaitRoom()) {
            setCoords(2392 + Misc.random(13), 5152 + Misc.random(10), 0);
            frames.sendMessage(this, "10 Seconds till game begins.");
            PitGame = 20;
            Overlay = 0;
        }

        for (Player pe : Engine.players) {
            if (pe != null) {
                Player pt = Engine.players[pe.playerId];
                if (AtPits()) {
                    pe.FightPeople[playerId] = 1;
                } else {
                    pe.FightPeople[playerId] = 0;
                }

                FightEnemys = FightPeople[1] +
                        FightPeople[2] + FightPeople[3] + FightPeople[4] + FightPeople[5] +
                        FightPeople[6] + FightPeople[7] + FightPeople[8] + FightPeople[9] +
                        FightPeople[10] + FightPeople[11] + FightPeople[12] + FightPeople[13] +
                        FightPeople[14] + FightPeople[15] + FightPeople[16] + FightPeople[17] +
                        FightPeople[18] + FightPeople[19] + FightPeople[20] + FightPeople[21] +
                        FightPeople[22] + FightPeople[23] + FightPeople[24] + FightPeople[25] +
                        FightPeople[26] + FightPeople[27] + FightPeople[28] + FightPeople[29] +
                        FightPeople[30] + FightPeople[31] + FightPeople[32] + FightPeople[33];

                Engine.playersingame = FightEnemys;
            }
        }

//====================================END OF FIGHT PITS==========================================


        if (Engine.players[followPlayer] != null) {
        } else {
            followPlayer = 0;
            followingPlayer = false;
        }

        if (FamiliarID > 0) {
            NPC np = Engine.npcs[FamiliarID];
            if (np != null) {
                frames.animateInterfaceId(this, 9850, 663, 3);
                frames.setNPCId(this, np.npcType, 663, 3);
            }
        }

        if (AtClanField() && ClanTimer > 0) {
            GotThere = 1;
            createGlobalObject(28208, clanheight, 3268, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3269, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3270, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3271, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3272, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3273, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3274, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3275, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3276, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3277, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3278, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3279, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3280, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3281, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3282, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3283, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3284, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3285, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3286, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3287, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3288, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3289, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3290, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3291, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3292, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3293, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3294, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3295, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3296, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3297, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3298, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3299, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3300, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3301, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3302, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3303, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3304, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3305, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3306, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3307, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3308, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3309, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3310, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3311, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3312, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3313, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3314, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3315, 3775, 1, 0);
            createGlobalObject(28208, clanheight, 3316, 3775, 1, 0);
//createGlobalObject(28208, clanheight, 3317, 3775, 1, 0); 
        } else {
            GotThere = 1;
            createGlobalObject(13340, clanheight, 3268, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3269, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3270, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3271, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3272, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3273, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3274, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3275, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3276, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3277, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3278, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3279, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3280, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3281, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3282, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3283, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3284, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3285, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3286, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3287, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3288, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3289, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3290, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3291, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3292, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3293, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3294, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3295, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3296, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3297, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3298, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3299, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3300, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3301, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3302, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3303, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3304, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3305, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3306, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3307, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3308, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3309, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3310, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3311, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3312, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3313, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3314, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3315, 3775, 2, 0);
            createGlobalObject(13340, clanheight, 3316, 3775, 2, 0);
//createGlobalObject(13340, clanheight, 3317, 3775, 2, 0); 
        }

        if (clanchat == clanchannel) {
            for (Player pz : Engine.players) {
                for (int i = 0; i < ClanMember.length; i++) {
                    if (Engine.players[i] == null) {
                        ClanMember[i] = 0;
                    }
                }
                if (pz != null) {

                    Player pp = Engine.players[pz.playerId];


                    if (pp.clanchat == clanchannel && pp.AtClanField() && pp.AtJail() == false) {
                        ClanMember[pp.playerId] = 1;
                    } else {
                        ClanMember[pp.playerId] = 0;
                    }

                    if (pz.clanchat == clanchannel) {

                        pz.ClanCount = ClanMember[1] +
                                ClanMember[2] + ClanMember[3] + ClanMember[4] + ClanMember[5]
                                + ClanMember[6] + ClanMember[7] + ClanMember[8] + ClanMember[9]
                                + ClanMember[10] + ClanMember[11] + ClanMember[12] + ClanMember[13]
                                + ClanMember[14] + ClanMember[15] + ClanMember[16] + ClanMember[17]
                                + ClanMember[18] + ClanMember[19] + ClanMember[12] + ClanMember[20]
                                + ClanMember[21] + ClanMember[22] + ClanMember[23] + ClanMember[25]
                                + ClanMember[26] + ClanMember[27] + ClanMember[28] + ClanMember[29];


                    }


                }
            }
        }


        if (AtClanField() && ClanCount == 0 && ClanTimer < 1) {
            for (Player pz : Engine.players) {
                if (pz != null) {
                    if (pz.AtClanField() && pz.clanheight == clanheight && pz.clanchat == clanchat) {
                        pz.frames.showInterface(pz, 650);
                        pz.ResetClanWars();
                        pz.setCoords(3272, 3685, 0);
                        pz.frames.sendMessage(pz, "Clan wars game over!");
                    }
                }
            }
        }
        Player po = Engine.players[Opposing];


        Player pc = Engine.players[clanchat];
        if (clanchat == 0 && AtClanField()) {
            if (po != null) {
                if (ClanSide == 0) frames.setString(this, "Team 2", 265, 4);
                if (ClanSide == 1) frames.setString(this, "Team 1", 265, 4);
                frames.setString(this, "Members: " + po.ClanCount, 265, 5);
                frames.setString(this, "Members: " + ClanCount, 265, 3);
                frames.setTab(this, 8, 265);
            }
        }

        if (clanchat > 0 && AtClanField()) {
            if (po != null) {
                frames.setString(this, po.clanname + "", 265, 4);
                frames.setString(this, "Members: " + po.ClanCount, 265, 5);
                frames.setString(this, "Members: " + ClanCount, 265, 3);
                frames.setTab(this, 8, 265);
            }
        }

        if (po != null) {
            if (AtClanField() && po.ClanCount == 0 && ClanTimer < 1) {
                for (Player pz : Engine.players) {
                    if (pz != null) {
                        if (pz.AtClanField() && pz.clanheight == clanheight && pz.clanchat == clanchat) {
                            pz.frames.showInterface(pz, 651);
                            pz.ResetClanWars();
                            pz.setCoords(3272, 3685, 0);
                            pz.frames.sendMessage(pz, "Clan wars game over!");
                        }
                    }
                }
            }
        }


        if (ClanTimer > 0) ClanTimer -= 1;
        if (ClanTimer == 0) {
            GotThere = 0;
            ClanTimer = -1;
            frames.sendMessage(this, "Clan wars game begins!");
        }

        if (AtClanField() || AtClanLobby()) {
            frames.setPlayerOption(this, "Challenge", 3);
        } else {
            frames.setPlayerOption(this, "Duel", 3);
        }

        if (AtClanField() || AtDuel() || AtPits()) {
            frames.setPlayerOption(this, "Attack", 1);
        } else {
            frames.setPlayerOption(this, "Walk Here", 1);
        }


        if (DuelTimer > 0) DuelTimer -= 1;
        if (DuelTimer == 8) {
            chatText = "3";
            chatTextUpdateReq = true;
            updateReq = true;
        }
        if (DuelTimer == 6) {
            chatText = "2";
            chatTextUpdateReq = true;
            updateReq = true;
        }
        if (DuelTimer == 4) {
            chatText = "1";
            chatTextUpdateReq = true;
            updateReq = true;
        }
        if (DuelTimer == 2) {
            DuelCan = true;
            chatText = "Fight!!!";
            chatTextUpdateReq = true;
            DuelTimer = -1;
            updateReq = true;
        }

        if (absX == 0 && absY == 0) {
            setCoords(3222, 3219, 0);
        }
        if (AtDuel()) {
            Player p3 = Engine.players[DuelPartner];
            if (p3 == null) {
                ResetDuel();
                setCoords(DuelX, DuelY, 0);
                frames.sendMessage(this, "Your partner left the duel.");
            }
        }


        Rooms = Room0 + Room1 + Room2 + Room3 + Room4;

        frames.setString(this, "Number Of Rooms: " + Rooms, 398, 20);
        s1 = "davidi2";

        Player p2 = Engine.players[PersonHouse];
        if (p2 != null) {
            if (p2.KickPlayers == true)//Kicks other players out of owners home
            {
                PersonHouse = 0;
                frames.sendMessage(this, "You were kicked out of the house.");
                setCoords(2544, 3096, 0);
            }
        }
        if (InHouse == false)//Teleports Player out of house area on login
        {
            if (absX >= 3093 && absY >= 3920 && absX <= 3120 && absY <= 3950) {
                setCoords(2544, 3096, 0);
            }
        }

        if (HouseTele > 0) {
            HouseTele--;
        }
        if (TeleBackTimer > 0) {
            TeleBackTimer--;
        }


        if (HouseTele == 0)//This is where it loads the players home.
        {
            HouseTele = -1;
            if (OwnHouse == true) {
                frames.removeShownInterface(this);

                if (Room0 == 1) {
                    NewRoom(this, 3104, 3931, 0, HouseHeight, HouseDecor, Room0Type, 0);
                }


                if (Room1 == 0) {
                    if (Room0 == 1 && Garden == 0) {
                        createGlobalObject(HouseDecor, HouseHeight, 3104, 3938, 1, 0);
                        createGlobalObject(HouseDecor, HouseHeight, 3105, 3938, 1, 0);
                    }
                } else {
                    NewRoom(this, 3104, 3939, 1, HouseHeight, HouseDecor, Room1Type, 0);
                    frames.sendMessage(this, "Room 1 Loaded...");
                }
                if (Room2 == 0) {
                    if (Room0 == 1 && Garden == 0) {
                        createGlobalObject(HouseDecor, HouseHeight, 3108, 3934, 2, 0);
                        createGlobalObject(HouseDecor, HouseHeight, 3108, 3935, 2, 0);
                    }
                } else {
                    NewRoom(this, 3112, 3931, 2, HouseHeight, HouseDecor, Room2Type, 0);
                    frames.sendMessage(this, "Room 2 Loaded...");
                }

                if (Room3 == 0) {
                    if (Room0 == 1 && Garden == 0) {
                        createGlobalObject(HouseDecor, HouseHeight, 3101, 3934, 0, 0);
                        createGlobalObject(HouseDecor, HouseHeight, 3101, 3935, 0, 0);
                    }
                } else {
                    NewRoom(this, 3096, 3931, 3, HouseHeight, HouseDecor, Room3Type, 0);
                    frames.sendMessage(this, "Room 3 Loaded...");
                }

                if (Room4 == 1) {
                    NewRoom(this, 3104, 3923, 4, HouseHeight, HouseDecor, Room4Type, 0);
                    frames.sendMessage(this, "Room 4 Loaded...");
                }

                if (Garden == 0 && Garden4 == 1 && Room0 == 1 || Room0 == 1 && Room4 == 0 && Garden == 0) {
                    if (HouseDecor == 13116) {
                        createGlobalObject(13120, HouseHeight, 3105, 3930, 2, 0);
                        createGlobalObject(13121, HouseHeight, 3104, 3930, 0, 0);
                    }

                    if (HouseDecor == 1585 || HouseDecor == 1588) {
                        createGlobalObject(13008, HouseHeight, 3105, 3930, 2, 0);
                        createGlobalObject(13009, HouseHeight, 3104, 3930, 0, 0);
                    }
                }


            } else {

                if (p2 != null) {
                    frames.removeShownInterface(this);

                    if (p2.Room0 == 1) {
                        NewRoom(this, 3104, 3931, 0, p2.HouseHeight, p2.HouseDecor, 6, 0);
                    }

                    if (p2.Garden == 0 && p2.Garden4 == 1 && p2.Room0 == 1 || p2.Room0 == 1 && p2.Room4 == 0 && p2.Garden == 0) {
                        if (p2.HouseDecor == 13116) {
                            createGlobalObject(13120, p2.HouseHeight, 3105, 3930, 2, 0);
                            createGlobalObject(13121, p2.HouseHeight, 3104, 3930, 0, 0);
                        }

                        if (p2.HouseDecor == 1585 || p2.HouseDecor == 1588) {
                            createGlobalObject(13008, p2.HouseHeight, 3105, 3930, 2, 0);
                            createGlobalObject(13009, p2.HouseHeight, 3104, 3930, 0, 0);
                        }
                    }


                    if (p2.Room1 == 0) {
                        if (p2.Room0 == 1 && p2.Garden == 0) {
                            createGlobalObject(p2.HouseDecor, p2.HouseHeight, 3104, 3938, 1, 0);
                            createGlobalObject(p2.HouseDecor, p2.HouseHeight, 3105, 3938, 1, 0);
                        }
                    } else {
                        NewRoom(this, 3104, 3939, 1, p2.HouseHeight, p2.HouseDecor, p2.Room1Type, 0);
                        frames.sendMessage(this, "Room 1 Loaded...");
                    }
                    if (p2.Room2 == 0) {
                        if (p2.Room0 == 1 && p2.Garden == 0) {
                            createGlobalObject(p2.HouseDecor, p2.HouseHeight, 3108, 3934, 2, 0);
                            createGlobalObject(p2.HouseDecor, p2.HouseHeight, 3108, 3935, 2, 0);
                        }
                    } else {
                        NewRoom(this, 3112, 3931, 2, p2.HouseHeight, p2.HouseDecor, p2.Room2Type, 0);
                        frames.sendMessage(this, "Room 2 Loaded...");
                    }
                    if (p2.Room3 == 0) {
                        if (p2.Room0 == 1 && p2.Garden == 0) {
                            createGlobalObject(p2.HouseDecor, p2.HouseHeight, 3101, 3934, 0, 0);
                            createGlobalObject(p2.HouseDecor, p2.HouseHeight, 3101, 3935, 0, 0);
                        }
                    } else {
                        NewRoom(this, 3096, 3931, 3, p2.HouseHeight, p2.HouseDecor, p2.Room3Type, 0);
                        frames.sendMessage(this, "Room 3 Loaded...");
                    }
                    if (p2.Room4 == 1) {
                        NewRoom(this, 3104, 3923, 4, p2.HouseHeight, p2.HouseDecor, p2.Room4Type, 0);
                        frames.sendMessage(this, "Room 4 Loaded...");
                    }
                    if (p2.Room0 == 1) {
                        NewRoom(this, 3104, 3931, 0, p2.HouseHeight, p2.HouseDecor, p2.Room0Type, 0);
                        frames.sendMessage(this, "Room 0 Loaded...");
                    }


                } else {
                    setCoords(2544, 3096, 0);
                }
            }

        }


        if (SummonDelay > 0) {
            SummonDelay--;
        }

        if (HerbloreTimer > 0) {
            HerbloreTimer--;
        }
        if (HerbloreTimer == 0) {

            if (HerbloreType == 7871 || HerbloreType == 7941 || HerbloreType == 8111 || HerbloreType == 7855) {
                HerbloreTimer = -1;
                HerbloreType = 0;
                HerbType = 0;
            } else {
                HerbloreTimer = 30;
                if (HerbType == 1) {
                    createGlobalObject(HerbloreType + 1, heightLevel, 2809, 3463, 0, 10);
                } else {
                    createGlobalObject(HerbloreType + 1, heightLevel, 2813, 3463, 0, 10);
                }
                HerbloreType += 1;
            }
        }

        if (CookTimer > 0) CookTimer -= 1;

        if (CookTimer == 0) {
            if (CookAmount == 0) {
                CookTimer = -1;
            } else {
                CookThat(this, CookXP, CookID, CookGet);
            }
        }

        if (SmithingTimer > 0) SmithingTimer -= 1;

        if (SmithingTimer == 0) {
            if (SmithingAmount == 0) {
                SmithingTimer = -1;
            } else {
                SmeltThat(this, SmithingXP, SmithingID, SmithingGet);
            }
        }


        if (FletchTimer > 0) FletchTimer -= 1;

        if (FletchTimer == 0) {
            if (FletchAmount == 0) {
                FletchTimer = -1;
            } else {
                FletchThat(this, FletchXP, FletchID, FletchGet);
            }
        }

        if (FishTimer > 0) FishTimer -= 1;
        if (FishTimer == 0) {
            FishThat(this, FishXP, FishGet, FishEmote);
        }

        if (absX >= 3150 && absY >= 3476 && absX <= 3181 && absY <= 3505)//Grand Exchange
        {
            LocatedAt = "Grand Exchange.";
        } else if (absX >= 2652 && absY >= 3294 && absX <= 2670 && absY <= 3314)//Thieve
        {
            LocatedAt = "Thieving Market.";
        } else if (absX >= 2835 && absY >= 3533 && absX <= 2878 && absY <= 3556)//Combat Training
        {
            LocatedAt = "Combat Guild.";
        } else if (absX >= 2530 && absY >= 3543 && absX <= 2553 && absY <= 3558)//Agility
        {
            LocatedAt = "Barbarian Agility Course.";
        } else if (absX >= 3041 && absY >= 3477 && absX <= 3062 && absY <= 3505)//Monastary
        {
            LocatedAt = "Monastary.";
        } else if (absX >= 2652 && absY >= 3409 && absX <= 2685 && absY <= 3449)//Range Guild
        {
            LocatedAt = "Archery Guild.";
        } else if (absX >= 2692 && absY >= 3417 && absX <= 2711 && absY <= 3433)//Wc and fm
        {
            LocatedAt = "Woodcutting and Firemaking masters.";
        } else if (absX >= 2538 && absY >= 3077 && absX <= 2619 && absY <= 3108)//Yanille
        {
            LocatedAt = "Yanille";
        } else if (absX >= 2100 && absY >= 4800 && absX <= 2200 && absY <= 4900)//Runecrafting
        {
            LocatedAt = "Chaos rune altar.";
        } else if (absX >= 2918 && absY >= 3477 && absX <= 2933 && absY <= 3491)//Herblore
        {
            LocatedAt = "Herblore area.";
        } else if (absX >= 2915 && absY >= 3430 && absX <= 2937 && absY <= 3456)//Summoning
        {
            LocatedAt = "Summoning area.";
        } else if (absX >= 2804 && absY >= 3457 && absX <= 2816 && absY <= 3470)//Farming
        {
            LocatedAt = "Farming area.";
        } else if (absX >= 2798 && absY >= 3431 && absX <= 2841 && absY <= 3445)//Catherby
        {
            LocatedAt = "Catherby.";
        } else if (absX >= 2928 && absY >= 3275 && absX <= 2950 && absY <= 3290)//Crafting Guild
        {
            LocatedAt = "Crafting Guild.";
        } else if (absX >= 3156 && absY >= 3367 && absX <= 3272 && absY <= 3511)//Varrock
        {
            LocatedAt = "Varrock.";
        } else if (absX >= 3093 && absY >= 3920 && absX <= 3120 && absY <= 3950 && heightLevel == HouseHeight) {
            LocatedAt = "His House.";
        } else if (absX >= 3093 && absY >= 3920 && absX <= 3120 && absY <= 3950) {
            LocatedAt = "Some one elses House.";
        } else if (AtDuel()) {
            LocatedAt = "In a duel.";
        } else if (AtCastleWars()) {
            LocatedAt = "Castlee Wars";
        } else if (AtSaradominRoom()) {
            LocatedAt = "Saradomin Waiting room.";
        } else if (AtZamorakRoom()) {
            LocatedAt = "Zamorak Waiting room.";
        } else if (absX >= 2256 && absY >= 4680 && absX <= 2287 && absY <= 4711)//Slayer Cave
        {
            LocatedAt = "Slayer Cave.";
        } else if (absX >= 2370 && absY >= 5128 && absX <= 2426 && absY <= 5165)//Fight Pits
        {
            LocatedAt = "Fight Pits.";
        } else if (absX >= 2394 && absY >= 5169 && absX <= 2404 && absY <= 5175)//Fight Pits Waitin Room
        {
            LocatedAt = "Fight Pit waiting room.";
        } else if (absX >= 3546 && absY >= 9689 && absX <= 3557 && absY <= 9700)//Barrows
        {
            LocatedAt = "Barrows.";
        } else if (absX >= 2576 && absY >= 5259 && absX <= 2610 && absY <= 5300)//Waiting room
        {
            LocatedAt = "Barbarian Assault waiting room.";
        } else if (absX >= 1896 && absY >= 5452 && absX <= 1910 && absY <= 5488)//Ingame
        {
            LocatedAt = "Barbarian Assault game.";
        } else if (absY >= 3522 && absX > 2941 && !(absX > 2995 && absX < 3038))//Wilderness
        {
            LocatedAt = "Wilderness.";
        } else {
            LocatedAt = "Not in any of the main areas, must be wandering around.";
        }


        if (firedelay > 0) {
            firedelay--;
        }
        if (firedelay == 0) {
            frames.createGlobalObject(-1, objectHeight, objectX, objectY, 0, 10);
            Engine.items.createGroundItem(592, 1, objectX, objectY, heightLevel, username);
            firedelay = -1;
        }

        if (SwingTimer1 > 0) SwingTimer1 -= 1;
        if (SwingTimer1 == 0) {
            SwingTimer2 = 2;
            SwingTimer1 = -1;
            reqWalkQueue(2553, 3554);
        }
        if (SwingTimer2 > 0) SwingTimer2 -= 1;
        if (SwingTimer2 == 0) {
            chatText = "Yeah right.";
            chatTextUpdateReq = true;
            updateReq = true;
            SwingTimer2 = -1;
            reqWalkQueue(2553, 3549);
            SwingTimer3 = 4;
        }

        if (LogTimer > 0) LogTimer -= 1;
        if (LogTimer == 0) {
            chatText = "Easy peasy lemon squeezy...";
            chatTextUpdateReq = true;
            updateReq = true;
            LogTimer = -1;
        }
        if (animTimer > 0) animTimer -= 1;
        if (animTimer == 0) {
            playerWeapon.setWeapon();
            appearanceUpdateReq = true;
            updateReq = true;
            frames.setItems(this, 387, 28, 94, equipment, equipmentN);
            animTimer = -1;
        }

        if (SwingTimer3 > 0) SwingTimer3 -= 1;
        if (SwingTimer3 == 0) {
            SwingTimer3 = -1;
            reqWalkQueue(2551, 3546);
            addSkillXP(75 * skillLvl[16], 16);
            frames.sendMessage(this, "You earn some Agility XP for running...");
        }

        if (ActionTimer > 0) ActionTimer -= 1;

        if (NetTimer > 0) NetTimer -= 1;
        if (NetTimer == 0) {
            NetTimer = -1;
            setCoords(2538, 3546, 1);
        }
        if (PkTimer > 0) PkTimer -= 1;
        if (PkTimer == 0) {
            PkTimer -= 1;
            setCoords(3120 + Misc.random(8), 3721 + Misc.random(8), 0);
            frames.removeShownInterface(this);
        }
        if (ClanTele > 0) ClanTele -= 1;
        if (ClanTele == 0) {
            ClanTele -= 1;
            setCoords(3270 + Misc.random(7), 3685 + Misc.random(4), 0);
            frames.removeShownInterface(this);
        }
        if (JadTele > 0) JadTele -= 1;
        if (JadTele == 0) {
            JadTele -= 1;
            setCoords(2399, 5177, 0);
            frames.removeShownInterface(this);
        }

        if (SlayerCaveTimer > 0) SlayerCaveTimer -= 1;
        if (SlayerCaveTimer == 0) {
            SlayerCaveTimer -= 1;
            setCoords(2273, 4695, 0);
            frames.removeShownInterface(this);
        }
        if (AgilityTimer > 0) AgilityTimer -= 1;
        if (AgilityTimer == 0) {
            NewEmote = 0x338;
            runEmote = 0x338;
            walkEmote = 0x333;
            standEmote = 0x328;
            isRunning = true;
            AgilityTimer = -1;
            addSkillXP(AgilityXP * skillLvl[16], 16);
            frames.sendMessage(this, "You earned Agility XP!");
        }
        if (wallTimer1 > 0) wallTimer1 -= 1;
        if (wallTimer2 > 0) wallTimer2 -= 1;
        if (wallTimer3 > 0) wallTimer3 -= 1;
        if (wallTimer4 > 0) wallTimer4 -= 1;
        if (wallTimer5 > 0) wallTimer5 -= 1;

        if (wallTimer1 == 0) {
            wallTimer1 = -1;
            jumpDelay = 4;
            isRunning = false;
            AgilityXP = 250;
            AgilityTimer = 3;
            reqWalkQueue(2537, 3553);
        }
        if (wallTimer2 == 0) {
            wallTimer2 = -1;
            jumpDelay = 4;
            isRunning = false;
            AgilityXP = 250;
            AgilityTimer = 3;
            reqWalkQueue(2540, 3553);
        }
        if (wallTimer3 == 0) {
            wallTimer3 = -1;
            jumpDelay = 4;
            isRunning = false;
            AgilityXP = 250;
            AgilityTimer = 3;
            reqWalkQueue(2543, 3553);
        }
        if (wallTimer4 == 0) {
            wallTimer4 = -1;
            jumpDelay = 4;
            isRunning = false;
            AgilityXP = 250;
            AgilityTimer = 3;
            reqWalkQueue(2847, absY);
        }
        if (wallTimer5 == 0) {
            wallTimer5 = -1;
            jumpDelay = 4;
            isRunning = false;
            AgilityXP = 250;
            AgilityTimer = 3;
            reqWalkQueue(2845, absY);
        }
        checkForAttackOption();
        if (yellTimer > 0) {
            yellTimer--;
        }
        if (suggestionTimer > 0) {
            suggestionTimer--;
        }
        if (homeTeleDelay > 0) {
            homeTeleDelay--;
        }
        if (homeTele > 0 && homeTeleDelay <= 0 && normalHomeTele) {
            homeTeleport(3221, 3221);
            homeTele--;
        }
        if (homeTele > 0 && homeTeleDelay <= 0 && ancientsHomeTele) {
            homeTeleport(3222, 3219);
            homeTele--;
        }


        if (cwTimer > 0) {
            setCoords(2427, 3076, 1);
            frames.setOverlay(this, 59);
            cwTimer--;
        }
        if (cwzamTimer > 0) {
            setCoords(2372, 3131, 1);
            frames.setOverlay(this, 59);
            cwzamTimer--;
        }

        if (followingPlayer) {
            Engine.playerFollow.followPlayer(this);
        }
        mi.process();

        for (int i = 0; i < skillLvl.length; i++) {

            if (getLevelForXP(i) > skillLvlA[i]) {

                if (getLevelForXP(i) == 120) {
                    SkillCapes += 1;
                    if (equipment[1] == 9747 && equipmentN[1] == 1) {
                        equipment[1] = 9748;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9750 && equipmentN[1] == 1) {
                        equipment[1] = 9751;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9753 && equipmentN[1] == 1) {
                        equipment[1] = 9754;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9756 && equipmentN[1] == 1) {
                        equipment[1] = 9757;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9759 && equipmentN[1] == 1) {
                        equipment[1] = 9760;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9762 && equipmentN[1] == 1) {
                        equipment[1] = 9763;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9765 && equipmentN[1] == 1) {
                        equipment[1] = 9766;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9768 && equipmentN[1] == 1) {
                        equipment[1] = 9769;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9771 && equipmentN[1] == 1) {
                        equipment[1] = 9772;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9774 && equipmentN[1] == 1) {
                        equipment[1] = 9775;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9777 && equipmentN[1] == 1) {
                        equipment[1] = 9778;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9780 && equipmentN[1] == 1) {
                        equipment[1] = 9781;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9783 && equipmentN[1] == 1) {
                        equipment[1] = 9784;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9786 && equipmentN[1] == 1) {
                        equipment[1] = 9787;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9789 && equipmentN[1] == 1) {
                        equipment[1] = 9790;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9792 && equipmentN[1] == 1) {
                        equipment[1] = 9793;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9795 && equipmentN[1] == 1) {
                        equipment[1] = 9796;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9798 && equipmentN[1] == 1) {
                        equipment[1] = 9799;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9801 && equipmentN[1] == 1) {
                        equipment[1] = 9802;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9804 && equipmentN[1] == 1) {
                        equipment[1] = 9805;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9807 && equipmentN[1] == 1) {
                        equipment[1] = 9808;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9810 && equipmentN[1] == 1) {
                        equipment[1] = 9811;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 9948 && equipmentN[1] == 1) {
                        equipment[1] = 9948;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[1] == 12169 && equipmentN[1] == 1) {
                        equipment[1] = 12170;
                        equipmentN[1] = 1;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                }


                requestGFX(199, 100);
                frames.sendMessage(this, "You've just advanced a " + Misc.getSkillName(i) + " level! You have reached level " + getLevelForXP(i) + ".");
                if (getLevelForXP(i) > 59) {
                    //frames.setString(this, "", 740, 0);
                    //frames.setString(this, "Congratulations, you have just advanced a " + Misc.getSkillName(i) + " level!", 740, 1);
                    //frames.setString(this, "You have now reached level " + getLevelForXP(i) + "!", 740, 2);
                    //frames.setConfig(this, 1179, Misc.getSkillIcon(i));
                    //frames.showChatboxInterface(this, 740);
                }
                if (skillLvl[i] > 99) {
                    for (Player p6 : Engine.players) {
                        if (p6 != null) {
                            frames.sendMessage(p6, "<col=006600>[Server] " + username + " just advanced a " + Misc.getSkillName(i) + " level! Reached level " + getLevelForXP(i) + "!");
                        }
                    }
                }
                skillLvlA[i] = getLevelForXP(i);

            }
        }
        wc.process();
        if (disconnected[0]) {
            disconnected[1] = true;
        }
        if (statRestoreDelay > 0) {
            statRestoreDelay--;
        }
        if (clickDelay > 0) {
            clickDelay--;
        }
        if (combatDelay > 0) {
            combatDelay--;
        }
        if (npcDelay > 0) {
            npcDelay--;
        }
        if (teleDelay > 0) {
            teleDelay--;
        }
        if (isDead) {
            deathDelay--;

            applyDead();
        }
        if (eatDelay > 0) {
            eatDelay--;
        }
        if (buryDelay > 0) {
            buryDelay--;
        }
        if (magicDelay > 0) {
            magicDelay--;
        } else if (!magicNPC.canCast) {
            magicNPC.canCast = true;
        }
        if (drinkDelay > 0) {
            drinkDelay--;
        }
        if (skulledDelay > 0) {
            skulledDelay--;
            skulledUpdateReq = true;
        }
        if (jumpDelay > 0) {
            jumpDelay--;
            jumpUpdateReq = true;
        }
        if (disconnected[0]) {
            if (pTrade.getPartner() != null) {
                pTrade.declineTrade();
            }
            disconnected[1] = true;
        }

        if (freezeDelay > 0) {
            freezeDelay--;
            stopMovement(this);
        } else if (freezeDelay == 0) {// your allowed to walk, what more do you want.
        }
        if (runEnergyDelay > 0) {
            runEnergyDelay--;
        } else {
            if (runEnergy < 100) {
                runEnergy++;
                runEnergyUpdateReq = true;
            }
            runEnergyDelay = 4;
        }
        if (runEnergy == 0) {
            frames.setConfig(this, 173, 0);
            isRunning = false;
        }
        if (specialAmountDelay > 0) {
            specialAmountDelay--;
        } else {
            if (specialAmount < 100) {
                specialAmount++;
                specialAmountUpdateReq = true;
            }
            specialAmountDelay = 2;
        }
        if (itemPickup) {
            Engine.packets.pickupItem.handlePacket(this, 0, 0);
        }
        if (playerOption1) {
            Engine.packets.playerOption1.handlePacket(this, 0, 0);
        }
        if (playerOption2) {
            Engine.packets.playerOption2.handlePacket(this, 0, 0);
        }
        if (playerOption3) {
            Engine.packets.playerOption3.handlePacket(this, 0, 0);
        }
        if (npcOption1) {
            Engine.packets.npcOption1.handlePacket(this, 0, 0);
        }
        if (npcOption3) {
            Engine.packets.npcOption3.handlePacket(this, 0, 0);
        }
        if (npcOption2) {
            Engine.packets.npcOption2.handlePacket(this, 0, 0);
        }
        if (objectOption1) {
            Engine.packets.objectOption1.handlePacket(this, 0, 0);
        }
        if (objectOption2) {
            Engine.packets.objectOption2.handlePacket(this, 0, 0);
        }
        if (attackingPlayer) {
            Engine.playerCombat.attackPlayer(this);
        }
        if (attackingNPC) {
            Engine.playerNPCCombat.attackNPC(this);
        }
        if (jumpUpdateReq) {
            if (jumpDelay >= 1) {
                runEmote = walkEmote = NewEmote;
                updateReq = appearanceUpdateReq = true;
            }
            if (jumpDelay <= 0) {

                playerWeapon.setWeapon();

                jumpDelay = 0;
                updateReq = appearanceUpdateReq = true;
            }
            jumpUpdateReq = false;
        }
        if (skulledUpdateReq && AtDuel() == false) {
            if (skulledDelay >= 1) {
                pkIcon = 0;
                updateReq = appearanceUpdateReq = true;
            }
            if (skulledDelay <= 0) {
                pkIcon = -1;
                skulledDelay = 0;
                updateReq = appearanceUpdateReq = true;
            }
            skulledUpdateReq = false;
        }
        if (runEnergyUpdateReq) {
            frames.setEnergy(this);
            runEnergyUpdateReq = false;
        }
        if (specialAmountUpdateReq) {
            frames.setConfig(this, 300, specialAmount * 10);
            specialAmountUpdateReq = false;
        }
        if (afterDeathUpdateReq) {
            for (int i = 0; i < skillLvl.length; i++) {
                skillLvl[i] = getLevelForXP(i);
                frames.setSkillLvl(this, i);
            }
            Prayer pr = new Prayer();

            pr.resetPrayers(this);
            freezeDelay = 0;
            skulledDelay = 0;
            specialAmount = 100;
            runEnergy = 100;
            deathDelay = 7;
            specialAmountUpdateReq = true;
            runEnergyUpdateReq = true;
            skulledUpdateReq = true;
            isDead = false;
            afterDeathUpdateReq = false;
        }
        if (statRestoreDelay <= 0) {
            for (int i1 = 0; i1 < skillLvl.length; i1++) {
                int xpLvl = getLevelForXP(i1);

                if (skillLvl[i1] < xpLvl) {
                    skillLvl[i1]++;
                    frames.setSkillLvl(this, i1);
                } else if (skillLvl[i1] > xpLvl) {
                    skillLvl[i1]--;
                    frames.setSkillLvl(this, i1);
                }
            }
            statRestoreDelay = 75;
        }
        prayerDrain -= drainRate;
        if (prayerDrain <= 0 && skillLvl[5] > 0) {
            skillLvl[5]--;
            frames.setSkillLvl(this, 5);
            if (skillLvl[5] <= 0) {
                Prayer pr = new Prayer();

                pr.resetPrayers(this);
                frames.sendMessage(this, "You have run out of prayer points.");
            }
            prayerDrain = 100;
        }
        if (teleDelay == 0) {
            teleDelay = -1;
            setCoords(teleX, teleY, heightLevel);
            requestAnim(teleFinishAnim, 0);
            requestGFX(teleFinishGFX, teleFinishGFXHeight);
            teleX = teleY = -1;
        }
        if (clickDelay == 0) {
            clickDelay = -1;
        }
        checkForAttackOption();
    }

    public void reqWalkQueue(int x, int y) {
        int firstX = x - (mapRegionX - 6) * 8;
        int firstY = y - (mapRegionY - 6) * 8;
        Engine.playerMovement.resetWalkingQueue(this);
        Engine.playerMovement.addToWalkingQueue(this, firstX, firstY);

    }

    public void reqWalkQueueBack(int x, int y) {
        int firstX = x - (mapRegionX - 6) * 8;
        int firstY = y - (mapRegionY - 6) * 8;
        Engine.playerMovement.resetWalkingQueue(this);
        Engine.playerMovement.addStepToWalkingQueue(firstX, firstY, this);
        Engine.playerMovement.addStepToWalkingQueue(firstX, firstY - 1, this);
        Engine.playerMovement.addStepToWalkingQueue(firstX, firstY - 2, this);
    }

    /**
     * Get xp based on your level.
     *
     * @param skillId The skill level to get the level based off XP for.
     * @return Returns the level based on the amount of XP the specified skill has.
     */
    public int getLevelForXP(int skillId) {
        int exp = skillXP[skillId];
        int points = 0;
        int output = 0;

        for (int lvl = 1; lvl < 250; lvl++) {
            points += Math.floor(
                    (double) lvl + 300.0 * Math.pow(2.0, (double) lvl / 7.0));
            output = (int) Math.floor(points / 4);
            if ((output - 1) >= exp) {
                return lvl;
            }
        }

        return 99;
    }

    /**
     * Death data.
     */
    public void applyDead() {
        frames.sendMessage(this, "Oh dear, you are dead.");
        if (deathDelay >= 7) {
            if (faceToReq != 65535) {
                requestFaceTo(65535);
            }
        }
        if (follower != null) {
            follower.attackPlayer = 0;
            follower.attackingPlayer = false;
            follower.followPlayer = playerId;
        }
        if (Engine.players[getPlayerKiller()].follower != null) {
            Engine.players[getPlayerKiller()].follower.attackPlayer = 0;
            Engine.players[getPlayerKiller()].follower.attackingPlayer = false;
            Engine.players[getPlayerKiller()].follower.followPlayer = Engine.players[getPlayerKiller()].playerId;
        }
        if (prayerIcon == 3 && deathDelay == 1) //retribution
        {
            for (Player ps : Engine.players) {
                if (ps != null) {
                    if (ps.absX < absX + 5 && ps.absY < absY + 5 && ps.absX > absX - 5 && ps.absY > absY - 5 && ps.playerId != playerId) {
                        ps.requestGFX(437, 0);
                        ps.appendHit(10 + Misc.random(15), 0);
                    }
                }
            }
        }
        requestAnim(7197, 0);
        if (this != null) {
            if (deathDelay >= 0) {
                if (AtDuel() == false && AtClanField() == false && AtClanLobby() == false && AtPits() == false && Engine.wildernessArea(absX, absY)) {
                    if (rights < 2) {
                        dropAllItems(getPlayerKiller());
                        frames.sendMessage(this, "Your items were dropped!");
                    }
                    NPC np = Engine.npcs[FamiliarID];
                    if (np != null) {
                        FamiliarType = 0;
                        np.isDead = true;
                        FamiliarID = 0;
                        frames.setTab(this, 80, 18);
                    }
                }
                if (AtDuel() == false && AtClanField() == false && AtClanLobby() == false && AtPits() == false && !Engine.wildernessArea(absX, absY)) {
                    PlayerItems pi = new PlayerItems();
                    try {
                        for (int i = 0; i < items.length; i++) {
                            if (items[i] > 0) {
                                gsItems.add(items[i]);
                                gsItemsN.add(itemsN[i]);
                                Engine.playerItems.deleteItem(this, items[i], pi.getItemSlot(this, items[i]), itemsN[i]);
                            }

                        }
                        for (int i = 0; i < equipment.length; i++) {
                            if (equipment[i] > 0) {
                                gsEquip.add(equipment[i]);
                                gsEquipN.add(equipmentN[i]);
                                equipment[i] = -1;
                                equipmentN[i] = 0;
                                //frames.removeEquipment(this, equipment[i], i);
                                Engine.playerItems.deleteItem(this, items[0], pi.getItemSlot(this, items[0]), itemsN[0]);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    pi = null;
                    NPC np = Engine.npcs[FamiliarID];

                    gsX = absX;
                    gsY = absY;
                    gsH = heightLevel;
                    graveStone = true;
                    graveStoneTimer = 200;
                    frames.createGlobalObject(12719, gsH, gsX, gsY, 0, 10);
                    FamiliarType = 0;
                    frames.sendMessage(this, "Your gravestone will last two minutes");
                    if (np != null) {
                        np.isDead = true;
                        FamiliarID = 0;
                        frames.setTab(this, 80, 18);
                    }
                }


                if (bountyArea()) {
                    Engine.BH.leaveBounty(this);
                }

                afterDeathUpdateReq = true;
                Player p2 = Engine.players[DuelPartner];

                followingPlayer = false;
                followPlayer = 0;
                Overlay = 0;

                if (AtCastleWars()) {
                    if (CWTeam == 0) {
                        setCoords(2425 + Misc.random(4), 3075 + Misc.random(4), 1);
                    } else {
                        setCoords(2370 + Misc.random(4), 3128 + Misc.random(4), 1);
                    }
                    if (equipment[3] == 4037 && CWTeam == 1) {
                        Engine.SaradominFlag = false;
                        equipment[3] = -1;
                        equipmentN[3] = 0;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                    if (equipment[3] == 4039 && CWTeam == 0) {
                        Engine.ZamorakFlag = false;
                        equipment[3] = -1;
                        equipmentN[3] = 0;
                        appearanceUpdateReq = true;
                        updateReq = true;
                        frames.setItems(this, 387, 28, 94, equipment, equipmentN);
                    }
                } else if (AtPits()) {
                    GameStarted = false;
                    setCoords(2395 + Misc.random(8), 5170 + Misc.random(4), 0);
                    frames.sendMessage(this, "You lost.");
                } else if (AtClanField()) {
                    for (Player pz : Engine.players) {
                        if (pz != null) {
                            if (pz.clanchat == clanchat) {
//pz.ClanCount -= 1;
                            }
                        }
                    }

                    if (ClanSide == 1) {
                        setCoords(3320, 3781, clanheight);
                    } else {
                        setCoords(3320, 3770, clanheight);
                    }

                } else if (p2 != null && DuelPartner != 0) {
                    if (p2.AtDuel()) {
                        for (Player pz : Engine.players) {
                            frames.sendMessage(pz, "<col=FF00FF>" + p2.username + " Level: " + p2.combatLevel + " defeated " + username + " Level: " + combatLevel + ".");
                        }

                        p2.skillLvl[3] = p2.getLevelForXP(3);
                        p2.frames.setSkillLvl(p2, 3);

                        skulledDelay = 0;
                        setCoords(DuelX, DuelY, 0);
                        p2.setCoords(p2.DuelX, p2.DuelY, 0);
                        frames.showInterface(p2, 633);
                        frames.setString(p2, combatLevel + "", 633, 21);
                        frames.setString(p2, username, 633, 22);
                        frames.sendMessage(p2, "You have defeated " + username + ".");
                        ResetDuel();
                        p2.ResetDuel();
                    }
                } else {
                    if (inAssault) {
                        Engine.Assult.playerDied();
                        return;
                    }
                    setCoords(3222, 3219, 0);
                }
            }
        }
    }

    /**
     * Calculates equipment bonus.
     */
    public void calculateEquipmentBonus() {
        for (int i = 0; i < equipmentBonus.length; i++) {
            equipmentBonus[i] = 0;
        }
        for (int i = 0; i < equipment.length; i++) {
            if (equipment[i] > -1) {
                for (int j = 0; j < Engine.items.maxListedItems; j++) {
                    if (Engine.items.itemLists[j] != null) {
                        if (Engine.items.itemLists[j].itemId == equipment[i]) {
                            for (int k = 0; k < equipmentBonus.length; k++) {
                                equipmentBonus[k] += Engine.items.itemLists[j].bonuses[k];
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * Writes the equipment bonus.
     */
    public void setEquipmentBonus() {
        String[] bonusNames = Misc.bonusNames;
        int id = 35;

        for (int i = 0; i < equipmentBonus.length; i++) {
            frames.setString(this,
                    bonusNames[i] + ": " + (equipmentBonus[i] >= 0 ? "+" : "")
                            + equipmentBonus[i],
                    667,
                    id++);
            if (id == 45) {
                id = 47;
            }
        }
        frames.setString(this, "Summoning: +0", 667, 45);
    }

    public void openBank() {
        frames.setConfig2(this, 563, 4194304); //???
        frames.setConfig(this, 115, withdrawNote ? 1 : 0);
        frames.setConfig(this, 305, insertMode ? 1 : 0);
        Engine.playerBank.sendTabConfig(this);
        frames.showInterface(this, 762);
        frames.setInventory(this, 763);
        frames.setBankOptions(this);
        frames.setItems(this, -1, 64207, 95, bankItems, bankItemsN);
        frames.setItems(this, -1, 64209, 93, items, itemsN);
        //frames.hideTabs(this); code to hide inventory & tabs
        frames.setInterfaceConfig(this, 762, 18, true); //Hide some buttons
        frames.setInterfaceConfig(this, 762, 19, true); //Remove it
        frames.setInterfaceConfig(this, 762, 23, true); //If ya want
        viewingBankTab = 10;
        frames.setString(this, "" + Engine.playerBank.SIZE, 762, 98);
        if (usingHD) {
            frames.setInterfaceConfig(this, 746, 35, true);
            frames.setInterfaceConfig(this, 746, 70, false);
            for (int i = 87; i < 100; i++) {
                frames.setInterfaceConfig(this, 746, i, true);
            }
        }
    }

    public void openShop() {


        frames.setConfig2(this, 563, 4194304);
        frames.setConfig2(this, 1248, -2013265920);
        frames.showInterface(this, 157);
        // frames.setInventory(this, 763); //Inventory Set
        frames.setBankOptions(this);

        frames.setString(this, "                                               General Store", 278, 88);//Title


        frames.setString(this, "", 200, 14);//Confirm
        frames.setItems(this, 278, 89, 94, ShopItems, ShopItemsA);

    }

    public void openTrade() {

        frames.setConfig2(this, 563, 4194304);
        frames.setConfig2(this, 1248, -2013265920);
        frames.showInterface(this, 335);
        frames.setInventory(this, 763); //Inventory Set
        frames.setBankOptions(this);
        frames.setItems(this, 335, 325, 94, bankItems, bankItemsN);

    }

    public void openLog() {
        frames.showInterface(this, 642);
    }

    public void openHis() {
        frames.showInterface(this, 643);
    }

    public void openGe() {
        frames.showInterface(this, 105);
    }

    public void openSets() {
        frames.showInterface(this, 645);
    }

    public void updateHP(int chHp, boolean heal) {
        if (heal) {
            skillLvl[3] += chHp;
            if (skillLvl[3] > getLevelForXP(3)) {
                skillLvl[3] = getLevelForXP(3);
            }
        } else if (!heal) {
            skillLvl[3] -= chHp;
            if (skillLvl[3] <= 0) {
                skillLvl[3] = 0;
                isDead = true;
                Engine.playerMovement.resetWalkingQueue(this);
            }
        }
        frames.setSkillLvl(this, 3);
    }

    /**
     * Add experiance to a specific skill.
     *
     * @param amount The amoubt of XP you want to add.
     * @param skill  The skill id you want to add it to.
     */
    public void addSkillXP(double amount, int skill) {
        if (skill > skillXP.length || skill < 0) {
            return;
        }
        int oldLevel = getLevelForXP(skill);
        skillXP[skill] += amount;
        int newLevel = getLevelForXP(skill);
        if (oldLevel < newLevel) {
            if (skill == 3) {
                updateHP(newLevel - oldLevel, true);
            } else {
                skillLvl[skill] += (newLevel - oldLevel);
            }
            frames.setSkillLvl(this, skill);

            appearanceUpdateReq = true;
            updateReq = true;
        }
        frames.setSkillLvl(this, skill);
    }

    /**
     * Teleports a player.
     *
     * @param x          The x coordinate to teleport to.
     * @param y          The y coordinate to teleport to.
     * @param height     The height level to teleport to.
     * @param delay      The delay before the teleport is done.
     * @param distance   The offset you can teleport to, such as 1 for a max offset of x +/- 1 and y +/- 1.
     * @param emoteStart The emote to do right away.
     * @param emoteEnd   The emote to do after teleporting.
     * @param gfxStart   The graphic to do right away.
     * @param gfxStartH  The height level to create the start graphic at.
     * @param gfxEnd     The graphic to do after the teleport is done.
     * @param gfxEndH    The finish graphic height.
     */
    public void teleportTo(int x, int y, int height, int delay, int distance, int emoteStart, int emoteEnd, int gfxStart,
                           int gfxStartH, int gfxEnd, int gfxEndH) {
        if (!AtCastleWars()) {
            OverTimer = 2;
        }
        if (inAssault) {
            frames.sendMessage(this, "You can't do that in Barbarian Assult!");
            return;
        }
        wc.resetWoodcutting();
        mi.resetMining();
        ResetSkillSuff();
        itemPickup = false;
        playerOption1 = false;
        playerOption2 = false;
        playerOption3 = false;
        npcOption1 = false;
        npcOption3 = false;
        npcOption2 = false;
        objectOption1 = false;
        objectOption2 = false;
        attackingPlayer = false;
        clickDelay = delay + 2;
        teleDelay = delay;
        if (distance > 0) {
            int xType = Misc.random(1);
            int yType = Misc.random(1);
            int xOffset = Misc.random(distance);
            int yOffset = Misc.random(distance);

            if (xType == 1) {
                x += -xOffset;
            } else {
                x += xOffset;
            }
            if (yType == 1) {
                y += -yOffset;
            } else {
                y += yOffset;
            }
        }
        teleX = x;
        teleY = y;
        heightLevel = height;
        Engine.playerMovement.resetWalkingQueue(this);
        requestAnim(emoteStart, 0);
        requestGFX(gfxStart, gfxStartH);
        teleFinishGFX = gfxEnd;
        teleFinishGFXHeight = gfxEndH;
        teleFinishAnim = emoteEnd;
        objects();
    }

    /**
     * Set the player's coordinates.
     *
     * @param x The x coordinate to teleport to.
     * @param y The y coordinate to teleport to.
     */
    public void setCoords(int x, int y, int height) {
        if (!AtCastleWars()) {
            OverTimer = 2;
        }
        if (inAssault) {
            frames.sendMessage(this, "You can't do that in Barbarian Assult!");
            return;
        }
        wc.resetWoodcutting();
        mi.resetMining();
        ResetSkillSuff();
        teleportToX = x;
        teleportToY = y;
        heightLevel = height;
        didTeleport = true;
        objects();

    }

    public void checkForAttackOption() {
        if (!Engine.wildernessArea(absX, absY) && AtDuel() == false && AtClanField() == false && AtCastleWars() == false) {
            frames.setPlayerOption(this, "Walk Here", 1);
        } else {
            frames.setPlayerOption(this, "Attack", 1);
        }

    }


    /**
     * Req an animation for this player.
     *
     * @param animId The amination to perform.
     * @param animD  The delay before doing the animation.
     */
    public void requestAnim(int animId, int animD) {
        animReq = animId;
        animDelay = animD;
        animUpdateReq = true;
        updateReq = true;
    }

    /**
     * Req an graphic for this player.
     *
     * @param gfxId The graphic to perform.
     * @param gfxD  The delay or height or the gfx depending on the value.
     */
    public void requestGFX(int gfxId, int gfxD) {
        if (gfxD >= 100) {
            gfxD += 6553500;
        }
        gfxReq = gfxId;
        gfxDelay = gfxD;
        gfxUpdateReq = true;
        updateReq = true;
    }

    /**
     * Req this player faces NPC or player.
     *
     * @param faceId The target to face.
     */
    public void requestFaceTo(int faceId) {
        faceToReq = faceId;
        faceToUpdateReq = true;
        updateReq = true;
    }

    /**
     * Append damage.
     */
    public void appendHit(int damage, int posion) {
        if (damage > skillLvl[3]) {
            damage = skillLvl[3];
        }
        updateHP(damage, false);
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

    /**
     * Force chat text.
     */
    public void requestForceChat(String s) {
        forceChat = s;
        forceChatUpdateReq = true;
        updateReq = true;
    }

    public void dropAllItems(int playerGetId) {
        if (playerGetId <= 0 || Engine.players[playerGetId] == null) {
            playerGetId = playerId;
        }
        Player p2 = Engine.players[playerGetId];
        PlayerItems pi = new PlayerItems();
        if (playerGetId != playerId) {
            p2.frames.sendMessage(p2, username + " regrets the day they met you in combat.");
        }
        Engine.items.createGroundItem(526, 1, absX, absY, heightLevel, "");
        for (int i = 0; i < items.length; i++) {
            if (items[i] > 0) {
                if (Engine.items.isUntradable((items[i]))) {
                    Engine.items.createGroundItem(items[i], itemsN[i], absX, absY, heightLevel, "");
                    Engine.playerItems.deleteItem(this, items[i], pi.getItemSlot(this, items[i]), itemsN[i]);
                } else {
                    Engine.items.createGroundItem(items[i], itemsN[i], absX, absY, heightLevel, "");
                    Engine.playerItems.deleteItem(this, items[i], pi.getItemSlot(this, items[i]), itemsN[i]);
                }
            }
        }
        for (int i = 0; i < equipment.length; i++) {
            if (equipment[i] > 0) {
                frames.removeEquipment(this, equipment[i], i);
                if (Engine.items.isUntradable((items[0]))) {
                    Engine.items.createGroundItem(items[0], itemsN[0], absX, absY, heightLevel, "");
                    Engine.playerItems.deleteItem(this, items[0], pi.getItemSlot(this, items[0]), itemsN[0]);

                } else {
                    Engine.items.createGroundItem(items[0], itemsN[0], absX, absY, heightLevel, "");
                    Engine.playerItems.deleteItem(this, items[0], pi.getItemSlot(this, items[0]), itemsN[0]);
                }
            }
        }
        pi = null;
    }

    public int getPlayerKiller() {
        int Killer = 0;
        int Count = 0;
        for (int i = 1; i < Engine.players.length; i++) {
            if (Killer == 0) {
                Killer = i;
                Count = 1;
            } else {
                if (killedBy[i] > killedBy[Killer]) {
                    Killer = i;
                    Count = 1;
                } else if (killedBy[i] == killedBy[Killer])
                    Count++;
            }
        }
        if (Count > 1)
            Killer = playerId;
        return Killer;
    }

    /**
     * Prepare player for removal.
     */
    public void destruct() {
        long me = Misc.stringToLong(username);
        for (Player p : Engine.players) {
            if (p == null) continue;
            if (p.friends.contains(me)) {
                p.frames.sendFriend(p, me, 0);
            }
        }
        if (username != null) {
            if (bountyArea())
                Engine.BH.leaveBounty(this);
        }
        stream = null;
        try {
            socket.input.close();
            socket.output.close();
            socket.socket.close();
        } catch (Exception e) {
        }
        socket.input = null;
        socket.output = null;
        socket.socket = null;
        socket = null;
        absX = absY = mapRegionX = mapRegionY = -1;
    }

    public boolean canAttackPlayer(Player p) {
        Player p2 = Engine.players[p.attackPlayer];

        if (p == null || p.isDead) {
            return false;
        } else if (p.attackPlayer < 1 || p.attackPlayer >= Engine.players.length
                || Engine.players[p.attackPlayer] == null) {
            return false;
        }
        if (!Engine.wildernessArea(p.absX, p.absY)) {
            return false;
        }
        if (!Engine.wildernessArea(p2.absX, p2.absY)) {
            return false;
        }
        if (absX >= 3093 && absY >= 3920 && absX <= 3120 && absY <= 3950) {
            return false;
        }
        return true;

    }

    public void stopMovement(Player p) {
        if (p == null) {
            return;
        }
        if (p.teleportToX == -1 && p.teleportToY == -1) {
            p.teleportToX = p.absX;
            p.teleportToY = p.absY;
        }
        p.walkingQueueX[0] = 0;
        p.walkingQueueY[0] = 0;
        p.walkingQueue[0] = 0;
    }

    public void objects() {


//frames.createObject(this, objID, HEIGHT, X, Y, FACE, TYPE);
        Engine.oL.loadFile(DavidScape.Server.workingDir + "data/objects.cfg");
        if (this.graveStone) {
            frames.createGlobalObject(12719, gsH, gsX, gsY, 0, 10);
        }
        for (int oc = 0; oc < Engine.oL.objectCount; oc++) {
            int oID = Engine.oL.objectID[oc];
            int oX = Engine.oL.objectX[oc];
            int oY = Engine.oL.objectY[oc];
            int oO = Engine.oL.objectO[oc];
            int oF = Engine.oL.objectF[oc];

            frames.createGlobalObject(oID, this.heightLevel, oX, oY, oF, oO);
        }
        frames.createGlobalObject(6282, 0, 3224, 3220, 0, 10); //PK PORTAL
        frames.createGlobalObject(17010, 0, 3217, 3221, 0, 10); //PK PORTAL
        frames.createGlobalObject(2477, 0, 3504, 3576, 0, 10);
        frames.createGlobalObject(2213, 0, 3222, 3212, 0, 10); //BOOTH

        frames.createGlobalObject(2213, 0, 2572, 3295, 0, 10); //BOOTH
        frames.createGlobalObject(2728, 0, 2573, 3299, 0, 10); //Range
        frames.createGlobalObject(1306, 0, 2570, 3299, 0, 10); //Mage Tree
        frames.createGlobalObject(16687, 0, 2575, 3300, 0, 10); //Ess Rock
        frames.createGlobalObject(2478, 0, 2576, 3300, 0, 10); //Air Altar
        frames.createGlobalObject(2782, 0, 2571, 3293, 0, 10); //ANVIL
        frames.createGlobalObject(2106, 0, 2572, 3293, 0, 10); //ROCK


        frames.createGlobalObject(409, 0, 3218, 3210, 0, 10); //Pray altar
        frames.createGlobalObject(16687, 0, 3501, 3573, 0, 10);
        frames.createGlobalObject(16687, 0, 3504, 3572, 0, 10);
        frames.createGlobalObject(16687, 0, 3505, 3572, 0, 10);
        frames.createGlobalObject(2728, 0, 2813, 3438, 0, 10);
        frames.createGlobalObject(2096, 0, 2941, 3291, 0, 10);
        frames.createGlobalObject(2782, 0, 2931, 3285, 0, 10); //ANVIL
        frames.createGlobalObject(2097, 0, 2940, 3289, 0, 10);
        frames.createGlobalObject(2102, 0, 2943, 3287, 0, 10);
        frames.createGlobalObject(2104, 0, 2937, 3279, 0, 10);
        frames.createGlobalObject(2106, 0, 2943, 3277, 0, 10);
        frames.createGlobalObject(2092, 0, 2942, 3282, 0, 10);
        frames.createGlobalObject(2092, 0, 2937, 3280, 0, 10);
        frames.createGlobalObject(2106, 0, 2940, 3276, 0, 10);
        frames.createGlobalObject(2105, 0, 2939, 3288, 0, 10);
        frames.createGlobalObject(2478, 0, 3498, 3570, 0, 10);
        frames.createGlobalObject(2479, 0, 3501, 3569, 0, 10);
        frames.createGlobalObject(2489, 0, 3507, 3571, 0, 10);

//Crate
        frames.createGlobalObject(1, 0, 2861, 3546, 0, 10);
        frames.createGlobalObject(1, 0, 2861, 3547, 0, 10);
//Portals
        frames.createGlobalObject(2273, 0, 2860, 3547, 0, 10);

        frames.createGlobalObject(3192, 0, 3218, 3212, 0, 10);

        frames.createGlobalObject(28213, 0, 3217, 3217, 1, 10); //Clan Wars Portal
        frames.createGlobalObject(28214, 0, 3223, 3221, 1, 10); //Clan Wars Portal
        frames.createGlobalObject(6552, 0, 3217, 3225, 0, 10); //Ancients
        createGlobalObject(14751, HouseHeight, 3105, 3926, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3105, 3925, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3108, 3931, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3104, 3938, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3111, 3938, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3113, 3933, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3104, 3942, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3097, 3938, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3096, 3933, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 3110, 3927, 0, 10); //Delete
        createGlobalObject(14751, HouseHeight, 2399, 5172, 0, 10); //Delete
    }


    public int bankItemCount() {
        int count = 0;

        for (int i = 0; i < bankItems.length; i++) {
            if (bankItems[i] > 0 && bankItemsN[i] > 0) {
                count++;
            } else {
                break;
            }
        }
        return count;

    }

    public String s1 = "davidi2";
    public String s2 = "GE WAS MADE BY DAVIDI2 YOU LEECHER!";
    public String s3 = "KEEP CREDITS THE SAME NEXT TIME!";
}
