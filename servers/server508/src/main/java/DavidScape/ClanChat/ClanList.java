package DavidScape.ClanChat;

import DavidScape.Engine;
import DavidScape.Server;
import DavidScape.players.Player;
import DavidScape.util.Misc;

import java.util.ArrayList;
import java.util.List;

public class ClanList {

    public String Owner = "";
    public String clanName = "";
    public int joinReq = 0;
    public int talkReq = 0;
    public int kickReq = 7;
    public boolean lootShareOn = false;
    public List<Long> friends = new ArrayList<Long>(200);
    public List<String> rank1 = new ArrayList<String>(200);
    public List<String> rank2 = new ArrayList<String>(200);
    public List<String> rank3 = new ArrayList<String>(200);
    public List<String> rank4 = new ArrayList<String>(200);
    public List<String> rank5 = new ArrayList<String>(200);
    public List<String> rank6 = new ArrayList<String>(200);
    public List<inChat> inChat = new ArrayList<inChat>(200);

    public void lootShare(boolean bool) {
        lootShareOn = bool;
        if (bool) {
            for (Player p : Engine.players) {
                if (p == null || p.disconnected[0]) {
                    continue;
                }
                for (inChat l2 : inChat) {
                    if (l2 == null || l2.name.equals("")) {
                        continue;
                    }
                    if (!l2.name.equals(p.username) || l2.status == 1) {
                        continue;
                    }
                    p.frames.setConfig(p, 1083, 2);
                    p.frames.setLoot(p);
                }
            }
        } else {
            for (Player p : Engine.players) {
                if (p == null || p.disconnected[0]) {
                    continue;
                }
                for (inChat l2 : inChat) {
                    if (l2 == null || l2.name.equals("")) {
                        continue;
                    }
                    if (!l2.name.equals(p.username) || l2.status == 1) {
                        continue;
                    }
                    p.frames.setConfig(p, 1083, 0);
                    p.frames.sendMessage(p, "LootShare is now off.");
                }
            }
        }
    }

    public void getChance(Player p) {
        for (inChat l : inChat) {
            if (l == null || !l.name.equals(p.username) || l.status == 1) {
                continue;
            }
            p.frames.sendMessage(p, "Your chances of getting loot has increased.");
            l.chance++;
        }
    }

    public String getHighest() {
        int highest = 0;
        String player = "";
        for (inChat l : inChat) {
            if (l == null || l.status == 1) {
                continue;
            }
            if (l.chance > highest) {
                highest = l.chance;
                player = l.name;
            }
        }
        for (inChat l : inChat) {
            if (l == null || l.status == 1) {
                continue;
            }
            if (l.name.equals(player)) {
                l.chance = 0;
            }
        }
        return player;
    }

    public int currentRank(String p) {
        if (rank1.contains(p)) {
            return 1;
        } else if (rank2.contains(p)) {
            return 2;
        } else if (rank3.contains(p)) {
            return 3;
        } else if (rank4.contains(p)) {
            return 4;
        } else if (rank5.contains(p)) {
            return 5;
        } else if (rank6.contains(p)) {
            return 6;
        }
        return 0;
    }

    public int clanNumber() {
        int count = 0;
        for (inChat i : inChat) {
            if (i == null || i.equals("") || i.status == 1) {
                continue;
            }
            count++;
        }
        return count;
    }

    public void leaveChat(Player p) {
        String s = "";
        for (inChat l : inChat) {
            if (l == null) {
                continue;
            }
            if (l.name.equals(p.username)) {
                l.status = 1;
            }
        }
        setList();
    }

    public ClanList(String Owner, String clanName) {
        this.Owner = Owner;
        this.clanName = clanName;
    }

    public void setReq(int id, int set) {
        switch (id) {
            case 1:
                joinReq = set;
                break;
            case 2:
                talkReq = set;
                break;
            case 3:
                kickReq = set;
                break;
        }
    }

    public void addRank(String name, int rank) {
        switch (rank) {
            case 1:
                rank1.add(name);
                break;
            case 2:
                rank2.add(name);
                break;
            case 3:
                rank3.add(name);
                break;
            case 4:
                rank4.add(name);
                break;
            case 5:
                rank5.add(name);
                break;
            case 6:
                rank6.add(name);
                break;
        }
    }

