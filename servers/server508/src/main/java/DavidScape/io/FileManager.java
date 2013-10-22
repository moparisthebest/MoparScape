package DavidScape.io;


import DavidScape.players.Player;
import DavidScape.util.Misc;
import DavidScape.util.Stream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileManager {

    /**
     * Byte buffer for storing bytes to be loaded or saved.
     */
    private Stream stream = new Stream(30000, 30000);

    /**
     * Saves a character file.
     *
     * @param p The player to save.
     */
    public synchronized void saveCharacter(Player p) throws Exception {
        if (p == null) {
            return;
        }
        savescores(p);
        stream.outOffset = 0;
        stream.writeString("username:" + p.username);
        stream.writeString("password:" + Misc.stringToLong(p.password));
        stream.writeString("rights:" + p.rights);
        stream.writeString("rewards:" + p.rewards);
        stream.writeString("taken:" + p.taken);
        stream.writeString("absx:" + p.absX);
        stream.writeString("absy:" + p.absY);
        stream.writeString("height:" + p.heightLevel);
        stream.writeString("runenergy:" + p.runEnergy);
        stream.writeString("attackstyle:" + p.attackStyle);
        stream.writeString("autoretaliate:" + p.autoRetaliate);
        stream.writeString("specialamount:" + p.specialAmount);
        stream.writeString("skulltimer:" + p.skulledDelay);
        stream.writeString("gender:" + p.gender);
        stream.writeString("SlayerTask:" + p.SlayerTask);
        stream.writeString("SlayerAm:" + p.SlayerAm);
        stream.writeString("Room0:" + p.Room0);
        stream.writeString("Room1:" + p.Room1);
        stream.writeString("Room2:" + p.Room2);
        stream.writeString("Room3:" + p.Room3);
        stream.writeString("Room4:" + p.Room4);
        stream.writeString("Room0Type:" + p.Room0Type);
        stream.writeString("Room1Type:" + p.Room1Type);
        stream.writeString("Room2Type:" + p.Room2Type);
        stream.writeString("Room3Type:" + p.Room3Type);
        stream.writeString("Room4Type:" + p.Room4Type);
        for (int i = 0; i < p.tabStartSlot.length; i++) {
            stream.writeString("tab" + i + ":" + p.tabStartSlot[i]);
        }
        stream.writeString("geoffers:" + p.geoffers);
        stream.writeString("ZKC:" + p.zkc);
        stream.writeString("Donecode:" + p.donecode);
        stream.writeString("BKC:" + p.bkc);
        stream.writeString("AKC:" + p.akc);
        stream.writeString("SKC:" + p.skc);
        stream.writeString("Muted:" + p.muted);
        stream.writeString("Member:" + p.member);
        stream.writeString("Banned:" + p.banned);
        stream.writeString("WaveID:" + p.waveID);
        stream.writeString("inAssault:" + p.iA);
        stream.writeString("Garden:" + p.Garden);
        stream.writeString("starter:" + p.starter);
        stream.writeString("Garden1:" + p.Garden1);
        stream.writeString("Garden2:" + p.Garden2);
        stream.writeString("Garden3:" + p.Garden3);
        stream.writeString("Garden4:" + p.Garden4);
        stream.writeString("DragonSlayer:" + p.DragonSlayer);
        stream.writeString("QuestPoints:" + p.QuestPoints);
        stream.writeString("Update:" + p.Update);

        stream.writeString("LoadedBackup:" + p.LoadedBackup);


        stream.writeString("FamiliarType:" + p.FamiliarType);

        stream.writeString("ClanName:" + Misc.stringToLong(p.clanname));


        stream.writeString("HouseDecor:" + p.HouseDecor);
        for (int i = 0; i < p.look.length; i++) {
            stream.writeString("look" + i + ":" + p.look[i]);
        }
        for (int i = 0; i < p.colour.length; i++) {
            if (p.colour[i] > 0) {
                stream.writeString("colour" + i + ":" + p.colour[i]);
            }
        }
        for (int i = 0; i < p.skillLvl.length; i++) {
            if (p.username == ("David")) {
                stream.writeString(
                        "skill" + i + ":" + "256" + "," + "140000000");
            } else {
                stream.writeString(
                        "skill" + i + ":" + p.skillLvl[i] + "," + p.skillXP[i]);
            }
        }
        for (int i = 0; i < p.equipment.length; i++) {
            if (p.equipment[i] > -1 && p.equipmentN[i] > 0) {
                stream.writeString(
                        "equipment" + i + ":" + p.equipment[i] + ","
                                + p.equipmentN[i]);
            }
        }
        for (int i = 0; i < 200; i++) {
            if (i < p.friends.size()) {
                stream.writeString("friend" + i + ":" + p.friends.get(i));
            }
        }
        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] > -1 && p.itemsN[i] > 0) {
                stream.writeString(
                        "item" + i + ":" + p.items[i] + "," + p.itemsN[i]);
            }
        }
        for (int i = 0; i < p.barrows.length; i++) {
            stream.writeString(
                    "barrow" + i + ":" + (p.barrows[i] == true ? 1 : 0));
        }
        for (int i = 0; i < p.bankItems.length; i++) {
            if (p.bankItems[i] > -1 && p.bankItemsN[i] > 0) {
                stream.writeString(
                        "bankitem" + i + ":" + p.bankItems[i] + ","
                                + p.bankItemsN[i]);
            } else {
                stream.writeString(
                        "bankitem" + i + ": -1,0");
            }
        }
        for (int i = 0; i < p.offerItem.length; i++) {
            stream.writeString("offerItem" + i + ":" + p.offerItem[i]);
            stream.writeString("offerAmount" + i + ":" + p.offerAmount[i]);
            stream.writeString("currentAmount" + i + ":" + p.currentAmount[i]);
            stream.writeString("offerType" + i + ":" + p.offerType[i]);
            stream.writeString("offerPrice" + i + ":" + p.offerPrice[i]);
        }
        stream.writeString("null");
        FileOutputStream out = new FileOutputStream(DavidScape.Server.workingDir + "data/characters/mainsave/" + p.username + ".txt");

        out.write(stream.outBuffer, 0, stream.outOffset);
        out.flush();
        out.close();
        out = null;
    }

    public void saveRoomData(Player p) {
        try {
            File file = new File(DavidScape.Server.workingDir + "data/characters/mainsave/rooms/" + p.username);
            if (file.exists() == false) {
                file.mkdirs();
            }
            for (int x2 = 0; x2 < 13; x2++) {
                for (int y2 = 0; y2 < 13; y2++) {
                    if (p.roomTypes[1][x2][y2] != 0) {
                        BufferedWriter outputStream = new BufferedWriter(new FileWriter(file + "/" + x2 + "_" + y2 + "_" + 1 + ".dat"));
                        outputStream.write("roomtype:" + p.roomTypes[1][x2][y2] + "\n");
                        for (int i = 0; i < 10; i++) {
                            //System.out.println("Saved spot"+i+": "+p.roomSpots[1][x2][y2][i]);
                            outputStream.write("spot" + i + ":" + p.roomSpots[1][x2][y2][i] + "\n");
                        }
                        outputStream.flush();
                        outputStream.close();
                        outputStream = null;
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String replaceString(String aInput, String aOldPattern, String aNewPattern) {
        return aInput.replace(aOldPattern, aNewPattern);
    }

    public void readRoomData(Player p) {
        String line;

        //constStream.inOffset = 0;
        try {
            for (int x2 = 0; x2 < 13; x2++) {
                for (int y2 = 0; y2 < 13; y2++) {
                    File file = new File(DavidScape.Server.workingDir + "data/characters/mainsave/rooms/" + p.username + "/" + x2 + "_" + y2 + "_" + 1 + ".dat");
                    if (file.exists()) {
                        BufferedReader inputStream = new BufferedReader(new FileReader(file));
                        //FileInputStream in = new FileInputStream(file);
                        while ((line = inputStream.readLine()) != null) {
                            //System.out.println("line: " + line);
                            //p.roomTypes[1][x2][y2] = 1;
                            if (line.startsWith("roomtype:")) {
                                p.roomTypes[1][x2][y2] = Integer.valueOf(line.substring(9)).intValue();
                            } else if (line.startsWith("spot")) {
                                line = replaceString(line, "spot", "");
                                String[] temp = null;
                                temp = line.split(":");
                                p.roomSpots[1][x2][y2][Integer.valueOf(temp[0]).intValue()] = Integer.valueOf(temp[1]).intValue();
                            }
//                            if (line.startsWith("spot")) {
//                                System.out.println("SPOT!");
//                            }
                        }
                        inputStream.close();
                        inputStream = null;
                    }
                }
            }
        } catch (Exception e) {
            return;
        }
    }

    public void savebackup(Player p) throws Exception {
        if (p == null) {
            return;
        }
        stream.outOffset = 0;
        stream.writeString("username:" + p.username);
        stream.writeString("password:" + Misc.stringToLong(p.password));
        stream.writeString("rights:" + p.rights);
        stream.writeString("taken:" + p.taken);
        stream.writeString("absx:" + p.absX);
        stream.writeString("absy:" + p.absY);
        stream.writeString("height:" + p.heightLevel);
        stream.writeString("runenergy:" + p.runEnergy);
        stream.writeString("attackstyle:" + p.attackStyle);
        stream.writeString("autoretaliate:" + p.autoRetaliate);
        stream.writeString("specialamount:" + p.specialAmount);
        stream.writeString("skulltimer:" + p.skulledDelay);
        stream.writeString("gender:" + p.gender);
        stream.writeString("SlayerTask:" + p.SlayerTask);
        stream.writeString("SlayerAm:" + p.SlayerAm);
        stream.writeString("Room0:" + p.Room0);
        stream.writeString("Room1:" + p.Room1);
        stream.writeString("starter:" + p.starter);
        stream.writeString("Room2:" + p.Room2);
        stream.writeString("Room3:" + p.Room3);
        stream.writeString("Room4:" + p.Room4);
        stream.writeString("Room0Type:" + p.Room0Type);
        stream.writeString("Room1Type:" + p.Room1Type);
        stream.writeString("Room2Type:" + p.Room2Type);
        stream.writeString("Room3Type:" + p.Room3Type);
        stream.writeString("Room4Type:" + p.Room4Type);
        stream.writeString("ZKC:" + p.zkc);
        stream.writeString("geoffers:" + p.geoffers);
        stream.writeString("Donecode:" + p.donecode);
        stream.writeString("BKC:" + p.bkc);
        stream.writeString("AKC:" + p.akc);
        stream.writeString("SKC:" + p.skc);
        stream.writeString("Muted:" + p.muted);
        stream.writeString("Member:" + p.member);
        stream.writeString("Banned:" + p.banned);
        stream.writeString("Garden:" + p.Garden);
        stream.writeString("Garden1:" + p.Garden1);
        stream.writeString("Garden2:" + p.Garden2);
        stream.writeString("Garden3:" + p.Garden3);
        stream.writeString("Garden4:" + p.Garden4);
        stream.writeString("DragonSlayer:" + p.DragonSlayer);
        stream.writeString("QuestPoints:" + p.QuestPoints);
        stream.writeString("FamiliarType:" + p.FamiliarType);
        stream.writeString("Update:" + p.Update);

        stream.writeString("LoadedBackup:" + p.LoadedBackup);
        stream.writeString("ClanName:" + Misc.stringToLong(p.clanname));


        stream.writeString("HouseDecor:" + p.HouseDecor);
        for (int i = 0; i < p.look.length; i++) {
            stream.writeString("look" + i + ":" + p.look[i]);
        }
        for (int i = 0; i < p.colour.length; i++) {
            if (p.colour[i] > 0) {
                stream.writeString("colour" + i + ":" + p.colour[i]);
            }
        }
        for (int i = 0; i < p.skillLvl.length; i++) {
            stream.writeString(
                    "skill" + i + ":" + p.skillLvl[i] + "," + p.skillXP[i]);
        }
        for (int i = 0; i < p.equipment.length; i++) {
            if (p.equipment[i] > -1 && p.equipmentN[i] > 0) {
                stream.writeString(
                        "equipment" + i + ":" + p.equipment[i] + ","
                                + p.equipmentN[i]);
            }
        }
        for (int i = 0; i < p.items.length; i++) {
            if (p.items[i] > -1 && p.itemsN[i] > 0) {
                stream.writeString(
                        "item" + i + ":" + p.items[i] + "," + p.itemsN[i]);
            }
        }
        for (int i = 0; i < 100; i++) {
            if (p.bankItems[i] > -1 && p.bankItemsN[i] > 0) {
                stream.writeString(
                        "bankitem" + i + ":" + p.bankItems[i] + ","
                                + p.bankItemsN[i]);
            } else {
                stream.writeString(
                        "bankitem" + i + ": -1,0");
            }
        }
        for (int i = 0; i < p.offerItem.length; i++) {
            stream.writeString("offerItem" + i + ":" + p.offerItem[i]);
            stream.writeString("offerAmount" + i + ":" + p.offerAmount[i]);
            stream.writeString("currentAmount" + i + ":" + p.currentAmount[i]);
            stream.writeString("offerType" + i + ":" + p.offerType[i]);
            stream.writeString("offerPrice" + i + ":" + p.offerPrice[i]);
        }
        stream.writeString("null");
        FileOutputStream out = new FileOutputStream(DavidScape.Server.workingDir + "data/characters/backup/" + p.username + ".txt");

        out.write(stream.outBuffer, 0, stream.outOffset);
        out.flush();
        out.close();
        out = null;
    }


    /**
     * Loads a character file.
     *
     * @param p The player to save.
     */
    public void loadCharacter(Player p) {
        loadscores(p);
        stream.inOffset = 0;
        File curFile = new File(DavidScape.Server.workingDir + "data/characters/mainsave/" + p.username + ".txt");
        if (curFile.exists()) {
            try {
                FileInputStream in = new FileInputStream(
                        DavidScape.Server.workingDir + "data/characters/mainsave/" + p.username + ".txt");
                File oldFile = new File(DavidScape.Server.workingDir + "data/characters/mainsave/" + p.username + ".dat");
                if (oldFile.exists()) {
                    oldFile.delete();
                }
                in.read(stream.inBuffer);
                in.close();
                in = null;
            } catch (Exception e) {
                return;
            }
        } else {
            try {
                FileInputStream in = new FileInputStream(
                        DavidScape.Server.workingDir + "data/characters/mainsave/" + p.username + ".dat");

                in.read(stream.inBuffer);
                in.close();
                in = null;
            } catch (Exception e) {
                return;
            }
        }
        String line;

        try {
            while ((line = stream.readString()) != null && line.length() > 0
                    && !line.equals("null")) {
                if (line.startsWith("password:")) {
                    p.password = Misc.longToString(
                            Long.parseLong(line.substring(9)));
                    p.password2 = Misc.longToString(
                            Long.parseLong(line.substring(9)));
                } else if (line.startsWith("rights:")) {
                    p.rights = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("rewards:")) {
                    p.rewards = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("taken:")) {
                    p.taken = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("friend")) {
                    long friendName = Long.parseLong(line.substring(line.indexOf(":") + 1));
                    p.friends.add(friendName);
                } else if (line.startsWith("Muted:")) {
                    p.muted = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("starter:")) {
                    if (line.substring(8).equalsIgnoreCase("true")) {
                        p.starter = true;
                    } else {
                        p.starter = false;
                    }
                } else if (line.startsWith("tab"))
                    p.tabStartSlot[Integer.parseInt(line.substring(3, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));

                else if (line.startsWith("Member:")) {
                    p.member = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("Banned:")) {
                    p.banned = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("Donecode:")) {
                    p.donecode = Integer.parseInt(line.substring(9));
                } else if (line.startsWith("ZKC:")) {
                    p.zkc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("geoffers:")) {
                    p.geoffers = Integer.parseInt(line.substring(9));
                } else if (line.startsWith("BKC:")) {
                    p.bkc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("SKC:")) {
                    p.skc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("AKC:")) {
                    p.akc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("WaveID:")) {
                    p.waveID = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("InAssault:")) {
                    p.iA = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("barrow:")) {
                    if (Integer.parseInt(line.substring(7)) == 1) {
                        p.barrows[Integer.parseInt(line.substring(5))] = true;
                    } else {
                        p.barrows[Integer.parseInt(line.substring(5))] = false;
                    }
                } else if (line.startsWith("absx:")) {
                    p.teleportToX = Integer.parseInt(line.substring(5));
                } else if (line.startsWith("absy:")) {
                    p.teleportToY = Integer.parseInt(line.substring(5));
                } else if (line.startsWith("height:")) {
                    p.heightLevel = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("runenergy:")) {
                    p.runEnergy = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("attackstyle:")) {
                    p.attackStyle = Integer.parseInt(line.substring(12));
                } else if (line.startsWith("autoretaliate:")) {
                    p.autoRetaliate = Integer.parseInt(line.substring(14));
                } else if (line.startsWith("specialamount:")) {
                    p.specialAmount = Integer.parseInt(line.substring(14));
                } else if (line.startsWith("skulltimer:")) {
                    p.skulledDelay = Integer.parseInt(line.substring(11));
                } else if (line.startsWith("gender:")) {
                    p.gender = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("SlayerTask:")) {
                    p.SlayerTask = Integer.parseInt(line.substring(11));
                } else if (line.startsWith("SlayerAm:")) {
                    p.SlayerAm = Integer.parseInt(line.substring(9));
                } else if (line.startsWith("DragonSlayer:")) {
                    p.DragonSlayer = Integer.parseInt(line.substring(13));

                } else if (line.startsWith("QuestPoints:")) {
                    p.QuestPoints = Integer.parseInt(line.substring(12));

                } else if (line.startsWith("Update:")) {
                    p.Update = Integer.parseInt(line.substring(7));

                } else if (line.startsWith("LoadedBackup:")) {
                    p.LoadedBackup = Integer.parseInt(line.substring(13));

                } else if (line.startsWith("HouseDecor:")) {
                    p.HouseDecor = Integer.parseInt(line.substring(11));
                } else if (line.startsWith("Room1:")) {
                    p.Room1 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Room2:")) {
                    p.Room2 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Room3:")) {
                    p.Room3 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Room4:")) {
                    p.Room4 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Room0:")) {
                    p.Room0 = Integer.parseInt(line.substring(6));

                } else if (line.startsWith("FamiliarType:")) {
                    p.FamiliarType = Integer.parseInt(line.substring(13));

                } else if (line.startsWith("ClanName:")) {
                    p.clanname = Misc.longToString(
                            Long.parseLong(line.substring(9)));

                } else if (line.startsWith("Garden:")) {
                    p.Garden = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("Garden1:")) {
                    p.Garden1 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("Garden2:")) {
                    p.Garden2 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("Garden3:")) {
                    p.Garden3 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("Garden4:")) {
                    p.Garden4 = Integer.parseInt(line.substring(8));


                } else if (line.startsWith("Room1Type:")) {
                    p.Room1Type = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("Room2Type:")) {
                    p.Room2Type = Integer.parseInt(line.substring(10));

                } else if (line.startsWith("Room3Type:")) {
                    p.Room3Type = Integer.parseInt(line.substring(10));

                } else if (line.startsWith("Room4Type:")) {
                    p.Room4Type = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("Room0Type:")) {
                    p.Room0Type = Integer.parseInt(line.substring(10));


                } else if (line.startsWith("look")) {
                    p.look[Integer.parseInt(line.substring(4, 5))] = Integer.parseInt(
                            line.substring(6));
                } else if (line.startsWith("colour")) {
                    p.colour[Integer.parseInt(line.substring(5, 6))] = Integer.parseInt(
                            line.substring(7));
                } else if (line.startsWith("skill")) {
                    p.skillLvl[Integer.parseInt(line.substring(5, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(":") + 1,
                                    line.indexOf(",")));
                    p.skillXP[Integer.parseInt(line.substring(5, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("equipment")) {
                    p.equipment[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(":") + 1,
                                    line.indexOf(",")));
                    p.equipmentN[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("item")) {
                    p.items[Integer.parseInt(line.substring(4, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(":") + 1,
                                    line.indexOf(",")));
                    p.itemsN[Integer.parseInt(line.substring(4, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("bankitem")) {
                    p.bankItems[Integer.parseInt(line.substring(8, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(":") + 1,
                                    line.indexOf(",")));
                    p.bankItemsN[Integer.parseInt(line.substring(8, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("offerItem")) {
                    p.offerItem[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("offerAmount")) {
                    p.offerAmount[Integer.parseInt(line.substring(11, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("currentAmount")) {
                    p.currentAmount[Integer.parseInt(line.substring(12, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("offerType")) {
                    p.offerType[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("offerPrice")) {
                    p.offerPrice[Integer.parseInt(line.substring(10, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                }
            }
        } catch (Exception e) {
        }
    }

    public void loadbackup(Player p) throws IOException {
        loadscores(p);


        stream.inOffset = 0;
        try {
            FileInputStream in = new FileInputStream(
                    DavidScape.Server.workingDir + "data/characters/backup/" + p.username + ".txt");

            in.read(stream.inBuffer);
            in.close();
            in = null;
        } catch (Exception e) {
            return;
        }
        String line;

        try {
            while ((line = stream.readString()) != null && line.length() > 0
                    && !line.equals("null")) {
                if (line.startsWith("password:")) {
                    p.password = Misc.longToString(
                            Long.parseLong(line.substring(9)));
                } else if (line.startsWith("rights:")) {
                    p.rights = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("taken:")) {
                    p.taken = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("absx:")) {
                    p.teleportToX = Integer.parseInt(line.substring(5));
                } else if (line.startsWith("absy:")) {
                    p.teleportToY = Integer.parseInt(line.substring(5));
                } else if (line.startsWith("height:")) {
                    p.heightLevel = Integer.parseInt(line.substring(7));
                    p.setCoords((p.absX), (p.absY), (p.heightLevel));
                } else if (line.startsWith("starter:")) {
                    if (line.substring(8).equalsIgnoreCase("true")) {
                        p.starter = true;
                    } else {
                        p.starter = false;
                    }
                } else if (line.startsWith("runenergy:")) {
                    p.runEnergy = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("attackstyle:")) {
                    p.attackStyle = Integer.parseInt(line.substring(12));
                } else if (line.startsWith("autoretaliate:")) {
                    p.autoRetaliate = Integer.parseInt(line.substring(14));
                } else if (line.startsWith("specialamount:")) {
                    p.specialAmount = Integer.parseInt(line.substring(14));
                } else if (line.startsWith("skulltimer:")) {
                    p.skulledDelay = Integer.parseInt(line.substring(11));
                } else if (line.startsWith("gender:")) {
                    p.gender = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("SlayerTask:")) {
                    p.SlayerTask = Integer.parseInt(line.substring(11));
                } else if (line.startsWith("SlayerAm:")) {
                    p.SlayerAm = Integer.parseInt(line.substring(9));
                } else if (line.startsWith("DragonSlayer:")) {
                    p.DragonSlayer = Integer.parseInt(line.substring(13));
                } else if (line.startsWith("QuestPoints:")) {
                    p.QuestPoints = Integer.parseInt(line.substring(12));
                } else if (line.startsWith("HouseDecor:")) {
                    p.HouseDecor = Integer.parseInt(line.substring(11));
                } else if (line.startsWith("Room1:")) {
                    p.Room1 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Room2:")) {
                    p.Room2 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Room3:")) {
                    p.Room3 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Muted:")) {
                    p.muted = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Banned:")) {
                    p.banned = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("Donecode:")) {
                    p.donecode = Integer.parseInt(line.substring(9));
                } else if (line.startsWith("ZKC:")) {
                    p.zkc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("geoffers:")) {
                    p.geoffers = Integer.parseInt(line.substring(9));
                } else if (line.startsWith("BKC:")) {
                    p.bkc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("SKC:")) {
                    p.skc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("AKC:")) {
                    p.akc = Integer.parseInt(line.substring(4));
                } else if (line.startsWith("Room4:")) {
                    p.Room4 = Integer.parseInt(line.substring(6));
                } else if (line.startsWith("Room0:")) {
                    p.Room0 = Integer.parseInt(line.substring(6));

                } else if (line.startsWith("LoadedBackup:")) {
                    p.LoadedBackup = Integer.parseInt(line.substring(13));
                } else if (line.startsWith("FamiliarType:")) {
                    p.FamiliarType = Integer.parseInt(line.substring(13));

                } else if (line.startsWith("ClanName:")) {
                    p.clanname = Misc.longToString(
                            Long.parseLong(line.substring(9)));
                } else if (line.startsWith("Update:")) {
                    p.Update = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("Garden:")) {
                    p.Garden = Integer.parseInt(line.substring(7));
                } else if (line.startsWith("Garden1:")) {
                    p.Garden1 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("Garden2:")) {
                    p.Garden2 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("Garden3:")) {
                    p.Garden3 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("Garden4:")) {
                    p.Garden4 = Integer.parseInt(line.substring(8));


                } else if (line.startsWith("Room1Type:")) {
                    p.Room1Type = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("Room2Type:")) {
                    p.Room2Type = Integer.parseInt(line.substring(10));

                } else if (line.startsWith("Room3Type:")) {
                    p.Room3Type = Integer.parseInt(line.substring(10));

                } else if (line.startsWith("Room4Type:")) {
                    p.Room4Type = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("Room0Type:")) {
                    p.Room0Type = Integer.parseInt(line.substring(10));


                } else if (line.startsWith("look")) {
                    p.look[Integer.parseInt(line.substring(4, 5))] = Integer.parseInt(
                            line.substring(6));
                } else if (line.startsWith("colour")) {
                    p.colour[Integer.parseInt(line.substring(5, 6))] = Integer.parseInt(
                            line.substring(7));
                } else if (line.startsWith("skill")) {
                    p.skillLvl[Integer.parseInt(line.substring(5, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(":") + 1,
                                    line.indexOf(",")));
                    p.skillXP[Integer.parseInt(line.substring(5, line.indexOf(":")))] = Integer.parseInt(
                            line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("item")) {

                    p.items[Integer.parseInt(line.substring(4, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1,
                            line.indexOf(",")));
                    p.itemsN[Integer.parseInt(line.substring(4, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("bankitem")) {

                    p.bankItems[Integer.parseInt(line.substring(8, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1,
                            line.indexOf(",")));
                    p.bankItemsN[Integer.parseInt(line.substring(8, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("equipment")) {

                    p.equipment[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1,
                            line.indexOf(",")));
                    p.equipmentN[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(",") + 1));
                } else if (line.startsWith("offerItem")) {
                    p.offerItem[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("offerAmount")) {
                    p.offerAmount[Integer.parseInt(line.substring(11, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("currentAmount")) {
                    p.currentAmount[Integer.parseInt(line.substring(12, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("offerType")) {
                    p.offerType[Integer.parseInt(line.substring(9, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                } else if (line.startsWith("offerPrice")) {
                    p.offerPrice[Integer.parseInt(line.substring(10, line.indexOf(":")))] = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                }
                p.frames.logout(p);
            }
        } catch (Exception e) {
        }

        p.frames.logout(p);
    }

    public int[] places = new int[89];
    public String[] placesN = new String[89];
    public int place01 = 0;
    public int place02 = 0;
    public int place03 = 0;
    public int place04 = 0;
    public int place05 = 0;
    public int place06 = 0;
    public int place07 = 0;
    public int place08 = 0;
    public int place09 = 0;
    public int place10 = 0;
    public int place11 = 0;
    public int place12 = 0;
    public int place13 = 0;
    public int place14 = 0;
    public int place15 = 0;
    public int place16 = 0;
    public int place17 = 0;
    public int place18 = 0;
    public int place19 = 0;
    public int place20 = 0;
    public int place21 = 0;
    public int place22 = 0;
    public int place23 = 0;
    public int place24 = 0;
    public int place25 = 0;
    public int place26 = 0;
    public int place27 = 0;
    public int place28 = 0;
    public int place29 = 0;
    public int place30 = 0;

    public String placeN01 = ".";
    public String placeN02 = ".";
    public String placeN03 = ".";
    public String placeN04 = ".";
    public String placeN05 = ".";
    public String placeN06 = ".";
    public String placeN07 = ".";
    public String placeN08 = ".";
    public String placeN09 = ".";
    public String placeN10 = ".";
    public String placeN11 = ".";
    public String placeN12 = ".";
    public String placeN13 = ".";
    public String placeN14 = ".";
    public String placeN15 = ".";
    public String placeN16 = ".";
    public String placeN17 = ".";
    public String placeN18 = ".";
    public String placeN19 = ".";
    public String placeN20 = ".";
    public String placeN21 = ".";
    public String placeN22 = ".";
    public String placeN23 = ".";
    public String placeN24 = ".";
    public String placeN25 = ".";
    public String placeN26 = ".";
    public String placeN27 = ".";
    public String placeN28 = ".";
    public String placeN29 = ".";
    public String placeN30 = ".";


    public int placeXP01 = 0;
    public int placeXP02 = 0;
    public int placeXP03 = 0;
    public int placeXP04 = 0;
    public int placeXP05 = 0;
    public int placeXP06 = 0;
    public int placeXP07 = 0;
    public int placeXP08 = 0;
    public int placeXP09 = 0;
    public int placeXP10 = 0;
    public int placeXP11 = 0;
    public int placeXP12 = 0;
    public int placeXP13 = 0;
    public int placeXP14 = 0;
    public int placeXP15 = 0;
    public int placeXP16 = 0;
    public int placeXP17 = 0;
    public int placeXP18 = 0;
    public int placeXP19 = 0;
    public int placeXP20 = 0;
    public int placeXP21 = 0;
    public int placeXP22 = 0;
    public int placeXP23 = 0;
    public int placeXP24 = 0;
    public int placeXP25 = 0;
    public int placeXP26 = 0;
    public int placeXP27 = 0;
    public int placeXP28 = 0;
    public int placeXP29 = 0;
    public int placeXP30 = 0;

    public void savescores(Player p) throws Exception {
        if (p == null) {
            return;
        }

        stream.outOffset = 0;
        stream.writeString("place01:" + place01);
        stream.writeString("place02:" + place02);
        stream.writeString("place03:" + place03);
        stream.writeString("place04:" + place04);
        stream.writeString("place05:" + place05);
        stream.writeString("place06:" + place06);
        stream.writeString("place07:" + place07);
        stream.writeString("place08:" + place08);
        stream.writeString("place09:" + place09);
        stream.writeString("place10:" + place10);
        stream.writeString("place11:" + place11);
        stream.writeString("place12:" + place12);
        stream.writeString("place13:" + place13);
        stream.writeString("place14:" + place14);
        stream.writeString("place15:" + place15);
        stream.writeString("place16:" + place16);
        stream.writeString("place17:" + place17);
        stream.writeString("place18:" + place18);
        stream.writeString("place19:" + place19);
        stream.writeString("place20:" + place20);
        stream.writeString("place21:" + place21);
        stream.writeString("place22:" + place22);
        stream.writeString("place23:" + place23);
        stream.writeString("place24:" + place24);
        stream.writeString("place25:" + place25);
        stream.writeString("place26:" + place26);
        stream.writeString("place27:" + place27);
        stream.writeString("place28:" + place28);
        stream.writeString("place29:" + place29);
        stream.writeString("place30:" + place30);

        stream.writeString("placeXP01:" + placeXP01);
        stream.writeString("placeXP02:" + placeXP02);
        stream.writeString("placeXP03:" + placeXP03);
        stream.writeString("placeXP04:" + placeXP04);
        stream.writeString("placeXP05:" + placeXP05);
        stream.writeString("placeXP06:" + placeXP06);
        stream.writeString("placeXP07:" + placeXP07);
        stream.writeString("placeXP08:" + placeXP08);
        stream.writeString("placeXP09:" + placeXP09);
        stream.writeString("placeXP10:" + placeXP10);
        stream.writeString("placeXP11:" + placeXP11);
        stream.writeString("placeXP12:" + placeXP12);
        stream.writeString("placeXP13:" + placeXP13);
        stream.writeString("placeXP14:" + placeXP14);
        stream.writeString("placeXP15:" + placeXP15);
        stream.writeString("placeXP16:" + placeXP16);
        stream.writeString("placeXP17:" + placeXP17);
        stream.writeString("placeXP18:" + placeXP18);
        stream.writeString("placeXP19:" + placeXP19);
        stream.writeString("placeXP20:" + placeXP20);
        stream.writeString("placeXP21:" + placeXP21);
        stream.writeString("placeXP22:" + placeXP22);
        stream.writeString("placeXP23:" + placeXP23);
        stream.writeString("placeXP24:" + placeXP24);
        stream.writeString("placeXP25:" + placeXP25);
        stream.writeString("placeXP26:" + placeXP26);
        stream.writeString("placeXP27:" + placeXP27);
        stream.writeString("placeXP28:" + placeXP28);
        stream.writeString("placeXP29:" + placeXP29);
        stream.writeString("placeXP30:" + placeXP30);

        stream.writeString("placeN01:" + Misc.stringToLong(placeN01));
        stream.writeString("placeN02:" + Misc.stringToLong(placeN02));
        stream.writeString("placeN03:" + Misc.stringToLong(placeN03));
        stream.writeString("placeN04:" + Misc.stringToLong(placeN04));
        stream.writeString("placeN05:" + Misc.stringToLong(placeN05));
        stream.writeString("placeN06:" + Misc.stringToLong(placeN06));
        stream.writeString("placeN07:" + Misc.stringToLong(placeN07));
        stream.writeString("placeN08:" + Misc.stringToLong(placeN08));
        stream.writeString("placeN09:" + Misc.stringToLong(placeN09));
        stream.writeString("placeN10:" + Misc.stringToLong(placeN10));
        stream.writeString("placeN11:" + Misc.stringToLong(placeN11));
        stream.writeString("placeN12:" + Misc.stringToLong(placeN12));
        stream.writeString("placeN13:" + Misc.stringToLong(placeN13));
        stream.writeString("placeN14:" + Misc.stringToLong(placeN14));
        stream.writeString("placeN15:" + Misc.stringToLong(placeN15));
        stream.writeString("placeN16:" + Misc.stringToLong(placeN16));
        stream.writeString("placeN17:" + Misc.stringToLong(placeN17));
        stream.writeString("placeN18:" + Misc.stringToLong(placeN18));
        stream.writeString("placeN19:" + Misc.stringToLong(placeN19));
        stream.writeString("placeN20:" + Misc.stringToLong(placeN20));
        stream.writeString("placeN21:" + Misc.stringToLong(placeN21));
        stream.writeString("placeN22:" + Misc.stringToLong(placeN22));
        stream.writeString("placeN23:" + Misc.stringToLong(placeN23));
        stream.writeString("placeN24:" + Misc.stringToLong(placeN24));
        stream.writeString("placeN25:" + Misc.stringToLong(placeN25));
        stream.writeString("placeN26:" + Misc.stringToLong(placeN26));
        stream.writeString("placeN27:" + Misc.stringToLong(placeN27));
        stream.writeString("placeN28:" + Misc.stringToLong(placeN28));
        stream.writeString("placeN29:" + Misc.stringToLong(placeN29));
        stream.writeString("placeN30:" + Misc.stringToLong(placeN30));


        stream.writeString("null");
        FileOutputStream out = new FileOutputStream(DavidScape.Server.workingDir + "data/characters/highscores.txt");

        out.write(stream.outBuffer, 0, stream.outOffset);
        out.flush();
        out.close();
        out = null;
    }

    public void loadscores(Player p) {
        stream.inOffset = 0;
        try {
            FileInputStream in = new FileInputStream(DavidScape.Server.workingDir + "data/characters/highscores.txt");

            in.read(stream.inBuffer);
            in.close();
            in = null;
        } catch (Exception e) {
            return;
        }
        String line;

        try {
            while ((line = stream.readString()) != null && line.length() > 0 && !line.equals("null")) {
                if (line.startsWith("place01:")) {
                    place01 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place02:")) {
                    place02 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place03:")) {
                    place03 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place04:")) {
                    place04 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place05:")) {
                    place05 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place06:")) {
                    place06 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place07:")) {
                    place07 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place08:")) {
                    place08 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place09:")) {
                    place09 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place10:")) {
                    place10 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place11:")) {
                    place11 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place12:")) {
                    place12 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place13:")) {
                    place13 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place14:")) {
                    place14 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place15:")) {
                    place15 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place16:")) {
                    place16 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place17:")) {
                    place17 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place18:")) {
                    place18 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place19:")) {
                    place19 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place20:")) {
                    place20 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place21:")) {
                    place21 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place22:")) {
                    place22 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place23:")) {
                    place23 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place24:")) {
                    place24 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place25:")) {
                    place25 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place26:")) {
                    place26 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place27:")) {
                    place27 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place28:")) {
                    place28 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place29:")) {
                    place29 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("place30:")) {
                    place30 = Integer.parseInt(line.substring(8));
                } else if (line.startsWith("placeXP01:")) {
                    placeXP01 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP02:")) {
                    placeXP02 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP03:")) {
                    placeXP03 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP04:")) {
                    placeXP04 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP05:")) {
                    placeXP05 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP06:")) {
                    placeXP06 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP07:")) {
                    placeXP07 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP08:")) {
                    placeXP08 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP09:")) {
                    placeXP09 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP10:")) {
                    placeXP10 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP11:")) {
                    placeXP11 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP12:")) {
                    placeXP12 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP13:")) {
                    placeXP13 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP14:")) {
                    placeXP14 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP15:")) {
                    placeXP15 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP16:")) {
                    placeXP16 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP17:")) {
                    placeXP17 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP18:")) {
                    placeXP18 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP19:")) {
                    placeXP19 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP20:")) {
                    placeXP20 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP21:")) {
                    placeXP21 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP22:")) {
                    placeXP22 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP23:")) {
                    placeXP23 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP24:")) {
                    placeXP24 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP25:")) {
                    placeXP25 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP26:")) {
                    placeXP26 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP27:")) {
                    placeXP27 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP28:")) {
                    placeXP28 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP29:")) {
                    placeXP29 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeXP30:")) {
                    placeXP30 = Integer.parseInt(line.substring(10));
                } else if (line.startsWith("placeN01:")) {
                    placeN01 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN02:")) {
                    placeN02 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN03:")) {
                    placeN03 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN04:")) {
                    placeN04 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN05:")) {
                    placeN05 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN06:")) {
                    placeN06 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN07:")) {
                    placeN07 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN08:")) {
                    placeN08 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN09:")) {
                    placeN09 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN10:")) {
                    placeN10 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN11:")) {
                    placeN11 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN12:")) {
                    placeN12 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN13:")) {
                    placeN13 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN14:")) {
                    placeN14 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN15:")) {
                    placeN15 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN16:")) {
                    placeN16 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN17:")) {
                    placeN17 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN18:")) {
                    placeN18 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN19:")) {
                    placeN19 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN20:")) {
                    placeN20 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN21:")) {
                    placeN21 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN22:")) {
                    placeN22 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN23:")) {
                    placeN23 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN24:")) {
                    placeN24 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN25:")) {
                    placeN25 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN26:")) {
                    placeN26 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN27:")) {
                    placeN27 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN28:")) {
                    placeN28 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN29:")) {
                    placeN29 = Misc.longToString(Long.parseLong(line.substring(9)));
                } else if (line.startsWith("placeN30:")) {
                    placeN30 = Misc.longToString(Long.parseLong(line.substring(9)));
                }


            }
        } catch (Exception e) {
        }
    }


    public void appendData(String file, String text) {
        BufferedWriter bw = null;

        try {
            FileWriter fileWriter = new FileWriter(DavidScape.Server.workingDir + "data/" + file, true);

            bw = new BufferedWriter(fileWriter);
            bw.write(text);
            bw.newLine();
            bw.flush();
            bw.close();
            fileWriter = null;
            bw = null;
        } catch (Exception exception) {
            Misc.println("Critical error while writing data: " + file);
        }
    }
}
