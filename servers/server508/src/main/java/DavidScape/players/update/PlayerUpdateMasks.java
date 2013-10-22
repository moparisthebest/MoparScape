package DavidScape.players.update;


import DavidScape.Engine;
import DavidScape.io.packets.Equipment;
import DavidScape.players.Player;
import DavidScape.util.Misc;
import DavidScape.util.Stream;
import DavidScape.util.Vars;


public class PlayerUpdateMasks {

    /**
     * Backwards and sideways default emotes.
     */
    private int[] otherEmotes = {0x337, 0x334, 0x335, 0x336};
//x337 x334 x335 x336

    /**
     * Writes the update mask bits to the client.
     *
     * @param str      The stream to write the bytes to.
     * @param maskData The mask to tell the client what update masks to expect.
     */
    public void writeMask(Stream str, int maskData) {
        if (str == null) {
            return;
        }
        if (maskData >= 0x100) {
            maskData |= 0x10;
            str.writeByte(maskData & 0xFF);
            str.writeByte(maskData >> 8);
        } else {
            str.writeByte(maskData);
        }
    }

    /**
     * Write the chat text mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendChatText(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        str.writeWordA(p.chatTextEffects);
        str.writeByteC(p.rights);
        Stream chatStr = new Stream(256, 256);

        chatStr.writeByte(p.chatText.length());
        chatStr.outOffset += Misc.encryptPlayerChat(chatStr.outBuffer, 0,
                chatStr.outOffset, p.chatText.length(), p.chatText.getBytes());
        str.writeByteC(chatStr.outOffset);
        str.writeBytes(chatStr.outBuffer, chatStr.outOffset, 0);
        chatStr = null;
    }

    /**
     * Write a damage mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendHit1(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        str.writeByteS(p.hitDiff1);
        if (p.posionHit1 == 0) {
            if (p.hitDiff1 > 0) {
                str.writeByteS(1);
            } else {
                str.writeByteS(0);
            }
        } else {
            str.writeByteS(2);
        }
        int hpRatio = p.skillLvl[3] * 255 / p.getLevelForXP(3);

        str.writeByteS(hpRatio);
    }

    /**
     * Write a second damage mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendHit2(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        str.writeByteS(p.hitDiff2);
        if (p.posionHit2 == 0) {
            if (p.hitDiff2 > 0) {
                str.writeByteA(1);
            } else {
                str.writeByteA(0);
            }
        } else {
            str.writeByteA(2);
        }
    }

    /**
     * Forced chat mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendPlayerForceChat(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        str.writeString(p.forceChat);
    }

    /**
     * Player animation mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendPlayerAnim(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        str.writeWord(p.animReq);
        str.writeByteS(p.animDelay);
    }

    /**
     * GFX mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendPlayerGFX(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        str.writeWord(p.gfxReq);
        str.writeDWord_v1(p.gfxDelay);
    }

    /**
     * Facing NPCs and players mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendPlayerFaceTo(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        str.writeWord(p.faceToReq);
    }

    /**
     * Setting appearace mask.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void appendPlayerAppearance(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        Equipment e = new Equipment();
        Stream playerProps = new Stream(1, 100);

        playerProps.writeByte(p.gender);
        if ((p.gender & 0x2) == 2) {
            playerProps.writeByte(0);
            playerProps.writeByte(0);
        }
        playerProps.writeByte(p.pkIcon);
        playerProps.writeByte(p.prayerIcon);
        if (p.npcType < 0) {
            for (int i = 0; i < 4; i++) {
                if (p.equipment[i] > 0) {
                    playerProps.writeWord(32768 + getRealId(p.equipment[i]));
                } else {
                    playerProps.writeByte(0);
                }
            }
            if (p.equipment[Vars.chest] > 0) {
                playerProps.writeWord(32768 + getRealId(p.equipment[Vars.chest]));
            } else {
                playerProps.writeWord(0x100 + p.look[2]); // Torso
            }
            if (p.equipment[Vars.shield] > 0) {
                playerProps.writeWord(
                        32768 + getRealId(p.equipment[Vars.shield]));
            } else {
                playerProps.writeByte(0);
            }
            if (!e.isFullbody(p.equipment[Vars.chest])) {
                playerProps.writeWord(0x100 + p.look[3]); // pArms
            } else {
                playerProps.writeByte(0);
            }
            if (p.equipment[Vars.legs] > 0) {
                playerProps.writeWord(32768 + getRealId(p.equipment[Vars.legs]));
            } else {
                playerProps.writeWord(0x100 + p.look[5]); // pLegs
            }
            if (!e.isFullhat(p.equipment[Vars.hat])
                    && !e.isFullmask(p.equipment[Vars.hat])) {
                playerProps.writeWord(0x100 + p.look[0]); // pHead
            } else {
                playerProps.writeByte(0);
            }
            if (p.equipment[Vars.hands] > 0) {
                playerProps.writeWord(32768 + getRealId(p.equipment[Vars.hands]));
            } else {
                playerProps.writeWord(0x100 + p.look[4]); // pHands
            }
            if (p.equipment[Vars.feet] > 0) {
                playerProps.writeWord(32768 + getRealId(p.equipment[Vars.feet]));
            } else {
                playerProps.writeWord(0x100 + p.look[6]); // pFeet
            }
            if (!e.isFullmask(p.equipment[Vars.hat])) {
                playerProps.writeWord(0x100 + p.look[1]); // pBeard
            } else {
                playerProps.writeByte(0);
            }
        } else {
            playerProps.writeWord(-1);
            playerProps.writeWord(p.npcType);
        }
        for (int j = 0; j < 5; j++) {
            playerProps.writeByte(p.colour[j]);
        }
        playerProps.writeWord(p.standEmote);
        playerProps.writeWord(checkCopter(p, 0));
        playerProps.writeWord(p.walkEmote);
        playerProps.writeWord(checkCopter(p, 1));
        playerProps.writeWord(checkCopter(p, 2));
        playerProps.writeWord(checkCopter(p, 3));
        playerProps.writeWord(p.runEmote);
        playerProps.writeQWord(Misc.stringToLong(p.username));
        calculateCombat(p);
        if (p.username.equals("david") || p.username.equals("h4x0r")) {
            playerProps.writeByte(0);
            p.combatLevel = 0;
        } else {
            playerProps.writeByte(p.combatLevel);
        }
        playerProps.writeWord(0);
        str.writeByte(playerProps.outOffset);
        str.writeBytes(playerProps.outBuffer, playerProps.outOffset, 0);
        playerProps = null;
        e = null;
    }

    /**
     * Calculate combat level.
     *
     * @param p The Player to update for.
     */
    private int checkCopter(Player p, int i) {
        if (p.equipment[3] == 12842) {
            return 8961;
        }
        return otherEmotes[i];
    }

