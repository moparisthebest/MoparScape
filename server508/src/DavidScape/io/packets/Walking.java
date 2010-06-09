package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.players.Player;


public class Walking implements Packet {

    /**
     * This class handles the three walking packets.
     *
     * @param p          The Player which the frame should be created for.
     * @param packetId   The id of the packet.
     * @param packetSize The number of bytes from the packet.
     */
    public void handlePacket(Player p, int packetId, int packetSize) {
        p.frames.removeShownInterface(p);
        if (p == null || p.stream == null) {
            return;
        }
        if (packetId == 119) {
            packetSize -= 14;
        }
        Engine.playerMovement.resetWalkingQueue(p);
        int numPath = (packetSize - 5) / 2;
        p.usingAutoCast = false;
        int[] pathX = new int[numPath];
        int[] pathY = new int[numPath];
        int firstX = p.stream.readUnsignedWordBigEndianA()
                - (p.mapRegionX - 6) * 8;
        int firstY = p.stream.readUnsignedWordA() - (p.mapRegionY - 6) * 8;

        p.stream.readSignedByteC();
        for (int i = 0; i < numPath; i++) {
            pathX[i] = p.stream.readSignedByte();
            pathY[i] = p.stream.readSignedByteS();
        }
        Engine.playerMovement.addToWalkingQueue(p, firstX, firstY);
        for (int i = 0; i < numPath; i++) {
            pathX[i] += firstX;
            pathY[i] += firstY;
            Engine.playerMovement.addToWalkingQueue(p, pathX[i], pathY[i]);
        }
        p.itemPickup = false;
        p.playerOption1 = false;
        p.playerOption2 = false;
        p.playerOption3 = false;
        p.npcOption1 = false;
        p.npcOption2 = false;
        p.objectOption1 = false;
        p.objectOption2 = false;
        p.attackingPlayer = false;
        p.attackingNPC = false;
        if (p.freezeDelay > 0) {
            p.frames.sendMessage(p, "You cant move! Your frozen!");
        }
        p.frames.removeShownInterface(p);
        p.frames.restoreTabs(p);
        p.frames.restoreInventory(p);
        p.frames.removeChatboxInterface(p);
        if (p.faceToReq != 65535) {
            p.requestFaceTo(65535);
        }
    }
}
