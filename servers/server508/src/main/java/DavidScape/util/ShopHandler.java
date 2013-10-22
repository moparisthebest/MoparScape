package DavidScape.util;

import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;

public class ShopHandler {

    private Player p;
    private PlayerItems pi = new PlayerItems();
    public int maxItems = 40;
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

    public static int[] shop7 = {1755, 1623, 1621, 1619, 1617, 1631, 6571, 1733, 1734, 1746, 2506, 2508, 2510, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};  //CRAFTING
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

    int shopid = 0;
    public long lastRestock = System.currentTimeMillis();
    public int counter = 0;

    public void process() {
        boolean hasZero = false;
        if (System.currentTimeMillis() - lastRestock >= 10000) {
            for (int i = 0; i < Engine.shop2N.length; i++) {
                if (Engine.shop2N[i] < shop2N[i]) {
                    Engine.shop2N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop3N.length; i++) {
                if (Engine.shop3N[i] < shop3N[i]) {
                    Engine.shop3N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop4N.length; i++) {
                if (Engine.shop4N[i] < shop4N[i]) {
                    Engine.shop4N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop5N.length; i++) {
                if (Engine.shop5N[i] < shop5N[i]) {
                    Engine.shop5N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop6N.length; i++) {
                if (Engine.shop6N[i] < shop6N[i]) {
                    Engine.shop6N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop7N.length; i++) {
                if (Engine.shop7N[i] < shop7N[i]) {
                    Engine.shop7N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop8N.length; i++) {
                if (Engine.shop8N[i] < shop8N[i]) {
                    Engine.shop8N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop9N.length; i++) {
                if (Engine.shop9N[i] < shop9N[i]) {
                    Engine.shop9N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop10N.length; i++) {
                if (Engine.shop10N[i] < shop10N[i]) {
                    Engine.shop10N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop11N.length; i++) {
                if (Engine.shop11N[i] < shop12N[i]) {
                    Engine.shop11N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop12N.length; i++) {
                if (Engine.shop12N[i] < shop12N[i]) {
                    Engine.shop12N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop13N.length; i++) {
                if (Engine.shop13N[i] < shop13N[i]) {
                    Engine.shop13N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop14N.length; i++) {
                if (Engine.shop14N[i] < shop14N[i]) {
                    Engine.shop14N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop16N.length; i++) {
                if (Engine.shop16N[i] < shop16N[i]) {
                    Engine.shop16N[i]++;
                }
            }
            for (int i = 0; i < Engine.shop18N.length; i++) {
                if (Engine.shop18N[i] < shop18N[i]) {
                    Engine.shop18N[i]++;
                }
            }
            for (Player p : Engine.players) {
                if (p != null) {
                    getAmount(p);
                }
            }
            if (System.currentTimeMillis() - lastRestock >= 1000) {
                if (counter > 15) {
                    for (int i = 0; i < Engine.generalN.length; i++) {
                        if (Engine.generalN[i] > 0) {
                            Engine.generalN[i]--;
                        }
                        if (Engine.generalN[i] < 1) {
                            hasZero = true;
                        }
                    }
                    counter = -1;
                }
            }
            lastRestock = System.currentTimeMillis();
            counter++;
        }
        if (hasZero) {
            for (Player p : Engine.players) {
                if (p != null) {
                    getAmount(p);
                    clearSlots(p);
                }
            }
        }
    }


    public boolean itemInList(int itemId, Player p) {
        if (itemId < 0) {
            return false;
        }
        switch (p.shopid) {
            case 1:
                for (int i = 0; i < Engine.general.length; i++) {
                    if (Engine.general[i] != -1 && Engine.general[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < shop2.length; i++) {
                    if (shop2[i] != -1 && shop2[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < shop3.length; i++) {
                    if (shop3[i] != -1 && shop3[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < shop4.length; i++) {
                    if (shop4[i] != -1 && shop4[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 5:
                for (int i = 0; i < shop5.length; i++) {
                    if (shop5[i] != -1 && shop5[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 6:
                for (int i = 0; i < shop6.length; i++) {
                    if (shop6[i] != -1 && shop6[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 7:
                for (int i = 0; i < shop7.length; i++) {
                    if (shop7[i] != -1 && shop7[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 8:
                for (int i = 0; i < shop8.length; i++) {
                    if (shop8[i] != -1 && shop8[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 9:
                for (int i = 0; i < shop9.length; i++) {
                    if (shop9[i] != -1 && shop9[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 10:
                for (int i = 0; i < shop10.length; i++) {
                    if (shop10[i] != -1 && shop10[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 11:
                for (int i = 0; i < shop11.length; i++) {
                    if (shop11[i] != -1 && shop11[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 12:
                for (int i = 0; i < shop12.length; i++) {
                    if (shop12[i] != -1 && shop12[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 13:
                for (int i = 0; i < shop13.length; i++) {
                    if (shop13[i] != -1 && shop13[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 14:
                for (int i = 0; i < shop14.length; i++) {
                    if (shop14[i] != -1 && shop14[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 16:
                for (int i = 0; i < shop16.length; i++) {
                    if (shop16[i] != -1 && shop16[i] == itemId) {
                        return true;
                    }
                }
            case 18:
                for (int i = 0; i < shop18.length; i++) {
                    if (shop18[i] != -1 && shop18[i] == itemId) {
                        return true;
                    }
                }
                break;
            case 17:
                for (int i = 0; i < Engine.general.length; i++) {
                    if (Engine.partyItems[i] != -1 && Engine.partyItems[i] == itemId) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    public void sell(Player p, int item, int amnt) {
        PlayerItems pi = new PlayerItems();
        boolean shopShouldBuy = isItemOnShop(item, p) || itemInList(item, p) || p.shopid == 1 || p.shopid == 17;
        if (!shopShouldBuy) {
            p.frames.sendMessage(p, "You cannot sell this item to this shop.");
            return;
        }
        if (item == 995 && !p.party) {
            p.frames.sendMessage(p, "You can't sell coins to a shop");
            return;
        }
        int free = findFreeSlot(p);
        if (!isItemOnShop(item, p)) {
            if (free == -1) {
                if (p.party) {
                    p.frames.sendMessage(p, "The party room is is full.");
                } else {
                    p.frames.sendMessage(p, "This shop is full.");
                }
                return;
            }
            p.shopItems[free] = item;
            p.shopItemsN[free] = 0;
        }
        int slot = findItemSlot(item, p);
        if (amnt <= pi.invItemCount(p, item)) {
            if (itemStacks(item)) {
                p.shopItems[slot] = item;
                p.shopItemsN[slot] += amnt;

                pi.deleteItem(p, item, pi.getItemSlot(p, item), amnt);
                if (!p.party)
                    pi.addItem(p, 995, amnt * (int) (itemValue(item, p) * .75));
            } else {
                p.shopItems[slot] = item;
                for (int notused = amnt; notused > 0; notused--) {
                    pi.deleteItem(p, item, pi.getItemSlot(p, item), 1);
                    if (!p.party)
                        pi.addItem(p, 995, (int) (itemValue(item, p) * .75));
                    p.shopItemsN[slot]++;

                }
            }
        } else {
            amnt = pi.invItemCount(p, item);
            if (itemStacks(item)) {
                p.shopItems[slot] = item;
                p.shopItemsN[slot] += amnt;
                pi.deleteItem(p, item, pi.getItemSlot(p, item), amnt);
                if (!p.party)
                    pi.addItem(p, 995, amnt * (int) (itemValue(item, p) * .75));
            } else {
                p.shopItems[slot] = item;
                for (int notused = amnt; notused > 0; notused--) {
                    pi.deleteItem(p, item, pi.getItemSlot(p, item), 1);
                    if (!p.party)
                        pi.addItem(p, 995, (int) (itemValue(item, p) * .75));
                    p.shopItemsN[slot]++;

                }
            }
        }
        for (Player p2 : Engine.players) {
            if (p2 != null)
                if (p2.interfaceId == p.interfaceId) {
                    getAmount(p2);
                    sendShopItems(p2);
                }
        }
    }

    public void buy(Player p, int item, int amnt) {
        int slot = findItemSlot(item, p);
        if (slot == -1) {
            return;
        }
        if (p.shopItemsN[slot] < amnt) amnt = p.shopItemsN[slot];
        if (amnt == 0) {
            clearSlots(p);
            p.frames.sendMessage(p, "That item's stock has run out.");
            return;
        }
        if (itemStacks(item)) {
            if (pi.freeSlotCount(p) < 1) {
                p.frames.sendMessage(p, "Not enough space on inventory");
                return;
            }
            if (pi.invItemCount(p, 995) < (amnt * itemValue(item, p))) {
                p.frames.sendMessage(p, "Not enough coins to buy that many.");
                return;
            }
            pi.deleteItem(p, 995, pi.getItemSlot(p, 995), amnt * itemValue(item, p));
            pi.addItem(p, item, amnt);
            removeAmount(p, slot, amnt);
        } else {
            for (int i = amnt; i > 0; i--) {
                int price = itemValue(item, p);
                if (pi.invItemCount(p, 995) < price) {
                    p.frames.sendMessage(p, "Not enough coins to buy that many.");
                    break;
                }
                if (pi.findInvSlot(p) == -1) {
                    p.frames.sendMessage(p, "Not enough space on inventory");
                    break;
                }
                if (p.shopItemsN[slot] < 1) {
                    clearSlots(p);
                    p.frames.sendMessage(p, "The shop has run out of stock from this item!");
                    break;
                }
                if (p.shopItemsN[slot] == 1) {
                    pi.deleteItem(p, 995, pi.getItemSlot(p, 995), price);
                    pi.addItem(p, item, 1);
                    setAmount(p, slot, 0);
                    clearSlots(p);
                    break;
                }

                removeAmount(p, slot, 1);
                pi.deleteItem(p, 995, pi.getItemSlot(p, 995), price);
                pi.addItem(p, item, 1);

            }


        }
        for (Player p2 : Engine.players) {
            if (p2 != null)
                if (p2.interfaceId == p.interfaceId) {
                    getAmount(p2);
                    sendShopItems(p2);
                }
        }
    }


    public int findItemSlot(int item, Player p) {
        try {
            for (int i = 0; i < p.shopItems.length; i++) {
                if (p.shopItems[i] == item) {
                    return i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return -1;
    }


    public int findFreeSlot(Player p) {
        getAmount(p);
        for (int i = 0; i < p.shopItems.length; i++)
            if (p.shopItems[i] == -1) return i;
        return -1;
    }

    public void clearSlots(Player p) {
        if (p == null) {
            return;
        }
        getAmount(p);
        for (int i = 0; i < p.shopItems.length; i++)
            if (p.shopItemsN[i] < 1 && (p.shopid == 17 || p.shopid == 1)) {
                p.shopItemsN[i] = 0;
                p.shopItems[i] = -1;
                setAmount(p, i, 0);
                setItem(p, i, -1);
            }
        getAmount(p);
    }

    public int getPrice(int itemid) {
        int shopVal = Engine.items.itemLists[itemid].shopValue;
        if (shopVal > 1) {
            return Engine.items.itemLists[itemid].shopValue;
        }
        return 1;
    }

    public int getShopValue(int itemId, Player p) {
        if (itemId < 0) {
            return 0;
        }

        return getPrice(itemId);
    }


    public void sendShopItems(Player p) {
    }

    public boolean isItemOnShop(int item, Player p) {
        return findItemSlot(item, p) != -1;
    }

    public void sendPlayerInventory(Player p) {
        p.frames.setItems(p, -1, 64209, 93, p.items, p.itemsN);

    }

    public int itemValue(int item, Player p) {
        return getPrice(item);
    }

    public boolean itemStacks(int item) {
        return Engine.items.itemLists[item].itemStackable;
    }

    public String getSmallValue(double value) {
        if (value < 1000) {
            return "";
        }
        if (value < 1000000) {
            return (value / 1000) + "k";
        }
        if (value < 1000000000) {
            return (value / 1000000) + "m";
        }
        return "";
    }

    public void handleoption(Player p, int interfaceId, int buttonId, int buttonId2, int packetId) {
        switch (interfaceId) {
            case 620:
                if (buttonId == 26) {
                    p.frames.setInterfaceConfig(p, 620, 23, true);
                    p.frames.setInterfaceConfig(p, 620, 24, false);
                    p.frames.setInterfaceConfig(p, 620, 29, true);
                    p.frames.setInterfaceConfig(p, 620, 25, false);
                    p.frames.setInterfaceConfig(p, 620, 27, false);
                    p.frames.setInterfaceConfig(p, 620, 26, true);
                    p.frames.setAccessMask(p, 1278, 24, 620, 0, 40);
                }
                if (buttonId == 24) {
                    int itemid = p.shopItems[buttonId2];
                    switch (packetId) {
                        case 233:
                            /* Value. */
                            int sv = getShopValue(itemid, p);
                            String ssv = getSmallValue(sv);
                            if (!p.party) {
                                p.frames.sendMessage(p, (("This item costs " + sv) + (sv != 1 ? " coins." : " coin.")) + (ssv != "" ? " (" + ssv + ")" : ""));
                            } else {
                                p.frames.sendMessage(p, (("This item is worth " + sv) + (sv != 1 ? " coins." : " coin.")) + (ssv != "" ? " (" + ssv + ")" : ""));
                            }
                            break;
                        case 21:
                            /* Buy 1. */
                            buy(p, itemid, 1);
                            break;
                        case 169:
                            /* Buy 5. */
                            buy(p, itemid, 5);
                            break;
                        case 214:
                            /* Buy 10. */
                            buy(p, itemid, 10);
                            break;
                        case 90:
                            /*Examine. */
                            p.frames.sendMessage(p, Engine.items.getItemDescription(itemid));
                            break;
                    }


                }
                break;
            case 621:
                if (buttonId == 0) {
                    int itemid = p.items[buttonId2];
                    switch (packetId) {
                        case 233:
                            /*Value.*/
                            int sv = getShopValue(itemid, p);
                            String ssv = getSmallValue(sv * .75);
                            p.frames.sendMessage(p, (("This item is worth " + (int) (sv * .75)) + (sv != 1 ? " coins." : " coin.")) + (ssv != "" ? " (" + ssv + ")" : ""));
                            break;
                        case 21:
                            /*
                            * Sell 1.
                            */
                            sell(p, itemid, 1);
                            break;
                        case 169:
                            /*
                            * Sell 5.
                            */
                            sell(p, itemid, 5);
                            break;
                        case 214:
                            /*
                            * Sell 10.
                            */

                            sell(p, itemid, 10);
                            break;
                        case 90:
                            /*
                            * Examine.
                            */
                            p.frames.sendMessage(p, Engine.items.getItemDescription(itemid));
                            break;
                    }
                }
                break;
        }
    }

    public void shopopen(Player p, int shopId) {
        p.frames.removeShownInterface(p);
        p.frames.showInterface(p, 620); //Shop
        p.frames.setInventory(p, 621);
        p.frames.setString(p, "Main Stock", 620, 31); //31 is right hand side
        p.frames.setString(p, "Closed", 620, 32); //32 is left
        p.frames.setString(p, "DavidScape 508", 620, 28);
        p.frames.setString(p, "General Store", 620, 22);
        p.frames.setInterfaceConfig(p, 620, 23, true);
        p.frames.setInterfaceConfig(p, 620, 24, false);
        p.frames.setInterfaceConfig(p, 620, 29, true);
        p.frames.setInterfaceConfig(p, 620, 25, false);
        p.frames.setInterfaceConfig(p, 620, 27, false);
        p.frames.setInterfaceConfig(p, 620, 26, true);
        p.frames.setAccessMask(p, 1278, 24, 620, 0, 40);
        shopid = shopId;
        Object[] setshopparams = new Object[]{shopId, 93};

        int shi = 621 << 16;
        int ship = (620 << 16) + 24;
        Object[] shopparams;
        Object[] invparams;
        if (p.party) {
            shopparams = new Object[]{"", "", "", "", "", "", "", "", "Value", -1, 0, 4, 10, 31, ship};
            invparams = new Object[]{"", "", "", "", "", "", "Give 5", "Give 1", "Value", -1, 0, 7, 4, 93, shi};
        } else {
            shopparams = new Object[]{"", "", "", "", "", "", "Buy 5", "Buy 1", "Value", -1, 0, 4, 10, 31, ship};
            invparams = new Object[]{"", "", "", "", "", "", "Sell 5", "Sell 1", "Value", -1, 0, 7, 4, 93, shi};
        }

        p.frames.runScript(p, 25, setshopparams, "vg");//Loads main stock items
        p.frames.runScript(p, 150, invparams, "IviiiIsssssssss");
        p.frames.runScript(p, 150, shopparams, "IviiiIsssssssss");
        p.frames.setAccessMask(p, 1278, 0, 621, 0, 28);
        p.frames.setInterfaceConfig(p, 620, 23, true);
        p.frames.setInterfaceConfig(p, 620, 24, false);
        p.frames.setInterfaceConfig(p, 620, 29, true);
        p.frames.setInterfaceConfig(p, 620, 25, false);
        p.frames.setInterfaceConfig(p, 620, 27, false);
        p.frames.setInterfaceConfig(p, 620, 26, true);
        p.frames.setAccessMask(p, 1278, 24, 620, 0, 40);

    }

    public void openshop(Player p, int shopid) {
        p.party = false;
        p.shopid = shopid;
        switch (shopid) {
            case 1:
                shopopen(p, 868);
                p.shopItems = Engine.general;
                break;
            case 2:
                shopopen(p, 868);
                p.shopItems = shop2;
                break;
            case 3:
                shopopen(p, 868);
                p.shopItems = shop3;
                break;
            case 4:
                shopopen(p, 868);
                p.shopItems = shop4;
                break;
            case 5:
                shopopen(p, 868);
                p.shopItems = shop5;
                break;
            case 6:
                shopopen(p, 868);
                p.shopItems = shop6;
                break;
            case 7:
                shopopen(p, 868);
                p.shopItems = shop7;
                break;
            case 8:
                shopopen(p, 868);
                p.shopItems = shop8;
                break;
            case 9:
                shopopen(p, 868);
                p.shopItems = shop9;
                break;
            case 10:
                shopopen(p, 868);
                p.shopItems = shop10;
                break;
            case 11:
                shopopen(p, 868);
                p.shopItems = shop11;
                break;
            case 12:
                shopopen(p, 868);
                p.shopItems = shop12;
                break;
            case 13:
                shopopen(p, 868);
                p.shopItems = shop13;
                break;
            case 14:
                shopopen(p, 868);
                p.shopItems = shop14;
                break;

            case 16:
                shopopen(p, 868);
                p.shopItems = shop16;
                break;

            case 18:
                shopopen(p, 868);
                p.shopItems = shop18;
                break;
            case 17:
                p.party = true;
                shopopen(p, 868);
                p.shopItems = Engine.partyItems;
                break;

        }
        getAmount(p);
        p.frames.setItems(p, -1, 64209, 93, p.items, p.itemsN);
        p.frames.setItems(p, -1, 64271, 31, p.shopItems, p.shopItemsN);

    }

    public void getAmount(Player p) {
        if (p == null)
            return;
        switch (p.shopid) {
            case 1:
                p.shopItemsN = Engine.generalN;
                p.shopItems = Engine.general;
                break;
            case 2:
                p.shopItemsN = Engine.shop2N;
                break;
            case 3:
                p.shopItemsN = Engine.shop3N;
                break;
            case 4:
                p.shopItemsN = Engine.shop4N;
                break;
            case 5:
                p.shopItemsN = Engine.shop5N;
                break;
            case 6:
                p.shopItemsN = Engine.shop6N;
                break;
            case 7:
                p.shopItemsN = Engine.shop7N;
                break;
            case 8:
                p.shopItemsN = Engine.shop8N;
                break;
            case 9:
                p.shopItemsN = Engine.shop9N;
                break;
            case 10:
                p.shopItemsN = Engine.shop10N;
                break;
            case 11:
                p.shopItemsN = Engine.shop11N;
                break;
            case 12:
                p.shopItemsN = Engine.shop12N;
                break;
            case 13:
                p.shopItemsN = Engine.shop13N;
                break;
            case 14:
                p.shopItemsN = Engine.shop14N;
                break;

            case 16:
                p.shopItemsN = Engine.shop16N;
                break;
            case 18:
                p.shopItemsN = Engine.shop18N;
                break;
            case 17:
                p.shopItemsN = Engine.partyItemsN;
                p.shopItems = Engine.partyItems;
                break;


        }
        p.frames.setItems(p, -1, 64271, 31, p.shopItems, p.shopItemsN);

    }

    public void addAmount(Player p, int slot, int amt) {
        switch (p.shopid) {
            case 1:
                Engine.generalN[slot] += amt;
                break;
            case 2:
                Engine.shop2N[slot] += amt;
                break;
            case 3:
                Engine.shop3N[slot] += amt;
                break;
            case 4:
                Engine.shop4N[slot] += amt;
                break;
            case 5:
                Engine.shop5N[slot] += amt;
                break;
            case 6:
                Engine.shop6N[slot] += amt;
                break;
            case 7:
                Engine.shop7N[slot] += amt;
                break;
            case 8:
                Engine.shop8N[slot] += amt;
                break;
            case 9:
                Engine.shop9N[slot] += amt;
                break;
            case 10:
                Engine.shop10N[slot] += amt;
                break;
            case 11:
                Engine.shop11N[slot] += amt;
                break;
            case 12:
                Engine.shop12N[slot] += amt;
                break;
            case 13:
                Engine.shop13N[slot] += amt;
                break;
            case 14:
                Engine.shop14N[slot] += amt;
                break;

            case 16:
                Engine.shop16N[slot] += amt;
                break;
            case 18:
                Engine.shop18N[slot] += amt;
                break;
            case 17:
                Engine.partyItemsN[slot] += amt;
                break;


        }
        getAmount(p);
        p.frames.setItems(p, -1, 64271, 31, p.shopItems, p.shopItemsN);

    }

    public void setAmount(Player p, int slot, int amt) {
        switch (p.shopid) {
            case 1:
                Engine.generalN[slot] = amt;
                break;
            case 2:
                Engine.shop2N[slot] = amt;
                break;
            case 3:
                Engine.shop3N[slot] = amt;
                break;
            case 4:
                Engine.shop4N[slot] = amt;
                break;
            case 5:
                Engine.shop5N[slot] = amt;
                break;
            case 6:
                Engine.shop6N[slot] = amt;
                break;
            case 7:
                Engine.shop7N[slot] = amt;
                break;
            case 8:
                Engine.shop8N[slot] = amt;
                break;
            case 9:
                Engine.shop9N[slot] = amt;
                break;
            case 10:
                Engine.shop10N[slot] = amt;
                break;
            case 11:
                Engine.shop11N[slot] = amt;
                break;
            case 12:
                Engine.shop12N[slot] = amt;
                break;
            case 13:
                Engine.shop13N[slot] = amt;
                break;
            case 14:
                Engine.shop14N[slot] = amt;
                break;

            case 16:
                Engine.shop16N[slot] = amt;
                break;
            case 18:
                Engine.shop18N[slot] = amt;
                break;
            case 17:
                Engine.partyItems[slot] = amt;
                break;


        }
        getAmount(p);
        p.frames.setItems(p, -1, 64271, 31, p.shopItems, p.shopItemsN);

    }

    public void setItem(Player p, int slot, int amt) {
        switch (p.shopid) {
            case 1:
                Engine.general[slot] = amt;
                break;
            case 2:
                Engine.shop2[slot] = amt;
                break;
            case 3:
                Engine.shop3[slot] = amt;
                break;
            case 4:
                Engine.shop4[slot] = amt;
                break;
            case 5:
                Engine.shop5[slot] = amt;
                break;
            case 6:
                Engine.shop6[slot] = amt;
                break;
            case 7:
                Engine.shop7[slot] = amt;
                break;
            case 8:
                Engine.shop8[slot] = amt;
                break;
            case 9:
                Engine.shop9[slot] = amt;
                break;
            case 10:
                Engine.shop10[slot] = amt;
                break;
            case 11:
                Engine.shop11[slot] = amt;
                break;
            case 12:
                Engine.shop12[slot] = amt;
                break;
            case 13:
                Engine.shop13[slot] = amt;
                break;
            case 14:
                Engine.shop14[slot] = amt;
                break;

            case 16:
                Engine.shop16[slot] = amt;
                break;
            case 18:
                Engine.shop18[slot] = amt;
                break;
            case 17:
                Engine.partyItems[slot] = amt;
                break;


        }
        getAmount(p);
        p.frames.setItems(p, -1, 64271, 31, p.shopItems, p.shopItemsN);

    }

    public void removeAmount(Player p, int slot, int amt) {
        switch (p.shopid) {
            case 1:
                Engine.generalN[slot] -= amt;
                break;
            case 2:
                Engine.shop2N[slot] -= amt;
                break;
            case 3:
                Engine.shop3N[slot] -= amt;
                break;
            case 4:
                Engine.shop4N[slot] -= amt;
                break;
            case 5:
                Engine.shop5N[slot] -= amt;
                break;
            case 6:
                Engine.shop6N[slot] -= amt;
                break;
            case 7:
                Engine.shop7N[slot] -= amt;
                break;
            case 8:
                Engine.shop8N[slot] -= amt;
                break;
            case 9:
                Engine.shop9N[slot] -= amt;
                break;
            case 10:
                Engine.shop10N[slot] -= amt;
                break;
            case 11:
                Engine.shop11N[slot] -= amt;
                break;
            case 12:
                Engine.shop12N[slot] -= amt;
                break;
            case 13:
                Engine.shop13N[slot] -= amt;
                break;
            case 14:
                Engine.shop14N[slot] -= amt;
                break;

            case 16:
                Engine.shop16N[slot] -= amt;
                break;
            case 18:
                Engine.shop18N[slot] -= amt;
                break;
            case 17:
                Engine.partyItemsN[slot] -= amt;
                break;


        }
        getAmount(p);
        p.frames.setItems(p, -1, 64271, 31, p.shopItems, p.shopItemsN);

    }
}