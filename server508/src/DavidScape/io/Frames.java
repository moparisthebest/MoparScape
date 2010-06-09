package DavidScape.io;

import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;
import DavidScape.players.items.PlayerWeapon;
import DavidScape.util.Misc;


public class Frames {
    public void createObject(Player p, int objectId, int objectX, int objectY, int face, int type) {
        sendCoords(p, (objectX - ((p.mapRegionX - 6) * 8)), (objectY - ((p.mapRegionY - 6) * 8)));
        int ot = ((type << 2) + (face & 3));
        p.stream.createFrame(30);
        p.stream.writeWordBigEndian(objectId);
        p.stream.writeByteA(0);
        p.stream.writeByteC(ot);
    }

    public void playSound(Player p, int soundId, int j, int delay) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(119);
        p.stream.writeWord(soundId);
        p.stream.writeByte(j);
        p.stream.writeWord(delay);
    }

    public void setLoot(Player p) {
        setConfig(p, 1083, 1);
        sendMessage(p, "LootShare is now on.");
    }

    public void sendClanChat(Player p, Player p2, String from, String clanName, String message) {
        int id = messageCounter;
        if (id > 16000000) {
            id = 1;
            messageCounter = 1;
        }
        p.stream.createFrameVarSize(229);
        p.stream.writeQWord(Misc.stringToLong(from)); // Player Username
        p.stream.writeByte(1);
        p.stream.writeQWord(Misc.stringToLong(clanName)); //Room name
        p.stream.writeRShort(1);
        byte[] bytes = new byte[message.length() + 1];
        bytes[0] = (byte) message.length();
        Misc.encryptPlayerChat(bytes, 0, 1, message.length(), message.getBytes());
        p.stream.writeBytes(
                new byte[]{
                        (byte) ((id << 16) & 0xFF),
                        (byte) ((id << 8) & 0xFF),
                        (byte) (id & 0xFF)}, 3, 0);
        messageCounter++;
        if (p2 != null) {
            p.stream.writeByte(p2.rights);
        } else {
            p.stream.writeByte(0);
        }
        p.stream.writeBytes(bytes, bytes.length, 0);
        p.stream.endFrameVarSize();
    }

    public void test(Player p) {
        p.stream.createFrame(313);
        p.stream.writeByteC(1);
        p.stream.writeByteC(2);
        p.stream.writeByteC(3);
        p.stream.writeString("HELLO");
    }

    public void restoreTabs(Player p) {
        showTabs(p);
    }

    public void resetList(Player p) {
        p.stream.createFrameVarSizeWord(82);
        p.stream.writeQWord(0);
        p.stream.endFrameVarSizeWord();
    }

    public static int random(int range) { //0 till range (range INCLUDED)
        return (int) (java.lang.Math.random() * (range + 1));
    }

    /**
     * Connects to the friend and ignore servers
     *
     * @param p The player which the frame should be created for.
     */


    public void packet190(Player p, int id) {
        p.stream.createFrame(190);
        p.stream.writeWord(id);
    }

    public void itemOnInterface(Player p, int interfaceid, int child, int itemsize, int itemid) {
        int inter = ((interfaceid * 65536) + child);
        p.stream.createFrame(35);
        p.stream.writeDWord_v2(inter);
        p.stream.writeDWordBigEndian(itemsize);
        p.stream.writeWordBigEndianA(itemid);
    }

    public void connecttofserver(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(115);
        p.stream.writeByte(2);
    }

    public void setAccessMask(Player p, int set, int window, int inter, int off, int len) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(223);
        p.stream.writeWord(len);
        p.stream.writeWordBigEndianA(off);
        p.stream.writeWordBigEndian(window);
        p.stream.writeWordBigEndian(inter);
        p.stream.writeWordBigEndian(set);
        p.stream.writeWordBigEndian(0);
    }

    public void restoreInventory(Player p) {
        if (p.usingHD)
            setInterface(p, 1, 746, 71, 56);
        else
            setInterface(p, 1, 548, 71, 56);
        showTabs(p);
    }

    public void restoreInventory2(Player p) {
        if (p.usingHD)
            setInterface(p, 1, 746, 71, 56);
        else
            setInterface(p, 1, 548, 71, 56);
        showTabs(p);
    }

    public void createObject(Player p, int objectId, int height, int objectX, int objectY, int face, int type) {
        sendCoords(p, (objectX - ((p.mapRegionX - 6) * 8)), (objectY - ((p.mapRegionY - 6) * 8)));
        int ot = ((type << 2) + (face & 3));
        p.stream.createFrame(30);
        p.stream.writeWordBigEndian(objectId);
        p.stream.writeByteA(0);
        p.stream.writeByteC(ot);

    }

    public void sendSentPrivateMessage(Player p, long name, String message) {
        byte[] bytes = new byte[message.length()];
        Misc.encryptPlayerChat(bytes, 0, 0, message.length(), message.getBytes());
        p.stream.createFrameVarSize(89);
        p.stream.writeQWord(name);
        p.stream.writeByte(message.length());
        p.stream.writeBytes(bytes, bytes.length, 0);
        p.stream.endFrameVarSize();
    }

    private static int messageCounter = 1;

    public void sendReceivedPrivateMessage(Player p, long name, int rights, String message) {
        int id = messageCounter++;
        if (id > 16000000) {
            id = 1;
        }
        byte[] bytes = new byte[message.length() + 1];
        bytes[0] = (byte) message.length();
        Misc.encryptPlayerChat(bytes, 0, 1, message.length(), message.getBytes());
        p.stream.createFrameVarSize(178);
        p.stream.writeQWord(name);
        p.stream.writeWord(1);
        p.stream.writeByte(((id << 16) & 0xFF));
        p.stream.writeByte(((id << 8) & 0xFF));
        p.stream.writeByte(((id) & 0xFF));
        p.stream.writeByte(rights);
        p.stream.writeBytes(bytes, bytes.length, 0);
        p.stream.endFrameVarSize();
    }

    public void sendFriend(Player p, long name, int world) {
        p.stream.createFrameVarSize(154);
        p.stream.writeQWord(name);
        p.stream.writeWord(world);
        p.stream.writeByte(1);
        if (world != 0) {
            if (world == 66) {
                if (Misc.longToString(name).equalsIgnoreCase("david")) {
                    p.stream.writeString("OWNER");
                } else {
                    p.stream.writeString("Online");
                }
            } else {
                p.stream.writeString("DavidScape " + world);
            }
        }
        p.stream.endFrameVarSize();
    }

    public void createLocalObject(Player p, int objectId, int objectX, int objectY, int face, int type) {
        sendCoords(p, objectX, objectY);
        int ot = ((type << 2) + (face & 3));
        p.stream.createFrame(30);
        p.stream.writeWordBigEndian(objectId);
        p.stream.writeByteA(0);
        p.stream.writeByteC(ot);
    }

    public void deleteLocalObject(Player p, int objectX, int objectY, int type) {
        p.frames.createLocalObject(p, 6951, objectX, objectY, 1, type);
    }

    public void teleportOnMapdata(Player p, int height, int x, int y) {
        p.stream.createFrame(57);
        p.stream.writeByteS(height); //Height
        p.stream.writeByteA(y);
        p.stream.writeByteA(x);
        p.absX = p.absX + (x - p.currentX);
        p.absY = p.absY + (y - p.currentY);
        p.currentX = x;
        p.currentY = y;
    }

    public void sendMapRegion2(Player p, int[][][] xPallete, int[][][] yPallete, int[][][] zPallete) {
        p.stream.createFrameVarSizeWord(173);
        p.stream.writeByteA(p.heightLevel);
        p.stream.writeWord(p.mapRegionY); //mapRegionY
        p.stream.writeWordA(p.currentX);
        p.stream.initBitAccess();
        for (int height = 0; height < 4; height++) {
            for (int xCalc = 0; xCalc < 13; xCalc++) {
                for (int yCalc = 0; yCalc < 13; yCalc++) {
                    if (zPallete[height][xCalc][yCalc] != -1 && xPallete[height][xCalc][yCalc] != -1 && yPallete[height][xCalc][yCalc] != -1) {
                        int x = xPallete[height][xCalc][yCalc];
                        int y = yPallete[height][xCalc][yCalc];
                        int z = zPallete[height][xCalc][yCalc];
                        p.stream.writeBits(1, 1);
                        // << 24 | << 1 | norm
                        p.stream.writeBits(26, 0 << 1 | 0 | (z << 24) | (x << 14) | (y << 3));
                    } else {
                        p.stream.writeBits(1, 0);
                    }
                }
            }
        }
        p.stream.finishBitAccess();
        int[] sent = new int[4 * 13 * 13];
        int sentIndex = 0;
        for (int height = 0; height < 4; height++) {
            for (int xCalc = 0; xCalc < 13; xCalc++) {
                outer:
                for (int yCalc = 0; yCalc < 13; yCalc++) {
                    if (zPallete[height][xCalc][yCalc] != -1 && xPallete[height][xCalc][yCalc] != -1 && yPallete[height][xCalc][yCalc] != -1) {
                        int x = xPallete[height][xCalc][yCalc] / 8;
                        int y = yPallete[height][xCalc][yCalc] / 8;
                        int region = y + (x << 8);
                        for (int i = 0; i < sentIndex; i++) {
                            if (sent[i] == region) {
                                break outer;
                            }
                        }
                        sent[sentIndex] = region;
                        sentIndex++;
                        int[] mapData = Engine.mapData.getMapData(region);
                        if (mapData == null) {
                            mapData = new int[4];
                        }
                        p.stream.writeDWordBigEndian(mapData[0]);
                        p.stream.writeDWordBigEndian(mapData[1]);
                        p.stream.writeDWordBigEndian(mapData[2]);
                        p.stream.writeDWordBigEndian(mapData[3]);
                    }
                }
            }
        }
        p.stream.writeWordA(p.currentY);
        p.stream.writeWordA(p.mapRegionX);
        p.stream.endFrameVarSizeWord();
    }

    public void sendIgnores(Player p, long[] ignores) {
        p.stream.createFrameVarSizeWord(240);
        for (long ignore : ignores) {
            p.stream.writeQWord(ignore);
        }
        p.stream.endFrameVarSizeWord();
    }

    public void createGlobalObject(int objectId, int height, int objectX, int objectY, int face, int type) {
        for (Player p : Engine.players) {
            if (p == null) {
                continue;
            }
            createObject(p, objectId, height, objectX, objectY, face, type);
        }
    }

    public void sendPlayerCoords(Player p, int x, int y) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(218);
        p.stream.writeByteA(x);
        p.stream.writeByte(y);
    }

    public int getDistance(int coordX1, int coordY1, int coordX2, int coordY2) {
        int deltaX = coordX2 - coordX1;
        int deltaY = coordY2 - coordY1;
        return ((int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }


    /**
     * Set either fullscreen or normal.
     *
     * @param p   The Player which the frame should be created for.
     * @param set The frame set, 548 for the default setup.
     */
    public void setWindowPane(Player p, int set) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(239);
        p.stream.writeWord(set);
        p.stream.writeByteA(0);
    }

    /**
     * Logs a player out.
     *
     * @param p The Player which the frame should be created for.
     */
    public void logout(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(104);
        p.disconnected[0] = true;
        p.disconnected[1] = true;

    }

    /**
     * Display an interface.
     * <p>The various ids determines how the interface is displayed, from an overlay, to covering the chatbox, etc.
     *
     * @param p           The Player which the frame should be created for.
     * @param showId      Sets the interface such as an overlay, etc.
     * @param windowId    What type of window you used, default should be 548.
     * @param interfaceId Where to display it on the screen.
     * @param childId     The interface id to display.
     */
    public void setInterface(Player p, int showId, int windowId, int interfaceId, int childId) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(93);
        p.stream.writeWord(childId);
        p.stream.writeByteA(showId);
        p.stream.writeWord(windowId);
        p.stream.writeWord(interfaceId);
    }

    /**
     * Set a players click option.
     * <p>The slot cannot be below 0 and cannot be above 8.
     *
     * @param p      The Player which the frame should be created for.
     * @param option The string to set the option to.
     * @param slot   The position to set the option on the player.
     */
    public void setPlayerOption(Player p, String option, int slot) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrameVarSize(252);
        p.stream.writeByteC(1);
        p.stream.writeString(option);
        p.stream.writeByteC(slot);
        p.stream.endFrameVarSize();
    }

    public void setNPCId(Player p, int npcId, int interfaceId, int childId) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(6);
        p.stream.writeWordBigEndian(interfaceId);
        p.stream.writeWordBigEndian(childId);
        p.stream.writeWordBigEndian(npcId);
    }


    public void animateInterfaceId(Player p, int emoteId, int interfaceId, int childId) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(245);
        p.stream.writeWordBigEndian(interfaceId);
        p.stream.writeWordBigEndian(childId);
        p.stream.writeWord(emoteId);
    }

    /**
     * Setting client configs.
     * <p>This is used for setting prayers, running, etc.
     *
     * @param p   The Player which the frame should be created for.
     * @param id  The config id to set.
     * @param set What to set the config.
     */
    public void setConfig(Player p, int id, int set) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        if (set < 128) {
            setConfig1(p, id, set);
        } else {
            setConfig2(p, id, set);
        }
    }

    public void setConfig1(Player p, int id, int set) {
        p.stream.createFrame(100);
        p.stream.writeWordA(id);
        p.stream.writeByteA(set);
    }

    public void setConfig2(Player p, int id, int set) {
        p.stream.createFrame(161);
        p.stream.writeWord(id);
        p.stream.writeDWord_v1(set);
    }

    /**
     * Creates a projectile. Can be used for magic, range etc.
     *
     * @param p           The Player which the frame should be created for.
     * @param CasterY     The caster absY
     * @param CasterX     The caster absX
     * @param offsetY     The distance between caster and enemy Y
     * @param offsetX     The distance between caster and enemy X
     * @param angle       The starting place of the projectile
     * @param speed       The speed minus the distance making it set.
     * @param gfxMoving   The moving graphic ID
     * @param startHeight The starting height
     * @param endHeight   The destination height
     * @param lockon      The NPC the missile is locked onto.
     */
    public void createProjectile(Player p, int casterY, int casterX, int offsetY, int offsetX, int angle,
                                 int speed, int gfxMoving, int startHeight, int endHeight, int lockon) {
        if (p == null || p.stream == null) {
            return;
        }
        sendCoords(p, (casterX - ((p.mapRegionX - 6) * 8)) - 3,
                (casterY - ((p.mapRegionY - 6) * 8)) - 2);
        p.stream.createFrame(112);
        p.stream.writeByte(angle);
        p.stream.writeByte(offsetX);
        p.stream.writeByte(offsetY);
        p.stream.writeRShort(lockon);
        p.stream.writeWord(gfxMoving);
        p.stream.writeByte(startHeight);
        p.stream.writeByte(endHeight);
        p.stream.writeWord(51);
        p.stream.writeWord(speed);
        p.stream.writeByte(16);
        p.stream.writeByte(64);
    }

    /**
     * Creates a Global Projectiles.
     *
     * @param Objectid The Id of the Object to spawn.
     * @param Heigh    The Height to spawn the Object on.
     * @param ObjectX  The AbsX to spawn the Object on.
     * @param ObjectY  The AbsY to spawn the Object on.
     * @param Face     The Position for the OBject to face
     * @param Type     Object Type
     */
    public void createGlobalProjectile(int casterY, int casterX, int offsetY, int offsetX, int gfxMoving, int startHeight, int endHeight, int speed, int atkIndex) {
        for (Player p : Engine.players) {
            if (p == null || p.disconnected[0]) {
                continue;
            }
            // createProjectile(p, casterY, casterX, offsetY, offsetX, angle, speed, gfxMoving, startHeight, endHeight, lockon)
            createProjectile(p, casterY, casterX, offsetY, offsetX, 50,
                    speed, gfxMoving, startHeight, endHeight, atkIndex);
        }
    }

    public void runScript(Player p, int id, Object[] o, String valstring) {
        if (valstring.length() != o.length) {
            throw new IllegalArgumentException("Argument array size mismatch");
        }
        p.stream.createFrameVarSizeWord(152);
        p.stream.writeString(valstring);
        int j = 0;
        for (int i = (valstring.length() - 1); i >= 0; i--) {
            if (valstring.charAt(i) == 115) {
                p.stream.writeString((String) o[j]);

            } else {

                p.stream.writeDWord((Integer) o[j]);
            }
            j++;
        }
        p.stream.writeDWord(id);

        p.stream.endFrameVarSize();

    }

    public void setBankOptions(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(223);
        p.stream.writeWord(496);
        p.stream.writeWordBigEndianA(0);
        p.stream.writeWordBigEndian(73);
        p.stream.writeWordBigEndian(762);
        p.stream.writeWordBigEndian(1278);
        p.stream.writeWordBigEndian(20);
        p.stream.createFrame(223);
        p.stream.writeWord(27);
        p.stream.writeWordBigEndianA(0);
        p.stream.writeWordBigEndian(0);
        p.stream.writeWordBigEndian(763);
        p.stream.writeWordBigEndian(1150);
        p.stream.writeWordBigEndian(18);
    }

    /**
     * Set the run energy on the client.
     *
     * @param p The Player which the frame should be created for.
     */
    public void setEnergy(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(99);
        p.stream.writeByte(p.runEnergy);
    }

    /**
     * Setting a tab.
     *
     * @param p       The Player which the frame should be created for.
     * @param tabId   Which tab to display the interface on.
     * @param childId The interface to display on the tab.
     */
    public void setTab(Player p, int tabId, int childId) {
        if (!p.usingHD) {
            setInterface(p, 1, childId == 137 ? 752 : 548, tabId, childId);
        } else {
            setInterface(p, 1, 746, tabId, childId);
        }
    }

    /**
     * Set the overlay to be displayed.
     *
     * @param p       The Player which the frame should be created for.
     * @param childId The interface id to display as an overlay.
     */
    public void setOverlay(Player p, int childId) {
        if (!p.usingHD)
            setInterface(p, 1, 548, 5, childId);
        else
            setInterface(p, 1, 746, 5, childId);
    }

    /**
     * Remove Player Equipment
     *
     * @param p     The player which the frame should be created for.
     * @param index the index of the player
     */
    public void removeEquipment(Player p, int itemId, int index) {
        if (p == null || itemId <= 0 || index < 0 || index > 12 || p.stream == null) {
            return;
        }

        PlayerItems pi = new PlayerItems();

        if (!pi.addItem(p, p.equipment[index], p.equipmentN[index])) {
            sendMessage(p, "Not enough space in your inventory.");
            return;
        }

        p.equipment[index] = -1;
        p.equipmentN[index] = -1;
        p.stream.createFrameVarSizeWord(135);
        p.stream.writeByte(1);
        p.stream.writeByte(131);
        p.stream.writeByte(0);
        p.stream.writeByte(28);
        p.stream.writeWord(28);
        p.stream.writeByte(index);
        p.stream.writeWord(0);
        p.stream.writeByte(0);
        p.stream.endFrameVarSizeWord();
        p.appearanceUpdateReq = true;
        p.updateReq = true;
        p.calculateEquipmentBonus();
        pi = null;
        PlayerWeapon pweapon = new PlayerWeapon(p);
        pweapon.setWeapon();
        pweapon = null;
    }

    /**
     * Remove any overlays that might be set.
     *
     * @param p The Player which the frame should be created for.
     */
    public void removeOverlay(Player p) {
        if (!p.usingHD) {
            setInterface(p, 1, 548, 5, 56);
        } else {
            setInterface(p, 1, 746, 5, 56);
        }
    }

    /**
     * Display an interface on the main area in the screen.
     *
     * @param p       The Player which the frame should be created for.
     * @param childId the interface id to display.
     */
    public void showInterface(Player p, int childId) {

        if (!p.usingHD) {
            setInterface(p, 0, 548, 8, childId);
            p.interfaceId = childId;
        } else {
            setInterface(p, 0, 746, 3, childId);
            p.interfaceId = childId;
        }
    }

    /**
     * Remove an interface on the main screen.
     *
     * @param p The Player which the frame should be created for.
     */
    public void removeShownInterface(Player p) {
        p.uinput.resetInput();
        if (!p.usingHD)
            setInterface(p, 1, 548, 8, 56);
        else
            setInterface(p, 1, 746, 3, 56);
        p.interfaceId = -1;

    }

    /**
     * Display an interface on the chatbox.
     *
     * @param p       The Player which the frame should be created for.
     * @param childId The interface to display on the chatbox.
     */
    public void showChatboxInterface(Player p, int childId) {
        setInterface(p, 0, 752, 12, childId);
        p.chatboxInterfaceId = childId;
    }

    /**
     * Set the chatbox back removing any interfaces on it.
     *
     * @param p The Player which the frame should be created for.
     */
    public void removeChatboxInterface(Player p) {
        setConfig(p, 334, 1);
        p.stream.createFrame(246);
        p.stream.writeWord(752);
        p.stream.writeWord(12);
        p.chatboxInterfaceId = -1;
    }

    /**
     * Set the inventory.
     *
     * @param p       The Player which the frame should be created for.
     * @param childId The interface to display on the inventory.
     */
    public void setInventory(Player p, int childId) {
        if (!p.usingHD)
            setInterface(p, 0, 548, 71, childId);
        else {
            setInterface(p, 0, 746, 71, childId);
        }
    }

    public void showTabs(Player p) {
        int maininterface = 548;
        if (p.usingHD) {
            maininterface = 746; /*Need to get correct configs for it, but it works*/
        }
        for (int b = 16; b <= 21; b++) {
            setInterfaceConfig(p, maininterface, b, false);
        }
        for (int a = 32; a <= 38; a++) {
            setInterfaceConfig(p, maininterface, a, false);
        }
        setInterfaceConfig(p, maininterface, 14, false);
        setInterfaceConfig(p, maininterface, 31, false);
        setInterfaceConfig(p, maininterface, 63, false);
        setInterfaceConfig(p, maininterface, 72, false);
    }

    /**
     * Set interface defaults at login.
     *
     * @param p The Player which the frame should be created for.
     */
    public void setInterfaces(Player p) {
        if (p == null || p.disconnected[0]) {
            return;
        }
        for (int i = 0; i < 137; i++) {
            setString(p, "!~_-_~_-_~!", 274, 13 + i);
        }
        setString(p, "DavidScape 508", 274, 5);
        setString(p, "Quest and Teles:", 274, 6);
        setString(p, "Dragon Slayer Quest", 274, 7);
        setString(p, "PVP", 274, 8);
        setString(p, "GWD", 274, 9);
        setString(p, "Home", 274, 10);
        setString(p, "Help Desk", 274, 11);
        setString(p, "Staff Zone", 274, 12);
        setString(p, "Barbarian Assault", 274, 13);
        setString(p, "Barrows", 274, 14);
        setString(p, "Membership/Donate", 274, 16);
        setString(p, "Member Area", 274, 17);
        setString(p, "Newest Client", 274, 18);
        if (!p.usingHD) {
            setTab(p, 6, 745);
            setTab(p, 11, 751); // Chat options
            setTab(p, 68, 752); // Chatbox
            setTab(p, 64, 748); // HP bar
            setTab(p, 65, 749); // Prayer bar
            setTab(p, 66, 750); // Energy bar
            setTab(p, 67, 747); // Summoning bar
            setTab(p, 8, 137); // Playername on chat
            setTab(p, 73, 92); // Attack tab
            setTab(p, 74, 320); // Skill tab
            setTab(p, 75, 274); // Quest tab
            setTab(p, 76, 149); // Inventory tab
            setTab(p, 77, 387); // Equipment tab
            setTab(p, 78, 271); // Prayer tab
            setTab(p, 79, 192); // Magic tab
            if (p.equipment[3] != 4675) {
                setInterface(p, 1, 548, 79, 192); //Magic tab
            } else if (p.equipment[3] == 4675) {
                setInterface(p, 1, 548, 79, 193); //Magic tab
                p.isAncients = 1;
            }
            setTab(p, 81, 550); // Friend tab
            setTab(p, 82, 551); // Ignore tab
            setTab(p, 83, 589); // Clan tab
            setTab(p, 84, 261); // Setting tab
            setTab(p, 85, 464); // Emote tab
            setTab(p, 86, 187); // Music tab
            setTab(p, 87, 182); // Logout tab
        } else if (p.usingHD) {
            setInterface(p, 1, 549, 0, 746); //Main interface
            setInterface(p, 1, 752, 8, 137); //Playername on chat
            setInterface(p, 1, 746, 87, 92); //Attack tab
            setInterface(p, 1, 746, 88, 320); //Skill tab
            setInterface(p, 1, 746, 89, 274); //Quest tab
            setInterface(p, 1, 746, 90, 149); //Inventory tab
            setInterface(p, 1, 746, 91, 387); //Equipment tab
            setInterface(p, 1, 746, 92, 271); //Prayer tab
            if (p.equipment[3] != 4675) {
                setInterface(p, 1, 746, 93, 192); //Magic tab
            } else if (p.equipment[3] == 4675) {
                setInterface(p, 1, 746, 93, 193); //Magic tab
                p.isAncients = 1;
            }
            setInterface(p, 1, 746, 95, 550); //Friend tab
            setInterface(p, 1, 746, 96, 551); //Ignore tab
            setInterface(p, 1, 746, 97, 589); //Clan tab
            setInterface(p, 1, 746, 98, 261); //Settings tab
            setInterface(p, 1, 746, 99, 464); //Emote tab
            setInterface(p, 1, 746, 65, 752); //Chatbox
            setInterface(p, 1, 746, 18, 751); //Chat options
            setInterface(p, 1, 746, 13, 748); //HP orb
            setInterface(p, 1, 746, 14, 749); //Prayer orb
            setInterface(p, 1, 746, 15, 750); //Energy orb
            setInterface(p, 1, 746, 12, 747); //Summoning orb
            setInterface(p, 1, 746, 100, 187); // Music tab
            setInterface(p, 1, 746, 101, 182); // Logout tab
        }
    }


    /**
     * Set interface defaults at login.
     *
     * @param p The Player which the frame should be created for.
     */
    public void setConfigs(Player p) {
        if (p == null || p.disconnected[0]) {
            return;
        }
        // setConfig(p, 1021, 1); tab flashing
        setConfig(p, 1160, -1);
        setConfig(p, 173, 0);
        setConfig(p, 313, -1);
        setConfig(p, 465, -1);
        setConfig(p, 802, -1);
        setConfig(p, 1085, 249852);
    }

    /**
     * Set welcome interface.
     *
     * @param p The Player which the frame should be created for.
     */
    public void setWelcome(Player p) {
        if (p == null || p.disconnected[0]) {
            return;
        }
        setWindowPane(p, 549);
        setInterface(p, 1, 549, 2, 378);
        setInterface(p, 1, 549, 3, 17); // can use 15 - string 0 and 4, 17 - string 0 and 3, and 447 - string 0, 1 and 2.
        setString(p, "Messages of the Week!", 447, 0);
        setString(p, "by: Davidi2", 447, 1);
        setString(p, "Official Server for the MoparScape Client!", 447, 2);

        setString(p, "No unread messages", 378, 37);
        setString(p, "0" + "", 378, 39);
        setString(p, "", 378, 94);
        setString(p,
                "You have 0 days of member credit remaining. Please click here to extend your credit",
                378,
                93);
        setString(p, "999" + "", 378, 96);
        setString(p, "Welcome to DavidScape", 378, 115);
        setString(p, "", 378, 116);
    }

    /**
     * Send coordinates, used with other frames.
     *
     * @param p The Player which the frame should be created for.
     * @param x The x coordinate.
     * @param y The y coordinate.
     */
    public void sendCoords(Player p, int x, int y) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(177);
        p.stream.writeByte(y);
        p.stream.writeByteS(x);
    }

    /**
     * Creates an item on the ground at itemX and itemY.
     *
     * @param p          The Player which the frame should be created for.
     * @param itemId     The item id to be displayed.
     * @param itemAmt    The amount the item stack size is.
     * @param itemX      The absolute x coordinate to display the item.
     * @param itemY      The absolute y coordinate to display the item.
     * @param itemHeight The height level to set the item.
     */
    public void createGroundItem(Player p, int itemId, int itemAmt, int itemX, int itemY, int itemHeight) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        if (Misc.getDistance(itemX, itemY, p.absX, p.absY) <= 60
                && p.heightLevel == itemHeight) {
            sendCoords(p, (itemX - ((p.mapRegionX - 6) * 8)),
                    (itemY - ((p.mapRegionY - 6) * 8)));
            p.stream.createFrame(25);
            p.stream.writeWordBigEndianA(itemAmt);
            p.stream.writeByte(0);
            p.stream.writeWordBigEndianA(itemId);
        }
    }

    /**
     * Removes an item on the ground at itemX and itemY.
     *
     * @param p          The Player which the frame should be created for.
     * @param itemId     The item id to remove.
     * @param itemX      The absolute x coordinate to remove the item.
     * @param itemY      The absolute y coordinate to remove the item.
     * @param itemHeight The height level toe remove the item at.
     */
    public void removeGroundItem(Player p, int itemId, int itemX, int itemY, int itemHeight) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        if (Misc.getDistance(itemX, itemY, p.absX, p.absY) <= 60
                && p.heightLevel == itemHeight) {
            sendCoords(p, (itemX - ((p.mapRegionX - 6) * 8)),
                    (itemY - ((p.mapRegionY - 6) * 8)));
            p.stream.createFrame(201);
            p.stream.writeByte(0);
            p.stream.writeWord(itemId);
        }
    }

    /**
     * Send players stat.
     *
     * @param p     The Player which the frame should be created for.
     * @param lvlId The stat id to send.
     */
    public void setSkillLvl(Player p, int lvlId) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(217);
        p.stream.writeByteC(p.skillLvl[lvlId]);
        p.stream.writeDWord_v2(p.skillXP[lvlId]);
        p.stream.writeByteC(lvlId);
    }

    public void setSkillLvl2(Player p, int lvlId, int lvl) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(217);
        p.stream.writeByteC(lvl);
        p.stream.writeDWord_v2(p.skillXP[lvlId]);
        p.stream.writeByteC(lvlId);
    }

    /**
     * Set item display on an interface.
     *
     * @param p           The Player which the frame should be created for.
     * @param interfaceId The interface to display the items on.
     * @param childId     The child interface on the main interface.
     * @param itemArray   The item id array to set on the interface.
     * @param itemAmt     The item array to go with the itemArray.
     */
    public void setItems(Player p, int interfaceId, int childId, int type, int[] itemArray, int[] itemAmt) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrameVarSizeWord(255);
        p.stream.writeWord(interfaceId);
        p.stream.writeWord(childId);
        p.stream.writeWord(type);
        p.stream.writeWord(itemArray.length);
        for (int i = 0; i < itemArray.length; i++) {
            if (itemAmt[i] > 254) {
                p.stream.writeByteS(255);
                p.stream.writeDWord_v2(itemAmt[i]);
            } else {
                p.stream.writeByteS(itemAmt[i]);
            }
            p.stream.writeWordBigEndian(itemArray[i] + 1);
        }
        p.stream.endFrameVarSizeWord();
    }


    /**
     * Set interface configs.
     * <p>This is used to do things such as hiding and displaying the special attack bar.
     *
     * @param p           The Player which the frame should be created for.
     * @param interfaceId The interface to the set the config with.
     * @param childId     The child that belongs to the interface to change.
     * @param 1           for true, 0 for false.
     */
    public void setInterfaceConfig(Player p, int interfaceId, int childId, boolean set) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrame(59);
        p.stream.writeByteC(set ? 1 : 0);
        p.stream.writeWord(childId);
        p.stream.writeWord(interfaceId);
    }

    /**
     * Display a message in the chatbox.
     *
     * @param p The Player which the frame should be created for.
     * @param s The message to display in the chatbox.
     */
    public void sendMessage(Player p, String s) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrameVarSize(218);
        p.stream.writeString(s);
        p.stream.endFrameVarSize();
    }

    /**
     * Set a string on an interface.
     *
     * @param p           The Player which the frame should be created for.
     * @param str         The string to set on the interface.
     * @param interfaceId The interface to set the text on.
     * @param childId     The interface's child to set the text on.
     */
    public void setString(Player p, String str, int interfaceId, int childId) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        int sSize = str.length() + 5;

        p.stream.createFrame(179);
        p.stream.writeByte(sSize / 256);
        p.stream.writeByte(sSize % 256);
        p.stream.writeString(str);
        p.stream.writeWord(childId);
        p.stream.writeWord(interfaceId);
    }

    /**
     * Send this player's updated coordinates.
     *
     * @param p The Player which the frame should be created for.
     */
    public void updateMovement(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrameVarSizeWord(216);
        p.stream.initBitAccess();
        p.stream.writeBits(1, 1);
        if (p.runDir == -1) {
            p.stream.writeBits(2, 1);
            p.stream.writeBits(3, p.walkDir);
            p.stream.writeBits(1, p.updateReq ? 1 : 0);
        } else {
            p.stream.writeBits(2, 2);
            p.stream.writeBits(3, p.runDir);
            p.stream.writeBits(3, p.walkDir);
            p.stream.writeBits(1, p.updateReq ? 1 : 0);
            if (p.runEnergy > 0) {
                p.runEnergyUpdateReq = true;
                p.runEnergy--;
            } else {
                p.isRunning = false;
            }
        }
    }

    /**
     * Tell the client this player isn't moving.
     *
     * @param p The Player which the frame should be created for.
     */
    public void noMovement(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrameVarSizeWord(216);
        p.stream.initBitAccess();
        p.stream.writeBits(1, p.updateReq ? 1 : 0);
        if (p.updateReq) {
            p.stream.writeBits(2, 0);
        }
    }

    /**
     * Changes the coordinates this player is standing at.
     *
     * @param p The Player which the frame should be created for.
     */
    public void teleport(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrameVarSizeWord(216);
        p.stream.initBitAccess();
        p.stream.writeBits(1, 1);
        p.stream.writeBits(2, 3);
        p.stream.writeBits(7, p.currentX);
        p.stream.writeBits(1, 1);
        p.stream.writeBits(2, p.heightLevel);
        p.stream.writeBits(1, p.updateReq ? 1 : 0);
        p.stream.writeBits(7, p.currentY);
    }

    /**
     * Send the map region and other positioning info to the client.
     *
     * @param p The Player which the frame should be created for.
     */
    public void setMapRegion(Player p) {
        if (p == null || p.stream == null || p.disconnected[0]) {
            return;
        }
        p.stream.createFrameVarSizeWord(142);
        p.stream.writeWordA(p.mapRegionX);
        p.stream.writeWordBigEndianA(p.currentY);
        p.stream.writeWordA(p.currentX);
        boolean forceSend = true;
        p.rebuildNPCList = true;

        if ((((p.mapRegionX / 8) == 48) || ((p.mapRegionX / 8) == 49))
                && ((p.mapRegionY / 8) == 48)) {
            forceSend = false;
        }
        if (((p.mapRegionX / 8) == 48) && ((p.mapRegionY / 8) == 148)) {
            forceSend = false;
        }
        for (int xCalc = (p.mapRegionX - 6) / 8; xCalc
                <= ((p.mapRegionX + 6) / 8); xCalc++) {
            for (int yCalc = (p.mapRegionY - 6) / 8; yCalc
                    <= ((p.mapRegionY + 6) / 8); yCalc++) {
                int region = yCalc + (xCalc << 1786653352);

                if (forceSend
                        || ((yCalc != 49) && (yCalc != 149) && (yCalc != 147)
                        && (xCalc != 50) && ((xCalc != 49) || (yCalc != 47)))) {
                    int[] mapData = Engine.mapData.getMapData(region);
                    if (mapData == null) {
                        p.setCoords(3254, 3420, 0);
                        sendMessage(p, "You got teleported to Varrock due to missing MapData.");
                        return;
                    }
                    p.stream.writeDWord(mapData[0]);
                    p.stream.writeDWord(mapData[1]);
                    p.stream.writeDWord(mapData[2]);
                    p.stream.writeDWord(mapData[3]);
                }
            }
        }
        p.stream.writeByteC(p.heightLevel);
        p.stream.writeWord(p.mapRegionY);
        p.stream.endFrameVarSizeWord();
        if (p.reqX > 0 || p.reqY > 0) {
            //p.reqWalkQueue(p.reqX, p.reqY);
        }
    }
}
