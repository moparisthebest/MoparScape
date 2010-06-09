package DavidScape.players.update;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Stream;


public class PlayerUpdate extends PlayerUpdateMasks {

    /**
     * Updates player's within distance of Player p.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void updatePlayer(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        byte[] newPlayerIds = new byte[Engine.players.length];

        Engine.playerMovement.updateThisPlayerMovement(p, str);
        str.writeBits(8, p.playerListSize);
        int size = p.playerListSize;

        p.playerListSize = 0;
        for (int i = 0; i < size; i++) {
            if (p.playerList[i] == null || !withinDistance(p, p.playerList[i])
                    || p.playerList[i].didTeleport) {
                if (p.playerList[i] != null) {
                    p.playersInList[p.playerList[i].playerId] = 0;
                }
                str.writeBits(1, 1);
                str.writeBits(2, 3);
            } else {
                Engine.playerMovement.updatePlayerMovement(p.playerList[i], str);
                p.playerList[p.playerListSize++] = p.playerList[i];
            }
        }
        for (Player p2 : Engine.players) {
            if (p2 == null || p2.playerId == p.playerId || !p2.online) {
                continue;
            }
            if (p.playersInList[p2.playerId] == 1 || !withinDistance(p, p2)) {
                continue;
            }
            newPlayerIds[p.playerListSize] = 1;
            addNewPlayer(p, p2, str);
        }
        str.writeBits(11, 2047);
        str.finishBitAccess();
        appendPlayerUpdateMasks(p, str);
        for (int i = 0; i < p.playerListSize; i++) {
            Player p2 = p.playerList[i];

            if (newPlayerIds[i] == 1) {
                boolean appearanceFlag = p2.appearanceUpdateReq;
                boolean updateFlag = p2.updateReq;

                p2.appearanceUpdateReq = true;
                p2.updateReq = true;
                appendPlayerUpdateMasks(p2, str);
                p2.appearanceUpdateReq = appearanceFlag;
                p2.updateReq = updateFlag;
            } else {
                appendPlayerUpdateMasks(p.playerList[i], str);
            }
        }
        str.endFrameVarSizeWord();
    }

    /**
     * Writes the requested masks.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendPlayerUpdateMasks(Player p, Stream str) {
        boolean bool = false;

        if (p == null || str == null) {
            return;
        }
        if (!p.updateReq) {
            return;
        }
        int maskData = 0;

        if (bool) {
            maskData |= 0x100;
        }
        if (p.hit2UpdateReq) {
            maskData |= 0x200;
        }
        if (p.faceToUpdateReq) {
            maskData |= 0x20;
        }
        if (p.forceChatUpdateReq) {
            maskData |= 0x4;
        }
        if (p.gfxUpdateReq) {
            maskData |= 0x400;
        }
        if (bool) {
            maskData |= 0x40;
        }
        if (p.chatTextUpdateReq) {
            maskData |= 0x8;
        }
        if (p.animUpdateReq) {
            maskData |= 0x1;
        }
        if (p.appearanceUpdateReq) {
            maskData |= 0x80;
        }
        if (p.hit1UpdateReq) {
            maskData |= 0x2;
        }
        writeMask(str, maskData);
        if (p.hit2UpdateReq) {
            appendHit2(p, str);
        }
        if (p.faceToUpdateReq) {
            appendPlayerFaceTo(p, str);
        }
        if (p.forceChatUpdateReq) {
            appendPlayerForceChat(p, str);
        }
        if (p.gfxUpdateReq) {
            appendPlayerGFX(p, str);
        }
        if (p.chatTextUpdateReq) {
            appendChatText(p, str);
        }
        if (p.animUpdateReq) {
            appendPlayerAnim(p, str);
        }
        if (p.appearanceUpdateReq) {
            appendPlayerAppearance(p, str);
        }
        if (p.hit1UpdateReq) {
            appendHit1(p, str);
        }
    }

    /**
     * Checks if a player is within distance of another player.
     *
     * @param p        The Player to update for.
     * @param otherPlr The player to see if is within distance to.
     */
    private boolean withinDistance(Player p, Player otherPlr) {
        if (otherPlr == null || p == null) {
            return false;
        }
        if (p.heightLevel != otherPlr.heightLevel) {
            return false;
        }
        int deltaX = otherPlr.absX - p.absX, deltaY = otherPlr.absY - p.absY;

        return (deltaX <= 15 && deltaX >= -16 && deltaY <= 15 && deltaY >= -16);
    }

    /**
     * Tells a player to update.
     *
     * @param p The Player to update for.
     */
    public void update(Player p) {
        if (p == null || p.disconnected[0]) {
            return;
        }
        updatePlayer(p, p.stream);
        Engine.npcUpdate.updateNPC(p, p.stream);

    }

    /**
     * Reset all update requests now that they have been sent.
     *
     * @param p The Player to update for.
     */
    public void clearUpdateReqs(Player p) {
        if (p == null) {
            return;
        }
        p.updateReq = false;
        p.chatTextUpdateReq = false;
        p.appearanceUpdateReq = false;
        p.animUpdateReq = false;
        p.gfxUpdateReq = false;
        p.hit1UpdateReq = false;
        p.hit2UpdateReq = false;
        p.faceToUpdateReq = false;
        p.forceChatUpdateReq = false;
        p.animReq = -1;
        p.animDelay = 0;
        p.gfxReq = -1;
        p.gfxDelay = 0;
        p.hitDiff1 = 0;
        p.posionHit1 = 0;
        p.hitDiff2 = 0;
        p.posionHit2 = 0;
    }

    /**
     * Tell the client to add a new player.
     *
     * @param p   The Player to update for.
     * @param p2  The player to add.
     * @param str The stream to write the bytes to.
     */
    public void addNewPlayer(Player p, Player p2, Stream str) {
        if (p == null || p2 == null || str == null) {
            return;
        }
        p.playersInList[p2.playerId] = 1;
        p.playerList[p.playerListSize++] = p2;
        str.writeBits(11, p2.playerId);
        int yPos = p2.absY - p.absY;

        if (yPos > 15) {
            yPos += 32;
        }
        int xPos = p2.absX - p.absX;

        if (xPos > 15) {
            xPos += 32;
        }
        str.writeBits(5, xPos);
        str.writeBits(1, 1);
        str.writeBits(3, 1);
        str.writeBits(1, 1);
        str.writeBits(5, yPos);
    }
}
