package DavidScape.io.packets;


import DavidScape.players.Player;


interface Packet {

    /**
     * Default setup for all packets.
     *
     * @param p          The Player which the frame should be handled for.
     * @param packetId   The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    void handlePacket(Player p, int packetId, int packetSize);
}
