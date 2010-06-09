package DavidScape.npcs.loading;


import DavidScape.Engine;
import DavidScape.util.Misc;

import java.io.BufferedReader;
import java.io.FileReader;


public class LoadNPCLists {

    /**
     * Constructs a new LoadNPCLists class.
     */
    public LoadNPCLists() {
        loadNPCList();
        loadNPCs();
    }

    /**
     * Loads NPCs which will be spawned.
     */
    private boolean loadNPCs() {
        String line = "", token = "", token2 = "", token2_2 = "", token3[] = new String[10];
        BufferedReader cfgFile = null;

        try {
            cfgFile = new BufferedReader(
                    new FileReader(DavidScape.Server.workingDir + "data/npcs/npcspawn.cfg"));
            line = cfgFile.readLine().trim();
        } catch (Exception e) {
            Misc.println("Error loading NPCs.");
            line = token = token2 = token2_2 = null;
            token3 = null;
            return false;
        }
        while (line != null) {
            int index = line.indexOf("=");

            if (index > -1) {
                token = line.substring(0, index).trim();
                token2 = line.substring(index + 1).trim();
                token2_2 = token2.replaceAll("\t\t", "\t");
                token3 = token2_2.split("\t");
                if (token.equals("spawn")) {
                    Engine.newNPC(Integer.parseInt(token3[0]),
                            Integer.parseInt(token3[1]),
                            Integer.parseInt(token3[2]),
                            Integer.parseInt(token3[3]),
                            Integer.parseInt(token3[4]),
                            Integer.parseInt(token3[5]),
                            Integer.parseInt(token3[6]),
                            Integer.parseInt(token3[7]), true);
                }
            } else if (line.equals("[ENDOFSPAWNLIST]")) {
                try {
                    cfgFile.close();
                } catch (Exception ioe) {
                }
                cfgFile = null;
                line = token = token2 = token2_2 = null;
                token3 = null;
                return true;
            }
            try {
                line = cfgFile.readLine();
            } catch (Exception ioe) {
                line = null;
                line = token = token2 = token2_2 = null;
                token3 = null;
                cfgFile = null;
                return false;
            }
        }
        try {
            cfgFile.close();
            cfgFile = null;
        } catch (Exception ioe) {
        }
        return false;
    }

    /**
     * Loads NPC hp, max hits, spawn times, etc.
     */
    private boolean loadNPCList() {
        String line = "", token = "", token2 = "", token2_2 = "", token3[] = new String[13];
        BufferedReader list = null;

        try {
            list = new BufferedReader(new FileReader(DavidScape.Server.workingDir + "data/npcs/npclist.cfg"));
            line = list.readLine().trim();
        } catch (Exception e) {
            Misc.println("Error loading NPC Lists.");
            return false;
        }
        while (line != null) {
            int spot = line.indexOf("=");

            if (spot > -1) {
                token = line.substring(0, spot).trim();
                token2 = line.substring(spot + 1).trim();
                token2_2 = token2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");

                token3 = token2_2.split("\t");
                if (token.equals("npc")) {
                    newNPCList(Integer.parseInt(token3[0]),
                            Integer.parseInt(token3[1]),
                            Integer.parseInt(token3[2]),
                            Integer.parseInt(token3[3]),
                            Integer.parseInt(token3[4]),
                            Integer.parseInt(token3[5]),
                            Integer.parseInt(token3[6]),
                            Integer.parseInt(token3[7]),
                            Integer.parseInt(token3[8]),
                            Integer.parseInt(token3[9]),
                            Integer.parseInt(token3[10]),
                            token3[11].replaceAll("_", " "),
                            token3[12].replaceAll("_", " "));
                }
            } else {
                if (line.equals("[ENDOFNPCLIST]")) {
                    try {
                        list.close();
                    } catch (Exception ioexception) {
                    }
                    list = null;
                    return true;
                }
            }
            try {
                line = list.readLine().trim();
            } catch (Exception ioexception1) {
                try {
                    list.close();
                } catch (Exception ioexception) {
                }
                list = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Creates a class for storing an NPC's stats.
     */
    private void newNPCList(int npcType, int cbLevel, int maxHP, int maxHit, int atkType, int weakness, int spawnTime, int attEmote, int defEmote, int deadEmote, int attDelay, String name, String examine) {
        if (npcType >= Engine.maxListedNPCs) {
            Misc.println(
                    "In NPCList.cfg you cannot exceed " + Engine.maxListedNPCs
                            + ".");
            return;
        }

        Engine.npcLists[npcType] = new NPCList(npcType, name, examine, cbLevel,
                maxHP, maxHit, atkType, weakness, spawnTime, attEmote, defEmote,
                deadEmote, attDelay);
    }

}
