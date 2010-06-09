package DavidScape.io;


import DavidScape.Engine;
import DavidScape.players.Player;


public class Packets extends PacketManager {

    /**
     * Stores every packet size.
     */
    public byte[] packetSizes = new byte[256];

    /**
     * Constructs a new Packets class.
     */
    public Packets() {
        setPacketSizes();
    }

    /**
     * Process incoming bytes.
     * <p>This checks for incoming bytes from a players client, and reads them.
     * If the server successfully recieves any bytes, it will loop again,
     * up until no more bytes are available or it has recieved ten packets.
     */
    public void parseIncomingPackets() {
        int avail = 0;
        int packetId = 0;
        int packetSize = 0;

        for (Player p : Engine.players) {
            if (p == null || !p.online || p.disconnected[0]) {
                continue;
            }
            try {
                for (int i = 0; i < 10; i++) {
                    avail = p.socket.avail();
                    if (avail < 1) {

                        /*
                         * Stop checking for packets if there are no bytes to read.
                         */
                        break;
                    }
                    packetId = p.socket.read() & 0xff;
                    avail--;
                    if (packetId < 0 || packetId > 255) {

                        /*
                         * Invalid packet id.
                         */
                        break;
                    }
                    packetSize = (int) packetSizes[packetId];
                    if (packetSize == -1) {

                        /*
                         * If the packet size is set to -1, then the packet size will be sent from the client.
                         */
                        if (avail > 0) {
                            packetSize = p.socket.read() & 0xff;
                            avail--;
                        } else {
                            break;
                        }
                    } else if (packetSize == -3) {

                        /*
                         * Packet size not set, take a guess based on how many bytes are incoming.
                         */
                        packetSize = avail;
                    }
                    if (packetSize > avail) {

                        /*
                         * There are less available bytes that the packet's size wants to request.
                         */
                        break;
                    }
                    if (packetSize >= 500) {

                        /*
                         * No packets exceed 500 bytes, this would be caused by a crasher 
                         * or invalid packet size server side.
                         */
                        break;
                    }
                    p.stream.inOffset = 0;
                    p.socket.read(packetSize);
                    parsePacket(p, packetId, packetSize);
                }
            } catch (Exception e) {
                p.disconnected[0] = true;
            }
        }
    }

