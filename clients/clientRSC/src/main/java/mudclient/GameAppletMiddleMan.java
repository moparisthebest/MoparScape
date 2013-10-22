package mudclient;

import java.awt.*;
import java.io.IOException;

@SuppressWarnings("serial")
public class GameAppletMiddleMan extends GameApplet {

    protected org.moparscape.iface.Hasher hasher = null;

    protected final void connect(String user, String pass, boolean reconnecting) {
        if (socketTimeout > 0) {
            loginScreenPrint("Please wait...", "Connecting to server");
            try {
                Thread.sleep(2000L);
            } catch (Exception _ex) {
            }
            loginScreenPrint("Sorry! The server is currently full.", "Please try again later");
            return;
        }
        try {
            username = user;
            user = DataOperations.formatString(user, 20);
            password = pass;
            if (hasher != null)
                pass = hasher.hashString(pass);
            else
                pass = DataOperations.formatString(pass, 20);
            if (user.trim().length() == 0) {
                loginScreenPrint("You must enter both a username", "and a password - Please try again");
                return;
            }
            if (reconnecting)
                gameBoxPrint("Connection lost! Please wait...", "Attempting to re-establish");
            else
                loginScreenPrint("Please wait...", "Connecting to server");
            streamClass = new StreamClass(makeSocket(Config.SERVER_IP, Config.SERVER_PORT), this);
            streamClass.maxPacketReadCount = maxPacketReadCount;
            long l = DataOperations.nameToHash(user);
            streamClass.createPacket(32);
            streamClass.addByte((int) (l >> 16 & 31L));
            streamClass.addString("You must enter both a username and a password - Please try again");// TODO not used server-side
            streamClass.flush();
            long sessionId = streamClass.readLong();
            if (sessionId == 0L) {
                loginScreenPrint("Login server offline.", "Please try again in a few mins");
                return;
            }
            //System.out.println("Verb: Session id: " + sessionId);
            int sessionKeys[] = new int[4];
            sessionKeys[0] = (int) (Math.random() * 99999999D);
            sessionKeys[1] = (int) (Math.random() * 99999999D);
            sessionKeys[2] = (int) (sessionId >> 32);
            sessionKeys[3] = (int) sessionId;
            LoginDataEncryption dataEnc = new LoginDataEncryption(new byte[117]);
            dataEnc.addByte(reconnecting ? 1 : 0);
            dataEnc.addInt(Config.CLIENT_VERSION);
            dataEnc.addInt(sessionKeys[0]);
            dataEnc.addInt(sessionKeys[1]);
            dataEnc.addInt(sessionKeys[2]);
            dataEnc.addInt(sessionKeys[3]);
            dataEnc.addString(user);
            dataEnc.addString(pass);
            byte data[] = dataEnc.encrypt(dataEnc.packet);
            streamClass.createPacket(77);
            streamClass.addBytes(data, 0, data.length);
            streamClass.flush();
            int loginCode = streamClass.read();
            //System.out.println("login response:" + loginCode);
            if (loginCode == 99) {
                reconnectTries = 0;
                initVars();
                return;
            }
            if (loginCode == 0) {
                reconnectTries = 0;
                initVars();
                return;
            }
            if (loginCode == 1) {
                reconnectTries = 0;
                return;
            }
            if (reconnecting) {
                user = "";
                pass = "";
                resetIntVars();
                return;
            }
            if (loginCode == -1) {
                loginScreenPrint("Error unable to login.", "Server timed out");
                return;
            }
            if (loginCode == 2) {
                loginScreenPrint("Invalid username or password.", "Try again, or create a new account");
                return;
            }
            if (loginCode == 3) {
                loginScreenPrint("That username is already logged in.", "Wait 60 seconds then retry");
                return;
            }
            if (loginCode == 4) {
                loginScreenPrint("The client has been updated.", "Please restart the client");
                return;
            }
            if (loginCode == 5) {
                loginScreenPrint("Error unable to login.", "Please retry");
                return;
            }
            if (loginCode == 6) {
                loginScreenPrint("Account banned.", "Appeal on the forums, ASAP.");
                return;
            }
            if (loginCode == 7) {
                loginScreenPrint("Error - failed to decode profile.", "Contact an admin!");
                return;
            }
            if (loginCode == 8) {
                loginScreenPrint("Too many connections from your IP.", "Please try again later");
                return;
            }
            if (loginCode == 9) {
                loginScreenPrint("Account already in use.", "You may only login to one character at a time");
                return;
            } else {
                loginScreenPrint("Error unable to login.", "Unrecognised response code");
                return;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        if (reconnectTries > 0) {
            try {
                Thread.sleep(2500L);
            } catch (Exception _ex) {
            }
            reconnectTries--;
            connect(username, password, reconnecting);
        }
        if (reconnecting) {
            username = "";
            password = "";
            resetIntVars();
        } else {
            loginScreenPrint("Sorry! Unable to connect.", "Check internet settings or try another world");
        }
    }

    protected final void requestLogout() {
        if (streamClass != null)
            try {
                streamClass.createPacket(39);
                streamClass.flush();
            } catch (IOException _ex) {
            }
        username = "";
        password = "";
        resetIntVars();
        loginScreenPrint("Please enter your usename and password", "");
    }

    protected void lostConnection() {
        System.out.println("Lost connection");
        connect(username, password, true);
        loginScreenPrint("Please enter your usename and password", "");
    }

    protected final void gameBoxPrint(String s1, String s2) {
        Graphics g = getGraphics();
        Font font = new Font("Helvetica", 1, 15);
        char c = '\u0200';
        char c1 = '\u0158';
        g.setColor(Color.black);
        g.fillRect(c / 2 - 140, c1 / 2 - 25, 280, 50);
        g.setColor(Color.white);
        g.drawRect(c / 2 - 140, c1 / 2 - 25, 280, 50);
        drawString(g, s1, font, c / 2, c1 / 2 - 10);
        drawString(g, s2, font, c / 2, c1 / 2 + 10);
    }

    protected final void sendPingPacket() {
        long l = System.currentTimeMillis();
        if (streamClass.hasData())
            lastPing = l;
        if (l - lastPing > 5000L) {
            lastPing = l;
            streamClass.createPacket(5);
            streamClass.formatPacket();
        }
        try {
            streamClass.writePacket(20);
        } catch (IOException _ex) {
            lostConnection();
            return;
        }
        int packetLength = streamClass.readPacket(packetData);
        if (packetLength > 0)
            handlePacket(packetData[0] & 0xff, packetLength);
    }

    private final void handlePacket(int command, int length) {
        if (command == 48) {
            String s1 = new String(packetData, 1, length - 1);
            displayMessage(s1);
            return;
        }
        if (command == 222) {
            requestLogout();
            return;
        }
        if (command == 136) {
            cantLogout();
            return;
        }
        if (command == 249) {
            friendsCount = DataOperations.getByte(packetData[1]);
            for (int i = 0; i < friendsCount; i++) {
                friendsList[i] = DataOperations.getLong(packetData, 2 + i * 9);
                friendsWorld[i] = DataOperations.getByte(packetData[10 + i * 9]);
            }

            reOrderFriendsList();
            return;
        }
        if (command == 25) {
            long friend = DataOperations.getLong(packetData, 1);
            int status = packetData[9] & 0xff;
            for (int j1 = 0; j1 < friendsCount; j1++)
                if (friendsList[j1] == friend) {
                    if (friendsWorld[j1] == 0 && status != 0)
                        displayMessage("@pri@" + DataOperations.hashToName(friend) + " has logged in");
                    if (friendsWorld[j1] != 0 && status == 0)
                        displayMessage("@pri@" + DataOperations.hashToName(friend) + " has logged out");
                    friendsWorld[j1] = status;
                    length = 0;
                    reOrderFriendsList();
                    return;
                }

            friendsList[friendsCount] = friend;
            friendsWorld[friendsCount] = status;
            friendsCount++;
            reOrderFriendsList();
            return;
        }
        if (command == 2) {
            ignoresCount = DataOperations.getByte(packetData[1]);
            for (int j = 0; j < ignoresCount; j++)
                ignoresList[j] = DataOperations.getLong(packetData, 2 + j * 8);

            return;
        }
        if (command == 158) {
            blockChat = packetData[1];
            blockPrivate = packetData[2];
            blockTrade = packetData[3];
            blockDuel = packetData[4];
            return;
        }
        if (command == 170) {
            long l1 = DataOperations.getLong(packetData, 1);
            String s = ChatMessage.bytesToString(packetData, 9, length - 9);
            displayMessage("@pri@" + DataOperations.hashToName(l1) + ": tells you " + s);
            return;
        }
        if (command == 211) {// TODO remove?
            streamClass.createPacket(69);
            streamClass.addByte(0);// scar.exe, etc
            streamClass.formatPacket();
            return;
        }
        if (command == 1) {// TODO remove?
            //bluePoints
            //redPoints
            return;
        }
        handlePacket(command, length, packetData);
    }

    private final void reOrderFriendsList() {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < friendsCount - 1; i++)
                if (friendsWorld[i] < friendsWorld[i + 1]) {
                    int j = friendsWorld[i];
                    friendsWorld[i] = friendsWorld[i + 1];
                    friendsWorld[i + 1] = j;
                    long l = friendsList[i];
                    friendsList[i] = friendsList[i + 1];
                    friendsList[i + 1] = l;
                    flag = true;
                }

        }
    }

