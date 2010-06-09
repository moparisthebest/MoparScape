package DavidScape.io.packets;


import DavidScape.Engine;
import DavidScape.npcs.NPC;
import DavidScape.players.Player;
import DavidScape.players.items.PlayerItems;
import DavidScape.util.Misc;

public class NPCOption1 implements Packet {


    public PlayerItems pi = Engine.playerItems;
    public Player p;

    public int logs[] = new int[28];

    public void GetSkillCape(Player p, int Dialogue, int Npc, String Name, String Skill) {
        p.Dialogue = Dialogue;
        p.frames.showChatboxInterface(p, 241);
        p.frames.animateInterfaceId(p, 9850, 241, 2);
        p.frames.setNPCId(p, Npc, 241, 2);
        p.frames.setString(p, Name, 241, 3);
        p.frames.setString(p, "Aha! it seems you are a master of " + Skill + "...", 241, 4);
    }


    public void OnlyLevel(Player p, int Dialogue, int Npc, String Name, int Skill, String Nskill) {
        p.Dialogue = Dialogue;
        p.frames.showChatboxInterface(p, 241);
        p.frames.animateInterfaceId(p, 9845, 241, 2);
        p.frames.setNPCId(p, Npc, 241, 2);
        p.frames.setString(p, Name, 241, 3);
        p.frames.setString(p, "Your " + Nskill + " level is only level " + p.skillLvl[Skill] + ". You should..", 241, 4);
    }

    /**
     * Handles the first NPC option.
     *
     * @param p The Player which the frame should be handled for.
     * @param packetId The packet id this belongs to.
     * @param packetSize The amount of bytes being recieved for this packet.
     */
    public NPC n;

    public void handlePacket(Player p, int packetId, int packetSize) {
        if (p == null || p.stream == null) {
            return;
        }
        pi = Engine.playerItems;
        p.frames.removeShownInterface(p);
        if (!p.npcOption1) {
            int npcId = p.stream.readUnsignedWordA();
            p.requestFaceTo(npcId);
            p.wc.resetWoodcutting();
            p.mi.resetMining();
            if (npcId <= 0 || npcId >= Engine.npcs.length
                    || Engine.npcs[npcId] == null) {
                return;
            }
            p.clickId = npcId;


            p.clickX = Engine.npcs[npcId].absX;
            p.clickY = Engine.npcs[npcId].absY;
            if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 30) {
                return;
            }
            p.npcOption1 = true;
        }
        if (p.clickId <= 0 || p.clickId >= Engine.npcs.length
                || Engine.npcs[p.clickId] == null) {
            p.npcOption1 = false;
            return;
        }
        if (Misc.getDistance(p.absX, p.absY, p.clickX, p.clickY) > 1) {
            return;
        }
        p.npcOption1 = false;

        NPC pnp = Engine.npcs[p.clickId];
        NPC np = Engine.npcs[p.FamiliarID];
        if ((pnp.npcType == 13) || (pnp.npcType == 14) || (pnp.npcType == 15)) {
            p.openBank();
        }
        if (pnp.npcType == 804) {
            boolean hasHide = false;
            for (int i = 0; i < p.items.length; i++) {
                if (p == null) {
                    continue;
                }
                switch (p.items[i]) {
                    case 1747:
                        pi.deleteItem(p, 1747, 1);
                        pi.addItem(p, 2509, 1);
                        hasHide = true;
                        break;
                    case 1749:
                        pi.deleteItem(p, 1749, 1);
                        pi.addItem(p, 2507, 1);
                        hasHide = true;
                        break;
                    case 1751:
                        pi.deleteItem(p, 1751, 1);
                        pi.addItem(p, 2505, 1);
                        hasHide = true;
                        break;
                    case 1753:
                        pi.deleteItem(p, 1753, 1);
                        pi.addItem(p, 1745, 1);
                        hasHide = true;
                        break;
                    default:
                        break;
                }
            }
        }
        if (pnp.npcType == 1835) {
            if ((p.rights >= 1) || (p.member > 0)) {
                Engine.shopHandler.openshop(p, 14);
                p.shopid = 14;
            } else {
                p.frames.showChatboxInterface(p, 241);
                p.frames.setNPCId(p, 1835, 241, 2);
                p.frames.setString(p, "Easter Bunny", 241, 3);
                p.frames.setString(p, "You can't buy here! Your not a member!", 241, 4);
            }
        }
        if (pnp.npcType == 5029) {
            if (p.rewards < 1) {
                p.frames.sendMessage(p, "You don't have any reward points! You must beat all five waves!");
                return;
            } else {
                int randrew[] = {10547, 10548, 10549, 10550, 10551, 10552, 10553, 10554, 10555};
                int ia = randrew[Misc.random(randrew.length - 1)];
                Engine.playerItems.addItem(p, ia, 1);
                Engine.playerItems.addItem(p, 995, Misc.random(500));
                p.rewards--;
                p.frames.sendMessage(p, "You now have " + p.rewards + " reward(s) left.");
            }
        }