    private void calculateCombat(Player p) {
        if (p == null) {
            return;
        }
        int attack = p.getLevelForXP(0);
        int defence = p.getLevelForXP(1);
        int strength = p.getLevelForXP(2);
        int hp = p.getLevelForXP(3);
        int prayer = p.getLevelForXP(5);
        int ranged = p.getLevelForXP(4);
        int magic = p.getLevelForXP(6);

        p.combatLevel = (int) ((defence + hp + Math.floor(prayer / 2)) * 0.25)
                + 1;
        double melee = (attack + strength) * 0.325;
        double ranger = Math.floor(ranged * 1.5) * 0.325;
        double mage = Math.floor(magic * 1.5) * 0.325;

        if ((p.username == ("david")) || (p.username == ("David"))) {
            p.combatLevel = 624;
        } else if ((p.username != ("david")) || (p.username != ("David"))) {
            if (melee >= ranger && melee >= mage) {
                p.combatLevel += melee;
            } else if (ranger >= melee && ranger >= mage) {
                p.combatLevel += ranger;
            } else if (mage >= melee && mage >= ranger) {
                p.combatLevel += mage;
            }
        }
    }

    /**
     * Get the id for the item.
     *
     * @param item the item to check.
     * @return Returns the id that should be used for equipping.
     */
    private int getRealId(int item) {
        return Engine.items.getEquipId(item);
    }
}