    public void removeRank(String name, int rank) {
        switch (rank) {
            case 1:
                rank1.remove(name);
                break;
            case 2:
                rank2.remove(name);
                break;
            case 3:
                rank3.remove(name);
                break;
            case 4:
                rank4.remove(name);
                break;
            case 5:
                rank5.remove(name);
                break;
            case 6:
                rank6.remove(name);
                break;
        }
    }

    public void updateFriends() throws Exception {
        Player p = Engine.players[Server.engine.getIdFromName(Owner)];
        if (p == null || p.disconnected[0]) {
            return;
        }
        for (int i = 0; i < friends.size(); i++) {
            friends.remove(friends.get(i));
        }
        for (int i = 0; i < p.friends.size(); i++) {
            friends.add(p.friends.get(i));
        }
    }

    public void setList() {
        try {
            updateFriends();
        } catch (Exception e) {
            System.out.println(e);
        }
        for (Player p : Engine.players) {
            if (p == null || p.disconnected[0]) {
                continue;
            }
            for (inChat l2 : inChat) {
                if (l2 == null || l2.name.equals("")) {
                    continue;
                }
                if (!l2.name.equals(p.username) || l2.status == 1) {
                    continue;
                }
                p.stream.createFrameVarSizeWord(82);
                p.stream.writeQWord(Misc.stringToLong(Owner));
                p.stream.writeQWord(Misc.stringToLong(clanName));

                p.stream.writeUnsignedByte(kickReq);
                p.stream.writeSignedByte(clanNumber());
                for (inChat l : inChat) {
                    if (l == null || l.name.equals("") || l.status == 1) {
                        continue;
                    }
                    if (l.status == 1) {
                        continue;
                    }
                    p.stream.writeQWord(Misc.stringToLong(l.name));
                    p.stream.writeWord(1);
                    Player p3 = Engine.players[Server.engine.getIdFromName(l.name)];
                    if (l.name.equals(Owner)) {
                        p.stream.writeUnsignedByte(7);
                    } else if (p3.rights == 2) {
                        p.stream.writeUnsignedByte(127);
                    } else if (rank1.contains(l.name)) {
                        p.stream.writeUnsignedByte(1);
                    } else if (rank2.contains(l.name)) {
                        p.stream.writeUnsignedByte(2);
                    } else if (rank3.contains(l.name)) {
                        p.stream.writeUnsignedByte(3);
                    } else if (rank4.contains(l.name)) {
                        p.stream.writeUnsignedByte(4);
                    } else if (rank5.contains(l.name)) {
                        p.stream.writeUnsignedByte(5);
                    } else if (rank6.contains(l.name)) {
                        p.stream.writeUnsignedByte(6);
                    } else {
                        if (friends.contains(Misc.stringToLong(l.name))) {
                            p.stream.writeUnsignedByte(0);
                        } else {
                            p.stream.writeUnsignedByte(-1);
                        }

                    }
                    p.stream.writeString("RuneScape " + 1);
                }
                p.stream.endFrameVarSizeWord();
            }
        }
    }

    public void sendClanMessage(String from, String message) {
        String var = "<";
        Player p2 = Engine.players[Server.engine.getIdFromName(from)];
        if (message.contains(">") || message.contains("<") || message.contains("<3")) {
            p2.frames.sendMessage(p2, "You're message cannot contain some variables due to crashing errors.");
            return;
        }
        for (Player p : Engine.players) {
            if (p == null || p.disconnected[0]) {
                continue;
            }
            for (inChat l2 : inChat) {
                if (l2 == null || l2.name.equals("")) {
                    continue;
                }
                if (!l2.name.equals(p.username) || l2.status == 1) {
                    continue;
                }
                p.frames.sendClanChat(p, p2, from, clanName, message);
            }
        }
    }

    public boolean isInClan(Player p) {
        for (inChat l : inChat) {
            if (l == null || l.name.equals("")) {
                continue;
            }
            if (l.name.equals(p.username)) {
                return true;
            }
        }
        return false;
    }

    public boolean isInClan2(String p) {
        for (inChat l : inChat) {
            if (l == null || l.name.equals("")) {
                continue;
            }
            if (l.name.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public void setIn(Player p) {
        for (inChat l : inChat) {
            if (l == null || !l.name.equals(p.username)) {
                continue;
            }
            l.status = 0;
        }
    }

}