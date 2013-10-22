package mudclient;

public class ChatFilter {

    public static void addFilterData(DataEncryption q1, DataEncryption q2, DataEncryption q3, DataEncryption q4) {
        loadBadEnc(q2);
        loadHostsEnc(q3);
        loadFragmentsEnc(q1);
        loadTldList(q4);
    }

    public static void loadTldList(DataEncryption arg0) {
        int i = arg0.getInt();
        ffi = new char[i][];
        ffj = new int[i];
        for(int j = 0; j < i; j++) {
            ffj[j] = arg0.getByte();
            char ac[] = new char[arg0.getByte()];
            for(int k = 0; k < ac.length; k++)
                ac[k] = (char)arg0.getByte();

            ffi[j] = ac;
        }

    }

    public static void loadBadEnc(DataEncryption q1) {
        int i = q1.getInt();
        ffe = new char[i][];
        fff = new byte[i][][];
        fgc(q1, ffe, fff);
    }

    public static void loadHostsEnc(DataEncryption q1) {
        int i = q1.getInt();
        ffg = new char[i][];
        ffh = new byte[i][][];
        fgc(q1, ffg, ffh);
    }

    public static void loadFragmentsEnc(DataEncryption arg0) {
        ffd = new int[arg0.getInt()];
        for(int i = 0; i < ffd.length; i++)
            ffd[i] = arg0.getShort();

    }

    public static void fgc(DataEncryption arg0, char arg1[][], byte arg2[][][]) {
        for(int i = 0; i < arg1.length; i++) {
            char ac[] = new char[arg0.getByte()];
            for(int j = 0; j < ac.length; j++)
                ac[j] = (char)arg0.getByte();

            arg1[i] = ac;
            byte abyte0[][] = new byte[arg0.getInt()][2];
            for(int k = 0; k < abyte0.length; k++) {
                abyte0[k][0] = (byte)arg0.getByte();
                abyte0[k][1] = (byte)arg0.getByte();
            }

            if(abyte0.length > 0)
                arg2[i] = abyte0;
        }

    }

    public static String filterChat(String arg0) {
        char ac[] = arg0.toLowerCase().toCharArray();
        fgi(ac);
        fgg(ac);
        fgh(ac);
        fhd(ac);
        for(int i = 0; i < ffk.length; i++) {
            for(int j = -1; (j = arg0.indexOf(ffk[i], j + 1)) != -1;) {
                char ac1[] = ffk[i].toCharArray();
                for(int k = 0; k < ac1.length; k++)
                    ac[k + j] = ac1[k];

            }

        }

        if(ffb) {
            fge(arg0.toCharArray(), ac);
            fgf(ac);
        }
        return new String(ac);
    }

    public static void fge(char arg0[], char arg1[]) {
        for(int i = 0; i < arg0.length; i++)
            if(arg1[i] != '*' && fhl(arg0[i]))
                arg1[i] = arg0[i];

    }

    public static void fgf(char arg0[]) {
        boolean flag = true;
        for(int i = 0; i < arg0.length; i++) {
            char c = arg0[i];
            if(fhi(c)) {
                if(flag) {
                    if(fhk(c))
                        flag = false;
                } else
                if(fhl(c))
                    arg0[i] = (char)((c + 97) - 65);
            } else {
                flag = true;
            }
        }

    }

    public static void fgg(char arg0[]) {
        for(int i = 0; i < 2; i++) {
            for(int j = ffe.length - 1; j >= 0; j--)
                fgm(arg0, ffe[j], fff[j]);

        }

    }

    public static void fgh(char arg0[]) {
        for(int i = ffg.length - 1; i >= 0; i--)
            fgm(arg0, ffg[i], ffh[i]);

    }

    public static void fgi(char arg0[]) {
        char ac[] = (char[])arg0.clone();
        char ac1[] = {
            'd', 'o', 't'
        };
        fgm(ac, ac1, null);
        char ac2[] = (char[])arg0.clone();
        char ac3[] = {
            's', 'l', 'a', 's', 'h'
        };
        fgm(ac2, ac3, null);
        for(int i = 0; i < ffi.length; i++)
            fgj(arg0, ac, ac2, ffi[i], ffj[i]);

    }

