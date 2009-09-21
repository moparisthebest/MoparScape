public class NPCs {
    public int npcId;
    public int npcType;

    public int absX, absY;
    public int heightLevel;
    public int makeX, makeY, moverangeX1, moverangeY1, moverangeX2, moverangeY2, moveX, moveY, direction, walkingType;
    public int spawnX, spawnY;
    public int HP, MaxHP, hitDiff, MaxHit, animNumber, actionTimer, StartKilling;
    public boolean IsDead, DeadApply, NeedRespawn, IsUnderAttack, IsClose;
    public int[] Killing = new int[server.playerHandler.maxPlayers];

    public boolean RandomWalk;
    public boolean dirUpdateRequired;
    public boolean animUpdateRequired;
    public boolean hitUpdateRequired;
    public boolean updateRequired;
    public boolean textUpdateRequired;
    public String textUpdate;

    public NPCs(int _npcId, int _npcType) {
        npcId = _npcId;
        npcType = _npcType;
        direction = -1;
        IsDead = false;
        DeadApply = false;
        actionTimer = 0;
        RandomWalk = true;
        StartKilling = 0;
        IsUnderAttack = false;
        IsClose = false;
        for (int i = 0; i < Killing.length; i++) {
            Killing[i] = 0;
        }
    }

    public void updateNPCMovement(stream str) {
        if (direction == -1) {
            // don't have to update the npc position, because the npc is just standing
            if (updateRequired) {
                // tell ClientHandler there's an update block appended at the end
                str.writeBits(1, 1);
                str.writeBits(2, 0);
            } else {
                str.writeBits(1, 0);
            }
        } else {
            // send "walking packet"
            str.writeBits(1, 1);
            str.writeBits(2, 1);        // updateType
            str.writeBits(3, misc.xlateDirectionToClient[direction]);
            if (updateRequired) {
                str.writeBits(1, 1);        // tell ClientHandler there's an update block appended at the end
            } else {
                str.writeBits(1, 0);
            }
        }
    }

    public void appendNPCUpdateBlock(stream str) {
        if (!updateRequired) return;        // nothing required
        int updateMask = 0;
        if (textUpdateRequired) updateMask |= 1;
        if (animUpdateRequired) updateMask |= 0x10;
        if (hitUpdateRequired) updateMask |= 0x40;
        if (dirUpdateRequired) updateMask |= 0x20;

        /*if(updateMask >= 0x100) {
              // byte isn't sufficient
              updateMask |= 0x40;			// indication for the ClientHandler that updateMask is stored in a word
              str.writeByte(updateMask & 0xFF);
              str.writeByte(updateMask >> 8);
          } else {*/
        str.writeByte(updateMask);
        //}

        // now writing the various update blocks itself - note that their order crucial
        if (textUpdateRequired) {
            str.writeString(textUpdate);
        }
        if (animUpdateRequired) appendAnimUpdate(str);
        if (hitUpdateRequired) appendHitUpdate(str);
        if (dirUpdateRequired) appendDirUpdate(str);
        // TODO: add the various other update blocks
    }

    public void clearUpdateFlags() {
        updateRequired = false;
        textUpdateRequired = false;
        hitUpdateRequired = false;
        animUpdateRequired = false;
        dirUpdateRequired = false;
        textUpdate = null;
        moveX = 0;
        moveY = 0;
        direction = -1;
    }

    // returns 0-7 for next walking direction or -1, if we're not moving
    public int getNextWalkingDirection() {
        int dir;
        dir = misc.direction(absX, absY, (absX + moveX), (absY + moveY));
        if (dir == -1) return -1;
        dir >>= 1;
        absX += moveX;
        absY += moveY;
        return dir;
    }

    public void getNextNPCMovement() {
        direction = -1;
        direction = getNextWalkingDirection();
    }

    protected void appendHitUpdate(stream str) {
        try {
            HP -= hitDiff;
            if (HP <= 0) {
                IsDead = true;
            }
            str.writeByteC(hitDiff); // What the perseon got 'hit' for
            if (hitDiff > 0) {
                str.writeByteS(1); // 0: red hitting - 1: blue hitting
            } else {
                str.writeByteS(0); // 0: red hitting - 1: blue hitting
            }
            str.writeByteS(HP); // Their current hp, for HP bar
            str.writeByteC(MaxHP); // Their max hp, for HP bar
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void appendAnimUpdate(stream str) {
        str.writeWordBigEndian(animNumber);
        str.writeByte(1);
    }

    public void appendDirUpdate(stream str) {
        str.writeWord(direction);
    }
}
