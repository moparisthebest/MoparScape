package DavidScape.players.update;


import DavidScape.players.Player;
import DavidScape.util.Misc;
import DavidScape.util.Stream;


public class PlayerMovement {

    /**
     * Add the next step to a player's position.
     *
     * @param p The Player to update for.
     */
    public void getNextPlayerMovement(Player p) {
        if (p == null) {
            return;
        }
        p.mapRegionDidChange = false;
        p.didTeleport = false;
        p.walkDir = p.runDir = -1;
        if (p.teleportToX != -1 && p.teleportToY != -1) {
            p.mapRegionDidChange = true;
            if (p.mapRegionX != -1 && p.mapRegionY != -1) {
                int relX = p.teleportToX - (p.mapRegionX - 6) * 8, relY = p.teleportToY
                        - (p.mapRegionY - 6) * 8;

                if (relX >= 2 * 8 && relX < 11 * 8 && relY >= 2 * 8
                        && relY < 11 * 8) {
                    p.mapRegionDidChange = false;
                }
            }
            if (p.mapRegionDidChange) {
                p.mapRegionX = (p.teleportToX >> 3);
                p.mapRegionY = (p.teleportToY >> 3);
            }
            p.currentX = p.teleportToX - 8 * (p.mapRegionX - 6);
            p.currentY = p.teleportToY - 8 * (p.mapRegionY - 6);
            p.absX = p.teleportToX;
            p.absY = p.teleportToY;
            p.heightLevel = p.heightLevel;
            resetWalkingQueue(p);
            p.teleportToX = p.teleportToY = -1;
            p.didTeleport = true;
        } else {
            p.walkDir = getNextWalkingDirection(p);
            if (p.walkDir == -1) {
                return;
            }
            if (p.isRunning) {
                p.runDir = getNextWalkingDirection(p);
            }
            if (p.currentX < 2 * 8) {
                p.mapRegionDidChange = true;
            } else if (p.currentX >= 11 * 8) {
                p.mapRegionDidChange = true;
            }
            if (p.currentY < 2 * 8) {
                p.mapRegionDidChange = true;
            } else if (p.currentY >= 11 * 8) {
                p.mapRegionDidChange = true;
            }
            if (p.mapRegionDidChange) {
                p.teleportToX = p.absX;
                p.teleportToY = p.absY;
            }
        }
    }

    /**
     * Stop the player's movement on the next available square.
     *
     * @param p The Player to update for.
     */
    public void resetWalkingQueue(Player p) {
        if (p == null || p.walkingQueueX == null || p.walkingQueueY == null) {
            return;
        }
        p.walkingQueueX[0] = p.currentX;
        p.walkingQueueY[0] = p.currentY;
        p.walkingQueue[0] = -1;
        p.wQueueReadPtr = p.wQueueWritePtr = 1;
    }

    /**
     * Add's the next coordinate onto a player's position.
     *
     * @param p The Player to update for.
     */
    private int getNextWalkingDirection(Player p) {
        if (p == null) {
            return -1;
        }
        if (p.wQueueReadPtr == p.wQueueWritePtr) {
            return -1;
        }
        int dir = p.walkingQueue[p.wQueueReadPtr++];

        p.currentX += Misc.directionDeltaX[dir];
        p.currentY += Misc.directionDeltaY[dir];
        p.absX += Misc.directionDeltaX[dir];
        p.absY += Misc.directionDeltaY[dir];
        return dir;
    }

    /**
     * Adds two coordinates to the walking queue.
     *
     * @param p The Player to update for.
     * @param x The x coordinate to add.
     * @param y The y coordinate to add.
     */
    public void addToWalkingQueue(Player p, int x, int y) {
        int diffX = x - p.walkingQueueX[p.wQueueWritePtr - 1], diffY = y
                - p.walkingQueueY[p.wQueueWritePtr - 1];
        int max = Math.max(Math.abs(diffX), Math.abs(diffY));

        for (int i = 0; i < max; i++) {
            if (diffX < 0) {
                diffX++;
            } else if (diffX > 0) {
                diffX--;
            }
            if (diffY < 0) {
                diffY++;
            } else if (diffY > 0) {
                diffY--;
            }
            addStepToWalkingQueue(x - diffX, y - diffY, p);
        }
    }

    /**
     * Calculates two coordinates for the walking queue.
     */
    public void addStepToWalkingQueue(int x, int y, Player p) {
        if (p == null) {
            return;
        }
        int diffX = x - p.walkingQueueX[p.wQueueWritePtr - 1], diffY = y
                - p.walkingQueueY[p.wQueueWritePtr - 1];
        int dir = Misc.direction(diffX, diffY);

        if (p.wQueueWritePtr >= p.walkingQueueSize) {
            return;
        }
        if (dir != -1) {
            p.walkingQueueX[p.wQueueWritePtr] = x;
            p.walkingQueueY[p.wQueueWritePtr] = y;
            p.walkingQueue[p.wQueueWritePtr++] = dir;
        }
    }

    /**
     * Updates a players movement.
     *
     * @param p   The Player to update for.
     * @param str The stream to add the bytes to.
     */
    public void updateThisPlayerMovement(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        if (p.mapRegionDidChange) {
            p.frames.setMapRegion(p);
        }
        if (p.didTeleport) {
            p.frames.teleport(p);
            return;
        }
        if (p.walkDir == -1) {
            p.frames.noMovement(p);
        } else {
            p.frames.updateMovement(p);
        }
    }

    /**
     * Updates movement for other players within distance.
     *
     * @param p   The Player to update for.
     * @param str The stream to write the bytes to.
     */
    public void updatePlayerMovement(Player p, Stream str) {
        if (p == null || str == null) {
            return;
        }
        if (p.walkDir == -1) {
            if (p.updateReq) {
                str.writeBits(1, 1);
                str.writeBits(2, 0);
            } else {
                str.writeBits(1, 0);
            }
        } else if (p.runDir == -1) {
            str.writeBits(1, 1);
            str.writeBits(2, 1);
            str.writeBits(3, p.walkDir);
            str.writeBits(1, p.updateReq ? 1 : 0);
        } else {
            str.writeBits(1, 1);
            str.writeBits(2, 2);
            str.writeBits(3, p.walkDir);
            str.writeBits(3, p.runDir);
            str.writeBits(1, p.updateReq ? 1 : 0);
        }
    }
}