    public static void fgj(char arg0[], char arg1[], char arg2[], char arg3[], int arg4) {
        if(arg3.length > arg0.length)
            return;
        for(int i = 0; i <= arg0.length - arg3.length; i++) {
            int j = i;
            int k = 0;
            while(j < arg0.length)  {
                int l = 0;
                char c = arg0[j];
                char c1 = '\0';
                if(j + 1 < arg0.length)
                    c1 = arg0[j + 1];
                if(k < arg3.length && (l = fha(arg3[k], c, c1)) > 0) {
                    j += l;
                    k++;
                    continue;
                }
                if(k == 0)
                    break;
                if((l = fha(arg3[k - 1], c, c1)) > 0) {
                    j += l;
                    continue;
                }
                if(k >= arg3.length || !fhg(c))
                    break;
                j++;
            }
            if(k >= arg3.length) {
                boolean flag = false;
                int i1 = fgk(arg0, arg1, i);
                int j1 = fgl(arg0, arg2, j - 1);
                if(fen)
                    System.out.println("Potential tld: " + String.valueOf(arg3) + " at char " + i + " (type=" + arg4 + ", startmatch=" + i1 + ", endmatch=" + j1 + ")");
                if(arg4 == 1 && i1 > 0 && j1 > 0)
                    flag = true;
                if(arg4 == 2 && (i1 > 2 && j1 > 0 || i1 > 0 && j1 > 2))
                    flag = true;
                if(arg4 == 3 && i1 > 0 && j1 > 2)
                    flag = true;
                if(flag) {
                    if(fen)
                        System.out.println("Filtered tld: " + String.valueOf(arg3) + " at char " + i);
                    int k1 = i;
                    int l1 = j - 1;
                    if(i1 > 2) {
                        if(i1 == 4) {
                            boolean flag1 = false;
                            for(int j2 = k1 - 1; j2 >= 0; j2--)
                                if(flag1) {
                                    if(arg1[j2] != '*')
                                        break;
                                    k1 = j2;
                                } else
                                if(arg1[j2] == '*') {
                                    k1 = j2;
                                    flag1 = true;
                                }

                        }
                        boolean flag2 = false;
                        for(int k2 = k1 - 1; k2 >= 0; k2--)
                            if(flag2) {
                                if(fhg(arg0[k2]))
                                    break;
                                k1 = k2;
                            } else
                            if(!fhg(arg0[k2])) {
                                flag2 = true;
                                k1 = k2;
                            }

                    }
                    if(j1 > 2) {
                        if(j1 == 4) {
                            boolean flag3 = false;
                            for(int l2 = l1 + 1; l2 < arg0.length; l2++)
                                if(flag3) {
                                    if(arg2[l2] != '*')
                                        break;
                                    l1 = l2;
                                } else
                                if(arg2[l2] == '*') {
                                    l1 = l2;
                                    flag3 = true;
                                }

                        }
                        boolean flag4 = false;
                        for(int i3 = l1 + 1; i3 < arg0.length; i3++)
                            if(flag4) {
                                if(fhg(arg0[i3]))
                                    break;
                                l1 = i3;
                            } else
                            if(!fhg(arg0[i3])) {
                                flag4 = true;
                                l1 = i3;
                            }

                    }
                    for(int i2 = k1; i2 <= l1; i2++)
                        arg0[i2] = '*';

                }
            }
        }

    }

    public static int fgk(char arg0[], char arg1[], int arg2) {
        if(arg2 == 0)
            return 2;
        for(int i = arg2 - 1; i >= 0; i--) {
            if(!fhg(arg0[i]))
                break;
            if(arg0[i] == ',' || arg0[i] == '.')
                return 3;
        }

        int j = 0;
        for(int k = arg2 - 1; k >= 0; k--) {
            if(!fhg(arg1[k]))
                break;
            if(arg1[k] == '*')
                j++;
        }

        if(j >= 3)
            return 4;
        return !fhg(arg0[arg2 - 1]) ? 0 : 1;
    }