    protected final void sendUpdatedPrivacyInfo(int blockChat, int blockPrivate, int blockTrade, int blockDuel) {
        streamClass.createPacket(176);
        streamClass.addByte(blockChat);
        streamClass.addByte(blockPrivate);
        streamClass.addByte(blockTrade);
        streamClass.addByte(blockDuel);
        streamClass.formatPacket();
    }

    protected final void addIgnore(String arg0) {
        long l = DataOperations.nameToHash(arg0);
        streamClass.createPacket(25);
        streamClass.addLong(l);
        streamClass.formatPacket();
        for (int i = 0; i < ignoresCount; i++)
            if (ignoresList[i] == l)
                return;

        if (ignoresCount >= ignoresList.length - 1) {
            return;
        } else {
            ignoresList[ignoresCount++] = l;
            return;
        }
    }

    protected final void removeIgnore(long arg0) {
        streamClass.createPacket(108);
        streamClass.addLong(arg0);
        streamClass.formatPacket();
        for (int i = 0; i < ignoresCount; i++)
            if (ignoresList[i] == arg0) {
                ignoresCount--;
                for (int j = i; j < ignoresCount; j++)
                    ignoresList[j] = ignoresList[j + 1];

                return;
            }

    }

    protected final void addFriend(String arg0) {
        streamClass.createPacket(168);
        streamClass.addLong(DataOperations.nameToHash(arg0));
        streamClass.formatPacket();
        long l = DataOperations.nameToHash(arg0);
        for (int i = 0; i < friendsCount; i++)
            if (friendsList[i] == l)
                return;

        if (friendsCount >= friendsList.length - 1) {
            return;
        } else {
            friendsList[friendsCount] = l;
            friendsWorld[friendsCount] = 0;
            friendsCount++;
            return;
        }
    }

