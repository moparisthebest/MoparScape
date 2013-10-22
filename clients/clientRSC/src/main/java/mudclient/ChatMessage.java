package mudclient;

public class ChatMessage {

    public static String bytesToString(byte arg0[], int arg1, int arg2) {
        try {
            int i = 0;
            int j = -1;
            for(int k = 0; k < arg2; k++) {
                int l = arg0[arg1++] & 0xff;
                int i1 = l >> 4 & 0xf;
                if(j == -1) {
                    if(i1 < 13)
                        chatMessage[i++] = validChars[i1];
                    else
                        j = i1;
                } else {
                    chatMessage[i++] = validChars[((j << 4) + i1) - 195];
                    j = -1;
                }
                i1 = l & 0xf;
                if(j == -1) {
                    if(i1 < 13)
                        chatMessage[i++] = validChars[i1];
                    else
                        j = i1;
                } else {
                    chatMessage[i++] = validChars[((j << 4) + i1) - 195];
                    j = -1;
                }
            }

            boolean flag = true;
            for(int j1 = 0; j1 < i; j1++) {
                char c = chatMessage[j1];
                if(j1 > 4 && c == '@')
                    chatMessage[j1] = ' ';
                if(c == '%')
                    chatMessage[j1] = ' ';
                if(flag && c >= 'a' && c <= 'z') {
                    chatMessage[j1] += '\uFFE0';
                    flag = false;
                }
                if(c == '.' || c == '!')
                    flag = true;
            }

            return new String(chatMessage, 0, i);
        }
        catch(Exception _ex) {
            return ".";
        }
    }

    public static int stringToBytes(String arg0) {
        if(arg0.length() > 80)
            arg0 = arg0.substring(0, 80);
        arg0 = arg0.toLowerCase();
        int i = 0;
        int j = -1;
        for(int k = 0; k < arg0.length(); k++) {
            char c = arg0.charAt(k);
            int l = 0;
            for(int i1 = 0; i1 < validChars.length; i1++) {
                if(c != validChars[i1])
                    continue;
                l = i1;
                break;
            }

            if(l > 12)
                l += 195;
            if(j == -1) {
                if(l < 13)
                    j = l;
                else
                    lastChat[i++] = (byte)l;
            } else
            if(l < 13) {
                lastChat[i++] = (byte)((j << 4) + l);
                j = -1;
            } else {
                lastChat[i++] = (byte)((j << 4) + (l >> 4));
                j = l & 0xf;
            }
        }

        if(j != -1)
            lastChat[i++] = (byte)(j << 4);
        return i;
    }

    public static byte lastChat[] = new byte[100];
    public static char chatMessage[] = new char[100];
    private static char validChars[] = {
        ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 
        'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 
        'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', 
        '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', 
        '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', 
        '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[', 
        ']'
    };

}