    public static int fgl(char arg0[], char arg1[], int arg2) {
        if(arg2 + 1 == arg0.length)
            return 2;
        for(int i = arg2 + 1; i < arg0.length; i++) {
            if(!fhg(arg0[i]))
                break;
            if(arg0[i] == '\\' || arg0[i] == '/')
                return 3;
        }

        int j = 0;
        for(int k = arg2 + 1; k < arg0.length; k++) {
            if(!fhg(arg1[k]))
                break;
            if(arg1[k] == '*')
                j++;
        }

        if(j >= 5)
            return 4;
        return !fhg(arg0[arg2 + 1]) ? 0 : 1;
    }

    public static void fgm(char arg0[], char arg1[], byte arg2[][]) {
        if(arg1.length > arg0.length)
            return;
        for(int i = 0; i <= arg0.length - arg1.length; i++) {
            int j = i;
            int k = 0;
            boolean flag = false;
            while(j < arg0.length)  {
                int l = 0;
                char c = arg0[j];
                char c2 = '\0';
                if(j + 1 < arg0.length)
                    c2 = arg0[j + 1];
                if(k < arg1.length && (l = fhb(arg1[k], c, c2)) > 0) {
                    j += l;
                    k++;
                    continue;
                }
                if(k == 0)
                    break;
                if((l = fhb(arg1[k - 1], c, c2)) > 0) {
                    j += l;
                    continue;
                }
                if(k >= arg1.length || !fhh(c))
                    break;
                if(fhg(c) && c != '\'')
                    flag = true;
                j++;
            }
            if(k >= arg1.length) {
                boolean flag1 = true;
                if(fen)
                    System.out.println("Potential word: " + String.valueOf(arg1) + " at char " + i);
                if(!flag) {
                    char c1 = ' ';
                    if(i - 1 >= 0)
                        c1 = arg0[i - 1];
                    char c3 = ' ';
                    if(j < arg0.length)
                        c3 = arg0[j];
                    byte byte0 = fhc(c1);
                    byte byte1 = fhc(c3);
                    if(arg2 != null && fgn(arg2, byte0, byte1))
                        flag1 = false;
                } else {
                    boolean flag2 = false;
                    boolean flag3 = false;
                    if(i - 1 < 0 || fhg(arg0[i - 1]) && arg0[i - 1] != '\'')
                        flag2 = true;
                    if(j >= arg0.length || fhg(arg0[j]) && arg0[j] != '\'')
                        flag3 = true;
                    if(!flag2 || !flag3) {
                        boolean flag4 = false;
                        int j1 = i - 2;
                        if(flag2)
                            j1 = i;
                        for(; !flag4 && j1 < j; j1++)
                            if(j1 >= 0 && (!fhg(arg0[j1]) || arg0[j1] == '\'')) {
                                char ac[] = new char[3];
                                int k1;
                                for(k1 = 0; k1 < 3; k1++) {
                                    if(j1 + k1 >= arg0.length || fhg(arg0[j1 + k1]) && arg0[j1 + k1] != '\'')
                                        break;
                                    ac[k1] = arg0[j1 + k1];
                                }

                                boolean flag5 = true;
                                if(k1 == 0)
                                    flag5 = false;
                                if(k1 < 3 && j1 - 1 >= 0 && (!fhg(arg0[j1 - 1]) || arg0[j1 - 1] == '\''))
                                    flag5 = false;
                                if(flag5 && !fhm(ac))
                                    flag4 = true;
                            }

                        if(!flag4)
                            flag1 = false;
                    }
                }
                if(flag1) {
                    if(ffa)
                        System.out.println("Filtered word: " + String.valueOf(arg1) + " at char " + i);
                    for(int i1 = i; i1 < j; i1++)
                        arg0[i1] = '*';

                }
            }
        }

    }