    protected final void removeFriend(long arg0) {
        streamClass.createPacket(52);
        streamClass.addLong(arg0);
        streamClass.formatPacket();
        for (int i = 0; i < friendsCount; i++) {
            if (friendsList[i] != arg0)
                continue;
            friendsCount--;
            for (int j = i; j < friendsCount; j++) {
                friendsList[j] = friendsList[j + 1];
                friendsWorld[j] = friendsWorld[j + 1];
            }

            break;
        }

        displayMessage("@pri@" + DataOperations.hashToName(arg0) + " has been removed from your friends list");
    }

    protected final void sendPrivateMessage(long l, byte abyte0[], int i) {
        streamClass.createPacket(254);
        streamClass.addLong(l);
        streamClass.addBytes(abyte0, 0, i);
        streamClass.formatPacket();
    }

    protected final void sendChatMessage(byte abyte0[], int i) {
        streamClass.createPacket(145);
        streamClass.addBytes(abyte0, 0, i);
        streamClass.formatPacket();
    }

    protected final void sendCommand(String s1) {
        streamClass.createPacket(90);
        streamClass.addString(s1);
        streamClass.formatPacket();
    }

    protected void loginScreenPrint(String s1, String s2) {
    }

    protected void initVars() {
    }

    protected void resetIntVars() {
    }

    protected void cantLogout() {
    }

    protected void handlePacket(int i, int j, byte abyte0[]) {
    }

    protected void displayMessage(String s1) {
    }

    public GameAppletMiddleMan() {
        username = "";
        password = "";
        packetData = new byte[10000];
        friendsList = new long[40];
        friendsWorld = new int[400];
        ignoresList = new long[200];
    }

    public static int maxPacketReadCount;
    String username;
    String password;
    public StreamClass streamClass;
    byte packetData[];
    int reconnectTries;
    long lastPing;
    public int friendsCount;
    public long friendsList[];
    public int friendsWorld[];
    public int ignoresCount;
    public long ignoresList[];
    public int blockChat;
    public int blockPrivate;
    public int blockTrade;
    public int blockDuel;
    public long sessionId;
    public int socketTimeout;

}
