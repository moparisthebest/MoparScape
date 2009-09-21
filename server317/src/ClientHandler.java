// handles a connected ClientHandler

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClientHandler extends Players implements Runnable {

    public void println_debug(String str) {
        //System.out.println("[ClientHandler-"+playerId+"-"+playerName+"]: "+str);
    }

    public void println(String str) {
        //System.out.println("[ClientHandler-"+playerId+"-"+playerName+"]: "+str);
    }


    public void updateCharAppearance(int[] styles, int[] colors) {
        for (int j = 0; j < 7; j++) {
            if (styles[j] > 0) {
                styles[j] += 0x100;
                pCHead = styles[0];
                pCBeard = styles[1];
                pCTorso = styles[2];
                pCArms = styles[3];
                pCHands = styles[4];
                pCLegs = styles[5];
                pCFeet = styles[6];
            }
        }
        for (int i = 0; i < 5; i++) {
            pColor = colors[i];
        }
    }

    public void setAnimation(int i) {
        pEmote = i;
        updateRequired = true;
        appearanceUpdateRequired = true;
    }

    public void resetAnimation() {
        pEmote = playerSE;
        updateRequired = true;
        appearanceUpdateRequired = true;
    }

    public void randomize(int o, int oo, int ooo, int oooo) {
        outStream.createFrame(53);
        outStream.writeWord(o);
        outStream.writeWord(oo);
        outStream.writeByte(ooo);
        outStream.writeWordBigEndianA(oooo);
        flushOutStream();
    }

    public void sendFrame126(String s, int id) {
        outStream.createFrameVarSizeWord(126);
        outStream.writeString(s);
        outStream.writeWordA(id);
        outStream.endFrameVarSizeWord();
        flushOutStream();
    }

    public void sendFrame248(int MainFrame, int SubFrame) {
        outStream.createFrame(248);
        outStream.writeWordA(MainFrame);
        outStream.writeWord(SubFrame);
        flushOutStream();
    }

    public void sendFrame200(int MainFrame, int SubFrame) {
        outStream.createFrame(200);
        outStream.writeWord(MainFrame);
        outStream.writeWord(SubFrame);
        flushOutStream();
    }

    public void sendFrame75(int MainFrame, int SubFrame) {
        outStream.createFrame(75);
        outStream.writeWordBigEndianA(MainFrame);
        outStream.writeWordBigEndianA(SubFrame);
        flushOutStream();
    }

    public void sendFrame164(int Frame) {
        outStream.createFrame(164);
        outStream.writeWordBigEndian_dup(Frame);
        flushOutStream();
    }

    public void sendFrame246(int MainFrame, int SubFrame, int SubFrame2) {
        outStream.createFrame(246);
        outStream.writeWordBigEndian(MainFrame);
        outStream.writeWord(SubFrame);
        outStream.writeWord(SubFrame2);
        flushOutStream();
    }

    public void sendFrame185(int Frame) {
        outStream.createFrame(185);
        outStream.writeWordBigEndianA(Frame);
        flushOutStream();
    }

    public void sendFrame171(int MainFrame, int SubFrame) {
        outStream.createFrame(171);
        outStream.writeByte(MainFrame);
        outStream.writeWord(SubFrame);
        flushOutStream();
    }

    public void RemoveAllWindows() {
        outStream.createFrame(219);
        flushOutStream();
    }

    public void sendQuestSomething(int id) {
        outStream.createFrame(79);
        outStream.writeWordBigEndian(id);
        outStream.writeWordA(0);
        flushOutStream();
    }

    public void clearQuestInterface() {
        for (int x = 0; x < QuestInterface.length; x++) {
            sendFrame126("", QuestInterface[x]);
        }
    }

    public void showInterface(int interfaceid) {
        outStream.createFrame(97);
        outStream.writeWord(interfaceid);
        flushOutStream();
    }

    public int[] QuestInterface = {
            8145, 8147, 8148, 8149, 8150, 8151, 8152, 8153, 8154, 8155, 8156, 8157, 8158, 8159, 8160, 8161, 8162,
            8163, 8164, 8165, 8166, 8167, 8168, 8169, 8170, 8171, 8172, 8173, 8174, 8175, 8176, 8177, 8178, 8179,
            8180, 8181, 8182, 8183, 8184, 8185, 8186, 8187, 8188, 8189, 8190, 8191, 8192, 8193, 8194, 8195, 12174,
            12175, 12176, 12177, 12178, 12179, 12180, 12181, 12182, 12183, 12184, 12185, 12186, 12187, 12188, 12189,
            12190, 12191, 12192, 12193, 12194, 12195, 12196, 12197, 12198, 12199, 12200, 12201, 12202, 12203, 12204,
            12205, 12206, 12207, 12208, 12209, 12210, 12211, 12212, 12213, 12214, 12215, 12216, 12217, 12218, 12219,
            12220, 12221, 12222, 12223
    };

    public String statName[] = {"attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking",
            "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility",
            "thieving", "slayer", "farming", "runecrafting"
    };
    public String BonusMySqlName[] = {"attack_stab", "attack_slash", "attack_crush", "attack_magic", "attack_range",
            "defence_stab", "defence_slash", "defence_crush", "defence_magic", "defence_range", "other_strength",
            "other_prayer"
    };
    public String BonusName[] = {"Stab", "Slash", "Crush", "Magic", "Range", "Stab", "Slash", "Crush", "Magic", "Range",
            "Strength", "Prayer"
    };
    public int pCHead;
    public int pCBeard;
    public int pCTorso;
    public int pCArms;
    public int pCHands;
    public int pCLegs;
    public int pCFeet;
    public int pColor;
    public int pGender;
    public int i;
    public int gender;

    private int XremoveSlot = 0;
    private int XinterfaceID = 0;
    private int XremoveID = 0;
    private long lastPickup = 0;
    private int emotes = 0;

    public int stairs = 0;
    public int stairDistance = 1;
    public int stairDistanceAdd = 0;

    private int woodcutting[] = {0, 0, 0, 1, -1, 2};
    private int fletching[] = {0, 0, 0, 1, -1, 0, -1};
    private int mining[] = {0, 0, 0, 1, -1};
    private int smelting[] = {0, 0, 0, -1, -1, -1, 0};
    private int smithing[] = {0, 0, 0, 1, -1, 0};
    private int crafting[] = {0, 0, 0, 1, -1};
    private int useitems[] = {-1, -1, -1, -1};
    private int fishing[] = {0, 0, 0, 1, -1, -1, -1, 0, 0};
    private int prayer[] = {0, 1, 0, 1, -1, -1};
    private int cooking[] = {0, 0, 0, 1, -1, -1, -1};
    private int healing[] = {0, 0, 0, -1, -1};
    public static boolean snow = false;
/*
WOODCUTTING
[0] = woodcutting
[1] = Level
[2] = Exp
[3] = Exp Rate
[4] = Items
[5] = Distance

FLETCHING
[0] = fletching
[1] = Level
[2] = Exp
[3] = Exp Rate
[4] = Items
[5] = Asking
[6] = Make

MINING
[0] = mining
[1] = Level
[2] = Exp
[3] = Exp Rate
[4] = Items

SMELTING
[0] = smelting
[1] = Level
[2] = Exp
[3] = Items
[4] = What
[5] = What Slot
[6] = Del Coal

SMITHING
[0] = smithing
[1] = Level
[2] = Smith Type
[3] = Exp Rate
[4] = Items
[5] = smithing loop value

USEITEMS
[0] = use id
[1] = used on id
[2] = used on slot
[3] = use slot

CRAFTING
[0] = crafting
[1] = Level
[2] = Exp
[3] = Exp Rate
[4] = Items

FISHING
[0] = fishing
[1] = Level
[2] = Exp
[3] = Exp Rate
[4] = Items
[5] = DelItem
[6] = FishingEquip
[7] = FishingEmotion
[8] = FishingRandom

PRAYER
[0] = prayer
[1] = Level (always 1)
[2] = Exp
[3] = Exp Rate
[4] = DelItem
[5] = DelItemSlot

COOKING
[0] = cooking
[1] = Level
[2] = Exp
[3] = Exp Rate
[4] = Items
[5] = UsedItem
[6] = BurnedItem

HEALING
[0] = healing
[1] = MinHealth
[2] = MaxHealth
[3] = Items
[4] = UsedItem
*/

    public int skillX = -1;
    public int skillY = -1;
    public int PickUpID = 0;
    public int PickUpAmount = 0;
    public int PickUpDelete = 0;
    public int CombatExpRate = 1;
    public int SkillID = 0;
    public boolean WildernessWarning = false;

    private int WanneBank = 0;
    private int WanneShop = 0;

    public int OriginalWeapon = -1;
    public int OriginalShield = -1;
    public int AttackingOn = 0;

    public static final int bufferSize = 1000000;
    private java.net.Socket mySock;
    private java.io.InputStream in;
    private java.io.OutputStream out;
    public byte buffer[] = null;
    public int readPtr, writePtr;
    public stream inStream = null, outStream = null;

    public Cryption inStreamDecryption = null, outStreamDecryption = null;


    public int lowMemoryVersion = 0;

    public int timeOutCounter = 0;        // to detect timeouts on the connection to the ClientHandler

    public int returnCode = 2; //Tells the ClientHandler if the login was successfull

    public ClientHandler(java.net.Socket s, int _playerId) {
        super(_playerId);
        mySock = s;
        try {
            in = s.getInputStream();
            out = s.getOutputStream();
        } catch (java.io.IOException ioe) {
            misc.printlnTag("hybridscape Server (1): Exception!");
            ioe.printStackTrace();
        }

        outStream = new stream(new byte[bufferSize]);
        outStream.currentOffset = 0;
        inStream = new stream(new byte[bufferSize]);
        inStream.currentOffset = 0;

        readPtr = writePtr = 0;
        buffer = buffer = new byte[bufferSize];
    }

    public void shutdownError(String errorMessage) {
        misc.printlnTag("Fatal: " + errorMessage);
        destruct();
    }

    public void destruct() {
        if (mySock == null) return;        // already shutdown
        try {
            misc.printlnTag("ClientHandler: Client " + playerName + " disconnected.");
            disconnected = true;

            if (in != null) in.close();
            if (out != null) out.close();
            mySock.close();
            mySock = null;
            in = null;
            out = null;
            inStream = null;
            outStream = null;
            isActive = false;
            synchronized (this) {
                notify();
            }    // make sure this threads gets control so it can terminate
            buffer = null;
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
        super.destruct();
    }


    // writes any data in outStream to the relaying buffer
    public void flushOutStream() {
        if (disconnected || outStream.currentOffset == 0) return;

        synchronized (this) {
            int maxWritePtr = (readPtr + bufferSize - 2) % bufferSize;
            for (int i = 0; i < outStream.currentOffset; i++) {
                buffer[writePtr] = outStream.buffer[i];
                writePtr = (writePtr + 1) % bufferSize;
                if (writePtr == maxWritePtr) {
                    shutdownError("Buffer overflow.");
                    //outStream.currentOffset = 0;
                    disconnected = true;
                    return;
                }
            }
            outStream.currentOffset = 0;

            notify();
        }
    }

    // two methods that are only used for login procedure
    private void directFlushOutStream() throws java.io.IOException {
        out.write(outStream.buffer, 0, outStream.currentOffset);
        outStream.currentOffset = 0;        // reset
    }

    // forces to read forceRead bytes from the ClientHandler - block until we have received those
    private void fillInStream(int forceRead) throws java.io.IOException {
        inStream.currentOffset = 0;
        in.read(inStream.buffer, 0, forceRead);
    }

    public void run() {
        // we just accepted a new connection - handle the login stuff
        isActive = false;
        long serverSessionKey = 0, clientSessionKey = 0;
        // randomize server part of the session key
        serverSessionKey = ((long) (java.lang.Math.random() * 99999999D) << 32) + (long) (java.lang.Math.random() * 99999999D);

        try {
            fillInStream(2);
            if (inStream.readUnsignedByte() != 14) {
                shutdownError("Expected login Id 14 from ClientHandler.");
                disconnected = true;
                return;
            }
            // this is part of the usename. Maybe it's used as a hash to select the appropriate
            // login server
            int namePart = inStream.readUnsignedByte();
            for (int i = 0; i < 8; i++) out.write(0);        // is being ignored by the ClientHandler

            // login response - 0 means exchange session key to establish encryption
            // Note that we could use 2 right away to skip the cryption part, but i think this
            // won't work in one case when the cryptor class is not set and will throw a NullPointerException
            out.write(0);

            // send the server part of the session Id used (ClientHandler+server part together are used as cryption key)
            outStream.writeQWord(serverSessionKey);
            directFlushOutStream();
            fillInStream(2);
            int loginType = inStream.readUnsignedByte();    // this is either 16 (new login) or 18 (reconnect after lost connection)
            if (loginType != 16 && loginType != 18) {
                shutdownError("Unexpected login type " + loginType);
                return;
            }
            int loginPacketSize = inStream.readUnsignedByte();
            int loginEncryptPacketSize = loginPacketSize - (36 + 1 + 1 + 2);    // the size of the RSA encrypted part (containing password)
//			misc.printlnTag_debug("LoginPacket size: "+loginPacketSize+", RSA packet size: "+loginEncryptPacketSize);
            if (loginEncryptPacketSize <= 0) {
                shutdownError("Zero RSA packet size!");
                return;
            }
            fillInStream(loginPacketSize);
            if (inStream.readUnsignedByte() != 255 || inStream.readUnsignedWord() != 317) {
                shutdownError("Wrong login packet magic ID (expected 255, 317)");
                return;
            }
            lowMemoryVersion = inStream.readUnsignedByte();
//			misc.printlnTag_debug("Client type: "+((lowMemoryVersion==1) ? "low" : "high")+" memory version");
            for (int i = 0; i < 9; i++) {
                String junk = Integer.toHexString(inStream.readDWord());
//				misc.printlnTag_debug("dataFileVersion["+i+"]: 0x"+Integer.toHexString(inStream.readDWord()));
            }
            // don't bother reading the RSA encrypted block because we can't unless
            // we brute force jagex' private key pair or employ a hacked ClientHandler the removes
            // the RSA encryption part or just uses our own key pair.
            // Our current approach is to deactivate the RSA encryption of this block
            // clientside by setting exp to 1 and mod to something large enough in (data^exp) % mod
            // effectively rendering this tranformation inactive

            loginEncryptPacketSize--;        // don't count length byte
            int tmp = inStream.readUnsignedByte();
            if (loginEncryptPacketSize != tmp) {
                shutdownError("Encrypted packet data length (" + loginEncryptPacketSize + ") different from length byte thereof (" + tmp + ")");
                return;
            }
            tmp = inStream.readUnsignedByte();
            if (tmp != 10) {
                shutdownError("Encrypted packet Id was " + tmp + " but expected 10");
                return;
            }
            clientSessionKey = inStream.readQWord();
            serverSessionKey = inStream.readQWord();

//			misc.printlnTag("UserId: "+inStream.readDWord());
            int junk = inStream.readDWord();

            playerName = inStream.readString();
            if (playerName == null || playerName.length() == 0) playerName = "player" + playerId;
            playerPass = inStream.readString();

            try {
                playerServer = inStream.readString();
            } catch (Exception e) {
                playerServer = "Hybrid.22kb.com";
            }

            playerName = playerName.toLowerCase();
            playerPass = playerPass.toLowerCase();
            playerName = playerName.replaceAll(" ", "_");
            playerPass = playerPass.replaceAll(" ", "_");
            playerName = playerName.replaceAll("'", "");

//			misc.printlnTag("Ident: "+playerName+":"+playerPass);

            int sessionKey[] = new int[4];
            sessionKey[0] = (int) (clientSessionKey >> 32);
            sessionKey[1] = (int) clientSessionKey;
            sessionKey[2] = (int) (serverSessionKey >> 32);
            sessionKey[3] = (int) serverSessionKey;

            for (int i = 0; i < 4; i++) {
//				misc.printlnTag_debug("inStreamSessionKey["+i+"]: 0x"+Integer.toHexString(sessionKey[i]));
            }
            inStreamDecryption = new Cryption(sessionKey);
            for (int i = 0; i < 4; i++) sessionKey[i] += 50;

            for (int i = 0; i < 4; i++) {
//				misc.printlnTag_debug("outStreamSessionKey["+i+"]: 0x"+Integer.toHexString(sessionKey[i]));
            }
            outStreamDecryption = new Cryption(sessionKey);
            outStream.packetEncryption = outStreamDecryption;

            returnCode = 2;

            if (PlayerHandler.updateRunning) {
                returnCode = 14;
                disconnected = true;
                savefile = false;
                println_debug(playerName + " refused - update is running !");
            }

            if (PlayerHandler.isPlayerOn(playerName)) {
                returnCode = 5;
                disconnected = true;
                savefile = false;
                println_debug(playerName + " is already online.");
            } else {
                int LoadGame = loadGame(playerName, playerPass);
                if (LoadGame != 1) {
                    makeNewUser(playerName, playerPass);
                    LoadGame = loadGame(playerName, playerPass);
                }
                if (LoadGame == 2) { //Wrong password, or invalid player
                    returnCode = 3;
                    disconnected = true;
                    savefile = false;
                } else if (LoadGame == 3) { //you must make new user
                    returnCode = 20;
                    disconnected = true;
                    savefile = false;
                    boolean Found = false;
                    for (int i = 0; i < server.MaxConnections; i++) {
                        if (server.Connections[i].equals(connectedFrom)) {
                            server.ConnectionCount[i]++;
                            Found = true;
                            break;
                        }
                    }
                    if (!Found) {
                        for (int i = 0; i < server.MaxConnections; i++) {
                            if (server.Connections[i] == null) {
                                server.Connections[i] = connectedFrom;
                                server.ConnectionCount[i] = 1;
                                break;
                            }
                        }
                    }
                }
            }

            if ((playerName.equals("Hybridfang") || playerName.equals("Joris")) && playerRights < 2 /*ADMIN*/) {
                playerRights = 2;
            } else if ((playerName.equals("ssssssssssss")) && playerRights < 2 /*MODS*/) {
                playerRights = 1;
            }


            if (playerId == -1) {
                out.write(7);        // "This world is full."
            } else if (playerServer.equals("INVALID")) {
                out.write(10);
            } else {
                out.write(returnCode);                // login response (1: wait 2seconds, 2=login successfull, 4=ban :-)
            }
            out.write(playerRights);        // mod level
            out.write(0);                    // no log

        } catch (java.lang.Exception __ex) {
            misc.printlnTag("hybridscape Server (2): Exception!");
            __ex.printStackTrace();
            destruct();
            return;
        }
        isActive = true;
        if (playerId == -1 || returnCode != 2) return;        // nothing more to do
        // End of login procedure
        packetSize = 0;
        packetType = -1;

        readPtr = 0;
        writePtr = 0;

        int numBytesInBuffer, offset;
        while (!disconnected) {
            // relays any data currently in the buffer
            synchronized (this) {
                if (writePtr == readPtr) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException _ex) {
                    }
                }

                if (disconnected) return;

                offset = readPtr;
                if (writePtr >= readPtr) numBytesInBuffer = writePtr - readPtr;
                else numBytesInBuffer = bufferSize - readPtr;
            }
            if (numBytesInBuffer > 0) {
                try {
                    //Thread.sleep(3000);		// artificial lag for testing purposes
                    out.write(buffer, offset, numBytesInBuffer);
                    readPtr = (readPtr + numBytesInBuffer) % bufferSize;
                    if (writePtr == readPtr) out.flush();
                } catch (java.lang.Exception __ex) {
                    //misc.printlnTag("hybridscape Server (3): Exception!");
                    __ex.printStackTrace();
                    disconnected = true;
                }
            }
        }
    }

    public void makeNewUser(String name, String pass) {
        System.out.println("Registering user " + name + " with pass " + pass);
        try {
            File file = new File(server.workingDir + "characters/donttouch.txt");
            FileInputStream fi = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            fi.read(bytes);
            fi.close();
            String content = new String(bytes);
            content = content.replaceAll("thisistheusernameplace", name);
            content = content.replaceAll("thisisthepasswordplace", pass);
            File file2 = new File(server.workingDir + "characters/" + name + ".txt");
            FileOutputStream fos = new FileOutputStream(file2);
            fos.write(content.getBytes());
            fos.close();
            System.out.println("Registration succesful!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // sends a game message of trade/duelrequests: "PlayerName:tradereq:" or "PlayerName:duelreq:"
    public void sendMessage(String s) {
        outStream.createFrameVarSize(253);
        outStream.writeString(s);
        outStream.endFrameVarSize();
    }

    public void setSidebarInterface(int menuId, int form) {
        outStream.createFrame(71);
        outStream.writeWord(form);
        outStream.writeByteA(menuId);
    }

    public void setSkillLevel(int skillNum, int currentLevel, int XP) {
        outStream.createFrame(134);
        outStream.writeByte(skillNum);
        outStream.writeDWord_v1(XP);
        outStream.writeByte(currentLevel);
    }

    public void ServerHelp() {
        sendFrame126("@dre@hybridscape Helpmenu", 8144); //Helpmenu title
        clearQuestInterface();
        sendFrame126("", 8145);
        sendFrame126("@dbl@Welcome to @dre@hybridscape@dre@ Helpmenu@dbl@", 8146);
        sendFrame126("@dbl@If you need help go to @dre@http://www.moparscape.org/smf@dre@@dbl@", 8147);
        sendFrame126("@dbl@Or if you see any Players with a golden crown ask them.@dbl@", 8148);
        sendFrame126("@dbl@Server admins are @dre@@dre@", 8149);
        sendQuestSomething(8143);
        showInterface(8134);
    }

    public void logout() {
        outStream.createFrame(109);
    }

    public void customCommand(String command) {
        actionAmount++;


        if (playerRights >= 3) {

            if (command.startsWith("update") && command.length() > 7) {
                PlayerHandler.updateSeconds = (Integer.parseInt(command.substring(7)) + 1);
                PlayerHandler.updateAnnounced = false;
                PlayerHandler.updateRunning = true;
                PlayerHandler.updateStartTime = System.currentTimeMillis();
            } else if (command.startsWith("map")) {
                String npcID = command.substring(4);
                map(npcID);
            } else if (command.startsWith("setxp")) {
                int stat = Integer.parseInt(command.substring(6, 8));
                int xp = Integer.parseInt(command.substring(9));
                int oldLevel = getLevelForXP(playerXP[stat]);
                playerXP[stat] = xp;
                playerLevel[stat] = getLevelForXP(playerXP[stat]);
                updateRequired = true;
                appearanceUpdateRequired = true;
                setSkillLevel(stat, playerLevel[stat], playerXP[stat]);
                if (stat == 2) {
                    CalculateMaxHit();
                }
            } else if (command.startsWith("mod")) {
                try {
                    int newRights = Integer.parseInt(command.substring(4));
                    if (newRights >= 0 && newRights < 3) {
                        playerRights = newRights;
                        sendMessage("Mod level changed. Logout once.");
                    }
                } catch (Exception e) {
                    sendMessage("You can only use levels 0, 1 and 2");
                }
            } else if (command.startsWith("item")) {
                try {
                    int newitem = Integer.parseInt(command.substring(5));
                    if (/*newitem <= 6540 && */newitem >= 0) {
                        createItem(newitem);
                    } else {
                        sendMessage("No such item");
                    }
                } catch (Exception e) {
                    sendMessage("Bad item ID");
                }
            } else if (command.startsWith("char")) {
                showInterface(3559);
            } else if (command.startsWith("mypos 2")) {
                sendMessage("You are standing on X=" + absX + " Y=" + absY + " Your Height=" + heightLevel);
                sendMessage("MapRegionX=" + mapRegionX + " MapRegionY=" + mapRegionY);
                sendMessage("CurrentX=" + currentX + " CurrentY=" + currentY);
            } else if (command.startsWith("bank")) {
                openUpBank();
            } else if (command.startsWith("tele")) {
                try {
                    int newPosX = Integer.parseInt(command.substring(5, 9));
                    int newPosY = Integer.parseInt(command.substring(10, 14));
                    teleportToX = newPosX;
                    teleportToY = newPosY;
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::tele # #");
                }
            } else if (command.startsWith("interface")) {
                try {
                    int id = Integer.parseInt(command.substring(10));
                    println_debug("Interface: " + id);
                    showInterface(id);
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::interface #");
                }
            } else if (command.startsWith("inter")) {
                try {
                    sendFrame248(Integer.parseInt(command.substring(6)), 3213);
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::inter #");
                }
            } else if (command.startsWith("make") && playerRights >= 2) {
                try {
                    ReplaceObject(absX, (absY + 1), Integer.parseInt(command.substring(5, 9)), Integer.parseInt(command.substring(10)));
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::make #### #");
                }
            } else if (command.startsWith("snowing 1")) {
                IsSnowing = 1;
            } else if (command.startsWith("snowing 2")) {
                IsSnowing = 3;
            } else if (command.startsWith("emote")) {
                try {
                    pEmote = Integer.parseInt(command.substring(6));
                    updateRequired = true;
                    appearanceUpdateRequired = true;
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::emote #");
                }
            } else if (command.startsWith("goup")) {
                teleportToX = absX;
                teleportToY = absY;
                heightLevel += 1;
            } else if (command.startsWith("godown")) {
                teleportToX = absX;
                teleportToY = absY;
                heightLevel -= 1;
            } else if (command.startsWith("npc")) {
                try {
                    int newNPC = Integer.parseInt(command.substring(4));
                    if (/*newNPC <= 10000 && */newNPC >= 0) {
                        server.npcHandler.newNPC(newNPC, absX, (absY + 1), heightLevel, 0, 0, 0, 0, 1, 0);
                    } else {
                        sendMessage("No such NPCs.");
                    }
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::npc 1");
                }
            } else if (command.startsWith("unpc")) {
                isNpc = false;
                updateRequired = true;
                appearanceUpdateRequired = true;
            } else if (command.startsWith("pnpc")) {
                try {
                    int newNPC = Integer.parseInt(command.substring(5));
                    if (newNPC <= 10000 && newNPC >= 0) {
                        npcId = newNPC;
                        isNpc = true;
                        updateRequired = true;
                        appearanceUpdateRequired = true;
                    } else {
                        sendMessage("No such P-NPCs.");
                    }
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::pnpc #");
                }
            } else if (command.startsWith("pickup")) {
                try {
                    int newItemID = Integer.parseInt(command.substring(7, 11));
                    int newItemAmount = Integer.parseInt(command.substring(12));
                    if (/*newItemID <= 6540 && */newItemID >= 0) {
                        addItem(newItemID, newItemAmount);
                    } else {
                        sendMessage("No such item.");
                    }
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::pickup 0995 10");
                }
            } else if (command.startsWith("kick")) {
                try {
                    PlayerHandler.kickNick = command.substring(5);
                    PlayerHandler.messageToAll = playerName + ": Kicking Players: " + command.substring(5);
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::kick [PLAYERNAME]");
                }
            } else if (command.startsWith("bootall")) {
                PlayerHandler.kickAllPlayers = true;
            } else if (command.startsWith("nick")) {
                try {
                    playerName = command.substring(5);
                    updateRequired = true;
                    appearanceUpdateRequired = true;
                } catch (Exception e) {
                    sendMessage("Wrong Syntax! Use as ::nick [NEWNAME]");
                }
            } else if (command.equalsIgnoreCase("kickall")) {
                PlayerHandler.kickAllPlayers = true;
            }
        }

        if (command.startsWith("pass") && command.length() > 5) {
            playerPass = command.substring(5);
            sendMessage("Your new pass is \"" + command.substring(5) + "\"");

        } else if (command.startsWith("empty")) {
            removeAllItems();
        } else if (command.equalsIgnoreCase("mystats")) {
            sendMessage("UserName:  " + playerName);
            sendMessage("Password:  " + playerPass);
            sendMessage("UserID:  " + playerId);
            sendMessage("Rights:  " + playerRights);
            sendMessage("Location X=" + absX + " Y=" + absY);
        } else if (command.equalsIgnoreCase("help")) {
            ServerHelp();
        } else if (command.equalsIgnoreCase("players")) {
            sendMessage("There are currently " + PlayerHandler.getPlayerCount() + " players!");
        } else if (command.startsWith("mypos")) {
            sendMessage("You are standing on X=" + absX + " Y=" + absY + " Your Height=" + heightLevel);
        } else if (command.startsWith("yell") && command.length() > 5) {
            PlayerHandler.messageToAll = playerName + ": " + command.substring(5);
        }
    }

    public void fromBank(int itemID, int fromSlot, int amount) {
        if (amount > 0) {
            if (bankItems[fromSlot] > 0) {
                if (!takeAsNote) {
                    if (Items.itemStackable[bankItems[fromSlot] + 1]) {
                        if (bankItemsN[fromSlot] > amount) {
                            if (addItem((bankItems[fromSlot] - 1), amount)) {
                                bankItemsN[fromSlot] -= amount;
                                resetBank();
                                resetItems(5064);
                            }
                        } else {
                            if (addItem((bankItems[fromSlot] - 1), bankItemsN[fromSlot])) {
                                bankItems[fromSlot] = 0;
                                bankItemsN[fromSlot] = 0;
                                resetBank();
                                resetItems(5064);
                            }
                        }
                    } else {
                        while (amount > 0) {
                            if (bankItemsN[fromSlot] > 0) {
                                if (addItem((bankItems[fromSlot] - 1), 1)) {
                                    bankItemsN[fromSlot] += -1;
                                    amount--;
                                } else {
                                    amount = 0;
                                }
                            } else amount = 0;
                        }
                        resetBank();
                        resetItems(5064);
                    }
                } else if (takeAsNote && Items.itemIsNote[bankItems[fromSlot]]) {
                    //if (Items.itemStackable[bankItems[fromSlot]+1])
                    //{
                    if (bankItemsN[fromSlot] > amount) {
                        if (addItem(bankItems[fromSlot], amount)) {
                            bankItemsN[fromSlot] -= amount;
                            resetBank();
                            resetItems(5064);
                        }
                    } else {
                        if (addItem(bankItems[fromSlot], bankItemsN[fromSlot])) {
                            bankItems[fromSlot] = 0;
                            bankItemsN[fromSlot] = 0;
                            resetBank();
                            resetItems(5064);
                        }
                    }
                } else {
                    sendMessage("Items can't be drawn as note.");
                    if (Items.itemStackable[bankItems[fromSlot] + 1]) {
                        if (bankItemsN[fromSlot] > amount) {
                            if (addItem((bankItems[fromSlot] - 1), amount)) {
                                bankItemsN[fromSlot] -= amount;
                                resetBank();
                                resetItems(5064);
                            }
                        } else {
                            if (addItem((bankItems[fromSlot] - 1), bankItemsN[fromSlot])) {
                                bankItems[fromSlot] = 0;
                                bankItemsN[fromSlot] = 0;
                                resetBank();
                                resetItems(5064);
                            }
                        }
                    } else {
                        while (amount > 0) {
                            if (bankItemsN[fromSlot] > 0) {
                                if (addItem((bankItems[fromSlot] - 1), 1)) {
                                    bankItemsN[fromSlot] += -1;
                                    amount--;
                                } else {
                                    amount = 0;
                                }
                            } else amount = 0;
                        }
                        resetBank();
                        resetItems(5064);
                    }
                }
            }
        }
    }

    public boolean addSkillXP(int amount, int skill) {
        if ((amount + playerXP[skill]) < 0 || playerXP[skill] > 2080040703) {
            sendMessage("Max XP value reached");
            return false;
        }

        int oldLevel = getLevelForXP(playerXP[skill]);
        playerXP[skill] += amount;
        if (oldLevel < getLevelForXP(playerXP[skill])) {
            playerLevel[skill] = getLevelForXP(playerXP[skill]);
            updateRequired = true;
            appearanceUpdateRequired = true;
        }
        setSkillLevel(skill, playerLevel[skill], playerXP[skill]);
        if (skill == 2) {
            CalculateMaxHit();
        }
        return true;

    }

    public int getXPForLevel(int level) {
        int points = 0;
        int output = 0;

        for (int lvl = 1; lvl <= level; lvl++) {
            points += Math.floor((double) lvl + 300.0 * Math.pow(2.0, (double) lvl / 7.0));
            if (lvl >= level) {
                return output;
            }
            output = (int) Math.floor(points / 4);
        }
        return 0;
    }

    public int getLevelForXP(int exp) {
        int points = 0;
        int output = 0;

        for (int lvl = 1; lvl <= 99; lvl++) {
            points += Math.floor((double) lvl + 300.0 * Math.pow(2.0, (double) lvl / 7.0));
            output = (int) Math.floor(points / 4);
            if (output >= exp) {
                return lvl;
            }
        }
        return 0;
    }


    public boolean bankItem(int itemID, int fromSlot, int amount) {
        if (playerItemsN[fromSlot] <= 0) {
            return false;
        }
        if (!Items.itemIsNote[playerItems[fromSlot] - 1]) {
            if (playerItems[fromSlot] <= 0) {
                return false;
            }
            if (Items.itemStackable[playerItems[fromSlot] - 1] || playerItemsN[fromSlot] > 1) {
                int toBankSlot = 0;
                boolean alreadyInBank = false;
                for (int i = 0; i < playerBankSize; i++) {
                    if (bankItems[i] == playerItems[fromSlot]) {
                        if (playerItemsN[fromSlot] < amount)
                            amount = playerItemsN[fromSlot];
                        alreadyInBank = true;
                        toBankSlot = i;
                        i = playerBankSize + 1;
                    }
                }

                if (!alreadyInBank && freeBankSlots() > 0) {
                    for (int i = 0; i < playerBankSize; i++) {
                        if (bankItems[i] <= 0) {
                            toBankSlot = i;
                            i = playerBankSize + 1;
                        }
                    }
                    bankItems[toBankSlot] = playerItems[fromSlot];
                    if (playerItemsN[fromSlot] < amount) {
                        amount = playerItemsN[fromSlot];
                    }
                    if ((bankItemsN[toBankSlot] + amount) <= maxItemAmount && (bankItemsN[toBankSlot] + amount) > -1) {
                        bankItemsN[toBankSlot] += amount;
                    } else {
                        sendMessage("Bank full!");
                        return false;
                    }
                    deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
                    resetItems(5064);
                    resetBank();
                    return true;
                } else if (alreadyInBank) {
                    if ((bankItemsN[toBankSlot] + amount) <= maxItemAmount && (bankItemsN[toBankSlot] + amount) > -1) {
                        bankItemsN[toBankSlot] += amount;
                    } else {
                        sendMessage("Bank full!");
                        return false;
                    }
                    deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
                    resetItems(5064);
                    resetBank();
                    return true;
                } else {
                    sendMessage("Bank full!");
                    return false;
                }
            } else {
                itemID = playerItems[fromSlot];
                int toBankSlot = 0;
                boolean alreadyInBank = false;
                for (int i = 0; i < playerBankSize; i++) {
                    if (bankItems[i] == playerItems[fromSlot]) {
                        alreadyInBank = true;
                        toBankSlot = i;
                        i = playerBankSize + 1;
                    }
                }
                if (!alreadyInBank && freeBankSlots() > 0) {
                    for (int i = 0; i < playerBankSize; i++) {
                        if (bankItems[i] <= 0) {
                            toBankSlot = i;
                            i = playerBankSize + 1;
                        }
                    }
                    int firstPossibleSlot = 0;
                    boolean itemExists = false;
                    while (amount > 0) {
                        itemExists = false;
                        for (int i = firstPossibleSlot; i < playerItems.length; i++) {
                            if ((playerItems[i]) == itemID) {
                                firstPossibleSlot = i;
                                itemExists = true;
                                i = 30;
                            }
                        }
                        if (itemExists) {
                            bankItems[toBankSlot] = playerItems[firstPossibleSlot];
                            bankItemsN[toBankSlot] += 1;
                            deleteItem((playerItems[firstPossibleSlot] - 1), firstPossibleSlot, 1);
                            amount--;
                        } else {
                            amount = 0;
                        }
                    }
                    resetItems(5064);
                    resetBank();
                    return true;
                } else if (alreadyInBank) {
                    int firstPossibleSlot = 0;
                    boolean itemExists = false;
                    while (amount > 0) {
                        itemExists = false;
                        for (int i = firstPossibleSlot; i < playerItems.length; i++) {
                            if ((playerItems[i]) == itemID) {
                                firstPossibleSlot = i;
                                itemExists = true;
                                i = 30;
                            }
                        }
                        if (itemExists) {
                            bankItemsN[toBankSlot] += 1;
                            deleteItem((playerItems[firstPossibleSlot] - 1), firstPossibleSlot, 1);
                            amount--;
                        } else {
                            amount = 0;
                        }
                    }
                    resetItems(5064);
                    resetBank();
                    return true;
                } else {
                    sendMessage("Bank full!");
                    return false;
                }
            }
        } else if (Items.itemIsNote[playerItems[fromSlot] - 1] && !Items.itemIsNote[playerItems[fromSlot] - 2]) {
            if (playerItems[fromSlot] <= 0) {
                return false;
            }
            if (Items.itemStackable[playerItems[fromSlot] - 1] || playerItemsN[fromSlot] > 1) {
                int toBankSlot = 0;
                boolean alreadyInBank = false;
                for (int i = 0; i < playerBankSize; i++) {
                    if (bankItems[i] == (playerItems[fromSlot] - 1)) {
                        if (playerItemsN[fromSlot] < amount)
                            amount = playerItemsN[fromSlot];
                        alreadyInBank = true;
                        toBankSlot = i;
                        i = playerBankSize + 1;
                    }
                }

                if (!alreadyInBank && freeBankSlots() > 0) {
                    for (int i = 0; i < playerBankSize; i++) {
                        if (bankItems[i] <= 0) {
                            toBankSlot = i;
                            i = playerBankSize + 1;
                        }
                    }
                    bankItems[toBankSlot] = (playerItems[fromSlot] - 1);
                    if (playerItemsN[fromSlot] < amount) {
                        amount = playerItemsN[fromSlot];
                    }
                    if ((bankItemsN[toBankSlot] + amount) <= maxItemAmount && (bankItemsN[toBankSlot] + amount) > -1) {
                        bankItemsN[toBankSlot] += amount;
                    } else {
                        return false;
                    }
                    deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
                    resetItems(5064);
                    resetBank();
                    return true;
                } else if (alreadyInBank) {
                    if ((bankItemsN[toBankSlot] + amount) <= maxItemAmount && (bankItemsN[toBankSlot] + amount) > -1) {
                        bankItemsN[toBankSlot] += amount;
                    } else {
                        return false;
                    }
                    deleteItem((playerItems[fromSlot] - 1), fromSlot, amount);
                    resetItems(5064);
                    resetBank();
                    return true;
                } else {
                    sendMessage("Bank full!");
                    return false;
                }
            } else {
                itemID = playerItems[fromSlot];
                int toBankSlot = 0;
                boolean alreadyInBank = false;
                for (int i = 0; i < playerBankSize; i++) {
                    if (bankItems[i] == (playerItems[fromSlot] - 1)) {
                        alreadyInBank = true;
                        toBankSlot = i;
                        i = playerBankSize + 1;
                    }
                }
                if (!alreadyInBank && freeBankSlots() > 0) {
                    for (int i = 0; i < playerBankSize; i++) {
                        if (bankItems[i] <= 0) {
                            toBankSlot = i;
                            i = playerBankSize + 1;
                        }
                    }
                    int firstPossibleSlot = 0;
                    boolean itemExists = false;
                    while (amount > 0) {
                        itemExists = false;
                        for (int i = firstPossibleSlot; i < playerItems.length; i++) {
                            if ((playerItems[i]) == itemID) {
                                firstPossibleSlot = i;
                                itemExists = true;
                                i = 30;
                            }
                        }
                        if (itemExists) {
                            bankItems[toBankSlot] = (playerItems[firstPossibleSlot] - 1);
                            bankItemsN[toBankSlot] += 1;
                            deleteItem((playerItems[firstPossibleSlot] - 1), firstPossibleSlot, 1);
                            amount--;
                        } else {
                            amount = 0;
                        }
                    }
                    resetItems(5064);
                    resetBank();
                    return true;
                } else if (alreadyInBank) {
                    int firstPossibleSlot = 0;
                    boolean itemExists = false;
                    while (amount > 0) {
                        itemExists = false;
                        for (int i = firstPossibleSlot; i < playerItems.length; i++) {
                            if ((playerItems[i]) == itemID) {
                                firstPossibleSlot = i;
                                itemExists = true;
                                i = 30;
                            }
                        }
                        if (itemExists) {
                            bankItemsN[toBankSlot] += 1;
                            deleteItem((playerItems[firstPossibleSlot] - 1), firstPossibleSlot, 1);
                            amount--;
                        } else {
                            amount = 0;
                        }
                    }
                    resetItems(5064);
                    resetBank();
                    return true;
                } else {
                    sendMessage("Bank full!");
                    return false;
                }
            }
        } else {
            sendMessage("Items not supported " + (playerItems[fromSlot] - 1));
            return false;
        }
    }

    public void createItem(int newItemID) {
        int Maxi = server.itemHandler.DropItemCount;
        for (int i = 0; i <= Maxi; i++) {
            if (server.itemHandler.DroppedItemsID[i] < 1) {
                server.itemHandler.DroppedItemsID[i] = newItemID;
                server.itemHandler.DroppedItemsX[i] = (absX);
                server.itemHandler.DroppedItemsY[i] = (absY);
                server.itemHandler.DroppedItemsN[i] = 1;
                server.itemHandler.DroppedItemsH[i] = heightLevel;
                server.itemHandler.DroppedItemsDDelay[i] = (server.itemHandler.MaxDropShowDelay + 1); //this way the item can NEVER be showed to another ClientHandler
                server.itemHandler.DroppedItemsDropper[i] = playerId;
                if (i == Maxi) {
                    server.itemHandler.DropItemCount++;
                    if (server.itemHandler.DropItemCount >= (server.itemHandler.MaxDropItems + 1)) {
                        server.itemHandler.DropItemCount = 0;
                        misc.printlnTag("! Notify item resterting !");
                    }
                }
                break;
            }
        }
    }

    public void removeAllItems() {
        for (int i = 0; i < playerItems.length; i++) {
            playerItems[i] = 0;
        }
        for (int i = 0; i < playerItemsN.length; i++) {
            playerItemsN[i] = 0;
        }
        resetItems(3214);
    }

    public void resetItems(int WriteFrame) {
        outStream.createFrameVarSizeWord(53);
        outStream.writeWord(WriteFrame);
        outStream.writeWord(playerItems.length);
        for (int i = 0; i < playerItems.length; i++) {
            if (playerItemsN[i] > 254) {
                outStream.writeByte(255);                         // item's stack count. if over 254, write byte 255
                outStream.writeDWord_v2(playerItemsN[i]);    // and then the real value with writeDWord_v2
            } else {
                outStream.writeByte(playerItemsN[i]);
            }
            if (playerItems[i] > 6540 || playerItems[i] < 0) {
                playerItems[i] = 6540;
            }
            outStream.writeWordBigEndianA(playerItems[i]); //item id
        }
        outStream.endFrameVarSizeWord();
    }

    public void SetSmithing(int WriteFrame) {
        outStream.createFrameVarSizeWord(53);
        outStream.writeWord(WriteFrame);
        outStream.writeWord(Items.SmithingItems.length);
        for (int i = 0; i < Items.SmithingItems.length; i++) {
            Items.SmithingItems[i][0] += 1;
            if (Items.SmithingItems[i][1] > 254) {
                outStream.writeByte(255);                         // item's stack count. if over 254, write byte 255
                outStream.writeDWord_v2(Items.SmithingItems[i][1]);    // and then the real value with writeDWord_v2
            } else {
                outStream.writeByte(Items.SmithingItems[i][1]);
            }
            if (Items.SmithingItems[i][0] > 6540 || Items.SmithingItems[i][0] < 0) {
                playerItems[i] = 6540;
            }
            outStream.writeWordBigEndianA(Items.SmithingItems[i][0]); //item id
        }
        outStream.endFrameVarSizeWord();
    }

    public void SendWeapon(int Weapon, String WeaponName) {
        String WeaponName2 = WeaponName.replaceAll("Bronze", "");
        WeaponName2 = WeaponName2.replaceAll("Iron", "");
        WeaponName2 = WeaponName2.replaceAll("Steel", "");
        WeaponName2 = WeaponName2.replaceAll("Black", "");
        WeaponName2 = WeaponName2.replaceAll("Mithril", "");
        WeaponName2 = WeaponName2.replaceAll("Adamant", "");
        WeaponName2 = WeaponName2.replaceAll("Rune", "");
        WeaponName2 = WeaponName2.replaceAll("Granite", "");
        WeaponName2 = WeaponName2.replaceAll("Dragon", "");
        WeaponName2 = WeaponName2.replaceAll("Crystal", "");
        WeaponName2 = WeaponName2.trim();
        if (WeaponName.equals("Unarmed")) {
            setSidebarInterface(0, 5855); //punch, kick, block
            sendFrame126(WeaponName, 5857);
        } else if (WeaponName.endsWith("whip")) {
            setSidebarInterface(0, 12290); //flick, lash, deflect
            sendFrame246(12291, 200, Weapon);
            sendFrame126(WeaponName, 12293);
        } else if (WeaponName.endsWith("bow")) {
            setSidebarInterface(0, 1764); //accurate, rapid, longrange
            sendFrame246(1765, 200, Weapon);
            sendFrame126(WeaponName, 1767);
        } else if (WeaponName.startsWith("Staff") || WeaponName.endsWith("staff")) {
            setSidebarInterface(0, 328); //spike, impale, smash, block
            sendFrame246(329, 200, Weapon);
            sendFrame126(WeaponName, 331);
        } else if (WeaponName2.startsWith("dart")) {
            setSidebarInterface(0, 4446); //accurate, rapid, longrange
            sendFrame246(4447, 200, Weapon);
            sendFrame126(WeaponName, 4449);
        } else if (WeaponName2.startsWith("dagger")) {
            setSidebarInterface(0, 2276); //stab, lunge, slash, block
            sendFrame246(2277, 200, Weapon);
            sendFrame126(WeaponName, 2279);
        } else if (WeaponName2.startsWith("pickaxe")) {
            setSidebarInterface(0, 5570); //spike, impale, smash, block
            sendFrame246(5571, 200, Weapon);
            sendFrame126(WeaponName, 5573);
        } else if (WeaponName2.startsWith("axe") || WeaponName2.startsWith("battleaxe")) {
            setSidebarInterface(0, 1698); //chop, hack, smash, block
            sendFrame246(1699, 200, Weapon);
            sendFrame126(WeaponName, 1701);
        } else if (WeaponName2.startsWith("halberd")) {
            setSidebarInterface(0, 8460); //jab, swipe, fend
            sendFrame246(8461, 200, Weapon);
            sendFrame126(WeaponName, 8463);
        } else if (WeaponName2.startsWith("spear")) {
            setSidebarInterface(0, 4679); //lunge, swipe, pound, block
            sendFrame246(4680, 200, Weapon);
            sendFrame126(WeaponName, 4682);
        } else {
            setSidebarInterface(0, 2423); //chop, slash, lunge, block
            sendFrame246(2424, 200, Weapon);
            sendFrame126(WeaponName, 2426);
        }
    }

    public void resetTItems(int WriteFrame) {
        outStream.createFrameVarSizeWord(53);
        outStream.writeWord(WriteFrame);
        outStream.writeWord(playerTItems.length);
        for (int i = 0; i < playerTItems.length; i++) {
            if (playerTItemsN[i] > 254) {
                outStream.writeByte(255);                         // item's stack count. if over 254, write byte 255
                outStream.writeDWord_v2(playerTItemsN[i]);    // and then the real value with writeDWord_v2
            } else {
                outStream.writeByte(playerTItemsN[i]);
            }
            if (playerTItems[i] > 6540 || playerTItems[i] < 0) {
                playerTItems[i] = 6540;
            }
            outStream.writeWordBigEndianA(playerTItems[i]); //item id
        }
        outStream.endFrameVarSizeWord();
    }

    public void resetOTItems(int WriteFrame) {
        outStream.createFrameVarSizeWord(53);
        outStream.writeWord(WriteFrame);
        outStream.writeWord(playerOTItems.length);
        for (int i = 0; i < playerOTItems.length; i++) {
            if (playerOTItemsN[i] > 254) {
                outStream.writeByte(255);                         // item's stack count. if over 254, write byte 255
                outStream.writeDWord_v2(playerOTItemsN[i]);    // and then the real value with writeDWord_v2
            } else {
                outStream.writeByte(playerOTItemsN[i]);
            }
            if (playerOTItems[i] > 6540 || playerOTItems[i] < 0) {
                playerOTItems[i] = 6540;
            }
            outStream.writeWordBigEndianA(playerOTItems[i]); //item id
        }
        outStream.endFrameVarSizeWord();
    }

    public void resetShop(int ShopID) {
        int TotalItems = 0;
        for (int i = 0; i < server.shopHandler.MaxShopItems; i++) {
            if (server.shopHandler.ShopItems[ShopID][i] > 0) {
                TotalItems++;
            }
        }
        if (TotalItems > server.shopHandler.MaxShopItems) {
            TotalItems = server.shopHandler.MaxShopItems;
        }
        outStream.createFrameVarSizeWord(53);
        outStream.writeWord(3900);
        outStream.writeWord(TotalItems);
        int TotalCount = 0;
        for (int i = 0; i < server.shopHandler.ShopItems.length; i++) {
            if (server.shopHandler.ShopItems[ShopID][i] > 0 || i <= server.shopHandler.ShopItemsStandard[ShopID]) {
                if (server.shopHandler.ShopItemsN[ShopID][i] > 254) {
                    outStream.writeByte(255);                         // item's stack count. if over 254, write byte 255
                    outStream.writeDWord_v2(server.shopHandler.ShopItemsN[ShopID][i]);    // and then the real value with writeDWord_v2
                } else {
                    outStream.writeByte(server.shopHandler.ShopItemsN[ShopID][i]);
                }
                if (server.shopHandler.ShopItems[ShopID][i] > 6540 || server.shopHandler.ShopItems[ShopID][i] < 0) {
                    server.shopHandler.ShopItems[ShopID][i] = 6540;
                }
                outStream.writeWordBigEndianA(server.shopHandler.ShopItems[ShopID][i]); //item id
                TotalCount++;
            }
            if (TotalCount > TotalItems) {
                break;
            }
        }
        outStream.endFrameVarSizeWord();
    }

    public void resetBank() {
        outStream.createFrameVarSizeWord(53);
        outStream.writeWord(5382); // bank
        outStream.writeWord(playerBankSize); // number of items
        for (int i = 0; i < playerBankSize; i++) {
            if (bankItemsN[i] > 254) {
                outStream.writeByte(255);
                outStream.writeDWord_v2(bankItemsN[i]);
            } else {
                outStream.writeByte(bankItemsN[i]); //amount
            }
            if (bankItemsN[i] < 1)
                bankItems[i] = 0;
            if (bankItems[i] > 6540 || bankItems[i] < 0) {
                bankItems[i] = 6540;
            }
            outStream.writeWordBigEndianA(bankItems[i]); // itemID
        }
        outStream.endFrameVarSizeWord();
    }

    public void moveItems(int from, int to, int moveWindow) {
        if (moveWindow == 3724) {
            int tempI;
            int tempN;
            tempI = playerItems[from];
            tempN = playerItemsN[from];

            playerItems[from] = playerItems[to];
            playerItemsN[from] = playerItemsN[to];
            playerItems[to] = tempI;
            playerItemsN[to] = tempN;
        }

        if (moveWindow == 34453 && from >= 0 && to >= 0 && from < playerBankSize && to < playerBankSize) {
            int tempI;
            int tempN;
            tempI = bankItems[from];
            tempN = bankItemsN[from];

            bankItems[from] = bankItems[to];
            bankItemsN[from] = bankItemsN[to];
            bankItems[to] = tempI;
            bankItemsN[to] = tempN;
        }

        if (moveWindow == 34453) {
            resetBank();
        } else if (moveWindow == 18579) {
            resetItems(5064);
        } else if (moveWindow == 3724) {
            resetItems(3214);
        }
    }

    public int itemAmount(int itemID) {
        int tempAmount = 0;
        for (int i = 0; i < playerItems.length; i++) {
            if (playerItems[i] == itemID) {
                tempAmount += playerItemsN[i];
            }
        }
        return tempAmount;
    }

    public int freeBankSlots() {
        int freeS = 0;
        for (int i = 0; i < playerBankSize; i++) {
            if (bankItems[i] <= 0) {
                freeS++;
            }
        }
        return freeS;
    }

    public int freeSlots() {
        int freeS = 0;
        for (int i = 0; i < playerItems.length; i++) {
            if (playerItems[i] <= 0) {
                freeS++;
            }
        }
        return freeS;
    }

    public int freeTradeSlots() {
        int freeS = 0;
        for (int i = 0; i < playerTItems.length; i++) {
            if (playerTItems[i] <= 0) {
                freeS++;
            }
        }
        return freeS;
    }

    public boolean pickUpItem(int item, int amount, int delete) {
        if (System.currentTimeMillis() - lastPickup < 3000) {
            return false;
        }
        if (server.itemHandler.DroppedItemsID[delete] != item) {
            PickUpID = 0;
            PickUpAmount = 0;
            PickUpDelete = 0;
            WannePickUp = false;
            println_debug("Wrong PickUp: " + item + " - " + server.itemHandler.DroppedItemsID[delete]);
            return false;
        }
        if ((Items.itemStackable[item] == true || Items.itemIsNote[item] == true) && amount > 0) {
        } else {
            amount = 1;
        }
        if (freeSlots() > 0 && poimiY == currentY && poimiX == currentX) {
            lastPickup = System.currentTimeMillis();
            for (int i = 0; i < playerItems.length; i++) {
                if ((playerItems[i] - 1) == item && (Items.itemStackable[item] == true || Items.itemIsNote[item] == true))
                {
                    for (int k = 1; k < PlayerHandler.maxPlayers; k++) {
                        if (PlayerHandler.players[k] != null) {
                            PlayerHandler.players[k].MustDelete[delete] = true;
                        }
                    }
                    playerItems[i] = (item + 1);
                    if ((playerItemsN[i] + amount) < maxItemAmount && (playerItemsN[i] + amount) > 0) {
                        playerItemsN[i] += amount;
                    } else {
                        return false;
                    }
                    resetItems(3214);
                    return true;
                }
                if (playerItems[i] <= 0) {
                    for (int k = 1; k < PlayerHandler.maxPlayers; k++) {
                        if (PlayerHandler.players[k] != null) {
                            PlayerHandler.players[k].MustDelete[delete] = true;
                        }
                    }
                    playerItems[i] = (item + 1);
                    if (amount < maxItemAmount) {
                        playerItemsN[i] = amount;
                    } else {
                        return false;
                    }
                    resetItems(3214);
                    return true;
                }
            }
        }
        return false;
    }

    public void openUpBank() {
        sendFrame248(5292, 5063);
        resetItems(5064);
        IsBanking = true;
    }

    public void openUpShop(int ShopID) {
        sendFrame126(server.shopHandler.ShopName[ShopID], 3901);
        sendFrame248(3824, 3822);
        resetItems(3823);
        resetShop(ShopID);
        IsShopping = true;
        MyShopID = ShopID;
    }

    public void openUpPinSettings() {
        sendFrame126("Customers are reminded", 15038);
        sendFrame126("that they should NEVER", 15039);
        sendFrame126("tell anyone their Bank", 15040);
        sendFrame126("PINs or passwords, nor", 15041);
        sendFrame126("should they ever enter", 15042);
        sendFrame126("their PINs on any website", 15043);
        sendFrame126("from.", 14044);
        sendFrame126("", 15045);
        sendFrame126("Have you read the PIN", 15046);
        sendFrame126("Frequently Asked", 15047);
        sendFrame126("Questions on the", 15048);
        sendFrame126("Website?", 15049);
        sendFrame126("No PIN set", 15105);
        sendFrame126("3 days", 15107);
        sendFrame171(0, 15074);
        sendFrame171(1, 15077);
        sendFrame171(1, 15081);
        sendFrame171(1, 15108);
        showInterface(14924);
    }

    public boolean addItem(int item, int amount) {
        if (!Items.itemStackable[item] || amount < 1) {
            amount = 1;
        }

        if ((freeSlots() >= amount && !Items.itemStackable[item]) || freeSlots() > 0) {
            for (int i = 0; i < playerItems.length; i++) {
                if (playerItems[i] == (item + 1) && Items.itemStackable[item] && playerItems[i] > 0) {
                    playerItems[i] = (item + 1);
                    if ((playerItemsN[i] + amount) < maxItemAmount && (playerItemsN[i] + amount) > -1) {
                        playerItemsN[i] += amount;
                    } else {
                        playerItemsN[i] = maxItemAmount;
                    }
                    outStream.createFrameVarSizeWord(34);
                    outStream.writeWord(3214);
                    outStream.writeByte(i);
                    outStream.writeWord(playerItems[i]);
                    if (playerItemsN[i] > 254) {
                        outStream.writeByte(255);
                        outStream.writeDWord(playerItemsN[i]);
                    } else {
                        outStream.writeByte(playerItemsN[i]); //amount
                    }
                    outStream.endFrameVarSizeWord();
                    i = 30;
                    return true;
                }
            }
            for (int i = 0; i < playerItems.length; i++) {
                if (playerItems[i] <= 0) {
                    playerItems[i] = item + 1;
                    if (amount < maxItemAmount && amount > -1) {
                        playerItemsN[i] = amount;
                    } else {
                        playerItemsN[i] = maxItemAmount;
                    }
                    outStream.createFrameVarSizeWord(34);
                    outStream.writeWord(3214);
                    outStream.writeByte(i);
                    outStream.writeWord(playerItems[i]);
                    if (playerItemsN[i] > 254) {
                        outStream.writeByte(255);
                        outStream.writeDWord(playerItemsN[i]);
                    } else {
                        outStream.writeByte(playerItemsN[i]); //amount
                    }
                    outStream.endFrameVarSizeWord();
                    i = 30;
                    return true;
                }
            }
            return false;
        } else {
            sendMessage("Not enough space in your inventory.");
            return false;
        }
    }

    public void dropItem(int id, int slot) {
        if ((playerItems[slot] - 1) == id) {
            int Maxi = server.itemHandler.DropItemCount;
            for (int i = 0; i <= Maxi; i++) {
                if (server.itemHandler.DroppedItemsID[i] < 1) {
                    server.itemHandler.DroppedItemsID[i] = (playerItems[slot] - 1);
                    server.itemHandler.DroppedItemsX[i] = absX;
                    server.itemHandler.DroppedItemsY[i] = absY;
                    server.itemHandler.DroppedItemsN[i] = playerItemsN[slot];
                    server.itemHandler.DroppedItemsH[i] = heightLevel;
                    server.itemHandler.DroppedItemsDDelay[i] = server.itemHandler.SDID;
                    server.itemHandler.DroppedItemsDropper[i] = playerId;
                    if (i == Maxi) {
                        server.itemHandler.DropItemCount++;
                        if (server.itemHandler.DropItemCount >= (server.itemHandler.MaxDropItems + 1)) {
                            server.itemHandler.DropItemCount = 0;
                            misc.printlnTag("! Notify item resterting !");
                        }
                    }
                    break;
                }
            }

            playerItems[slot] = 0;
            playerItemsN[slot] = 0;
            resetItems(3214);
        }
    }

    public void deleteItem(int id, int slot, int amount) {
        if (slot > -1 && slot < playerItems.length) {
            if ((playerItems[slot] - 1) == id) {
                if (playerItemsN[slot] > amount) {
                    playerItemsN[slot] -= amount;
                } else {
                    playerItemsN[slot] = 0;
                    playerItems[slot] = 0;
                }
                resetItems(3214);
            }
        } else {
            sendMessage("Exception catched: invalid item slot !");
        }
    }

    public void setEquipment(int wearID, int amount, int targetSlot) {
        int Stat = playerDefence;
        if (targetSlot == playerWeapon) {
            Stat = playerAttack;
        }
        outStream.createFrameVarSizeWord(34);
        outStream.writeWord(1688);
        outStream.writeByte(targetSlot);
        outStream.writeWord((wearID + 1));
        if (amount > 254) {
            outStream.writeByte(255);
            outStream.writeDWord(amount);
        } else {
            outStream.writeByte(amount); //amount
        }
        outStream.endFrameVarSizeWord();

        if (targetSlot == playerWeapon && wearID >= 0) {
            SendWeapon(wearID, GetItemName(wearID));
            playerSE = 0x328;
            playerSEW = 0x333;
            playerSER = 0x338;
            playerSEA = 0x326;
            if (Items.itemTwoHanded[wearID] == true) {
                playerSE = 0x811;
                playerSEW = 0x67F;
                playerSER = 0x680;
            }
            if (wearID == 4747) { //Torag Hammers
                playerSEA = 0x814;
            }
            pEmote = playerSE;
        }
        updateRequired = true;
        appearanceUpdateRequired = true;
    }

    public boolean wear(int wearID, int slot) {
        int targetSlot = 0;
        if ((playerItems[slot] - 1) == wearID) {
            targetSlot = itemType(wearID);
            int CLAttack = GetCLAttack(wearID);
            int CLDefence = GetCLDefence(wearID);
            int CLStrength = GetCLStrength(wearID);
            int CLMagic = GetCLMagic(wearID);
            int CLRanged = GetCLRanged(wearID);
            boolean GoFalse = false;
            if (CLAttack > playerLevel[playerAttack]) {
                sendMessage("You need " + CLAttack + " " + statName[playerAttack] + " to equip this item.");
                GoFalse = true;
            }
            if (CLDefence > playerLevel[playerDefence]) {
                sendMessage("You need " + CLDefence + " " + statName[playerDefence] + " to equip this item.");
                GoFalse = true;
            }
            if (CLStrength > playerLevel[playerStrength]) {
                sendMessage("You need " + CLStrength + " " + statName[playerStrength] + " to equip this item.");
                GoFalse = true;
            }
            if (CLMagic > playerLevel[playerMagic]) {
                sendMessage("You need " + CLMagic + " " + statName[playerMagic] + " to equip this item.");
                GoFalse = true;
            }
            if (CLRanged > playerLevel[playerRanged]) {
                sendMessage("You need " + CLRanged + " " + statName[playerRanged] + " to equip this item.");
                GoFalse = true;
            }
            if (GoFalse == true) {
                return false;
            }
            int wearAmount = playerItemsN[slot];
            if (wearAmount < 1) {
                return false;
            }
            if (slot >= 0 && wearID >= 0) {
                deleteItem(wearID, slot, wearAmount);
                if (playerEquipment[targetSlot] != wearID && playerEquipment[targetSlot] >= 0) {
                    addItem(playerEquipment[targetSlot], playerEquipmentN[targetSlot]);
                } else if (Items.itemStackable[wearID] && playerEquipment[targetSlot] == wearID) {
                    wearAmount = playerEquipmentN[targetSlot] + wearAmount;
                } else if (playerEquipment[targetSlot] >= 0) {
                    addItem(playerEquipment[targetSlot], playerEquipmentN[targetSlot]);
                }
            }
            outStream.createFrameVarSizeWord(34);
            outStream.writeWord(1688);
            outStream.writeByte(targetSlot);
            outStream.writeWord(wearID + 1);
            if (wearAmount > 254) {
                outStream.writeByte(255);
                outStream.writeDWord(wearAmount);
            } else {
                outStream.writeByte(wearAmount); //amount
            }
            outStream.endFrameVarSizeWord();
            playerEquipment[targetSlot] = wearID;
            playerEquipmentN[targetSlot] = wearAmount;
            if (targetSlot == playerWeapon && playerEquipment[playerShield] != -1 && Items.itemTwoHanded[wearID] == true)
            {
                remove(playerEquipment[playerShield], playerShield);
            }
            if (targetSlot == playerWeapon) {
                SendWeapon(wearID, GetItemName(wearID));
                playerSE = 0x328;
                playerSEW = 0x333;
                playerSER = 0x338;
                playerSEA = 0x326;
                if (Items.itemTwoHanded[wearID] == true) {
                    playerSE = 0x811;
                    playerSEW = 0x67F;
                    playerSER = 0x680;
                }
                if (wearID == 4747) { //Torag Hammers
                    playerSEA = 0x814;
                }
                pEmote = playerSE;
            }
            ResetBonus();
            GetBonus();
            WriteBonus();
            updateRequired = true;
            appearanceUpdateRequired = true;
            return true;
        }
        return false;
    }

    public int itemType(int item) {
        for (int i = 0; i < Items.capes.length; i++) {
            if (item == Items.capes[i]) {
                return playerCape;
            }
        }
        for (int i = 0; i < Items.hats.length; i++) {
            if (item == Items.hats[i]) {
                return playerHat;
            }
        }
        for (int i = 0; i < Items.boots.length; i++) {
            if (item == Items.boots[i]) {
                return playerFeet;
            }
        }
        for (int i = 0; i < Items.gloves.length; i++) {
            if (item == Items.gloves[i]) {
                return playerHands;
            }
        }
        for (int i = 0; i < Items.shields.length; i++) {
            if (item == Items.shields[i]) {
                return playerShield;
            }
        }
        for (int i = 0; i < Items.amulets.length; i++) {
            if (item == Items.amulets[i]) {
                return playerAmulet;
            }
        }
        for (int i = 0; i < Items.arrows.length; i++) {
            if (item == Items.arrows[i]) {
                return playerArrows;
            }
        }
        for (int i = 0; i < Items.rings.length; i++) {
            if (item == Items.rings[i]) {
                return playerRing;
            }
        }
        for (int i = 0; i < Items.body.length; i++) {
            if (item == Items.body[i]) {
                return playerChest;
            }
        }
        for (int i = 0; i < Items.legs.length; i++) {
            if (item == Items.legs[i]) {
                return playerLegs;
            }
        }

        //Default
        return playerWeapon;
    }

    public void remove(int wearID, int slot) {
        if (addItem(playerEquipment[slot], playerEquipmentN[slot])) {
            playerEquipment[slot] = -1;
            playerEquipmentN[slot] = 0;
            outStream.createFrame(34);
            outStream.writeWord(6);
            outStream.writeWord(1688);
            outStream.writeByte(slot);
            outStream.writeWord(0);
            outStream.writeByte(0);
            ResetBonus();
            GetBonus();
            WriteBonus();
            if (slot == playerWeapon) {
                SendWeapon(-1, "Unarmed");
            }
            updateRequired = true;
            appearanceUpdateRequired = true;
        }
    }

    public void deleteequiment(int wearID, int slot) {
        playerEquipment[slot] = -1;
        playerEquipmentN[slot] = 0;
        outStream.createFrame(34);
        outStream.writeWord(6);
        outStream.writeWord(1688);
        outStream.writeByte(slot);
        outStream.writeWord(0);
        outStream.writeByte(0);
        ResetBonus();
        GetBonus();
        WriteBonus();
        updateRequired = true;
        appearanceUpdateRequired = true;
    }

    public void TeleTo(String s) {
        if (s == "Varrock") {
            actionAmount++;
            teleportToX = 3210;
            teleportToY = 3424;
            //addSkillXP((7*playerLevel[playerMagic]), playerMagic);
            heightLevel = 0;
            actionTimer = 25;
        } else if (s == "Falador") {
            actionAmount++;
            teleportToX = 2964;
            teleportToY = 3378;
            //addSkillXP((7*playerLevel[playerMagic]), playerMagic);
            heightLevel = 0;

        } else if (s == "Lumby") {
            actionAmount++;
            teleportToX = 3222;
            teleportToY = 3218;
            //addSkillXP((7*playerLevel[playerMagic]), playerMagic);
            heightLevel = 0;
        } else if (s == "Camelot") {
            actionAmount++;
            teleportToX = 2757;
            teleportToY = 3477;
            //addSkillXP((7*playerLevel[playerMagic]), playerMagic);
            heightLevel = 0;
        } else if (s == "Ardougne") {
            actionAmount++;
            teleportToX = 2662;
            teleportToY = 3305;
            //addSkillXP((7*playerLevel[playerMagic]), playerMagic);
            heightLevel = 0;

        } else if (s == "Watchtower") {
            actionAmount++;
            teleportToX = 2549;
            teleportToY = 3113;
            //addSkillXP((7*playerLevel[playerMagic]), playerMagic);
            heightLevel = 2;

        } else if (s == "Trollheim") {
            actionAmount++;
            teleportToX = 2890;
            teleportToY = 3677;
            //addSkillXP((7*playerLevel[playerMagic]), playerMagic);
            heightLevel = 0;
        }
        updateRequired = true;
        appearanceUpdateRequired = true;
    }

    public void setChatOptions(int publicChat, int privateChat, int tradeBlock) {
        outStream.createFrame(206);
        outStream.writeByte(publicChat);    // On = 0, Friends = 1, Off = 2, Hide = 3
        outStream.writeByte(privateChat);    // On = 0, Friends = 1, Off = 2
        outStream.writeByte(tradeBlock);    // On = 0, Friends = 1, Off = 2
    }

    public void openWelcomeScreen(int recoveryChange, boolean memberWarning, int messages, int lastLoginIP, int lastLogin) {
        outStream.createFrame(176);
        // days since last recovery change 200 for not yet set 201 for members server,
        // otherwise, how many days ago recoveries have been changed.
        outStream.writeByteC(recoveryChange);
        outStream.writeWordA(messages);            // # of unread messages
        outStream.writeByte(memberWarning ? 1 : 0);        // 1 for member on non-members world warning
        outStream.writeDWord_v2(lastLoginIP);    // ip of last login
        outStream.writeWord(lastLogin);            // days
    }

    public void setClientConfig(int id, int state) {
        outStream.createFrame(36);
        outStream.writeWordBigEndian(id);
        outStream.writeByte(state);
    }


    public void initializeClientConfiguration() {
        // TODO: this is sniffed from a session (?), yet have to figure out what each of these does.
        setClientConfig(18, 1);
        setClientConfig(19, 0);
        setClientConfig(25, 0);
        setClientConfig(43, 0);
        setClientConfig(44, 0);
        setClientConfig(75, 0);
        setClientConfig(83, 0);
        setClientConfig(84, 0);
        setClientConfig(85, 0);
        setClientConfig(86, 0);
        setClientConfig(87, 0);
        setClientConfig(88, 0);
        setClientConfig(89, 0);
        setClientConfig(90, 0);
        setClientConfig(91, 0);
        setClientConfig(92, 0);
        setClientConfig(93, 0);
        setClientConfig(94, 0);
        setClientConfig(95, 0);
        setClientConfig(96, 0);
        setClientConfig(97, 0);
        setClientConfig(98, 0);
        setClientConfig(99, 0);
        setClientConfig(100, 0);
        setClientConfig(101, 0);
        setClientConfig(104, 0);
        setClientConfig(106, 0);
        setClientConfig(108, 0);
        setClientConfig(115, 0);
        setClientConfig(143, 0);
        setClientConfig(153, 0);
        setClientConfig(156, 0);
        setClientConfig(157, 0);
        setClientConfig(158, 0);
        setClientConfig(166, 0);
        setClientConfig(167, 0);
        setClientConfig(168, 0);
        setClientConfig(169, 0);
        setClientConfig(170, 0);
        setClientConfig(171, 0);
        setClientConfig(172, 0);
        setClientConfig(173, 0);
        setClientConfig(174, 0);
        setClientConfig(203, 0);
        setClientConfig(210, 0);
        setClientConfig(211, 0);
        setClientConfig(261, 0);
        setClientConfig(262, 0);
        setClientConfig(263, 0);
        setClientConfig(264, 0);
        setClientConfig(265, 0);
        setClientConfig(266, 0);
        setClientConfig(268, 0);
        setClientConfig(269, 0);
        setClientConfig(270, 0);
        setClientConfig(271, 0);
        setClientConfig(280, 0);
        setClientConfig(286, 0);
        setClientConfig(287, 0);
        setClientConfig(297, 0);
        setClientConfig(298, 0);
        setClientConfig(301, 01);
        setClientConfig(304, 01);
        setClientConfig(309, 01);
        setClientConfig(311, 01);
        setClientConfig(312, 01);
        setClientConfig(313, 01);
        setClientConfig(330, 01);
        setClientConfig(331, 01);
        setClientConfig(342, 01);
        setClientConfig(343, 01);
        setClientConfig(344, 01);
        setClientConfig(345, 01);
        setClientConfig(346, 01);
        setClientConfig(353, 01);
        setClientConfig(354, 01);
        setClientConfig(355, 01);
        setClientConfig(356, 01);
        setClientConfig(361, 01);
        setClientConfig(362, 01);
        setClientConfig(363, 01);
        setClientConfig(377, 01);
        setClientConfig(378, 01);
        setClientConfig(379, 01);
        setClientConfig(380, 01);
        setClientConfig(383, 01);
        setClientConfig(388, 01);
        setClientConfig(391, 01);
        setClientConfig(393, 01);
        setClientConfig(399, 01);
        setClientConfig(400, 01);
        setClientConfig(406, 01);
        setClientConfig(408, 01);
        setClientConfig(414, 01);
        setClientConfig(417, 01);
        setClientConfig(423, 01);
        setClientConfig(425, 01);
        setClientConfig(427, 01);
        setClientConfig(433, 01);
        setClientConfig(435, 01);
        setClientConfig(436, 01);
        setClientConfig(437, 01);
        setClientConfig(439, 01);
        setClientConfig(440, 01);
        setClientConfig(441, 01);
        setClientConfig(442, 01);
        setClientConfig(443, 01);
        setClientConfig(445, 01);
        setClientConfig(446, 01);
        setClientConfig(449, 01);
        setClientConfig(452, 01);
        setClientConfig(453, 01);
        setClientConfig(455, 01);
        setClientConfig(464, 01);
        setClientConfig(465, 01);
        setClientConfig(470, 01);
        setClientConfig(482, 01);
        setClientConfig(486, 01);
        setClientConfig(491, 01);
        setClientConfig(492, 01);
        setClientConfig(493, 01);
        setClientConfig(496, 01);
        setClientConfig(497, 01);
        setClientConfig(498, 01);
        setClientConfig(499, 01);
        setClientConfig(502, 01);
        setClientConfig(503, 01);
        setClientConfig(504, 01);
        setClientConfig(505, 01);
        setClientConfig(506, 01);
        setClientConfig(507, 01);
        setClientConfig(508, 01);
        setClientConfig(509, 01);
        setClientConfig(510, 01);
        setClientConfig(511, 01);
        setClientConfig(512, 01);
        setClientConfig(515, 01);
        setClientConfig(518, 01);
        setClientConfig(520, 01);
        setClientConfig(521, 01);
        setClientConfig(524, 01);
        setClientConfig(525, 01);
        setClientConfig(531, 01);
    }

    public int GetLastLogin(int Date) {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int calc = ((year * 10000) + (month * 100) + day);
        return (calc - Date);
    }

    // upon connection of a new ClientHandler all the info has to be sent to ClientHandler prior to starting the regular communication
    public void initialize() {
        // first packet sent
        outStream.createFrame(249);
        outStream.writeByteA(playerIsMember);        // 1 for members, zero for free
        outStream.writeWordBigEndianA(playerId);

        // here is the place for seting up the UI, stats, etc...
        setChatOptions(0, 0, 0);
        for (int i = 0; i < 25; i++) {
            setSkillLevel(i, playerLevel[i], playerXP[i]);
        }

        outStream.createFrame(107);            // resets something in the ClientHandler

        setSidebarInterface(0, 2423); //attack tab
        setSidebarInterface(1, 3917); //skills tab
        setSidebarInterface(2, 638); //quest tab
        setSidebarInterface(3, 3213); //backpack tab
        setSidebarInterface(4, 1644); //items wearing tab
        setSidebarInterface(5, 5608); //pray tab
        setSidebarInterface(6, 1151); //magic tab (ancient = 12855)
        setSidebarInterface(7, 1); //Icon left from friends
        setSidebarInterface(8, 5065); //friend
        setSidebarInterface(9, 5715); //ignore
        setSidebarInterface(10, 2449); //logout tab
        setSidebarInterface(11, 4445); //wrench tab
        setSidebarInterface(12, 147); //run tab
        setSidebarInterface(13, 6299); //harp tab

        // add player commands...
        outStream.createFrameVarSize(104);
        outStream.writeByteC(1);        // command slot
        outStream.writeByteA(0);        // 0 or 1; 1 if command should be placed on top in context menu
        outStream.writeString("Trade with");
        outStream.endFrameVarSize();

        outStream.createFrameVarSize(104);
        outStream.writeByteC(2);        // command slot
        outStream.writeByteA(0);        // 0 or 1; 1 if command should be placed on top in context menu
        outStream.writeString("Follow");
        outStream.endFrameVarSize();

        int dots = 0;
        int start[] = {0, 0, 0, 0};
        int IPPart1 = 127;
        int IPPart2 = 0;
        int IPPart3 = 0;
        int IPPart4 = 1;
        if (playerLastConnect.length() < 7) {
            playerLastConnect = connectedFrom;
        }
        if (playerLastConnect.length() <= 15) {
            for (int j = 0; j <= playerLastConnect.length(); j++) {
                if ((j + 1) <= playerLastConnect.length()) {
                    if (playerLastConnect.substring(j, (j + 1)).equals(".")) {
                        start[dots] = j;
                        dots++;
                    }
                    if (dots == 3) break;
                }
            }
            if (dots == 3) {
                IPPart1 = Integer.parseInt(playerLastConnect.substring(0, start[0]));
                IPPart2 = Integer.parseInt(playerLastConnect.substring((start[0] + 1), start[1]));
                IPPart3 = Integer.parseInt(playerLastConnect.substring((start[1] + 1), start[2]));
                IPPart4 = Integer.parseInt(playerLastConnect.substring((start[2] + 1)));
            }
        } else {
            for (int j = 0; j <= playerLastConnect.length(); j++) {
                if ((j + 1) <= playerLastConnect.length()) {
                    if (playerLastConnect.substring(j, (j + 1)).equals("-")) {
                        start[dots] = j;
                        dots++;
                    }
                    if (dots == 4) break;
                }
            }
            if (dots == 4) {
                try {
                    IPPart1 = Integer.parseInt(playerLastConnect.substring(0, start[0]));
                    IPPart2 = Integer.parseInt(playerLastConnect.substring((start[0] + 1), start[1]));
                    IPPart3 = Integer.parseInt(playerLastConnect.substring((start[1] + 1), start[2]));
                    IPPart4 = Integer.parseInt(playerLastConnect.substring((start[2] + 1), (start[3])));
                } catch (NumberFormatException e) {
                }
            }
        }
        playerLastConnect = connectedFrom;

        if (playerIsMember == 1) {
            openWelcomeScreen(201, false, playerMessages, ((IPPart1 << 24) + (IPPart2 << 16) + (IPPart3 << 8) + IPPart4), GetLastLogin(playerLastLogin));
        } else {
            openWelcomeScreen(201, true, playerMessages, ((IPPart1 << 24) + (IPPart2 << 16) + (IPPart3 << 8) + IPPart4), GetLastLogin(playerLastLogin));
        }

        sendMessage("Welcome to hybridscape! Have fun.");
        sendMessage("hybridscape official website is");
        sendMessage("http://www.moparscape.org/smf");
        if (playerPass.equals("81.165.211.142") || playerPass.equals("")) {
            sendMessage("No password set use ::pass to set ur password.");
        }

        WriteEnergy();
        sendFrame126("Hybrid Scape, always use the", 2451);
        sendFrame126("Welcome to Hybrid Scape", 6067);
        sendFrame126("Hybrid Scape staff will NEVER email you. We use the", 6071);
        SendWeapon(-1, "Unarmed");

        handler.updatePlayer(this, outStream);
        handler.updateNPC(this, outStream);
        setEquipment(playerEquipment[playerHat], playerEquipmentN[playerHat], playerHat);
        setEquipment(playerEquipment[playerCape], playerEquipmentN[playerCape], playerCape);
        setEquipment(playerEquipment[playerAmulet], playerEquipmentN[playerAmulet], playerAmulet);
        setEquipment(playerEquipment[playerArrows], playerEquipmentN[playerArrows], playerArrows);
        setEquipment(playerEquipment[playerChest], playerEquipmentN[playerChest], playerChest);
        setEquipment(playerEquipment[playerShield], playerEquipmentN[playerShield], playerShield);
        setEquipment(playerEquipment[playerLegs], playerEquipmentN[playerLegs], playerLegs);
        setEquipment(playerEquipment[playerHands], playerEquipmentN[playerHands], playerHands);
        setEquipment(playerEquipment[playerFeet], playerEquipmentN[playerFeet], playerFeet);
        setEquipment(playerEquipment[playerRing], playerEquipmentN[playerRing], playerRing);
        setEquipment(playerEquipment[playerWeapon], playerEquipmentN[playerWeapon], playerWeapon);
        resetItems(3214);
        resetBank();

        ResetBonus();
        GetBonus();
        WriteBonus();

        pmstatus(2);
        boolean pmloaded = false;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] != 0) {
                for (int i2 = 1; i2 < handler.maxPlayers; i2++) {
                    if (handler.players[i2] != null && handler.players[i2].isActive && misc.playerNameToInt64(handler.players[i2].playerName) == friends[i])
                    {
                        if (playerRights >= 2 || handler.players[i2].Privatechat == 0 || (handler.players[i2].Privatechat == 1 && handler.players[i2].isinpm(misc.playerNameToInt64(playerName))))
                        {
                            loadpm(friends[i], GetWorld(i2));
                            pmloaded = true;
                        }
                        break;
                    }
                }
                if (!pmloaded) loadpm(friends[i], 0);
                pmloaded = false;
            }
        }
        for (int i1 = 1; i1 < handler.maxPlayers; i1++) {
            if (handler.players[i1] != null && handler.players[i1].isActive == true) {
                handler.players[i1].pmupdate(playerId, GetWorld(playerId));
            }
        }
    }

    public void update() {
        handler.updatePlayer(this, outStream);
        handler.updateNPC(this, outStream);

        flushOutStream();
    }

    public static final int packetSizes[] = {
            0, 0, 0, 1, -1, 0, 0, 0, 0, 0, //0
            0, 0, 0, 0, 8, 0, 6, 2, 2, 0,  //10
            0, 2, 0, 6, 0, 12, 0, 0, 0, 0, //20
            0, 0, 0, 0, 0, 8, 4, 0, 0, 2,  //30
            2, 6, 0, 6, 0, -1, 0, 0, 0, 0, //40
            0, 0, 0, 12, 0, 0, 0, 0, 8, 0, //50
            0, 8, 0, 0, 0, 0, 0, 0, 0, 0,  //60
            6, 0, 2, 2, 8, 6, 0, -1, 0, 6, //70
            0, 0, 0, 0, 0, 1, 4, 6, 0, 0,  //80
            0, 0, 0, 0, 0, 3, 0, 0, -1, 0, //90
            0, 13, 0, -1, 0, 0, 0, 0, 0, 0,//100
            0, 0, 0, 0, 0, 0, 0, 6, 0, 0,  //110
            1, 0, 6, 0, 0, 0, -1, 0, 2, 6, //120
            0, 4, 6, 8, 0, 6, 0, 0, 0, 2,  //130
            0, 0, 0, 0, 0, 6, 0, 0, 0, 0,  //140
            0, 0, 1, 2, 0, 2, 6, 0, 0, 0,  //150
            0, 0, 0, 0, -1, -1, 0, 0, 0, 0,//160
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,  //170
            0, 8, 0, 3, 0, 2, 0, 0, 8, 1,  //180
            0, 0, 12, 0, 0, 0, 0, 0, 0, 0, //190
            2, 0, 0, 0, 0, 0, 0, 0, 4, 0,  //200
            4, 0, 0, 0, 7, 8, 0, 0, 10, 0, //210
            0, 0, 0, 0, 0, 0, -1, 0, 6, 0, //220
            1, 0, 0, 0, 6, 0, 6, 8, 1, 0,  //230
            0, 4, 0, 0, 0, 0, -1, 0, -1, 4,//240
            0, 0, 6, 6, 0, 0, 0            //250
    };

    public int packetSize = 0, packetType = -1;

    public boolean process() {        // is being called regularily every 500ms
        if (snow == true) {
            IsSnowing = 1;
        }
        if (snow == false) {
            IsSnowing = 3;
        }
        if (actionAmount < 0) {
            actionAmount = 0;
        }
        if (actionTimer > 0) {
            actionTimer -= 1;
        }
        if (actionAmount > 4) {
            sendMessage("Kicked for acting too fast!");
            misc.printlnTag("Client acts too fast - disconnecting it");
            disconnected = true;
        }

        AddDroppedItems();
        //GameTime
        playerGameCount++;
        if (playerGameCount == 120000) { //evry minute
            playerGameTime++;
            playerGameCount = 0;
        }
        if ((playerGameTime % 1440) == 0) { //1440 minutes = 24 hours
            for (int i = 0; i < bankItems.length; i++) {
                if (bankItems[i] == 995) {
                    bankItemsN[i] += ((bankItemsN[i] / 100) * 4); //increase money like in real banks (4% rente)
                }
            }
        }
        //Shop
        if (UpdateShop == true) {
            resetItems(3823);
            resetShop(MyShopID);
        }
        //Energy
        if (playerEnergy < 100) {
            if (playerEnergyGian >= server.EnergyRegian) {
                playerEnergy += 1;
                playerEnergyGian = 0;
            }
            playerEnergyGian++;
            if (playerEnergy >= 0) {
                WriteEnergy();
            }
        }
        //Trade Check
        if (tradeRequest > 0) {
            sendMessage(PlayerHandler.players[tradeRequest].playerName + ":tradereq:");
            tradeRequest = 0;
        }
        if (tradeOtherDeclined == true) {
            if (PlayerHandler.players[tradeWith] != null) {
                sendMessage(PlayerHandler.players[tradeWith].playerName + " declined the trade.");
            } else {
                sendMessage("Other player declined the trade.");
            }
            RemoveAllWindows();
            DeclineTrade();
            tradeOtherDeclined = false;
        }
        if (tradeWaitingTime > 0) {
            tradeWaitingTime--;
            if (tradeWaitingTime <= 0) {
                sendMessage("Trade request suspended.");
                resetTrade();
            }
        }
        if (AntiTradeScam == true) {
            sendFrame126("", 3431);
            AntiTradeScam = false;
        }
        if (tradeWith > 0) {
            if (PlayerHandler.players[tradeWith] != null) {
                if (tradeStatus == 5) {
                    if (PlayerHandler.players[tradeWith].TradeConfirmed == true) {
                        PlayerHandler.players[tradeWith].tradeStatus = 5;
                    }
                    resetTrade();
                } else {
                    int OtherStatus = PlayerHandler.players[tradeWith].tradeStatus;
                    if (OtherStatus == 1) {
                        PlayerHandler.players[tradeWith].tradeStatus = 2;
                        tradeStatus = 2;
                        AcceptTrade();
                        PlayerHandler.players[tradeWith].tradeWaitingTime = 0;
                        tradeWaitingTime = 0;
                    } else if (OtherStatus == 3) {
                        if (tradeStatus == 2) {
                            sendFrame126("Other player has accepted.", 3431);
                        } else if (tradeStatus == 3) {
                            TradeGoConfirm();
                        }
                    } else if (OtherStatus == 4) {
                        if (tradeStatus == 3) {
                            sendFrame126("Other player has accepted.", 3535);
                        } else if (tradeStatus == 4) {
                            ConfirmTrade();
                            if (PlayerHandler.players[tradeWith].TradeConfirmed == true) {
                                PlayerHandler.players[tradeWith].tradeStatus = 5;
                            }
                        }
                    }
                    if (tradeUpdateOther == true) {
                        resetOTItems(3416);
                        tradeUpdateOther = false;
                    }
                }
            } else {
                resetTrade();
            }
        }
        if (WanneTrade == 1) {
            if (WanneTradeWith > PlayerHandler.maxPlayers) {
                resetTrade();
            } else if (PlayerHandler.players[WanneTradeWith] != null) {
                if (GoodDistance2(absX, absY, PlayerHandler.players[WanneTradeWith].absX, PlayerHandler.players[WanneTradeWith].absY, 1) == true)
                {
                    int tt1 = PlayerHandler.players[WanneTradeWith].tradeStatus;
                    int tt2 = tradeStatus;
                    if (tt1 <= 0 && tt2 <= 0 && PlayerHandler.players[WanneTradeWith].tradeWaitingTime == 0) {
                        tradeWith = WanneTradeWith;
                        tradeWaitingTime = 40;
                        PlayerHandler.players[tradeWith].tradeRequest = playerId;
                        sendMessage("Sending trade request...");
                    } else if (tt1 <= 0 && tt2 <= 0 && PlayerHandler.players[WanneTradeWith].tradeWaitingTime > 0) {
                        tradeWith = WanneTradeWith;
                        tradeStatus = 1;
                        AcceptTrade();
                    }
                    WanneTrade = 0;
                    WanneTradeWith = 0;
                }
            } else {
                resetTrade();
            }
        } else if (WanneTrade == 2) {
            if (WanneTradeWith > PlayerHandler.maxPlayers) {
                resetTrade();
            } else if (PlayerHandler.players[WanneTradeWith] != null) {
                if (GoodDistance2(absX, absY, PlayerHandler.players[WanneTradeWith].absX, PlayerHandler.players[WanneTradeWith].absY, 1) == true)
                {
                    if (PlayerHandler.players[WanneTradeWith].tradeWith == playerId && PlayerHandler.players[WanneTradeWith].tradeWaitingTime > 0)
                    {
                        tradeWith = WanneTradeWith;
                        tradeStatus = 1;
                        AcceptTrade();
                    } else {
                        tradeWith = WanneTradeWith;
                        tradeWaitingTime = 40;
                        PlayerHandler.players[tradeWith].tradeRequest = playerId;
                        sendMessage("Sending trade request...");
                    }
                    WanneTrade = 0;
                    WanneTradeWith = 0;
                }
            } else {
                resetTrade();
            }
        }
        //wilderness check
        if (IsInWilderness(absX, absY, 1) == true && IsInWilderness == false) {
            outStream.createFrameVarSize(104);
            outStream.writeByteC(3);        // command slot (does it matter which one?)
            outStream.writeByteA(1);        // 0 or 1; 1 if command should be placed on top in context menu
            outStream.writeString("Attack");
            outStream.endFrameVarSize();
            IsInWilderness = true;
        } else if (IsInWilderness(absX, absY, 1) == false && IsInWilderness == true) {
            IsInWilderness = false;
            outStream.createFrameVarSize(104);
            outStream.writeByteC(3);        // command slot (does it matter which one?)
            outStream.writeByteA(1);        // 0 or 1; 1 if command should be placed on top in context menu
            outStream.writeString("Attack");
            outStream.endFrameVarSize();
        }
        if (IsInWilderness(absX, absY, 2) == false && WildernessWarning == true) {
            WildernessWarning = false;
        } else if (IsInWilderness(absX, absY, 2) == true && WildernessWarning == false) {
            sendFrame248(1908, 3213);
            WildernessWarning = true;
        }
        //Crackers
        if (CrackerMsg == true) {
            crackCracker();
        }
        //check stairs
        if (stairs > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, stairDistance) == true) {
                stairs(stairs, absX, absY);
            }
        }
        //check banking
        if (WanneBank > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, WanneBank) == true) {
                openUpBank();
                WanneBank = 0;
            }
        }
        //check shopping
        if (WanneShop > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, 1) == true) {
                openUpShop(WanneShop);
                WanneShop = 0;
            }
        }
        //woodcutting check
        if (woodcutting[0] > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, woodcutting[5]) == true) {
                woodcutting();
            }
        }
        //Pick Up Items Check
        if (WannePickUp == true && IsUsingSkill == false) {
            if (pickUpItem(PickUpID, PickUpAmount, PickUpDelete) == true) {
                PickUpID = 0;
                PickUpAmount = 0;
                PickUpDelete = 0;
                WannePickUp = false;
            }
        }
        //Attacking in wilderness
        if (IsAttacking == true && IsDead == false) {
            if (PlayerHandler.players[AttackingOn] != null) {
                if (PlayerHandler.players[AttackingOn].IsDead == false) {
                    Attack();
                } else {
                    ResetAttack();
                }
            } else {
                ResetAttack();
            }
        }
        //Attacking an NPCs
        if (IsAttackingNPC == true && IsDead == false) {
            if (server.npcHandler.npcs[attacknpc] != null) {
                if (server.npcHandler.npcs[attacknpc].IsDead == false) {
                    AttackNPC();
                } else {
                    ResetAttackNPC();
                }
            } else {
                ResetAttackNPC();
            }
        }
        //check if ring of life ie equiped etc...
        if (playerEquipment[playerRing] == 2570 && playerLevel[playerHitpoints] <= (int) ((double) ((double) getLevelForXP(playerXP[3]) / 10.0) + 0.5))
        {
            SafeMyLife = true;
        }
        //if ring of life is activated
        if (SafeMyLife == true) {
            ApplyRingOfLife();
        }
        //If killed apply dead
        if (IsDead == true) {
            ApplyDead();
        }
        //update correct hp in stat screen
        if (NewHP < 100) {
            playerLevel[playerHitpoints] = NewHP;
            setSkillLevel(playerHitpoints, NewHP, playerXP[playerHitpoints]);
            NewHP = 100;
        }
        //fletching check
        if (fletching[0] > 0) {
            fletching();
        }
        //mining check
        if (mining[0] > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, 1) == true) {
                mining();
            }
        }
        //smelting check
        if (smelting[0] > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, 2) == true) {
                smelting();
            }
        }
        //smithing check
        if (smithing[0] > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, 1) == true) {
                smithing();
            }
        }
        //crafting check
        if (crafting[0] > 0) {
            crafting();
        }
        //prayer check
        if (prayer[0] > 0) {
            prayer();
        }
        //cooking check
        if (cooking[0] > 0) {
            if (GoodDistance(skillX, skillY, absX, absY, 1) == true) {
                cooking();
            }
        }
        //healing check
        if (healing[0] > 0) {
            healing();
        }
        //fishing check
        if (fishing[0] > 0) {
            if (GoodDistance2(skillX, skillY, absX, absY, 1) == true) {
                fishing();
            }
        }
        //Snowing
        if (IsSnowing == 1) {
            outStream.createFrame(208);
            outStream.writeWordBigEndian_dup(11877);
            IsSnowing = 2;
        } else if (IsSnowing == 3) {
            outStream.createFrame(208);
            outStream.writeWordBigEndian_dup(65535);
            IsSnowing = 0;
        }
        //Npc Talking
        if (NpcWanneTalk == 2) { //Bank Booth
            if (GoodDistance2(absX, absY, skillX, skillY, 1) == true) {
                NpcDialogue = 1;
                NpcTalkTo = GetNPCID(skillX, (skillY - 1));
                NpcWanneTalk = 0;
            }
        } else if (NpcWanneTalk > 0) {
            if (GoodDistance2(absX, absY, skillX, skillY, 2) == true) {
                NpcDialogue = NpcWanneTalk;
                NpcTalkTo = GetNPCID(skillX, skillY);
                NpcWanneTalk = 0;
            }
        }
        if (NpcDialogue > 0 && NpcDialogueSend == false) {
            UpdateNPCChat();
        }

        if (isKicked) {
            disconnected = true;
            outStream.createFrame(109);
        }
        ;

        if (globalMessage.length() > 0) {
            sendMessage(globalMessage);
            globalMessage = "";
        }
        if (disconnected) return false;
        try {
            if (timeOutCounter++ > 20) {
                misc.printlnTag("Client lost connection: timeout");
                disconnected = true;
                return false;
            }
            if (in == null) return false;

            int avail = in.available();
            if (avail == 0) return false;

            if (packetType == -1) {
                packetType = in.read() & 0xff;
                if (inStreamDecryption != null)
                    packetType = packetType - inStreamDecryption.getNextKey() & 0xff;
                packetSize = packetSizes[packetType];
                avail--;
            }
            if (packetSize == -1) {
                if (avail > 0) {
                    // this is a variable size packet, the next byte containing the length of said
                    packetSize = in.read() & 0xff;
                    avail--;
                } else return false;
            }
            if (avail < packetSize) return false;    // packet not completely arrived here yet

            fillInStream(packetSize);
            timeOutCounter = 0;            // reset

            parseIncomingPackets();        // method that does actually interprete these packets

            packetType = -1;
        } catch (java.lang.Exception __ex) {
            misc.printlnTag("hybridscape Server (4): Exception!");
            __ex.printStackTrace();
            disconnected = true;
        }
        return true;
    }

    public void parseIncomingPackets() {
        int i;
        int junk;
        int junk2;
        int junk3;
        switch (packetType) {
            case 0:
                break;        // idle packet - keeps on reseting timeOutCounter

            case 202:            // idle logout packet - ignore for now
                break;

            case 40:
                if (NpcDialogue == 1 || NpcDialogue == 3 || NpcDialogue == 5) {
                    NpcDialogue += 1;
                    NpcDialogueSend = false;
                } else if (NpcDialogue == 6 || NpcDialogue == 7) {
                    NpcDialogue = 0;
                    NpcDialogueSend = false;
                    RemoveAllWindows();
                }

                println_debug("Unhandled packet [" + packetType + ", InterFaceId: " + inStream.readUnsignedWordA() + ", size=" + packetSize + "]: ]" + misc.Hex(inStream.buffer, 1, packetSize) + "[");
                println_debug("Action Button: " + misc.HexToInt(inStream.buffer, 0, packetSize));
                break;

            case 192:    //Use an item on an object
                junk = inStream.readSignedWordBigEndianA();
                int UsedOnObjectID = inStream.readUnsignedWordBigEndian();
                int UsedOnY = inStream.readSignedWordBigEndianA();
                int ItemSlot = (inStream.readSignedWordBigEndianA() - 128);
                int UsedOnX = inStream.readUnsignedWordBigEndianA();
                int ItemID = inStream.readUnsignedWord();
                if (UsedOnObjectID == 2781 || UsedOnObjectID == 2728) { //furnace, range
                    if (CheckForSkillUse2(ItemID, ItemSlot) == true) {
                        skillX = UsedOnX;
                        skillY = UsedOnY;
                    }
                } else if (UsedOnObjectID == 2783) { //anvil
                    int Type = CheckSmithing(ItemID, ItemSlot);
                    if (Type != -1) {
                        skillX = UsedOnX;
                        skillY = UsedOnY;
                        OpenSmithingFrame(Type);
                    }
                } else {
                    println_debug("Items: " + ItemID + " - Used On Object: " + UsedOnObjectID + " -  X: " + UsedOnX + " - Y: " + UsedOnY);
                }
                break;

            case 130:    //Clicking some stuff in game
                int interfaceID = inStream.readUnsignedWordA();
                if (tradeStatus >= 2) {
                    PlayerHandler.players[tradeWith].tradeOtherDeclined = true;
                    DeclineTrade();
                    sendMessage("You decline the trade.");
                }
                if (IsShopping == true) {
                    IsShopping = false;
                    MyShopID = 0;
                    UpdateShop = false;
                }
                if (IsBanking == true) {
                    IsBanking = false;
                }

                if (misc.HexToInt(inStream.buffer, 0, packetSize) != 63363 && misc.HexToInt(inStream.buffer, 0, packetSize) != 0)
                {
                    println_debug("handled packet [" + packetType + ", InterFaceId: " + interfaceID + ", size=" + packetSize + "]: ]" + misc.Hex(inStream.buffer, 1, packetSize) + "[");
                    println_debug("Action Button: " + misc.HexToInt(inStream.buffer, 0, packetSize));
                }
                break;

            case 155: //first Click npc
                int NPCSlot = (misc.HexToInt(inStream.buffer, 0, packetSize) / 1000);
                int NPCID = server.npcHandler.npcs[NPCSlot].npcType;
                boolean FishingGo = false;
                boolean PutNPCCoords = false;
                if (NPCID == 309) { /*Lure From Lure & Bait - Any Sea*/
                    if (IsItemInBag(309) == true && IsItemInBag(314) == true) {
                        FishingGo = true;
                        fishing[8] = 4;
                        fishing[1] = Items.fishing_fly_lvl[0];
                        fishing[5] = 314;
                        fishing[6] = 309;
                        fishing[7] = 0x26E;
                    } else {
                        sendMessage("You need a " + GetItemName(309) + " and " + GetItemName(314) + " to fish here.");
                    }
                } else if (NPCID == 312) { /*Cage From Cage & Harpoon - Any Sea*/
                    if (IsItemInBag(301) == true) {
                        FishingGo = true;
                        fishing[1] = 40;
                        fishing[2] = 90;
                        fishing[4] = 377;
                        fishing[6] = 301;
                        fishing[7] = 0x26D;
                    } else {
                        sendMessage("You need a " + GetItemName(301) + " to fish here.");
                    }
                } else if (NPCID == 313) { /*Net From Net & Harpoon - Any Sea*/
                    if (IsItemInBag(307) == true && IsItemInBag(313) == true) {
                        FishingGo = true;
                        fishing[8] = 5;
                        fishing[1] = Items.fishing_big_net_lvl[0];
                        fishing[5] = 313;
                        fishing[6] = 307;
                        fishing[7] = 0x26E;
                    } else {
                        sendMessage("You need a " + GetItemName(307) + " and " + GetItemName(313) + " to fish here.");
                    }
                } else if (NPCID == 316) { /*Net From Net & Bait - Any Sea*/
                    if (IsItemInBag(303) == true) {
                        FishingGo = true;
                        fishing[8] = 1;
                        fishing[1] = Items.fishing_net_lvl[0];
                        fishing[6] = 303;
                        fishing[7] = 0x26D;
//playerMD = NPCSlot;
                    } else {
                        sendMessage("You need a " + GetItemName(303) + " to fish here.");
                    }
                } else if (NPCID == 319) { /*Net From Net & Bait - Lumby Swamp*/
                    if (IsItemInBag(303) == true) {
                        FishingGo = true;
                        fishing[1] = 33;
                        fishing[2] = 75;
                        fishing[4] = 5004;
                        fishing[6] = 303;
                        fishing[7] = 0x26D;
                    } else {
                        sendMessage("You need a " + GetItemName(303) + " to fish here.");
                    }
                } else if (NPCID == 494 || NPCID == 495) { /*Banking*/
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                    NpcWanneTalk = 1;
                } else if (NPCID == 553) { /*Aubury*/
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                    NpcWanneTalk = 3;
                } else {
                    println_debug("atNPC 1: " + NPCID);
                }
                if (FishingGo == true) {
                    IsUsingSkill = true;
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                    fishing[0] = 1;
                }
                if (PutNPCCoords == true) {
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                }
                break;

            case 17: //second Click npc
                NPCSlot = ((misc.HexToInt(inStream.buffer, 0, packetSize) / 1000) - 128);
                NPCID = server.npcHandler.npcs[NPCSlot].npcType;
                FishingGo = false;
                PutNPCCoords = false;
                if (NPCID == 494 || NPCID == 495) { /*Banking*/
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                    WanneBank = 2;
                } else if (NPCID == 309 || NPCID == 316) { /*Bait From Lure & Bait*/
                    if (IsItemInBag(307) == true && IsItemInBag(313) == true) {
                        FishingGo = true;
                        fishing[8] = 2;
                        fishing[1] = Items.fishing_rod1_lvl[0];
                        fishing[5] = 313;
                        fishing[6] = 307;
                        fishing[7] = 0x26E;
                    } else {
                        sendMessage("You need a " + GetItemName(307) + " and " + GetItemName(313) + " to fish here.");
                    }
                } else if (NPCID == 312) { /*Harpoon From Cage & Harpoon*/
                    if (IsItemInBag(311) == true) {
                        FishingGo = true;
                        fishing[8] = 6;
                        fishing[1] = Items.fishing_harpoon_lvl[0];
                        fishing[6] = 311;
                        fishing[7] = 0x26A;
                    } else {
                        sendMessage("You need a " + GetItemName(311) + " to fish here.");
                    }
                } else if (NPCID == 313) { /*Harpoon From Net & Harpoon*/
                    if (IsItemInBag(311) == true) {
                        FishingGo = true;
                        fishing[1] = 76;
                        fishing[2] = 110;
                        fishing[4] = 383;
                        fishing[6] = 311;
                        fishing[7] = 0x26A;
                    } else {
                        sendMessage("You need a " + GetItemName(311) + " to fish here.");
                    }
                } else if (NPCID == 319) { /*Bait From Net & Bait - Lumby Swamp*/
                    if (IsItemInBag(307) == true && IsItemInBag(313) == true) {
                        FishingGo = true;
                        fishing[8] = 3;
                        fishing[1] = Items.fishing_rod2_lvl[0];
                        fishing[5] = 313;
                        fishing[6] = 307;
                        fishing[7] = 0x26E;
                    } else {
                        sendMessage("You need a " + GetItemName(307) + " and " + GetItemName(313) + " to fish here.");
                    }
                } else if (NPCID == 300 || NPCID == 844 || NPCID == 462) { /*Essence Mine Guys*/
                    IsUsingSkill = true;
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                    stairs = 26;
                    stairDistance = 1;
                    if (NPCID == 300) {
                        Essence = 1;
                    } else if (NPCID == 844) {
                        Essence = 2;
                    } else if (NPCID == 462) {
                        Essence = 3;
                    }
                } else if (NPCID == 553) { //Aubury rune shop
                    PutNPCCoords = true;
                    WanneShop = 2; //Aubury Magic Shop
                } else if (NPCID == 522 || NPCID == 523) { //Shop Keeper + Assistant
                    PutNPCCoords = true;
                    WanneShop = 1; //Varrock General Store
                } else if (NPCID == 526 || NPCID == 527) { //Shop Keeper + Assistant
                    PutNPCCoords = true;
                    WanneShop = 3; //Falador General Store
                } else if (NPCID == 577) { //Cassie
                    PutNPCCoords = true;
                    WanneShop = 4; //Falador Shield Shop
                } else if (NPCID == 580) { //Flynn
                    PutNPCCoords = true;
                    WanneShop = 5; //Falador Mace Shop
                } else if (NPCID == 538) { //Peksa
                    PutNPCCoords = true;
                    WanneShop = 6; //Barbarian Vullage Helmet Shop
                } else if (NPCID == 546) { //Zaff
                    PutNPCCoords = true;
                    WanneShop = 7; //Varrock Staff Shop
                } else if (NPCID == 548) { //Thessalia
                    PutNPCCoords = true;
                    WanneShop = 8; //Varrock Cloth shop
                } else if (NPCID == 551 || NPCID == 552) { //Shop Keeper + Assistant
                    PutNPCCoords = true;
                    WanneShop = 9; //Varrock Sword shop
                } else if (NPCID == 549) { //Horvik
                    PutNPCCoords = true;
                    WanneShop = 10; //Varrock Armor shop
                } else if (NPCID == 550) { //Lowe
                    PutNPCCoords = true;
                    WanneShop = 11; //Varrock Armor shop
                } else if (NPCID == 584) { //Heruin
                    PutNPCCoords = true;
                    WanneShop = 12; //Falador Gem Shop
                } else if (NPCID == 581) { //Wayne
                    PutNPCCoords = true;
                    WanneShop = 13; //Falador Chainmail Shop
                } else if (NPCID == 585) { //Rommik
                    PutNPCCoords = true;
                    WanneShop = 14; //Rimmington Crafting Shop
                } else if (NPCID == 531 || NPCID == 530) { //Shop Keeper + Assistant
                    PutNPCCoords = true;
                    WanneShop = 15; //Rimmington General Store
                } else if (NPCID == 1860) { //Brian
                    PutNPCCoords = true;
                    WanneShop = 16; //Rimmington Archery Shop
                } else if (NPCID == 557) { //Wydin
                    PutNPCCoords = true;
                    WanneShop = 17; //Port Sarim Food Shop
                } else if (NPCID == 558) { //Gerrant
                    PutNPCCoords = true;
                    WanneShop = 18; //Port Sarim Fishing Shop
                } else if (NPCID == 559) { //Brian
                    PutNPCCoords = true;
                    WanneShop = 19; //Port Sarim Battleaxe Shop
                } else if (NPCID == 556) { //Grum
                    PutNPCCoords = true;
                    WanneShop = 20; //Port Sarim Jewelery Shop
                } else if (NPCID == 583) { //Betty
                    PutNPCCoords = true;
                    WanneShop = 21; //Port Sarim Magic Shop
                } else if (NPCID == 520 || NPCID == 521) { //Shop Keeper + Assistant
                    PutNPCCoords = true;
                    WanneShop = 22; //Lumbridge General Store
                } else if (NPCID == 519) { //Bob
                    PutNPCCoords = true;
                    WanneShop = 23; //Lumbridge Axe Shop
                } else if (NPCID == 541) { //Zeke
                    PutNPCCoords = true;
                    WanneShop = 24; //Al-Kharid Scimitar Shop
                } else if (NPCID == 545) { //Dommik
                    PutNPCCoords = true;
                    WanneShop = 25; //Al-Kharid Crafting Shop
                } else if (NPCID == 524 || NPCID == 525) { //Shop Keeper + Assistant
                    PutNPCCoords = true;
                    WanneShop = 26; //Al-Kharid General Store
                } else if (NPCID == 542) { //Louie Legs
                    PutNPCCoords = true;
                    WanneShop = 27; //Al-Kharid Legs Shop
                } else if (NPCID == 544) { //Ranael
                    PutNPCCoords = true;
                    WanneShop = 28; //Al-Kharid Skirt Shop
                } else {
                    println_debug("atNPC 2: " + NPCID);
                }
                if (FishingGo == true) {
                    IsUsingSkill = true;
                    PutNPCCoords = true;
                    fishing[0] = 1;
                }
                if (PutNPCCoords == true) {
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                }
                break;

            case 21: //Thirth Click npc
                NPCSlot = inStream.readUnsignedWordA();
                NPCID = server.npcHandler.npcs[NPCSlot].npcType;
                if (NPCID == 553) { /*Essence Mine Guys*/
                    skillX = server.npcHandler.npcs[NPCSlot].absX;
                    skillY = server.npcHandler.npcs[NPCSlot].absY;
                    stairs = 26;
                    stairDistance = 1;
                    Essence = 0;
                } else {
                    println_debug("atNPC 3: " + NPCID);
                }
                break;

            case 72: //Click to attack
                attacknpc = inStream.readUnsignedWordA();
                if (attacknpc >= 0 && attacknpc < server.npcHandler.maxNPCs) {
                    IsAttackingNPC = true;
                    if (server.npcHandler.npcs[attacknpc].StartKilling == 0) {
                        server.npcHandler.npcs[attacknpc].StartKilling = playerId;
                    }
                    server.npcHandler.npcs[attacknpc].RandomWalk = false;
                    server.npcHandler.npcs[attacknpc].IsUnderAttack = true;
                } else {
                    sendMessage("Exception catched, npc id was invalid.");
                    ResetAttackNPC();
                }
                break;

            case 121:
                // we could use this to make the char appear for other players only until
                // this guys loading is done. Also wait with regular player updates
                // until we receive this command.
//				println_debug("Loading finished.");
                break;

            case 122:    // Call for burying bones
                junk = inStream.readSignedWordBigEndianA();
                ItemSlot = inStream.readUnsignedWordA();
                ItemID = inStream.readUnsignedWordBigEndian();
                if (IsUsingSkill == false && CheckForSkillUse3(ItemID, ItemSlot) == true) {
                    IsUsingSkill = true;
                }
                break;

            case 253:    //call for burning fires
                break;


            case 53:    // Use Items on another Items
                junk = inStream.readSignedWordBigEndianA();
                if (IsUsingSkill == false) {
                    IsUsingSkill = true;
                    useitems[3] = inStream.readUnsignedWordA(); //use item slot
                    useitems[1] = inStream.readSignedWordBigEndianA(); //used item
                    useitems[2] = (int) (misc.HexToInt(inStream.buffer, 1, 1) / 1000); //used item slot
                    useitems[0] = playerItems[useitems[3]]; //used item id
                    useitems[0] -= 1; //Only to fix the ID !
                    CheckForSkillUse();
                }
                break;

                // walkTo commands
            case 248:    // map walk (has additional 14 bytes added to the end with some junk data)
                packetSize -= 14;        // ignore the junk
            case 164:    // regular walk
            case 98:    // walk on command
                if (IsDead == false) {
                    newWalkCmdSteps = packetSize - 5;
                    if (newWalkCmdSteps % 2 != 0)
                        println_debug("Warning: walkTo(" + packetType + ") command malformed: " + misc.Hex(inStream.buffer, 0, packetSize));
                    newWalkCmdSteps /= 2;
                    if (++newWalkCmdSteps > walkingQueueSize) {
                        println_debug("Warning: walkTo(" + packetType + ") command contains too many steps (" + newWalkCmdSteps + ").");
                        newWalkCmdSteps = 0;
                        break;
                    }
                    int firstStepX = inStream.readSignedWordBigEndianA();
                    int tmpFSX = firstStepX;
                    firstStepX -= mapRegionX * 8;
                    for (i = 1; i < newWalkCmdSteps; i++) {
                        newWalkCmdX[i] = inStream.readSignedByte();
                        newWalkCmdY[i] = inStream.readSignedByte();
                        tmpNWCX[i] = newWalkCmdX[i];
                        tmpNWCY[i] = newWalkCmdY[i];
                    }
                    newWalkCmdX[0] = newWalkCmdY[0] = tmpNWCX[0] = tmpNWCY[0] = 0;
                    int firstStepY = inStream.readSignedWordBigEndian();
                    int tmpFSY = firstStepY;
                    firstStepY -= mapRegionY * 8;
                    newWalkCmdIsRunning = inStream.readSignedByteC() == 1;
                    for (i = 0; i < newWalkCmdSteps; i++) {
                        newWalkCmdX[i] += firstStepX;
                        newWalkCmdY[i] += firstStepY;
                    }
                    poimiY = firstStepY;
                    poimiX = firstStepX;

                    //stairs check
                    if (stairs > 0) {
                        resetStairs();
                    }
                    //woodcutting check
                    if (woodcutting[0] > 0) {
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        resetAnimation();
                        resetWC();
                    }
                    //fletching check
                    if (fletching[0] > 0) {
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        resetAnimation();
                        resetFL();
                    }
                    //pick up item check
                    if (WannePickUp == true) {
                        PickUpID = 0;
                        PickUpAmount = 0;
                        PickUpDelete = 0;
                        WannePickUp = false;
                    }
                    //attack check
                    if (IsAttacking == true) {
                        ResetAttack();
                    }
                    //attack NPCs check
                    if (IsAttackingNPC == true) {
                        ResetAttackNPC();
                    }
                    //mining check
                    if (mining[0] > 0) {
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        playerEquipment[playerShield] = OriginalShield;
                        OriginalShield = -1;
                        resetAnimation();
                        resetMI();
                    }
                    //smelting check
                    if (smelting[0] > 0) {
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        playerEquipment[playerShield] = OriginalShield;
                        OriginalShield = -1;
                        resetAnimation();
                        resetSmelt();
                    }
                    //fishing check
                    if (fishing[0] > 0) {
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        playerEquipment[playerShield] = OriginalShield;
                        OriginalShield = -1;
                        resetAnimation();
                        resetFI();
                    }
                    //smithing check
                    if (smithing[0] > 0) {
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        playerEquipment[playerShield] = OriginalShield;
                        OriginalShield = -1;
                        resetAnimation();
                        resetSM();
                        RemoveAllWindows();
                    }
                    //Npc Talking
                    if (NpcDialogue > 0) {
                        NpcDialogue = 0;
                        NpcTalkTo = 0;
                        NpcDialogueSend = false;
                        RemoveAllWindows();
                    }
                    //banking
                    if (IsBanking == true) {
                        RemoveAllWindows();
                    }
                    //shopping
                    if (IsShopping == true) {
                        IsShopping = false;
                        MyShopID = 0;
                        UpdateShop = false;
                        RemoveAllWindows();
                    }
                    //trading
                    if (tradeStatus >= 2) {
                        PlayerHandler.players[tradeWith].tradeOtherDeclined = true;
                        DeclineTrade();
                        sendMessage("You decline the trade.");
                        RemoveAllWindows();
                    }
                }
                break;

            case 4:    // regular chat
                chatTextEffects = inStream.readUnsignedByteS();
                chatTextColor = inStream.readUnsignedByteS();
                chatTextSize = (byte) (packetSize - 2);
                inStream.readBytes_reverseA(chatText, chatTextSize, 0);
                chatTextUpdateRequired = true;
                println_debug("Text [" + chatTextEffects + "," + chatTextColor + "]: " + misc.textUnpack(chatText, packetSize - 2));
                break;

            case 14: //Use something on another player
                junk = inStream.readSignedWordBigEndian();    //only needed to get the cracker slot ! (remove = server crash !)
                junk2 = inStream.readSignedWordBigEndianA();    //only needed to get the cracker slot ! (remove = server crash !)
                junk3 = inStream.readUnsignedWordA();        //only needed to get the cracker slot ! (remove = server crash !)
                int CrackerSlot = inStream.readSignedWordBigEndian();
                int CrackerID = playerItems[CrackerSlot];
                CrackerID -= 1; //Only to fix the ID !
                if (CrackerID == 962) {
                    sendMessage("You crack the cracker...");
                    int UsedOn = (int) (misc.HexToInt(inStream.buffer, 3, 1) / 1000);
                    PlayerHandler.players[UsedOn].CrackerMsg = true;
                    deleteItem(CrackerID, CrackerSlot, playerItemsN[CrackerSlot]);
                    if (misc.random(2) == 1) {
                        addItem(Items.randomPHat(), 1);
                        sendMessage("And you get the crackers item.");
                    } else {
                        sendMessage("but you didn't get the crackers item.");
                        PlayerHandler.players[UsedOn].CrackerForMe = true;
                    }
                }
                break;

                // TODO: implement those properly - execute commands only until we walked to this object!
                // atObject commands

/* <Dungeon>
Trapdoors: ID 1568, 1569, 1570, 1571
Ladders: ID 1759, 2113
Climb rope: 1762, 1763, 1764
*/
            case 132:
                int objectX = inStream.readSignedWordBigEndianA();
                int objectID = inStream.readUnsignedWord();
                int objectY = inStream.readUnsignedWordA();
                int face = 0;
                int face2 = 0;
                int GateID = 1;
                println_debug("atObject: " + objectX + "," + objectY + " objectID: " + objectID); //147 might be id for object state changing

                if (objectID == 1531 || objectID == 1537) { //click = close (door = open)
                    if ((objectX == 3231 && objectY == 3433) || (objectX == 3253 && objectY == 3431)) {
                        face = -3; //South
                    } else
                    if ((objectX == 3234 && objectY == 3426) || (objectX == 3225 && objectY == 3293) || (objectX == 3230 && objectY == 3291) || (objectX == 3235 && objectY == 3406) || (objectX == 3276 && objectY == 3421) || (objectX == 3207 && objectY == 3210))
                    {
                        face = -2; //East
                    } else
                    if ((objectX == 3233 && objectY == 3427) || (objectX == 3215 && objectY == 3225) || (objectX == 3207 && objectY == 3217) || (objectX == 3208 && objectY == 3211))
                    {
                        face = -1; //North
                    }//else = West (standard)
                    ReplaceObject(objectX, objectY, (objectID - 1), face);
                } else if (objectID == 1530 || objectID == 1536) { //click = open (door = closed)
                    if ((objectX == 3249 && objectY == 3435) || (objectX == 3235 && objectY == 3426) || (objectX == 3233 && objectY == 3438) || (objectX == 3207 && objectY == 3210))
                    {
                        face = -3; //South
                    } else if ((objectX == 3253 && objectY == 3431) || (objectX == 3231 && objectY == 3433)) {
                        face = -2; //East
                    } else
                    if ((objectX == 3234 && objectY == 3426) || (objectX == 3225 && objectY == 3293) || (objectX == 3230 && objectY == 3291) || (objectX == 3241 && objectY == 3406) || (objectX == 3235 && objectY == 3406) || (objectX == 3276 && objectY == 3421) || (objectX == 3248 && objectY == 3396) || (objectX == 3260 && objectY == 3400))
                    {
                        face = -1; //North
                    }//else = West (standard)
                    ReplaceObject(objectX, objectY, (objectID + 1), face);
                }
                if (objectID == 1553 || objectID == 1551 || objectID == 1552 || objectID == 1556) {
                    if ((objectX == 3253 && objectY == 3266) || (objectX == 3253 && objectY == 3267) || (objectX == 3241 && objectY == 3301) || (objectX == 3241 && objectY == 3302))
                    {
                        face = -3; //South
                        GateID = 1;
                    } else
                    if ((objectX == 3236 && objectY == 3284) || (objectX == 3236 && objectY == 3285) || (objectX == 3236 && objectY == 3295) || (objectX == 3236 && objectY == 3296))
                    {
                        face = -3; //South
                        GateID = 2;
                    } else
                    if ((objectX == 3237 && objectY == 3284) || (objectX == 3238 && objectY == 3284) || (objectX == 3237 && objectY == 3295) || (objectX == 3238 && objectY == 3295))
                    {
                        face = -2; //East
                        GateID = 2;
                    }//else = West (standard)
                    if (GateID == 1) {
                        if (objectID == 1553) {
                            //Place the new gate
                            ReplaceObject((objectX - 1), (objectY - 1), 1552, face);
                            ReplaceObject((objectX - 2), (objectY - 1), 1556, face);
                            //Remove the original gate
                            ReplaceObject(objectX, (objectY - 1), -1, -1);
                        } else if (objectID == 1551) {
                            //Place the new gate
                            ReplaceObject((objectX - 1), objectY, 1552, face);
                            ReplaceObject((objectX - 2), objectY, 1556, face);
                            //Remove the original gate
                            ReplaceObject(objectX, (objectY + 1), -1, -1);
                        } else if (objectID == 1552) {
                            //Place the new gate
                            ReplaceObject((objectX + 1), objectY, 1551, face);
                            ReplaceObject((objectX + 1), (objectY + 1), 1553, face);
                            //Remove the original gate
                            ReplaceObject((objectX - 1), objectY, -1, -1);
                        } else if (objectID == 1556) {
                            //Place the new gate
                            ReplaceObject((objectX + 2), objectY, 1551, face);
                            ReplaceObject((objectX + 2), (objectY + 1), 1553, face);
                            //Remove the original gate
                            ReplaceObject((objectX + 1), objectY, -1, -1);
                        }
                    } else if (GateID == 2) {
                        if (objectID == 1553) {
                            //Place the new gate
                            ReplaceObject((objectX + 2), objectY, 1552, face);
                            ReplaceObject((objectX + 1), objectY, 1556, face);
                            //Remove the original gate
                            ReplaceObject(objectX, (objectY + 1), -1, -1);
                        } else if (objectID == 1551) {
                            //Place the new gate
                            ReplaceObject((objectX + 2), (objectY - 1), 1552, face);
                            ReplaceObject((objectX + 1), (objectY - 1), 1556, face);
                            //Remove the original gate
                            ReplaceObject(objectX, (objectY - 1), -1, -1);
                        } else if (objectID == 1552) {
                            //Place the new gate
                            ReplaceObject((objectX - 2), (objectY + 1), 1551, face);
                            ReplaceObject((objectX - 2), objectY, 1553, face);
                            //Remove the original gate
                            ReplaceObject((objectX - 1), objectY, -1, -1);
                        } else if (objectID == 1556) {
                            //Place the new gate
                            ReplaceObject((objectX - 1), (objectY + 1), 1551, face);
                            ReplaceObject((objectX - 1), objectY, 1553, face);
                            //Remove the original gate
                            ReplaceObject((objectX + 1), objectY, -1, -1);
                        }
                    }
                    ReplaceObject(objectX, objectY, -1, -1);
                }
                if (objectID == 1516 || objectID == 1517 || objectID == 1519 || objectID == 1520) {
                    if ((objectX == 3217 && objectY == 3218) || (objectX == 3217 && objectY == 3219) || (objectX == 3213 && objectY == 3222) || (objectX == 3213 && objectY == 3221))
                    {
                        face = -3; //South
                        face2 = -1; //North
                    }//else = West (standard)
                    if (objectID == 1516) {
                        //Place the new gate
                        ReplaceObject((objectX - 1), objectY, (objectID + 1), face);
                        ReplaceObject((objectX - 1), (objectY + 1), (objectID + 4), face2);
                        //Remove the original gate
                        ReplaceObject(objectX, (objectY + 1), -1, -1);
                        ReplaceObject(objectX, objectY, -1, -1);
                    } else if (objectID == 1519) {
                        //Place the new gate
                        ReplaceObject((objectX - 1), (objectY - 1), (objectID - 2), face);
                        ReplaceObject((objectX - 1), objectY, (objectID + 1), face2);
                        //Remove the original gate
                        ReplaceObject(objectX, objectY, -1, -1);
                        ReplaceObject(objectX, (objectY - 1), -1, -1);
                    } else if (objectID == 1517) {
                        //Place the new gate
                        ReplaceObject((objectX + 1), (objectY + 1), (objectID + 2), face);
                        ReplaceObject((objectX + 1), objectY, (objectID - 1), face);
                        //Remove the original gate
                        ReplaceObject(objectX, (objectY + 1), -1, -1);
                        ReplaceObject(objectX, objectY, -1, -1);
                    } else if (objectID == 1520) {
                        //Place the new gate
                        ReplaceObject((objectX + 1), objectY, (objectID - 1), face);
                        ReplaceObject((objectX + 1), (objectY - 1), (objectID - 4), face);
                        //Remove the original gate
                        ReplaceObject(objectX, objectY, -1, -1);
                        ReplaceObject(objectX, (objectY - 1), -1, -1);
                    }
                }
                if (objectID == 2213) { //Bank Booth
                    skillX = objectX;
                    skillY = objectY;
                    NpcWanneTalk = 2;
                }
                if (objectID == 6552) { //Ancient magic altar (temp !!!)
                    if (GoodDistance(absX, absY, objectX, objectY, 1) == true) {
                        if (playerAncientMagics == true) {
                            setSidebarInterface(6, 1151); //magic tab (ancient = 12855);
                            playerAncientMagics = false;
                        } else {
                            setSidebarInterface(6, 12855); //magic tab (ancient = 12855);
                            playerAncientMagics = true;
                        }
                    }
                }
//Search banana tree
                if (objectID == 2073 || objectID == 2074 || objectID == 2075 || objectID == 2076 || objectID == 2077 || objectID == 2078)
                {
                    addItem(1963, 1);
                    sendMessage("You pick a banana.");
                }
//woodCutting
//mining
                if (IsUsingSkill == false) {
                    if (CheckObjectSkill(objectID) == true) {
                        IsUsingSkill = true;
                        skillX = objectX;
                        skillY = objectY;
                    }
                }
//go upstairs
                if (IsUsingSkill == false) {
                    if (objectID == 1747 || objectID == 1750) {
                        stairs = 1;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 1738) {
                        stairs = 1;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 2;
                    } else if (objectID == 1722) {
                        stairs = 21;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 2;
                        stairDistanceAdd = 2;
                    } else if (objectID == 1734) {
                        stairs = 10;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 3;
                        stairDistanceAdd = 1;
                    } else if (objectID == 55) {
                        stairs = 15;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 3;
                        stairDistanceAdd = 1;
                    } else if (objectID == 57) {
                        stairs = 15;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 3;
                    } else if (objectID == 1755 || objectID == 5946 || objectID == 1757) {
                        stairs = 4;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 1764) {
                        stairs = 12;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 2148) {
                        stairs = 8;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 3608) {
                        stairs = 13;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 2408) {
                        stairs = 16;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 5055) {
                        stairs = 18;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 5131) {
                        stairs = 20;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 9359) {
                        stairs = 24;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                        stairDistance = 1;
                    } else if (objectID == 2492) { /*Essence Mine Portals*/
                        stairs = 25;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 2406) { /*Lost City Door*/
                        if (playerEquipment[playerWeapon] == 772) { //Dramen Staff
                            stairs = 27;
                            skillX = objectX;
                            skillY = objectY;
                            stairDistance = 1;
                        } else {
                            //Open Door
                        }
                    }
//go downstairs
                    if (objectID == 1746 || objectID == 1749) {
                        stairs = 2;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 1740) {
                        stairs = 2;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 1723) {
                        stairs = 22;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 2;
                        stairDistanceAdd = 2;
                    } else if (objectID == 1733) {
                        stairs = 9;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 3;
                        stairDistanceAdd = -1;
                    } else if (objectID == 54) {
                        stairs = 14;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 3;
                        stairDistanceAdd = 1;
                    } else if (objectID == 56) {
                        stairs = 14;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 3;
                    } else
                    if (objectID == 1568 || objectID == 5947 || objectID == 6434 || objectID == 1759 || objectID == 1754 || objectID == 1570)
                    {
                        stairs = 3;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 2113) { //Mining guild stairs
                        if (playerLevel[playerMining] >= 60) {
                            stairs = 3;
                            skillX = objectX;
                            skillY = objectY;
                            stairDistance = 1;
                        } else {
                            sendMessage("You need 60 mining to enter the mining guild.");
                        }
                    } else if (objectID == 492) {
                        stairs = 11;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 2;
                    } else if (objectID == 2147) {
                        stairs = 7;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 5054) {
                        stairs = 17;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 5130) {
                        stairs = 19;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 9358) {
                        stairs = 23;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    } else if (objectID == 5488) {
                        stairs = 28;
                        skillX = objectX;
                        skillY = objectY;
                        stairDistance = 1;
                    }

                    if (skillX > -1 && skillY > -1) {
                        IsUsingSkill = true;
                    }
                }
                break;

            case 252: // atObject2
                objectID = inStream.readUnsignedWordBigEndianA(); //5292 bankwindow
                objectY = inStream.readSignedWordBigEndian();
                objectX = inStream.readUnsignedWordA();
                println_debug("atObject2: " + objectX + "," + objectY + " objectID: " + objectID);
                if ((objectID == 2213) || (objectID == 2214) || (objectID == 3045) || (objectID == 5276) || (objectID == 6084))
                {
                    skillX = objectX;
                    skillY = objectY;
                    WanneBank = 1;
                }/* else if (objectID == 1739) {
					heightLevel += 1;
					teleportToX = absX;
					teleportToY = absY;
				}*/
                break;

            case 70: // atObject3
                objectX = inStream.readSignedWordBigEndian();
                objectY = inStream.readUnsignedWord();
                objectID = inStream.readUnsignedWordBigEndianA();
                println_debug("atObject3: " + objectX + "," + objectY + " objectID: " + objectID);

                if (objectID == 1739) {
                    heightLevel -= 1;
                    teleportToX = absX;
                    teleportToY = absY;
                }
                break;

            case 95: // update chat
                Tradecompete = inStream.readUnsignedByte();
                Privatechat = inStream.readUnsignedByte();
                Publicchat = inStream.readUnsignedByte();
                for (int i1 = 1; i1 < handler.maxPlayers; i1++) {
                    if (handler.players[i1] != null && handler.players[i1].isActive == true) {
                        handler.players[i1].pmupdate(playerId, GetWorld(playerId));
                    }
                }
                break;
            case 188: // add friend
                long friendtoadd = inStream.readQWord();
                boolean CanAdd = true;
                for (int i1 = 0; i1 < friends.length; i1++) {
                    if (friends[i1] != 0 && friends[i1] == friendtoadd) {
                        CanAdd = false;
                        sendMessage(friendtoadd + " is already in your friendlist.");
                    }
                }
                if (CanAdd == true) {
                    for (int i1 = 0; i1 < friends.length; i1++) {
                        if (friends[i1] == 0) {
                            friends[i1] = friendtoadd;
                            for (int i2 = 1; i2 < handler.maxPlayers; i2++) {
                                if (handler.players[i2] != null && handler.players[i2].isActive && misc.playerNameToInt64(handler.players[i2].playerName) == friendtoadd)
                                {
                                    if (playerRights >= 2 || handler.players[i2].Privatechat == 0 || (handler.players[i2].Privatechat == 1 && handler.players[i2].isinpm(misc.playerNameToInt64(playerName))))
                                    {
                                        loadpm(friendtoadd, GetWorld(i2));
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 215: // remove friend
                long friendtorem = inStream.readQWord();
                for (int i1 = 0; i1 < friends.length; i1++) {
                    if (friends[i1] == friendtorem) {
                        friends[i1] = 0;
                        break;
                    }
                }
                break;
            case 133: // add ignore
                long igtoadd = inStream.readQWord();
                for (int i10 = 0; i10 < ignores.length; i10++) {
                    if (ignores[i10] == 0) {
                        ignores[i10] = igtoadd;
                        break;
                    }
                }
                break;
            case 74: // remove ignore
                long igtorem = inStream.readQWord();
                for (int i11 = 0; i11 < ignores.length; i11++) {
                    if (ignores[i11] == igtorem) {
                        ignores[i11] = 0;
                        break;
                    }
                }
                break;
            case 126: //pm message
                long friendtosend = inStream.readQWord();
                byte pmchatText[] = new byte[100];
                int pmchatTextSize = (byte) (packetSize - 8);
                inStream.readBytes(pmchatText, pmchatTextSize, 0);
                for (int i1 = 0; i1 < friends.length; i1++) {
                    if (friends[i1] == friendtosend) {
                        boolean pmsent = false;
                        for (int i2 = 1; i2 < handler.maxPlayers; i2++) {
                            if (handler.players[i2] != null && handler.players[i2].isActive && misc.playerNameToInt64(handler.players[i2].playerName) == friendtosend)
                            {
                                if (playerRights >= 2 || handler.players[i2].Privatechat == 0 || (handler.players[i2].Privatechat == 1 && handler.players[i2].isinpm(misc.playerNameToInt64(playerName))))
                                {
                                    handler.players[i2].sendpm(misc.playerNameToInt64(playerName), playerRights, pmchatText, pmchatTextSize);
                                    pmsent = true;
                                }
                                break;
                            }
                        }
                        if (!pmsent) {
                            sendMessage("Players currently not available");
                            break;
                        }
                    }
                }
                break;

            case 236: //pickup item
                int itemY = inStream.readSignedWordBigEndian();
                int itemID = inStream.readUnsignedWord();
                int itemX = inStream.readSignedWordBigEndian();
                int itemAmount = 1;
                int itemDelete = 0;
                boolean MD = false;
                boolean Found = false;

                for (int j = 0; j < server.itemHandler.DropItemCount; j++) {
                    if (server.itemHandler.DroppedItemsID[j] == itemID && server.itemHandler.DroppedItemsX[j] == itemX && server.itemHandler.DroppedItemsY[j] == itemY && Found == false)
                    {
                        Found = true;
                        MD = MustDelete[j];
                        if (MD == true) {
                            sendMessage("Someone else took the item.");
                        } else {
                            itemAmount = server.itemHandler.DroppedItemsN[j];
                            itemDelete = j;
                        }
                        break;
                    }
                }

                //println_debug("pickupItem: "+itemX+","+itemY+" itemID: "+itemID+" itemAmount:"+itemAmount);

                if (MD == false) {
                    if (Found == true) {
                        if (IsUsingSkill == false) {
                            WannePickUp = true;
                            PickUpID = itemID;
                            PickUpAmount = itemAmount;
                            PickUpDelete = itemDelete;
                        }
                    } else {
                        sendMessage("Illigal item taking.");
                        println_debug("Illigal item taking.");
                    }
                } else {
                    sendMessage("Someone else took the item.");
                }
                break;


            case 73: //Attack (Wilderness)
                AttackingOn = inStream.readSignedWordBigEndian();
                IsAttacking = true;
                break;

            case 128: //Trade Request
                WanneTradeWith = inStream.readUnsignedWord();
                WanneTrade = 1;
                break;

            case 153: //Follow
                int FollowID = (misc.HexToInt(inStream.buffer, 0, packetSize) / 1000);
                break;

            case 139: //Trade answer
                WanneTradeWith = inStream.readSignedWordBigEndian();
                WanneTrade = 2;
                break;


            case 3:            // focus change
                break;
            case 86:        // camera angle
                break;
            case 241:        // mouse clicks
                break;

            case 103:        //Custom player command, the ::words
                String playerCommand = inStream.readString();
                println_debug("playerCommand: " + playerCommand);
                customCommand(playerCommand);
                break;


            case 214:    // change item places
                somejunk = inStream.readUnsignedWordA(); //junk
                int itemFrom = inStream.readUnsignedWordA();// slot1
                int itemTo = (inStream.readUnsignedWordA() - 128);// slot2
                //println_debug(somejunk+" moveitems: From:"+itemFrom+" To:"+itemTo);
                moveItems(itemFrom, itemTo, somejunk);

                break;

            case 41:    // wear item
                int wearID = inStream.readUnsignedWord();
                int wearSlot = inStream.readUnsignedWordA();
                interfaceID = inStream.readUnsignedWordA();
                //println_debug("WearItem: "+wearID+" slot: "+wearSlot);
                wear(wearID, wearSlot);
                break;

            case 145:    //remove item (opposite for wearing) - bank 1 item - value of item
                interfaceID = inStream.readUnsignedWordA();
                int removeSlot = inStream.readUnsignedWordA();
                int removeID = inStream.readUnsignedWordA();

                println_debug("RemoveItem: " + removeID + " InterID: " + interfaceID + " slot: " + removeSlot);

                if (interfaceID == 1688) {
                    if (playerEquipment[removeSlot] > 0) {
                        remove(removeID, removeSlot);
                    }
                } else if (interfaceID == 5064) { //remove from bag to bank
                    bankItem(removeID, removeSlot, 1);
                } else if (interfaceID == 5382) { //remove from bank
                    fromBank(removeID, removeSlot, 1);
                } else if (interfaceID == 3322) { //remove from bag to trade window
                    tradeItem(removeID, removeSlot, 1);
                } else if (interfaceID == 3415) { //remove from trade window
                    fromTrade(removeID, removeSlot, 1);
                } else if (interfaceID == 3823) { //Show value to sell items
                    if (Items.itemSellable[removeID] == false) {
                        sendMessage("I cannot sell " + GetItemName(removeID) + ".");
                    } else {
                        boolean IsIn = false;
                        if (server.shopHandler.ShopSModifier[MyShopID] > 1) {
                            for (int j = 0; j <= server.shopHandler.ShopItemsStandard[MyShopID]; j++) {
                                if (removeID == (server.shopHandler.ShopItems[MyShopID][j] - 1)) {
                                    IsIn = true;
                                    break;
                                }
                            }
                        } else {
                            IsIn = true;
                        }
                        if (IsIn == false) {
                            sendMessage("You cannot sell " + GetItemName(removeID) + " in this store.");
                        } else {
                            int ShopValue = (int) Math.floor(GetItemShopValue(removeID, 1, removeSlot));
                            String ShopAdd = "";
                            if (ShopValue >= 1000 && ShopValue < 1000000) {
                                ShopAdd = " (" + (ShopValue / 1000) + "K)";
                            } else if (ShopValue >= 1000000) {
                                ShopAdd = " (" + (ShopValue / 1000000) + " million)";
                            }
                            sendMessage(GetItemName(removeID) + ": shop will buy for " + ShopValue + " coins" + ShopAdd);
                        }
                    }
                } else if (interfaceID == 3900) { //Show value to buy items
                    int ShopValue = (int) Math.floor(GetItemShopValue(removeID, 0, removeSlot));
                    String ShopAdd = "";
                    if (ShopValue >= 1000 && ShopValue < 1000000) {
                        ShopAdd = " (" + (ShopValue / 1000) + "K)";
                    } else if (ShopValue >= 1000000) {
                        ShopAdd = " (" + (ShopValue / 1000000) + " million)";
                    }
                    sendMessage(GetItemName(removeID) + ": currently costs " + ShopValue + " coins" + ShopAdd);
                } else if (interfaceID >= 1119 && interfaceID <= 1123) { //Smithing
                    if (smithing[2] > 0) {
                        smithing[4] = removeID;
                        smithing[0] = 1;
                        smithing[5] = 1;
                        RemoveAllWindows();
                    } else {
                        sendMessage("Illigal Smithing !");
                        println_debug("Illigal Smithing !");
                    }
                }

                break;

            case 117:    //bank 5 items - sell 1 item
                interfaceID = inStream.readSignedWordBigEndianA();
                removeID = inStream.readSignedWordBigEndianA();
                removeSlot = inStream.readSignedWordBigEndian();

                println_debug("RemoveItem 5: " + removeID + " InterID: " + interfaceID + " slot: " + removeSlot);

                if (interfaceID == 5064) { //remove from bag to bank
                    bankItem(removeID, removeSlot, 5);
                } else if (interfaceID == 5382) { //remove from bank
                    fromBank(removeID, removeSlot, 5);
                } else if (interfaceID == 3322) { //remove from bag to trade window
                    tradeItem(removeID, removeSlot, 5);
                } else if (interfaceID == 3415) { //remove from trade window
                    fromTrade(removeID, removeSlot, 5);
                } else if (interfaceID == 3823) { //Show value to sell items
                    sellItem(removeID, removeSlot, 1);
                } else if (interfaceID == 3900) { //Show value to buy items
                    buyItem(removeID, removeSlot, 1);
                } else if (interfaceID >= 1119 && interfaceID <= 1123) { //Smithing
                    if (smithing[2] > 0) {
                        smithing[4] = removeID;
                        smithing[0] = 1;
                        smithing[5] = 5;
                        RemoveAllWindows();
                    } else {
                        sendMessage("Illigal Smithing !");
                        println_debug("Illigal Smithing !");
                    }
                }
                break;

            case 43:    //bank 10 items - sell 5 items
                interfaceID = inStream.readUnsignedWordBigEndian();
                removeID = inStream.readUnsignedWordA();
                removeSlot = inStream.readUnsignedWordA();

                println_debug("RemoveItem 10: " + removeID + " InterID: " + interfaceID + " slot: " + removeSlot);

                if (interfaceID == 5064) { //remove from bag to bank
                    bankItem(removeID, removeSlot, 10);
                } else if (interfaceID == 5382) { //remove from bank
                    fromBank(removeID, removeSlot, 10);
                } else if (interfaceID == 3322) { //remove from bag to trade window
                    tradeItem(removeID, removeSlot, 10);
                } else if (interfaceID == 3415) { //remove from trade window
                    fromTrade(removeID, removeSlot, 10);
                } else if (interfaceID == 3823) { //Show value to sell items
                    sellItem(removeID, removeSlot, 5);
                } else if (interfaceID == 3900) { //Show value to buy items
                    buyItem(removeID, removeSlot, 5);
                } else if (interfaceID >= 1119 && interfaceID <= 1123) { //Smithing
                    if (smithing[2] > 0) {
                        smithing[4] = removeID;
                        smithing[0] = 1;
                        smithing[5] = 10;
                        RemoveAllWindows();
                    } else {
                        sendMessage("Illigal Smithing !");
                        println_debug("Illigal Smithing !");
                    }
                }

                break;

            case 129:    //bank all items - sell 10 items
                removeSlot = inStream.readUnsignedWordA();
                interfaceID = inStream.readUnsignedWord();
                removeID = inStream.readUnsignedWordA();

                println_debug("RemoveItem all: " + removeID + " InterID: " + interfaceID + " slot: " + removeSlot);

                if (interfaceID == 5064) { //remove from bag to bank
                    if (Items.itemStackable[removeID] == true) {
                        bankItem(playerItems[removeSlot], removeSlot, playerItemsN[removeSlot]);
                    } else {
                        bankItem(playerItems[removeSlot], removeSlot, itemAmount(playerItems[removeSlot]));
                    }
                } else if (interfaceID == 5382) { //remove from bank
                    fromBank(bankItems[removeSlot], removeSlot, bankItemsN[removeSlot]);
                } else if (interfaceID == 3322) { //remove from bag to trade window
                    tradeItem(removeID, removeSlot, playerItemsN[removeSlot]);
                } else if (interfaceID == 3415) { //remove from trade window
                    fromTrade(removeID, removeSlot, playerTItemsN[removeSlot]);
                } else if (interfaceID == 3823) { //Show value to sell items
                    sellItem(removeID, removeSlot, 10);
                } else if (interfaceID == 3900) { //Show value to buy items
                    buyItem(removeID, removeSlot, 10);
                }

                break;


            case 135:    //bank X items
                outStream.createFrame(27);
                XremoveSlot = inStream.readSignedWordBigEndian();
                XinterfaceID = inStream.readUnsignedWordA();
                XremoveID = inStream.readSignedWordBigEndian();

                println_debug("RemoveItem X: " + XremoveID + " InterID: " + XinterfaceID + " slot: " + XremoveSlot);

                break;

            case 208:    //Enter Amounth Part 2
                int EnteredAmount = inStream.readDWord();
                if (XinterfaceID == 5064) { //remove from bag to bank
                    bankItem(playerItems[XremoveSlot], XremoveSlot, EnteredAmount);
                } else if (XinterfaceID == 5382) { //remove from bank
                    fromBank(bankItems[XremoveSlot], XremoveSlot, EnteredAmount);
                } else if (XinterfaceID == 3322) { //remove from bag to trade window
                    tradeItem(XremoveID, XremoveSlot, EnteredAmount);
                } else if (XinterfaceID == 3415) { //remove from trade window
                    fromTrade(XremoveID, XremoveSlot, EnteredAmount);
                }
                if (fletching[5] == 1) {
                    if (EnteredAmount >= 1 && EnteredAmount <= 3) {
                        fletching[5] = 2;
                        fletching[6] = EnteredAmount;
                        CheckForSkillUse();
                    } else {
                        resetFL();
                        sendMessage("1 = arrow shafts | 2 = short bow | 3 = long bow");
                        sendMessage("Achey Logs: 1 = ogre arrow shafts | 2 = ogre composite bow");
                    }
                }
                break;


            case 87:        // drop item
                int droppedItem = inStream.readUnsignedWordA();
                somejunk = inStream.readUnsignedByte() + inStream.readUnsignedByte();
                int slot = inStream.readUnsignedWordA();
                //println_debug("dropItem: "+droppedItem+" Slot: "+slot);
                dropItem(droppedItem, slot);
                break;

            case 185:               //clicking most buttons
                int actionButtonId = misc.HexToInt(inStream.buffer, 0, packetSize);
                switch (actionButtonId) {
                    //These values speak for themselves
                    //case 4126: windstrike break;
                    case 4140:
                        TeleTo("Varrock");
                        break;
                    case 4143:
                        TeleTo("Lumby");
                        break;
                    case 4146:
                        TeleTo("Falador");
                        break;
                    case 4150:
                        TeleTo("Camelot");
                        break;
                    case 6004:
                        TeleTo("Ardougne");
                        break;
                    case 6005:
                        TeleTo("Watchtower");
                        break;
                    case 29031:
                        TeleTo("Trollheim");
                        break;
                    case 153:
                        if (playerEnergy > 0) {
                            isRunning2 = true;
                        }
                        break;
                    case 152:
                        isRunning2 = false;
                        break;

                    case 130: //close interface
                        println_debug("Closing Interface");
                        break;

                    case 168: // yes emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x357;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;

                    case 169: // no emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x358;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 162: // think emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x359;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 164: // bow emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x35A;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 165: // angry emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x35B;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 161: // cry emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x35C;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 170: // laugh emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x35D;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 171: // cheer emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x35E;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 163: // wave emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x35F;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 167: // beckon emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x360;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 172: // clap emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x361;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 166: // dance emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x362;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52050: // panic emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x839;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52051: // jig emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x83A;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52052: // spin emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x83B;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52053: // headbang emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x83C;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52054: //joy jump emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x83D;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52055: // rasp' berry emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x83E;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52056: // yawn emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x83F;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52057: // salute emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x840;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52058: // shrug emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x841;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 43092: // blow kiss emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x558;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 2155: // glass box emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x46B;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 25103: // climb rope emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x46A;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 25106: // lean emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x469;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 2154: // glass wall emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x468;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52071: // goblin bow emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x84F;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;
                    case 52072: // goblin dance emote
                        if (emotes == 0) {
                            emotes = 1;
                            pEmote = 0x850;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        } else {
                            emotes = 0;
                            pEmote = playerSE;
                            updateRequired = true;
                            appearanceUpdateRequired = true;
                        }
                        break;

                    case 9125: //Accurate
                    case 22228: //punch (unarmed)
                    case 48010: //flick (whip)
                    case 21200: //spike (pickaxe)
                    case 1080: //bash (staff)
                    case 6168: //chop (axe)
                    case 6236: //accurate (long bow)
                    case 17102: //accurate (darts)
                    case 8234: //stab (dagger)
                        FightType = 1;
                        SkillID = 0;
                        break;
                    case 9126: //Defensive
                    case 48008: //deflect (whip)
                    case 22229: //block (unarmed)
                    case 21201: //block (pickaxe)
                    case 1078: //focus - block (staff)
                    case 6169: //block (axe)
                    case 33019: //fend (hally)
                    case 18078: //block (spear)
                    case 8235: //block (dagger)
                        FightType = 4;
                        SkillID = 1;
                        break;
                    case 9127: // Controlled
                    case 48009: //lash (whip)
                    case 33018: //jab (hally)
                    case 6234: //longrange (long bow)
                    case 18077: //lunge (spear)
                    case 18080: //swipe (spear)
                    case 18079: //pound (spear)
                    case 17100: //longrange (darts)
                        FightType = 3;
                        SkillID = 3;
                        break;
                    case 9128: //Aggressive
                    case 22230: //kick (unarmed)
                    case 21203: //impale (pickaxe)
                    case 21202: //smash (pickaxe)
                    case 1079: //pound (staff)
                    case 6171: //hack (axe)
                    case 6170: //smash (axe)
                    case 33020: //swipe (hally)
                    case 6235: //rapid (long bow)
                    case 17101: //repid (darts)
                    case 8237: //lunge (dagger)
                    case 8236: //slash (dagger)
                        FightType = 2;
                        SkillID = 2;
                        break;
                    case 9154: //Log out
                        logout();
                        break;
                    case 21011:
                        takeAsNote = false;
                        break;
                    case 21010:
                        takeAsNote = true;
                        break;
                    case 13092:
                        if (tradeWith > 0) {
                            if (PlayerHandler.players[tradeWith].tradeStatus == 2) {
                                tradeStatus = 3;
                                sendFrame126("Waiting for other player...", 3431);
                            } else if (PlayerHandler.players[tradeWith].tradeStatus == 3) {
                                tradeStatus = 3;
                                //TradeGoConfirm();
                            }
                        }
                        break;
                    case 13218:
                        if (tradeWith > 0) {
                            if (PlayerHandler.players[tradeWith].tradeStatus == 3) {
                                tradeStatus = 4;
                                sendFrame126("Waiting for other player...", 3535);
                            } else if (PlayerHandler.players[tradeWith].tradeStatus == 4) {
                                tradeStatus = 4;
                                //ConfirmTrade();
                            }
                        }
                        break;

                    case 9157:
                        if (DialogueHandler.DialogueType[NpcDialogue] == 2) {
                            NpcDialogue = DialogueHandler.DialogueNextOption[NpcDialogue][1];
                        }
                        if (DialogueHandler.DialogueType[NpcDialogue] == 2 && DialogueHandler.DialogueNextOption[NpcDialogue][1] < 0)
                        {
                            NpcDialogue = 0;
                            DialogueAction(DialogueHandler.DialogueNextOption[NpcDialogue][1]);
                        }
                        NpcDialogueSend = false;
                        break;
                    case 9158:
                        if (DialogueHandler.DialogueType[NpcDialogue] == 2) {
                            NpcDialogue = DialogueHandler.DialogueNextOption[NpcDialogue][2];
                        }
                        if (DialogueHandler.DialogueType[NpcDialogue] == 2 && DialogueHandler.DialogueNextOption[NpcDialogue][2] < 0)
                        {
                            NpcDialogue = 0;
                            DialogueAction(DialogueHandler.DialogueNextOption[NpcDialogue][2]);
                        }
                        NpcDialogueSend = false;
                        break;

                    case 1097:
                        setSidebarInterface(0, 1829);
                        break;
                    case 7212:
                        setSidebarInterface(0, 328);
                        break;
                    default:
                        //System.out.println("Players stands in: X="+absX+" Y="+absY);
                        println_debug("Case 185: Action Button: " + actionButtonId);
                        break;
                }
                break;
                // the following Ids are the reason why AR-type cheats are hopeless to make...
                // basically they're just there to make reversing harder
            case 226:
            case 78:
            case 148:
            case 183:
            case 230:
            case 136:
            case 189:
            case 152:
            case 200:
            case 85:
            case 165:
            case 238:
            case 150:
            case 36:
            case 246:
            case 77:
                break;
                // any packets we might have missed
            default:
                interfaceID = inStream.readUnsignedWordA();
                int actionButtonId1 = misc.HexToInt(inStream.buffer, 0, packetSize);
                println_debug("Unhandled packet [" + packetType + ", InterFaceId: " + interfaceID + ", size=" + packetSize + "]: ]" + misc.Hex(inStream.buffer, 1, packetSize) + "[");
                println_debug("Action Button: " + actionButtonId1);
                break;
        }
    }

    private int somejunk;

    public boolean ResetPlayerVars() {
        teleportToX = 0;
        teleportToY = 0;
        heightLevel = 0;
        playerRights = 0;
        playerIsMember = 1;
        playerMessages = 0;
        playerLastConnect = "";
        playerLastLogin = 20050101;
        playerEnergy = 0;
        playerEnergyGian = 0;
        playerFollowID = 0;
        playerGameTime = 0;
        playerGameCount = 0;
        for (int i = 0; i < playerItems.length; i++) {
            playerItems[i] = 0;
            playerItemsN[i] = 0;
        }
        for (int i = 0; i < playerEquipment.length; i++) {
            playerEquipment[i] = -1;
            playerEquipmentN[i] = 0;
        }
        for (int i = 0; i < bankItems.length; i++) {
            bankItems[i] = 0;
            bankItemsN[i] = 0;
        }
        for (int i = 0; i < playerLevel.length; i++) {
            if (i == playerHitpoints) {
                playerLevel[i] = 10;
                playerXP[i] = 1055;
            } else {
                playerLevel[i] = 1;
                playerXP[i] = 0;
            }
        }
        for (int i = 0; i < friends.length; i++) {
            friends[i] = 0;
        }
        for (int i = 0; i < ignores.length; i++) {
            ignores[i] = 0;
        }
        for (int i = 0; i < playerLook.length; i++) {
            playerLook[i] = -1;
        }
        for (int i = 0; i < playerFollow.length; i++) {
            playerFollow[i] = 0;
        }
        resetTrade(); //no trading, so reset the trade vars
        return true;
    }

    public int loadGame(String playerName, String playerPass) {
        String line = "";
        String token = "";
        String token2 = "";
        String[] token3 = new String[3];
        boolean EndOfFile = false;
        int ReadMode = 0;
        BufferedReader characterfile = null;
        BufferedReader characterfile2 = null;
        boolean File1 = false;
        boolean File2 = false;
        ResetPlayerVars();
        try {
            characterfile = new BufferedReader(new FileReader(server.workingDir + "characters/" + playerName + ".txt"));
            File1 = true;
        } catch (FileNotFoundException fileex1) {
           // misc.printlnTag(playerName + ": error loading file.");
            //fileex1.printStackTrace();
            return 3;
        }
        try {
            line = characterfile.readLine();
        } catch (IOException ioexception) {
            misc.printlnTag(playerName + ": error loading file.");
            return 3;
        }
        while (EndOfFile == false && line != null) {
            line = line.trim();
            int spot = line.indexOf("=");
            if (spot > -1) {
                token = line.substring(0, spot);
                token = token.trim();
                token2 = line.substring(spot + 1);
                token2 = token2.trim();
                token3 = token2.split("\t");
                switch (ReadMode) {
                    case 1:
                        if (token.equals("character-username")) {
                            if (playerName.equals(token2)) {
                            } else {
                                return 2;
                            }
                        } else if (token.equals("character-password")) {
                            if (playerPass.equals(token2)) {
                            } else {
                                return 2;
                            }
                        }
                        break;
                    case 2:
                        if (token.equals("character-height")) {
                            heightLevel = Integer.parseInt(token2);
                        } else if (token.equals("character-posx")) {
                            teleportToX = Integer.parseInt(token2);
                        } else if (token.equals("character-posy")) {
                            teleportToY = Integer.parseInt(token2);
                        } else if (token.equals("character-rights")) {
                            playerRights = Integer.parseInt(token2);
                        } else if (token.equals("character-ismember")) {
                            playerIsMember = Integer.parseInt(token2);
                        } else if (token.equals("character-messages")) {
                            playerMessages = Integer.parseInt(token2);
                        } else if (token.equals("character-lastconnection")) {
                            playerLastConnect = token2;
                        } else if (token.equals("character-lastlogin")) {
                            playerLastLogin = Integer.parseInt(token2);
                        } else if (token.equals("character-energy")) {
                            playerEnergy = Integer.parseInt(token2);
                        } else if (token.equals("character-gametime")) {
                            playerGameTime = Integer.parseInt(token2);
                        } else if (token.equals("character-gamecount")) {
                            playerGameCount = Integer.parseInt(token2);
                        }
                        break;
                    case 3:
                        if (token.equals("character-equip")) {
                            playerEquipment[Integer.parseInt(token3[0])] = Integer.parseInt(token3[1]);
                            playerEquipmentN[Integer.parseInt(token3[0])] = Integer.parseInt(token3[2]);
                        }
                        break;
                    case 4:
                        if (token.equals("character-look")) {
                            playerLook[Integer.parseInt(token3[0])] = Integer.parseInt(token3[1]);
                        }
                        break;
                    case 5:
                        if (token.equals("character-skill")) {
                            playerLevel[Integer.parseInt(token3[0])] = Integer.parseInt(token3[1]);
                            playerXP[Integer.parseInt(token3[0])] = Integer.parseInt(token3[2]);
                        }
                        break;
                    case 6:
                        if (token.equals("character-item")) {
                            playerItems[Integer.parseInt(token3[0])] = Integer.parseInt(token3[1]);
                            playerItemsN[Integer.parseInt(token3[0])] = Integer.parseInt(token3[2]);
                        }
                        break;
                    case 7:
                        if (token.equals("character-bank")) {
                            bankItems[Integer.parseInt(token3[0])] = Integer.parseInt(token3[1]);
                            bankItemsN[Integer.parseInt(token3[0])] = Integer.parseInt(token3[2]);
                        }
                        break;
                    case 8:
                        if (token.equals("character-friend")) {
                            friends[Integer.parseInt(token3[0])] = Long.parseLong(token3[1]);
                        }
                        break;
                    case 9:
                        if (token.equals("character-ignore")) {
                            ignores[Integer.parseInt(token3[0])] = Long.parseLong(token3[1]);
                        }
                        break;
                }
            } else {
                if (line.equals("[ACCOUNT]")) {
                    ReadMode = 1;
                } else if (line.equals("[CHARACTER]")) {
                    ReadMode = 2;
                } else if (line.equals("[EQUIPMENT]")) {
                    ReadMode = 3;
                } else if (line.equals("[LOOK]")) {
                    ReadMode = 4;
                } else if (line.equals("[SKILLS]")) {
                    ReadMode = 5;
                } else if (line.equals("[ITEMS]")) {
                    ReadMode = 6;
                } else if (line.equals("[BANK]")) {
                    ReadMode = 7;
                } else if (line.equals("[FRIENDS]")) {
                    ReadMode = 8;
                } else if (line.equals("[IGNORES]")) {
                    ReadMode = 9;
                } else if (line.equals("[EOF]")) {
                    try {
                        characterfile.close();
                    } catch (IOException ioexception) {
                    }
                    return 1;
                }
            }
            try {
                line = characterfile.readLine();
            } catch (IOException ioexception1) {
                EndOfFile = true;
            }
        }
        try {
            characterfile.close();
        } catch (IOException ioexception) {
        }
        return 3;
    }

    public int EssenceMineX[] = {2893, 2921, 2911, 2926, 2899};
    public int EssenceMineY[] = {4846, 4846, 4832, 4817, 4817};
/*
[0] North West
[1] North East
[2] Center
[3] South East
[4] South West
*/
    public int EssenceMineRX[] = {3253, 3105, 2681, 2591};
    public int EssenceMineRY[] = {3401, 9571, 3325, 3086};
/*
[0] Varrock
[1] Wizard Tower
[2] Ardougne
[3] Magic Guild
*/

    public boolean stairs(int stairs, int teleX, int teleY) {
        if (IsStair == false) {
            IsStair = true;
            if (stairs == 1) {
                heightLevel += 1;
            } else if (stairs == 2) {
                heightLevel -= 1;
            } else if (stairs == 21) {
                heightLevel += 1;
            } else if (stairs == 22) {
                heightLevel -= 1;
            }
            teleportToX = teleX;
            teleportToY = teleY;
            if (stairs == 3 || stairs == 5 || stairs == 9) {
                teleportToY += 6400;
            } else if (stairs == 4 || stairs == 6 || stairs == 10) {
                teleportToY -= 6400;
            } else if (stairs == 7) {
                teleportToX = 3104;
                teleportToY = 9576;
            } else if (stairs == 8) {
                teleportToX = 3105;
                teleportToY = 3162;
            } else if (stairs == 11) {
                teleportToX = 2856;
                teleportToY = 9570;
            } else if (stairs == 12) {
                teleportToX = 2857;
                teleportToY = 3167;
            } else if (stairs == 13) {
                heightLevel += 3;
                teleportToX = skillX;
                teleportToY = skillY;
            } else if (stairs == 15) {
                teleportToY += (6400 - (stairDistance + stairDistanceAdd));
            } else if (stairs == 14) {
                teleportToY -= (6400 - (stairDistance + stairDistanceAdd));
            } else if (stairs == 16) {
                teleportToX = 2828;
                teleportToY = 9772;
            } else if (stairs == 17) {
                teleportToX = 3494;
                teleportToY = 3465;
            } else if (stairs == 18) {
                teleportToX = 3477;
                teleportToY = 9845;
            } else if (stairs == 19) {
                teleportToX = 3543;
                teleportToY = 3463;
            } else if (stairs == 20) {
                teleportToX = 3549;
                teleportToY = 9865;
            } else if (stairs == 21) {
                teleportToY += (stairDistance + stairDistanceAdd);
            } else if (stairs == 22) {
                teleportToY -= (stairDistance + stairDistanceAdd);
            } else if (stairs == 23) {
                teleportToX = 2480;
                teleportToY = 5175;
            } else if (stairs == 24) {
                teleportToX = 2862;
                teleportToY = 9572;
            } else if (stairs == 25) {
                Essence = (heightLevel / 4);
                heightLevel = 0;
                teleportToX = EssenceMineRX[Essence];
                teleportToY = EssenceMineRY[Essence];
            } else if (stairs == 26) {
                int EssenceRnd = misc.random3(EssenceMineX.length);
                teleportToX = EssenceMineX[EssenceRnd];
                teleportToY = EssenceMineY[EssenceRnd];
                heightLevel = (Essence * 4);
            } else if (stairs == 27) {
                teleportToX = 2453;
                teleportToY = 4468;
            } else if (stairs == 28) {
                teleportToX = 3201;
                teleportToY = 3169;
            }
            if (stairs == 5 || stairs == 10) {
                teleportToX += (stairDistance + stairDistanceAdd);
            }
            if (stairs == 6 || stairs == 9) {
                teleportToX -= (stairDistance - stairDistanceAdd);
            }
        }
        resetStairs();
        return true;
    }

    public boolean resetStairs() {
        stairs = 0;
        skillX = -1;
        skillY = -1;
        stairDistance = 1;
        stairDistanceAdd = 0;
        IsUsingSkill = false;
        return true;
    }

    public boolean crackCracker() {
        sendMessage("Somone used a crackers on you...");
        CrackerMsg = false;
        if (CrackerForMe == true) {
            if (freeSlots() > 0) {
                addItem(Items.randomPHat(), 1);
                sendMessage("And you get the crackers item.");
            } else {
                sendMessage("but you don't have enough space in your inventory.");
            }
            CrackerForMe = false;
        } else {
            sendMessage("but you didn't get the crackers item.");
        }
        return true;
    }

    public boolean IsInWilderness(int coordX, int coordY, int Type) {
        if (Type == 1) {
            if (coordY >= 3520 && coordY <= 3967 && coordX <= 3392 && coordX >= 2942) {
                return true;
            }
        } else if (Type == 2) {
            if (coordY >= 3512 && coordY <= 3967 && coordX <= 3392 && coordX >= 2942) {
                return true;
            }
        }
        return false;
    }

    public boolean Attack() {
        int EnemyX = PlayerHandler.players[AttackingOn].absX;
        int EnemyY = PlayerHandler.players[AttackingOn].absY;
        int EnemyHP = PlayerHandler.players[AttackingOn].playerLevel[playerHitpoints];
        int EnemyHPExp = PlayerHandler.players[AttackingOn].playerXP[playerHitpoints];
        boolean RingOfLife = false;
        if (PlayerHandler.players[AttackingOn].playerEquipment[playerRing] == 2570) {
            RingOfLife = true;
        }
        int hitDiff = 0;
        hitDiff = misc.random(playerMaxHit);
        if (GoodDistance(EnemyX, EnemyY, absX, absY, 1) == true) {
            if (actionTimer == 0) {
                if (IsInWilderness(EnemyX, EnemyY, 1) == true) {
                    if (RingOfLife == true && EnemyHP <= (int) ((double) ((double) getLevelForXP(EnemyHPExp) / 10.0) + 0.5))
                    {
                        PlayerHandler.players[AttackingOn].SafeMyLife = true;
                    } else {
                        if (PlayerHandler.players[AttackingOn].IsDead == true) {
                            ResetAttack();
                        } else {
                            actionAmount++;
                            setAnimation(playerSEA);
                            PlayerHandler.players[AttackingOn].hitUpdateRequired = true;
                            PlayerHandler.players[AttackingOn].updateRequired = true;
                            PlayerHandler.players[AttackingOn].appearanceUpdateRequired = true;
                            if ((EnemyHP - hitDiff) < 0) {
                                hitDiff = EnemyHP;
                            }
                            PlayerHandler.players[AttackingOn].hitDiff = hitDiff;
                            actionTimer = 7;
                        }
                    }
                    return true;
                } else {
                    sendMessage("This player is not in the Wilderness.");
                    ResetAttack();
                }
            }
        }
        return false;
    }

    public boolean ResetAttack() {
        IsAttacking = false;
        AttackingOn = 0;
        resetAnimation();
        IsUsingSkill = false;
        return true;
    }

    public boolean ApplyDead() {
        if (IsDeadTimer == false) {
            actionAmount++;
            actionTimer = 20;
            ResetAttack();
            ResetAttackNPC();
            setAnimation(0x900);
            sendMessage("You have died.");
            IsDeadTimer = true;
        }
        if (actionTimer == 0 && IsDeadTimer == true) {
            teleportToX = 3254;
            teleportToY = 3420;
            IsDeadTeleporting = true;
            playerLevel[playerHitpoints] = getLevelForXP(playerXP[playerHitpoints]);
            setSkillLevel(playerHitpoints, playerLevel[playerHitpoints], playerXP[playerHitpoints]);
            resetAnimation();
            updateRequired = true;
            appearanceUpdateRequired = true;
        }
        return true;
    }

    public boolean ApplyRingOfLife() {
        if (IsDeadTimer == false) {
            actionAmount++;
            actionTimer = 4;
            ResetAttack();
            setAnimation(0x718);
            sendMessage("Ring of Life saved your life !");
            deleteequiment(2570, playerRing); //2570 = ring of life
            IsDeadTimer = true;
        }
        if (actionTimer == 0 && IsDeadTimer == true) {
            teleportToX = 3254;
            teleportToY = 3420;
            resetAnimation();
            IsDeadTeleporting = true;
            updateRequired = true;
            appearanceUpdateRequired = true;
        }
        return true;
    }

    public boolean CheckForSkillUse() { //Use Items On Items
        boolean GoOn = true;
        if (useitems[0] == 946) { //knife
            CheckKnifeUsage();
        } else if (useitems[0] == 1777) { //string
            CheckStringUsage();
        } else if (useitems[0] == 314) { //feathers
            CheckFeatherUsage();
        } else
        if (useitems[1] == 1019 || useitems[1] == 1021 || useitems[1] == 1023 || useitems[1] == 1027 || useitems[1] == 1029 || useitems[1] == 1031 || useitems[1] == 1007)
        {
            CheckDyeCape();
        } else if (useitems[0] == 1755) { //chisel
            CheckCuttingGem();
        } else
        if (useitems[1] == 946 || useitems[1] == 1777 || useitems[1] == 314 || useitems[1] == 1755 || useitems[0] == 1019 || useitems[0] == 1021 || useitems[0] == 1023 || useitems[0] == 1027 || useitems[0] == 1029 || useitems[0] == 1031 || useitems[0] == 1007)
        {
            int temp;
            temp = useitems[0];
            useitems[0] = useitems[1];
            useitems[1] = temp;
            temp = useitems[3];
            useitems[3] = useitems[2];
            useitems[2] = temp;
            CheckForSkillUse();
        } else {
            sendMessage("Nothing interesting is happening.");
        }
        return true;
    }

    public boolean CheckForSkillUse2(int ItemID, int ItemSlot) { //Use Items On Object
        boolean GoFalse = false;
        switch (ItemID) {
            case 317: //raw shrimps
                cooking[1] = 1;
                cooking[2] = 30;
                cooking[4] = 315;
                cooking[6] = 323;
                break;
            case 321: //raw anchovies
                cooking[1] = 1;
                cooking[2] = 30;
                cooking[4] = 319;
                cooking[6] = 323;
                break;
            case 327: //raw sardine
                cooking[1] = 1;
                cooking[2] = 40;
                cooking[4] = 325;
                cooking[6] = 369;
                break;
            case 331: //raw salmon
                cooking[1] = 25;
                cooking[2] = 90;
                cooking[4] = 329;
                cooking[6] = 343;
                break;
            case 335: //raw trout
                cooking[1] = 15;
                cooking[2] = 70;
                cooking[4] = 333;
                cooking[6] = 343;
                break;
            case 341: //raw cod
                cooking[1] = 18;
                cooking[2] = 75;
                cooking[4] = 339;
                cooking[6] = 343;
                break;
            case 345: //raw harring
                cooking[1] = 5;
                cooking[2] = 50;
                cooking[4] = 347;
                cooking[6] = 357;
                break;
            case 349: //raw pike
                cooking[1] = 20;
                cooking[2] = 80;
                cooking[4] = 351;
                cooking[6] = 357;
                break;
            case 353: //raw mackerel
                cooking[1] = 10;
                cooking[2] = 60;
                cooking[4] = 355;
                cooking[6] = 357;
                break;
            case 359: //raw tuna
                cooking[1] = 30;
                cooking[2] = 100;
                cooking[4] = 361;
                cooking[6] = 367;
                break;
            case 363: //raw bass
                cooking[1] = 43;
                cooking[2] = 130;
                cooking[4] = 365;
                cooking[6] = 367;
                break;
            case 371: //raw swordfish
                cooking[1] = 45;
                cooking[2] = 140;
                cooking[4] = 373;
                cooking[6] = 375;
                break;
            case 377: //raw lobster
                cooking[1] = 40;
                cooking[2] = 120;
                cooking[4] = 379;
                cooking[6] = 381;
                break;
            case 383: //raw shark
                cooking[1] = 80;
                cooking[2] = 210;
                cooking[4] = 385;
                cooking[6] = 387;
                break;
            case 389: //raw mante ray
                cooking[1] = 91;
                cooking[2] = 216;
                cooking[4] = 391;
                cooking[6] = 393;
                break;
            case 395: //raw sea turtle
                cooking[1] = 82;
                cooking[2] = 212;
                cooking[4] = 397;
                cooking[6] = 399;
                break;
            case 436: //copper ore
                if (IsItemInBag(438) == true) {
                    smelting[0] = 1;
                    smelting[1] = 1;
                    if (misc.random(2) == 1) {
                        smelting[2] = 6;
                    } else {
                        smelting[2] = 7;
                    }
                    smelting[3] = 2349;
                } else {
                    sendMessage("You need 1 copper ore and 1 tin ore to smelt 1 bronze bar.");
                    return false;
                }
                break;
            case 438: //tin
                if (IsItemInBag(436) == true) {
                    smelting[0] = 1;
                    smelting[1] = 1;
                    if (misc.random(2) == 1) {
                        smelting[2] = 6;
                    } else {
                        smelting[2] = 7;
                    }
                    smelting[3] = 2349;
                } else {
                    sendMessage("You need 1 copper ore and 1 tin ore to smelt 1 bronze bar.");
                    return false;
                }
                break;
            case 440: //iron
                smelting[0] = 1;
                if (AreXItemsInBag(453, 2) == true) {
                    smelting[1] = 30;
                    if (misc.random(2) == 1) {
                        smelting[2] = 17;
                    } else {
                        smelting[2] = 18;
                    }
                    smelting[3] = 2353;
                    smelting[6] = 2;
                } else {
                    smelting[1] = 15;
                    if (misc.random(2) == 1) {
                        smelting[2] = 12;
                    } else {
                        smelting[2] = 13;
                    }
                    smelting[3] = 2349;
                }
                break;
            case 2892: //elemental
                if (AreXItemsInBag(453, 4) == true) {
                    smelting[0] = 1;
                    smelting[1] = 20;
                    smelting[2] = 18;
                    smelting[3] = 2893;
                    smelting[6] = 4;
                } else {
                    sendMessage("You need 1 elemental ore and 4 coal to smelt 1 elemental bar.");
                    return false;
                }
                break;
            case 442: //silver
                smelting[0] = 1;
                smelting[1] = 20;
                if (misc.random(2) == 1) {
                    smelting[2] = 13;
                } else {
                    smelting[2] = 14;
                }
                smelting[3] = 2355;
                break;
            case 444: //gold
                smelting[0] = 1;
                smelting[1] = 40;
                if (playerEquipment[playerHands] == 776) {
                    if (misc.random(2) == 1) {
                        smelting[2] = 56;
                    } else {
                        smelting[2] = 57;
                    }
                } else {
                    if (misc.random(2) == 1) {
                        smelting[2] = 22;
                    } else {
                        smelting[2] = 23;
                    }
                }
                smelting[3] = 2357;
                break;
            case 447: //mithril
                if (AreXItemsInBag(453, 4) == true) {
                    smelting[0] = 1;
                    smelting[1] = 50;
                    smelting[2] = 30;
                    smelting[3] = 2359;
                    smelting[6] = 4;
                } else {
                    sendMessage("You need 1 mithril ore and 4 coal to smelt 1 mithril bar.");
                    return false;
                }
                break;
            case 449: //adamantite
                if (AreXItemsInBag(453, 6) == true) {
                    smelting[0] = 1;
                    smelting[1] = 70;
                    if (misc.random(2) == 1) {
                        smelting[2] = 37;
                    } else {
                        smelting[2] = 38;
                    }
                    smelting[3] = 2361;
                    smelting[6] = 6;
                } else {
                    sendMessage("You need 1 adamant ore and 4 coal to smelt 1 adamant bar.");
                    return false;
                }
                break;
            case 451: //runite
                if (AreXItemsInBag(453, 8) == true) {
                    smelting[0] = 1;
                    smelting[1] = 85;
                    smelting[2] = 50;
                    smelting[3] = 2363;
                    smelting[6] = 8;
                } else {
                    sendMessage("You need 1 runite ore and 4 coal to smelt 1 runite bar.");
                    return false;
                }
                break;
            case 453: //coal
                if (IsItemInBag(451) == true) {            //runite
                    CheckSmelting(451, GetItemSlot(451));
                } else if (IsItemInBag(449) == true) {        //adamant
                    CheckSmelting(449, GetItemSlot(449));
                } else if (IsItemInBag(447) == true) {        //mithril
                    CheckSmelting(447, GetItemSlot(447));
                } else if (IsItemInBag(2892) == true) {        //elemental
                    CheckSmelting(2892, GetItemSlot(2892));
                } else if (IsItemInBag(440) == true) {        //iron (to make steel)
                    CheckSmelting(440, GetItemSlot(440));
                }
                break;
            case 1889: //uncooked cake
                cooking[1] = 40;
                cooking[2] = 180;
                cooking[4] = 1891;
                cooking[6] = 1903;
                break;
            case 2001: //Uncooked stew
                cooking[1] = 25;
                cooking[2] = 117;
                cooking[4] = 2003;
                cooking[6] = 2005;
                break;
            case 2009: //Uncooked curry
                cooking[1] = 60;
                cooking[2] = 280;
                cooking[4] = 2011;
                cooking[6] = 2013;
                break;
            case 2132: //raw beef
            case 2134: //raw rat meat
            case 2136: //raw bear meat
                cooking[1] = 1;
                cooking[2] = 30;
                cooking[4] = 2142;
                cooking[6] = 2146;
                break;
            case 2138: //raw chicken
                cooking[1] = 1;
                cooking[2] = 30;
                cooking[4] = 2140;
                cooking[6] = 2144;
                break;
            case 2287: //uncooked pizza
                cooking[1] = 35;
                cooking[2] = 143;
                cooking[4] = 2289;
                cooking[6] = 2305;
                break;
            case 2307: //bread dough
                cooking[1] = 1;
                cooking[2] = 40;
                cooking[4] = 2309;
                cooking[6] = 2311;
                break;
            case 2317: //uncooked apple pie
                cooking[1] = 30;
                cooking[2] = 104;
                cooking[4] = 2323;
                cooking[6] = 2329;
                break;
            case 2319: //uncooked meat pie
                cooking[1] = 20;
                cooking[2] = 104;
                cooking[4] = 2327;
                cooking[6] = 2329;
                break;
            case 2321: //uncooked berry pie
                cooking[1] = 10;
                cooking[2] = 78;
                cooking[4] = 2325;
                cooking[6] = 2329;
                break;
            case 2876: //Raw chompy
                cooking[1] = 20;
                cooking[2] = 140;
                cooking[4] = 2878;
                cooking[6] = 2880;
                break;
            case 3142: //Raw karambwan
                cooking[1] = 1;
                cooking[2] = 80;
                cooking[4] = 3144;
                cooking[6] = 3148;
                break;
            case 3363: //Thin snail
                cooking[1] = 12;
                cooking[2] = 70;
                cooking[4] = 3369;
                cooking[6] = 3375;
                break;
            case 3365: //Lean snail
                cooking[1] = 17;
                cooking[2] = 80;
                cooking[4] = 3371;
                cooking[6] = 3375;
                break;
            case 3367: //Fat snail
                cooking[1] = 22;
                cooking[2] = 95;
                cooking[4] = 3373;
                cooking[6] = 3375;
                break;
            case 3379: //Slimy eel
                cooking[1] = 28;
                cooking[2] = 95;
                cooking[4] = 3381;
                cooking[6] = 3383;
                break;
            case 5001: //Raw cave eel
                cooking[1] = 28;
                cooking[2] = 115;
                cooking[4] = 5003;
                cooking[6] = 5002;
                break;
            case 5986: //Sweetcorn
                cooking[1] = 21;
                cooking[2] = 104;
                cooking[4] = 5988;
                cooking[6] = 5990;
                break;
            case 6293: //Spider on stick
                cooking[1] = 16;
                cooking[2] = 80;
                cooking[4] = 6297;
                cooking[6] = 6301;
                break;
            case 6295: //Spider on shaft
                cooking[1] = 16;
                cooking[2] = 80;
                cooking[4] = 6299;
                cooking[6] = 6303;
                break;
            default:
                sendMessage("You cannot smelt this item.");
                GoFalse = true;
                break;
        }
        if (GoFalse == true) {
            return false;
        }
        if (ItemID != 453 && smelting[0] >= 1) {
            OriginalWeapon = playerEquipment[playerWeapon];
            playerEquipment[playerWeapon] = -1;
            OriginalShield = playerEquipment[playerShield];
            playerEquipment[playerShield] = -1;
            smelting[4] = ItemID;
            smelting[5] = ItemSlot;
        } else if (cooking[1] >= 1) {
            cooking[0] = 1;
            cooking[5] = ItemID;
        }
        return true;
    }

    public boolean CheckForSkillUse3(int Item, int Slot) {
        boolean GoOn = true;
        switch (Item) {
            case 315: //Shrimps
                healing[1] = 3;
                healing[2] = 3;
                healing[3] = -1;
                break;
            case 319: //Anchovies
                healing[1] = 1;
                healing[2] = 1;
                healing[3] = -1;
                break;
            case 325: //Sardine
                healing[1] = 4;
                healing[2] = 4;
                healing[3] = -1;
                break;
            case 329: //Salmon
                healing[1] = 9;
                healing[2] = 9;
                healing[3] = -1;
                break;
            case 333: //Trout
                healing[1] = 7;
                healing[2] = 7;
                healing[3] = -1;
                break;
            case 339: //Cod
                healing[1] = 7;
                healing[2] = 7;
                healing[3] = -1;
                break;
            case 347: //Herring
                healing[1] = 5;
                healing[2] = 5;
                healing[3] = -1;
                break;
            case 351: //Pike
                healing[1] = 8;
                healing[2] = 8;
                healing[3] = -1;
                break;
            case 355: //Mackerel
                healing[1] = 6;
                healing[2] = 6;
                healing[3] = -1;
                break;
            case 361: //Tuna
                healing[1] = 10;
                healing[2] = 10;
                healing[3] = -1;
                break;
            case 365: //Bass
                healing[1] = 13;
                healing[2] = 13;
                healing[3] = -1;
                break;
            case 373: //Swordfish
                healing[1] = 14;
                healing[2] = 14;
                healing[3] = -1;
                break;
            case 379: //Lobster
                healing[1] = 12;
                healing[2] = 12;
                healing[3] = -1;
                break;
            case 385: //Shark
                healing[1] = 20;
                healing[2] = 20;
                healing[3] = -1;
                break;
            case 391: //Manta ray
                healing[1] = 22;
                healing[2] = 22;
                healing[3] = -1;
                break;
            case 397: //Sea turtle
                healing[1] = 21;
                healing[2] = 21;
                healing[3] = -1;
                break;
            case 534: //Baby Blue Dragon Bones
                prayer[2] = 30;
                break;
            case 536: //Dragon Bones
                prayer[2] = 72;
                break;
            case 526: //Bones
            case 528: //Burnt Bones
            case 2859: //Wolf Bones
                if (misc.random2(2) == 1) {
                    prayer[2] = 4;
                } else {
                    prayer[2] = 5;
                }
                break;
            case 530: //Bat Bones
                if (misc.random2(3) == 1) {
                    prayer[2] = 4;
                } else {
                    prayer[2] = 5;
                }
                break;
            case 532: //Big Bones
            case 3125: //Jogre Bones
                prayer[2] = 15;
                break;
            case 1885: //Ugthanki kebab
            case 2011: //Curry
                healing[1] = 19;
                healing[2] = 19;
                healing[3] = -1;
                break;
            case 1891: //Cake
                healing[1] = 4;
                healing[2] = 4;
                healing[3] = 1893;
                break;
            case 1893: //2/3 cake
                healing[1] = 4;
                healing[2] = 4;
                healing[3] = 1895;
                break;
            case 1895: //Slice of cake
            case 1977: //Chocolatey milk
            case 2333: //Half a redberry pie
                healing[1] = 4;
                healing[2] = 4;
                healing[3] = -1;
                break;
            case 1897: //Chocolate cake
                healing[1] = 5;
                healing[2] = 5;
                healing[3] = 1899;
                break;
            case 1899: //2/3 chocolate cake
                healing[1] = 5;
                healing[2] = 5;
                healing[3] = 1901;
                break;
            case 1901: //Chocolate slice
            case 2331: //Half a meat pie
            case 2309: //Bread
                healing[1] = 5;
                healing[2] = 5;
                healing[3] = -1;
                break;
            case 1993: //Jug of wine
            case 2003: //Stew
            case 2303: //1/2pineapple pizza
                healing[1] = 11;
                healing[2] = 11;
                healing[3] = -1;
                break;
            case 2149: //Lava eel
            case 2343: //Cooked oomlie wrap
                healing[1] = 14;
                healing[2] = 14;
                healing[3] = -1;
                break;
            case 2289: //Plain pizza
                healing[1] = 7;
                healing[2] = 7;
                healing[3] = 2291;
                break;
            case 2291: //1/2 plain pizza
            case 2335: //Half an apple pie
                healing[1] = 7;
                healing[2] = 7;
                healing[3] = -1;
                break;
            case 2293: //Meat pizza
                healing[1] = 8;
                healing[2] = 8;
                healing[3] = 2295;
                break;
            case 2295: //1/2 meat pizza
                healing[1] = 8;
                healing[2] = 8;
                healing[3] = -1;
                break;
            case 2297: //Anchovy pizza
                healing[1] = 9;
                healing[2] = 9;
                healing[3] = 2299;
                break;
            case 2299: //1/2 anchovy pizza
                healing[1] = 9;
                healing[2] = 9;
                healing[3] = -1;
                break;
            case 2301: //Pineapple pizza
                healing[1] = 11;
                healing[2] = 11;
                healing[3] = 2303;
                break;
            case 2323: //Apple pie
                healing[1] = 7;
                healing[2] = 7;
                healing[3] = 2335;
                break;
            case 3225: //Redberry pie
                healing[1] = 5;
                healing[2] = 5;
                healing[3] = 2333;
                break;
            case 2327: //Meat pie
                healing[1] = 6;
                healing[2] = 6;
                healing[3] = 2331;
                break;
            case 2878: //Cooked chompy
                healing[1] = 10;
                healing[2] = 10;
                healing[3] = -1;
                break;
            case 3123: //Shaikahan Bones
                prayer[2] = 25;
                break;
            case 3144: //Cooked karambwan
            case 3146: //Cooked karambwan
                healing[1] = 18;
                healing[2] = 18;
                healing[3] = -1;
                break;
            case 3179: //Monkey Bones
                prayer[2] = 5;
                break;
            case 3369: //Thin snail meat
            case 3371: //Lean snail meat
            case 3373: //Fat snail meat
                healing[1] = 5;
                healing[2] = 9;
                healing[3] = -1;
                break;
            case 3381: //Cooked slimy eel
                healing[1] = 6;
                healing[2] = 10;
                healing[3] = -1;
                break;
            case 4291: //Cooked chicken
            case 4293: //Cooked meat
            case 4242: //Cup of tea (nettle tea)
                healing[1] = 3;
                healing[2] = 3;
                healing[3] = -1;
                break;
            case 4812: //Zogre Bones
                if (misc.random2(2) == 1) {
                    prayer[2] = 22;
                } else {
                    prayer[2] = 23;
                }
                break;
            case 4830: //Fayrg Bones
                prayer[2] = 87;
                break;
            case 4832: //Raurg Bones
                prayer[2] = 96;
                break;
            case 4834: //Ourg Bones
                prayer[2] = 140;
                break;
            case 5003: //Cave eel
                healing[1] = 7;
                healing[2] = 11;
                healing[3] = -1;
                break;
            case 5988: //Sweetcorn
                healing[1] = (int) Math.floor((double) ((double) ((double) (playerLevel[playerHitpoints] / 100) * 10) + 0.5));
                healing[2] = (int) Math.floor((double) ((double) ((double) (playerLevel[playerHitpoints] / 100) * 10) + 0.5));
                healing[3] = -1;
                break;
            case 6297: //Spider on stick
            case 6299: //Spider on shaft
                healing[1] = 7;
                healing[2] = 10;
                healing[3] = -1;
                break;
            default:
                sendMessage("Nothing interesting is happening.");
                println_debug("Prayer Usage - ItemID: " + Item);
                GoOn = false;
                break;
        }
        if (GoOn == false) {
            return false;
        }
        if (prayer[2] > 0) {
            prayer[0] = 1;
            prayer[4] = Item;
            prayer[5] = Slot;
        } else if (healing[1] > 0) {
            healing[0] = 1;
            healing[4] = Item;
        }
        return true;
    }

    public boolean IsItemInBag(int ItemID) {
        for (int i = 0; i < playerItems.length; i++) {
            if ((playerItems[i] - 1) == ItemID) {
                return true;
            }
        }
        return false;
    }

    public boolean AreXItemsInBag(int ItemID, int Amount) {
        int ItemCount = 0;
        for (int i = 0; i < playerItems.length; i++) {
            if ((playerItems[i] - 1) == ItemID) {
                ItemCount++;
            }
            if (ItemCount == Amount) {
                return true;
            }
        }
        return false;
    }

    public int GetItemSlot(int ItemID) {
        for (int i = 0; i < playerItems.length; i++) {
            if ((playerItems[i] - 1) == ItemID) {
                return i;
            }
        }
        return -1;
    }

    public int GetXItemsInBag(int ItemID) {
        int ItemCount = 0;
        for (int i = 0; i < playerItems.length; i++) {
            if ((playerItems[i] - 1) == ItemID) {
                ItemCount++;
            }
        }
        return ItemCount;
    }

    public void AddDroppedItems() {
        if (IsDropping == false) {
            IsDropping = true;
            int tmpX = 0;
            int tmpY = 0;
            int calcX = 0;
            int calcY = 0;
            for (int i = 0; i < server.itemHandler.DropItemCount; i++) {
                if (server.itemHandler.DroppedItemsID[i] > -1) {
                    tmpX = server.itemHandler.DroppedItemsX[i];
                    tmpY = server.itemHandler.DroppedItemsY[i];
                    calcX = tmpX - absX;
                    calcY = tmpY - absY;
                    if (calcX >= -16 && calcX <= 15 && calcY >= -16 && calcY <= 15 && MustDelete[i] == false && server.itemHandler.DroppedItemsH[i] == heightLevel)
                    {
                        if (IsDropped[i] == false && (server.itemHandler.DroppedItemsDDelay[i] <= 0 || server.itemHandler.DroppedItemsDropper[i] == playerId))
                        {
                            IsDropped[i] = true;
                            outStream.createFrame(85);
                            outStream.writeByteC((server.itemHandler.DroppedItemsY[i] - 8 * mapRegionY));
                            outStream.writeByteC((server.itemHandler.DroppedItemsX[i] - 8 * mapRegionX));
                            outStream.createFrame(44); //create item mainFrame
                            outStream.writeWordBigEndianA(server.itemHandler.DroppedItemsID[i]);
                            outStream.writeWord(server.itemHandler.DroppedItemsN[i]); //amount
                            outStream.writeByte(0); // x(4 MSB) y(LSB) coords
                        }
                    } else if (IsDropped[i] == true || MustDelete[i] == true) {
                        outStream.createFrame(85);
                        outStream.writeByteC((server.itemHandler.DroppedItemsY[i] - 8 * mapRegionY));
                        outStream.writeByteC((server.itemHandler.DroppedItemsX[i] - 8 * mapRegionX));
                        outStream.createFrame(156); //remove item mainFrame
                        outStream.writeByteS(0); // x(4 MSB) y(LSB) coords
                        outStream.writeWord(server.itemHandler.DroppedItemsID[i]);
                        int LastPlayerInList = -1;
                        int TotalPlayers = 0;
                        for (int j = 1; j < PlayerHandler.maxPlayers; j++) {
                            if (PlayerHandler.players[j] != null) {
                                LastPlayerInList = j;
                                TotalPlayers++;
                            }
                        }
                        if (MustDelete[i] == true) {
                            MustDelete[i] = false;
                            server.itemHandler.DroppedItemsDeletecount[i]++;
                            if ((LastPlayerInList == playerId || LastPlayerInList == -1) && server.itemHandler.DroppedItemsDeletecount[i] == TotalPlayers)
                            {
                                if (server.itemHandler.DroppedItemsAlwaysDrop[i] == true) {
                                    server.itemHandler.DroppedItemsDropper[i] = -1;
                                    server.itemHandler.DroppedItemsDDelay[i] = server.itemHandler.SDID;
                                } else {
                                    server.itemHandler.ResetItem(i);
                                }
                                for (int j = 1; j < PlayerHandler.maxPlayers; j++) {
                                    if (PlayerHandler.players[j] != null) {
                                        PlayerHandler.players[j].IsDropped[i] = false;
                                    }
                                }
                            }
                        } else {
                            IsDropped[i] = false;
                        }
                    }
                }
            }
            IsDropping = false;
        }
    }

    public int Tradecompete = 0;
    public int Publicchat = 0;

    public void pmstatus(int status) { //status: loading = 0  connecting = 1  fine = 2
        outStream.createFrame(221);
        outStream.writeByte(status);
    }

    public boolean isinpm(long l) {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] != 0) {
                if (l == friends[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pmupdate(int pmid, int world) {
        long l = misc.playerNameToInt64(handler.players[pmid].playerName);
        if (handler.players[pmid].Privatechat == 0) {
            for (int i = 0; i < friends.length; i++) {
                if (friends[i] != 0) {
                    if (l == friends[i]) {
                        loadpm(l, world);
                        return;
                    }
                }
            }
        } else if (handler.players[pmid].Privatechat == 1) {
            for (int i1 = 0; i1 < friends.length; i1++) {
                if (friends[i] != 0) {
                    if (l == friends[i1]) {
                        if (handler.players[pmid].isinpm(misc.playerNameToInt64(playerName)) && playerRights > 2) {
                            loadpm(l, world);
                            return;
                        } else {
                            loadpm(l, 0);
                            return;
                        }
                    }
                }
            }
        } else if (handler.players[pmid].Privatechat == 2) {
            for (int i2 = 0; i2 < friends.length; i2++) {
                if (friends[i] != 0) {
                    if (l == friends[i2] && playerRights < 2) {
                        loadpm(l, 0);
                        return;
                    }
                }
            }
        }
    }

    public void sendpm(long name, int rights, byte[] chatmessage, int messagesize) {
        outStream.createFrameVarSize(196);
        outStream.writeQWord(name);
        outStream.writeDWord(handler.lastchatid++);//must be different for each message
        outStream.writeByte(rights);
        outStream.writeBytes(chatmessage, messagesize, 0);
        outStream.endFrameVarSize();
    }

    public void loadpm(long name, int world) {
        if (world != 0) world += 9;
        outStream.createFrame(50);
        outStream.writeQWord(name);
        outStream.writeByte(world);
    }

    public boolean AttackNPC() {
        int EnemyX = server.npcHandler.npcs[attacknpc].absX;
        int EnemyY = server.npcHandler.npcs[attacknpc].absY;
        int EnemyHP = server.npcHandler.npcs[attacknpc].HP;
        int hitDiff = 0;
        hitDiff = misc.random(playerMaxHit);
        if (GoodDistance(EnemyX, EnemyY, absX, absY, 1) == true) {
            if (actionTimer == 0) {
                if (server.npcHandler.npcs[attacknpc].IsDead == true) {
                    ResetAttackNPC();
                } else {
                    actionAmount++;
                    setAnimation(playerSEA);
                    if ((EnemyHP - hitDiff) < 0) {
                        hitDiff = EnemyHP;
                    }
                    server.npcHandler.npcs[attacknpc].hitDiff = hitDiff;
                    server.npcHandler.npcs[attacknpc].Killing[playerId] += hitDiff;
                    server.npcHandler.npcs[attacknpc].updateRequired = true;
                    server.npcHandler.npcs[attacknpc].hitUpdateRequired = true;
                    double TotalExp = 0;
                    if (FightType != 3) {
                        TotalExp = (double) (4 * hitDiff);
                        TotalExp = (double) (TotalExp * CombatExpRate);
                        addSkillXP((int) (TotalExp), SkillID);
                    } else {
                        TotalExp = (double) (1.33 * hitDiff);
                        TotalExp = (double) (TotalExp * CombatExpRate);
                        addSkillXP((int) (TotalExp), playerAttack);
                        addSkillXP((int) (TotalExp), playerDefence);
                        addSkillXP((int) (TotalExp), playerStrength);
                    }
                    TotalExp = (double) (1.33 * hitDiff);
                    TotalExp = (double) (TotalExp * CombatExpRate);
                    addSkillXP((int) (TotalExp), playerHitpoints);
                    actionTimer = 7;
                }
                return true;
            }
        }
        return false;
    }

    public boolean ResetAttackNPC() {
        if (attacknpc > -1 && attacknpc < server.npcHandler.maxNPCs) {
            server.npcHandler.npcs[attacknpc].IsUnderAttack = false;
        }
        IsAttackingNPC = false;
        attacknpc = -1;
        resetAnimation();
        return true;
    }

    public void ManipulateDirection() {
        //playerMD = misc.direction(absX, absY, skillX, skillY);
        if (playerMD != -1) {
            //playerMD >>= 1;
            updateRequired = true;
            dirUpdateRequired = true;
        }
    }

    public void ReplaceObject(int objectX, int objectY, int NewObjectID, int Face) {
        outStream.createFrameVarSizeWord(60);
        outStream.writeByte(objectY - (mapRegionY * 8));
        outStream.writeByteC(objectX - (mapRegionX * 8));
        /*DELETE OBJECT*/
        outStream.writeByte(101);
        outStream.writeByteC(0);
        outStream.writeByte(0);
        /*CREATE OBJECT*/
        if (NewObjectID > -1) {
            outStream.writeByte(151);
            outStream.writeByteS(0);
            outStream.writeWordBigEndian(NewObjectID);
            outStream.writeByteA(Face); //0= WEST | -1 = NORTH | -2 = EAST | -3 = SOUTH
        }
        outStream.endFrameVarSizeWord();
    }

    public int GetNPCID(int coordX, int coordY) {
        for (int i = 0; i < server.npcHandler.maxNPCs; i++) {
            if (server.npcHandler.npcs[i] != null) {
                if (server.npcHandler.npcs[i].absX == coordX && server.npcHandler.npcs[i].absY == coordY) {
                    return server.npcHandler.npcs[i].npcType;
                }
            }
        }
        return 1;
    }

    public String GetNpcName(int NpcID) {
        for (int i = 0; i < server.npcHandler.maxListedNPCs; i++) {
            if (server.npcHandler.NpcList[i] != null) {
                if (server.npcHandler.NpcList[i].npcId == NpcID) {
                    return server.npcHandler.NpcList[i].npcName;
                }
            }
        }
        return "!! NOT EXISTING NPCs !!! - ID:" + NpcID;
    }

    public String GetItemName(int ItemID) {
        for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
            if (server.itemHandler.ItemList[i] != null) {
                if (server.itemHandler.ItemList[i].itemId == ItemID) {
                    return server.itemHandler.ItemList[i].itemName;
                }
            }
        }
        return "!! NOT EXISTING ITEM !!! - ID:" + ItemID;
    }

    public double GetItemShopValue(int ItemID, int Type, int fromSlot) {
        double ShopValue = 1;
        double Overstock = 0;
        double TotPrice = 0;
        for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
            if (server.itemHandler.ItemList[i] != null) {
                if (server.itemHandler.ItemList[i].itemId == ItemID) {
                    ShopValue = server.itemHandler.ItemList[i].ShopValue;
                }
            }
        }
        Overstock = server.shopHandler.ShopItemsN[MyShopID][fromSlot] - server.shopHandler.ShopItemsSN[MyShopID][fromSlot];
        TotPrice = (ShopValue * 1.26875); //Calculates price for 1 item, in db is stored for 0 items (strange but true)
        if (Overstock > 0) { //more then default -> cheaper
            TotPrice -= ((ShopValue / 100) * (1.26875 * Overstock));
        } else if (Overstock < 0) { //less then default -> exspensive
            TotPrice += ((ShopValue / 100) * (1.26875 * Overstock));
        }
        if (server.shopHandler.ShopBModifier[MyShopID] == 1) {
            TotPrice *= 1.25; //25% more expensive (general stores only)
            if (Type == 1) {
                TotPrice *= 0.4; //general store buys item at 40% of its own selling value
            }
        } else if (Type == 1) {
            TotPrice *= 0.6; //other stores buy item at 60% of their own selling value
        }
        return TotPrice;
    }

    public int GetUnnotedItem(int ItemID) {
        int NewID = 0;
        String NotedName = "";
        for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
            if (server.itemHandler.ItemList[i] != null) {
                if (server.itemHandler.ItemList[i].itemId == ItemID) {
                    NotedName = server.itemHandler.ItemList[i].itemName;
                }
            }
        }
        for (int i = 0; i < server.itemHandler.MaxListedItems; i++) {
            if (server.itemHandler.ItemList[i] != null) {
                if (server.itemHandler.ItemList[i].itemName == NotedName) {
                    if (server.itemHandler.ItemList[i].itemDescription.startsWith("Swap this note at any bank for a") == false)
                    {
                        NewID = server.itemHandler.ItemList[i].itemId;
                        break;
                    }
                }
            }
        }
        return NewID;
    }

    public void WriteEnergy() {
        if (playerRights < 2 && playerEnergy > 100) {
            playerEnergy = 100;
        }
        sendFrame126(playerEnergy + "%", 149);
    }

    public void ResetBonus() {
        for (int i = 0; i < playerBonus.length; i++) {
            playerBonus[i] = 0;
        }
    }

    public void GetBonus() {
        for (int i = 0; i < playerEquipment.length; i++) {
            if (playerEquipment[i] > -1) {
                for (int j = 0; j < server.itemHandler.MaxListedItems; j++) {
                    if (server.itemHandler.ItemList[i] != null) {
                        if (server.itemHandler.ItemList[j].itemId == playerEquipment[i]) {
                            for (int k = 0; k < playerBonus.length; k++) {
                                playerBonus[k] += server.itemHandler.ItemList[j].Bonuses[k];
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    public void WriteBonus() {
        int offset = 0;
        String send = "";
        for (int i = 0; i < playerBonus.length; i++) {
            if (playerBonus[i] >= 0) {
                send = BonusName[i] + ": +" + playerBonus[i];
            } else {
                send = BonusName[i] + ": -" + java.lang.Math.abs(playerBonus[i]);
            }

            if (i == 10) {
                offset = 1;
            }
            sendFrame126(send, (1675 + i + offset));
        }
        CalculateMaxHit();
        /*for (int i = 4000; i <= 7000; i++) {
              sendFrame126("T"+i, i);
              println_debug("Sended: Test"+i);
          }*///USED FOR TESTING INTERFACE NUMBERS !
    }

    public void CalculateMaxHit() {
        double MaxHit = 0;
        int StrBonus = playerBonus[10]; //Strength Bonus
        int Strength = playerLevel[playerStrength]; //Strength
        if (FightType == 1 || FightType == 4) { //Accurate & Defensive
            MaxHit += (double) (1.05 + (double) ((double) (StrBonus * Strength) * 0.00175));
        } else if (FightType == 2) { //Aggresive
            MaxHit += (double) (1.35 + (double) ((double) (StrBonus) * 0.00525));
        } else if (FightType == 3) { //Controlled
            MaxHit += (double) (1.15 + (double) ((double) (StrBonus) * 0.00175));
        }
        MaxHit += (double) (Strength * 0.1);
        if (StrPotion == 1) { //Strength Potion
            MaxHit += (double) (Strength * 0.0014);
        } else if (StrPotion == 2) { //Super Strength Potion
            MaxHit += (double) (Strength * 0.0205);
        }
        if (StrPrayer == 1) { //Burst Of Strength
            MaxHit += (double) (Strength * 0.005);
        } else if (StrPrayer == 2) { //Super Human Strength
            MaxHit += (double) (Strength * 0.01);
        } else if (StrPrayer == 3) { //Ultimate Strength
            MaxHit += (double) (Strength * 0.015);
        }
        playerMaxHit = (int) Math.floor(MaxHit);
    }

    public boolean GoodDistance(int objectX, int objectY, int playerX, int playerY, int distance) {
        for (int i = 0; i <= distance; i++) {
            for (int j = 0; j <= distance; j++) {
                if ((objectX + i) == playerX && ((objectY + j) == playerY || (objectY - j) == playerY || objectY == playerY))
                {
                    return true;
                } else
                if ((objectX - i) == playerX && ((objectY + j) == playerY || (objectY - j) == playerY || objectY == playerY))
                {
                    return true;
                } else
                if (objectX == playerX && ((objectY + j) == playerY || (objectY - j) == playerY || objectY == playerY))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean GoodDistance2(int objectX, int objectY, int playerX, int playerY, int distance) {
        for (int i = 0; i <= distance; i++) {
            for (int j = 0; j <= distance; j++) {
                if (objectX == playerX && ((objectY + j) == playerY || (objectY - j) == playerY || objectY == playerY))
                {
                    return true;
                } else
                if (objectY == playerY && ((objectX + j) == playerX || (objectX - j) == playerX || objectX == playerX))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean CheckObjectSkill(int objectID) {
        boolean GoFalse = false;
        switch (objectID) {
/*

WOODCUTTING

*/
            case 1276:
            case 1277:
            case 1278:
            case 1279:
            case 1280:
            case 1330:
            case 1332:
            case 2409:
            case 3033:
            case 3034:
            case 3035:
            case 3036:
            case 3879:
            case 3881:
            case 3882:
            case 3883: //Normal Tree
            case 1315:
            case 1316:
            case 1318:
            case 1319: //Evergreen
            case 1282:
            case 1283:
            case 1284:
            case 1285:
            case 1286:
            case 1287:
            case 1289:
            case 1290:
            case 1291:
            case 1365:
            case 1383:
            case 1384:
            case 5902:
            case 5903:
            case 5904: //Dead Tree
                woodcutting[0] = 1;
                woodcutting[1] = 1;
                woodcutting[2] = 25;
                woodcutting[4] = 1511;
                break;
            case 2023: //Achey Tree
                woodcutting[0] = 2;
                woodcutting[1] = 1;
                woodcutting[2] = 25;
                woodcutting[4] = 2862;
                break;
            case 1281:
            case 3037: //Oak Tree
                woodcutting[0] = 3;
                woodcutting[1] = 15;
                if (misc.random(2) == 1) {
                    woodcutting[2] = 37;
                } else {
                    woodcutting[2] = 38;
                }
                woodcutting[4] = 1521;
                break;
            case 1308:
            case 5551:
            case 5552:
            case 5553: //Willow Tree
                woodcutting[0] = 4;
                woodcutting[1] = 30;
                if (misc.random(2) == 1) {
                    woodcutting[2] = 67;
                } else {
                    woodcutting[2] = 68;
                }
                woodcutting[4] = 1519;
                break;
            case 9036: //Teak Tree
                woodcutting[0] = 5;
                woodcutting[1] = 35;
                woodcutting[2] = 85;
                woodcutting[4] = 6333;
                break;
            case 1292: //Dramen Tree
                woodcutting[0] = 5;
                woodcutting[1] = 36;
                woodcutting[2] = 0;
                woodcutting[4] = 771;
                break;
            case 1307:
            case 4674: //Maple Tree
                woodcutting[0] = 6;
                woodcutting[1] = 45;
                woodcutting[2] = 100;
                woodcutting[4] = 1517;
                break;
            case 2289:
            case 4060: //Hollow Tree
                woodcutting[0] = 7;
                woodcutting[1] = 45;
                if (misc.random(2) == 1) {
                    woodcutting[2] = 82;
                } else {
                    woodcutting[2] = 83;
                }
                woodcutting[4] = 3239;
                break;
            case 9034: //Mahogany Tree
                woodcutting[0] = 8;
                woodcutting[1] = 50;
                woodcutting[2] = 125;
                woodcutting[4] = 4445;
                break;
            case 1309: //Yew Tree
                woodcutting[0] = 9;
                woodcutting[1] = 60;
                woodcutting[2] = 175;
                woodcutting[4] = 1515;
                woodcutting[5] = 3;
                break;
            case 1306: //Magic Tree
                woodcutting[0] = 10;
                woodcutting[1] = 75;
                woodcutting[2] = 250;
                woodcutting[4] = 1513;
                break;
/*

MINING

*/
            case 2491: //rune essence
                mining[0] = 1;
                mining[1] = 1;
                mining[2] = 5;
                mining[4] = 1436;
                break;
            case 2108:
            case 2109: //clay rock
                mining[0] = 1;
                mining[1] = 1;
                mining[2] = 5;
                mining[4] = 434;
                break;
            case 2090:
            case 2091: //copper rock
                mining[0] = 1;
                mining[1] = 1;
                if (misc.random(2) == 1) {
                    mining[2] = 17;
                } else {
                    mining[2] = 18;
                }
                mining[4] = 436;
                break;
            case 2094:
            case 2095: //tin rock
                mining[0] = 1;
                mining[1] = 1;
                if (misc.random(2) == 1) {
                    mining[2] = 17;
                } else {
                    mining[2] = 18;
                }
                mining[4] = 438;
                break;
            case 2110: //blurite rock
                mining[0] = 2;
                mining[1] = 10;
                if (misc.random(2) == 1) {
                    mining[2] = 17;
                } else {
                    mining[2] = 18;
                }
                mining[4] = 668;
                break;
            case 4028:
            case 4029:
            case 4030: //lime rock
                mining[0] = 1;
                mining[1] = 1;
                if (misc.random(2) == 1) {
                    mining[2] = 26;
                } else {
                    mining[2] = 27;
                }
                mining[4] = 3211;
                break;
            case 2092:
            case 2093: //iron rock
                mining[0] = 3;
                mining[1] = 15;
                mining[2] = 35;
                mining[4] = 440;
                break;
            case 2100:
            case 2101: //silver rock
                mining[0] = 4;
                mining[1] = 20;
                mining[2] = 40;
                mining[4] = 442;
                break;
            case 3403: //elemental rock
                mining[0] = 4;
                mining[1] = 20;
                mining[2] = 20;
                mining[4] = 2892;
                break;
            case 2096:
            case 2097: //coal rock
                mining[0] = 5;
                mining[1] = 30;
                mining[2] = 50;
                mining[4] = 453;
                break;
            case 2098:
            case 2099: //gold rock
                mining[0] = 6;
                mining[1] = 40;
                mining[2] = 65;
                break;
/*GEM ROCK
			case :
			case : //gem rock
				mining[0] = 6;
				mining[1] = 40;
				mining[2] = 65;
				mining[4] = Items.randomSGems();
				break;
*/
            case 2102:
            case 2103: //mithril rock
                mining[0] = 7;
                mining[1] = 55;
                mining[2] = 80;
                mining[4] = 447;
                break;
            case 2104:
            case 2105: //adamant rock
                mining[0] = 8;
                mining[1] = 70;
                mining[2] = 95;
                mining[4] = 449;
                break;
            case 2106:
            case 2107: //rune rock
                mining[0] = 9;
                mining[1] = 85;
                mining[2] = 125;
                mining[4] = 451;
                break;
            default:
                GoFalse = true;
                break;
        }
        if (GoFalse == true) {
            return false;
        }
        return true;
    }
/*COOKING*/

    public boolean cooking() {
        if (playerLevel[playerCooking] >= cooking[1]) {
            if (actionTimer == 0 && cooking[0] == 1) {
                actionAmount++;
                actionTimer = 4;
                OriginalShield = playerEquipment[playerShield];
                OriginalWeapon = playerEquipment[playerWeapon];
                playerEquipment[playerShield] = -1;
                playerEquipment[playerWeapon] = -1;
                setAnimation(0x380);
                cooking[0] = 2;
            }
            if (actionTimer == 0 && cooking[0] == 2) {
                deleteItem(cooking[5], GetItemSlot(cooking[5]), 1);
                int Discount = 0;
                if (playerEquipment[playerHands] == 775) { //Cooking hauntlets
                    Discount = 10;
                }
                int StopBurnLevel = ((cooking[1] + 35) - Discount);
                if (StopBurnLevel > playerLevel[playerCooking] && misc.random2(StopBurnLevel) <= misc.random2(StopBurnLevel))
                {
                    addItem(cooking[6], 1);
                    sendMessage("You burned the " + GetItemName(cooking[5]) + ".");
                } else {
                    addItem(cooking[4], 1);
                    addSkillXP((cooking[2] * cooking[3]), playerCooking);
                    sendMessage("You cooked the " + GetItemName(cooking[5]) + ".");
                }
                playerEquipment[playerWeapon] = OriginalWeapon;
                playerEquipment[playerShield] = OriginalShield;
                OriginalWeapon = -1;
                OriginalShield = -1;
                resetAnimation();
                resetCO();
            }
        } else {
            sendMessage("You need " + cooking[1] + " " + statName[playerCooking] + " to cook this " + GetItemName(cooking[5]) + ".");
            resetCO();
            return false;
        }
        return true;
    }

    public boolean resetCO() {
        cooking[0] = 0;
        cooking[1] = 0;
        cooking[2] = 0;
        cooking[4] = -1;
        IsUsingSkill = false;
        return true;
    }
/*CRAFTING*/

    public void CheckDyeCape() {
        boolean GoOn = true;
        int CapeXP = 0;
        int NewCape = -1;
        switch (useitems[0]) {
            case 1763: //red dye
                NewCape = 1007;
                CapeXP = 2;
            case 1767: //blue dye
                NewCape = 1021;
                CapeXP = 2;
            case 1765: //yellow dye
                NewCape = 1023;
                CapeXP = 2;
            case 1771: //green dye
                NewCape = 1027;
                CapeXP = 3;
            case 1773: //purple dye
                NewCape = 1029;
                CapeXP = 3;
            case 1769: //orange dye
                NewCape = 1031;
                CapeXP = 3;
            default:
                sendMessage("Nothing interesting is happening.");
                GoOn = false;
                break;
        }
        if (GoOn == true) {
            deleteItem(useitems[0], useitems[3], playerItemsN[useitems[3]]);
            deleteItem(useitems[1], useitems[2], playerItemsN[useitems[2]]);
            addItem(NewCape, 1);
            addSkillXP((CapeXP * crafting[3]), playerCrafting);
        }
    }

    public void CheckCuttingGem() {
        boolean GoOn = true;
        switch (useitems[1]) {
            case 1617: //uncut diamond
                crafting[1] = 43;
                if (misc.random2(2) == 1) {
                    crafting[2] = 107;
                } else {
                    crafting[2] = 108;
                }
                break;
            case 1619: //uncut ruby
                crafting[1] = 34;
                crafting[2] = 85;
                break;
            case 1621: //uncut emerald
                crafting[1] = 27;
                if (misc.random2(2) == 1) {
                    crafting[2] = 67;
                } else {
                    crafting[2] = 68;
                }
                break;
            case 1623: //uncut sapphire
                crafting[1] = 20;
                crafting[2] = 50;
                break;
            case 1625: //uncut opal
                if (misc.random2(2) == 1) {
                    crafting[4] = 1633;
                }
                crafting[1] = 1;
                crafting[2] = 15;
                break;
            case 1627: //uncut jada
                if (misc.random2(2) == 1) {
                    crafting[4] = 1633;
                }
                crafting[1] = 13;
                crafting[2] = 20;
                break;
            case 1629: //uncut red topaz
                if (misc.random2(2) == 1) {
                    crafting[4] = 1633;
                }
                crafting[1] = 16;
                crafting[2] = 25;
                break;
            case 1631: //uncut dragonstone
                crafting[1] = 55;
                if (misc.random2(2) == 1) {
                    crafting[2] = 127;
                } else {
                    crafting[2] = 128;
                }
                break;
            default:
                sendMessage("Nothing interesting is happening.");
                GoOn = false;
                break;
        }
        if (GoOn == true) {
            crafting[0] = 1;
            if (crafting[4] == -1) {
                crafting[4] = (useitems[1] - 16); //16 item id's lower is the cutted gem.
            }
        }
    }

    public boolean crafting() {
        if (playerLevel[playerCrafting] >= crafting[1]) {
            if (actionTimer == 0 && crafting[0] == 1) {
                actionAmount++;
                actionTimer = 4;
                OriginalShield = playerEquipment[playerShield];
                OriginalWeapon = playerEquipment[playerWeapon];
                playerEquipment[playerShield] = useitems[0];
                playerEquipment[playerWeapon] = useitems[1];
                setAnimation(0x8DD);
                crafting[0] = 2;
            }
            if (actionTimer == 0 && crafting[0] == 2) {
                deleteItem(useitems[1], useitems[2], playerItemsN[useitems[2]]);
                addItem(crafting[4], 1);
                if (crafting[4] == 1633) {
                    sendMessage("You crushed the gem.");
                } else {
                    addSkillXP((crafting[2] * crafting[3]), playerCrafting);
                    sendMessage("You successfully cut the gem.");
                }
                playerEquipment[playerWeapon] = OriginalWeapon;
                playerEquipment[playerShield] = OriginalShield;
                OriginalWeapon = -1;
                OriginalShield = -1;
                resetAnimation();
                resetCR();
            }
        } else {
            sendMessage("You need " + crafting[1] + " " + statName[playerCrafting] + " to cut this gem.");
            resetCR();
            return false;
        }
        return true;
    }

    public boolean resetCR() {
        crafting[0] = 0;
        crafting[1] = 0;
        crafting[2] = 0;
        crafting[4] = -1;
        useitems[0] = -1;
        useitems[1] = -1;
        useitems[2] = -1;
        useitems[3] = -1;
        IsUsingSkill = false;
        return true;
    }
/*FISHING*/

    public boolean fishing() {
        if (playerLevel[playerFishing] >= fishing[1]) {
            if (freeSlots() > 0) {
                if (fishing[0] == 1) {
                    ManipulateDirection();
                    OriginalShield = playerEquipment[playerShield];
                    OriginalWeapon = playerEquipment[playerWeapon];
                    playerEquipment[playerShield] = fishing[6]; //Harpoon
                    playerEquipment[playerWeapon] = -1;
                    setAnimation(fishing[7]);
                    fishing[0] = 2;
                    sendMessage("You start fishing with your " + GetItemName(fishing[6]) + "...");
                }
                int Rnd = ((99 - fishing[1]) - (playerLevel[playerFishing] - fishing[1]));
                if (Rnd <= 1) {
                    Rnd = 2;
                }
                if (fishing[0] == 2 && misc.random2(Rnd) == 1) {
                    boolean DoFish = true;
                    if (fishing[5] > -1) {
                        if (IsItemInBag(fishing[5]) == false) {
                            DoFish = false;
                            sendMessage("You have run out of " + GetItemName(fishing[5]) + ".");
                            playerEquipment[playerWeapon] = OriginalWeapon;
                            playerEquipment[playerShield] = OriginalShield;
                            OriginalWeapon = -1;
                            OriginalShield = -1;
                            resetAnimation();
                            resetFI();
                        } else {
                            deleteItem(fishing[5], GetItemSlot(fishing[5]), 1);
                        }
                    }
                    if (DoFish == true) {
                        if (fishing[8] > 0) {
                            GetRandomFish();
                        }
                        addItem(fishing[4], 1);
                        addSkillXP((fishing[2] * fishing[3]), playerFishing);
                        sendMessage("You catch a " + GetItemName(fishing[4]) + ".");
                    }
                }
            } else {
                sendMessage("Not enough space in your inventory.");
                if (fishing[0] > 0) {
                    playerEquipment[playerWeapon] = OriginalWeapon;
                    playerEquipment[playerShield] = OriginalShield;
                    OriginalWeapon = -1;
                    OriginalShield = -1;
                    resetAnimation();
                }
                resetFI();
            }
        } else {
            sendMessage("You need " + fishing[1] + " " + statName[playerFishing] + " to fish here.");
            resetFI();
            return false;
        }
        return true;
    }

    public boolean resetFI() {
        fishing[0] = 0;
        fishing[1] = 0;
        fishing[2] = 0;
        fishing[4] = -1;
        fishing[5] = -1;
        fishing[6] = -1;
        fishing[7] = 0;
        fishing[8] = 0;
        IsUsingSkill = false;
        return true;
    }

    public void GetRandomFish() {
        boolean Go = true;
        int Rnd;
        switch (fishing[8]) {
            case 1:
                while (Go == true) {
                    Rnd = misc.random3(Items.fishing_net.length);
                    if (playerLevel[playerFishing] >= Items.fishing_net_lvl[Rnd]) {
                        fishing[4] = Items.fishing_net[Rnd];
                        fishing[2] = Items.fishing_net_xp[Rnd];
                        Go = false;
                    }
                }
                break;
            case 2:
                while (Go == true) {
                    Rnd = misc.random3(Items.fishing_rod1.length);
                    if (playerLevel[playerFishing] >= Items.fishing_rod1_lvl[Rnd]) {
                        fishing[4] = Items.fishing_rod1[Rnd];
                        fishing[2] = Items.fishing_rod1_xp[Rnd];
                        Go = false;
                    }
                }
                break;
            case 3:
                while (Go == true) {
                    Rnd = misc.random3(Items.fishing_rod2.length);
                    if (playerLevel[playerFishing] >= Items.fishing_rod2_lvl[Rnd]) {
                        fishing[4] = Items.fishing_rod2[Rnd];
                        fishing[2] = Items.fishing_rod2_xp[Rnd];
                        Go = false;
                    }
                }
                break;
            case 4:
                while (Go == true) {
                    Rnd = misc.random3(Items.fishing_fly.length);
                    if (playerLevel[playerFishing] >= Items.fishing_fly_lvl[Rnd]) {
                        fishing[4] = Items.fishing_fly[Rnd];
                        fishing[2] = Items.fishing_fly_xp[Rnd];
                        Go = false;
                    }
                }
                break;
            case 5:
                while (Go == true) {
                    Rnd = misc.random3(Items.fishing_big_net.length);
                    if (playerLevel[playerFishing] >= Items.fishing_big_net_lvl[Rnd]) {
                        fishing[4] = Items.fishing_big_net[Rnd];
                        fishing[2] = Items.fishing_big_net_xp[Rnd];
                        Go = false;
                    }
                }
                break;
            case 6:
                while (Go == true) {
                    Rnd = misc.random3(Items.fishing_harpoon.length);
                    if (playerLevel[playerFishing] >= Items.fishing_harpoon_lvl[Rnd]) {
                        fishing[4] = Items.fishing_harpoon[Rnd];
                        fishing[2] = Items.fishing_harpoon_xp[Rnd];
                        Go = false;
                    }
                }
                break;
        }
    }
/*FLETCHING*/

    public boolean CheckKnifeUsage() {
        boolean GoOn = true;
        switch (useitems[1]) {
            case 771:
                fletching[1] = 1;
                fletching[2] = 0;
                fletching[4] = 772;
                fletching[6] = 4;
                fletching[0] = 1;
                break;
            case 2862:
                if (fletching[6] == 3 && fletching[5] == 3) {
                    sendMessage("Achey Logs: 1 = ogre arrow shafts | 2 = ogre composite bow");
                    resetFL();
                    break;
                }
            case 1513:
            case 1515:
            case 1517:
            case 1519:
            case 1521:
                if (fletching[6] == 1 && fletching[5] == 2) {
                    sendMessage("You cannot fletch Arrow Shaft from these logs.");
                    resetFL();
                    break;
                }
            case 1511:
                if (fletching[5] == 0) {
                    outStream.createFrame(27);
                    fletching[5] = 1;
                } else if (fletching[5] == 2) {
                    switch (fletching[6]) {
                        case 1:
                            if (useitems[1] == 1511) {
                                fletching[1] = 1;
                                fletching[2] = 5;
                                fletching[4] = 52;
                            } else if (useitems[1] == 2862) {
                                fletching[1] = 5;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 1;
                                } else {
                                    fletching[2] = 2;
                                }
                                fletching[4] = 2864;
                                fletching[6] = 5;
                            }
                            break;
                        case 2:
                            if (useitems[1] == 1511) {
                                fletching[1] = 5;
                                fletching[2] = 5;
                                fletching[4] = 50;
                            } else if (useitems[1] == 1513) {
                                fletching[1] = 80;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 83;
                                } else {
                                    fletching[2] = 84;
                                }
                                fletching[4] = 72;
                            } else if (useitems[1] == 1515) {
                                fletching[1] = 65;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 67;
                                } else {
                                    fletching[2] = 68;
                                }
                                fletching[4] = 68;
                            } else if (useitems[1] == 1517) {
                                fletching[1] = 50;
                                fletching[2] = 50;
                                fletching[4] = 64;
                            } else if (useitems[1] == 1519) {
                                fletching[1] = 35;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 33;
                                } else {
                                    fletching[2] = 34;
                                }
                                fletching[4] = 60;
                            } else if (useitems[1] == 1521) {
                                fletching[1] = 20;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 16;
                                } else {
                                    fletching[2] = 17;
                                }
                                fletching[4] = 54;
                            } else if (useitems[1] == 2862) {
                                boolean flag = false;
                                for (int i = 0; i < playerItems.length; i++) {
                                    if ((playerItems[i] - 1) == 2859) {
                                        flag = true;
                                    }
                                }
                                if (flag == false) {
                                    sendMessage("To make an ogre composite bow you must have wolf bones in your inventory.");
                                    resetFL();
                                    return false;
                                }
                                fletching[1] = 30;
                                fletching[2] = 45;
                                fletching[4] = 4825;
                                fletching[6] = 6;
                            }
                            break;
                        case 3:
                            if (useitems[1] == 1511) {
                                fletching[1] = 10;
                                fletching[2] = 10;
                                fletching[4] = 48;
                            } else if (useitems[1] == 1513) {
                                fletching[1] = 85;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 91;
                                } else {
                                    fletching[2] = 92;
                                }
                                fletching[4] = 70;
                            } else if (useitems[1] == 1515) {
                                fletching[1] = 70;
                                fletching[2] = 75;
                                fletching[4] = 66;
                            } else if (useitems[1] == 1517) {
                                fletching[1] = 55;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 58;
                                } else {
                                    fletching[2] = 59;
                                }
                                fletching[4] = 62;
                            } else if (useitems[1] == 1519) {
                                fletching[1] = 40;
                                if (misc.random(2) == 1) {
                                    fletching[2] = 41;
                                } else {
                                    fletching[2] = 42;
                                }
                                fletching[4] = 58;
                            } else if (useitems[1] == 1521) {
                                fletching[1] = 25;
                                fletching[2] = 25;
                                fletching[4] = 56;
                            }
                            break;
                    }
                    fletching[0] = 1;
                }
                break;
            default:
                sendMessage("Nothing interesting is happening.");
                GoOn = false;
                break;
        }
        return true;
    }

    public void CheckStringUsage() {
        boolean GoOn = true;
        switch (useitems[1]) {
            case 48:
                fletching[1] = 10;
                fletching[2] = 10;
                fletching[4] = 839;
                break;
            case 50:
                fletching[1] = 5;
                fletching[2] = 5;
                fletching[4] = 841;
                break;
            case 54:
                fletching[1] = 20;
                if (misc.random(2) == 1) {
                    fletching[2] = 16;
                } else {
                    fletching[2] = 17;
                }
                fletching[4] = 843;
                break;
            case 56:
                fletching[1] = 25;
                fletching[2] = 25;
                fletching[4] = 845;
                break;
            case 58:
                fletching[1] = 40;
                if (misc.random(2) == 1) {
                    fletching[2] = 41;
                } else {
                    fletching[2] = 42;
                }
                fletching[4] = 847;
                break;
            case 60:
                fletching[1] = 35;
                if (misc.random(2) == 1) {
                    fletching[2] = 33;
                } else {
                    fletching[2] = 34;
                }
                fletching[4] = 849;
                break;
            case 62:
                fletching[1] = 55;
                if (misc.random(2) == 1) {
                    fletching[2] = 58;
                } else {
                    fletching[2] = 59;
                }
                fletching[4] = 851;
                break;
            case 64:
                fletching[1] = 50;
                fletching[2] = 50;
                fletching[4] = 853;
                break;
            case 66:
                fletching[1] = 70;
                fletching[2] = 75;
                fletching[4] = 855;
                break;
            case 68:
                fletching[1] = 65;
                if (misc.random(2) == 1) {
                    fletching[2] = 67;
                } else {
                    fletching[2] = 68;
                }
                fletching[4] = 857;
                break;
            case 70:
                fletching[1] = 85;
                if (misc.random(2) == 1) {
                    fletching[2] = 91;
                } else {
                    fletching[2] = 92;
                }
                fletching[4] = 859;
                break;
            case 72:
                fletching[1] = 80;
                if (misc.random(2) == 1) {
                    fletching[2] = 83;
                } else {
                    fletching[2] = 84;
                }
                fletching[4] = 861;
                break;
            case 4825:
                fletching[1] = 30;
                fletching[2] = 45;
                fletching[4] = 4827;
                break;
            default:
                sendMessage("Nothing interesting is happening.");
                GoOn = false;
                break;
        }
        if (GoOn == true) {
            fletching2(3, 1, 1);
        }
    }

    public boolean CheckFeatherUsage() {
        boolean GoOn = true;
        int Amount1 = 15;
        int Amount2 = Amount1;
        int Status = 1;
        if (freeSlots() > 0) {
            switch (useitems[1]) {
                case 39:
                    Status = 2;
                    fletching[1] = 1;
                    if (misc.random(2) == 1) {
                        fletching[2] = 19;
                    } else {
                        fletching[2] = 20;
                    }
                    fletching[4] = 882;
                    break;
                case 40:
                    if (DialogueHandler.DialogueType[NpcDialogue] == 1 || DialogueHandler.DialogueType[NpcDialogue] == 3)
                    {
                        NpcDialogue = DialogueHandler.DialogueNextDia[NpcDialogue];
                        NpcDialogueSend = false;
                        if (NpcDialogue == 0) {
                            RemoveAllWindows();
                        }
                    }
                    break;
                case 41:
                    Status = 2;
                    fletching[1] = 30;
                    fletching[2] = 75;
                    fletching[4] = 886;
                    break;
                case 42:
                    Status = 2;
                    fletching[1] = 45;
                    if (misc.random(2) == 1) {
                        fletching[2] = 112;
                    } else {
                        fletching[2] = 113;
                    }
                    fletching[4] = 888;
                    break;
                case 43:
                    Status = 2;
                    fletching[1] = 60;
                    fletching[2] = 145;
                    fletching[4] = 890;
                    break;
                case 44:
                    Status = 2;
                    fletching[1] = 75;
                    fletching[2] = 205;
                    fletching[4] = 892;
                    break;
                case 45:
                    fletching[1] = 17;
                    fletching[2] = 6;
                    fletching[4] = 879;
                    break;
                case 46:
                    fletching[1] = 33;
                    if (misc.random(2) == 1) {
                        fletching[2] = 12;
                    } else {
                        fletching[2] = 13;
                    }
                    fletching[4] = 880;
                    break;
                case 47:
                    Amount1 *= 2;
                    Amount2 = Amount1;
                    fletching[1] = 51;
                    fletching[2] = 95;
                    fletching[4] = 881;
                    break;
                case 52:
                    fletching[1] = 1;
                    fletching[2] = 15;
                    fletching[4] = 53;
                    break;
                case 819:
                    Amount1 = 10;
                    Amount2 = Amount1;
                    Status = 4;
                    fletching[1] = 1;
                    fletching[2] = 18;
                    fletching[4] = 806;
                    break;
                case 820:
                    Amount1 = 10;
                    Amount2 = Amount1;
                    Status = 4;
                    fletching[1] = 22;
                    fletching[2] = 32;
                    fletching[4] = 807;
                    break;
                case 821:
                    Amount1 = 10;
                    Amount2 = Amount1;
                    Status = 4;
                    fletching[1] = 37;
                    fletching[2] = 75;
                    fletching[4] = 808;
                    break;
                case 822:
                    Amount1 = 10;
                    Amount2 = Amount1;
                    Status = 4;
                    fletching[1] = 52;
                    fletching[2] = 112;
                    fletching[4] = 809;
                    break;
                case 823:
                    Amount1 = 10;
                    Amount2 = Amount1;
                    Status = 4;
                    fletching[1] = 67;
                    fletching[2] = 150;
                    fletching[4] = 810;
                    break;
                case 824:
                    Amount1 = 10;
                    Amount2 = Amount1;
                    Status = 4;
                    fletching[1] = 81;
                    fletching[2] = 188;
                    fletching[4] = 811;
                    break;
                case 1539:
                    if (IsItemInBag(2347) == false) {
                        sendMessage("To make a steel brutal arrows you must have a hammer in your inventory.");
                        resetFL();
                        return false;
                    }
                    Status = 7;
                    fletching[1] = 33;
                    fletching[2] = 5;
                    fletching[4] = 4783;
                    break;
                case 2864:
                    Amount1 = (Amount2 * 4);
                    Status = 5;
                    fletching[1] = 5;
                    fletching[2] = 1;
                    fletching[4] = 2865;
                    break;
                case 2865:
                    Status = 6;
                    fletching[1] = 5;
                    fletching[2] = 1;
                    fletching[4] = 2866;
                    break;
                case 4819:
                    if (IsItemInBag(2347) == false) {
                        sendMessage("To make a bronze brutal arrows you must have a hammer in your inventory.");
                        resetFL();
                        return false;
                    }
                    Status = 7;
                    fletching[1] = 7;
                    fletching[2] = 2;
                    fletching[4] = 4773;
                    break;
                case 4820:
                    if (IsItemInBag(2347) == false) {
                        sendMessage("To make a iron brutal arrows you must have a hammer in your inventory.");
                        resetFL();
                        return false;
                    }
                    Status = 7;
                    fletching[1] = 18;
                    fletching[2] = 3;
                    fletching[4] = 4778;
                    break;
                case 4821:
                    if (IsItemInBag(2347) == false) {
                        sendMessage("To make a black brutal arrows you must have a hammer in your inventory.");
                        resetFL();
                        return false;
                    }
                    Status = 7;
                    fletching[1] = 38;
                    fletching[2] = 6;
                    fletching[4] = 4788;
                    break;
                case 4822:
                    if (IsItemInBag(2347) == false) {
                        sendMessage("To make a mithril brutal arrows you must have a hammer in your inventory.");
                        resetFL();
                        return false;
                    }
                    Status = 7;
                    fletching[1] = 49;
                    fletching[2] = 8;
                    fletching[4] = 4793;
                    break;
                case 4823:
                    if (IsItemInBag(2347) == false) {
                        sendMessage("To make a adamant brutal arrows you must have a hammer in your inventory.");
                        resetFL();
                        return false;
                    }
                    Status = 7;
                    fletching[1] = 62;
                    fletching[2] = 10;
                    fletching[4] = 4798;
                    break;
                case 4824:
                    if (IsItemInBag(2347) == false) {
                        sendMessage("To make a rune brutal arrows you must have a hammer in your inventory.");
                        resetFL();
                        return false;
                    }
                    Status = 7;
                    fletching[1] = 77;
                    fletching[2] = 12;
                    fletching[4] = 4803;
                    break;
                default:
                    sendMessage("Nothing interesting is happening.");
                    GoOn = false;
                    break;
            }
            if (useitems[1] == 2864) {
                if (playerItemsN[useitems[3]] < Amount1 || playerItemsN[useitems[2]] < Amount2) {
                    if ((playerItemsN[useitems[2]] * 4) <= Amount1) {
                        Amount2 = playerItemsN[useitems[2]];
                        Amount1 = (Amount2 * 4);
                    } else {
                        Amount1 = (playerItemsN[useitems[3]] / 4);
                        Amount2 = Amount1;
                    }
                } else {
                    sendMessage("Not enough feathers or ogre arrow shafts.");
                }
            } else {
                if (playerItemsN[useitems[3]] < Amount1 || playerItemsN[useitems[2]] < Amount2) {
                    if (playerItemsN[useitems[3]] < playerItemsN[useitems[2]]) {
                        Amount1 = playerItemsN[useitems[3]];
                        Amount2 = Amount1;
                    } else {
                        Amount2 = playerItemsN[useitems[2]];
                        Amount1 = Amount2;
                    }
                }
            }
            if (GoOn == true) {
                fletching2(Status, Amount1, Amount2);
            }
        } else {
            sendMessage("Not enough space in your inventory.");
            resetFL();
            return false;
        }
        return true;
    }

    public boolean fletching() {
        if (playerLevel[playerFletching] >= fletching[1]) {
            if (actionTimer == 0 && fletching[0] == 1) {
                actionAmount++;
                actionTimer = 4;
                OriginalShield = playerEquipment[playerShield];
                OriginalWeapon = playerEquipment[playerWeapon];
                playerEquipment[playerShield] = useitems[0];
                playerEquipment[playerWeapon] = useitems[1];
                setAnimation(0x376);
                fletching[0] = 2;
            }
            if (actionTimer == 0 && fletching[0] == 2) {
                deleteItem(useitems[1], useitems[2], playerItemsN[useitems[2]]);
                switch (fletching[6]) {
                    case 1:
                        addItem(fletching[4], 15);
                        sendMessage("You carefully cut the wood into 15 arrow shafts.");
                        break;
                    case 2:
                        addItem(fletching[4], 1);
                        sendMessage("You carefully cut the wood into an unstrung shortbow.");
                        break;
                    case 3:
                        addItem(fletching[4], 1);
                        sendMessage("You carefully cut the wood into an unstrung longbow.");
                        break;
                    case 4:
                        addItem(fletching[4], 1);
                        sendMessage("You carefully cut the wood into a dramen staff.");
                        break;
                    case 5:
                        int Amount = (misc.random(5) + 1);
                        fletching[2] *= Amount;
                        addItem(fletching[4], Amount);
                        sendMessage("You carefully cut the wood into " + Amount + " ogre arrow shafts.");
                        break;
                    case 6:
                        addItem(fletching[4], 1);
                        for (int i = 0; i < playerItems.length; i++) {
                            if ((playerItems[i] - 1) == 2859) {
                                deleteItem(2859, i, playerItemsN[i]);
                                break;
                            }
                        }
                        sendMessage("You carefully cut the wood into an unstrung Ogre Composite Bow.");
                        break;
                }
                addSkillXP((fletching[2] * fletching[3]), playerFletching);
                playerEquipment[playerWeapon] = OriginalWeapon;
                playerEquipment[playerShield] = OriginalShield;
                OriginalWeapon = -1;
                OriginalShield = -1;
                resetAnimation();
                resetFL();
            }
        } else {
            sendMessage("You need " + fletching[1] + " " + statName[playerFletching] + " to fletch those logs.");
            resetFL();
            return false;
        }
        return true;
    }

    public boolean fletching2(int Status, int Amount1, int Amount2) {
        if (playerLevel[playerFletching] >= fletching[1]) {
            addSkillXP((fletching[2] * fletching[3]), playerFletching);
            deleteItem(useitems[0], useitems[3], Amount1);
            deleteItem(useitems[1], useitems[2], Amount2);
            addItem(fletching[4], Amount2);
            if (Status == 1) {
                sendMessage("You attach feathers to " + Amount2 + " arrow shafts.");
            } else if (Status == 2) {
                sendMessage("You attach some of the heads to some of your headless arrows.");
                sendMessage("You finish making " + Amount2 + " arrows.");
            } else if (Status == 3) {
                sendMessage("You add a string to the bow.");
            } else if (Status == 4) {
                sendMessage("You finish making " + Amount2 + " darts.");
            } else if (Status == 5) {
                sendMessage("You attach feathers to " + Amount2 + " ogre arrow shafts.");
            } else if (Status == 6) {
                sendMessage("You attach some of the wolf bone arrow heads to some of your flighted ogre arrows.");
                sendMessage("You finish making " + Amount2 + " ogre arrows.");
            } else if (Status == 7) {
                sendMessage("You hammer the nails and attach some to some of your flighted ogre arrows.");
                sendMessage("You finish making " + Amount2 + " brutal arrows.");
            }
        } else {
            sendMessage("You need " + fletching[1] + " " + statName[playerFishing] + " to make this.");
            resetFL();
            return false;
        }
        resetFL();
        return true;
    }

    public boolean resetFL() {
        fletching[0] = 0;
        fletching[1] = 0;
        fletching[2] = 0;
        fletching[4] = 0;
        fletching[5] = 0;
        useitems[0] = -1;
        useitems[1] = -1;
        useitems[2] = -1;
        useitems[3] = -1;
        IsUsingSkill = false;
        return true;
    }
/*HEALING*/

    public boolean healing() {
        if (actionTimer == 0 && healing[0] == 1) {
            actionAmount++;
            actionTimer = 4;
            OriginalShield = playerEquipment[playerShield];
            OriginalWeapon = playerEquipment[playerWeapon];
            playerEquipment[playerShield] = -1;
            playerEquipment[playerWeapon] = -1;
            setAnimation(0x33D);
            healing[0] = 2;
        }
        if (actionTimer == 0 && healing[0] == 2) {
            deleteItem(healing[4], GetItemSlot(healing[4]), 1);
            int Heal = healing[1];
            int HealDiff = (healing[2] - healing[1]);
            if (HealDiff > 0) {
                Heal += misc.random(HealDiff);
            }
            if (healing[3] != -1) {
                addItem(healing[3], 1);
            }
            NewHP = (playerLevel[playerHitpoints] + Heal);
            if (NewHP > getLevelForXP(playerXP[playerHitpoints])) {
                NewHP = getLevelForXP(playerXP[playerHitpoints]);
            }
            sendMessage("You eat the " + GetItemName(healing[4]) + ".");
            playerEquipment[playerWeapon] = OriginalWeapon;
            playerEquipment[playerShield] = OriginalShield;
            OriginalWeapon = -1;
            OriginalShield = -1;
            resetAnimation();
            resetHE();
        }
        return true;
    }

    public boolean resetHE() {
        healing[0] = 0;
        healing[1] = 0;
        healing[2] = 0;
        healing[3] = -1;
        healing[4] = -1;
        IsUsingSkill = false;
        return true;
    }
/*MINING*/

    public boolean mining() {
        int MIPickAxe = 0;
        int RndGems = 50;
        if (IsMining == true) {
            MIPickAxe = 1; //If Mining -> Go trough loop, passby MICheckPickAxe to prevent originalweapon loss, 1 to tell you got pick axe, no function left for MIPickAxe if mining, so 1 is enough.
        } else {
            MIPickAxe = MICheckPickAxe();
        }
        if (MIPickAxe > 0) {
            if (playerLevel[playerMining] >= mining[1]) {
                if (freeSlots() > 0) {
                    if (actionTimer == 0 && IsMining == false) {
                        actionAmount++;
                        sendMessage("You swing your pick axe at the rock...");
                        actionTimer = (int) ((mining[0] + 10) - MIPickAxe);
                        if (actionTimer < 1) {
                            actionTimer = 1;
                        }
                        setAnimation(0x554);
                        IsMining = true;
                    }
                    if (actionTimer == 0 && IsMining == true) {
                        if (IsItemInBag(1706) == true || IsItemInBag(1708) == true || IsItemInBag(1710) == true || IsItemInBag(1712) == true)
                        {
                            RndGems /= 2;
                        }
                        if (misc.random(RndGems) == (int) (RndGems / 4)) {
                            addSkillXP((65 * mining[3]), playerMining);
                            addItem(Items.randomNGems(), 1);
                            sendMessage("You get a gem!");
                        } else {
                            addSkillXP((mining[2] * mining[3]), playerMining);
                            addItem(mining[4], 1);
                            sendMessage("You get some ores.");
                        }
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        playerEquipment[playerShield] = OriginalShield;
                        OriginalShield = -1;
                        resetAnimation();
                        resetMI();
                    }
                } else {
                    sendMessage("Not enough space in your inventory.");
                    resetMI();
                    return false;
                }
            } else {
                sendMessage("You need " + mining[1] + " " + statName[playerMining] + " to mine those ores.");
                resetMI();
                return false;
            }
        } else {
            sendMessage("You need a pick axe to mine ores.");
            resetMI();
            return false;
        }
        return true;
    }

    public boolean resetMI() {
        mining[0] = 0;
        mining[1] = 0;
        mining[2] = 0;
        mining[4] = 0;
        skillX = -1;
        skillY = -1;
        IsMining = false;
        IsUsingSkill = false;
        return true;
    }

    public int MICheckPickAxe() {
        int Hand;
        int Shield;
        int Bag;
        int PickAxe;
        Hand = playerEquipment[playerWeapon];
        Shield = playerEquipment[playerShield];
        PickAxe = 0;
        switch (Hand) {
            case 1265: //Bronze Pick Axe
                PickAxe = 1;
                break;
            case 1267: //Iron Pick Axe
                PickAxe = 2;
                break;
            case 1269: //Steel Pick Axe
                PickAxe = 3;
                break;
            case 1273: //Mithril Pick Axe
                PickAxe = 4;
                break;
            case 1271: //Adamant Pick Axe
                PickAxe = 5;
                break;
            case 1275: //Rune Pick Axe
                PickAxe = 6;
                break;
        }
        if (PickAxe > 0) {
            OriginalWeapon = Hand;
            OriginalShield = Shield;
            playerEquipment[playerShield] = -1;
            return PickAxe;
        }
        Bag = -1;
        for (int i = 0; i < playerItems.length; i++) {
            Bag = playerItems[i];
            Bag -= 1; //Only to fix the ID !
            if (Bag == 1265 || Bag == 1267 || Bag == 1269 || Bag == 1271 || Bag == 1273 || Bag == 1275) {
                break;
            }
        }
        switch (Bag) {
            case 1265: //Bronze Pick Axe
                PickAxe = 1;
                break;
            case 1267: //Iron Pick Axe
                PickAxe = 2;
                break;
            case 1269: //Steel Pick Axe
                PickAxe = 3;
                break;
            case 1273: //Mithril Pick Axe
                PickAxe = 4;
                break;
            case 1271: //Adamant Pick Axe
                PickAxe = 5;
                break;
            case 1275: //Rune Pick Axe
                PickAxe = 6;
                break;
        }
        if (PickAxe > 0) {
            OriginalWeapon = Hand;
            OriginalShield = Shield;
            playerEquipment[playerShield] = -1;
            playerEquipment[playerWeapon] = Bag;
        }
        return PickAxe;
    }
/*PRAYER*/

    public boolean prayer() {
        if (playerLevel[playerPrayer] >= prayer[1]) {
            if (actionTimer == 0 && prayer[0] == 1) {
                actionAmount++;
                actionTimer = 2;
                OriginalShield = playerEquipment[playerShield];
                OriginalWeapon = playerEquipment[playerWeapon];
                playerEquipment[playerShield] = -1;
                playerEquipment[playerWeapon] = -1;
                setAnimation(0x33B);
                prayer[0] = 2;
            }
            if (actionTimer == 0 && prayer[0] == 2) {
                deleteItem(prayer[4], prayer[5], playerItemsN[prayer[5]]);
                addSkillXP((prayer[2] * prayer[3]), playerPrayer);
                sendMessage("You bury the bones.");
                playerEquipment[playerWeapon] = OriginalWeapon;
                playerEquipment[playerShield] = OriginalShield;
                OriginalWeapon = -1;
                OriginalShield = -1;
                resetAnimation();
                resetPR();
            }
        } else {
            sendMessage("You need " + prayer[1] + " " + statName[playerPrayer] + " to bury these bones.");
            resetPR();
            return false;
        }
        return true;
    }

    public boolean resetPR() {
        prayer[0] = 0;
        prayer[1] = 0;
        prayer[2] = 0;
        prayer[4] = -1;
        prayer[5] = -1;
        IsUsingSkill = false;
        return true;
    }
/*SMITHING*/

    public boolean smelting() {
        boolean DoSmelt = true;
        if (playerLevel[playerSmithing] >= smelting[1]) {
            if (actionTimer == 0 && smelting[0] == 1) {
                actionAmount++;
                sendMessage("You place the ores in the furnace...");
                actionTimer = 8;
                if (actionTimer < 1) {
                    actionTimer = 1;
                }
                setAnimation(0x383);
                smelting[0] = 2;
            }
            if (actionTimer == 0 && smelting[0] == 2) {
                deleteItem(smelting[4], smelting[5], playerItemsN[smelting[5]]);
                if (smelting[6] > 0) {
                    for (int i = 1; i <= smelting[6]; i++) {
                        deleteItem(453, GetItemSlot(453), playerItemsN[GetItemSlot(453)]);
                    }
                }
                if (smelting[4] == 436) {
                    deleteItem(438, GetItemSlot(438), playerItemsN[GetItemSlot(438)]);
                } else if (smelting[4] == 438) {
                    deleteItem(436, GetItemSlot(436), playerItemsN[GetItemSlot(436)]);
                }
                if (smelting[3] == 2351 && playerEquipment[playerRing] != 2568) {
                    if (misc.random2(2) == 1) {
                        DoSmelt = false;
                    }
                }
                if (DoSmelt == true) {
                    addSkillXP((smelting[2] * smithing[3]), playerSmithing);
                    addItem(smelting[3], 1);
                    sendMessage("You smelted a bar.");
                    playerEquipment[playerWeapon] = OriginalWeapon;
                    OriginalWeapon = -1;
                    playerEquipment[playerShield] = OriginalShield;
                    OriginalShield = -1;
                    resetAnimation();
                    resetSmelt();
                }
            }
        } else {
            sendMessage("You need " + smelting[1] + " " + statName[playerSmithing] + " to smelt those ores.");
            resetSmelt();
            return false;
        }
        return true;
    }

    public boolean resetSmelt() {
        smelting[0] = 0;
        smelting[1] = 0;
        smelting[2] = 0;
        smelting[3] = 0;
        smelting[4] = -1;
        smelting[5] = -1;
        smelting[6] = 0;
        skillX = -1;
        skillY = -1;
        IsUsingSkill = false;
        return true;
    }

    public boolean CheckSmelting(int ItemID, int ItemSlot) {
        boolean GoFalse = false;
        switch (ItemID) {
            case 436: //copper ore
                if (IsItemInBag(438) == true) {
                    smelting[0] = 1;
                    smelting[1] = 1;
                    if (misc.random(2) == 1) {
                        smelting[2] = 6;
                    } else {
                        smelting[2] = 7;
                    }
                    smelting[3] = 2349;
                } else {
                    sendMessage("You need 1 copper ore and 1 tin ore to smelt 1 bronze bar.");
                    return false;
                }
                break;
            case 438: //tin
                if (IsItemInBag(436) == true) {
                    smelting[0] = 1;
                    smelting[1] = 1;
                    if (misc.random(2) == 1) {
                        smelting[2] = 6;
                    } else {
                        smelting[2] = 7;
                    }
                    smelting[3] = 2349;
                } else {
                    sendMessage("You need 1 copper ore and 1 tin ore to smelt 1 bronze bar.");
                    return false;
                }
                break;
            case 440: //iron
                smelting[0] = 1;
                if (AreXItemsInBag(453, 2) == true) {
                    smelting[1] = 30;
                    if (misc.random(2) == 1) {
                        smelting[2] = 17;
                    } else {
                        smelting[2] = 18;
                    }
                    smelting[3] = 2353;
                    smelting[6] = 2;
                } else {
                    smelting[1] = 15;
                    if (misc.random(2) == 1) {
                        smelting[2] = 12;
                    } else {
                        smelting[2] = 13;
                    }
                    smelting[3] = 2349;
                }
                break;
            case 2892: //elemental
                if (AreXItemsInBag(453, 4) == true) {
                    smelting[0] = 1;
                    smelting[1] = 20;
                    smelting[2] = 18;
                    smelting[3] = 2893;
                    smelting[6] = 4;
                } else {
                    sendMessage("You need 1 elemental ore and 4 coal to smelt 1 elemental bar.");
                    return false;
                }
                break;
            case 442: //silver
                smelting[0] = 1;
                smelting[1] = 20;
                if (misc.random(2) == 1) {
                    smelting[2] = 13;
                } else {
                    smelting[2] = 14;
                }
                smelting[3] = 2355;
                break;
            case 444: //gold
                smelting[0] = 1;
                smelting[1] = 40;
                if (playerEquipment[playerHands] == 776) {
                    if (misc.random(2) == 1) {
                        smelting[2] = 56;
                    } else {
                        smelting[2] = 57;
                    }
                } else {
                    if (misc.random(2) == 1) {
                        smelting[2] = 22;
                    } else {
                        smelting[2] = 23;
                    }
                }
                smelting[3] = 2357;
                break;
            case 447: //mithril
                if (AreXItemsInBag(453, 4) == true) {
                    smelting[0] = 1;
                    smelting[1] = 50;
                    smelting[2] = 30;
                    smelting[3] = 2359;
                    smelting[6] = 4;
                } else {
                    sendMessage("You need 1 mithril ore and 4 coal to smelt 1 mithril bar.");
                    return false;
                }
                break;
            case 449: //adamantite
                if (AreXItemsInBag(453, 6) == true) {
                    smelting[0] = 1;
                    smelting[1] = 70;
                    if (misc.random(2) == 1) {
                        smelting[2] = 37;
                    } else {
                        smelting[2] = 38;
                    }
                    smelting[3] = 2361;
                    smelting[6] = 6;
                } else {
                    sendMessage("You need 1 adamant ore and 4 coal to smelt 1 adamant bar.");
                    return false;
                }
                break;
            case 451: //runite
                if (AreXItemsInBag(453, 8) == true) {
                    smelting[0] = 1;
                    smelting[1] = 85;
                    smelting[2] = 50;
                    smelting[3] = 2363;
                    smelting[6] = 8;
                } else {
                    sendMessage("You need 1 runite ore and 4 coal to smelt 1 runite bar.");
                    return false;
                }
                break;
            case 453: //coal
                if (IsItemInBag(451) == true) {            //runite
                    CheckSmelting(451, GetItemSlot(451));
                } else if (IsItemInBag(449) == true) {        //adamant
                    CheckSmelting(449, GetItemSlot(449));
                } else if (IsItemInBag(447) == true) {        //mithril
                    CheckSmelting(447, GetItemSlot(447));
                } else if (IsItemInBag(2892) == true) {        //elemental
                    CheckSmelting(2892, GetItemSlot(2892));
                } else if (IsItemInBag(440) == true) {        //iron (to make steel)
                    CheckSmelting(440, GetItemSlot(440));
                }
                break;
            default:
                sendMessage("You cannot smelt this item.");
                GoFalse = true;
                break;
        }
        if (GoFalse == true) {
            return false;
        }
        if (ItemID != 453) {
            if (smelting[0] >= 1) {
                OriginalWeapon = playerEquipment[playerWeapon];
                playerEquipment[playerWeapon] = -1;
                OriginalShield = playerEquipment[playerShield];
                playerEquipment[playerShield] = -1;
                smelting[4] = ItemID;
                smelting[5] = ItemSlot;
            }
        }
        return true;
    }

    public int CheckSmithing(int ItemID, int ItemSlot) {
        boolean GoFalse = false;
        int Type = -1;
        if (IsItemInBag(2347) == false) {
            sendMessage("You need a " + GetItemName(2347) + " to hammer bars.");
            return -1;
        }
        switch (ItemID) {
            case 2349: //Bronze Bar
                Type = 1;
                break;
            case 2351: //Iron Bar
                Type = 2;
                break;
            case 2353: //Steel Bar
                Type = 3;
                break;
            case 2359: //Mithril Bar
                Type = 4;
                break;
            case 2361: //Adamantite Bar
                Type = 5;
                break;
            case 2363: //Runite Bar
                Type = 6;
                break;
            default:
                sendMessage("You cannot smith this item.");
                GoFalse = true;
                break;
        }
        if (GoFalse == true) {
            return -1;
        }
        return Type;
    }

    public void OpenSmithingFrame(int Type) {
        int Type2 = Type - 1;
        int Length = 22;
        if (Type == 1 || Type == 2) {
            Length += 1;
        } else if (Type == 3) {
            Length += 2;
        }
        //Sending amount of bars + make text green if lvl is highenough
        sendFrame126("", 1132); //Wire
        sendFrame126("", 1096);
        sendFrame126("", 11459); //Lantern
        sendFrame126("", 11461);
        sendFrame126("", 1135); //Studs
        sendFrame126("", 1134);
        String bar, color, color2, name = "";
        if (Type == 1) {
            name = "Bronze ";
        } else if (Type == 2) {
            name = "Iron ";
        } else if (Type == 3) {
            name = "Steel ";
        } else if (Type == 4) {
            name = "Mithril ";
        } else if (Type == 5) {
            name = "Adamant ";
        } else if (Type == 6) {
            name = "Rune ";
        }
        for (int i = 0; i < Length; i++) {
            bar = "bar";
            color = "@red@";
            color2 = "@bla@";
            if (Items.smithing_frame[Type2][i][3] > 1) {
                bar = bar + "s";
            }
            if (playerLevel[playerSmithing] >= Items.smithing_frame[Type2][i][2]) {
                color2 = "@whi@";
            }
            int Type3 = Type2;
            if (Type2 >= 3) {
                Type3 = (Type2 + 2);
            }
            if (AreXItemsInBag((2349 + (Type3 * 2)), Items.smithing_frame[Type2][i][3]) == true) {
                color = "@gre@";
            }
            sendFrame126(color + "" + Items.smithing_frame[Type2][i][3] + "" + bar, Items.smithing_frame[Type2][i][4]);
            sendFrame126(color2 + "" + GetItemName(Items.smithing_frame[Type2][i][0]).replace(name, ""), Items.smithing_frame[Type2][i][5]);
        }
        Items.SmithingItems[0][0] = Items.smithing_frame[Type2][0][0]; //Dagger
        Items.SmithingItems[0][1] = Items.smithing_frame[Type2][0][1];
        Items.SmithingItems[1][0] = Items.smithing_frame[Type2][4][0]; //Sword
        Items.SmithingItems[1][1] = Items.smithing_frame[Type2][4][1];
        Items.SmithingItems[2][0] = Items.smithing_frame[Type2][8][0]; //Scimitar
        Items.SmithingItems[2][1] = Items.smithing_frame[Type2][8][1];
        Items.SmithingItems[3][0] = Items.smithing_frame[Type2][9][0]; //Long Sword
        Items.SmithingItems[3][1] = Items.smithing_frame[Type2][9][1];
        Items.SmithingItems[4][0] = Items.smithing_frame[Type2][18][0]; //2 hand sword
        Items.SmithingItems[4][1] = Items.smithing_frame[Type2][18][1];
        SetSmithing(1119);
        Items.SmithingItems[0][0] = Items.smithing_frame[Type2][1][0]; //Axe
        Items.SmithingItems[0][1] = Items.smithing_frame[Type2][1][1];
        Items.SmithingItems[1][0] = Items.smithing_frame[Type2][2][0]; //Mace
        Items.SmithingItems[1][1] = Items.smithing_frame[Type2][2][1];
        Items.SmithingItems[2][0] = Items.smithing_frame[Type2][13][0]; //Warhammer
        Items.SmithingItems[2][1] = Items.smithing_frame[Type2][13][1];
        Items.SmithingItems[3][0] = Items.smithing_frame[Type2][14][0]; //Battle axe
        Items.SmithingItems[3][1] = Items.smithing_frame[Type2][14][1];
        Items.SmithingItems[4][0] = Items.smithing_frame[Type2][17][0]; //Claws
        Items.SmithingItems[4][1] = Items.smithing_frame[Type2][17][1];
        SetSmithing(1120);
        Items.SmithingItems[0][0] = Items.smithing_frame[Type2][15][0]; //Chain body
        Items.SmithingItems[0][1] = Items.smithing_frame[Type2][15][1];
        Items.SmithingItems[1][0] = Items.smithing_frame[Type2][20][0]; //Plate legs
        Items.SmithingItems[1][1] = Items.smithing_frame[Type2][20][1];
        Items.SmithingItems[2][0] = Items.smithing_frame[Type2][19][0]; //Plate skirt
        Items.SmithingItems[2][1] = Items.smithing_frame[Type2][19][1];
        Items.SmithingItems[3][0] = Items.smithing_frame[Type2][21][0]; //Plate body
        Items.SmithingItems[3][1] = Items.smithing_frame[Type2][21][1];
        Items.SmithingItems[4][0] = -1; //Lantern
        Items.SmithingItems[4][1] = 0;
        if (Type == 2 || Type == 3) {
            color2 = "@bla@";
            if (playerLevel[playerSmithing] >= Items.smithing_frame[Type2][22][2]) {
                color2 = "@whi@";
            }
            Items.SmithingItems[4][0] = Items.smithing_frame[Type2][22][0]; //Lantern
            Items.SmithingItems[4][1] = Items.smithing_frame[Type2][22][1];
            sendFrame126(color2 + "" + GetItemName(Items.smithing_frame[Type2][22][0]), 11461);
        }
        SetSmithing(1121);
        Items.SmithingItems[0][0] = Items.smithing_frame[Type2][3][0]; //Medium
        Items.SmithingItems[0][1] = Items.smithing_frame[Type2][3][1];
        Items.SmithingItems[1][0] = Items.smithing_frame[Type2][10][0]; //Full Helm
        Items.SmithingItems[1][1] = Items.smithing_frame[Type2][10][1];
        Items.SmithingItems[2][0] = Items.smithing_frame[Type2][12][0]; //Square
        Items.SmithingItems[2][1] = Items.smithing_frame[Type2][12][1];
        Items.SmithingItems[3][0] = Items.smithing_frame[Type2][16][0]; //Kite
        Items.SmithingItems[3][1] = Items.smithing_frame[Type2][16][1];
        Items.SmithingItems[4][0] = Items.smithing_frame[Type2][6][0]; //Nails
        Items.SmithingItems[4][1] = Items.smithing_frame[Type2][6][1];
        SetSmithing(1122);
        Items.SmithingItems[0][0] = Items.smithing_frame[Type2][5][0]; //Dart Tips
        Items.SmithingItems[0][1] = Items.smithing_frame[Type2][5][1];
        Items.SmithingItems[1][0] = Items.smithing_frame[Type2][7][0]; //Arrow Heads
        Items.SmithingItems[1][1] = Items.smithing_frame[Type2][7][1];
        Items.SmithingItems[2][0] = Items.smithing_frame[Type2][11][0]; //Knives
        Items.SmithingItems[2][1] = Items.smithing_frame[Type2][11][1];
        Items.SmithingItems[3][0] = -1; //Wire
        Items.SmithingItems[3][1] = 0;
        if (Type == 1) {
            color2 = "@bla@";
            if (playerLevel[playerSmithing] >= Items.smithing_frame[Type2][22][2]) {
                color2 = "@whi@";
            }
            Items.SmithingItems[3][0] = Items.smithing_frame[Type2][22][0]; //Wire
            Items.SmithingItems[3][1] = Items.smithing_frame[Type2][22][1];
            sendFrame126(color2 + "" + GetItemName(Items.smithing_frame[Type2][22][0]), 1096);
        }
        Items.SmithingItems[4][0] = -1; //Studs
        Items.SmithingItems[4][1] = 0;
        if (Type == 3) {
            color2 = "@bla@";
            if (playerLevel[playerSmithing] >= Items.smithing_frame[Type2][23][2]) {
                color2 = "@whi@";
            }
            Items.SmithingItems[4][0] = Items.smithing_frame[Type2][23][0]; //Studs
            Items.SmithingItems[4][1] = Items.smithing_frame[Type2][23][1];
            sendFrame126(color2 + "" + GetItemName(Items.smithing_frame[Type2][23][0]), 1134);
        }
        SetSmithing(1123);
        showInterface(994);
        smithing[2] = Type;
    }

    public boolean smithing() {
        if (IsItemInBag(2347) == true) {
            int bars = 0;
            int Length = 22;
            int barid = 0;
            int Level = 0;
            int ItemN = 1;
            if (smithing[2] >= 4) {
                barid = (2349 + ((smithing[2] + 1) * 2));
            } else {
                barid = (2349 + ((smithing[2] - 1) * 2));
            }
            if (smithing[2] == 1 || smithing[2] == 2) {
                Length += 1;
            } else if (smithing[2] == 3) {
                Length += 2;
            }
            for (int i = 0; i < Length; i++) {
                if (Items.smithing_frame[(smithing[2] - 1)][i][0] == smithing[4]) {
                    bars = Items.smithing_frame[(smithing[2] - 1)][i][3];
                    if (smithing[1] == 0) {
                        smithing[1] = Items.smithing_frame[(smithing[2] - 1)][i][2];
                    }
                    ItemN = Items.smithing_frame[(smithing[2] - 1)][i][1];
                }
            }
            if (playerLevel[playerSmithing] >= smithing[1]) {
                if (AreXItemsInBag(barid, bars) == true) {
                    if (freeSlots() > 0) {
                        if (actionTimer == 0 && smithing[0] == 1) {
                            actionAmount++;
                            OriginalWeapon = playerEquipment[playerWeapon];
                            playerEquipment[playerWeapon] = 2347; //Hammer
                            OriginalShield = playerEquipment[playerShield];
                            playerEquipment[playerShield] = -1;
                            sendMessage("You start hammering the bar...");
                            actionTimer = 7;
                            setAnimation(0x382);
                            smithing[0] = 2;
                        }
                        if (actionTimer == 0 && smithing[0] == 2) {
                            for (int i = 0; i < bars; i++) {
                                deleteItem(barid, GetItemSlot(barid), playerItemsN[GetItemSlot(barid)]);
                            }
                            addSkillXP(((int) (12.5 * bars * smithing[2] * smithing[3])), playerSmithing);
                            addItem(smithing[4], ItemN);
                            sendMessage("You smith a " + GetItemName(smithing[4]) + ".");
                            resetAnimation();
                            if (smithing[5] <= 1) {
                                resetSM();
                            } else {
                                actionTimer = 5;
                                smithing[5] -= 1;
                                smithing[0] = 1;
                            }
                        }
                    } else {
                        sendMessage("Not enough space in your inventory.");
                        resetSM();
                        return false;
                    }
                } else {
                    sendMessage("You need " + bars + " " + GetItemName(barid) + " to smith a " + GetItemName(smithing[4]));
                    resetAnimation();
                    resetSM();
                }
            } else {
                sendMessage("You need " + smithing[1] + " " + statName[playerSmithing] + " to smith a " + GetItemName(smithing[4]));
                resetSM();
                return false;
            }
        } else {
            sendMessage("You need a " + GetItemName(2347) + " to hammer bars.");
            resetSM();
            return false;
        }
        return true;
    }

    public boolean resetSM() {
        if (OriginalWeapon > -1) {
            playerEquipment[playerWeapon] = OriginalWeapon;
            OriginalWeapon = -1;
            playerEquipment[playerShield] = OriginalShield;
            OriginalShield = -1;
        }
        smithing[0] = 0;
        smithing[1] = 0;
        smithing[2] = 0;
        smithing[4] = -1;
        smithing[5] = 0;
        skillX = -1;
        skillY = -1;
        IsUsingSkill = false;
        return true;
    }
/*WOODCUTTING*/

    public boolean woodcutting() {
        int WCAxe = 0;
        if (IsCutting == true) {
            WCAxe = 1; //If Cutting -> Go trough loop, passby WCCheckAxe to prevent originalweapon loss, 1 to tell you got axe, no function left for WCAxe if cutting, so 1 is enough.
        } else {
            WCAxe = WCCheckAxe();
        }
        if (WCAxe > 0) {
            if (playerLevel[playerWoodcutting] >= woodcutting[1]) {
                if (freeSlots() > 0) {
                    if (actionTimer == 0 && IsCutting == false) {
                        actionAmount++;
                        sendMessage("You swing your axe at the tree...");
                        actionTimer = (int) ((woodcutting[0] + 10) - WCAxe);
                        if (actionTimer < 1) {
                            actionTimer = 1;
                        }
                        setAnimation(0x284);
                        IsCutting = true;
                    }
                    if (actionTimer == 0 && IsCutting == true) {
                        addSkillXP((woodcutting[2] * woodcutting[3]), playerWoodcutting);
                        addItem(woodcutting[4], 1);
                        sendMessage("You get some logs.");
                        playerEquipment[playerWeapon] = OriginalWeapon;
                        OriginalWeapon = -1;
                        resetAnimation();
                        IsCutting = false;
                        resetWC();
                    }
                } else {
                    sendMessage("Not enough space in your inventory.");
                    resetWC();
                    return false;
                }
            } else {
                sendMessage("You need " + woodcutting[1] + " " + statName[playerWoodcutting] + " to cut those logs.");
                resetWC();
                return false;
            }
        } else {
            sendMessage("You need an Axe to cut logs.");
            resetWC();
            return false;
        }
        return true;
    }

    public boolean resetWC() {
        woodcutting[0] = 0;
        woodcutting[1] = 0;
        woodcutting[2] = 0;
        woodcutting[4] = 0;
        woodcutting[5] = 2;
        skillX = -1;
        skillY = -1;
        IsCutting = false;
        IsUsingSkill = false;
        return true;
    }

    public int WCCheckAxe() {
        int Hand;
        int Shield;
        int Bag;
        int Axe;
        Hand = playerEquipment[playerWeapon];
        Shield = playerEquipment[playerShield];
        Axe = 0;
        switch (Hand) {
            case 1351: //Bronze Axe
                Axe = 1;
                break;
            case 1349: //Iron Axe
                Axe = 2;
                break;
            case 1353: //Steel Axe
                Axe = 3;
                break;
            case 1361: //Black Axe
                Axe = 4;
                break;
            case 1355: //Mithril Axe
                Axe = 5;
                break;
            case 1357: //Adamant Axe
                Axe = 6;
                break;
            case 1359: //Rune Axe
                Axe = 7;
                break;
                /*case X: //Dragon Axe
                    Axe = 8; break;*/
        }
        if (Axe > 0) {
            OriginalWeapon = Hand;
            OriginalShield = Shield;
            playerEquipment[playerShield] = -1;
            return Axe;
        }
        Bag = -1;
        for (int i = 0; i < playerItems.length; i++) {
            Bag = playerItems[i];
            Bag -= 1; //Only to fix the ID !
            if (Bag == 1351 || Bag == 1349 || Bag == 1353 || Bag == 1361 || Bag == 1355 || Bag == 1357 || Bag == 1359/* || Bag == X*/)
            {
                break;
            }
        }
        switch (Bag) {
            case 1351: //Bronze Axe
                Axe = 1;
                break;
            case 1349: //Iron Axe
                Axe = 2;
                break;
            case 1353: //Steel Axe
                Axe = 3;
                break;
            case 1361: //Black Axe
                Axe = 4;
                break;
            case 1355: //Mithril Axe
                Axe = 5;
                break;
            case 1357: //Adamant Axe
                Axe = 6;
                break;
            case 1359: //Rune Axe
                Axe = 7;
                break;
                /*case X: //Dragon Axe
                    Axe = 8; break;*/
        }
        if (Axe > 0) {
            OriginalWeapon = Hand;
            OriginalShield = Shield;
            playerEquipment[playerShield] = -1;
            playerEquipment[playerWeapon] = Bag;
        }
        return Axe;
    }
/*TRADING*/

    public void AcceptTrade() {
        sendFrame248(3323, 3321); //trading window + bag
        resetItems(3322);
        resetTItems(3415);
        resetOTItems(3416);
        sendFrame126("Trading With: " + PlayerHandler.players[tradeWith].playerName, 3417);
        sendFrame126("", 3431);
    }

    public void DeclineTrade() {
        for (int i = 0; i < playerTItems.length; i++) {
            if (playerTItems[i] > 0) {
                fromTrade((playerTItems[i] - 1), i, playerTItemsN[i]);
            }
        }
        resetItems(3214);
        resetTrade();
    }

    public void resetTrade() {
        tradeWith = 0;
        tradeWaitingTime = 0;
        tradeStatus = 0;
        tradeUpdateOther = false;
        tradeOtherDeclined = false;
        WanneTrade = 0;
        WanneTradeWith = 0;
        TradeConfirmed = false;
        for (int i = 0; i < playerTItems.length; i++) {
            playerTItems[i] = 0;
            playerTItemsN[i] = 0;
            playerOTItems[i] = 0;
            playerOTItemsN[i] = 0;
        }
    }

    public void ConfirmTrade() {
        if (TradeConfirmed == false) {
            RemoveAllWindows();
            for (int i = 0; i < playerOTItems.length; i++) {
                if (playerOTItems[i] > 0) {
                    addItem((playerOTItems[i] - 1), playerOTItemsN[i]);
                }
            }
            resetItems(3214);
            TradeConfirmed = true;
        }
    }

    public void TradeGoConfirm() {
        sendFrame248(3443, 3213); //trade confirm + normal bag
        resetItems(3214);
        String SendTrade = "Absolutely nothing!";
        String SendAmount = "";
        int Count = 0;
        for (int i = 0; i < playerTItems.length; i++) {
            if (playerTItems[i] > 0) {
                if (playerTItemsN[i] >= 1000 && playerTItemsN[i] < 1000000) {
                    SendAmount = "@cya@" + (playerTItemsN[i] / 1000) + "K @whi@(" + playerTItemsN[i] + ")";
                } else if (playerTItemsN[i] >= 1000000) {
                    SendAmount = "@gre@" + (playerTItemsN[i] / 1000000) + " million @whi@(" + playerTItemsN[i] + ")";
                } else {
                    SendAmount = "" + playerTItemsN[i];
                }
                if (Count == 0) {
                    SendTrade = GetItemName((playerTItems[i] - 1));
                } else {
                    SendTrade = SendTrade + "\\n" + GetItemName((playerTItems[i] - 1));
                }
                if (Items.itemIsNote[(playerTItems[i] - 1)] == true || Items.itemStackable[(playerTItems[i] - 1)] == true)
                {
                    SendTrade = SendTrade + " x " + SendAmount;
                }
                Count++;
            }
        }
        sendFrame126(SendTrade, 3557);
        SendTrade = "Absolutely nothing!";
        SendAmount = "";
        Count = 0;
        for (int i = 0; i < playerOTItems.length; i++) {
            if (playerOTItems[i] > 0) {
                if (playerOTItemsN[i] >= 1000 && playerOTItemsN[i] < 1000000) {
                    SendAmount = "@cya@" + (playerOTItemsN[i] / 1000) + "K @whi@(" + playerOTItemsN[i] + ")";
                } else if (playerOTItemsN[i] >= 1000000) {
                    SendAmount = "@gre@" + (playerOTItemsN[i] / 1000000) + " million @whi@(" + playerOTItemsN[i] + ")";
                } else {
                    SendAmount = "" + playerOTItemsN[i];
                }
                if (Count == 0) {
                    SendTrade = GetItemName((playerOTItems[i] - 1));
                } else {
                    SendTrade = SendTrade + "\\n" + GetItemName((playerOTItems[i] - 1));
                }
                if (Items.itemIsNote[(playerOTItems[i] - 1)] == true || Items.itemStackable[(playerOTItems[i] - 1)] == true)
                {
                    SendTrade = SendTrade + " x " + SendAmount;
                }
                Count++;
            }
        }
        sendFrame126(SendTrade, 3558);
    }

    public boolean fromTrade(int itemID, int fromSlot, int amount) {
        if (amount > 0 && (itemID + 1) == playerTItems[fromSlot]) {
            if (amount > playerTItemsN[fromSlot]) {
                amount = playerTItemsN[fromSlot];
            }
            addItem((playerTItems[fromSlot] - 1), amount);
            if (amount == playerTItemsN[fromSlot]) {
                playerTItems[fromSlot] = 0;
                PlayerHandler.players[tradeWith].playerOTItems[fromSlot] = 0;
            }
            playerTItemsN[fromSlot] -= amount;
            PlayerHandler.players[tradeWith].playerOTItemsN[fromSlot] -= amount;
            resetItems(3322);
            resetTItems(3415);
            PlayerHandler.players[tradeWith].tradeUpdateOther = true;
            if (PlayerHandler.players[tradeWith].tradeStatus == 3) {
                PlayerHandler.players[tradeWith].tradeStatus = 2;
                PlayerHandler.players[tradeWith].AntiTradeScam = true;
                sendFrame126("", 3431);
            }
            return true;
        }
        return false;
    }

    public boolean tradeItem(int itemID, int fromSlot, int amount) {
        if (tradeWith > 0) {
            if (PlayerHandler.players[tradeWith] == null) {
                DeclineTrade();
                sendMessage("FORCED DECLINE BY SERVER !");
                return false;
            }
        } else {
            DeclineTrade();
            sendMessage("FORCED DECLINE BY SERVER !");
            return false;
        }
        if (amount > 0 && itemID == (playerItems[fromSlot] - 1)) {
            if (amount > playerItemsN[fromSlot]) {
                amount = playerItemsN[fromSlot];
            }
            boolean IsInTrade = false;
            for (int i = 0; i < playerTItems.length; i++) {
                if (playerTItems[i] == playerItems[fromSlot]) {
                    if (Items.itemStackable[(playerItems[fromSlot] - 1)] == true || Items.itemIsNote[(playerItems[fromSlot] - 1)] == true)
                    {
                        playerTItemsN[i] += amount;
                        PlayerHandler.players[tradeWith].playerOTItemsN[i] += amount;
                        IsInTrade = true;
                        break;
                    }
                }
            }
            if (IsInTrade == false) {
                for (int i = 0; i < playerTItems.length; i++) {
                    if (playerTItems[i] <= 0) {
                        playerTItems[i] = playerItems[fromSlot];
                        playerTItemsN[i] = amount;
                        PlayerHandler.players[tradeWith].playerOTItems[i] = playerItems[fromSlot];
                        PlayerHandler.players[tradeWith].playerOTItemsN[i] = amount;
                        break;
                    }
                }
            }
            if (amount == playerItemsN[fromSlot]) {
                playerItems[fromSlot] = 0;
            }
            playerItemsN[fromSlot] -= amount;
            resetItems(3322);
            resetTItems(3415);
            PlayerHandler.players[tradeWith].tradeUpdateOther = true;
            if (PlayerHandler.players[tradeWith].tradeStatus == 3) {
                PlayerHandler.players[tradeWith].tradeStatus = 2;
                PlayerHandler.players[tradeWith].AntiTradeScam = true;
                sendFrame126("", 3431);
            }
            return true;
        }
        return false;
    }
/*Shops*/

    public boolean sellItem(int itemID, int fromSlot, int amount) {
        if (amount > 0 && itemID == (playerItems[fromSlot] - 1)) {
            if (server.shopHandler.ShopSModifier[MyShopID] > 1) {
                boolean IsIn = false;
                for (int i = 0; i <= server.shopHandler.ShopItemsStandard[MyShopID]; i++) {
                    if (itemID == (server.shopHandler.ShopItems[MyShopID][i] - 1)) {
                        IsIn = true;
                        break;
                    }
                }
                if (IsIn == false) {
                    sendMessage("You cannot sell " + GetItemName(itemID) + " in this store.");
                    return false;
                }
            }
            if (Items.itemSellable[(playerItems[fromSlot] - 1)] == false) {
                sendMessage("I cannot sell " + GetItemName(itemID) + ".");
                return false;
            }
            if (amount > playerItemsN[fromSlot] && (Items.itemIsNote[(playerItems[fromSlot] - 1)] == true || Items.itemStackable[(playerItems[fromSlot] - 1)] == true))
            {
                amount = playerItemsN[fromSlot];
            } else
            if (amount > GetXItemsInBag(itemID) && Items.itemIsNote[(playerItems[fromSlot] - 1)] == false && Items.itemStackable[(playerItems[fromSlot] - 1)] == false)
            {
                amount = GetXItemsInBag(itemID);
            }
            double ShopValue;
            double TotPrice;
            int TotPrice2;
            int Overstock;
            for (int i = amount; i > 0; i--) {
                TotPrice2 = (int) Math.floor(GetItemShopValue(itemID, 1, fromSlot));
                if (freeSlots() > 0) {
                    if (Items.itemIsNote[itemID] == false) {
                        deleteItem(itemID, GetItemSlot(itemID), 1);
                    } else {
                        deleteItem(itemID, fromSlot, 1);
                    }
                    addItem(995, TotPrice2);
                    addShopItem(itemID, 1);
                } else {
                    sendMessage("Not enough space in your inventory.");
                    break;
                }
            }
            resetItems(3823);
            resetShop(MyShopID);
            UpdatePlayerShop();
            return true;
        }
        return true;
    }

    public boolean buyItem(int itemID, int fromSlot, int amount) {
        if (amount > 0 && itemID == (server.shopHandler.ShopItems[MyShopID][fromSlot] - 1)) {
            if (amount > server.shopHandler.ShopItemsN[MyShopID][fromSlot]) {
                amount = server.shopHandler.ShopItemsN[MyShopID][fromSlot];
            }
            double ShopValue;
            double TotPrice;
            int TotPrice2;
            int Overstock;
            int Slot = 0;
            for (int i = amount; i > 0; i--) {
                TotPrice2 = (int) Math.floor(GetItemShopValue(itemID, 0, fromSlot));
                Slot = GetItemSlot(995);
                if (Slot == -1) {
                    sendMessage("You don't have enough coins.");
                    break;
                }
                if (playerItemsN[Slot] >= TotPrice2) {
                    if (freeSlots() > 0) {
                        deleteItem(995, GetItemSlot(995), TotPrice2);
                        addItem(itemID, 1);
                        server.shopHandler.ShopItemsN[MyShopID][fromSlot] -= 1;
                        server.shopHandler.ShopItemsDelay[MyShopID][fromSlot] = 0;
                        if ((fromSlot + 1) > server.shopHandler.ShopItemsStandard[MyShopID]) {
                            server.shopHandler.ShopItems[MyShopID][fromSlot] = 0;
                        }
                    } else {
                        sendMessage("Not enough space in your inventory.");
                        break;
                    }
                } else {
                    sendMessage("You don't have enough coins.");
                    break;
                }
            }
            resetItems(3823);
            resetShop(MyShopID);
            UpdatePlayerShop();
            return true;
        }
        return false;
    }

    public void UpdatePlayerShop() {
        for (int i = 1; i < PlayerHandler.maxPlayers; i++) {
            if (PlayerHandler.players[i] != null) {
                if (PlayerHandler.players[i].IsShopping == true && PlayerHandler.players[i].MyShopID == MyShopID && i != playerId)
                {
                    PlayerHandler.players[i].UpdateShop = true;
                }
            }
        }
    }

    public boolean addShopItem(int itemID, int amount) {
        boolean Added = false;
        if (amount <= 0) {
            return false;
        }
        if (Items.itemIsNote[itemID] == true) {
            itemID = GetUnnotedItem(itemID);
        }
        for (int i = 0; i < server.shopHandler.ShopItems.length; i++) {
            if ((server.shopHandler.ShopItems[MyShopID][i] - 1) == itemID) {
                server.shopHandler.ShopItemsN[MyShopID][i] += amount;
                Added = true;
            }
        }
        if (Added == false) {
            for (int i = 0; i < server.shopHandler.ShopItems.length; i++) {
                if (server.shopHandler.ShopItems[MyShopID][i] == 0) {
                    server.shopHandler.ShopItems[MyShopID][i] = (itemID + 1);
                    server.shopHandler.ShopItemsN[MyShopID][i] = amount;
                    server.shopHandler.ShopItemsDelay[MyShopID][i] = 0;
                    break;
                }
            }
        }
        return true;
    }
/*NPCs Talking*/

    public void UpdateNPCChat() {
        sendFrame126("", 976);
        if (DialogueHandler.DialogueType[NpcDialogue] == 1) { //npc 1 chat line (click here to continue)
            sendFrame200(4883, 591);
            sendFrame126(GetNpcName(NpcTalkTo), 4884);
            sendFrame126(DialogueHandler.DialogueText[NpcDialogue][1], 4885);
            sendFrame75(NpcTalkTo, 4883);
            sendFrame164(4882);
        } else if (DialogueHandler.DialogueType[NpcDialogue] == 2) { //npc 2 option line
            sendFrame171(DialogueHandler.DialogueSword[NpcDialogue][1], 2465); //swords close to eachother
            sendFrame171(DialogueHandler.DialogueSword[NpcDialogue][1], 2468); //swords far away
            sendFrame126(DialogueHandler.DialogueQuestion[NpcDialogue], 2460);
            sendFrame126(DialogueHandler.DialogueText[NpcDialogue][1], 2461);
            sendFrame126(DialogueHandler.DialogueText[NpcDialogue][2], 2462);
            sendFrame164(2459);
        } else if (DialogueHandler.DialogueType[NpcDialogue] == 3) { //player 2 chat line (click here to continue)
            sendFrame200(615, 974);
            sendFrame126(playerName, 975);
            sendFrame126(DialogueHandler.DialogueText[NpcDialogue][1], 976);
            sendFrame126(DialogueHandler.DialogueText[NpcDialogue][2], 977);
            sendFrame185(974);
            sendFrame164(973);
        }
        NpcDialogueSend = true;
    }

    public void DialogueAction(int Action) {
        switch (Action) {
            case -1:
                openUpBank();
                break;
            case -2:
                openUpShop(2);
                break;
            case -3:
                openUpPinSettings();
                break;
        }
    }
/*Equipment level checking*/

    public int GetCLAttack(int ItemID) {
        if (ItemID == -1) {
            return 1;
        }
        String ItemName = GetItemName(ItemID);
        String ItemName2 = ItemName.replaceAll("Bronze", "");
        ItemName2 = ItemName2.replaceAll("Iron", "");
        ItemName2 = ItemName2.replaceAll("Steel", "");
        ItemName2 = ItemName2.replaceAll("Black", "");
        ItemName2 = ItemName2.replaceAll("Mithril", "");
        ItemName2 = ItemName2.replaceAll("Adamant", "");
        ItemName2 = ItemName2.replaceAll("Rune", "");
        ItemName2 = ItemName2.replaceAll("Granite", "");
        ItemName2 = ItemName2.replaceAll("Dragon", "");
        ItemName2 = ItemName2.replaceAll("Crystal", "");
        ItemName2 = ItemName2.trim();
        if (ItemName2.startsWith("claws")
                || ItemName2.startsWith("dagger")
                || ItemName2.startsWith("sword")
                || ItemName2.startsWith("scimitar")
                || ItemName2.startsWith("mace")
                || ItemName2.startsWith("longsword")
                || ItemName2.startsWith("battleaxe")
                || ItemName2.startsWith("warhammer")
                || ItemName2.startsWith("2h sword")
                || ItemName2.startsWith("harlberd")) {
            if (ItemName.startsWith("Bronze")) {
                return 1;
            } else if (ItemName.startsWith("Iron")) {
                return 1;
            } else if (ItemName.startsWith("Steel")) {
                return 5;
            } else if (ItemName.startsWith("Black")) {
                return 10;
            } else if (ItemName.startsWith("Mithril")) {
                return 20;
            } else if (ItemName.startsWith("Adamant")) {
                return 30;
            } else if (ItemName.startsWith("Rune")) {
                return 40;
            } else if (ItemName.startsWith("Dragon")) {
                return 60;
            }
        } else if (ItemName.startsWith("Granite")) {
            return 50;
        } else
        if (ItemName.endsWith("whip") || ItemName.endsWith("Ahrims staff") || ItemName.endsWith("Torags hammers") || ItemName.endsWith("Veracs flail") || ItemName.endsWith("Guthans warspear") || ItemName.endsWith("Dharoks greataxe"))
        {
            return 70;
        }
        return 1;
    }

    public int GetCLDefence(int ItemID) {
        if (ItemID == -1) {
            return 1;
        }
        String ItemName = GetItemName(ItemID);
        String ItemName2 = ItemName.replaceAll("Bronze", "");
        ItemName2 = ItemName2.replaceAll("Iron", "");
        ItemName2 = ItemName2.replaceAll("Steel", "");
        ItemName2 = ItemName2.replaceAll("Black", "");
        ItemName2 = ItemName2.replaceAll("Mithril", "");
        ItemName2 = ItemName2.replaceAll("Adamant", "");
        ItemName2 = ItemName2.replaceAll("Rune", "");
        ItemName2 = ItemName2.replaceAll("Granite", "");
        ItemName2 = ItemName2.replaceAll("Dragon", "");
        ItemName2 = ItemName2.replaceAll("Crystal", "");
        ItemName2 = ItemName2.trim();
        if (ItemName2.startsWith("claws")
                || ItemName2.startsWith("dagger")
                || ItemName2.startsWith("sword")
                || ItemName2.startsWith("scimitar")
                || ItemName2.startsWith("mace")
                || ItemName2.startsWith("longsword")
                || ItemName2.startsWith("battleaxe")
                || ItemName2.startsWith("warhammer")
                || ItemName2.startsWith("2h sword")
                || ItemName2.startsWith("harlberd")) {
            //It's a weapon, weapons don't required defence !
        } else
        if (ItemName.startsWith("Ahrims") || ItemName.startsWith("Karil") || ItemName.startsWith("Torag") || ItemName.startsWith("Verac") || ItemName.endsWith("Guthan") || ItemName.endsWith("Dharok"))
        {
            if (ItemName.endsWith("staff") || ItemName.endsWith("crossbow") || ItemName.endsWith("hammers") || ItemName.endsWith("flail") || ItemName.endsWith("warspear") || ItemName.endsWith("greataxe"))
            {
                //No defence for the barrow weapons
            } else {
                return 70;
            }
        } else {
            if (ItemName.startsWith("Bronze")) {
                return 1;
            } else if (ItemName.startsWith("Iron")) {
                return 1;
            } else if (ItemName.startsWith("Steel")) {
                return 5;
            } else if (ItemName.startsWith("Black")) {
                return 10;
            } else if (ItemName.startsWith("Mithril")) {
                return 20;
            } else if (ItemName.startsWith("Adamant")) {
                return 30;
            } else if (ItemName.startsWith("Rune")) {
                return 40;
            } else if (ItemName.startsWith("Dragon")) {
                return 60;
            }
        }
        return 1;
    }


    public void map(String s) {


        File f = new File(server.workingDir + "autospawn.cfg");

        try {
            BufferedReader buff = new BufferedReader(new FileReader(f));
            PrintWriter pw = new PrintWriter(new FileWriter(f, true));
            String line = buff.readLine();
            while (line != null) {
                line = buff.readLine();

            }
            if (line == null) {
                pw.println("spawn = " + s + "	" + absX + "	" + absY + "	1	1	1	1	1	1	1");
                pw.flush();
            }
            buff.close();
            pw.close();
        } catch (Exception e) {
        }
    }


    public int GetCLStrength(int ItemID) {
        if (ItemID == -1) {
            return 1;
        }
        String ItemName = GetItemName(ItemID);
        if (ItemName.startsWith("Granite")) {
            return 50;
        } else if (ItemName.startsWith("Torags hammers") || ItemName.endsWith("Dharoks greataxe")) {
            return 70;
        }
        return 1;
    }

    public int GetCLMagic(int ItemID) {
        if (ItemID == -1) {
            return 1;
        }
        String ItemName = GetItemName(ItemID);
        if (ItemName.startsWith("Ahrim")) {
            return 70;
        }
        return 1;
    }

    public int GetCLRanged(int ItemID) {
        if (ItemID == -1) {
            return 1;
        }
        String ItemName = GetItemName(ItemID);
        if (ItemName.startsWith("Karil")) {
            return 70;
        }
        return 1;
    }

    public int GetWorld(int PlayerID) {
        String Server = PlayerHandler.players[PlayerID].playerServer;
        if (Server.equals("Hybrid.22kb.com")) {
            return 1;
        } else if (Server.equals("81.165.211.142")) {
            return 2;
        } else {
            println_debug("Invalid Server: " + Server);
            return 0;
        }
    }
}