    public static boolean fgn(byte arg0[][], byte arg1, byte arg2) {
        int i = 0;
        if(arg0[i][0] == arg1 && arg0[i][1] == arg2)
            return true;
        int j = arg0.length - 1;
        if(arg0[j][0] == arg1 && arg0[j][1] == arg2)
            return true;
        do {
            int k = (i + j) / 2;
            if(arg0[k][0] == arg1 && arg0[k][1] == arg2)
                return true;
            if(arg1 < arg0[k][0] || arg1 == arg0[k][0] && arg2 < arg0[k][1])
                j = k;
            else
                i = k;
        } while(i != j && i + 1 != j);
        return false;
    }

    public static int fha(char c, char c1, char c2) {
        if(c == c1)
            return 1;
        if(c == 'e' && c1 == '3')
            return 1;
        if(c == 't' && (c1 == '7' || c1 == '+'))
            return 1;
        if(c == 'a' && (c1 == '4' || c1 == '@'))
            return 1;
        if(c == 'o' && c1 == '0')
            return 1;
        if(c == 'i' && c1 == '1')
            return 1;
        if(c == 's' && c1 == '5')
            return 1;
        if(c == 'f' && c1 == 'p' && c2 == 'h')
            return 2;
        return c != 'g' || c1 != '9' ? 0 : 1;
    }

    public static int fhb(char c, char c1, char c2) {
        if(c == '*')
            return 0;
        if(c == c1)
            return 1;
        if(c >= 'a' && c <= 'z') {
            if(c == 'e')
                return c1 != '3' ? 0 : 1;
            if(c == 't')
                return c1 != '7' ? 0 : 1;
            if(c == 'a')
                return c1 != '4' && c1 != '@' ? 0 : 1;
            if(c == 'o') {
                if(c1 == '0' || c1 == '*')
                    return 1;
                return c1 != '(' || c2 != ')' ? 0 : 2;
            }
            if(c == 'i')
                return c1 != 'y' && c1 != 'l' && c1 != 'j' && c1 != '1' && c1 != '!' && c1 != ':' && c1 != ';' ? 0 : 1;
            if(c == 'n')
                return 0;
            if(c == 's')
                return c1 != '5' && c1 != 'z' && c1 != '$' ? 0 : 1;
            if(c == 'r')
                return 0;
            if(c == 'h')
                return 0;
            if(c == 'l')
                return c1 != '1' ? 0 : 1;
            if(c == 'd')
                return 0;
            if(c == 'c')
                return c1 != '(' ? 0 : 1;
            if(c == 'u')
                return c1 != 'v' ? 0 : 1;
            if(c == 'm')
                return 0;
            if(c == 'f')
                return c1 != 'p' || c2 != 'h' ? 0 : 2;
            if(c == 'p')
                return 0;
            if(c == 'g')
                return c1 != '9' && c1 != '6' ? 0 : 1;
            if(c == 'w')
                return c1 != 'v' || c2 != 'v' ? 0 : 2;
            if(c == 'y')
                return 0;
            if(c == 'b')
                return c1 != '1' || c2 != '3' ? 0 : 2;
            if(c == 'v')
                return 0;
            if(c == 'k')
                return 0;
            if(c == 'x')
                return c1 != ')' || c2 != '(' ? 0 : 2;
            if(c == 'j')
                return 0;
            if(c == 'q')
                return 0;
            if(c == 'z')
                return 0;
        }
        if(c >= '0' && c <= '9') {
            if(c == '0') {
                if(c1 == 'o' || c1 == 'O')
                    return 1;
                return c1 != '(' || c2 != ')' ? 0 : 2;
            }
            if(c == '1')
                return c1 != 'l' ? 0 : 1;
            if(c == '2')
                return 0;
            if(c == '3')
                return 0;
            if(c == '4')
                return 0;
            if(c == '5')
                return 0;
            if(c == '6')
                return 0;
            if(c == '7')
                return 0;
            if(c == '8')
                return 0;
            if(c == '9')
                return 0;
        }
        if(c == '-')
            return 0;
        if(c == ',')
            return c1 != '.' ? 0 : 1;
        if(c == '.')
            return c1 != ',' ? 0 : 1;
        if(c == '(')
            return 0;
        if(c == ')')
            return 0;
        if(c == '!')
            return c1 != 'i' ? 0 : 1;
        if(c == '\'')
            return 0;
        if(ffa)
            System.out.println("Letter=" + c + " not matched");
        return 0;
    }

