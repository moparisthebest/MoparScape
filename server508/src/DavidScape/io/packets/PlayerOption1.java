package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class PlayerOption1 implements Packet {

    /**
     * Handles the first player option.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }

        if (!p.castAuto) {
            p.attackPlayer(true);
        } else {
            Engine.playerMovement.resetWalkingQueue(p);
            p.usingAutoCast = true;
        }


        if (!p.playerOption1) {
            int playerId = p.stream.readUnsignedWordBigEndian();

            if (playerId <= 0 || playerId >= Engine.players.length
                    || Engine.players[playerId] == null) {
                return;
            }
            p.requestFaceTo(playerId + 32768);
            p.clickId = playerId;
            p.clickX = Engine.players[playerId].absX;
            p.clickY = Engine.players[playerId].absY;
            if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 30) {
                return;
            }
            p.playerOption1 = true;
        }
        if (p.clickId < 2001) {
            Player p2 = Engine.players[p.clickId];
            if (p2 != null && p != null) {

                if (!Engine.wildernessArea(p.absX, p.absY) && p.AtDuel() == false && p.AtClanField() == false && p.AtCastleWars() == false &&
                        !Engine.wildernessArea(p2.absX, p2.absY) && p2.AtDuel() == false && p2.AtClanField() == false && p2.AtCastleWars() == false) {
                    return;
                }


                p.playerOption1 = false;
                p.attackPlayer = p.clickId;
                p.attackingPlayer = true;
                if (p.FamiliarID == 3348) {
                    p.follower.attackPlayer = p.clickId;
                    p.follower.attackingPlayer = true;
                    p.follower.followPlayer = p.clickId;
                }

                if (p.canAttackPlayer(p)) {
                    p.skulledDelay = 180;
                }
            }
        }
    }
}