        if (pnp.npcType == 4947) {
            Engine.shopHandler.openshop(p, 16);
            p.shopid = 16;
        }
        if (pnp.npcType == 1513) {
            Engine.shopHandler.openshop(p, 18);
            p.shopid = 18;
        }
        if (pnp.npcType == 522) {
            if (p.rights > 1) {
                p.frames.sendMessage(p, "Admins can't sell to that shop!");
                return;
            }
            Engine.shopHandler.openshop(p, 1);
            p.shopid = 1;
        }
        if (pnp.npcType == 1569) {
            if (p.rights > 0) {
                Engine.shopHandler.openshop(p, 13);
                p.shopid = 13;
            } else if (p.rights <= 0) {
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9785, 241, 2);
                p.frames.setNPCId(p, 1569, 241, 2);
                p.frames.setString(p, "Veliaf Hurtz", 241, 3);
                p.teleportTo(3222, 3219, 0, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                p.frames.setString(p, "What are you doing up here! Your not staff!", 241, 4);
            }
        }
        if (pnp.npcType == 2253)//Wise Old Man
        {
            if (p.QuestPoints < 2) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9827, 241, 2);
                p.frames.setNPCId(p, 2567, 241, 2);
                p.frames.setString(p, "Wise Old Man", 241, 3);
                p.frames.setString(p, "Ehh, you haven't completed all DavidScape Quests...", 241, 4);
            } else {
                p.Dialogue = 111;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 2567, 241, 2);
                p.frames.setString(p, "Wise Old Man", 241, 3);
                p.frames.setString(p, "Looks like you completed all the quests...", 241, 4);
            }


        }

        if (pnp.npcType == 198)//GuildMaster
        {

            if (p.DragonSlayer == 0) {
                p.Dialogue = 100;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 198, 241, 2);
                p.frames.setString(p, "Guildmaster", 241, 3);
                p.frames.setString(p, "Looking for a quest are you?", 241, 4);
            }
            if (p.DragonSlayer == 1) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 198, 241, 2);
                p.frames.setString(p, "Guildmaster", 241, 3);
                p.frames.setString(p, "Go speak to Oziach in Edgeville...", 241, 4);
            }
            if (p.DragonSlayer == 2) {
                p.Dialogue = 102;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 198, 241, 2);
                p.frames.setString(p, "Guildmaster", 241, 3);
                p.frames.setString(p, "Ah yes, the dragon of Crandor Island...", 241, 4);
            }
            if (p.DragonSlayer == 3) {
                p.frames.setString(p, "How can I find a route to Crandor?", 458, 1);
                p.frames.setString(p, "Where can I find the right ship?", 458, 2);
                p.frames.setString(p, "How can I protect myself from the dragon's breath?", 458, 3);
                p.frames.showChatboxInterface(p, 458);
                p.Smithing = false;
                p.Cooking = false;
                p.TalkAgent = false;
                p.DecorChange = false;
                p.Choice = 1;
            }

            if (p.DragonSlayer == 4) {
                Engine.playerItems.deleteItem(p, 11279, Engine.playerItems.getItemSlot(p, 11279), 28);
                p.Dialogue = 110;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 198, 241, 2);
                p.frames.setString(p, "Guildmaster", 241, 3);
                p.frames.setString(p, "Wow you slayed Elvarg! Accept this reward.", 241, 4);
            }

            if (p.DragonSlayer == 5) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 198, 241, 2);
                p.frames.setString(p, "Guildmaster", 241, 3);
                p.frames.setString(p, "Hello...", 241, 4);
            }
        }


        if (pnp.npcType == 819)//Frank
        {
            p.Dialogue = 0;
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9785, 241, 2);
            p.frames.setNPCId(p, 819, 241, 2);
            p.frames.setString(p, "Frank", 241, 3);
            p.frames.setString(p, "Verify your account so you can play and do commands!", 241, 4);
            p.frames.sendMessage(p, "Your code is: " + p.verificationCode);
        }

        if (pnp.npcType == 0)//Hans
        {
            p.Dialogue = 0;
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 0, 241, 2);
            p.frames.setString(p, "Welcome to DavidScape", 241, 3);
            p.frames.setString(p, "Type ::help or ::commands for more info!", 241, 4);
        }

        if (pnp.npcType == 3)//Hans
        {
            p.Dialogue = 0;
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 0, 241, 3);
            p.frames.setString(p, "Person", 241, 3);
            p.frames.setString(p, "Please don't attack or steal from me!", 241, 4);
        }
        if (pnp.npcType == 2)//Man
        {
            p.Dialogue = 0;
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 0, 241, 2);
            p.frames.setString(p, "Person", 241, 3);
            p.frames.setString(p, "Please don't attack or steal from me!", 241, 4);
        }
        if (pnp.npcType == 1)//Man
        {
            p.Dialogue = 0;
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 0, 241, 1);
            p.frames.setString(p, "Person", 241, 3);
            p.frames.setString(p, "Please don't attack or steal from me!", 241, 4);
        }


        if (pnp.npcType == 747)//Oziach
        {

            if (p.DragonSlayer == 0) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9785, 241, 2);
                p.frames.setNPCId(p, 747, 241, 2);
                p.frames.setString(p, "Oziach", 241, 3);
                p.frames.setString(p, "What are you looking at noob?", 241, 4);
            }

            if (p.DragonSlayer == 1) {
                p.Dialogue = 105;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9827, 241, 2);
                p.frames.setNPCId(p, 747, 241, 2);
                p.frames.setString(p, "Oziach", 241, 3);
                p.frames.setString(p, "The guild master sent you right...", 241, 4);
            }

            if (p.DragonSlayer == 2) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 747, 241, 2);
                p.frames.setString(p, "Oziach", 241, 3);
                p.frames.setString(p, "Go speak to the guildmaster for help.", 241, 4);
            }

            if (p.DragonSlayer > 2 && p.DragonSlayer < 4) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9785, 241, 2);
                p.frames.setNPCId(p, 747, 241, 2);
                p.frames.setString(p, "Oziach", 241, 3);
                p.frames.setString(p, "You haven't killed Elvarg yet noob!", 241, 4);
            }

            if (p.DragonSlayer == 4) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9827, 241, 2);
                p.frames.setNPCId(p, 747, 241, 2);
                p.frames.setString(p, "Oziach", 241, 3);
                p.frames.setString(p, "Wow, you killed Elvarg? Go tell the Guildmaster!", 241, 4);
            }
            if (p.DragonSlayer == 5) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 747, 241, 2);
                p.frames.setString(p, "Oziach", 241, 3);
                p.frames.setString(p, "Good job killing that dragon.", 241, 4);
            }
        }


        if (pnp.npcType == 746) {
            if (p.DragonSlayer < 3) {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9785, 241, 2);
                p.frames.setNPCId(p, 746, 241, 2);
                p.frames.setString(p, "Oracle", 241, 3);
                p.frames.setString(p, "You should not be wandering around...", 241, 4);
            } else {
                p.Dialogue = 108;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9827, 241, 2);
                p.frames.setNPCId(p, 746, 241, 2);
                p.frames.setString(p, "Oracle", 241, 3);
                p.frames.setString(p, "You are looking for a map to crandor?", 241, 4);
            }

        }


        if (pnp.npcType == 741) {
            p.Dialogue = 0;
            Engine.playerItems.addItem(p, 1540, 1);
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 741, 241, 2);
            p.frames.setString(p, "Duke", 241, 3);
            p.frames.setString(p, "Take this anti-dragon shield...", 241, 4);
        }


        if (pnp.npcType == 744) {
            if (p.DragonSlayer > 2) {
                p.Dialogue = 0;
                p.frames.setString(p, "Can you sail me to crandor Island?", 458, 1);
                p.frames.setString(p, "Do you like dragons?", 458, 2);
                p.frames.setString(p, "Never mind....", 458, 3);
                p.frames.showChatboxInterface(p, 458);
                p.Smithing = false;
                p.Cooking = false;
                p.TalkAgent = false;
                p.DecorChange = false;
                p.Choice = 2;
            } else {
                p.Dialogue = 0;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9827, 241, 2);
                p.frames.setNPCId(p, 744, 241, 2);
                p.frames.setString(p, "Klarense", 241, 3);
                p.frames.setString(p, "Sorry mate, I'm busy.", 241, 4);
            }
        }


        if (pnp.npcType == 6901) {
            if (np != null) {
                if (p.FamiliarID != p.clickId) {
                    p.frames.sendMessage(p, "This is not your dragon.");
                } else {
                    p.requestAnim(827, 0);
                    p.FamiliarType = 0;
                    np.isDead = true;
                    p.FamiliarID = 0;
                    p.frames.sendMessage(p, "You pick up the dragon.");
                    Engine.playerItems.addItem(p, 12469, 1);
                    p.frames.setTab(p, 80, 18);
                }
            }
        }
        if (pnp.npcType == 6943) {
            if (np != null) {
                if (p.FamiliarID != p.clickId) {
                    p.frames.sendMessage(p, "This is not your monkey.");
                } else {
                    p.requestAnim(827, 0);
                    p.FamiliarType = 0;
                    np.isDead = true;
                    p.FamiliarID = 0;
                    p.frames.sendMessage(p, "You pick up the cute little monkey.");
                    Engine.playerItems.addItem(p, 8942, 1);
                    p.frames.setTab(p, 80, 18);
                }
            }
        }

        if (pnp.npcType == 6903) {
            if (np != null) {
                if (p.FamiliarID != p.clickId) {
                    p.frames.sendMessage(p, "This is not your dragon.");
                } else {
                    p.requestAnim(827, 0);
                    p.FamiliarType = 0;
                    np.isDead = true;
                    p.FamiliarID = 0;
                    p.frames.sendMessage(p, "You pick up the dragon.");
                    Engine.playerItems.addItem(p, 12471, 1);
                    p.frames.setTab(p, 80, 18);
                }
            }
        }

        if (pnp.npcType == 6905) {
            if (np != null) {
                if (p.FamiliarID != p.clickId) {
                    p.frames.sendMessage(p, "This is not your dragon.");
                } else {
                    p.requestAnim(827, 0);
                    p.FamiliarType = 0;
                    np.isDead = true;
                    p.FamiliarID = 0;
                    p.frames.sendMessage(p, "You pick up the dragon.");
                    Engine.playerItems.addItem(p, 12473, 1);
                    p.frames.setTab(p, 80, 18);
                }
            }
        }
        if (pnp.npcType == 6907) {
            if (np != null) {
                if (p.FamiliarID != p.clickId) {
                    p.frames.sendMessage(p, "This is not your dragon.");
                } else {
                    p.requestAnim(827, 0);
                    p.FamiliarType = 0;
                    np.isDead = true;
                    p.FamiliarID = 0;
                    p.frames.sendMessage(p, "You pick up the dragon.");
                    Engine.playerItems.addItem(p, 12475, 1);
                    p.frames.setTab(p, 80, 18);
                }
            }
        }

        if (pnp.npcType == 6970) {
            if (p.skillLvl[23] > 119) {
                GetSkillCape(p, 54, 6970, "Pikkupstix", "Summoning");
            } else {
                OnlyLevel(p, 55, 6970, "Pikkupstix", 23, "Summoning");
            }
        }


        if (pnp.npcType == 6064) {
            if (p.skillLvl[21] >= 83) {
                if (p.equipment[3] != 11259) {
                    p.frames.sendMessage(p, "You need to be wielding a net to catch this with.");
                } else {
                    Engine.npcs[p.clickId].isDead = true;
                    Engine.npcs[p.clickId].absX = 1;
                    Engine.npcs[p.clickId].absY = 1;
                    p.frames.sendMessage(p, "You catch the dragon impling!");
                    p.addSkillXP(1250 * p.skillLvl[21], 21);
                    Engine.playerItems.addItem(p, 11256, 1);
                    p.requestAnim(5209, 0);

                }
            } else {
                p.frames.sendMessage(p, "You need level 83 Hunting to catch this.");
            }
        }

        if (pnp.npcType == 6063) {
            if (p.skillLvl[21] >= 70) {
                if (p.equipment[3] != 11259) {
                    p.frames.sendMessage(p, "You need to be wielding a net to catch this with.");
                } else {
                    Engine.npcs[p.clickId].isDead = true;
                    Engine.npcs[p.clickId].absX = 1;
                    Engine.npcs[p.clickId].absY = 1;
                    p.frames.sendMessage(p, "You catch the ninja impling!");
                    p.addSkillXP(800 * p.skillLvl[21], 21);
                    Engine.playerItems.addItem(p, 11254, 1);
                    p.requestAnim(5209, 0);

                }
            } else {
                p.frames.sendMessage(p, "You need level 70 Hunting to catch this.");
            }
        }

        if (pnp.npcType == 6062) {
            if (p.skillLvl[21] >= 60) {
                if (p.equipment[3] != 11259) {
                    p.frames.sendMessage(p, "You need to be wielding a net to catch this with.");
                } else {
                    Engine.npcs[p.clickId].isDead = true;
                    Engine.npcs[p.clickId].absX = 1;
                    Engine.npcs[p.clickId].absY = 1;
                    p.frames.sendMessage(p, "You catch the magpie impling!");
                    p.addSkillXP(600 * p.skillLvl[21], 21);
                    Engine.playerItems.addItem(p, 11252, 1);
                    p.requestAnim(5209, 0);

                }
            } else {
                p.frames.sendMessage(p, "You need level 60 Hunting to catch this.");
            }
        }

        if (pnp.npcType == 6056) {
            if (p.skillLvl[21] >= 40) {
                if (p.equipment[3] != 11259) {
                    p.frames.sendMessage(p, "You need to be wielding a net to catch this with.");
                } else {
                    Engine.npcs[p.clickId].isDead = true;
                    Engine.npcs[p.clickId].absX = 1;
                    Engine.npcs[p.clickId].absY = 1;
                    p.frames.sendMessage(p, "You catch the young impling!");
                    p.addSkillXP(300 * p.skillLvl[21], 21);
                    Engine.playerItems.addItem(p, 11240, 1);
                    p.requestAnim(5209, 0);

                }
            } else {
                p.frames.sendMessage(p, "You need level 40 Hunting to catch this.");
            }
        }


        if (pnp.npcType == 6055) {
            if (p.skillLvl[21] >= 1) {
                if (p.equipment[3] != 11259) {
                    p.frames.sendMessage(p, "You need to be wielding a net to catch this with.");
                } else {
                    Engine.npcs[p.clickId].isDead = true;
                    Engine.npcs[p.clickId].absX = 1;
                    Engine.npcs[p.clickId].absY = 1;
                    p.frames.sendMessage(p, "You catch the baby impling!");
                    p.addSkillXP(125 * p.skillLvl[21], 21);
                    Engine.playerItems.addItem(p, 11238, 1);
                    p.requestAnim(5209, 0);
                }
            } else {
                p.frames.sendMessage(p, "You need level 1 Hunting to catch this.");
            }
        }

        if (pnp.npcType == 1552) {
            Engine.shopHandler.openshop(p, 9);
            p.shopid = 9;
        }

        if (pnp.npcType == 3299) {
            if (p.skillLvl[19] < 120) {
                p.Dialogue = 50;
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 3299, 241, 2);
                p.frames.setString(p, "Master Gardener", 241, 3);
                p.frames.setString(p, "Oh good you are here...", 241, 4);
            } else {
                GetSkillCape(p, 51, 3299, "Master Gardener", "Farming");
            }
        }
        if (pnp.npcType == 548) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9827, 241, 2);
            p.frames.setNPCId(p, 548, 241, 2);
            p.frames.setString(p, "Thessalia", 241, 3);
            p.frames.setString(p, "I wonder why every one is poor these days...", 241, 4);
        }
        if (pnp.npcType == 598) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9820, 241, 2);
            p.frames.setNPCId(p, 598, 241, 2);
            p.frames.setString(p, "Hairdresser", 241, 3);
            p.frames.setString(p, "Eww..you have emo hair....", 241, 4);
        }
        if (pnp.npcType == 521) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 521, 241, 2);
            p.frames.setString(p, "Shop assistant", 241, 3);
            p.frames.setString(p, "Hey, I sell some good stuplies and weapons.", 241, 4);
        }

        if (pnp.npcType == 8023) {
            if (p.rights >= 1) {
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 521, 241, 2);
                p.frames.setString(p, "Yellow Orb", 241, 3);
                p.frames.setString(p, "Want some runes? Here you go.", 241, 4);
                Engine.playerItems.addItem(p, 556, 300);
                Engine.playerItems.addItem(p, 555, 300);
                Engine.playerItems.addItem(p, 557, 300);
                Engine.playerItems.addItem(p, 554, 300);
                Engine.playerItems.addItem(p, 558, 300);
                Engine.playerItems.addItem(p, 566, 300);
                Engine.playerItems.addItem(p, 560, 300);
                Engine.playerItems.addItem(p, 565, 300);
                Engine.playerItems.addItem(p, 562, 300);
                Engine.playerItems.addItem(p, 563, 300);
                Engine.playerItems.addItem(p, 563, 300);
                Engine.playerItems.addItem(p, 564, 300);
                Engine.playerItems.addItem(p, 561, 300);
                Engine.playerItems.addItem(p, 559, 300);
            } else if (p.rights <= 0) {
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 8023, 241, 2);
                p.frames.setString(p, "Yellow Orb", 241, 3);
                p.teleportTo(3222, 3219, 0, 0, 0, 8939, 8941, 1576, 0, 1577, 0);
                p.frames.setString(p, "What are you doing up here! Your not staff!", 241, 4);
            }
        }
        if (pnp.npcType == 538) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 538, 241, 2);
            p.frames.setString(p, "Peksa", 241, 3);
            p.frames.setString(p, "You can get this armour for free at barrows!", 241, 4);
        }
        if (pnp.npcType == 549) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 549, 241, 2);
            p.frames.setString(p, "Horvik", 241, 3);
            p.frames.setString(p, "I got a ton of armour if you want to buy some.", 241, 4);
        }
        if (pnp.npcType == 6537) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 6537, 241, 2);
            p.frames.setString(p, "Madrith", 241, 3);
            p.frames.setString(p, "Don't forget you can get better items by killing monsters!", 241, 4);
            Engine.shopHandler.openshop(p, 4);
            p.shopid = 4;
        }
        if (pnp.npcType == 4900) {
            Engine.shopHandler.openshop(p, 7);
            p.shopid = 7;
        }
        if (pnp.npcType == 316) {
//Net Shrimps
            if (p.ActionTimer == 0) {
                if (p.skillLvl[10] >= 1) {
                    if (Engine.playerItems.HasItemAmount(p, 305, 1) == true) {

                        p.FishXP = 25;
                        p.ActionTimer = 3;
                        p.FishGet = 317;
                        p.FishEmote = 620;
                        p.FishThat(p, p.FishXP, p.FishGet, p.FishEmote);
                    } else {
                        p.frames.sendMessage(p, "You need a big fishing net to fish here.");
                    }
                } else {
                    p.frames.sendMessage(p, "You need level 1 fishing to fish here.");
                }
            }
        }

        if (pnp.npcType == 313) {
//Net Bass
            if (p.ActionTimer == 0) {
                if (p.skillLvl[10] > 29) {
                    if (Engine.playerItems.HasItemAmount(p, 305, 1) == true) {
                        p.FishXP = 45;
                        p.ActionTimer = 3;
                        p.FishGet = 363;
                        p.FishEmote = 620;
                        p.FishThat(p, p.FishXP, p.FishGet, p.FishEmote);
                    } else {
                        p.frames.sendMessage(p, "You need a big fishing net to fish here.");
                    }
                } else {
                    p.frames.sendMessage(p, "You need level 30 fishing to fish here.");
                }
            }
        }


        if (pnp.npcType == 312) {
//Cage Lobsters
            if (p.ActionTimer == 0) {
                if (p.skillLvl[10] > 39) {
                    if (Engine.playerItems.HasItemAmount(p, 301, 1) == true) {
                        p.FishXP = 90;
                        p.ActionTimer = 3;
                        p.FishGet = 377;
                        p.FishEmote = 619;
                        p.FishThat(p, p.FishXP, p.FishGet, p.FishEmote);
                    } else {
                        p.frames.sendMessage(p, "You need a lobster pot to fish here.");
                    }
                } else {
                    p.frames.sendMessage(p, "You need level 40 fishing to fish here.");
                }
            }
        }
        if (pnp.npcType == 495) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9827, 241, 2);
            p.frames.setNPCId(p, 495, 241, 2);
            p.frames.setString(p, "Banker", 241, 3);
            p.frames.setString(p, "Hello there, you can bank by selecting the bank option.", 241, 4);
        }

        if (pnp.npcType == 2270) {
            if (p.skillLvl[17] > 119) {
                GetSkillCape(p, 1, 2270, "Martin Thwait", "Thieving");
            } else {
                OnlyLevel(p, 2, 2270, "Martin Thwait", 17, "Thieving");
            }
        }
        if (pnp.npcType == 437) {
            if (p.skillLvl[16] > 119) {
                GetSkillCape(p, 32, 437, "Cap'n Izzy No-Beard", "Agility");
            } else {
                OnlyLevel(p, 33, 437, "Cap'n Izzy No-Beard", 16, "Agility");
            }
        }

        if (pnp.npcType == 455) {
            if (p.skillLvl[15] > 119) {
                GetSkillCape(p, 36, 455, "Kaqemeex", "Herblore");
            } else {
                if (Engine.playerItems.HasItemAmount(p, 249, 1) || Engine.playerItems.HasItemAmount(p, 257, 1)) {
                    p.Dialogue = 37;
                    Engine.playerItems.deleteItem(p, 249, Engine.playerItems.getItemSlot(p, 249), 28);
                    Engine.playerItems.deleteItem(p, 257, Engine.playerItems.getItemSlot(p, 257), 28);
                    p.frames.showChatboxInterface(p, 241);
                    p.frames.animateInterfaceId(p, 9850, 241, 2);
                    p.frames.setNPCId(p, 455, 241, 2);
                    p.frames.setString(p, "Kaqemeex", 241, 3);
                    p.frames.setString(p, "Let me take those cleaned herbs from you...", 241, 4);
                } else {
                    OnlyLevel(p, 37, 455, "Kaqemeex", 15, "Herblore");
                }
            }
        }
        if (pnp.npcType == 5113) {
            if (p.skillLvl[21] > 119) {
                GetSkillCape(p, 38, 5113, "Hunting Expert", "Hunting");
            } else {
                OnlyLevel(p, 39, 5113, "Hunting Expert", 21, "Hunting");
            }
        }
        if (pnp.npcType == 847) {
            if (p.skillLvl[7] > 119) {
                GetSkillCape(p, 40, 847, "Head Chef", "Cooking");
            } else {
                OnlyLevel(p, 41, 847, "Head Chef", 7, "Cooking");
            }
        }
        if (pnp.npcType == 604) {
            if (p.skillLvl[13] > 119) {
                GetSkillCape(p, 42, 604, "Thurgo", "Smithing");
            } else {
                OnlyLevel(p, 43, 604, "Thurgo", 13, "Smithing");
            }
        }
        if (pnp.npcType == 1658) {
            if (p.skillLvl[6] > 119) {
                GetSkillCape(p, 3, 1658, "Robe Store Owner", "Magic");
            } else {
                OnlyLevel(p, 4, 1658, "Robe Store Owner", 6, "Magic");
            }
        }
        if (pnp.npcType == 802) {
            if (p.skillLvl[5] > 119) {
                GetSkillCape(p, 19, 802, "Brother Jered", "Prayer");
            } else {
                OnlyLevel(p, 20, 802, "Brother Jered", 5, "Prayer");
            }
        }

        if (pnp.npcType == 4906) {
            if (Engine.playerItems.HasItemAmount(p, 1511, 1) == true) {
                Engine.playerItems.addItem(p, 995, 8);
                Engine.playerItems.deleteItem(p, 1511, Engine.playerItems.getItemSlot(p, 1511), 1);
                p.frames.showChatboxInterface(p, 241);
                p.frames.animateInterfaceId(p, 9850, 241, 2);
                p.frames.setNPCId(p, 4906, 241, 2);
                p.frames.setString(p, "Woodcutting Tutor", 241, 3);
                p.frames.setString(p, "Thank you for the logs!", 241, 4);
            } else if (p.skillLvl[8] > 119) {
                GetSkillCape(p, 15, 4906, "Woodcutting Tutor", "Woodcutting");
            } else {
                OnlyLevel(p, 16, 4906, "Woodcutting Tutor", 8, "Woodcutting");
            }

        }

        if (pnp.npcType == 805) {
            if (p.skillLvl[12] > 119) {
                GetSkillCape(p, 34, 805, "Master Crafter", "Crafting");
            } else {
                OnlyLevel(p, 35, 805, "Master Crafter", 12, "Crafting");
            }
        }

        if (pnp.npcType == 553) {
            if (p.skillLvl[20] > 119) {
                GetSkillCape(p, 21, 553, "Aubury", "Runecrafting");
            } else {
                OnlyLevel(p, 22, 553, "Aubury", 20, "Runecrafting");
            }
        }
        if (pnp.npcType == 4946) {
            if (p.skillLvl[11] > 119) {
                GetSkillCape(p, 26, 4946, "Ignatius Vulcan", "Firemaking");
            } else {
                OnlyLevel(p, 27, 4946, "Ignatius Vulcan", 11, "Firemaking");
            }
        }

        if (pnp.npcType == 308) {
            if (p.skillLvl[10] > 119) {
                GetSkillCape(p, 13, 308, "Master Fisher", "Fishing");
            } else {
                OnlyLevel(p, 14, 308, "Master Fisher", 10, "Fishing");
            }
        }

        if (pnp.npcType == 3295) {
            if (p.skillLvl[14] > 119) {
                GetSkillCape(p, 17, 3295, "Dwarf", "Mining");
            } else {
                OnlyLevel(p, 18, 3295, "Dwarf", 14, "Mining");
            }
        }
        if (pnp.npcType == 575) {
            if (p.skillLvl[9] > 119) {
                GetSkillCape(p, 28, 575, "Hickton", "Fletching");
            } else {
                OnlyLevel(p, 29, 575, "Hickton", 9, "Fletching");
            }
        }

        if (pnp.npcType == 7950) {
            if (p.skillLvl[1] > 119) {
                GetSkillCape(p, 5, 7950, "Melee Tutor", "Defence");
            } else {
                OnlyLevel(p, 6, 7950, "Melee Tutor", 1, "Defence");
            }
        }


        if (pnp.npcType == 1599) {
            p.Smithing = false;
            p.Cooking = false;
            p.TalkAgent = false;
            p.DecorChange = false;

            p.frames.setString(p, "Slayer Cape", 458, 1);
            p.frames.setString(p, "New Slayer Task", 458, 2);
            p.frames.setString(p, "Teleport to Dragon Dungeon", 458, 3);
            p.frames.showChatboxInterface(p, 458);
        }


        if (pnp.npcType == 4247) {
            p.Smithing = false;
            p.Cooking = false;
            p.TalkAgent = true;
            p.DecorChange = false;
            p.frames.setString(p, "Construction Cape", 458, 1);
            p.frames.setString(p, "How do I go in my friends house?", 458, 2);
            p.frames.setString(p, "Buy new house decoration", 458, 3);
            p.frames.showChatboxInterface(p, 458);
        }

        if (pnp.npcType == 4288) {
            if (p.skillLvl[0] > 119) {
                GetSkillCape(p, 7, 4288, "Ajjat", "Attack");
            } else {
                OnlyLevel(p, 8, 4288, "Ajjat", 0, "Attack");
            }
        }

        if (pnp.npcType == 4297) {
            if (p.skillLvl[2] > 119) {
                GetSkillCape(p, 9, 4297, "Sloane", "Strength");
            } else {
                OnlyLevel(p, 10, 4297, "Sloane", 2, "Strength");
            }
        }

        if (pnp.npcType == 961) {
            if (p.skillLvl[3] > 119) {
                GetSkillCape(p, 11, 961, "Surgeon General Tafani", "Hitpoints");
            } else {
                OnlyLevel(p, 12, 961, "Surgeon General Tafani", 3, "Hitpoints");
            }
        }


        if (pnp.npcType == 682) {
            if (p.skillLvl[4] > 119) {
                GetSkillCape(p, 23, 682, "Armour salesman", "Range");
            } else {
                OnlyLevel(p, 24, 682, "Armour salesman", 4, "Range");
            }
        }

        if (pnp.npcType == 1861) {
            p.Dialogue = 25;
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9760, 241, 2);
            p.frames.setNPCId(p, 1861, 241, 2);
            p.frames.setString(p, "Range Tutor", 241, 3);
            p.frames.setString(p, "All you have to do is claim supplies from me...", 241, 4);
        }


        if (pnp.npcType == 494) {
            p.frames.showChatboxInterface(p, 241);
            p.frames.animateInterfaceId(p, 9850, 241, 2);
            p.frames.setNPCId(p, 494, 241, 2);
            p.frames.setString(p, "Banker", 241, 3);
            p.frames.setString(p, "Hello there, you can bank by selecting the bank option.", 241, 4);
}

      
    }
}
