/*
 * Class NPCUpdate
 *
 * Version 1.0
 *
 * Monday, August 18, 2008
 *
 * Created by Palidino76
 */

package DavidScape.npcs.update;

import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.util.Stream;

public class NPCUpdate extends NPCUpdateMasks {
    public Stream update = new Stream(500, 5000);
    public int gfxHeight;

    /**
     * Update all NPCs for this player.
     *
     * @param p   The Player class to apply updates to.
     * @param str The stream to write the bytes to.
     */
    public void updateNPC(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        update.outOffset = 0;
        byte[] newNPCIds = new byte[Engine.npcs.length];
        int updateByteCount = 0;
        str.createFrameVarSizeWord(222);
        str.initBitAccess();
        str.writeBits(8, p.npcListSize);
        int size = p.npcListSize;
        p.npcListSize = 0;
        for (int i = 0; i < size; i++) {
            if (!withinDistance(p, p.npcList[i]) || p.npcList[i] == null || p.didTeleport) {
                p.npcsInList[p.npcList[i].npcId] = 0;
                str.writeBits(1, 1);
                str.writeBits(2, 3);
            } else {
                Engine.npcMovement.updateNPCMovement(p.npcList[i], str);
                if (p.npcList[i].updateReq) {
                    appendNPCUpdateMasks(p.npcList[i], update);
                }
                p.npcList[p.npcListSize++] = p.npcList[i];
            }
        }
        for (NPC n : Engine.npcs) {
            if (n == null || !withinDistance(p, n) || p.npcsInList[n.npcId] == 1) {
                continue;
            }
            newNPCIds[n.npcId] = 1;
            addNewNPC(p, n, str);
        }
        p.rebuildNPCList = false;
        if (update.outOffset >= 3) {
            str.writeBits(15, 32767);
        }
        str.finishBitAccess();
        if (update.outOffset > 0) {
            str.writeBytes(update.outBuffer, update.outOffset, 0);
        }
        str.endFrameVarSizeWord();
    }

    /**
     * Writes the requested masks.
     *
     * @param n   The NPC to get values from.
     * @param str The stream to write bytes to.
     */
    public void appendNPCUpdateMasks(NPC n, Stream str) {
        if (str == null || n == null) {
            return;
        }
        if (!n.updateReq) {
            return;
        }
        boolean bool = false;
        int maskData = 0;
        if (n.faceToUpdateReq) {
            maskData |= 0x10;
        }
        if (bool) {
            maskData |= 0x8;
        }
        if (n.speakTextUpdateReq) {
            maskData |= 0x40;
        }
        if (n.animUpdateReq) {
            maskData |= 0x1;
        }
        if (n.gfxUpdateReq) {
            maskData |= 0x2;
        }
        if (n.hit2UpdateReq) {
            maskData |= 0x20;
        }
        if (n.faceCoordsUpdateReq) {
            maskData |= 0x80;
        }
        if (n.hit1UpdateReq) {
            maskData |= 0x4;
        }
        writeMask(str, maskData);
        if (n.faceToUpdateReq) {
            appendNPCFaceTo(n, str);
        }
        if (n.speakTextUpdateReq) {
            appendNPCSpeakText(n, str);
        }
        if (n.speakTextUpdateReq) {
            appendNPCSpeakText(n, str);
        }
        if (n.animUpdateReq) {
            appendAnimationRequest(n, str);
        }
        if (n.gfxUpdateReq) {
            appendGraphicsRequest(n, str);
        }
        if (n.hit2UpdateReq) {
            appendHit2(n, str);
        }
        if (n.faceCoordsUpdateReq) {
            appendFaceCoords(n, str);
        }
        if (n.hit1UpdateReq) {
            appendHit1(n, str);
        }
    }

    /**
     * Check if the npc is within distance.
     *
     * @param p   The player to check the distance with.
     * @param npc The NPC to check the distance with.
     */
    private boolean withinDistance(Player p, NPC npc) {
        if (npc != null && p != null) {
            if (p.heightLevel != npc.heightLevel || npc.hiddenNPC) {
                return false;
            }
            int deltaX = npc.absX - p.absX, deltaY = npc.absY - p.absY;
            return (deltaX <= 15 && deltaX >= -16 && deltaY <= 15 && deltaY >= -16);
        }
        return false;
    }

    /**
     * Remove all requests for updates until needed again.
     *
     * @param n The NPC to clear the masks for.
     */
    public void clearUpdateMasks(NPC n) {
        if (n == null) {
            return;
        }
        n.updateReq = false;
        n.speakTextUpdateReq = false;
        n.animUpdateReq = false;
        n.gfxUpdateReq = false;
        n.faceCoordsUpdateReq = false;
        n.hit1UpdateReq = false;
        n.hit2UpdateReq = false;
        n.faceToUpdateReq = false;
        n.speakText = "";
        n.animRequest = 65535;
        n.animDelay = 0;
        n.gfxRequest = 65535;
        n.gfxHeight = 0;
        n.moveX = n.moveY = 0;
        n.direction = -1;
        n.faceCoordsX = -1;
        n.faceCoordsY = -1;
        n.hitDiff1 = 0;
        n.posionHit1 = 0;
        n.hitDiff2 = 0;
        n.posionHit2 = 0;
    }

    /**
     * Add a new npc to this players client.
     *
     * @param p   The player the NPC is being added to.
     * @param npc The NPC being added.
     * @param str The stream the bytes are being written to.
     */
    public void addNewNPC(Player p, NPC npc, Stream str) {
        if (npc == null || str == null || p == null) {
            return;
        }
        p.npcsInList[npc.npcId] = 1;
        p.npcList[p.npcListSize++] = npc;
        str.writeBits(15, npc.npcId);
        str.writeBits(14, npc.npcType);
        str.writeBits(1, npc.updateReq ? 1 : 0);
        int y = npc.absY - p.absY;
        if (y < 0) {
            y += 32;
        }
        int x = npc.absX - p.absX;
        if (x < 0) {
            x += 32;
        }
        str.writeBits(5, y);
        str.writeBits(5, x);
        str.writeBits(3, 0);
        str.writeBits(1, 1);
        appendNPCUpdateMasks(npc, update);
    }
}