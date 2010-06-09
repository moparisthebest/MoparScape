package DavidScape.npcs.update;


import DavidScape.npcs.NPC;
import DavidScape.util.Misc;
import DavidScape.util.Stream;


public class NPCMovement {

    /**
     * Tells the client in which direction to move the NPC.
     */
    private byte[] xlateDirectionToClient = new byte[]{1, 2, 4, 7, 6, 5, 3, 0};

    /**
     * Update an NPCs movement.
     *
     * @param n   The npc to get the data from.
     * @param str The stream class to write the bytes to.
     */
    public void updateNPCMovement(NPC n, Stream str) {
        if (n == null || str == null) {
            return;
        }
        if (n.direction == -1) {
            if (n.updateReq) {
                str.writeBits(1, 1);
                str.writeBits(2, 0);
            } else {
                str.writeBits(1, 0);
            }
        } else {
            str.writeBits(1, 1);
            str.writeBits(2, 1);
            str.writeBits(3, xlateDirectionToClient[n.direction]);
            str.writeBits(1, (n.updateReq) ? 1 : 0);
        }
    }
    /**
     * Get the movement for following two coordinates.
     */

    /**
     * Adds the new positioning onto the NPC.
     *
     * @param n The npc to get the data from.
     */
    public void getNextNPCMovement(NPC n) {
        if (n == null) {
            return;
        }
        if (n.moveX == 0 && n.moveY == 0) {
            return;
        }
        int dir = direction(n.absX, n.absY, (n.absX + n.moveX),
                (n.absY + n.moveY));

        if (dir == -1) {
            return;
        }
        n.updateReq = true;
        dir >>= 1;
        n.direction = dir;
        n.absX += n.moveX;
        n.absY += n.moveY;
    }

    /**
     * Random movement.
     *
     * @param n The npc to get the data from.
     */
    public void randomWalk(NPC n) {
        if (n == null) {
            return;
        }
        if (!doesWalk(n) && n.followPlayer != 0) {
            //sn.moveX = getMove(n.absX, n.makeX);
            //n.moveY = getMove(n.absY, n.makeY);
            //getNextNPCMovement(n);
            //n.requestFaceTo(-1);
        }
        if (n.randomWalk && doesWalk(n) && !inRange(n, n.absX, n.absY)) {
            n.moveX = getMove(n.absX, n.makeX);
            n.moveY = getMove(n.absY, n.makeY);
            getNextNPCMovement(n);
        } else if (n.randomWalk && Misc.random2(10) == 1 && doesWalk(n)) {
            int moveX = Misc.random(1);
            int moveY = Misc.random(1);
            int rnd = Misc.random2(4);

            if (rnd == 1) {
                moveX = -(moveX);
                moveY = -(moveY);
            } else if (rnd == 2) {
                moveX = -(moveX);
            } else if (rnd == 3) {
                moveY = -(moveY);
            }
            if (inRange(n, n.absX + moveX, n.absY + moveY)) {
                n.moveX = moveX;
                n.moveY = moveY;
                getNextNPCMovement(n);
                n.requestFaceTo(-1);
            }
        }
    }

    public void reqMove(NPC n, int x, int y) {
        n.moveX = x;
        n.moveY = y;
        getNextNPCMovement(n);
    }

    /**
     * Returns true if the npcs range isn't 0.
     *
     * @param n The npc to get the data from.
     * @return Returns if the NPC has a walking range.
     */
    public boolean doesWalk(NPC n) {
        if (n == null) {
            return false;
        }
        return (n.moveRangeX1 > 0 && n.moveRangeY1 > 0 && n.moveRangeX2 > 0
                && n.moveRangeY2 > 0);
    }

    /**
     * Check to make sure the new movement is in range.
     *
     * @param n     The npc to get the data from.
     * @param moveX The attempted new walking x.
     * @param moveY The attempted new walking y.
     * @return Returns in the NPC is in walking range.
     */
    private boolean inRange(NPC n, int moveX, int moveY) {
        if (n == null) {
            return false;
        }
        if (moveX <= n.moveRangeX1 && moveX >= n.moveRangeX2
                && moveY <= n.moveRangeY1 && moveY >= n.moveRangeY2) {
            return true;
        }
        return false;
    }

    /**
     * Get the walking direction.
     */
    private int direction(int srcX, int srcY, int destX, int destY) {
        int dx = destX - srcX, dy = destY - srcY;

        if (dx < 0) {
            if (dy < 0) {
                if (dx < dy) {
                    return 11;
                } else if (dx > dy) {
                    return 9;
                } else {
                    return 10;
                }
            } else if (dy > 0) {
                if (-dx < dy) {
                    return 15;
                } else if (-dx > dy) {
                    return 13;
                } else {
                    return 14;
                }
            } else {
                return 12;
            }
        } else if (dx > 0) {
            if (dy < 0) {
                if (dx < -dy) {
                    return 7;
                } else if (dx > -dy) {
                    return 5;
                } else {
                    return 6;
                }
            } else if (dy > 0) {
                if (dx < dy) {
                    return 1;
                } else if (dx > dy) {
                    return 3;
                } else {
                    return 2;
                }
            } else {
                return 4;
            }
        } else {
            if (dy < 0) {
                return 8;
            } else if (dy > 0) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    /**
     * Get the movement for following two coordinates.
     */
    public int getMove(int Place1, int Place2) {
        if ((Place1 - Place2) == 0)
            return 0;
        else if ((Place1 - Place2) < 0)
            return 1;
        else if ((Place1 - Place2) > 0)
            return -1;
        return 0;
    }
}