    /**
     * Set all the packet sizes.
     * <p>Sets every packet size, -3 stands for a packet that doesn't exist or
     * is undocumented. -1 tells the server the size is going to be sent from
     * the client.
     */
    public void setPacketSizes() {

        /*
         * If the packet size is -3 it is either undocumented or unused id.
         */
        packetSizes[0] = -3;
        packetSizes[1] = -3;
        packetSizes[2] = 8;
        packetSizes[3] = 8; // Item equipping.
        packetSizes[4] = -3;
        packetSizes[5] = -3;
        packetSizes[6] = -3;
        packetSizes[7] = 2; // First NPC option.
        packetSizes[8] = -3;
        packetSizes[9] = -3;
        packetSizes[10] = -3;
        packetSizes[11] = -3;
        packetSizes[12] = -3;
        packetSizes[13] = -3;
        packetSizes[14] = -3;
        packetSizes[15] = -3;
        packetSizes[16] = -3;
        packetSizes[17] = -3;
        packetSizes[18] = -3;
        packetSizes[19] = -3;
        packetSizes[20] = -3;
        packetSizes[21] = 6; // Buttons.
        packetSizes[22] = 4; // Sent every time updateReq is set to true.
        packetSizes[23] = -3;
        packetSizes[24] = -3;
        packetSizes[25] = -3;
        packetSizes[26] = -3;
        packetSizes[27] = -3;
        packetSizes[28] = -3;
        packetSizes[29] = -3;
        packetSizes[30] = 8;
        packetSizes[31] = -3;
        packetSizes[32] = -3;
        packetSizes[33] = -3;
        packetSizes[34] = -3;
        packetSizes[35] = -3;
        packetSizes[36] = -3;
        packetSizes[37] = 2; // Second player option.
        packetSizes[38] = 2; // Item examine.
        packetSizes[39] = -3;
        packetSizes[40] = -3;
        packetSizes[41] = -3;
        packetSizes[42] = -3;
        packetSizes[43] = -3;
        packetSizes[44] = -3;
        packetSizes[45] = -3;
        packetSizes[46] = -3;
        packetSizes[47] = 0; // Idle packet.
        packetSizes[48] = -3;
        packetSizes[49] = -1; // Main walking packet.
        packetSizes[50] = -3;
        packetSizes[51] = -3;
        packetSizes[52] = 2; // Second NPC option.
        packetSizes[53] = -3;
        packetSizes[54] = -3;
        packetSizes[55] = -3;
        packetSizes[56] = -3;
        packetSizes[57] = -3;
        packetSizes[58] = -3;
        packetSizes[59] = 6; // Sent every time you click your mouse.
        packetSizes[60] = 0; // New map region has been entered.
        packetSizes[61] = 8;
        packetSizes[62] = -3;
        packetSizes[63] = -3;
        packetSizes[64] = -3;
        packetSizes[65] = -3;
        packetSizes[66] = -3;
        packetSizes[67] = -3;
        packetSizes[68] = -3;
        packetSizes[69] = -3;
        packetSizes[70] = 8; // Magic on players.
        packetSizes[71] = -3;
        packetSizes[72] = -3;
        packetSizes[73] = -3;
        packetSizes[74] = -3;
        packetSizes[75] = -3;
        packetSizes[76] = -3;
        packetSizes[77] = -3;
        packetSizes[78] = -3;
        packetSizes[79] = -3;
        packetSizes[80] = -3;
        packetSizes[81] = -3;
        packetSizes[82] = -3;
        packetSizes[83] = -3;
        packetSizes[84] = 2; // Object examining.
        packetSizes[85] = -3;
        packetSizes[86] = -3;
        packetSizes[87] = -3;
        packetSizes[88] = 2; // NPC examining.
        packetSizes[89] = -3;
        packetSizes[90] = -3;
        packetSizes[91] = -3;
        packetSizes[92] = -3;
        packetSizes[93] = -3;
        packetSizes[94] = -3;
        packetSizes[95] = -3;
        packetSizes[96] = -3;
        packetSizes[97] = -3;
        packetSizes[98] = -3;
        packetSizes[99] = 4; // Unknown.
        packetSizes[100] = -3;
        packetSizes[101] = -3;
        packetSizes[102] = -3;
        packetSizes[103] = -3;
        packetSizes[104] = -3;
        packetSizes[105] = -3;
        packetSizes[106] = -3;
        packetSizes[107] = -1; // Command packet.
        packetSizes[108] = 0; // Interface closing.
        packetSizes[109] = -3;
        packetSizes[110] = -3;
        packetSizes[111] = -3;
        packetSizes[112] = -3;
        packetSizes[113] = 4; // Interface buttons.
        packetSizes[114] = -3;
        packetSizes[115] = 0; // Ping packet, sends no bytes.
        packetSizes[116] = -3;
        packetSizes[117] = -1; // Sends a good few unknown bytes.
        packetSizes[118] = -3;
        packetSizes[119] = -1; // Minimap walking.
        packetSizes[120] = -3;
        packetSizes[121] = -3;
        packetSizes[122] = -3;
        packetSizes[123] = 2; // NPC attack option.
        packetSizes[124] = -3;
        packetSizes[125] = -3;
        packetSizes[126] = -3;
        packetSizes[127] = -3;
        packetSizes[128] = -3;
        packetSizes[129] = -3;
        packetSizes[130] = -3;
        packetSizes[131] = 7;
        packetSizes[132] = 8;
        packetSizes[133] = -3;
        packetSizes[134] = -3;
        packetSizes[135] = -3;
        packetSizes[136] = -3;
        packetSizes[137] = -3;
        packetSizes[138] = -1; // Other walk clicking, such as items on ground.
        packetSizes[139] = -3;
        packetSizes[140] = -3;
        packetSizes[141] = -3;
        packetSizes[142] = -3;
        packetSizes[143] = -3;
        packetSizes[144] = -3;
        packetSizes[145] = -3;
        packetSizes[146] = -3;
        packetSizes[147] = -3;
        packetSizes[148] = -3;
        packetSizes[149] = -3;
        packetSizes[150] = -3;
        packetSizes[151] = -3;
        packetSizes[152] = -3;
        packetSizes[153] = -3;
        packetSizes[154] = -3;
        packetSizes[155] = -3;
        packetSizes[156] = -3;
        packetSizes[157] = -3;
        packetSizes[158] = 6; // First object option.
        packetSizes[159] = -3;
        packetSizes[160] = 2; // First player option.
        packetSizes[161] = -3;
        packetSizes[162] = -3;
        packetSizes[163] = -3;
        packetSizes[164] = -3;
        packetSizes[165] = 4; // Settings buttons.
        packetSizes[166] = -3;
        packetSizes[167] = 9; // Switching items around in your inventory, banking, etc.
        packetSizes[168] = -3;
        packetSizes[169] = 6; // Buttons.
        packetSizes[170] = -3;
        packetSizes[171] = -3;
        packetSizes[172] = -3;
        packetSizes[173] = -3;
        packetSizes[174] = -3;
        packetSizes[175] = -3;
        packetSizes[176] = -3;
        packetSizes[177] = -3;
        packetSizes[178] = -1;
        packetSizes[179] = 12; // Item index switching.
        packetSizes[180] = -3;
        packetSizes[181] = -3;
        packetSizes[182] = -3;
        packetSizes[183] = -3;
        packetSizes[184] = -3;
        packetSizes[185] = -3;
        packetSizes[186] = 8; // Item operate.
        packetSizes[187] = -3;
        packetSizes[188] = -3;
        packetSizes[189] = -3;
        packetSizes[190] = -3;
        packetSizes[191] = -3;
        packetSizes[192] = -3;
        packetSizes[193] = -3;
        packetSizes[194] = -3;
        packetSizes[195] = -3;
        packetSizes[196] = -3;
        packetSizes[197] = -3;
        packetSizes[198] = -3;
        packetSizes[199] = -3;
        packetSizes[200] = -3;
        packetSizes[201] = 6; // Ground item picking up.
        packetSizes[202] = -3;
        packetSizes[203] = 8; // Item options 1.
        packetSizes[204] = -3;
        packetSizes[205] = -3;
        packetSizes[206] = -3;
        packetSizes[207] = -3;
        packetSizes[208] = -3;
        packetSizes[209] = -3;
        packetSizes[210] = -3;
        packetSizes[211] = 8; // Item dropping.
        packetSizes[212] = -3;
        packetSizes[213] = -3;
        packetSizes[214] = -3;
        packetSizes[215] = -3;
        packetSizes[216] = -3;
        packetSizes[217] = -3;
        packetSizes[218] = -3;
        packetSizes[219] = -3;
        packetSizes[220] = 8; // Item eating, drinking, etc.
        packetSizes[221] = -3;
        packetSizes[222] = -1; // Public chat text.
        packetSizes[223] = -3;
        packetSizes[224] = -3;
        packetSizes[225] = -3;
        packetSizes[226] = -3;
        packetSizes[227] = 2; // Third player option.
        packetSizes[228] = 6; // Second object option.
        packetSizes[229] = -3;
        packetSizes[230] = -3;
        packetSizes[231] = -3;
        packetSizes[232] = 6; // Buttons.
        packetSizes[233] = 6; // Buttons.
        packetSizes[234] = -3;
        packetSizes[235] = -3;
        packetSizes[236] = -3;
        packetSizes[237] = -3;
        packetSizes[238] = -3;
        packetSizes[239] = -3;
        packetSizes[240] = -3;
        packetSizes[241] = -3;
        packetSizes[242] = -3;
        packetSizes[243] = -3;
        packetSizes[244] = -3;
        packetSizes[245] = -3;
        packetSizes[246] = -3;
        packetSizes[247] = 4; // Unknown.
        packetSizes[248] = 1; // Unknown.
        packetSizes[249] = -3;
        packetSizes[250] = -3;
        packetSizes[251] = -3;
        packetSizes[252] = -3;
        packetSizes[253] = -3;
        packetSizes[254] = -3;
        packetSizes[255] = -3;
    }
}
