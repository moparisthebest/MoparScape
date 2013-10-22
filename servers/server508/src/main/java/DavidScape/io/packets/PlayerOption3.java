package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;
import DavidScape.util.Misc;


public class PlayerOption3 implements Packet {

    /**
     * Handles the third player option.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        if (!p.playerOption3) {
            int playerId = p.stream.readUnsignedWordBigEndianA();

            if (playerId <= 0 || playerId >= Engine.players.length
                    || Engine.players[playerId] == null) {
                return;
            }
            p.clickId = playerId;
            p.clickX = Engine.players[playerId].absX;
            p.clickY = Engine.players[playerId].absY;
            if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 30) {
                return;
            }
            p.playerOption3 = true;
        }
        if (p.clickId <= 0 || p.clickId >= Engine.players.length
                || Engine.players[p.clickId] == null) {
            p.playerOption3 = false;
            return;
        }
        if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 1) {
            return;
        }

        p.playerOption3 = false;
        Player p2 = Engine.players[p.clickId];
        if (p.jailed) {
            p.frames.sendMessage(p, "You have been jailed! You can't do anything except yell!");
            return;
        }
        if (p.AtClanLobby()) {
            if (p2.clanchat == 0) {
                p.frames.sendMessage(p, "That person is not in a clan.");
            } else if (p2.clanchat == p.clanchat) {
                p.frames.sendMessage(p, "That person is in your clan.");
            } else if (p.clanchat == p.playerId) {
                p.frames.sendMessage(p, "<col=0000FF>Sending clan challenge request.");
                p.frames.sendMessage(p2, p.username + "<col=FF0000> wishes to fight your clan.");
                p.frames.sendMessage(p2, "<col=FF0000>To accept, right click challenge him.");
                p.ClanReady = true;
                p.ClanPartner = p2.playerId;


                if (p2.ClanReady == true && p.ClanReady == true && p2.ClanPartner == p.playerId) {
                    p.ClanReady = false;
                    p2.ClanReady = false;


                    p.setCoords(3291, 3830, p.playerId * 4);
                    p2.setCoords(3299, 3722, p.playerId * 4);


                    for (Player pz : Engine.players) {
                        if (pz != null) {
                            if (pz.clanchat == p.clanchat) {
                                pz.Opposing = p2.clanchat;
                                pz.ClanCount = 1;
                                pz.ClanTimer = 60;
                                pz.clanheight = p.clanchat * 4;
                                pz.ClanBattle = true;
                                pz.ClanSide = 1;
                                p.frames.sendMessage(pz, "<col=ff0000> Clan ready for battle, enter the portal!");
                            }

                            if (pz.clanchat == p2.clanchat) {
                                pz.Opposing = p.clanchat;
                                pz.ClanCount = 1;
                                pz.ClanTimer = 60;
                                pz.clanheight = p.clanchat * 4;
                                pz.ClanBattle = true;
                                pz.ClanSide = 0;
                                p.frames.sendMessage(pz, "<col=ff0000> Clan ready for battle, enter the portal!");
                            }

                        }
                    }
                }
            } else {
                p.frames.sendMessage(p, "You are not the leader of your clan.");
            }


        } else {
            if ((p.absX > 2816 && p.absX < 2942 && p.absY < 5374 && p.absY > 5253) || (p2.absX > 2816 && p2.absX < 2942 && p2.absY < 5374 && p2.absY > 5253)) {
                p.frames.sendMessage(p, "You can't duel in the GWD!");
                return;
            }
            p.frames.sendMessage(p, "<col=0000FF>Sending duel request.");
            p.frames.sendMessage(p2, p.username + "<col=FF0000> wishes to duel you.");
            p.frames.sendMessage(p2, "<col=FF0000>To accept, right click duel him.");
            p.DuelReady = true;
            p.DuelPartner = p2.playerId;

            p.DuelX = p.absX;
            p.DuelY = p.absY;

            if (p2.DuelReady == true && p.DuelReady == true && p2.DuelPartner == p.playerId) {

                p.setCoords(3369 + Misc.random(12), 3228 + Misc.random(7), 0);
                p2.setCoords(3369 + Misc.random(12), 3228 + Misc.random(7), 0);
                p2.DuelTimer = 10;
                p.DuelTimer = 10;
            }
        }

        p.requestFaceTo(p.clickId);
    }
}