    public static byte fhc(char c) {
        if(c >= 'a' && c <= 'z')
            return (byte)((c - 97) + 1);
        if(c == '\'')
            return 28;
        if(c >= '0' && c <= '9')
            return (byte)((c - 48) + 29);
        else
            return 27;
    }

    public static void fhd(char arg0[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while((i = fhe(arg0, j)) != -1)  {
            boolean flag = false;
            for(int i1 = j; i1 >= 0 && i1 < i && !flag; i1++)
                if(!fhg(arg0[i1]) && !fhh(arg0[i1]))
                    flag = true;

            if(flag)
                k = 0;
            if(k == 0)
                l = i;
            j = fhf(arg0, i);
            int j1 = 0;
            for(int k1 = i; k1 < j; k1++)
                j1 = (j1 * 10 + arg0[k1]) - 48;

            if(j1 > 255 || j - i > 8)
                k = 0;
            else
                k++;
            if(k == 4) {
                for(int l1 = l; l1 < j; l1++)
                    arg0[l1] = '*';

                k = 0;
            }
        }
    }

    public static int fhe(char arg0[], int arg1) {
        for(int i = arg1; i < arg0.length && i >= 0; i++)
            if(arg0[i] >= '0' && arg0[i] <= '9')
                return i;

        return -1;
    }

    public static int fhf(char arg0[], int arg1) {
        for(int i = arg1; i < arg0.length && i >= 0; i++)
            if(arg0[i] < '0' || arg0[i] > '9')
                return i;

        return arg0.length;
    }

    public static boolean fhg(char c) {
        return !fhi(c) && !fhj(c);
    }

    public static boolean fhh(char c) {
        if(c < 'a' || c > 'z')
            return true;
        return c == 'v' || c == 'x' || c == 'j' || c == 'q' || c == 'z';
    }

    public static boolean fhi(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    public static boolean fhj(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean fhk(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean fhl(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean fhm(char arg0[]) {
        boolean flag = true;
        for(int i = 0; i < arg0.length; i++)
            if(!fhj(arg0[i]) && arg0[i] != 0)
                flag = false;

        if(flag)
            return true;
        int j = fhn(arg0);
        int k = 0;
        int l = ffd.length - 1;
        if(j == ffd[k] || j == ffd[l])
            return true;
        do {
            int i1 = (k + l) / 2;
            if(j == ffd[i1])
                return true;
            if(j < ffd[i1])
                l = i1;
            else
                k = i1;
        } while(k != l && k + 1 != l);
        return false;
    }

    public static int fhn(char arg0[]) {
        if(arg0.length > 6)
            return 0;
        int i = 0;
        for(int j = 0; j < arg0.length; j++) {
            char c = arg0[arg0.length - j - 1];
            if(c >= 'a' && c <= 'z')
                i = i * 38 + ((c - 97) + 1);
            else
            if(c == '\'')
                i = i * 38 + 27;
            else
            if(c >= '0' && c <= '9')
                i = i * 38 + ((c - 48) + 28);
            else
            if(c != 0) {
                if(ffa)
                    System.out.println("word2hash failed on " + new String(arg0));
                return 0;
            }
        }

        return i;
    }

    static boolean fen;
    static boolean ffa;
    static boolean ffb = true;
    static int ffc = 3;
    static int ffd[];
    static char ffe[][];
    static byte fff[][][];
    static char ffg[][];
    static byte ffh[][][];
    static char ffi[][];
    static int ffj[];
    static String ffk[] = {
        "cook", "cook's", "cooks", "seeks", "sheet"
    };

}
