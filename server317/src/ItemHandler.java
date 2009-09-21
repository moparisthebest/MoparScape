import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ItemHandler {
    public static int DropItemCount = 0;
    public static int MaxDropItems = 100000;
    public static int MaxListedItems = 10000;
    //process() is called evry 500 ms
    public static int MaxDropShowDelay = 120; //120 * 500 = 60000 / 1000 = 60s
    public static int SDID = 90; //90 * 500 = 45000 / 1000 = 45s
    //SDID = Standard Drop Items Delay
    public static int[] DroppedItemsID = new int[MaxDropItems];
    public static int[] DroppedItemsX = new int[MaxDropItems];
    public static int[] DroppedItemsY = new int[MaxDropItems];
    public static int[] DroppedItemsN = new int[MaxDropItems];
    public static int[] DroppedItemsH = new int[MaxDropItems];
    public static int[] DroppedItemsDDelay = new int[MaxDropItems];
    public static int[] DroppedItemsSDelay = new int[MaxDropItems];
    public static int[] DroppedItemsDropper = new int[MaxDropItems];
    public static int[] DroppedItemsDeletecount = new int[MaxDropItems];
    public static boolean[] DroppedItemsAlwaysDrop = new boolean[MaxDropItems];
    public ItemList ItemList[] = new ItemList[MaxListedItems];

    ItemHandler() {
        for (int i = 0; i < MaxDropItems; i++) {
            ResetItem(i);
        }
        for (int i = 0; i < MaxListedItems; i++) {
            ItemList[i] = null;
        }
        loadItemList(server.workingDir + "item.cfg");
        loadDrops(server.workingDir + "drops.cfg");
    }

    public void process() {
        for (int i = 0; i < MaxDropItems; i++) {
            if (DroppedItemsID[i] > -1) {
                if (DroppedItemsDDelay[i] > -10) {
                    DroppedItemsDDelay[i]--;
                }
                if (DroppedItemsSDelay[i] < (MaxDropShowDelay + 10)) {
                    DroppedItemsSDelay[i]++;
                }
                if (DroppedItemsSDelay[i] >= MaxDropShowDelay && DroppedItemsAlwaysDrop[i] == false) {
                    for (int j = 1; j < server.playerHandler.maxPlayers; j++) {
                        if (server.playerHandler.players[j] != null) {
                            server.playerHandler.players[j].MustDelete[i] = true;
                        }
                    }
                }
            }
        }
    }

    public void ResetItem(int ArrayID) {
        DroppedItemsID[ArrayID] = -1;
        DroppedItemsX[ArrayID] = -1;
        DroppedItemsY[ArrayID] = -1;
        DroppedItemsN[ArrayID] = -1;
        DroppedItemsH[ArrayID] = -1;
        DroppedItemsDDelay[ArrayID] = -1;
        DroppedItemsSDelay[ArrayID] = 0;
        DroppedItemsDropper[ArrayID] = -1;
        DroppedItemsDeletecount[ArrayID] = 0;
        DroppedItemsAlwaysDrop[ArrayID] = false;
    }

    public boolean loadDrops(String FileName) {
        String line = "";
        String token = "";
        String token2 = "";
        String token2_2 = "";
        String[] token3 = new String[10];
        boolean EndOfFile = false;
        int ReadMode = 0;
        BufferedReader characterfile = null;
        try {
            characterfile = new BufferedReader(new FileReader(FileName));
        } catch (FileNotFoundException fileex) {
            misc.printlnTag(FileName + ": file not found.");
            return false;
        }
        try {
            line = characterfile.readLine();
        } catch (IOException ioexception) {
            misc.printlnTag(FileName + ": error loading file.");
            return false;
        }
        while (EndOfFile == false && line != null) {
            line = line.trim();
            int spot = line.indexOf("=");
            if (spot > -1) {
                token = line.substring(0, spot);
                token = token.trim();
                token2 = line.substring(spot + 1);
                token2 = token2.trim();
                token2_2 = token2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token3 = token2_2.split("\t");
                if (token.equals("drop")) {
                    DroppedItemsID[DropItemCount] = Integer.parseInt(token3[0]);
                    DroppedItemsX[DropItemCount] = Integer.parseInt(token3[1]);
                    DroppedItemsY[DropItemCount] = Integer.parseInt(token3[2]);
                    DroppedItemsN[DropItemCount] = Integer.parseInt(token3[3]);
                    DroppedItemsH[DropItemCount] = Integer.parseInt(token3[4]);
                    DroppedItemsAlwaysDrop[DropItemCount] = true;
                    DropItemCount++;
                }
            } else {
                if (line.equals("[ENDOFDROPLIST]")) {
                    try {
                        characterfile.close();
                    } catch (IOException ioexception) {
                    }
                    return true;
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
        return false;
    }

    public void newItemList(int ItemId, String ItemName, String ItemDescription, double ShopValue, double LowAlch, double HighAlch, int Bonuses[]) {
        // first, search for a free slot
        int slot = -1;
        for (int i = 0; i < MaxListedItems; i++) {
            if (ItemList[i] == null) {
                slot = i;
                break;
            }
        }

        if (slot == -1) return;        // no free slot found

        ItemList newItemList = new ItemList(ItemId);
        newItemList.itemName = ItemName;
        newItemList.itemDescription = ItemDescription;
        newItemList.ShopValue = ShopValue;
        newItemList.LowAlch = LowAlch;
        newItemList.HighAlch = HighAlch;
        newItemList.Bonuses = Bonuses;
        ItemList[slot] = newItemList;
    }

    public boolean loadItemList(String FileName) {
        String line = "";
        String token = "";
        String token2 = "";
        String token2_2 = "";
        String[] token3 = new String[10];
        boolean EndOfFile = false;
        int ReadMode = 0;
        BufferedReader characterfile = null;
        try {
            characterfile = new BufferedReader(new FileReader(FileName));
        } catch (FileNotFoundException fileex) {
            misc.printlnTag(FileName + ": file not found.");
            return false;
        }
        try {
            line = characterfile.readLine();
        } catch (IOException ioexception) {
            misc.printlnTag(FileName + ": error loading file.");
            return false;
        }
        while (EndOfFile == false && line != null) {
            line = line.trim();
            int spot = line.indexOf("=");
            if (spot > -1) {
                token = line.substring(0, spot);
                token = token.trim();
                token2 = line.substring(spot + 1);
                token2 = token2.trim();
                token2_2 = token2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token2_2 = token2_2.replaceAll("\t\t", "\t");
                token3 = token2_2.split("\t");
                if (token.equals("item")) {
                    int[] Bonuses = new int[12];
                    for (int i = 0; i < 12; i++) {
                        if (token3[(6 + i)] != null) {
                            Bonuses[i] = Integer.parseInt(token3[(6 + i)]);
                        } else {
                            break;
                        }
                    }
                    newItemList(Integer.parseInt(token3[0]), token3[1].replaceAll("_", " "), token3[2].replaceAll("_", " "), Double.parseDouble(token3[4]), Double.parseDouble(token3[4]), Double.parseDouble(token3[6]), Bonuses);
                }
            } else {
                if (line.equals("[ENDOFITEMLIST]")) {
                    try {
                        characterfile.close();
                    } catch (IOException ioexception) {
                    }
                    return true;
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
        return false;
    }
}
