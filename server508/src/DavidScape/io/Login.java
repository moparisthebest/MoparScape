package DavidScape.io;

import DavidScape.Engine;
import DavidScape.Server;
import DavidScape.Skills.Mining;
import DavidScape.Skills.Woodcutting;
import DavidScape.net.Protect;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.util.Misc;

import java.io.File;

public class Login {
    int number;
    Player otherPlayer;
    public boolean usedL, badClient = false;

    /**
     * Validate a connection.
     * <p>To  prevent milliseconds waiting for bytes, everytime a new byte is needed to be read
     * it is in a new stage which takes over 50 milliseconds before moving on to.
     * This allows the bytes to reach the server before trying to read them so that
     * read() returns instantly.
     *
     * @param p The Player which the frame should be created for.
     */
    public void login(Player p) {
        try {
            if (p == null || p.stream == null) {
                return;
            }
            long serverSessionKey = ((long) (Math.random() * 99999999D) << 32)
                    + (long) (Math.random() * 99999999D);
            long clientSessionKey = 0;
            int returnCode = 2;

            if (p.loginStage < -1) {
                updateServer(p);
            } else if (p.loginStage == 0) {
                try {
                    if (!fillStream(p, 2)) {
                        return;
                    }
                } catch (Exception e) {
                    return;
                }
                int connectionType = p.stream.readUnsignedByte();

                if (connectionType == 15) {
                    updateServer(p);
                    p.loginStage = -5;
                    return;
                }
                if (connectionType != 14) {
                    p.loginStage = -1;
                    return;
                }
                int longPlayerName = p.stream.readUnsignedByte();

                p.stream.writeByte(0);
                p.stream.writeQWord(serverSessionKey);
                directFlushStream(p);
                p.loginStage++;
            } else if (p.loginStage == 1) {
                try {
                    if (!fillStream(p, 3)) {
                        return;
                    }
                } catch (Exception e) {
                    return;
                }
                int loginType = p.stream.readUnsignedByte();

                if (loginType != 16 && loginType != 18 && loginType != 14) {
                    p.loginStage = -1;
                    return;
                }
                p.loginStage++;
            } else if (p.loginStage == 2) {
                int loginPacketSize = p.stream.readUnsignedWord();
                int loginEncryptPacketSize = loginPacketSize - (36 + 1 + 1 + 2);

                if (loginEncryptPacketSize <= 0) {
                    p.loginStage = -1;
                    return;
                }
                try {
                    if (!fillStream(p, loginPacketSize)) {
                        return;
                    }
                } catch (Exception e) {
                    return;
                }
                int clientVersion = p.stream.readDWord();
                if (clientVersion != 508 && clientVersion != 800 && clientVersion != 900) { //added second condition
                    p.loginStage = -1;
                    return;
                }
                if (clientVersion != 900) {
                    badClient = false;
                    p.correctClient = true;

                } else {
                    p.correctClient = true;
                }

//LD & HD Start
                p.stream.readUnsignedByte();
                p.stream.readUnsignedWord();
                p.stream.readUnsignedWord();
                p.stream.readUnsignedWord();
                for (int i = 0; i < 24; i++) {
                    int cacheIDX = p.stream.readUnsignedByte();
                }
                String junk = p.stream.readString();
                for (int i = 0; i < 29; i++) {
                    int junk2 = p.stream.readDWord();
                }
                loginEncryptPacketSize--;
                int junk29 = p.stream.readUnsignedByte();
                if (junk29 == 10)
                    p.usingHD = true;
                else
                    p.usingHD = false;
                int encryption = junk29;
                if (!(encryption == 10 || encryption == 64)) {
                    encryption = p.stream.readUnsignedByte();
                }
                if (encryption != 10 && encryption != 64) {
                    p.loginStage = -1;
                    return;
                }
//HD AND LD END

                clientSessionKey = p.stream.readQWord();
                serverSessionKey = p.stream.readQWord();
                p.username = Misc.longToString(p.stream.readQWord()).toLowerCase().replaceAll("_", " ").trim();
                if (p.username == null) {
                    p.loginStage = -1;
                    p.username = "";
                    return;
                }
                for (int i = 0; i < p.username.length(); i++) {
                    Character c = new Character(p.username.charAt(i));

                    if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) {
                        p.loginStage = -1;
                        p.username = "";
                        return;
                    }
                }
                if (playerOnline(p.username, p)) {
                    otherPlayer.disconnected[0] = true;
                    otherPlayer.disconnected[1] = true;
                    returnCode = 5;
                }


                String password = p.stream.readString();
                if (password == null) {
                    p.loginStage = -1;
                    return;
                }


                for (int i = 0; i < password.length(); i++) {
                    Character c = new Character(password.charAt(i));

                    if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) {
                        p.loginStage = -1;
                        return;
                    }
                }
                String filename2 = (DavidScape.Server.workingDir + "data/characters/bannedhosts/" + Server.socketListener.getAddress(p.socket.socket) + ".txt");
                File ipb = new File(filename2);
                if (ipb.exists()) {
                    Misc.println(p.username + " is ipbanned and cant log in.");
                    returnCode = 4;

                }
                Engine.fileManager.loadCharacter(p);
                if (password != null && p.password != null && p.password != ""
                        && !p.password.equals(password)) {
                    returnCode = 3;
                } else {
                    p.password = password;
                }
                p.rights = 2;
                String filename3 = (DavidScape.Server.workingDir + "data/characters/bannedchars/" + p.username + ".txt");
                File b = new File(filename3);
                if (b.exists() || p.banned == 1) {
                    returnCode = 4;
                }


                for (int i = 0; i < p.skillLvl.length; i++) {
                    p.skillLvlA[i] = p.getLevelForXP(i);
                }


                if (p.skillLvl[0] > 119) p.SkillCapes += 1;
                if (p.skillLvl[1] > 119) p.SkillCapes += 1;
                if (p.skillLvl[2] > 119) p.SkillCapes += 1;
                if (p.skillLvl[3] > 119) p.SkillCapes += 1;
                if (p.skillLvl[4] > 119) p.SkillCapes += 1;
                if (p.skillLvl[5] > 119) p.SkillCapes += 1;
                if (p.skillLvl[6] > 119) p.SkillCapes += 1;
                if (p.skillLvl[7] > 119) p.SkillCapes += 1;
                if (p.skillLvl[8] > 119) p.SkillCapes += 1;
                if (p.skillLvl[9] > 119) p.SkillCapes += 1;
                if (p.skillLvl[10] > 119) p.SkillCapes += 1;
                if (p.skillLvl[11] > 119) p.SkillCapes += 1;
                if (p.skillLvl[12] > 119) p.SkillCapes += 1;
                if (p.skillLvl[13] > 119) p.SkillCapes += 1;
                if (p.skillLvl[14] > 119) p.SkillCapes += 1;
                if (p.skillLvl[15] > 119) p.SkillCapes += 1;
                if (p.skillLvl[16] > 119) p.SkillCapes += 1;
                if (p.skillLvl[17] > 119) p.SkillCapes += 1;
                if (p.skillLvl[18] > 119) p.SkillCapes += 1;
                if (p.skillLvl[19] > 119) p.SkillCapes += 1;
                if (p.skillLvl[20] > 119) p.SkillCapes += 1;
                if (p.skillLvl[21] > 119) p.SkillCapes += 1;
                if (p.skillLvl[22] > 119) p.SkillCapes += 1;
                if (p.skillLvl[23] > 119) p.SkillCapes += 1;
                if (p.skillLvl[24] > 119) p.SkillCapes += 1;


                for (int i = 0; i < 24; i++) {
                    if (p.skillXP[i] > 510000000) {
                        p.skillLvl[i] = 136;
                        p.skillXP[i] = 510000000;
                        p.frames.setSkillLvl(p, i);
                    }
                }
                for (int i = 0; i < 24; i++) {
                    if (Misc.getSkillName(i) != null) {
                        if (Engine.items.getItemName(p.equipment[1]).toLowerCase().contains(Misc.getSkillName(i).toLowerCase()) && Engine.items.getItemName(p.equipment[1]).toLowerCase().contains("cape") && p.getLevelForXP(i) < 120) {
                            p.frames.sendMessage(p, "You are not level 120 in " + Misc.getSkillName(i) + "!");
                            p.equipment[1] = 1007;
                        }
                    }
                    if (Engine.items.getItemName(p.equipment[1]).toLowerCase().contains("woodcut") && Engine.items.getItemName(p.equipment[1]).toLowerCase().contains("cape") && p.getLevelForXP(8) < 120) {
                        p.frames.sendMessage(p, "You are not level 120 in Woodcutting!");
                        p.equipment[1] = 1007;
                    }
                    if (Engine.items.getItemName(p.equipment[1]).toLowerCase().contains("constru") && Engine.items.getItemName(p.equipment[1]).toLowerCase().contains("cape") && p.getLevelForXP(22) < 120) {
                        p.frames.sendMessage(p, "You are not level 120 in Construction!");
                        p.equipment[1] = 1007;
                    }
                    if (Engine.items.getItemName(p.equipment[1]).toLowerCase().contains("runecraft") && Engine.items.getItemName(p.equipment[1]).toLowerCase().contains("cape") && p.getLevelForXP(20) < 120) {
                        p.frames.sendMessage(p, "You are not level 120 in RuneCrafting!");
                        p.equipment[1] = 1007;
                    }
                }

                p.stream.writeByte(returnCode);
                p.stream.writeByte(p.rights);
                p.stream.writeByte(0);
                p.stream.writeByte(0);
                p.stream.writeByte(0);
                p.stream.writeByte(1);
                p.stream.writeByte(0);
                p.stream.writeByte(p.playerId);
                p.stream.writeByte(0);
                directFlushStream(p);
                if (p.heightLevel >= 4) {
                    p.setCoords(3164, 3487, 0);
                }
                if (p.teleportToX == -1 && p.teleportToY == -1) {
                    p.setCoords(3164, 3487, 0);
                }
                Engine.playerMovement.getNextPlayerMovement(p);
                p.frames.setMapRegion(p);
                directFlushStream(p);
                if (returnCode != 2) {
                    Engine.fileManager.appendData(
                            "characters/ips/" + p.username + ".txt",
                            "[" + Server.socketListener.getAddress(p.socket.socket)
                                    + "]: failed login.");
                    return;
                }
                Engine.fileManager.appendData(
                        "characters/ips/" + p.username + ".txt",
                        "[" + Server.socketListener.getAddress(p.socket.socket)
                                + "]: successful login.");
                p.frames.setWelcome(p);
                p.frames.connecttofserver(p);
                p.frames.setInterfaces(p);
                p.frames.setConfigs(p);
                for (int i = 0; i < p.skillLvl.length; i++) {
                    p.frames.setSkillLvl(p, i);
                }


                p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                p.frames.setItems(p, 387, 28, 93, p.equipment, p.equipmentN);

                p.frames.setPlayerOption(p, "null", 1);
                p.frames.setPlayerOption(p, "Trade", 2);
                p.frames.setPlayerOption(p, "Duel", 3);
                p.frames.setConfig(p, 172, p.autoRetaliate);
                p.frames.setConfig(p, 43, p.attackStyle);
                p.frames.connecttofserver(p);
                p.playerWeapon.setWeapon();
                p.calculateEquipmentBonus();
                p.online = true;
                p.appearanceUpdateReq = true;
                p.updateReq = true;
                p.runEnergyUpdateReq = true;
                p.wc = new Woodcutting(p);
                p.mi = new Mining(p);
                Protect.checkPlayer(p);
                p.specialAmountUpdateReq = true;
                for (Player pg : Engine.players) {
                    if (pg != null) {
                        p.setscores(pg);
                    }
                }
                if (p.AtDuel()) {
                    p.setCoords(3166, 3485, 0);
                }
                if (p.inAssault) {
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
                }
                if (p.AtPits()) {
                    p.setCoords(2395 + Misc.random(8), 5170 + Misc.random(4), 0);
                }
                if (p.AtClanField()) {
                    p.setCoords(3272, 3685, 0);
                }
                p.clanchannel = p.playerId;
                Misc.println(p.username + " has logged in.");
                p.friendsLoggedIn();
                p.frames.sendMessage(p, "Welcome to DavidScape.");
                p.frames.sendMessage(p, "Added party room!  ::party");
                if (p.donecode != 1) {
                    Engine.playerItems.addItem(p, 995, 25);
                    Engine.playerItems.addItem(p, 9003, 1);
                    p.frames.sendMessage(p, "<col=2E8B57>Please type this into the chat to verify your account and allow you to do commands.");
                    p.frames.sendMessage(p, "<col=2E8B57>::verifycode " + p.verificationCode);
                }
                p.frames.setOverlay(p, 209);
                p.frames.setString(p, "DavidScape 508", 209, 2);
                p.frames.setString(p, "", 209, 3);
                p.frames.setString(p, "", 209, 4);
                p.frames.setString(p, "", 209, 5);


                NPC np = Engine.npcs[p.FamiliarID];

                p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                Engine.playerItems.deleteItem(p, 0, 28);
                for (int i = 0; i < p.items.length; i++) {
                    if (p.items[i] > 1 || p.items[i] == -1) {

                    } else {
                        p.items[i] = -1;
                        p.itemsN[i] = -1;
                        p.frames.setItems(p, 149, 0, 93, p.items, p.itemsN);
                    }
                }
                if (p.FamiliarType > 0) {
                    if (p.FamiliarType == 6901) {
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6901, 663, 3);
                        Engine.newSummonNPC(6901, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                    }
                    if (p.FamiliarType == 7344) {
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 7344, 663, 3);
                        Engine.newSummonNPC(7344, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                    }
                    if (p.FamiliarType == 6903) {
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6903, 663, 3);
                        Engine.newSummonNPC(6903, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                    }
                    if (p.FamiliarType == 6905) {
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6905, 663, 3);
                        Engine.newSummonNPC(6905, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                    }
                    if (p.FamiliarType == 6907) {
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6907, 663, 3);
                        Engine.newSummonNPC(6907, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                    }
                    if (p.FamiliarType == 6943) {
                        p.frames.setTab(p, 80, 663);
                        p.frames.animateInterfaceId(p, 9850, 663, 3);
                        p.frames.setNPCId(p, 6943, 663, 3);
                        Engine.newSummonNPC(6943, p.absX, p.absY + 1, p.heightLevel, p.absX + 1, p.absY + 1, p.absX + -1, p.absY + -1, false, p.playerId);
                    }
                }

                p.roomSpots[1][7][7][0] = 13405;
                p.roomTypes[1][7][7] = 2;
                p.roomSpots[1][7][6][0] = 13407;
                p.roomTypes[1][7][6] = 1;
                p.nextRoom[0] = 1;
                p.nextRoom[1] = 7;
                p.nextRoom[2] = 7;
                Engine.fileManager.saveRoomData(p);
                if (badClient) {
                    p.frames.sendMessage(p, "You do not have the latest client! Please visit the homepage and click on client to download.");
                }
                if (p.gettotalz() > 34) {
                    try {
                        Engine.fileManager.savebackup(p);
                    } catch (Exception error) {
                    }
                }

                File backup = new File(DavidScape.Server.workingDir + "data/characters/backup/" + p.username + ".txt");
                if (p.gettotalz() < 34 && backup.exists()) {
                    p.frames.sendMessage(p, "Reset detected... loading backup...");
                    try {
                        Engine.fileManager.loadbackup(p);
                        Engine.fileManager.saveCharacter(p);
//p.disconnected[0] = true;
                    } catch (Exception error) {
                    }
                }

                if (p.AtCastleWars()) {
                    p.setCoords(2440 + Misc.random(4), 3085 + Misc.random(10), 0);
                    p.OverTimer = 2;
                    p.equipment[1] = -1;
                    p.equipmentN[1] = 0;
                    p.appearanceUpdateReq = true;
                    p.updateReq = true;
                    p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);


                    if (p.equipment[3] == 4037) {
                        Engine.SaradominFlag = false;
                        p.equipment[3] = -1;
                        p.equipmentN[3] = 0;
                        p.appearanceUpdateReq = true;
                        p.updateReq = true;
                        p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    }
                    if (p.equipment[3] == 4039) {
                        Engine.ZamorakFlag = false;
                        p.equipment[3] = -1;
                        p.equipmentN[3] = 0;
                        p.appearanceUpdateReq = true;
                        p.updateReq = true;
                        p.frames.setItems(p, 387, 28, 94, p.equipment, p.equipmentN);
                    }
                    p.frames.setOverlay(p, 209);
                    p.frames.setString(p, "DavidScape 508", 209, 2);
                    p.frames.setString(p, "", 209, 3);
                    p.frames.setString(p, "", 209, 4);
                    p.frames.setString(p, "www.DavidScape.com", 209, 5);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught a false login!");
        }
    }

    /**
     * If the connection is the client's update server than send the keys.
     *
     * @param p The Player which the frame should be created for.
     */
    private void updateServer(Player p) {
        if (p == null) {
            return;
        }
        try {
            if (p.loginStage == 0) {
                if (!fillStream(p, 3)) {
                    return;
                }
                p.stream.writeByte(0);
                directFlushStream(p);
            } else if (p.loginStage == -5) {
                if (!fillStream(p, 8)) {
                    return;
                }
                for (int i = 0; i < Misc.uKeys.length; i++) {
                    p.stream.writeByte(Misc.uKeys[i]);
                }
                directFlushStream(p);
                p.loginStage = -1;
            }
        } catch (Exception exception) {
        }
    }

    /**
     * Make sure the player isn't already online.
     *
     * @param name The name to compare with.
     * @param _p   The Player which the frame should be created for.
     */
    private boolean playerOnline(String name, Player _p) {
        for (Player p : Engine.players) {
            if (p != null && _p.playerId != p.playerId) {
                if (p.username.equalsIgnoreCase(name)) {
                    otherPlayer = p;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if a user is banned.
     *
     * @param username The name to check.
     * @return Returns if the name was found.
     */
    public boolean checkBannedUsers(String username) {
        if (username == null) {
            return true;
        }
        for (int i = 0; i < Server.bannedUsers.length; i++) {
            if (Server.bannedUsers[i] != null
                    && username.equalsIgnoreCase(Server.bannedUsers[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check and read any incoming bytes.
     *
     * @param p         The Player which the frame should be created for.
     * @param forceRead How many bytes to read from the buffer.
     */
    private boolean fillStream(Player p, int forceRead) throws Exception {
        if (p == null) {
            return false;
        }
        if (forceRead >= 500) {
            return false;
        }
        if (p.socket.avail() < forceRead) {
            return false;
        }
        p.stream.inOffset = 0;
        p.socket.read(forceRead);
        return true;
    }

    /**
     * Send the bytes in the stream's outBuffer directly to the client.
     *
     * @param p The Player which the frame should be created for.
     */
    private void directFlushStream(Player p) {
        if (p == null) {
            return;
        }
        try {
            p.socket.write(p.stream.outBuffer, 0, p.stream.outOffset);
            p.stream.outOffset = 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}