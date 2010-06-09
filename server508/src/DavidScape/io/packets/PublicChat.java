package DavidScape.io.packets;


import DavidScape.Server;
import DavidScape.players.Player;
import DavidScape.util.Misc;

public class PublicChat implements Packet {

    /**
     * Handles player chatting.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        p.chatTextEffects = p.stream.readUnsignedWord();
        int numChars = p.stream.readUnsignedByte();

        p.chatText = Misc.decryptPlayerChat(p.stream, numChars);
        String[] words = {"fuck", "damn", "shit", "fuk", "4uck", "bitch", "sex", "pussy", "vagina", "dick", "blow", "bastard"}; // insert more words here

        for (String s : words) {
            if (p.chatText.toLowerCase().contains(s)) {
                char[] stars = new char[s.length()];
                java.util.Arrays.fill(stars, '*');

                p.chatText = p.chatText.toLowerCase().replaceAll(s, new String(stars));

            }
        }
        if (p.chatText.startsWith("/")) {
            p.chatText = Misc.removeSlash(p.chatText);
            Server.ClanMain.clanMessage(p, p.chatText);
        } else if (!p.chatText.startsWith("/")) {
            if (p.muted == 0) {
                p.chatTextUpdateReq = true;
                p.updateReq = true;
            } else if (p.muted == 1) {
                p.frames.sendMessage(p, "You cannot talk because you are muted. Follow the rules!");
            }
        }
    }
}