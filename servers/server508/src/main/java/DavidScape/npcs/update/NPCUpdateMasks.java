package DavidScape.npcs.update;


import DavidScape.npcs.NPC;
import DavidScape.util.Stream;


public class NPCUpdateMasks {

    /**
     * Write the NPC mask.
     *
     * @param str        The stream to save the bytes to.
     * @param updateData The update mask.
     */
    public void writeMask(Stream str, int updateData) {
        if (str == null) {
            return;
        }
        str.writeByte(updateData);
    }

    /**
     * Write target the NPC is facing.
     *
     * @param n   The NPC whos facing target is to be written.
     * @param str The stream to save the bytes to.
     */
    public void appendNPCFaceTo(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        str.writeWord(n.faceToRequest);
    }

    /**
     * Displays a string over a NPCs head.
     *
     * @param n   The NPC to display the string for.
     * @param str The stream to dave the bytes to.
     */
    public void appendNPCSpeakText(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        str.writeString(n.speakText);
    }

    /**
     * Reqests that a NPC does an animation.
     *
     * @param n The NPC to request an animation for.
     * @Param str The stream to save the bytes to.
     */
    public void appendAnimationRequest(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        str.writeWordA(n.animRequest);
        str.writeByte(n.animDelay);
    }

    /**
     * Requests an NPC face specified coordinates.
     *
     * @param n   The NPC to write the coords for.
     * @param str The stream to save the bytes to.
     */
    public void appendFaceCoords(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        str.writeWordA(n.faceCoordsX);
        str.writeWordBigEndianA(n.faceCoordsY);
    }

    /**
     * Requests graphics to be displayed on a NPC.
     *
     * @param n   The NPC to request the graphics for.
     * @param str The stream to save the bytes to.
     */
    public void appendGraphicsRequest(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        str.writeWordA(n.gfxRequest);
        str.writeDWord_v2(n.gfxDelay);
    }

    /**
     * Displays damage on an NPC.
     *
     * @param n   The NPC to display damage on.
     * @param str The stream to save the bytes to.
     */
    public void appendHit1(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        str.writeByte(n.hitDiff1);
        if (n.posionHit1 == 0) {
            if (n.hitDiff1 > 0) {
                str.writeByte(1);
            } else {
                str.writeByte(0);
            }
        } else {
            str.writeByte(2);
        }
        int hpRatio = getCurrentHP(n.currentHP, n.maxHP, 100) * 255 / 100;

        str.writeByteS(hpRatio);
    }

    /**
     * Displays damage on an NPC.
     *
     * @param n   The NPC to display damage on.
     * @param str The stream to save the bytes to.
     */
    public void appendHit2(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        str.writeByte(n.hitDiff2);
        if (n.posionHit2 == 0) {
            if (n.hitDiff2 > 0) {
                str.writeByteS(1);
            } else {
                str.writeByteS(0);
            }
        } else {
            str.writeByteS(2);
        }
    }

    private int getCurrentHP(int i, int i1, int i2) {
        double x = (double) i / (double) i1;

        return (int) Math.round(x * i2);
    }
}
